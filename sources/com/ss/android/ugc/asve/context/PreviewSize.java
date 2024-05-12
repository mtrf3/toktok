package com.ss.android.ugc.asve.context;

import X.F9E;
import X.HJH;

/* loaded from: classes8.dex */
public final class PreviewSize extends F9E {
    public static final HJH Companion = new HJH();
    public final int height;
    public final int width;

    public static /* synthetic */ PreviewSize copy$default(PreviewSize previewSize, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = previewSize.width;
        }
        if ((i3 & 2) != 0) {
            i2 = previewSize.height;
        }
        return previewSize.copy(i, i2);
    }

    public final PreviewSize copy(int i, int i2) {
        return new PreviewSize(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height)};
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public PreviewSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
