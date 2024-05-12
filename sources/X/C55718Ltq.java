package X;

import com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity$requireAuthPopup$1", f = "FindFriendsPageActivity.kt", l = {178}, m = "invokeSuspend")
/* renamed from: X.Ltq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55718Ltq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ FindFriendsPageActivity LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55718Ltq(FindFriendsPageActivity findFriendsPageActivity, InterfaceC67352kd<? super C55718Ltq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = findFriendsPageActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55718Ltq(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLIL
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L2e
            if (r0 != r6) goto Lc2
            X.C141335gf.LIZJ(r12)
        Ld:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L2b
        L11:
            com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity r5 = r11.LJLILLLLZI
            r5.getClass()
            boolean r0 = X.L10.LIZ()
            if (r0 == 0) goto L2b
            androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r5)
            X.XIA r2 = X.C78613UtF.LIZJ
            X.2q1 r1 = new X.2q1
            r1.<init>(r5, r4)
            r0 = 2
            X.XKX.LIZLLL(r3, r2, r4, r1, r0)
        L2b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2e:
            X.C141335gf.LIZJ(r12)
            com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity r2 = r11.LJLILLLLZI
            r2.getClass()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            long r9 = r0.getRegisterTime()
            X.KsJ r0 = X.C53075KsJ.LIZ
            r0.getClass()
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r1 = "find_friends_force_popup_user_register_time_limit"
            r0 = 1686110400(0x648000c0, float:1.8889898E22)
            int r0 = com.bytedance.ies.abmock.SettingsManager.LJ(r1, r0)
            long r0 = (long) r0
            java.lang.String r8 = "has_entered_ffp"
            r7 = 0
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L9e
            com.bytedance.keva.Keva r1 = X.C33674DJm.LIZ
            boolean r0 = r1.getBoolean(r8, r7)
            if (r0 != 0) goto La9
            r1.storeBoolean(r8, r6)
            X.Ltr r0 = X.C55719Ltr.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.experiment.AddScenesForAuthPopConfig r0 = X.C55719Ltr.LIZ()
            boolean r0 = r0.addFFPToNecessaryScene
            if (r0 == 0) goto La9
            kotlin.jvm.internal.AqS175S0100000_9 r1 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 6
            r1.<init>(r2, r0)
            X.2pm r0 = X.C78609UtB.LJJII(r2, r1)
        L83:
            if (r0 == 0) goto L11
            com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity r3 = r11.LJLILLLLZI
            X.URq r0 = (X.C77202URq) r0
            X.3C3 r2 = r0.LIZJ()
            if (r2 == 0) goto L11
            Y.IDfS130S0100000_9 r1 = new Y.IDfS130S0100000_9
            r0 = 0
            r1.<init>(r3, r0)
            r11.LJLIL = r6
            java.lang.Object r0 = r2.collect(r1, r11)
            if (r0 != r5) goto Ld
            return r5
        L9e:
            com.bytedance.keva.Keva r1 = X.C33674DJm.LIZ
            boolean r0 = r1.getBoolean(r8, r7)
            if (r0 != 0) goto La9
            r1.storeBoolean(r8, r6)
        La9:
            X.Ltr r0 = X.C55719Ltr.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.experiment.AddScenesForAuthPopConfig r0 = X.C55719Ltr.LIZ()
            boolean r0 = r0.addFFPToSocialEvent
            if (r0 == 0) goto L11
            kotlin.jvm.internal.AqS175S0100000_9 r1 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 8
            r1.<init>(r2, r0)
            X.2pm r0 = X.C78609UtB.LJJII(r2, r1)
            goto L83
        Lc2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55718Ltq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
