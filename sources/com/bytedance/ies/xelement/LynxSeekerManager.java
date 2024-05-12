package com.bytedance.ies.xelement;

import X.OWQ;
import X.VNU;
import X.VPD;
import android.content.Context;
import android.widget.AbsSeekBar;
import android.widget.ProgressBar;
import com.lynx.tasm.behavior.ui.LynxUI;
import kotlin.jvm.internal.IDqS435S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LynxSeekerManager extends LynxUI<OWQ> {
    public LynxSeekerManager(VNU vnu) {
        super(vnu);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final OWQ createView(Context context) {
        OWQ owq = new OWQ(context);
        owq.setStateReporter(new IDqS435S0100000_10(this, 6));
        return owq;
    }

    @VPD(name = "duration")
    public final void setDuration(int i) {
        T mView = this.mView;
        o.LJFF(mView, "mView");
        mView.setEnabled(true);
        T mView2 = this.mView;
        o.LJFF(mView2, "mView");
        ((AbsSeekBar) mView2).setMax(i);
    }

    @VPD(name = "currentDuration")
    public final void setProgress(int i) {
        T mView = this.mView;
        o.LJFF(mView, "mView");
        ((ProgressBar) mView).setProgress(i);
    }
}
