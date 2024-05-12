package com.ss.android.ugc.aweme.profile.aigc;

import X.A2F;
import X.A2G;
import X.APO;
import X.AbstractC73547Stj;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C06460Ne;
import X.C221018lt;
import X.C221108m2;
import X.C2JQ;
import X.C32I;
import X.C33Q;
import X.C36636EZk;
import X.C43I;
import X.C56412MCa;
import X.C61878OQg;
import X.C62822Ol8;
import X.C64362fo;
import X.C72117SSb;
import X.C72118SSc;
import X.C72119SSd;
import X.C72120SSe;
import X.C72134SSs;
import X.C72139SSx;
import X.C73318Sq2;
import X.C73458SsI;
import X.C73542Ste;
import X.C73849Syb;
import X.C78565UsT;
import X.C78999UzT;
import X.C8HZ;
import X.E33;
import X.EOY;
import X.EnumC63857P4j;
import X.EnumC72126SSk;
import X.EnumC72128SSm;
import X.InterfaceC67352kd;
import X.InterfaceC72136SSu;
import X.InterfaceC88472Yns;
import X.OQY;
import X.ORZ;
import X.SI6;
import X.SIF;
import X.SIN;
import X.SIX;
import X.SR2;
import X.SRH;
import X.SRW;
import X.SSE;
import X.SSU;
import X.SSW;
import X.SSX;
import X.SSY;
import X.STD;
import X.T16;
import X.TBT;
import X.W5U;
import X.X1D;
import Y.AfS64S0100000_12;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.aigc.AIGCQuota;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS36S0001000_12;
import kotlin.jvm.internal.AqS99S0101000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileAigcAvatarViewModel extends AssemListViewModel<SIN, SIF, C2JQ> {
    public SRW LJLIL;
    public String LJLJJI;
    public InterfaceC72136SSu LJLJJL;
    public int LJLJJLL;
    public Integer LJLJL;
    public Integer LJLJLJ;
    public C73458SsI LJLLILLLL;
    public List<AIGCQuota> LJLLL;
    public final C73318Sq2 LJLILLLLZI = new C73318Sq2();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C72134SSs.LJLIL);
    public boolean LJLJLLL = true;
    public final EOY LJLL = new EOY();
    public final SSY LJLLI = new SSY(this);
    public final C73849Syb<List<AIGCQuota>> LJLLJ = new C73849Syb<>();
    public final C72118SSc LJLLLL = new C72118SSc(this);
    public final List<SIF> LJLLLLLL = new ArrayList();
    public final E33 LJLZ = new E33(SSU.IDLE, 0, Boolean.FALSE);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new SIN(new C43I(C61878OQg.INSTANCE), new C43I(OQY.INSTANCE), new C43I(null), new C43I(SR2.AVATAR_CHANGE), new C43I(EnumC63857P4j.FAST), new C43I(new SRH(EnumC72126SSk.DISABLE, 0)), new C43I(EnumC72128SSm.DISMISS), new C43I(new E33(SSU.IDLE, 0, 6)), new C43I(APO.IDLE), new C8HZ(null, null, 15));
    }

    public final void iv0() {
        String str = this.LJLJJI;
        if (str != null) {
            lv0(EnumC72126SSk.GENERATING, 0);
            this.LJLJJLL++;
            C78999UzT.LJFF(C73542Ste.LJI(AbstractC73547Stj.LJI(new SSX(this, str)).LJIILIIL(T16.LIZ()), SSE.LJLIL, C73542Ste.LIZJ), this.LJLILLLLZI);
            return;
        }
        nv0(R.string.ep);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLILLLLZI.LIZLLL();
        InterfaceC72136SSu interfaceC72136SSu = this.LJLJJL;
        if (interfaceC72136SSu != null) {
            interfaceC72136SSu.unregisterListener(this.LJLLLL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void gv0(ActivityC45651qj activityC45651qj) {
        String str;
        String str2;
        String str3;
        SI6 si6 = ((SIN) getState()).LJLJI.LIZ;
        if (si6 == null || (str = si6.LIZIZ) == null) {
            C221018lt.LIZ("ProfileAigcAvatarViewModel", "no valid avatar url, can't change avatar");
            return;
        }
        String str4 = ((SIN) getState()).LJLJJL.LIZ.toString();
        SRW srw = this.LJLIL;
        if (srw != null) {
            str2 = srw.LJLILLLLZI;
            str3 = srw.LJLJI;
        } else {
            str2 = null;
            str3 = null;
        }
        STD.LIZLLL(str4, "continue", str2, str3, 0, null, null, 112);
        AvatarPresenter avatarPresenter = new AvatarPresenter();
        avatarPresenter.initHeadUploadHelper(activityC45651qj, null);
        W5U.LIZJ().LJIIIIZZ(UriProtector.parse(str), new C72139SSx(new C72119SSd(avatarPresenter, this, str, activityC45651qj, new C72120SSe(this, avatarPresenter))));
    }

    public final void mv0(SR2 mode) {
        o.LJIIIZ(mode, "mode");
        setState(new AqS178S0100000_12(mode, 249));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<SIF> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS178S0100000_12(newListState, (C8HZ<ImageItem>) 246));
    }

    public final void nv0(int i) {
        ActivityC45651qj activityC45651qj;
        if (!this.LJLJLLL) {
            return;
        }
        this.LJLJLLL = false;
        C78999UzT.LJFF(AbstractC73672Svk.LJJLIIIJLJLI(3000L, TimeUnit.MILLISECONDS).LJJJLIIL(new AfS64S0100000_12(this, 31), C72117SSb.LJLIL), this.LJLILLLLZI);
        SRW srw = this.LJLIL;
        if (srw != null && (activityC45651qj = srw.LJLJJL) != null) {
            C78565UsT.LJJIJIIJI(this, C36636EZk.LIZ, new C64362fo(activityC45651qj, i, null));
        } else {
            C221018lt.LIZ("ProfileAigcAvatarViewModel", "can't show toast");
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<C2JQ>> interfaceC67352kd) {
        A2F a2f = A2G.LIZ;
        List<SIF> list = this.LJLLLLLL;
        a2f.getClass();
        return A2F.LIZ(list);
    }

    public final void ov0(List<String> list) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update avatar list: ");
        LIZ.append(list.size());
        C221018lt.LIZ("ProfileAigcAvatarViewModel", X1D.LIZIZ(LIZ));
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (String str : list) {
            ArrayList arrayList2 = (ArrayList) this.LJLLLLLL;
            arrayList.add(Boolean.valueOf(arrayList2.add(new SIF(new SI6(String.valueOf(arrayList2.size() + 1), str)))));
        }
        listSetItems(this.LJLLLLLL);
        setState(new AqS178S0100000_12(this, LiveCoverMinSizeSetting.DEFAULT));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void kv0(SI6 item, boolean z) {
        SR2 sr2;
        o.LJIIIZ(item, "item");
        Set LLJILLL = ORZ.LLJILLL(((SIN) getState()).LJLILLLLZI.LIZ);
        if (z) {
            LLJILLL.add(item);
        } else {
            LLJILLL.remove(item);
        }
        if (LLJILLL.size() == ((SIN) getState()).LJLIL.LIZ.size()) {
            sr2 = SR2.DOWNLOAD_ALL_SELECTED;
        } else {
            sr2 = SR2.DOWNLOAD_NOT_ALL_SELECTED;
        }
        setState(new AqS178S0100000_12(LLJILLL, (Set<SI6>) 247));
        setState(new AqS178S0100000_12(sr2, 248));
    }

    public final void lv0(EnumC72126SSk enumC72126SSk, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set footer state: ");
        LIZ.append(enumC72126SSk);
        LIZ.append(", count: ");
        LIZ.append(i);
        C221018lt.LIZ("ProfileAigcAvatarViewModel", X1D.LIZIZ(LIZ));
        setState(new AqS99S0101000_12(enumC72126SSk, i, 11));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C2JQ c2jq, InterfaceC67352kd<? super A2G<C2JQ>> interfaceC67352kd) {
        A2F a2f = A2G.LIZ;
        List<SIF> list = this.LJLLLLLL;
        a2f.getClass();
        return A2F.LIZ(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void hv0(int i, int i2, int i3) {
        String str;
        int i4 = i + i2;
        if (i4 < i3) {
            SSY ssy = this.LJLLI;
            ssy.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("on save in progress, count: ");
            LIZ.append(i);
            C221018lt.LIZ("ProfileAigcAvatarViewModel", X1D.LIZIZ(LIZ));
            ssy.LIZ.setState(new AqS36S0001000_12(i, 6));
            return;
        }
        if (i4 == i3) {
            if (i == i3) {
                SSY ssy2 = this.LJLLI;
                ssy2.getClass();
                C221018lt.LIZ("ProfileAigcAvatarViewModel", "on save finished");
                ProfileAigcAvatarViewModel profileAigcAvatarViewModel = ssy2.LIZ;
                EOY eoy = profileAigcAvatarViewModel.LJLL;
                String str2 = ((SIN) profileAigcAvatarViewModel.getState()).LJLJJL.LIZ.toString();
                ProfileAigcAvatarViewModel profileAigcAvatarViewModel2 = ssy2.LIZ;
                SRW srw = profileAigcAvatarViewModel2.LJLIL;
                String str3 = null;
                if (srw != null) {
                    str3 = srw.LJLILLLLZI;
                    str = srw.LJLJI;
                } else {
                    str = null;
                }
                eoy.LIZ(((SIN) profileAigcAvatarViewModel2.getState()).LJLILLLLZI.LIZ.size(), str2, "download_success", str3, str);
                ssy2.LIZ.setState(SIX.LJLIL);
                ssy2.LIZ.mv0(SR2.AVATAR_CHANGE);
                ssy2.LIZ.nv0(R.string.c6);
                ssy2.LIZ.setState(SSW.LJLIL);
                return;
            }
            this.LJLLI.LIZ();
            return;
        }
        StringBuilder LIZJ = C06460Ne.LIZJ("invalid save count, success: ", i, ", fail: ", i2, ", total: ");
        LIZJ.append(i3);
        C221018lt.LIZ("ProfileAigcAvatarViewModel", X1D.LIZIZ(LIZJ));
    }

    public static void jv0(ProfileAigcAvatarViewModel profileAigcAvatarViewModel, TBT prop1, LifecycleOwner lifecycleOwner, InterfaceC88472Yns interfaceC88472Yns) {
        profileAigcAvatarViewModel.getClass();
        o.LJIIIZ(prop1, "prop1");
        C56412MCa c56412MCa = new C56412MCa();
        c56412MCa.LIZIZ(true);
        AssemViewModel.selectSubscribe$default(profileAigcAvatarViewModel, prop1, c56412MCa, lifecycleOwner, null, interfaceC88472Yns, 8, null);
    }
}
