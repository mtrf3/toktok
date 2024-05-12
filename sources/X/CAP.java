package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.chatroom.banner.view.NativeBannerViewImpl$startAutoPlay$1", f = "NativeBannerViewImpl.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CAP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;
    public CAO LJLJI;
    public int LJLJJI;
    public final /* synthetic */ CAO LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CAP(CAO cao, InterfaceC67352kd<? super CAP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = cao;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new CAP(this.LJLJJL, interfaceC67352kd);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0043 -> B:5:0x0013). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLJJI
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L50
            if (r0 != r5) goto L5d
            int r4 = r10.LJLILLLLZI
            int r3 = r10.LJLIL
            X.CAO r0 = r10.LJLJI
            X.C141335gf.LIZJ(r11)
        L13:
            X.0CM r9 = r0.LJLJLJ
            if (r9 == 0) goto L31
            r9.setUserInputEnabled(r6)
            X.CAQ r8 = r0.LJLLJ
            if (r8 != 0) goto L46
        L1e:
            int r1 = r9.getCurrentItem()
            int r2 = r1 + 1
            java.util.List<com.bytedance.android.livesdk.model.BannerInRoom> r1 = r0.LJLILLLLZI
            int r1 = r1.size()
            int r2 = r2 % r1
            r9.setCurrentItem(r2)
            r9.setUserInputEnabled(r5)
        L31:
            int r4 = r4 + 1
            if (r4 >= r3) goto L5a
        L35:
            long r1 = r0.LJLLI
            r10.LJLJI = r0
            r10.LJLIL = r3
            r10.LJLILLLLZI = r4
            r10.LJLJJI = r5
            java.lang.Object r1 = X.C1JD.LIZJ(r1, r10)
            if (r1 != r7) goto L13
            return r7
        L46:
            X.CAH r2 = X.CAH.AUTO_SCROLL
            java.lang.String r1 = "<set-?>"
            kotlin.jvm.internal.o.LJIIIZ(r2, r1)
            r8.LJLJJI = r2
            goto L1e
        L50:
            X.C141335gf.LIZJ(r11)
            X.CAO r0 = r10.LJLJJL
            r4 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L35
        L5a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CAP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
