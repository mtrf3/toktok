package com.bytedance.android.live.liveinteract.matchx.models;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EndAnimDetail extends F9E {

    @InterfaceC65349Pkn("battle_result")
    public final String business;

    @InterfaceC65349Pkn("combos")
    public final List<Combo> combos;

    @InterfaceC65349Pkn("is_in_tod")
    public final boolean isInTod;

    @InterfaceC65349Pkn("bottom_offset")
    public final int offset;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EndAnimDetail() {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
            r5 = 15
            r0 = r7
            r3 = r2
            r4 = r1
            r6 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.matchx.models.EndAnimDetail.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.offset), this.business, this.combos, Boolean.valueOf(this.isInTod)};
    }

    public EndAnimDetail(int i, String business, List<Combo> combos, boolean z) {
        o.LJIIIZ(business, "business");
        o.LJIIIZ(combos, "combos");
        this.offset = i;
        this.business = business;
        this.combos = combos;
        this.isInTod = z;
    }

    public /* synthetic */ EndAnimDetail(int i, String str, List list, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? new ArrayList() : list, (i2 & 8) != 0 ? false : z);
    }
}
