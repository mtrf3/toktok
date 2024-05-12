package com.ss.android.ugc.aweme.profile.aigc;

import X.C214298b3;
import X.C221018lt;
import X.C221108m2;
import X.C227108vi;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.EnumC72126SSk;
import X.SIM;
import X.SR2;
import X.SR8;
import X.SRG;
import X.SRH;
import X.SRW;
import X.SSR;
import X.SYL;
import X.TBT;
import android.view.View;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileAigcAvatarListAssem extends UIListContentAssem<ProfileAigcAvatarViewModel> implements SRG {
    public final C55749LuL LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public ProfileAigcAvatarListAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LJ(this, SRW.class, "hierarchy_data_choose_avatar"), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileAigcAvatarViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 821), SIM.INSTANCE, null);
        this.LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 820));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: C3, reason: merged with bridge method [inline-methods] */
    public final ProfileAigcAvatarViewModel A3() {
        return (ProfileAigcAvatarViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // X.SRG
    public final C227108vi LJJJIL() {
        return new C227108vi(v3(), new SR8());
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZJ = ProfileAigcChooseAvatarFooterCell.class;
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        A3().manualListRefresh();
        withState(A3(), new AqS178S0100000_12(this, 244));
        C8YN.LJIIJ(this, A3(), new TBT() { // from class: X.SR6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SIN) obj).LJLJJI;
            }
        }, new TBT() { // from class: X.SR7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SIN) obj).LJLJJLL;
            }
        }, null, new IDqS436S0100000_12(this, 15), 12);
    }

    public final void E3(SR2 sr2, SRH srh) {
        SSR ssr;
        SRW srw = (SRW) this.LJLIL.getValue();
        if (srw != null) {
            ssr = srw.LJLJJI;
        } else {
            ssr = null;
        }
        if (ssr == SSR.MULTIPLE_VERTICAL && !sr2.isDownload()) {
            C221018lt.LIZ("ProfileAigcAvatarListAssem", "set large padding");
            getContainerView().setPadding(v3().getPaddingStart(), v3().getPaddingTop(), v3().getPaddingEnd(), v3().getResources().getDimensionPixelOffset(R.dimen.o0));
        } else if (srh.LJLIL != EnumC72126SSk.HIDE) {
            C221018lt.LIZ("ProfileAigcAvatarListAssem", "set small padding");
            getContainerView().setPadding(v3().getPaddingStart(), v3().getPaddingTop(), v3().getPaddingEnd(), v3().getResources().getDimensionPixelOffset(R.dimen.is));
        } else {
            C221018lt.LIZ("ProfileAigcAvatarListAssem", "set default padding");
            getContainerView().setPadding(v3().getPaddingStart(), v3().getPaddingTop(), v3().getPaddingEnd(), v3().getResources().getDimensionPixelOffset(R.dimen.o2));
        }
    }
}
