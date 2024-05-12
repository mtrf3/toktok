package com.bytedance.ies.cutsame.cut_android;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;

/* loaded from: classes3.dex */
public final class VideoSlot extends F9E {

    @InterfaceC65349Pkn("clip_end")
    public final double clipEnd;

    @InterfaceC65349Pkn("clip_start")
    public final double clipStart;

    @InterfaceC65349Pkn("endtime")
    public final double endTime;

    @InterfaceC65349Pkn("source")
    public final String source;

    @InterfaceC65349Pkn("starttime")
    public final double startTime;

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("uuid")
    public final String uuid;

    @InterfaceC65349Pkn("volume")
    public float volume;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoSlot() {
        /*
            r15 = this;
            r1 = 0
            r7 = 0
            r12 = 0
            r13 = 255(0xff, float:3.57E-43)
            r0 = r15
            r3 = r1
            r5 = r1
            r8 = r1
            r10 = r7
            r11 = r7
            r14 = r7
            r0.<init>(r1, r3, r5, r7, r8, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.cutsame.cut_android.VideoSlot.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Double.valueOf(this.clipEnd), Double.valueOf(this.clipStart), Double.valueOf(this.endTime), this.source, Double.valueOf(this.startTime), this.type, this.uuid, Float.valueOf(this.volume)};
    }

    public VideoSlot(double d, double d2, double d3, String str, double d4, String str2, String str3, float f) {
        HH1.LIZ(str, "source", str2, "type", str3, "uuid");
        this.clipEnd = d;
        this.clipStart = d2;
        this.endTime = d3;
        this.source = str;
        this.startTime = d4;
        this.type = str2;
        this.uuid = str3;
        this.volume = f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ VideoSlot(double r15, double r17, double r19, java.lang.String r21, double r22, java.lang.String r24, java.lang.String r25, float r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r14 = this;
            r1 = r27
            r4 = r17
            r11 = r24
            r2 = r15
            r6 = r19
            r13 = r26
            r8 = r21
            r0 = r1 & 1
            r9 = 0
            if (r0 == 0) goto L15
            r2 = 0
        L15:
            r0 = r1 & 2
            if (r0 == 0) goto L1b
            r4 = 0
        L1b:
            r0 = r1 & 4
            if (r0 == 0) goto L21
            r6 = 0
        L21:
            r0 = r1 & 8
            java.lang.String r12 = ""
            if (r0 == 0) goto L28
            r8 = r12
        L28:
            r0 = r1 & 16
            if (r0 == 0) goto L42
        L2c:
            r0 = r1 & 32
            if (r0 == 0) goto L31
            r11 = r12
        L31:
            r0 = r1 & 64
            if (r0 == 0) goto L3f
        L35:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L3a
            r13 = 0
        L3a:
            r1 = r14
            r1.<init>(r2, r4, r6, r8, r9, r11, r12, r13)
            return
        L3f:
            r12 = r25
            goto L35
        L42:
            r9 = r22
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.cutsame.cut_android.VideoSlot.<init>(double, double, double, java.lang.String, double, java.lang.String, java.lang.String, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
