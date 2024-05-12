package com.ss.android.ugc.aweme.tag.assem;

import X.C213688a4;
import X.C214298b3;
import X.C242279f5;
import X.C246899mX;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC57784Mm4;
import X.SYL;
import X.TBT;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.tag.SelectedListCell;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SelectedListAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public SYL LJLILLLLZI;

    public SelectedListAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoTagFriendsListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 865), C242279f5.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        SYL syl = (SYL) getContainerView().findViewById(R.id.jmg);
        syl.LLLF.LJZL(SelectedListCell.class);
        syl.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        syl.setLayoutManager(linearLayoutManager);
        this.LJLILLLLZI = syl;
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.9f8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242289f6) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 193), 4);
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.9f9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242289f6) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 194), 4);
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.9fB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242289f6) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 195), 4);
    }

    public final void v3(IMUser iMUser, boolean z) {
        SYL syl = this.LJLILLLLZI;
        if (syl != null) {
            C72808Sho<InterfaceC57784Mm4> state = syl.getState();
            if (z) {
                state.LIZJ(new C246899mX(iMUser));
                SYL syl2 = this.LJLILLLLZI;
                if (syl2 != null) {
                    syl2.LJLI(syl2.getState().LJIIIIZZ() - 1);
                    return;
                } else {
                    o.LJIJI("selectedList");
                    throw null;
                }
            }
            state.LJIIL(new C246899mX(iMUser));
            return;
        }
        o.LJIJI("selectedList");
        throw null;
    }
}
