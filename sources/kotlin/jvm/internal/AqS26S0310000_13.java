package kotlin.jvm.internal;

import X.AbstractC26082ALm;
import X.AbstractC65781Prl;
import X.C173936s9;
import X.C46104I7o;
import X.C47121t6;
import X.C68322mC;
import X.C76800UCe;
import X.C76907UGh;
import X.EnumC76908UGi;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.T4Y;
import android.os.CountDownTimer;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.CPCState;
import com.bytedance.android.livesdk.gift.model.CpcPromptResponse;

/* loaded from: classes14.dex */
public class AqS26S0310000_13 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.CountDownTimer, T] */
    public static final Object invoke$0(AqS26S0310000_13 aqS26S0310000_13, Object subscribe, Object obj) {
        C173936s9 c173936s9;
        CPCState it = (CPCState) obj;
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(it, "it");
        AbstractC26082ALm<CpcPromptResponse> task = it.getTask();
        if ((task instanceof C173936s9) && (c173936s9 = (C173936s9) task) != null) {
            C68322mC c68322mC = (C68322mC) aqS26S0310000_13.l0;
            T4Y t4y = (T4Y) aqS26S0310000_13.l1;
            boolean z = aqS26S0310000_13.z3;
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS26S0310000_13.l2;
            EnumC76908UGi enumC76908UGi = EnumC76908UGi.SCENE_1_GIFT_PANEL;
            CpcPromptResponse cpcPromptResponse = (CpcPromptResponse) c173936s9.LIZ;
            c68322mC.element = C76907UGh.LIZ(t4y, enumC76908UGi, cpcPromptResponse.prompt, cpcPromptResponse.redirectLinkText, cpcPromptResponse.giftFaq, z, interfaceC88472Yns, null);
            C46104I7o.LJJJJLL((CpcPromptResponse) c173936s9.LIZ);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AqS26S0310000_13 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            X.ALm r8 = (X.AbstractC26082ALm) r8
            java.lang.String r0 = "$this$selectSubscribe"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            boolean r0 = r8 instanceof X.C173936s9
            if (r0 == 0) goto L49
            X.6s9 r8 = (X.C173936s9) r8
            if (r8 == 0) goto L49
            T r0 = r8.LIZ
            com.bytedance.android.livesdk.gift.model.CpcPromptResponse r0 = (com.bytedance.android.livesdk.gift.model.CpcPromptResponse) r0
            java.lang.String r0 = r0.prompt
            boolean r0 = X.C29306Beo.LJIJJLI(r0)
            if (r0 == 0) goto L49
            boolean r5 = r6.z3
            java.lang.Object r4 = r6.l0
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object r3 = r6.l1
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r2 = r6.l2
            X.Yns r2 = (X.InterfaceC88472Yns) r2
            T r0 = r8.LIZ
            com.bytedance.android.livesdk.gift.model.CpcPromptResponse r0 = (com.bytedance.android.livesdk.gift.model.CpcPromptResponse) r0
            java.lang.String r1 = r0.prompt
            java.lang.String r0 = r0.redirectLinkText
            X.C76907UGh.LIZJ(r5, r1, r4, r3, r0)
            T r0 = r8.LIZ
            com.bytedance.android.livesdk.gift.model.CpcPromptResponse r0 = (com.bytedance.android.livesdk.gift.model.CpcPromptResponse) r0
            X.C46104I7o.LJJJJLL(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.invoke(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L52
        L49:
            java.lang.Object r1 = r6.l2
            X.Yns r1 = (X.InterfaceC88472Yns) r1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.invoke(r0)
        L52:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS26S0310000_13.invoke$1(kotlin.jvm.internal.AqS26S0310000_13, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS26S0310000_13(C68322mC c68322mC, C68322mC<CountDownTimer> c68322mC2, T4Y t4y, boolean z, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(2);
        this.$t = interfaceC88472Yns;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
        this.z3 = t4y;
        this.l2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS26S0310000_13(boolean z, C47121t6 c47121t6, C47121t6 c47121t62, AqS144S0200000_13 aqS144S0200000_13, int i) {
        super(2);
        this.$t = i;
        this.z3 = z;
        this.l0 = c47121t6;
        this.l1 = c47121t62;
        this.l2 = aqS144S0200000_13;
    }
}
