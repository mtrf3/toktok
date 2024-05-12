package com.ss.android.ugc.aweme.services.external.ability.qr;

/* loaded from: classes15.dex */
public class AVEnigma {
    public AVTdPoint[] points;
    public String text;
    public int type;

    /* loaded from: classes15.dex */
    public interface CodeType {
    }

    public AVTdPoint[] getPoints() {
        return this.points;
    }

    public String getText() {
        return this.text;
    }

    public int getType() {
        return this.type;
    }

    public void setPoints(AVTdPoint[] aVTdPointArr) {
        this.points = aVTdPointArr;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
