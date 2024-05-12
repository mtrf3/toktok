package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;

/* loaded from: classes14.dex */
public final class PlayerData extends F9E {
    public final int exceptedH;
    public final int exceptedW;
    public final int exceptedX;
    public final int exceptedY;
    public final int realH;
    public final int realW;
    public final int realX;
    public final int realY;
    public final int streamH;
    public final int streamW;

    public static /* synthetic */ PlayerData copy$default(PlayerData playerData, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = playerData.streamW;
        }
        if ((i11 & 2) != 0) {
            i2 = playerData.streamH;
        }
        if ((i11 & 4) != 0) {
            i3 = playerData.exceptedX;
        }
        if ((i11 & 8) != 0) {
            i4 = playerData.exceptedY;
        }
        if ((i11 & 16) != 0) {
            i5 = playerData.exceptedW;
        }
        if ((i11 & 32) != 0) {
            i6 = playerData.exceptedH;
        }
        if ((i11 & 64) != 0) {
            i7 = playerData.realX;
        }
        if ((i11 & 128) != 0) {
            i8 = playerData.realY;
        }
        if ((i11 & 256) != 0) {
            i9 = playerData.realW;
        }
        if ((i11 & 512) != 0) {
            i10 = playerData.realH;
        }
        return playerData.copy(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    public final PlayerData copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        return new PlayerData(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.streamW), Integer.valueOf(this.streamH), Integer.valueOf(this.exceptedX), Integer.valueOf(this.exceptedY), Integer.valueOf(this.exceptedW), Integer.valueOf(this.exceptedH), Integer.valueOf(this.realX), Integer.valueOf(this.realY), Integer.valueOf(this.realW), Integer.valueOf(this.realH)};
    }

    public final int getExceptedH() {
        return this.exceptedH;
    }

    public final int getExceptedW() {
        return this.exceptedW;
    }

    public final int getExceptedX() {
        return this.exceptedX;
    }

    public final int getExceptedY() {
        return this.exceptedY;
    }

    public final int getRealH() {
        return this.realH;
    }

    public final int getRealW() {
        return this.realW;
    }

    public final int getRealX() {
        return this.realX;
    }

    public final int getRealY() {
        return this.realY;
    }

    public final int getStreamH() {
        return this.streamH;
    }

    public final int getStreamW() {
        return this.streamW;
    }

    public PlayerData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.streamW = i;
        this.streamH = i2;
        this.exceptedX = i3;
        this.exceptedY = i4;
        this.exceptedW = i5;
        this.exceptedH = i6;
        this.realX = i7;
        this.realY = i8;
        this.realW = i9;
        this.realH = i10;
    }
}
