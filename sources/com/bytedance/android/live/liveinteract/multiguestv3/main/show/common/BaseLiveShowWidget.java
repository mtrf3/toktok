package com.bytedance.android.live.liveinteract.multiguestv3.main.show.common;

import X.C0NB;
import X.C1JD;
import X.C29306Beo;
import X.C40517FvF;
import X.C59994Ngc;
import X.C65232Piu;
import X.C72818Shy;
import X.C73546Sti;
import X.C74824TYe;
import X.C74838TYs;
import X.C75269TgP;
import X.C75270TgQ;
import X.C75271TgR;
import X.C770830u;
import X.C78842Uww;
import X.CN1;
import X.EnumC74778TWk;
import X.InterfaceC31781Cdd;
import X.TQA;
import X.U32;
import X.U35;
import X.V0Q;
import X.X1D;
import Y.AObserverS81S0100000_13;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowInitViewModelFixSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public abstract class BaseLiveShowWidget extends LiveWidget {
    public final Class<BaseLiveShowViewModel> LJLIL;
    public BaseLiveShowViewModel LJLILLLLZI;
    public C73546Sti LJLJI;
    public String LJLJJI;
    public Integer LJLJJL;
    public ShowListUser LJLJL;
    public int LJLJLJ;
    public ShowListUser LJLJLLL;
    public boolean LJLL;
    public String LJLJJLL = "user name";
    public final U32 LJLLI = new U32(this);
    public final AObserverS81S0100000_13 LJLLILLLL = new AObserverS81S0100000_13(this, 39);

    public static void LLFFF() {
        String str;
        Long l;
        Long LJIIJ;
        EnumC74778TWk LIZJ = C59994Ngc.LIZJ();
        JSONObject jSONObject = new JSONObject();
        U35 LIZ = TQA.LIZ();
        if (LIZ == null || (LJIIJ = LIZ.LJIIJ()) == null || (str = LJIIJ.toString()) == null) {
            str = "";
        }
        jSONObject.put("multiguest_liveshow_id", str);
        jSONObject.put("window_setting", C74824TYe.LJI(LIZJ).getSecond());
        jSONObject.put("layout_setting", C74824TYe.LJI(LIZJ).getFirst());
        C1JD.LJJIJL("live_show_banner_info", jSONObject, 4);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("sendLiveShowInfoEvent, showId: ");
        U35 LIZ3 = TQA.LIZ();
        Long l2 = null;
        if (LIZ3 != null) {
            l = LIZ3.LJIIJ();
        } else {
            l = null;
        }
        LIZ2.append(l);
        LIZ2.append(", window: ");
        LIZ2.append((String) C74824TYe.LJI(LIZJ).getSecond());
        LIZ2.append(", layout: ");
        LIZ2.append((String) C74824TYe.LJI(LIZJ).getFirst());
        C0NB.LIZIZ("BaseLiveShowWidget", X1D.LIZIZ(LIZ2));
        C74838TYs LJ = C74838TYs.LJ();
        U35 LIZ4 = TQA.LIZ();
        if (LIZ4 != null) {
            l2 = LIZ4.LJIIJ();
        }
        LJ.LJJIJLIJ = l2;
    }

    public abstract String LJZI(ShowListUser showListUser);

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void LJLZ() {
        LL(this.LJLJJI);
        C73546Sti c73546Sti = this.LJLJI;
        if (c73546Sti != null) {
            c73546Sti.dispose();
        }
        this.LJLJI = null;
        this.LJLJJI = null;
        BaseLiveShowViewModel baseLiveShowViewModel = this.LJLILLLLZI;
        if (baseLiveShowViewModel != null) {
            baseLiveShowViewModel.jv0("live-end-success");
        }
    }

    public final void LLF() {
        String str = this.LJLJJI;
        if (str != null) {
            LL(str);
            this.LJLJJI = null;
        }
        C73546Sti c73546Sti = this.LJLJI;
        if (c73546Sti != null) {
            c73546Sti.dispose();
        }
        this.LJLJI = null;
    }

    public final void LLFII() {
        String str;
        Object obj;
        MutableLiveData<C75271TgR> mutableLiveData;
        C75271TgR value;
        ShowListUser showListUser;
        MutableLiveData<C75271TgR> mutableLiveData2;
        C75271TgR value2;
        List<ShowListUser> list;
        ArrayList arrayList = new ArrayList();
        BaseLiveShowViewModel baseLiveShowViewModel = this.LJLILLLLZI;
        if (baseLiveShowViewModel != null && (mutableLiveData2 = baseLiveShowViewModel.LJLILLLLZI) != null && (value2 = mutableLiveData2.getValue()) != null && (list = value2.LIZIZ) != null) {
            arrayList.addAll(list);
        }
        BaseLiveShowViewModel baseLiveShowViewModel2 = this.LJLILLLLZI;
        if (baseLiveShowViewModel2 != null && (mutableLiveData = baseLiveShowViewModel2.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null && (showListUser = value.LIZ) != null) {
            arrayList.add(showListUser);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                obj = it.next();
                ShowListUser showListUser2 = (ShowListUser) obj;
                if (showListUser2 != null && showListUser2.order == 1) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ShowListUser showListUser3 = (ShowListUser) obj;
        if (showListUser3 != null) {
            str = showListUser3.nickname;
        }
        LLFF(2, 1, str, showListUser3);
        this.LJLJLLL = showListUser3;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        Boolean bool;
        C0NB.LIZIZ("BaseLiveShowWidget", "onDestroy");
        LL(this.LJLJJI);
        this.dataChannel.qv0(LiveShowMaskOrderEvent.class, new C75269TgP(false, null));
        C73546Sti c73546Sti = this.LJLJI;
        if (c73546Sti != null) {
            c73546Sti.dispose();
        }
        this.LJLJI = null;
        U35 LIZ = TQA.LIZ();
        if (LIZ != null) {
            bool = Boolean.valueOf(LIZ.LJIIJJI());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            LLFF(5, null, null, null);
        }
        C72818Shy.LJII("multi_guest_banner_ready", this.LJLLI);
        super.onDestroy();
    }

    public static void LJZL() {
        if (!C74838TYs.LJ().LJJIJIL) {
            C0NB.LIZIZ("BaseLiveShowWidget", "refresh banner");
            if (MultiGuestLiveShowConfigSetting.INSTANCE.getSettingValue().bannerRefreshShuffleTime < 0) {
                return;
            }
            ((IBannerService) CN1.LIZ(IBannerService.class)).H50(C78842Uww.LJIJ(V0Q.Default, new C40517FvF(0, r2)));
            C74838TYs.LJ().LJJIJIL = true;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        Fragment fragment;
        super.onCreate();
        C0NB.LIZIZ("BaseLiveShowWidget", "onCreate");
        C0NB.LIZIZ("BaseLiveShowWidget", "initViewModel");
        if (MultiGuestLiveShowInitViewModelFixSetting.INSTANCE.isFix()) {
            InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
            if (interfaceC31781Cdd != null && (fragment = interfaceC31781Cdd.getFragment()) != null && !fragment.isDetached()) {
                this.LJLILLLLZI = (BaseLiveShowViewModel) ViewModelProviders.of(fragment).get(this.LJLIL);
            }
        } else {
            Fragment parentFragment = this.widgetCallback.getFragment().getParentFragment();
            if (parentFragment == null) {
                parentFragment = this.widgetCallback.getFragment();
            }
            this.LJLILLLLZI = (BaseLiveShowViewModel) ViewModelProviders.of(parentFragment).get(this.LJLIL);
        }
        BaseLiveShowViewModel baseLiveShowViewModel = this.LJLILLLLZI;
        if (baseLiveShowViewModel != null) {
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            baseLiveShowViewModel.LJLJLJ = dataChannel;
            baseLiveShowViewModel.LJLJLLL = this;
            BaseLiveShowViewModel baseLiveShowViewModel2 = this.LJLILLLLZI;
            if (baseLiveShowViewModel2 != null) {
                baseLiveShowViewModel2.onInit();
            }
            baseLiveShowViewModel.LJLJI.observe(this, this.LJLLILLLL);
        }
        C72818Shy.LIZLLL("multi_guest_banner_ready", this.LJLLI);
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        super.onResume();
        if (this.LJLL) {
            BaseLiveShowViewModel baseLiveShowViewModel = this.LJLILLLLZI;
            if (baseLiveShowViewModel != null && (mutableLiveData = baseLiveShowViewModel.LJLIL) != null && (value = mutableLiveData.getValue()) != null && value.intValue() == 2) {
                LJZL();
            }
            this.LJLL = false;
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onStop() {
        super.onStop();
        this.LJLL = true;
    }

    public BaseLiveShowWidget(Class<BaseLiveShowViewModel> cls) {
        this.LJLIL = cls;
    }

    public final ShowListUser LJZ(int i) {
        MutableLiveData<C75271TgR> mutableLiveData;
        C75271TgR value;
        List<ShowListUser> list;
        BaseLiveShowViewModel baseLiveShowViewModel = this.LJLILLLLZI;
        ShowListUser showListUser = null;
        if (baseLiveShowViewModel == null || (mutableLiveData = baseLiveShowViewModel.LJLILLLLZI) == null || (value = mutableLiveData.getValue()) == null || (list = value.LIZIZ) == null) {
            return null;
        }
        Iterator<ShowListUser> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ShowListUser next = it.next();
            if (next.order == i + 1) {
                showListUser = next;
                break;
            }
        }
        return showListUser;
    }

    public final void LL(String str) {
        if (str == null) {
            return;
        }
        this.dataChannel.qv0(LiveShowCountDownEvent.class, new C75270TgQ(0, 0L, 0L, str));
        C73546Sti c73546Sti = this.LJLJI;
        if (c73546Sti != null) {
            c73546Sti.dispose();
        }
        this.LJLJI = null;
    }

    public final void LLFF(int i, Integer num, String str, ShowListUser showListUser) {
        String str2;
        Long l;
        if (showListUser == null || (str2 = LJZI(showListUser)) == null) {
            str2 = str;
        }
        JSONObject LIZJ = C65232Piu.LIZJ("bannerType", "live_show");
        JSONObject LIZLLL = C770830u.LIZLLL("status", i);
        if (num != null) {
            LIZLLL.put("order", num.intValue());
        }
        if (str2 != null) {
            LIZLLL.put("nickname", str2);
        }
        LIZJ.put("data", LIZLLL);
        C1JD.LJJIJL("multi_guest_banner_show", LIZJ, 4);
        this.LJLJLJ = i;
        if (num != null) {
            num.intValue();
            this.LJLJJL = num;
        }
        if (str2 != null) {
            this.LJLJJLL = str2;
        }
        if (showListUser != null) {
            this.LJLJL = showListUser;
        }
        Long l2 = C74838TYs.LJ().LJJIJLIJ;
        U35 LIZ = TQA.LIZ();
        if (LIZ != null) {
            l = LIZ.LJIIJ();
        } else {
            l = null;
        }
        if (!o.LJ(l2, l) && C74838TYs.LJ().LJJIJL) {
            LLFFF();
        }
        C0NB.LIZIZ("BaseLiveShowWidget", "sendBannerShowJsEvent, showStatus: " + i + ", order: " + num + ", nickname: " + str);
    }
}
