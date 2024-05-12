package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public class QueryCorrectInfo implements Serializable {
    public static final long serialVersionUID = 1;

    @InterfaceC65349Pkn("correct_highlight_position")
    public CorrectHighlightPositions correctHighlightPositions;

    @InterfaceC65349Pkn("corrected_query")
    public String correctedKeyword;

    @InterfaceC65349Pkn("correct_level")
    public int correctedLevel;
    public String requestId;

    public boolean isCorrectHighArrayAvailable() {
        CorrectHighlightPositions correctHighlightPositions = this.correctHighlightPositions;
        if (correctHighlightPositions != null && correctHighlightPositions.hasHighlightPosition()) {
            return true;
        }
        return false;
    }

    public CorrectHighlightPositions getCorrectHighlightPosition() {
        return this.correctHighlightPositions;
    }

    public String getCorrectedKeyword() {
        return this.correctedKeyword;
    }

    public int getCorrectedLevel() {
        return this.correctedLevel;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setCorrectHighlightPosition(CorrectHighlightPositions correctHighlightPositions) {
        this.correctHighlightPositions = correctHighlightPositions;
    }

    public void setCorrectedKeyword(String str) {
        this.correctedKeyword = str;
    }

    public void setCorrectedLevel(int i) {
        this.correctedLevel = i;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
