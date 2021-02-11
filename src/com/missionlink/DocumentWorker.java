/*
 * Copyright (c)
 * 10 Feb 2021 22:52
 * Created by Mission Link
 */

package com.missionlink;

public class DocumentWorker implements IDocumentWorker{

    @Override
    public String openDocument() {
        return ("Document opened");
    }

    @Override
    public String editDocument() {
        return("Editing available only in PRO version");
    }

    @Override
    public String saveDocument() {
        return("Saving available only in PRO version");
    }
}
