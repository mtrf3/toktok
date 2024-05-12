package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.lynxcard;

import X.AbstractC60811Ntn;
import X.AbstractC60815Ntr;
import X.AnonymousClass391;
import X.AnonymousClass461;
import X.AnonymousClass470;
import X.AnonymousClass636;
import X.C1042447g;
import X.C109544Rq;
import X.C16880lQ;
import X.C188727au;
import X.C34B;
import X.C35911E7n;
import X.C35915E7r;
import X.C37240EjU;
import X.C49V;
import X.C4AH;
import X.C60726NsQ;
import X.C60797NtZ;
import X.C61171Nzb;
import X.C74291TDr;
import X.C77413UZt;
import X.EnumC110124Tw;
import X.FMX;
import X.InterfaceC60814Ntq;
import X.OHE;
import X.OSZ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.VNS;
import X.X1D;
import Y.IDLListenerS197S0100000_10;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DynamicCardViewHolder extends AnonymousClass461<DynamicCardTemplate> {
    public static final String LLIL = C16880lQ.LJLLJ(DynamicCardViewHolder.class);
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LLIIIJ;
    public final C74291TDr LLIIIL;
    public final View LLIIIZ;
    public String LLIIJI;
    public C109544Rq LLIIJLIL;
    public DynamicInfoComponent LLIIL;
    public final C61171Nzb LLIILII;
    public final OHE LLIILZL;
    public final IDLListenerS197S0100000_10 LLIIZ;

    /* loaded from: classes11.dex */
    public static final class IMSparkContext extends SparkContext {
        public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS boundSparkView;
        public Map<String, String> logMap;
        public LynxViewClient lynxViewClient;
        public long startTimeStamp = -1;
        public String uuid;

        public final boolean LJJIL() {
            Object obj;
            int i;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.boundSparkView;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                obj = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getTag(R.id.lk);
            } else {
                obj = null;
            }
            boolean z = !o.LJ(obj, this.uuid);
            if (z) {
                String str = DynamicCardViewHolder.LLIL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("isInvalidCallback == true, sparkView = ");
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.boundSparkView;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                    i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.hashCode();
                } else {
                    i = 0;
                }
                LIZ.append(i);
                LIZ.append(", uuid = ");
                LIZ.append(this.uuid);
                C34B.LIZJ(str, X1D.LIZIZ(LIZ));
            }
            return z;
        }

        public final void LJJIZ(boolean z, long j, Integer num) {
            C188727au c188727au = new C188727au();
            c188727au.LJ(j, "load_duration");
            c188727au.LIZLLL(z ? 1 : 0, "load_status");
            c188727au.LJFF(num, "error_code");
            Map<String, String> map = c188727au.LIZ;
            Map<String, String> map2 = this.logMap;
            if (map2 != null) {
                ((HashMap) map).putAll(map2);
            }
            FMX.LJIIL("dm_lynx_load_duration", map);
        }
    }

    public final void o0() {
        Integer num;
        Integer num2;
        View view = this.LLIIIZ;
        if (view != null) {
            view.setVisibility(0);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LLIIIJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.setVisibility(8);
        }
        C109544Rq c109544Rq = this.LLIIJLIL;
        DynamicInfoComponent dynamicInfoComponent = this.LLIIL;
        if (dynamicInfoComponent != null) {
            num = AnonymousClass391.LIZJ(dynamicInfoComponent.defaultWidth);
        } else {
            num = null;
        }
        DynamicInfoComponent dynamicInfoComponent2 = this.LLIIL;
        if (dynamicInfoComponent2 != null) {
            num2 = AnonymousClass391.LIZJ(dynamicInfoComponent2.defaultHeight);
        } else {
            num2 = null;
        }
        OSZ LIZ = C37240EjU.LIZ(c109544Rq, dynamicInfoComponent, num, num2);
        View view2 = this.LLIIIZ;
        if (view2 != null) {
            AnonymousClass636.LJIIZILJ(view2, (Integer) LIZ.getFirst(), (Integer) LIZ.getSecond());
        }
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZ(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    @Override // X.AbstractC1041546x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJIZL() {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.lynxcard.DynamicCardViewHolder.LJJJJIZL():void");
    }

    public static void n0(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        Object obj;
        SparkContext sparkContext;
        SparkContext sparkContext2;
        IMSparkContext iMSparkContext;
        VNS vns;
        LynxViewClient lynxViewClient;
        IMSparkContext iMSparkContext2;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            obj = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
        } else {
            obj = null;
        }
        if ((obj instanceof C60726NsQ) && (vns = (VNS) obj) != null) {
            SparkContext sparkContext3 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
            if ((sparkContext3 instanceof IMSparkContext) && (iMSparkContext2 = (IMSparkContext) sparkContext3) != null) {
                lynxViewClient = iMSparkContext2.lynxViewClient;
            } else {
                lynxViewClient = null;
            }
            vns.removeLynxViewClient(lynxViewClient);
        } else if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null) {
            sparkContext = null;
            if ((sparkContext instanceof IMSparkContext) && (iMSparkContext = (IMSparkContext) sparkContext) != null) {
                iMSparkContext.lynxViewClient = null;
            }
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null && (sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext()) != null) {
                sparkContext2.LJIIIZ(AbstractC60815Ntr.class);
                sparkContext2.LJIIIZ(AbstractC60811Ntn.class);
                sparkContext2.LJIIIZ(InterfaceC60814Ntq.class);
                return;
            }
        }
        sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
        if (sparkContext instanceof IMSparkContext) {
            iMSparkContext.lynxViewClient = null;
        }
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicCardViewHolder(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        this.LLIIJI = "";
        this.LLIILII = new C61171Nzb();
        if (!C37240EjU.LIZ) {
            C35911E7n reUseConfig = (C35911E7n) C37240EjU.LIZLLL.getValue();
            o.LJIIIZ(reUseConfig, "reUseConfig");
            if (reUseConfig.LIZ) {
                C35915E7r.LIZ().put(C60797NtZ.LIZ(reUseConfig.LIZLLL), reUseConfig);
            }
        } else {
            C37240EjU.LIZ = true;
        }
        this.LLIIIL = (C74291TDr) itemView.findViewById(R.id.fkl);
        this.LLIIIZ = itemView.findViewById(R.id.d4a);
        this.LLIILZL = new OHE(this);
        this.LLIIZ = new IDLListenerS197S0100000_10(this, 6);
    }

    @Override // X.AbstractC1041546x
    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        C74291TDr c74291TDr;
        o.LJIIIZ(msg, "msg");
        C4AH c4ah = c49v.LIZ;
        if (c4ah != null && (c74291TDr = this.LLIIIL) != null) {
            c74291TDr.LIZ(c4ah.LJLIL, c4ah.LJLILLLLZI, c4ah.LJLJJI, c4ah.LJLJI);
        }
        C74291TDr c74291TDr2 = this.LLIIIL;
        if (c74291TDr2 == null) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        C77413UZt.LJFF(gradientDrawable, new C49V(c49v.LIZ, C1042447g.LJLIL, c49v.LIZJ));
        c74291TDr2.setBackground(gradientDrawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0530, code lost:
    
        if (X.C35915E7r.LIZJ(r0, r5) == true) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x054f, code lost:
    
        if (r1 != null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0556, code lost:
    
        if (r4 != null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0581, code lost:
    
        if (r4 != null) goto L299;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04d4  */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v127, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v128 */
    /* JADX WARN: Type inference failed for: r0v129, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v131, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v194 */
    /* JADX WARN: Type inference failed for: r0v195 */
    /* JADX WARN: Type inference failed for: r0v196 */
    /* JADX WARN: Type inference failed for: r0v197 */
    /* JADX WARN: Type inference failed for: r0v198 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v35, types: [X.TDr, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [X.NtS] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r6v29, types: [X.7au] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Map] */
    @Override // X.AnonymousClass461
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(X.C109544Rq r26, X.C109544Rq r27, com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate r28, int r29) {
        /*
            Method dump skipped, instructions count: 1433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.lynxcard.DynamicCardViewHolder.m0(X.4Rq, X.4Rq, com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate, int):void");
    }
}
