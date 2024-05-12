package com.ss.android.ugc.aweme.actionai.action.data;

import X.F9E;

/* loaded from: classes2.dex */
public final class FaceFeatureV2 extends F9E {
    public final float height;
    public final float width;
    public final float x;
    public final float y;

    public static /* synthetic */ FaceFeatureV2 copy$default(FaceFeatureV2 faceFeatureV2, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = faceFeatureV2.x;
        }
        if ((i & 2) != 0) {
            f2 = faceFeatureV2.y;
        }
        if ((i & 4) != 0) {
            f3 = faceFeatureV2.width;
        }
        if ((i & 8) != 0) {
            f4 = faceFeatureV2.height;
        }
        return faceFeatureV2.copy(f, f2, f3, f4);
    }

    public final FaceFeatureV2 copy(float f, float f2, float f3, float f4) {
        return new FaceFeatureV2(f, f2, f3, f4);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Float.valueOf(this.x), Float.valueOf(this.y), Float.valueOf(this.width), Float.valueOf(this.height)};
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public FaceFeatureV2(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
    }
}
