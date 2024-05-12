package com.bytedance.android.livesdk.sei;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MagicGestureActivitySei extends F9E {

    @InterfaceC65349Pkn("action_schema")
    public String actionSchema;

    @InterfaceC65349Pkn("anchor_id")
    public long anchorId;

    @InterfaceC65349Pkn("animation_duration")
    public int animDuration;

    @InterfaceC65349Pkn("point_x")
    public double pointX;

    @InterfaceC65349Pkn("point_y")
    public double pointY;

    @InterfaceC65349Pkn("radius_x")
    public double radiusX;

    @InterfaceC65349Pkn("radius_y")
    public double radiusY;

    @InterfaceC65349Pkn("resource_id")
    public String resourceId;

    @InterfaceC65349Pkn("status")
    public int status;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MagicGestureActivitySei() {
        /*
            r17 = this;
            r1 = 0
            r2 = 0
            r11 = 0
            r12 = 0
            r15 = 511(0x1ff, float:7.16E-43)
            r0 = r17
            r4 = r2
            r6 = r2
            r8 = r2
            r10 = r1
            r14 = r11
            r16 = r11
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r12, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.sei.MagicGestureActivitySei.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.status), Double.valueOf(this.pointX), Double.valueOf(this.pointY), Double.valueOf(this.radiusX), Double.valueOf(this.radiusY), Integer.valueOf(this.animDuration), this.resourceId, Long.valueOf(this.anchorId), this.actionSchema};
    }

    public MagicGestureActivitySei(int i, double d, double d2, double d3, double d4, int i2, String resourceId, long j, String actionSchema) {
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(actionSchema, "actionSchema");
        this.status = i;
        this.pointX = d;
        this.pointY = d2;
        this.radiusX = d3;
        this.radiusY = d4;
        this.animDuration = i2;
        this.resourceId = resourceId;
        this.anchorId = j;
        this.actionSchema = actionSchema;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MagicGestureActivitySei(int r17, double r18, double r20, double r22, double r24, int r26, java.lang.String r27, long r28, java.lang.String r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r16 = this;
            r1 = r31
            r13 = r28
            r3 = r18
            r2 = r17
            r5 = r20
            r12 = r27
            r7 = r22
            r11 = r26
            r0 = r1 & 1
            if (r0 == 0) goto L15
            r2 = 0
        L15:
            r0 = r1 & 2
            r9 = 0
            if (r0 == 0) goto L1d
            r3 = 0
        L1d:
            r0 = r1 & 4
            if (r0 == 0) goto L23
            r5 = 0
        L23:
            r0 = r1 & 8
            if (r0 == 0) goto L29
            r7 = 0
        L29:
            r0 = r1 & 16
            if (r0 == 0) goto L4c
        L2d:
            r0 = r1 & 32
            if (r0 == 0) goto L32
            r11 = 3
        L32:
            r0 = r1 & 64
            java.lang.String r15 = ""
            if (r0 == 0) goto L39
            r12 = r15
        L39:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L3f
            r13 = 0
        L3f:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L49
        L43:
            r1 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r15)
            return
        L49:
            r15 = r30
            goto L43
        L4c:
            r9 = r24
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.sei.MagicGestureActivitySei.<init>(int, double, double, double, double, int, java.lang.String, long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
