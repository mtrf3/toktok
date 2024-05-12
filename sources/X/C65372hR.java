package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.VCBasePipelineHandler$process$2", f = "VCBasePipelineHandler.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40}, m = "invokeSuspend")
/* renamed from: X.2hR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65372hR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<Object>>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ List<C166116fX> LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<C166116fX, Object> LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<C166116fX, Object> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C65372hR(List<C166116fX> list, InterfaceC88472Yns<? super C166116fX, Object> interfaceC88472Yns, InterfaceC88472Yns<? super C166116fX, Object> interfaceC88472Yns2, InterfaceC67352kd<? super C65372hR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = list;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = interfaceC88472Yns2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C65372hR c65372hR = new C65372hR(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c65372hR.LJLJI = obj;
        return c65372hR;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0039 -> B:5:0x0015). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLILLLLZI
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L3c
            if (r0 != r7) goto L84
            java.lang.Object r2 = r11.LJLIL
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r11.LJLJI
            java.util.List r5 = (java.util.List) r5
            X.C141335gf.LIZJ(r12)
        L15:
            if (r12 == 0) goto L1a
            r5.add(r12)
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r1 = r2.next()
            X.2hQ r1 = (X.C65362hQ) r1
            X.2mE<T> r0 = r1.LIZIZ
            if (r0 == 0) goto L37
            r11.LJLJI = r5
            r11.LJLIL = r2
            r11.LJLILLLLZI = r7
            java.lang.Object r12 = r0.LJI(r11)
            if (r12 != r8) goto L15
            return r8
        L37:
            T r12 = r1.LIZ
            if (r12 == 0) goto L1a
            goto L15
        L3c:
            X.C141335gf.LIZJ(r12)
            java.lang.Object r9 = r11.LJLJI
            X.2pa r9 = (X.InterfaceC70422pa) r9
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List<X.6fX> r0 = r11.LJLJJI
            java.util.Iterator r10 = r0.iterator()
        L53:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r3 = r10.next()
            X.6fX r3 = (X.C166116fX) r3
            X.Yns<X.6fX, java.lang.Object> r0 = r11.LJLJJL
            java.lang.Object r2 = r0.invoke(r3)
            if (r2 != 0) goto L7c
            X.2hS r1 = new X.2hS
            X.Yns<X.6fX, java.lang.Object> r0 = r11.LJLJJLL
            r1.<init>(r0, r3, r6)
            r0 = 3
            X.XKn r1 = X.XKX.LIZIZ(r9, r6, r6, r1, r0)
        L73:
            X.2hQ r0 = new X.2hQ
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L53
        L7c:
            r1 = r6
            goto L73
        L7e:
            java.util.Iterator r2 = r4.iterator()
            goto L1a
        L83:
            return r5
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65372hR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<Object>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
