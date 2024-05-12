package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes9.dex */
public class MusicSearchCorrectInfo extends MusicModel {
    public static final long serialVersionUID = 1;

    @InterfaceC65349Pkn("corrected_query")
    public String correctedKeyword;

    @InterfaceC65349Pkn("correct_level")
    public int correctedLevel;

    public String getCorrectedKeyword() {
        return this.correctedKeyword;
    }

    public int getCorrectedLevel() {
        return this.correctedLevel;
    }

    public void setCorrectedKeyword(String str) {
        this.correctedKeyword = str;
    }

    public void setCorrectedLevel(int i) {
        this.correctedLevel = i;
    }
}
