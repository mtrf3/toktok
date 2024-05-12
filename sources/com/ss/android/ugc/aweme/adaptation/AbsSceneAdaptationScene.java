package com.ss.android.ugc.aweme.adaptation;

import X.AbstractC42651GoZ;
import X.C43212Gxc;
import X.C79045V0n;
import X.C80234VeI;
import X.G90;
import X.GBP;
import X.GGS;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS10S0202000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class AbsSceneAdaptationScene extends AbstractC42651GoZ implements G90 {
    public String LLL() {
        return null;
    }

    public C43212Gxc LLJZIJLIL() {
        GGS.LIZ.getClass();
        return GGS.LJFF;
    }

    @Override // X.G90
    public Analysis getAnalysis() {
        String LLL = LLL();
        if (LLL != null && LLL.length() > 0) {
            Analysis analysis = new Analysis();
            analysis.setLabelName(LLL());
            return analysis;
        }
        return null;
    }

    @Override // X.AbstractC42651GoZ, X.WM7
    public void onActivityCreated(Bundle bundle) {
        Activity activity;
        Window window;
        int i;
        super.onActivityCreated(bundle);
        if (this.LJLIL.LJFF) {
            C43212Gxc LLJZIJLIL = LLJZIJLIL();
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            Integer LJI = C79045V0n.LJI(LLJZIJLIL.LJLJLJ, requireSceneContext);
            int i2 = 0;
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            Context requireSceneContext2 = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
            Integer LJI2 = C79045V0n.LJI(LLJZIJLIL.LJLJLLL, requireSceneContext2);
            if (LJI2 != null) {
                i2 = LJI2.intValue();
            }
            ICreativeSAAService LIZ = SAAService.LIZ();
            Activity requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            LIZ.invokeMethodsSafely(requireActivity, new AqS10S0202000_7(this, LLJZIJLIL, i, i2, 0));
            Window window2 = requireActivity().getWindow();
            window2.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            window2.getDecorView().setSystemUiVisibility(window2.getDecorView().getSystemUiVisibility() | 1024);
            ((C80234VeI) requireViewById(R.id.jbo)).setStatusBarBackgroundColor(i);
        } else {
            ICreativeSAAService LIZ2 = SAAService.LIZ();
            Activity requireActivity2 = requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            LIZ2.invokeMethodsSafely(requireActivity2, new AqS157S0100000_7(this, 53));
        }
        if (GBP.LIZ() && (activity = this.mActivity) != null && (window = activity.getWindow()) != null) {
            window.addFlags(128);
        }
        getLifecycle().addObserver(new AnalysisActivityComponent(this, this));
    }

    @Override // X.WM7
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
    }
}
