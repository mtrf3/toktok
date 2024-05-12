package kotlin.jvm.internal;

import X.AAX;
import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C58655N0h;
import X.C58704N2e;
import X.C70414RkI;
import X.C76800UCe;
import X.C78983UzD;
import X.InterfaceC26837Ag5;
import X.InterfaceC88472Yns;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class AqS3S2300000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(View it) {
        o.LJIIIZ(it, "it");
        Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", this.s0, null));
        Context context = (Context) this.l2;
        if (context != null) {
            String str = this.s0;
            Integer num = (Integer) this.l3;
            String str2 = this.s1;
            Aweme aweme = (Aweme) this.l4;
            try {
                C16880lQ.LIZJ(context, intent);
                HashMap<String, Integer> hashMap = AAX.LIZ;
                int i = 1;
                if (num != null) {
                    i = 1 + num.intValue();
                }
                hashMap.put(str, Integer.valueOf(i));
                AAX.LIZIZ = System.currentTimeMillis();
                AAX.LIZJ = str2;
                C58655N0h LIZLLL = C58704N2e.LIZLLL(str2, "otherclick", aweme.getAwemeRawAd());
                LIZLLL.LIZJ("banner_confirm", "refer");
                LIZLLL.LJI();
                C58704N2e.LIZLLL(str2, "leave_tt", aweme.getAwemeRawAd()).LJI();
            } catch (ActivityNotFoundException e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r1 == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS3S2300000_4 r10, java.lang.Object r11) {
        /*
            r8 = r11
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = r10.l2
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel) r0
            X.XKQ r0 = r0.LLD
            if (r0 == 0) goto L64
            boolean r1 = r0.isActive()
            r0 = 1
            if (r1 != r0) goto L64
        L12:
            r11 = 0
            if (r0 == 0) goto L26
            boolean r0 = com.ss.android.ugc.aweme.ecommerce.core.ab.OspAsyncInflateSettings.LIZ()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r10.l2
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel) r0
            X.XKQ r0 = r0.LLD
            if (r0 == 0) goto L26
            r0.LIZIZ(r11)
        L26:
            java.lang.Object r2 = r10.l2
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r2 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel) r2
            X.34l r3 = X.C780334l.LJLIL
            com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspOptimizedV2$EComOSPEnterConfig r0 = com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspOptimizedV2.LIZ()
            java.lang.Boolean r0 = r0.optimizeCoroutine
            if (r0 == 0) goto L60
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L60
        L3b:
            X.UtN r0 = X.C36636EZk.LIZ
            X.UtN r1 = r0.LJJIJIL()
        L41:
            X.AwS r4 = new X.AwS
            java.lang.Object r5 = r10.l2
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r5 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel) r5
            java.lang.Object r6 = r10.l3
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r7 = r10.l4
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r7 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState) r7
            java.lang.String r9 = r10.s0
            java.lang.String r10 = r10.s1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0 = 2
            X.XKQ r0 = X.XKX.LIZLLL(r3, r1, r11, r4, r0)
            r2.LLD = r0
        L5d:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L60:
            X.UtN r1 = X.C36636EZk.LIZ
            goto L41
        L64:
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS3S2300000_4.invoke$0(kotlin.jvm.internal.AqS3S2300000_4, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS3S2300000_4 aqS3S2300000_4, Object obj) {
        aqS3S2300000_4.invoke$0((View) obj);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x01f2, code lost:
    
        if (r4 != null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0131, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x014e, code lost:
    
        if (r4 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0149, code lost:
    
        if (r4 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0144, code lost:
    
        if (r4 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x013f, code lost:
    
        if (r4 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x013a, code lost:
    
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bf, code lost:
    
        if (r4 != null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AqS3S2300000_4 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS3S2300000_4.invoke$2(kotlin.jvm.internal.AqS3S2300000_4, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS3S2300000_4(C70414RkI c70414RkI, C70414RkI c70414RkI2, Map<String, ? extends Object> map, String str, InterfaceC26837Ag5 interfaceC26837Ag5, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = c70414RkI;
        this.l3 = c70414RkI2;
        this.s0 = map;
        this.l4 = str;
        this.s1 = interfaceC26837Ag5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S2300000_4(Context context, Aweme aweme, Integer num, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = context;
        this.l3 = num;
        this.s1 = str2;
        this.l4 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S2300000_4(PdpViewModel pdpViewModel, Context context, SkuPanelState skuPanelState, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = pdpViewModel;
        this.l3 = context;
        this.l4 = skuPanelState;
        this.s0 = str;
        this.s1 = str2;
    }
}
