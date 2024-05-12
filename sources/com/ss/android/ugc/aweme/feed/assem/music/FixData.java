package com.ss.android.ugc.aweme.feed.assem.music;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class FixData extends F9E {

    @InterfaceC65349Pkn("fix_rtl_cover_anim")
    public final boolean needFixCoverAnim;

    @InterfaceC65349Pkn("fix_marquee_anim")
    public final boolean needFixMarqueeAnim;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FixData() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.FixData.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.needFixMarqueeAnim), Boolean.valueOf(this.needFixCoverAnim)};
    }

    public FixData(boolean z, boolean z2) {
        this.needFixMarqueeAnim = z;
        this.needFixCoverAnim = z2;
    }

    public /* synthetic */ FixData(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
