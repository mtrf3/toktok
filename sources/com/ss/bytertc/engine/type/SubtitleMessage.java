package com.ss.bytertc.engine.type;

/* loaded from: classes33.dex */
public class SubtitleMessage {
    public boolean definite;
    public int sequence;
    public String text;
    public String userId;

    public SubtitleMessage(String str, String str2, int i, boolean z) {
        this.userId = str;
        this.text = str2;
        this.sequence = i;
        this.definite = z;
    }

    public static SubtitleMessage create(String str, String str2, int i, boolean z) {
        return new SubtitleMessage(str, str2, i, z);
    }
}
