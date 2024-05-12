package com.bytedance.android.live.pin.widget;

import X.C0NB;
import X.C259710f;
import X.C31359CSl;
import X.C31411CUl;
import X.C48459J0d;
import X.C5H3;
import X.C74074T5i;
import X.C78996UzQ;
import X.CN1;
import X.CQQ;
import X.CRD;
import X.CRX;
import X.CS5;
import X.CS7;
import X.CSH;
import X.CSK;
import X.CSY;
import X.CUG;
import X.CUH;
import X.CUK;
import X.CUL;
import X.CUN;
import X.CUV;
import X.CUX;
import X.InterfaceC30442Bx8;
import X.InterfaceC31407CUh;
import X.X1D;
import Y.AObserverS73S0100000_5;
import android.animation.Animator;
import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ViewSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0200000_5;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class BaseCommentPinnedWidget extends IPublicScreenContextWidget implements InterfaceC31407CUh {
    public CUG LJLILLLLZI;
    public CUK LJLJI;
    public PinMessageViewModel LJLJJL;
    public CUL<? extends CRD, CSH<? extends CRD>> LJLJJLL;
    public CUL<? extends CRD, CSH<? extends CRD>> LJLJL;
    public CUN LJLJLLL;
    public int LJLZ;
    public AObserverS73S0100000_5 LJZ;
    public AObserverS73S0100000_5 LJZI;
    public final Map<Class<? extends CSH<? extends CRD>>, List<CUL<? extends CRD, ? extends CSH<? extends CRD>>>> LJLJJI = new LinkedHashMap();
    public final C5H3 LJLJLJ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 38));
    public final C5H3 LJLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 43));
    public final C5H3 LJLLI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 42));
    public final C5H3 LJLLILLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 41));
    public final C5H3 LJLLJ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 44));
    public final C5H3 LJLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 40));
    public final long LJLLLL = 400;
    public final long LJLLLLLL = 200;

    public abstract CUK LJZI();

    public abstract CUG LJZL();

    public abstract int LLFZ();

    public abstract CUN LLII();

    public abstract void LLIIII();

    public void LLIIIILZ(CUX cux) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final CUV LJZ() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-animatedExpansionLayout>(...)");
        return (CUV) value;
    }

    public final Animator LL() {
        return (Animator) this.LJLLL.getValue();
    }

    public final ViewSwitcher LLF() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-indicatorGradientBackground>(...)");
        return (ViewSwitcher) value;
    }

    public final View LLFF() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-indicatorGuideline>(...)");
        return (View) value;
    }

    public final ConstraintLayout LLFFF() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-indicatorLayout>(...)");
        return (ConstraintLayout) value;
    }

    public final ViewSwitcher LLFII() {
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-indicatorTextArrowLayout>(...)");
        return (ViewSwitcher) value;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        CSH<? extends CRD> csh;
        CUH cuh;
        View view;
        ViewPropertyAnimator animate;
        View view2;
        ViewPropertyAnimator animate2;
        PinMessageViewModel pinMessageViewModel;
        MutableLiveData<CUX> mutableLiveData;
        MutableLiveData mutableLiveData2;
        AObserverS73S0100000_5 aObserverS73S0100000_5 = this.LJZ;
        if (aObserverS73S0100000_5 != null) {
            PinMessageViewModel pinMessageViewModel2 = this.LJLJJL;
            if (pinMessageViewModel2 != null && (mutableLiveData2 = pinMessageViewModel2.LJLJL) != null) {
                mutableLiveData2.removeObserver(aObserverS73S0100000_5);
            }
            this.LJLJJL = null;
        }
        AObserverS73S0100000_5 aObserverS73S0100000_52 = this.LJZI;
        if (aObserverS73S0100000_52 != null) {
            PinMessageViewModel pinMessageViewModel3 = this.LJLJJL;
            if (pinMessageViewModel3 != null && (mutableLiveData = pinMessageViewModel3.LJLJLJ) != null) {
                mutableLiveData.removeObserver(aObserverS73S0100000_52);
            }
            this.LJZI = null;
        }
        if (WatchMemoryLeakOpt.INSTANCE.settingValue() && (pinMessageViewModel = this.LJLJJL) != null) {
            pinMessageViewModel.LJLLLLLL = null;
        }
        CUK cuk = this.LJLJI;
        if (cuk != null) {
            cuk.onHide();
        }
        CUG cug = this.LJLILLLLZI;
        if (cug != null) {
            cug.onHide();
        }
        CUK cuk2 = this.LJLJI;
        if (cuk2 != null) {
            cuk2.LJLIL = null;
        }
        CUG cug2 = this.LJLILLLLZI;
        if (cug2 != null) {
            cug2.LJLIL = null;
        }
        CUL<? extends CRD, CSH<? extends CRD>> cul = this.LJLJL;
        if (cul != null && (view2 = cul.itemView) != null && (animate2 = view2.animate()) != null) {
            animate2.cancel();
        }
        CUL<? extends CRD, CSH<? extends CRD>> cul2 = this.LJLJJLL;
        if (cul2 != null && (view = cul2.itemView) != null && (animate = view.animate()) != null) {
            animate.cancel();
        }
        CUL<? extends CRD, CSH<? extends CRD>> cul3 = this.LJLJJLL;
        if ((cul3 instanceof CUH) && (cuh = (CUH) cul3) != null) {
            cuh.onHide();
        }
        CUL<? extends CRD, CSH<? extends CRD>> cul4 = this.LJLJJLL;
        if (cul4 != null) {
            csh = cul4.LJLILLLLZI;
        } else {
            csh = null;
        }
        LLIIIJ(csh, cul4);
        if (LL().isRunning()) {
            LL().cancel();
        }
        LLF().reset();
        LLFII().reset();
        LLFFF().setVisibility(8);
        LLFF().setVisibility(8);
        this.LJLIL = null;
        CUN cun = this.LJLJLLL;
        if (cun != null) {
            ArrayList<Class<? extends CSH<? extends CRD>>> arrayList = cun.LJLJJI;
            Iterator<Class<? extends CSH<? extends CRD>>> it = arrayList.iterator();
            while (it.hasNext()) {
                ((C31411CUl) cun.LJLILLLLZI).LIZJ(it.next());
            }
            arrayList.clear();
            return;
        }
        o.LJIJI("pinnedAdapter");
        throw null;
    }

    public final void LLIIIL() {
        boolean z;
        CUV LJZ = LJZ();
        if (this.LJLZ == 0) {
            z = true;
        } else {
            z = false;
        }
        LJZ.setHeightAnimationEnabled(z);
    }

    public final void LJLZ(C74074T5i c74074T5i) {
        c74074T5i.setAnimStartCallback(new AqS155S0100000_5(this, 39));
        c74074T5i.setAnimEndCallback(new AqS152S0200000_5(c74074T5i, this, 4));
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C259710f.LIZ.LIZJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        MutableLiveData<CUX> mutableLiveData;
        MutableLiveData mutableLiveData2;
        CQQ cqq;
        boolean booleanValue;
        String str;
        User owner;
        if (this.dataChannel == null) {
            return;
        }
        LLIIII();
        CUN LLII = LLII();
        LLII.LJLJI = this.LJLIL;
        Iterator<CRX> it = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).jh0().iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(LLII);
        }
        this.LJLJLLL = LLII;
        PinMessageViewModel pinMessageViewModel = this.LJLJJL;
        if (pinMessageViewModel != null) {
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            pinMessageViewModel.LJLLLLLL = dataChannel;
            Room room = (Room) dataChannel.kv0(RoomChannel.class);
            Long l = null;
            if (room != null) {
                l = Long.valueOf(room.getId());
            }
            pinMessageViewModel.LJLLLL = l;
            if (l != null) {
                long longValue = l.longValue();
                CS5.LIZ.getClass();
                LongSparseArray<List<CSY>> longSparseArray = CS5.LJI;
                List<CSY> list = longSparseArray.get(longValue);
                if (list == null) {
                    list = new ArrayList<>();
                    longSparseArray.put(longValue, list);
                }
                if (!list.contains(pinMessageViewModel)) {
                    list.add(pinMessageViewModel);
                }
                LongSparseArray<List<CSK>> longSparseArray2 = CS7.LIZIZ;
                List<CSK> list2 = longSparseArray2.get(longValue);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    longSparseArray2.put(longValue, list2);
                }
                if (!list2.contains(pinMessageViewModel)) {
                    list2.add(pinMessageViewModel);
                }
            }
            if (pinMessageViewModel.LJLLI == 1 && (cqq = pinMessageViewModel.LJLIL) != null) {
                if (!cqq.LJFF) {
                    C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.w0;
                    if (!c48459J0d.LIZJ().booleanValue()) {
                        C48459J0d<Boolean> c48459J0d2 = InterfaceC30442Bx8.u0;
                        Boolean bool = Boolean.TRUE;
                        c48459J0d2.LIZ(bool);
                        c48459J0d.LIZ(bool);
                    }
                }
                if (cqq.LJFF) {
                    C48459J0d<Boolean> c48459J0d3 = InterfaceC30442Bx8.z0;
                    if (!c48459J0d3.LIZJ().booleanValue()) {
                        C48459J0d<Boolean> c48459J0d4 = InterfaceC30442Bx8.x0;
                        Boolean bool2 = Boolean.TRUE;
                        c48459J0d4.LIZ(bool2);
                        c48459J0d3.LIZ(bool2);
                    }
                }
                if (cqq.LJFF) {
                    Boolean LIZJ = InterfaceC30442Bx8.x0.LIZJ();
                    o.LJIIIIZZ(LIZJ, "{\n                    Li…R.value\n                }");
                    booleanValue = LIZJ.booleanValue();
                } else {
                    Boolean LIZJ2 = InterfaceC30442Bx8.u0.LIZJ();
                    o.LJIIIIZZ(LIZJ2, "{\n                    Li…E.value\n                }");
                    booleanValue = LIZJ2.booleanValue();
                }
                pinMessageViewModel.LJLJLLL = booleanValue;
                LifecycleOwner lifecycleOwner = cqq.LIZIZ;
                long j = cqq.LJIIJJI;
                long j2 = cqq.LJIILLIIL;
                Room room2 = cqq.LJI;
                if (room2 == null || (owner = room2.getOwner()) == null || (str = owner.getSecUid()) == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                pinMessageViewModel.LJLLILLLL = new C31359CSl(lifecycleOwner, j, j2, str, cqq.LJFF);
            }
        }
        AObserverS73S0100000_5 aObserverS73S0100000_5 = new AObserverS73S0100000_5(this, 10);
        PinMessageViewModel pinMessageViewModel2 = this.LJLJJL;
        if (pinMessageViewModel2 != null && (mutableLiveData2 = pinMessageViewModel2.LJLJL) != null) {
            mutableLiveData2.observeForever(aObserverS73S0100000_5);
        }
        this.LJZ = aObserverS73S0100000_5;
        AObserverS73S0100000_5 aObserverS73S0100000_52 = new AObserverS73S0100000_5(this, 11);
        PinMessageViewModel pinMessageViewModel3 = this.LJLJJL;
        if (pinMessageViewModel3 != null && (mutableLiveData = pinMessageViewModel3.LJLJLJ) != null) {
            mutableLiveData.observeForever(aObserverS73S0100000_52);
        }
        this.LJZI = aObserverS73S0100000_52;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLIIIJ(CSH<? extends CRD> csh, CUL<? extends CRD, CSH<? extends CRD>> cul) {
        boolean z;
        if (csh == null || cul == null) {
            return;
        }
        List list = (List) ((LinkedHashMap) this.LJLJJI).get(csh.getClass());
        if (list == null) {
            list = new ArrayList();
            this.LJLJJI.put(csh.getClass(), list);
        }
        cul.LJLIL = null;
        if (!list.contains(cul)) {
            list.add(cul);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Recycled, Visibility = ");
        if (cul.itemView.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(' ');
        LIZ.append(this.LJLJJI);
        C0NB.LJ("PinnedWidget", X1D.LIZIZ(LIZ));
    }
}
