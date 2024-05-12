package X;

import com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment;

/* loaded from: classes14.dex */
public final class UQH extends AbstractC65781Prl implements InterfaceC88471Ynr<AML, Boolean, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ SocialConsentFragment LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UQH(int i, SocialConsentFragment socialConsentFragment, String str) {
        super(2);
        this.LJLIL = i;
        this.LJLILLLLZI = socialConsentFragment;
        this.LJLJI = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @Override // X.InterfaceC88471Ynr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(X.AML r9, java.lang.Boolean r10) {
        /*
            r8 = this;
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r1 = r10.booleanValue()
            java.lang.String r0 = "$this$selectSubscribe"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            int r0 = r8.LJLIL
            r7 = 3
            if (r0 != r7) goto L73
            java.lang.String r6 = "version_update"
        L12:
            java.lang.String r4 = "auto"
        L14:
            if (r1 == 0) goto L44
            boolean r0 = X.C52926Kpu.LIZ()
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment r0 = r8.LJLILLLLZI
            com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel r5 = r0.xl()
            com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment r0 = r8.LJLILLLLZI
            X.1qj r4 = r0.requireActivity()
            java.lang.String r0 = "requireActivity()"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            X.UPn r3 = X.EnumC77147UPn.CONTACT
            r5.getClass()
            java.lang.String r0 = "platform"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            androidx.lifecycle.LifecycleCoroutineScope r2 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            X.UQl r1 = new X.UQl
            r0 = 0
            r1.<init>(r4, r3, r5, r0)
            X.XKX.LIZLLL(r2, r0, r0, r1, r7)
        L44:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L47:
            com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment r5 = r8.LJLILLLLZI
            android.content.Context r3 = r5.requireContext()
            java.lang.Class<com.ss.android.ugc.aweme.ufr.contact.ContactUFR> r2 = com.ss.android.ugc.aweme.ufr.contact.ContactUFR.class
            com.ss.android.ugc.aweme.profile.model.User r0 = X.AV1.LIZIZ()
            java.lang.String r1 = r0.getUid()
            java.lang.String r0 = "requireContext()"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            X.Svk r4 = X.T3Q.LIZLLL(r3, r2, r1, r6, r4)
            Y.AfS26S1100000_13 r3 = new Y.AfS26S1100000_13
            com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment r2 = r8.LJLILLLLZI
            java.lang.String r1 = r8.LJLJI
            r0 = 7
            r3.<init>(r2, r1, r0)
            X.3kP r0 = r4.LJJJJZI(r3)
            X.SrX r0 = (X.C73411SrX) r0
            r5.LJLIL = r0
            goto L44
        L73:
            java.lang.String r6 = "login_onboarding"
            if (r0 != r7) goto L78
            goto L12
        L78:
            java.lang.String r4 = "login"
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UQH.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
