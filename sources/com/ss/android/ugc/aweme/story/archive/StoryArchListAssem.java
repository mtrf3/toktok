package com.ss.android.ugc.aweme.story.archive;

import X.ActivityC45651qj;
import X.C0A2;
import X.C184077Kh;
import X.C185227Os;
import X.C189837ch;
import X.C212428Vi;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C7N7;
import X.C8W0;
import X.C8YN;
import X.C9XU;
import X.G27;
import X.InterfaceC65784Pro;
import X.LFH;
import X.SYL;
import X.TBT;
import X.X1D;
import Y.IDcS7S0200000_3;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryArchListAssem extends UIListContentAssem<StoryArchListViewModel> implements G27 {
    public final C62822Ol8 LJLIL;
    public final C214378bB LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;

    public StoryArchListAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 860));
        C185227Os c185227Os = C185227Os.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(StoryArchListViewModel.class);
        C7N7 c7n7 = C7N7.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 861);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLILLLLZI = new C214378bB(LIZ, c185227Os, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c7n7, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 862));
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 859));
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 858));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.ext_power_list.AssemListViewModel, com.ss.android.ugc.aweme.story.archive.StoryArchListViewModel] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final StoryArchListViewModel A3() {
        return (AssemListViewModel) this.LJLILLLLZI.getValue();
    }

    public final C73305Spp C3() {
        return (C73305Spp) this.LJLJI.getValue();
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
        c57939MoZ.LIZ = 5;
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }

    public final void E3(C73306Spq c73306Spq) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("show status: ");
        if (o.LJ(c73306Spq, this.LJLJJI.getValue())) {
            str = "error";
        } else {
            str = "empty";
        }
        LIZ.append(str);
        C189837ch.LIZ("StoryArchListAssem", X1D.LIZIZ(LIZ));
        v3().setVisibility(8);
        C3().setVisibility(0);
        C3().setStatus(c73306Spq);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C3().LJFF();
        v3().LLLF.LJZL(StoryArchListCell.class);
        v3().setItemAnimator(null);
        SYL v3 = v3();
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIZ(3, 0));
        gridLayoutManager.LLIILII = new IDcS7S0200000_3(this, gridLayoutManager, 7);
        v3.setLayoutManager(gridLayoutManager);
        super.onViewCreated(view);
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.7Or
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C182357Dr c182357Dr = (C182357Dr) obj;
                c182357Dr.getClass();
                return C208708Ha.LIZ(c182357Dr);
            }
        }, null, new AqS185S0100000_3(this, 77), 6);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.7Op
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C182357Dr c182357Dr = (C182357Dr) obj;
                c182357Dr.getClass();
                return C208708Ha.LIZLLL(c182357Dr);
            }
        }, null, new AqS169S0100000_3(this, 415), null, null, 26, null);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.7Oq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C182357Dr c182357Dr = (C182357Dr) obj;
                c182357Dr.getClass();
                return C208708Ha.LIZJ(c182357Dr);
            }
        }, null, new AqS169S0100000_3(this, 416), null, null, 26, null);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C9XU.LIZ(LIZ.hashCode(), this);
        }
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        GridLayoutManager gridLayoutManager;
        o.LJIIIZ(newConfig, "newConfig");
        C0A2 layoutManager = v3().getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManager) == null) {
            return;
        }
        gridLayoutManager.LLJLIL(LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIZ(3, 0));
    }
}
