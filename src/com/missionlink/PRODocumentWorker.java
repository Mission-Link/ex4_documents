/*
 * Copyright (c)
 * 10 Feb 2021 22:54
 * Created by Mission Link
 */

package com.missionlink;

public class PRODocumentWorker extends DocumentWorker {

    @Override
    public String editDocument() {
        return ("Document edited");
    }

    @Override
    public String saveDocument() {
        return ("Document saved in the old format, " +
                "saving in the new one available only in Expert version");
    }
}
