package X;

import Y.AfS18S0210000_8;
import Y.AfS57S0200000_8;
import Y.IDhS4S1000000_8;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.lynx.core.model.DynamicData;
import com.ss.android.ugc.aweme.lynx.spark.core.ui.SearchBaseSparkView;
import com.ss.android.ugc.aweme.vision.PhotoSearchFragment;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jxj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50863Jxj extends SearchBaseSparkView {
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJIIJ;
    public boolean LJIIJJI;
    public final C50858Jxe LJIIL;
    public final C50857Jxd LJIILIIL;

    @Override // X.KFY
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ() {
        return this.LJIIJ;
    }

    public C50863Jxj(Context context, PhotoSearchFragment photoSearchFragment) {
        super(context, photoSearchFragment);
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext sparkContext = new SparkContext();
        c40342FsQ.getClass();
        this.LJIIJ = C40343FsR.LIZ(C40342FsQ.LIZ(context, sparkContext));
        this.LJIIL = new C50858Jxe();
        this.LJIILIIL = new C50857Jxd(this);
    }

    @Override // X.KFY
    public final void LJ(InterfaceC88472Yns interfaceC88472Yns, List list) {
        LJIIL(((DynamicData) ListProtector.get(list, 0)).dynamicPatch, interfaceC88472Yns, null);
    }

    public final void LJIILIIL(DynamicPatch dynamicData, boolean z) {
        AbstractC60800Ntc abstractC60800Ntc;
        VNS vns;
        o.LJIIIZ(dynamicData, "dynamicData");
        if (o.LJ(dynamicData, this.LJIIIZ)) {
            Object kitView = this.LJIIJ.getKitView();
            if ((kitView instanceof VNS) && (vns = (VNS) kitView) != null) {
                vns.onEnterForeground();
            }
            InterfaceC60761Nsz kitView2 = this.LJIIJ.getKitView();
            if (kitView2 != null && (abstractC60800Ntc = this.LIZLLL) != null) {
                abstractC60800Ntc.LJJJJJ(kitView2);
                return;
            }
            return;
        }
        LJIIJ();
        C1HQ c1hq = new C1HQ();
        LJI(c1hq);
        this.LJIIIIZZ.add(AbstractC73745Swv.LJFF(c1hq).LJI(new C50862Jxi(z, dynamicData, c1hq)).LJIILJJIL(T16.LIZIZ).LJII(C73969T1h.LIZIZ()).LJIIIZ(new AfS18S0210000_8(this, dynamicData, z, 1)));
    }

    public final void LJIILJJIL(DynamicPatch dynamicData, String str) {
        AbstractC60800Ntc abstractC60800Ntc;
        VNS vns;
        o.LJIIIZ(dynamicData, "dynamicData");
        if (o.LJ(dynamicData, this.LJIIIZ)) {
            Object kitView = this.LJIIJ.getKitView();
            if ((kitView instanceof VNS) && (vns = (VNS) kitView) != null) {
                vns.onEnterForeground();
            }
            InterfaceC60761Nsz kitView2 = this.LJIIJ.getKitView();
            if (kitView2 != null && (abstractC60800Ntc = this.LIZLLL) != null) {
                abstractC60800Ntc.LJJJJJ(kitView2);
                return;
            }
            return;
        }
        LJIIJ();
        this.LJIIIIZZ.add(AbstractC73745Swv.LJFF(new C1HQ()).LJI(new IDhS4S1000000_8(str, 0)).LJIILJJIL(T16.LIZIZ).LJII(C73969T1h.LIZIZ()).LJIIIZ(new AfS57S0200000_8(this, dynamicData, 6)));
    }

    public final void LJIILL(DynamicPatch dynamicData, String str) {
        AbstractC60800Ntc abstractC60800Ntc;
        VNS vns;
        o.LJIIIZ(dynamicData, "dynamicData");
        if (o.LJ(dynamicData, this.LJIIIZ)) {
            Object kitView = this.LJIIJ.getKitView();
            if ((kitView instanceof VNS) && (vns = (VNS) kitView) != null) {
                vns.onEnterForeground();
            }
            InterfaceC60761Nsz kitView2 = this.LJIIJ.getKitView();
            if (kitView2 != null && (abstractC60800Ntc = this.LIZLLL) != null) {
                abstractC60800Ntc.LJJJJJ(kitView2);
                return;
            }
            return;
        }
        LJIIJ();
        if (((Boolean) C51272KAi.LIZJ.getValue()).booleanValue()) {
            this.LJIIIIZZ.add(AbstractC73745Swv.LJFF(new C1HQ()).LJI(new IDhS4S1000000_8(str, 1)).LJIILJJIL(T16.LIZIZ).LJII(C73969T1h.LIZIZ()).LJIIIZ(new AfS57S0200000_8(this, dynamicData, 7)));
            return;
        }
        TemplateData LJFF = TemplateData.LJFF(str);
        LJFF.LIZLLL = "allSearchDataProcess";
        this.LJIIIZ = dynamicData;
        this.LJIIL.LIZ(dynamicData);
        LJIILLIIL(dynamicData, LJFF);
    }

    public final void LJIILLIIL(DynamicPatch dynamicPatch, TemplateData templateData) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJIIJ;
        String str = dynamicPatch.schema;
        o.LJIIIIZZ(str, "dynamicData.schema");
        C50859Jxf.LIZIZ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, str, templateData, this.LJIILIIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x012a, code lost:
    
        if (r1.isFinishing() == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r14, com.lynx.tasm.TemplateData r15) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50863Jxj.LJIIZILJ(com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch, com.lynx.tasm.TemplateData):void");
    }

    @Override // com.ss.android.ugc.aweme.lynx.spark.core.ui.SearchBaseSparkView, X.KFY
    public final void LJFF(DynamicPatch dynamicData, java.util.Map<String, ? extends Object> map, boolean z) {
        VNS vns;
        o.LJIIIZ(dynamicData, "dynamicData");
        if (o.LJ(dynamicData, this.LJIIIZ)) {
            Object kitView = this.LJIIJ.getKitView();
            if ((kitView instanceof VNS) && (vns = (VNS) kitView) != null) {
                vns.onEnterForeground();
                return;
            }
            return;
        }
        LJIIJ();
        C1HQ c1hq = new C1HQ();
        if (map != null) {
            c1hq.putAll(map);
        }
        LJI(c1hq);
        this.LJIIIIZZ.add(AbstractC73745Swv.LJFF(c1hq).LJI(C50866Jxm.LJLIL).LJIILJJIL(T16.LIZIZ).LJII(C73969T1h.LIZIZ()).LJIIIZ(new AfS18S0210000_8(this, dynamicData, z, 0)));
    }

    public final void LJIIL(DynamicPatch dynamicData, InterfaceC88472Yns<? super SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, C76800UCe> interfaceC88472Yns, java.util.Map<String, ? extends Object> map) {
        o.LJIIIZ(dynamicData, "dynamicData");
        C51396KFc.LIZIZ(this, dynamicData, map, 4);
    }
}
