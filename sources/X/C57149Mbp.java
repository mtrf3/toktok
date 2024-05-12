package X;

import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM;

/* renamed from: X.Mbp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57149Mbp implements InterfaceC64672gJ<C57148Mbo> {
    public final /* synthetic */ FriendsEmptyPageRootVM LJLIL;
    public final /* synthetic */ EnumC77147UPn LJLILLLLZI;

    public C57149Mbp(FriendsEmptyPageRootVM friendsEmptyPageRootVM, EnumC77147UPn enumC77147UPn) {
        this.LJLIL = friendsEmptyPageRootVM;
        this.LJLILLLLZI = enumC77147UPn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (r0.LJLJJI != false) goto L21;
     */
    @Override // X.InterfaceC64672gJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(X.C57148Mbo r6, X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r5 = this;
            X.Mbo r6 = (X.C57148Mbo) r6
            X.USe r0 = r6.LIZ
            X.UQ0 r1 = r0.LJLILLLLZI
            X.UQ0 r0 = X.UQ0.SYNC
            r3 = 0
            java.lang.String r2 = "emptyPageMainSectionVM"
            r4 = 0
            if (r1 != r0) goto L22
            com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM r0 = r5.LJLIL
            com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L62
            X.2pa r2 = r0.LJLIL
            X.LSJ r1 = new X.LSJ
            r1.<init>(r4, r0, r3)
            r0 = 3
            X.XKX.LIZLLL(r2, r3, r3, r1, r0)
        L1f:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L22:
            X.UQ0 r0 = X.UQ0.UPLOAD
            if (r1 != r0) goto L1f
            android.os.Bundle r1 = r6.LIZLLL
            if (r1 == 0) goto L30
            java.lang.String r0 = "from_empty_click"
            boolean r4 = r1.getBoolean(r0)
        L30:
            X.USe r0 = r6.LIZ
            X.USf r0 = r0.LJLIL
            boolean r0 = r0.LJLJI
            if (r0 == 0) goto L1f
            if (r4 != 0) goto L44
            com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM r0 = r5.LJLIL
            com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L7f
            boolean r0 = r0.LJLJJI
            if (r0 == 0) goto L1f
        L44:
            com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM r2 = r5.LJLIL
            X.UPn r3 = r5.LJLILLLLZI
            r2.getClass()
            int[] r1 = X.C57151Mbr.LIZ
            int r0 = r3.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L5f
            r0 = 2
            if (r1 != r0) goto L66
            X.MqI r0 = X.EnumC58046MqI.FACEBOOK
        L5b:
            r2.hv0(r0)
            goto L1f
        L5f:
            X.MqI r0 = X.EnumC58046MqI.CONTACT
            goto L5b
        L62:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r3
        L66:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "unknown platform: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r0.toString()
            r2.<init>(r0)
            throw r2
        L7f:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57149Mbp.emit(java.lang.Object, X.2kd):java.lang.Object");
    }
}
