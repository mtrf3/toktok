package com.bytedance.android.livesdk.module;

import X.AbstractC40151FpL;
import X.C29706BlG;
import X.C29707BlH;
import X.C29932Bou;
import X.C39894FlC;
import X.C40116Fom;
import X.C40191Fpz;
import X.C40192Fq0;
import X.C40342FsQ;
import X.C40343FsR;
import X.CN1;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveSparkContainerOptimizeSetting;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class LiveSparkService implements ILiveSparkService {
    public final CopyOnWriteArrayList<AbstractC40151FpL> LJLIL = new CopyOnWriteArrayList<>();

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.browser.ILiveSparkService
    public final void gi0() {
        if (!C29706BlG.LIZ) {
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            C40191Fpz c40191Fpz = new C40191Fpz();
            c40342FsQ.getClass();
            C40343FsR.LIZLLL.add(c40191Fpz);
            C40342FsQ.LJI(new C40192Fq0());
            C29706BlG.LIZ = true;
        }
    }

    @Override // com.bytedance.android.live.browser.ILiveSparkService
    public final void tS() {
        C39894FlC.LIZIZ();
    }

    @Override // com.bytedance.android.live.browser.ILiveSparkService
    public final void Iu0(SparkContext sparkContext) {
        o.LJIIIZ(sparkContext, "sparkContext");
        sparkContext.bid = "live";
        ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).le();
        sparkContext.vaid = "99999";
        C29707BlH.LIZ(sparkContext);
        C29932Bou.LIZ(sparkContext);
        if (LiveSparkContainerOptimizeSetting.INSTANCE.getValue()) {
            sparkContext.LJJIIJ("enable_lynx_builder_opt", "1");
            sparkContext.LJJIIJ("enable_spark_live_opt", "1");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x010b, code lost:
    
        if (X.C31886CfK.LJFF().contains(r1) == false) goto L41;
     */
    @Override // com.bytedance.android.live.browser.ILiveSparkService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y90(com.bytedance.hybrid.spark.SparkContext r12) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.module.LiveSparkService.Y90(com.bytedance.hybrid.spark.SparkContext):void");
    }

    @Override // com.bytedance.android.live.browser.ILiveSparkService
    public final void aH(C40116Fom c40116Fom) {
        if (!this.LJLIL.contains(c40116Fom)) {
            this.LJLIL.add(c40116Fom);
        }
    }
}
