package X;

import com.bytedance.android.livesdk.broadcast.interaction.widget.TryModeGoLiveWidget;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.broadcast.interaction.widget.TryModeGoLiveWidget$startGoLive$1", f = "TryModeGoLiveWidget.kt", l = {149}, m = "invokeSuspend")
/* renamed from: X.BWs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28922BWs extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public TryModeGoLiveWidget LJLILLLLZI;
    public BIK LJLJI;
    public C29163BcV LJLJJI;
    public InterfaceC28918BWo LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final /* synthetic */ C29163BcV LJLJLLL;
    public final /* synthetic */ TryModeGoLiveWidget LJLL;
    public final /* synthetic */ BIK LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28922BWs(C29163BcV c29163BcV, TryModeGoLiveWidget tryModeGoLiveWidget, BIK bik, InterfaceC67352kd<? super C28922BWs> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJLLL = c29163BcV;
        this.LJLL = tryModeGoLiveWidget;
        this.LJLLI = bik;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28922BWs(this.LJLJLLL, this.LJLL, this.LJLLI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0068 -> B:5:0x001d). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r10 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLJLJ
            r9 = 0
            r8 = 1
            if (r0 == 0) goto L39
            if (r0 != r8) goto L6b
            int r7 = r11.LJLJL
            int r1 = r11.LJLJJLL
            X.BWo r6 = r11.LJLJJL
            X.BcV r5 = r11.LJLJJI
            X.BIK r4 = r11.LJLJI
            com.bytedance.android.livesdk.broadcast.interaction.widget.TryModeGoLiveWidget r3 = r11.LJLILLLLZI
            java.lang.Object r2 = r11.LJLIL
            X.BWo[] r2 = (X.InterfaceC28918BWo[]) r2
            X.C141335gf.LIZJ(r12)
        L1d:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r0 = r12.booleanValue()
            if (r0 == 0) goto L47
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L31
            r6.getErrorCode()
            r5.getClass()
        L31:
            X.Ce9 r0 = r3.LJLJI
            X.C29306Beo.LJJJJ(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L39:
            X.C141335gf.LIZJ(r12)
            X.BcV r5 = r11.LJLJLLL
            X.BWo[] r2 = r5.LIZJ
            com.bytedance.android.livesdk.broadcast.interaction.widget.TryModeGoLiveWidget r3 = r11.LJLL
            X.BIK r4 = r11.LJLLI
            int r7 = r2.length
            r1 = 0
            goto L49
        L47:
            int r1 = r1 + 1
        L49:
            if (r1 >= r7) goto L73
            r6 = r2[r1]
            android.content.Context r0 = r3.context
            if (r0 != 0) goto L54
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L54:
            r11.LJLIL = r2
            r11.LJLILLLLZI = r3
            r11.LJLJI = r4
            r11.LJLJJI = r5
            r11.LJLJJL = r6
            r11.LJLJJLL = r1
            r11.LJLJL = r7
            r11.LJLJLJ = r8
            java.lang.Object r12 = r6.LIZIZ(r4, r11)
            if (r12 != r10) goto L1d
            return r10
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L73:
            com.bytedance.android.livesdk.broadcast.interaction.widget.TryModeGoLiveWidget r0 = r11.LJLL
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r0.dataChannel
            X.C0N7.LJ(r0, r9, r8)
            X.BcU r1 = X.C29162BcU.LIZJ
            com.bytedance.android.livesdk.broadcast.interaction.widget.TryModeGoLiveWidget r0 = r11.LJLL
            X.BcW r0 = r0.LJLJJL
            if (r0 == 0) goto L88
            r1.LIZ(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L88:
            java.lang.String r0 = "roomBuilder"
            kotlin.jvm.internal.o.LJIJI(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28922BWs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
