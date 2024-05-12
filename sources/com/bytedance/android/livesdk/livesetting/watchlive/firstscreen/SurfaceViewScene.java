package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SurfaceViewScene {

    @InterfaceC65349Pkn("forbidden_entrance")
    public String forbidden_entrance;

    @InterfaceC65349Pkn("inner_draw")
    public boolean inner_draw;

    @InterfaceC65349Pkn("inner_jump")
    public boolean inner_jump;

    @InterfaceC65349Pkn("outside_normal_click")
    public boolean outside_normal_click;

    @InterfaceC65349Pkn("outside_with_feed")
    public boolean outside_with_feed;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SurfaceViewScene() {
        /*
            r8 = this;
            r1 = 0
            r5 = 0
            r6 = 31
            r0 = r8
            r2 = r1
            r3 = r1
            r4 = r1
            r7 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.SurfaceViewScene.<init>():void");
    }

    public SurfaceViewScene(boolean z, boolean z2, boolean z3, boolean z4, String forbidden_entrance) {
        o.LJIIIZ(forbidden_entrance, "forbidden_entrance");
        this.outside_with_feed = z;
        this.outside_normal_click = z2;
        this.inner_draw = z3;
        this.inner_jump = z4;
        this.forbidden_entrance = forbidden_entrance;
    }

    public /* synthetic */ SurfaceViewScene(boolean z, boolean z2, boolean z3, boolean z4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) == 0 ? z4 : false, (i & 16) != 0 ? "" : str);
    }
}
