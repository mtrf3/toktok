package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class CorpPointF extends F9E implements Serializable {

    @InterfaceC65349Pkn("x")
    public float x;

    @InterfaceC65349Pkn("y")
    public float y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CorpPointF() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.CorpPointF.<init>():void");
    }

    public static /* synthetic */ CorpPointF copy$default(CorpPointF corpPointF, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = corpPointF.x;
        }
        if ((i & 2) != 0) {
            f2 = corpPointF.y;
        }
        return corpPointF.copy(f, f2);
    }

    public final CorpPointF copy(float f, float f2) {
        return new CorpPointF(f, f2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Float.valueOf(this.x), Float.valueOf(this.y)};
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final void setY(float f) {
        this.y = f;
    }

    public CorpPointF(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public /* synthetic */ CorpPointF(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
