package X;

import Y.AObserverS70S0100000_2;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.60B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60B {
    public final ActivityC45651qj LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final WMH LIZJ;
    public final InterfaceC145325n6 LIZLLL;
    public final InterfaceC153275zv LJ;
    public final C73318Sq2 LJFF;
    public final List<OSZ<LiveData<Object>, Observer<Object>>> LJI;
    public InterfaceC82683Wch LJII;
    public final AbstractC42651GoZ LJIIIIZZ;
    public final boolean LJIIIZ;

    public final void LIZ() {
        this.LJFF.LIZLLL();
        for (OSZ<LiveData<Object>, Observer<Object>> osz : this.LJI) {
            osz.getFirst().removeObserver(osz.getSecond());
        }
        ((ArrayList) this.LJI).clear();
    }

    public final void LIZIZ(View view) {
        if (!C78934UyQ.LJLIL.getMusicService().LJIILIIL()) {
            C78934UyQ.LJLIL.getMusicService().LJIL();
            C43014GuQ.LIZ.LJIIIZ(new C60E(view, this));
        }
    }

    public final void LIZLLL(java.util.Map<Integer, ? extends View> map) {
        o.LJIIIZ(map, "map");
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData<Boolean> se = this.LJ.se(intValue);
            if (se != null) {
                LJI(se, this.LJIIIIZZ, new AObserverS70S0100000_2(view, 207));
            }
        }
    }

    public final void LJ(java.util.Map<Integer, ? extends View> map) {
        o.LJIIIZ(map, "map");
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData<Boolean> Ok0 = this.LJ.Ok0(intValue);
            if (Ok0 != null) {
                LJI(Ok0, this.LJIIIIZZ, new AObserverS70S0100000_2(view, 208));
            }
        }
    }

    public final void LJFF(java.util.Map<Integer, ? extends View> map) {
        o.LJIIIZ(map, "map");
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData<Boolean> Um0 = this.LJ.Um0(intValue);
            if (Um0 != null) {
                LJI(Um0, this.LJIIIIZZ, new AObserverS70S0100000_2(view, 209));
            }
        }
    }

    public final void LIZJ(InterfaceC143795kd interfaceC143795kd, C1536261e c1536261e) {
        o.LJIIIZ(interfaceC143795kd, "<this>");
        this.LJ.uo0(interfaceC143795kd, new AqS168S0100000_2(c1536261e, 389));
        this.LJ.wc(interfaceC143795kd, new AqS168S0100000_2(c1536261e, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));
    }

    public final void LJI(LiveData liveData, AbstractC42651GoZ abstractC42651GoZ, Observer observer) {
        liveData.observe(abstractC42651GoZ, observer);
        ((ArrayList) this.LJI).add(new OSZ(liveData, observer));
    }

    public C60B(ActivityC45651qj activityC45651qj, VideoPublishEditModel publishEditModel, WMH wmh, InterfaceC145325n6 interfaceC145325n6, InterfaceC153275zv toolbarApi) {
        o.LJIIIZ(publishEditModel, "publishEditModel");
        o.LJIIIZ(toolbarApi, "toolbarApi");
        this.LIZ = activityC45651qj;
        this.LIZIZ = publishEditModel;
        this.LIZJ = wmh;
        this.LIZLLL = interfaceC145325n6;
        this.LJ = toolbarApi;
        this.LJFF = new C73318Sq2();
        this.LJI = new ArrayList();
        this.LJIIIIZZ = C86793Y4n.LJJIJIIJIL(wmh);
        this.LJIIIZ = true;
    }
}
