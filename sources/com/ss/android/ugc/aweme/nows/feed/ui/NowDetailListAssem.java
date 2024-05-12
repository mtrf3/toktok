package com.ss.android.ugc.aweme.nows.feed.ui;

import X.C107794Kx;
import X.C16880lQ;
import X.C184737Mv;
import X.C184757Mx;
import X.C185117Oh;
import X.C195237lP;
import X.C196477nP;
import X.C1JI;
import X.C200997uh;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C26045AKb;
import X.C2NU;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C56642Ke;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C78926UyI;
import X.InterfaceC57784Mm4;
import X.QD3;
import X.SYL;
import X.TBT;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.nows.ability.NowListAbility;
import com.ss.android.ugc.aweme.nows.feed.common.NowPostImagePowerCell;
import com.ss.android.ugc.aweme.nows.feed.common.NowPostVideoPowerCell;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDetailListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class NowDetailListAssem extends UIListContentAssem<NowDetailListViewModel> implements NowListAbility {
    public final C62822Ol8 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C196477nP LJLJI;
    public final C55749LuL LJLJJI;
    public C73305Spp LJLJJL;

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final RecyclerView.RecycledViewPool WE() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final void yJ(RecyclerView.RecycledViewPool recycledViewPool) {
    }

    public NowDetailListAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 589));
        C65776Prg LIZ = C65352Pkq.LIZ(NowDetailListViewModel.class);
        this.LJLILLLLZI = new C214298b3(new AqS153S0100000_3(LIZ, 590), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C184757Mx.INSTANCE, LIZ);
        this.LJLJI = C1JI.LJJIII(this);
        this.LJLJJI = new C55749LuL(C47704Ins.LIZJ(this, C184737Mv.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: C3, reason: merged with bridge method [inline-methods] */
    public final NowDetailListViewModel A3() {
        return (NowDetailListViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = false;
        return c57939MoZ;
    }

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final SYL i8() {
        return v3();
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        super.onCreateView();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, NowListAbility.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), NowListAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final boolean pt0() {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            return LIZLLL.getUserVisibleHint();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final int jd0(InterfaceC57784Mm4 item) {
        o.LJIIIZ(item, "item");
        return -1;
    }

    @QD3
    public final void onEvent(C107794Kx event) {
        o.LJIIIZ(event, "event");
        C200997uh.LIZIZ(event, C212428Vi.LIZ(this));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C56642Ke event) {
        o.LJIIIZ(event, "event");
        try {
            if (o.LJ(JSONObjectProtectorUtils.getString(event.LJLIL, "eventName"), "videoReportSuccess")) {
                C26045AKb c26045AKb = new C26045AKb(getContainerView());
                c26045AKb.LJIIIIZZ(R.string.j4q);
                c26045AKb.LJIIJ();
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        StatusViewProvider statusViewProvider;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        EventBus.LIZJ().LJIILJJIL(this);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        C73305Spp c73305Spp = null;
        if (LIZLLL != null && (statusViewProvider = (StatusViewProvider) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), StatusViewProvider.class, null)) != null) {
            c73305Spp = statusViewProvider.lj0();
        }
        this.LJLJJL = c73305Spp;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
        }
        C73305Spp c73305Spp2 = this.LJLJJL;
        if (c73305Spp2 != null) {
            c73305Spp2.setVisibility(0);
        }
        v3().LLLF.LJZL(NowPostImagePowerCell.class, NowPostVideoPowerCell.class);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.7Mw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C7N8 c7n8 = (C7N8) obj;
                c7n8.getClass();
                return C208708Ha.LIZLLL(c7n8);
            }
        }, null, new AqS134S0200000_3(view, this, 105), null, new AqS169S0100000_3(this, 303), 10, null);
        C195237lP.LIZ(this, C185117Oh.LIZIZ, new AqS169S0100000_3(this, 304));
        C195237lP.LIZ(this, C185117Oh.LIZJ, new AqS169S0100000_3(this, 305));
        if (C2NU.LIZ.LIZIZ()) {
            NowDetailListViewModel A3 = A3();
            String aid = ((C184737Mv) this.LJLJJI.getValue()).LJLIL;
            A3.getClass();
            o.LJIIIZ(aid, "aid");
            A3.setStateImmediate(new AqS28S1000000_3(aid, 0));
            A3.manualListRefresh();
        } else {
            C73305Spp c73305Spp3 = this.LJLJJL;
            if (c73305Spp3 != null) {
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJI(c73306Spq, new AqS150S0200000_3(view, this, 41));
                c73305Spp3.setStatus(c73306Spq);
            }
        }
        C200997uh.LIZ(C212428Vi.LIZ(this), C212428Vi.LIZLLL(this));
    }
}
