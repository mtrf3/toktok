package com.ss.android.ugc.aweme.nows.archive.assem;

import X.C107794Kx;
import X.C185117Oh;
import X.C195237lP;
import X.C196477nP;
import X.C1JI;
import X.C200997uh;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C7MZ;
import X.C9BE;
import X.InterfaceC57784Mm4;
import X.OSZ;
import X.QD3;
import X.SYL;
import X.TBT;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.nows.ability.NowListAbility;
import com.ss.android.ugc.aweme.nows.archive.ui.NowArchiveFeedParams;
import com.ss.android.ugc.aweme.nows.archive.viewmodel.NowArchiveFeedListViewModel;
import com.ss.android.ugc.aweme.nows.feed.common.NowPostImagePowerCell;
import com.ss.android.ugc.aweme.nows.feed.common.NowPostVideoPowerCell;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public final class NowArchiveFeedListAssem extends UIListContentAssem<NowArchiveFeedListViewModel> implements NowListAbility {
    public final C55749LuL LJLIL;
    public final C196477nP LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public int LJLJL;

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final RecyclerView.RecycledViewPool WE() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final void yJ(RecyclerView.RecycledViewPool recycledViewPool) {
    }

    public NowArchiveFeedListAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, NowArchiveFeedParams.class, "now_archive_hierarchy_data_key"), checkSupervisorPrepared());
        this.LJLILLLLZI = C1JI.LJJIII(this);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NowArchiveFeedListViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 567), C7MZ.INSTANCE, null);
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 565));
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 568));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 564));
    }

    public final C73305Spp C3() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: E3, reason: merged with bridge method [inline-methods] */
    public final NowArchiveFeedListViewModel A3() {
        return (NowArchiveFeedListViewModel) this.LJLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 3;
        c57939MoZ.LIZIZ = true;
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
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), NowListAbility.class, null);
        }
        EventBus.LIZJ().LJIJ(this);
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

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        NowArchiveFeedListViewModel A3 = A3();
        OSZ<String, Long> osz = new OSZ<>(((NowArchiveFeedParams) this.LJLIL.getValue()).getAid(), Long.valueOf(((NowArchiveFeedParams) this.LJLIL.getValue()).getLandingPostTime()));
        A3.getClass();
        A3.LJLIL = osz;
        v3().LLLF.LJZL(NowPostImagePowerCell.class, NowPostVideoPowerCell.class);
        v3().setItemAnimator(null);
        v3().setAlpha(0.0f);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.7M9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C182967Ga c182967Ga = (C182967Ga) obj;
                c182967Ga.getClass();
                return C208708Ha.LIZLLL(c182967Ga);
            }
        }, null, new AqS169S0100000_3(this, 286), new AqS153S0100000_3(this, 566), new AqS169S0100000_3(this, 287), 2, null);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.7MA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C182967Ga c182967Ga = (C182967Ga) obj;
                c182967Ga.getClass();
                return C208708Ha.LIZJ(c182967Ga);
            }
        }, null, null, null, new AqS169S0100000_3(this, 288), 14, null);
        C195237lP.LIZ(this, C185117Oh.LIZIZ, new AqS169S0100000_3(this, 289));
        C200997uh.LIZ(C212428Vi.LIZ(this), C212428Vi.LIZLLL(this));
        EventBus.LIZJ().LJIILJJIL(this);
    }
}
