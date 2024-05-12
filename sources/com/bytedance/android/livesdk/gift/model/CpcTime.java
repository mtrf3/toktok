package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class CpcTime extends F9E {

    @InterfaceC65349Pkn("apiCallLastTime")
    public long apiCallLastTime;

    @InterfaceC65349Pkn("lastShowingTime")
    public long lastShowingTime;

    @InterfaceC65349Pkn("scene1LastTime")
    public long scene1LastTime;

    @InterfaceC65349Pkn("scene2LastTime")
    public long scene2LastTime;

    @InterfaceC65349Pkn("scene3LastTime")
    public long scene3LastTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CpcTime() {
        /*
            r13 = this;
            r1 = 0
            r11 = 31
            r12 = 0
            r0 = r13
            r3 = r1
            r5 = r1
            r7 = r1
            r9 = r1
            r0.<init>(r1, r3, r5, r7, r9, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.model.CpcTime.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.lastShowingTime), Long.valueOf(this.scene1LastTime), Long.valueOf(this.scene2LastTime), Long.valueOf(this.scene3LastTime), Long.valueOf(this.apiCallLastTime)};
    }

    public static CpcTime L(CpcTime cpcTime, long j, long j2, int i) {
        long j3;
        long j4;
        long j5;
        long j6 = j2;
        long j7 = j;
        if ((i & 1) != 0) {
            j7 = cpcTime.lastShowingTime;
        }
        if ((i & 2) != 0) {
            j3 = cpcTime.scene1LastTime;
        } else {
            j3 = 0;
        }
        if ((i & 4) != 0) {
            j4 = cpcTime.scene2LastTime;
        } else {
            j4 = 0;
        }
        if ((i & 8) != 0) {
            j5 = cpcTime.scene3LastTime;
        } else {
            j5 = 0;
        }
        if ((i & 16) != 0) {
            j6 = cpcTime.apiCallLastTime;
        }
        return new CpcTime(j7, j3, j4, j5, j6);
    }

    public CpcTime(long j, long j2, long j3, long j4, long j5) {
        this.lastShowingTime = j;
        this.scene1LastTime = j2;
        this.scene2LastTime = j3;
        this.scene3LastTime = j4;
        this.apiCallLastTime = j5;
    }

    public /* synthetic */ CpcTime(long j, long j2, long j3, long j4, long j5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4, (i & 16) == 0 ? j5 : 0L);
    }
}
