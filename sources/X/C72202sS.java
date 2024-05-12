package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.RemindBoxHelperKt$bindData$1$1", f = "RemindBoxHelper.kt", l = {LiveAnchorEnableInnerBeautyMaxValue.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.2sS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72202sS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C72242sW LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ InterfaceC71003Rtn LJLJJL;
    public final /* synthetic */ java.util.Map<String, Object> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72202sS(C72242sW c72242sW, View view, InterfaceC71003Rtn interfaceC71003Rtn, java.util.Map<String, ? extends Object> map, InterfaceC67352kd<? super C72202sS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c72242sW;
        this.LJLJJI = view;
        this.LJLJJL = interfaceC71003Rtn;
        this.LJLJJLL = map;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C72202sS c72202sS = new C72202sS(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c72202sS.LJLILLLLZI = obj;
        return c72202sS;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x006b -> B:5:0x0010). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLIL
            r5 = 1
            if (r0 == 0) goto L6e
            if (r0 != r5) goto L79
            java.lang.Object r0 = r9.LJLILLLLZI
            X.2pa r0 = (X.InterfaceC70422pa) r0
            X.C141335gf.LIZJ(r10)
        L10:
            X.2sW r7 = r9.LJLJI
            long r3 = r7.element
            r1 = 1
            long r3 = r3 - r1
            r7.element = r3
            android.view.View r2 = r9.LJLJJI
            r1 = 2131365006(0x7f0a0c8e, float:1.8349865E38)
            android.view.View r4 = r2.findViewById(r1)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.StringBuilder r3 = X.X1D.LIZ()
            X.2sW r1 = r9.LJLJI
            long r1 = r1.element
            r3.append(r1)
            r1 = 115(0x73, float:1.61E-43)
            r3.append(r1)
            java.lang.String r1 = X.X1D.LIZIZ(r3)
            r4.setText(r1)
            X.2sW r1 = r9.LJLJI
            long r2 = r1.element
            r7 = 0
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 > 0) goto L5b
            r1 = 0
            X.C48841JEv.LIZJ(r0, r1)
            android.view.View r2 = r9.LJLJJI
            r1 = 8
            r2.setVisibility(r1)
            X.Rtn r4 = r9.LJLJJL
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.LJLJJLL
            java.lang.String r2 = "no_interaction"
            java.lang.String r1 = "top_voucher_remind"
            X.C69964Rd2.LIZ(r4, r3, r2, r1)
        L5b:
            boolean r1 = X.C48841JEv.LJIILLIIL(r0)
            if (r1 == 0) goto L76
            r9.LJLILLLLZI = r0
            r9.LJLIL = r5
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r1 = X.C1JD.LIZJ(r1, r9)
            if (r1 != r6) goto L10
            return r6
        L6e:
            X.C141335gf.LIZJ(r10)
            java.lang.Object r0 = r9.LJLILLLLZI
            X.2pa r0 = (X.InterfaceC70422pa) r0
            goto L5b
        L76:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72202sS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
