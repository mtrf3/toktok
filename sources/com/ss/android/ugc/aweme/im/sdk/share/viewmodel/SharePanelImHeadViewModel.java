package com.ss.android.ugc.aweme.im.sdk.share.viewmodel;

import X.ActivityC45651qj;
import X.C100023wE;
import X.C1HQ;
import X.C3WF;
import X.C3WG;
import X.C41831GbL;
import X.C48841JEv;
import X.C4LD;
import X.C4OT;
import X.C4OX;
import X.C55723Ltv;
import X.C61878OQg;
import X.C64962gm;
import X.C772831o;
import X.C77876UhM;
import X.C80893Fl;
import X.C84763XOl;
import X.C85323Wm;
import X.C85773Yf;
import X.EnumC84123Rw;
import X.EnumC84133Rx;
import X.GZP;
import X.InterfaceC62225ObV;
import X.InterfaceC83893Qz;
import X.L17;
import X.OSZ;
import android.app.Activity;
import android.os.Bundle;
import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import djb.IDaS20S0000000_1;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS12S2100000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class SharePanelImHeadViewModel extends ViewModel implements GenericLifecycleObserver, InterfaceC83893Qz {
    public final SharePackage LJLIL;
    public final List<InterfaceC62225ObV> LJLILLLLZI;
    public final C4OT LJLJI;
    public final MutableLiveData<Boolean> LJLJJI;
    public final MutableLiveData<Boolean> LJLJJL;
    public final MutableLiveData<Boolean> LJLJJLL;
    public final MutableLiveData<OSZ<Boolean, Integer>> LJLJL;
    public final MutableLiveData<OSZ<Boolean, Integer>> LJLJLJ;
    public final MutableLiveData<Set<IMContact>> LJLJLLL;
    public final MutableLiveData<Boolean> LJLL;
    public final MutableLiveData<Boolean> LJLLI;
    public final MutableLiveData<OSZ<IMContact, Boolean>> LJLLILLLL;
    public final MutableLiveData<Boolean> LJLLJ;
    public final MutableLiveData<OSZ<IMContact, Boolean>> LJLLL;
    public final MutableLiveData<OSZ<List<IMContact>, Boolean>> LJLLLL;
    public final C64962gm LJLLLLLL;
    public final SharePanelViewModel LJLZ;

    @Override // X.InterfaceC83893Qz
    public final void Ql(int i, int i2, boolean z) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC83893Qz
    public final void sz(long j, boolean z, int i, boolean z2, int i2) {
    }

    @Override // X.InterfaceC83893Qz
    public final void xN(Throwable e, List list) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(e, "e");
    }

    public final void ZJ() {
        ActivityC45651qj activityC45651qj;
        if (o.LJ(this.LJLIL.itemType, "aigc_avatar")) {
            C85323Wm onEventV3 = C772831o.LIZ();
            o.LJIIIZ(onEventV3, "onEventV3");
            C1HQ c1hq = new C1HQ();
            c1hq.put("action_type", "share_to_story");
            onEventV3.LIZIZ("ai_avatar_save_finish_page", c1hq);
            Bundle bundle = this.LJLIL.extras;
            String string = bundle.getString("uncrop_avatar_path", "");
            String string2 = bundle.getString("origin_no_crop_avatar_path", "");
            Bundle m = HiddenActivity$$ExternalSyntheticOutline0.m("is_aivatar", true, "origin_avatar_url", string);
            m.putString("origin_no_crop_avatar_path", string2);
            m.putString("enter_method", "share_panel_post");
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if ((LJIIIIZZ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIIIIZZ) != null) {
                AVExternalServiceImpl.LIZ().avatarService().publishDirectly(activityC45651qj, m, false, new AqS151S0100000_1(this, 889));
                return;
            }
            return;
        }
        Aweme LJJJLL = C4LD.LIZ.LJJJLL(this.LJLIL);
        if (LJJJLL == null) {
            return;
        }
        this.LJLJI.LJIIIZ();
        GZP LJII = C55723Ltv.LIZIZ.LJII();
        Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ2 != null) {
            String LJFF = this.LJLZ.LJFF();
            o.LJIIIIZZ(LJFF, "shareListViewModel.enterFrom");
            LJII.LJFF(new C41831GbL(LJIIIIZZ2, LJJJLL, LJFF, null, null, 24));
        }
        LJII.LJIIJ("share_to_story_click", LJJJLL, new AqS12S2100000_1(this, this.LJLIL.extras.getString("share_to_story_enter_method", ""), this.LJLIL.extras.getString("share_to_story_entrance_icon", ""), 2));
    }

    public final int gv0() {
        C100023wE LJ;
        if (C85773Yf.LJLJI != null && (LJ = C77876UhM.LJ()) != null) {
            return LJ.LIZ;
        }
        return 10;
    }

    public final boolean hv0() {
        if (this.LJLZ.LIZLLL() && !((Boolean) L17.LIZIZ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    public final void iv0() {
        MutableLiveData<Boolean> mutableLiveData = this.LJLJJI;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LJLJJLL.setValue(bool);
        this.LJLJJL.setValue(bool);
        this.LJLL.setValue(bool);
        this.LJLLI.setValue(bool);
        this.LJLLJ.setValue(bool);
        Set<IMContact> value = this.LJLJLLL.getValue();
        if (value != null) {
            value.clear();
        }
    }

    public final void jv0() {
        int i;
        if (this.LJLZ.LJI() == C4OX.FIRST) {
            boolean LIZIZ = this.LJLZ.LIZIZ();
            boolean hv0 = hv0();
            if (LIZIZ) {
                if (hv0) {
                    i = 2;
                }
                i = 1;
            } else {
                if (!hv0) {
                    i = 0;
                }
                i = 1;
            }
            this.LJLJLJ.setValue(new OSZ<>(Boolean.TRUE, Integer.valueOf(i)));
            return;
        }
        if (this.LJLZ.LJI() != C4OX.LAST) {
            return;
        }
        this.LJLJLJ.setValue(new OSZ<>(Boolean.TRUE, -1));
    }

    public final void kv0() {
        if (!this.LJLZ.LIZIZ()) {
            return;
        }
        this.LJLJL.setValue(new OSZ<>(Boolean.TRUE, Integer.valueOf(hv0() ? 1 : 0)));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C48841JEv.LIZJ(this.LJLLLLLL, null);
        iv0();
    }

    @Override // X.InterfaceC83893Qz
    public final void ks(List<? extends IMContact> list) {
        o.LJIIIZ(list, "list");
        this.LJLLLL.setValue(new OSZ<>(list, Boolean.FALSE));
    }

    @Override // X.InterfaceC83893Qz
    public final void nG(IMContact iMContact) {
        this.LJLLL.setValue(new OSZ<>(iMContact, Boolean.TRUE));
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b2, code lost:
    
        if (r20 != false) goto L80;
     */
    @Override // X.InterfaceC83893Qz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean HY(com.ss.android.ugc.aweme.im.service.model.IMContact r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.viewmodel.SharePanelImHeadViewModel.HY(com.ss.android.ugc.aweme.im.service.model.IMContact, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SharePanelImHeadViewModel(SharePackage sharePackage, List<? extends InterfaceC62225ObV> channelList, C4OT callback, SharePanelViewModel sharePanelViewModel) {
        boolean z;
        SharePanelViewModel sharePanelViewModel2 = sharePanelViewModel;
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(channelList, "channelList");
        o.LJIIIZ(callback, "callback");
        this.LJLIL = sharePackage;
        this.LJLILLLLZI = channelList;
        this.LJLJI = callback;
        Boolean bool = Boolean.FALSE;
        this.LJLJJI = new MutableLiveData<>(bool);
        this.LJLJJL = new MutableLiveData<>(bool);
        this.LJLJJLL = new MutableLiveData<>(bool);
        this.LJLJL = new MutableLiveData<>();
        this.LJLJLJ = new MutableLiveData<>();
        this.LJLJLLL = new MutableLiveData<>();
        this.LJLL = new MutableLiveData<>(bool);
        this.LJLLI = new MutableLiveData<>(bool);
        this.LJLLILLLL = new MutableLiveData<>();
        this.LJLLJ = new MutableLiveData<>(bool);
        this.LJLLL = new MutableLiveData<>();
        this.LJLLLL = new MutableLiveData<>();
        this.LJLLLLLL = C48841JEv.LIZ(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 8));
        if (sharePanelViewModel2 == null) {
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            EnumC84123Rw enumC84123Rw = EnumC84123Rw.NORMAL;
            int LIZ = C80893Fl.LIZ();
            C3WF.LIZ.getClass();
            EnumC84133Rx LIZ2 = C3WF.LIZ();
            if (C3WF.LIZ() != EnumC84133Rx.RECENT_SHARED) {
                z = true;
            } else {
                z = false;
            }
            sharePanelViewModel2 = C3WG.LIZ(sharePackage, this, c61878OQg, enumC84123Rw, LIZ, LIZ2, true, z, false, false, null, null, 15872);
        }
        this.LJLZ = sharePanelViewModel2;
        sharePanelViewModel2.getClass();
    }
}
