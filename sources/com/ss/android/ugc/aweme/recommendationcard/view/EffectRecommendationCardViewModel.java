package com.ss.android.ugc.aweme.recommendationcard.view;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C46745IWf;
import X.C46751IWl;
import X.C47045IdF;
import X.C47261Igj;
import X.C62822Ol8;
import X.C78880UxY;
import X.C79853Bl;
import X.C84193Sd;
import X.IWH;
import X.InterfaceC36571c5;
import X.InterfaceC88472Yns;
import X.K3S;
import X.KN3;
import X.KN4;
import X.KN5;
import X.KN6;
import X.KNQ;
import X.KNW;
import X.LNI;
import X.V1M;
import X.XKX;
import X.XLL;
import Y.IDeS153S0200000_15;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommendationcard.data.CardContent;
import com.ss.android.ugc.aweme.recommendationcard.data.EffectStructV2;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EffectRecommendationCardViewModel extends ViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C47045IdF.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(KNQ.LJLIL);
    public ScrollSwitchStateManager LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final XLL LJLJJLL;
    public final MutableLiveData<KN3> LJLJL;
    public final MutableLiveData LJLJLJ;

    public final IWH hv0() {
        return (IWH) this.LJLIL.getValue();
    }

    public final void iv0() {
        KN3 value;
        KN3 value2;
        String str;
        if (this.LJLJJI && !this.LJLJJL && (value = this.LJLJL.getValue()) != null && value.LJFF != null && (value2 = this.LJLJL.getValue()) != null) {
            List<CardContent> list = value2.LIZJ;
            if (list != null) {
                int i = 0;
                for (CardContent cardContent : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        Integer valueOf = Integer.valueOf(i2);
                        String str2 = value2.LJ;
                        EffectStructV2 effectStructV2 = cardContent.effect;
                        if (effectStructV2 != null) {
                            str = effectStructV2.effectId;
                        } else {
                            str = null;
                        }
                        Map LIZ = K3S.LIZ(valueOf, str, "prop_three_card");
                        if (str2 == null) {
                            str2 = "";
                        }
                        LIZ.put("music_id", str2);
                        C78880UxY.LJJLIIIJL("prop_recommend_card_show", LIZ);
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            Object value3 = this.LJLILLLLZI.getValue();
            String str3 = value2.LJFF;
            value3.getClass();
            KNW.LIZLLL(str3);
            this.LJLJJL = true;
        }
    }

    public final void jv0() {
        String str;
        String str2;
        KN3 value = this.LJLJL.getValue();
        if (value != null) {
            str = value.LJ;
        } else {
            str = null;
        }
        KN3 value2 = this.LJLJL.getValue();
        if (value2 != null && (str2 = value2.LIZLLL) != null && this.LJLJJI && !((C46751IWl) hv0().getPlayState()).LIZ() && !((C46751IWl) hv0().getPlayState()).LIZ.isLoading()) {
            List<String> LJJIJ = C47261Igj.LJJIJ(str2);
            SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
            VideoUrlModel videoUrlModel = new VideoUrlModel();
            videoUrlModel.setUrlKey(str);
            videoUrlModel.setSourceId(str);
            videoUrlModel.setUrlList(LJJIJ);
            simVideoUrlModel.origin = videoUrlModel;
            simVideoUrlModel.setUrlKey(str);
            simVideoUrlModel.setSourceId(str);
            simVideoUrlModel.setUrlList(LJJIJ);
            C46745IWf c46745IWf = new C46745IWf();
            c46745IWf.LJI = simVideoUrlModel;
            c46745IWf.LJJJJZ = false;
            c46745IWf.LJIILL = true;
            c46745IWf.LJIJJLI = false;
            hv0().LJIIL(c46745IWf);
        }
    }

    public EffectRecommendationCardViewModel() {
        XLL LIZ = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLJJLL = LIZ;
        MutableLiveData<KN3> mutableLiveData = new MutableLiveData<>(new KN3(0));
        this.LJLJL = mutableLiveData;
        this.LJLJLJ = mutableLiveData;
        V1M.LJJIJIIJIL(new IDeS153S0200000_15(LIZ, new KN4(this, null), 0), ViewModelKt.getViewModelScope(this));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        hv0().release();
    }

    public final void gv0(KN6 event) {
        o.LJIIIZ(event, "event");
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new KN5(this, event, null), 3);
    }

    public final void kv0(ActivityC45651qj activityC45651qj, Aweme aweme, InterfaceC88472Yns<? super Boolean, Boolean> interfaceC88472Yns) {
        LNI lni;
        User author;
        if (activityC45651qj != null) {
            this.LJLJI = C84193Sd.LIZ(activityC45651qj);
        }
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin.isLogin()) {
            InterfaceC36571c5 interfaceC36571c5 = null;
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                author.setUid(createIUserServicebyMonsterPlugin.getCurrentUserID());
            }
            ScrollSwitchStateManager scrollSwitchStateManager = this.LJLJI;
            if (scrollSwitchStateManager != null) {
                interfaceC36571c5 = scrollSwitchStateManager.jv0(scrollSwitchStateManager.nv0("page_profile"));
            }
            if ((interfaceC36571c5 instanceof LNI) && (lni = (LNI) interfaceC36571c5) != null) {
                lni.LJJLIIIJ(aweme);
            }
        }
        ScrollSwitchStateManager scrollSwitchStateManager2 = this.LJLJI;
        if (scrollSwitchStateManager2 != null) {
            scrollSwitchStateManager2.tv0(interfaceC88472Yns.invoke(Boolean.valueOf(createIUserServicebyMonsterPlugin.isLogin())).booleanValue());
        }
    }
}
