package X;

import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel;

/* renamed from: X.7hZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192857hZ extends AbstractC65781Prl implements InterfaceC88472Yns<C192847hY, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ VideoCollectionListViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C192857hZ(boolean z, VideoCollectionListViewModel videoCollectionListViewModel, String str, boolean z2) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = videoCollectionListViewModel;
        this.LJLJI = str;
        this.LJLJJI = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        if ((r1 instanceof X.C3C1) == false) goto L13;
     */
    @Override // X.InterfaceC88472Yns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(X.C192847hY r11) {
        /*
            r10 = this;
            X.7hY r11 = (X.C192847hY) r11
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            boolean r0 = r10.LJLIL
            if (r0 != 0) goto L1c
            boolean r0 = r11.LJLJJI
            if (r0 != 0) goto L12
        Lf:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L12:
            X.2td<java.util.List<X.7hM>> r1 = r11.LJLIL
            boolean r0 = r1 instanceof X.C33X
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof X.C3C1
            if (r0 == 0) goto L23
        L1c:
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel r1 = r10.LJLILLLLZI
            X.7ha r0 = X.C192867ha.LJLIL
            r1.setState(r0)
        L23:
            boolean r0 = r10.LJLIL
            r3 = 0
            if (r0 == 0) goto Lbc
            r5 = 0
            X.OQg r0 = X.C61878OQg.INSTANCE
        L2d:
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel r1 = r10.LJLILLLLZI
            java.lang.String r2 = r1.LJLIL
            com.ss.android.ugc.aweme.IAccountService r1 = com.ss.android.ugc.aweme.AccountService.LJIJ()
            X.RBY r1 = r1.LJFF()
            if (r1 == 0) goto Lba
            java.lang.String r1 = r1.getCurUserId()
        L3f:
            boolean r2 = kotlin.jvm.internal.o.LJ(r2, r1)
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto Laf
            if (r2 == 0) goto Laf
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel r1 = r10.LJLILLLLZI
            X.8as r1 = r1.LJLJJI
            java.lang.Object r1 = r1.getValue()
            X.8aw r1 = (X.InterfaceC214228aw) r1
            X.3e4 r2 = r1.getOperator()
            X.7gv r2 = (X.InterfaceC192457gv) r2
            r1 = 1
            X.Sri r2 = r2.LJJIJIIJIL(r1)
            X.J8W r1 = X.J8W.LJLILLLLZI
            X.Sxt r3 = r2.LJJIJL(r1)
        L64:
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel r1 = r10.LJLILLLLZI
            X.8as r1 = r1.LJLJJI
            java.lang.Object r1 = r1.getValue()
            X.8aw r1 = (X.InterfaceC214228aw) r1
            X.3e4 r4 = r1.getOperator()
            X.7gv r4 = (X.InterfaceC192457gv) r4
            java.lang.String r7 = r10.LJLJI
            boolean r9 = r10.LJLJJI
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel r1 = r10.LJLILLLLZI
            java.lang.String r8 = r1.LJLIL
            X.Sri r2 = r4.LJIILIIL(r5, r7, r8, r9)
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel r5 = r10.LJLILLLLZI
            X.7he r1 = new X.7he
            r1.<init>()
            r2.getClass()
            java.lang.String r0 = "other is null"
            X.C73320Sq4.LIZ(r3, r0)
            X.Svk r1 = X.AbstractC73672Svk.LJJLL(r2, r3, r1)
            X.T0k r0 = X.T16.LIZ()
            X.Sro r4 = r1.LJJL(r0)
            X.7hc<T> r3 = new X.InterfaceC64592gB() { // from class: X.7hc
                static {
                    /*
                        X.7hc r0 = new X.7hc
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.7hc<T>) X.7hc.LJLIL X.7hc
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C192887hc.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C192887hc.<init>():void");
                }

                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(java.lang.Object r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C192887hc.accept(java.lang.Object):void");
                }
            }
            Y.AfS55S0100000_3 r2 = new Y.AfS55S0100000_3
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel r1 = r10.LJLILLLLZI
            r0 = 50
            r2.<init>(r1, r0)
            X.3kP r0 = r4.LJJJLIIL(r3, r2)
            r5.disposeOnClear(r0)
            goto Lf
        Laf:
            boolean r1 = r11.LJLILLLLZI
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            X.Su1 r3 = X.AbstractC73672Svk.LJJIJIL(r1)
            goto L64
        Lba:
            r1 = 0
            goto L3f
        Lbc:
            long r5 = r11.LJLJI
            X.2td<java.util.List<X.7hM>> r0 = r11.LJLIL
            java.lang.Object r0 = r0.LIZ()
            java.util.List r0 = (java.util.List) r0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192857hZ.invoke(java.lang.Object):java.lang.Object");
    }
}
