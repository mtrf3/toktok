package com.ss.android.ugc.aweme.canvas;

import X.C142615ij;
import X.InterfaceC43620HAa;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class CanvasBackground implements Serializable {
    public static final C142615ij Companion = new C142615ij();
    public static final CanvasBackground DEFAULT_BACKGROUND = C142615ij.LIZ(-16777216);
    public int endColor;

    @InterfaceC43620HAa
    public String filePath = "";
    public int startColor;
    public final int type;

    public static final CanvasBackground getDEFAULT_BACKGROUND() {
        Companion.getClass();
        return DEFAULT_BACKGROUND;
    }

    public final int getEndColor() {
        return this.endColor;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final int getStartColor() {
        return this.startColor;
    }

    public final int getType() {
        return this.type;
    }

    public CanvasBackground(int i) {
        this.type = i;
    }

    public final void setEndColor(int i) {
        this.endColor = i;
    }

    public final void setFilePath(String str) {
        this.filePath = str;
    }

    public final void setStartColor(int i) {
        this.startColor = i;
    }
}
