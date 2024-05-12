package com.ss.android.ugc.aweme.friendstab.model;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SingleTabCounter extends F9E {
    public int numberCount;
    public boolean showRedDot;
    public String tag;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SingleTabCounter() {
        /*
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 7
            r0 = r6
            r3 = r2
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter.<init>():void");
    }

    public static /* synthetic */ SingleTabCounter copy$default(SingleTabCounter singleTabCounter, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = singleTabCounter.tag;
        }
        if ((i2 & 2) != 0) {
            i = singleTabCounter.numberCount;
        }
        if ((i2 & 4) != 0) {
            z = singleTabCounter.showRedDot;
        }
        return singleTabCounter.copy(str, i, z);
    }

    public final SingleTabCounter copy(String tag, int i, boolean z) {
        o.LJIIIZ(tag, "tag");
        return new SingleTabCounter(tag, i, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.tag, Integer.valueOf(this.numberCount), Boolean.valueOf(this.showRedDot)};
    }

    public final int getNumberCount() {
        return this.numberCount;
    }

    public final boolean getShowRedDot() {
        return this.showRedDot;
    }

    public final String getTag() {
        return this.tag;
    }

    public final void setNumberCount(int i) {
        this.numberCount = i;
    }

    public final void setShowRedDot(boolean z) {
        this.showRedDot = z;
    }

    public final void setTag(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.tag = str;
    }

    public SingleTabCounter(String tag, int i, boolean z) {
        o.LJIIIZ(tag, "tag");
        this.tag = tag;
        this.numberCount = i;
        this.showRedDot = z;
    }

    public /* synthetic */ SingleTabCounter(String str, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z);
    }
}
