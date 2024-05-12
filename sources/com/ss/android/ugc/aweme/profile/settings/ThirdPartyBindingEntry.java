package com.ss.android.ugc.aweme.profile.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ThirdPartyBindingEntry extends F9E {

    @InterfaceC65349Pkn("ins")
    public final boolean ins;

    @InterfaceC65349Pkn("twitter")
    public final boolean twitter;

    @InterfaceC65349Pkn("youtube")
    public final boolean youtube;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ThirdPartyBindingEntry() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.settings.ThirdPartyBindingEntry.<init>():void");
    }

    public static /* synthetic */ ThirdPartyBindingEntry copy$default(ThirdPartyBindingEntry thirdPartyBindingEntry, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = thirdPartyBindingEntry.twitter;
        }
        if ((i & 2) != 0) {
            z2 = thirdPartyBindingEntry.ins;
        }
        if ((i & 4) != 0) {
            z3 = thirdPartyBindingEntry.youtube;
        }
        return thirdPartyBindingEntry.copy(z, z2, z3);
    }

    public final ThirdPartyBindingEntry copy(boolean z, boolean z2, boolean z3) {
        return new ThirdPartyBindingEntry(z, z2, z3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.twitter), Boolean.valueOf(this.ins), Boolean.valueOf(this.youtube)};
    }

    public final boolean getIns() {
        return this.ins;
    }

    public final boolean getTwitter() {
        return this.twitter;
    }

    public final boolean getYoutube() {
        return this.youtube;
    }

    public ThirdPartyBindingEntry(boolean z, boolean z2, boolean z3) {
        this.twitter = z;
        this.ins = z2;
        this.youtube = z3;
    }

    public /* synthetic */ ThirdPartyBindingEntry(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }
}
