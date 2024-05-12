package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C145995oB;
import X.C26227ARb;
import X.C29901Fi;
import X.C34K;
import X.C45574Huc;
import X.C45584Hum;
import X.C5QW;
import X.C60903NvH;
import X.FMX;
import X.InterfaceC61312at;
import X.InterfaceC65784Pro;
import X.UC0;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS60S1100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ChooseMediaViewModel extends BaseJediViewModel<ChooseMediaState> {
    public boolean LJLJLLL;
    public boolean LJLL;
    public MyMediaModel LJLLI;
    public int LJLLJ;
    public final ArrayList<MyMediaModel> LJLJJLL = new ArrayList<>();
    public final ArrayList<MyMediaModel> LJLJL = new ArrayList<>();
    public final ArrayList<MyMediaModel> LJLJLJ = new ArrayList<>();
    public final C45584Hum<String> LJLLILLLL = new C45584Hum<>();
    public final C29901Fi LJLLL = new C29901Fi();
    public final C29901Fi LJLLLL = new C29901Fi();

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new ChooseMediaState(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -1, 7, null);
    }

    public final void Mv0(long j) {
        if (j <= 0) {
            return;
        }
        Iterator<MyMediaModel> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            MyMediaModel next = it.next();
            next.canClip = true;
            next.clipDuration = j;
        }
        Iterator<MyMediaModel> it2 = this.LJLJL.iterator();
        while (it2.hasNext()) {
            MyMediaModel next2 = it2.next();
            next2.canClip = true;
            next2.clipDuration = j;
        }
    }

    public final void Nv0(MyMediaModel media) {
        o.LJIIIZ(media, "media");
        if (media.libraryState.isSucceed() || media.libraryState.isLoading()) {
            return;
        }
        setState(new AqS173S0100000_7(media, 117));
    }

    public final void Ov0(MyMediaModel model) {
        o.LJIIIZ(model, "model");
        Iterator<MyMediaModel> it = this.LJLJLJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MyMediaModel next = it.next();
            if (o.LJ(next.id, model.id)) {
                next.startTime = model.startTime;
                next.endTime = model.endTime;
                break;
            }
        }
        Iterator<MyMediaModel> it2 = this.LJLJL.iterator();
        while (it2.hasNext()) {
            MyMediaModel next2 = it2.next();
            if (o.LJ(next2.id, model.id)) {
                next2.startTime = model.startTime;
                next2.endTime = model.endTime;
                return;
            }
        }
    }

    public final void Pv0(MyMediaModel myMediaModel) {
        setState(new AqS173S0100000_7(myMediaModel, 118));
    }

    public final void Qv0(ClosingChooseMediaPageState closingChooseMediaPageState) {
        o.LJIIIZ(closingChooseMediaPageState, "closingChooseMediaPageState");
        setState(new AqS173S0100000_7(closingChooseMediaPageState, 119));
    }

    public final void Rv0(ArrayList<MyMediaModel> arrayList) {
        setState(new AqS173S0100000_7((ArrayList) arrayList, (ArrayList<MyMediaModel>) LiveTryModeCountDownThresholdSetting.DEFAULT));
    }

    public final void Sv0(OpeningChooseMediaPageState openingChooseMediaPageState) {
        o.LJIIIZ(openingChooseMediaPageState, "openingChooseMediaPageState");
        setState(new AqS173S0100000_7(openingChooseMediaPageState, 121));
    }

    public final void Uv0(String str, boolean z) {
        C34K c34k = new C34K();
        c34k.element = z;
        setState(new AqS60S1100000_7(str, c34k, 2));
    }

    public static void Tv0(Activity activity, long j, InterfaceC65784Pro interfaceC65784Pro) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        Bundle LIZLLL = C60903NvH.LJIIJJI().LJIL().LIZLLL(activity);
        C26227ARb c26227ARb = new C26227ARb(activity);
        c26227ARb.LJFF(activity.getResources().getString(R.string.g4e));
        c26227ARb.LIZIZ(activity.getResources().getString(R.string.g4d));
        UC0.LIZJ(c26227ARb, new C45574Huc(activity, interfaceC65784Pro, LIZLLL, j));
        c26227ARb.LJI().LIZLLL();
        C145995oB LJI = C5QW.LJI(LIZLLL, String.valueOf(j));
        if (LJI == null) {
            return;
        }
        FMX.LJIIL("choose_shorter_video_popup_show", LJI.LIZ);
    }
}
