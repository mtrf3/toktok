package com.bytedance.ies.cutsame.source.model;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class Point extends F9E {
    public final float x;
    public final float y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Point() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.cutsame.source.model.Point.<init>():void");
    }

    public static /* synthetic */ Point copy$default(Point point, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = point.x;
        }
        if ((i & 2) != 0) {
            f2 = point.y;
        }
        return point.copy(f, f2);
    }

    public final Point copy(float f, float f2) {
        return new Point(f, f2);
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

    public Point(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public /* synthetic */ Point(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
