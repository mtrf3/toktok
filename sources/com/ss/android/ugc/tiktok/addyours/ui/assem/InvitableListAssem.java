package com.ss.android.ugc.tiktok.addyours.ui.assem;

import X.C17N;
import X.C214298b3;
import X.C218768iG;
import X.C219028ig;
import X.C57939MoZ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C76800UCe;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65784Pro;
import X.TBT;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.tiktok.addyours.ui.table.InvitableCell;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursInviteFriendsViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class InvitableListAssem<T extends AssemListViewModel<?, C218768iG, ?>> extends UIListContentAssem<T> {
    public final C214298b3 LJLIL;

    public abstract C73306Spq E3();

    public abstract String F3();

    public abstract boolean H3();

    public abstract C73305Spp I3();

    public abstract boolean K3();

    public abstract boolean L3();

    public InvitableListAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(AddYoursInviteFriendsViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, C9BE.LIZ, new AqS153S0100000_3(LIZ, 1436), C219028ig.INSTANCE, null);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LIZ = 4;
        c57939MoZ.LJI = F3();
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }

    public final void C3() {
        if (!L3()) {
            return;
        }
        C73306Spq E3 = E3();
        if (E3 != null && K3()) {
            if (v3().getVisibility() == 0) {
                C73305Spp I3 = I3();
                if (I3 != null) {
                    C17N.LJJLIIIJJI(I3);
                }
                C73305Spp I32 = I3();
                if (I32 != null) {
                    I32.setStatus(E3);
                }
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C73305Spp I33 = I3();
        if (I33 != null) {
            C17N.LJJIIJZLJL(I33);
        }
    }

    public final void LJII() {
        if (v3().getVisibility() == 0) {
            C73305Spp I3 = I3();
            if (I3 != null) {
                C17N.LJJLIIIJJI(I3);
            }
            C73305Spp I32 = I3();
            if (I32 != null) {
                I32.LJFF();
            }
        }
    }

    public final void M3(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str;
        Resources resources;
        String string;
        Resources resources2;
        if (v3().getVisibility() == 0) {
            C73305Spp I3 = I3();
            if (I3 != null) {
                C17N.LJJLIIIJJI(I3);
            }
            C73305Spp I32 = I3();
            if (I32 != null) {
                C73306Spq c73306Spq = new C73306Spq();
                Context context = getContext();
                String str2 = "";
                if (context == null || (resources2 = context.getResources()) == null || (str = resources2.getString(R.string.dte)) == null) {
                    str = "";
                }
                Context context2 = getContext();
                if (context2 != null && (resources = context2.getResources()) != null && (string = resources.getString(R.string.g5t)) != null) {
                    str2 = string;
                }
                C73312Spw.LJIIIIZZ(c73306Spq, str, str2, 0, new AqS150S0200000_3(this, interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 54), 28);
                I32.setStatus(c73306Spq);
            }
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        v3().LLLF.LJZL(InvitableCell.class);
        C8YN.LJII(this, this.LJLIL.getValue(), new TBT() { // from class: X.8iU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C218868iQ) obj).LJLJI;
            }
        }, null, new AqS185S0100000_3(this, 136), 6);
    }
}
