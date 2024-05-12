package X;

import Y.AObserverS70S0100000_2;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarState;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.618, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass618 {
    public final FTCEditToolbarViewModel LIZ;
    public final C73318Sq2 LIZIZ;
    public final List<OSZ<LiveData<Object>, Observer<Object>>> LIZJ;
    public final AbstractC42651GoZ LIZLLL;

    public final void LIZ() {
        this.LIZIZ.LIZLLL();
        for (OSZ<LiveData<Object>, Observer<Object>> osz : this.LIZJ) {
            osz.getFirst().removeObserver(osz.getSecond());
        }
        ((ArrayList) this.LIZJ).clear();
    }

    public final void LIZJ(java.util.Map<Integer, ? extends View> map) {
        o.LJIIIZ(map, "map");
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData<Boolean> se = this.LIZ.se(intValue);
            if (se != null) {
                LJFF(se, this.LIZLLL, new AObserverS70S0100000_2(view, 5));
            }
        }
    }

    public final void LIZLLL(java.util.Map<Integer, ? extends View> map) {
        o.LJIIIZ(map, "map");
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData<Boolean> Ok0 = this.LIZ.Ok0(intValue);
            if (Ok0 != null) {
                LJFF(Ok0, this.LIZLLL, new AObserverS70S0100000_2(view, 6));
            }
        }
    }

    public final void LJ(java.util.Map<Integer, ? extends View> map) {
        o.LJIIIZ(map, "map");
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData<Boolean> Um0 = this.LIZ.Um0(intValue);
            if (Um0 != null) {
                LJFF(Um0, this.LIZLLL, new AObserverS70S0100000_2(view, 7));
            }
        }
    }

    public final void LIZIZ(InterfaceC143795kd interfaceC143795kd, C1536261e c1536261e) {
        interfaceC143795kd.selectNonNullSubscribe(this.LIZ, new TBT() { // from class: X.61A
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FTCEditToolbarState) obj).getChooseMusicText();
            }
        }, new C73165SnZ<>(), new AqS184S0100000_2(c1536261e, 9));
        interfaceC143795kd.selectNonNullSubscribe(this.LIZ, new TBT() { // from class: X.619
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FTCEditToolbarState) obj).getChooseMusicRawIconRes();
            }
        }, new C73165SnZ<>(), new AqS184S0100000_2(c1536261e, 10));
    }

    public final void LJFF(LiveData liveData, AbstractC42651GoZ abstractC42651GoZ, Observer observer) {
        liveData.observe(abstractC42651GoZ, observer);
        ((ArrayList) this.LIZJ).add(new OSZ(liveData, observer));
    }

    public AnonymousClass618(ActivityC45651qj activityC45651qj, VideoPublishEditModel publishEditModel, FTCEditToolbarViewModel editToolbarViewModel, WMH wmh) {
        o.LJIIIZ(publishEditModel, "publishEditModel");
        o.LJIIIZ(editToolbarViewModel, "editToolbarViewModel");
        this.LIZ = editToolbarViewModel;
        this.LIZIZ = new C73318Sq2();
        this.LIZJ = new ArrayList();
        this.LIZLLL = C86793Y4n.LJJIJIIJIL(wmh);
    }
}
