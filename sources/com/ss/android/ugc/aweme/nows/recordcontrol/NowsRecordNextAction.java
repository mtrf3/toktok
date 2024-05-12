package com.ss.android.ugc.aweme.nows.recordcontrol;

import X.C43598H9e;
import X.C43832HIe;
import X.C44172HVg;
import X.C44735Hh5;
import X.C46156I9o;
import X.IA5;
import X.InterfaceC43847HIt;
import X.WXN;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class NowsRecordNextAction implements GenericLifecycleObserver, IA5 {
    public final ShortVideoContext LJLIL;
    public final WXN LJLILLLLZI;

    @Override // X.IA5
    public final void LIZIZ(InterfaceC43847HIt interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.IA5
    public final void LIZ(C46156I9o event) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        o.LJIIIZ(event, "event");
        MultiEditVideoStatusRecordData LJ = C43832HIe.LJ(this.LJLIL, "");
        if (!o.LJ(this.LJLIL.shootWay, "now") && LJ != null && (multiEditVideoRecordData = LJ.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                C44172HVg.LJIILJJIL.LIZ();
                multiEditVideoSegmentRecordData.height = (int) (r0.LIZ / 0.75f);
                C44735Hh5 c44735Hh5 = C44172HVg.LJIILJJIL;
                c44735Hh5.LIZ();
                multiEditVideoSegmentRecordData.width = c44735Hh5.LIZ;
            }
        }
        this.LJLILLLLZI.Lw(LJ);
    }

    public NowsRecordNextAction(ShortVideoContext shortVideoContext, WXN wxn, C43598H9e recordComponentModel) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(recordComponentModel, "recordComponentModel");
        this.LJLIL = shortVideoContext;
        this.LJLILLLLZI = wxn;
    }
}
