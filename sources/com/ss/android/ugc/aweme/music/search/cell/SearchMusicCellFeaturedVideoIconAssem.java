package com.ss.android.ugc.aweme.music.search.cell;

import X.C16880lQ;
import X.C214348b8;
import X.C240719cZ;
import X.C240999d1;
import X.C241909eU;
import X.C241929eW;
import X.C241949eY;
import X.C241999ed;
import X.C26045AKb;
import X.C51029K0z;
import X.C61845OOz;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8YN;
import X.C9BE;
import X.HG3;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.RBX;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultFeaturedVideoIconAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellFeaturedVideosIconViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchMusicCellFeaturedVideoIconAssem extends DefaultFeaturedVideoIconAssem {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public final InterfaceC115514g7 LLFII;
    public final InterfaceC115514g7 LLFZ;

    static {
        TBT tbt = new TBT(SearchMusicCellFeaturedVideoIconAssem.class, "featuredVideosIconViewModel", "getFeaturedVideosIconViewModel()Lcom/ss/android/ugc/aweme/music/assem/list/cell/v2/MusicCellFeaturedVideosIconViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(SearchMusicCellFeaturedVideoIconAssem.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0, c65351Pkp)};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, (AssemViewModel) this.LLFII.LIZ(this, LLI[0]), new TBT() { // from class: X.9eb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C241959eZ) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 125), 6);
    }

    public SearchMusicCellFeaturedVideoIconAssem() {
        new LinkedHashMap();
        C240999d1 c240999d1 = C240999d1.LIZ;
        C241929eW c241929eW = C241929eW.LJLIL;
        C241949eY c241949eY = C241949eY.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicCellFeaturedVideosIconViewModel.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, c240999d1, new AqS154S0100000_4(LIZ, 479), null, C241999ed.INSTANCE, c241929eW, c241949eY);
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 478);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MusicPlayViewModel.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ2, c9be, new AqS154S0100000_4(LIZ2, 480), aqS154S0100000_4, C241909eU.INSTANCE, null, null);
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultFeaturedVideoIconAssem, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(C240719cZ c240719cZ) {
        q4(c240719cZ);
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultFeaturedVideoIconAssem
    /* renamed from: m4 */
    public final void q4(C240719cZ item) {
        o.LJIIIZ(item, "item");
        super.q4(item);
        MusicCellFeaturedVideosIconViewModel musicCellFeaturedVideosIconViewModel = (MusicCellFeaturedVideosIconViewModel) this.LLFII.LIZ(this, LLI[0]);
        String musicId = item.LJLIL.getMusicId();
        o.LJIIIIZZ(musicId, "item.musicModel.musicId");
        musicCellFeaturedVideosIconViewModel.getClass();
        musicCellFeaturedVideosIconViewModel.LJLIL = musicId;
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultFeaturedVideoIconAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        TuxIconView tuxIconView = this.LLFF;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(this, 89));
        }
        TuxIconView tuxIconView2 = this.LLFFF;
        if (tuxIconView2 != null) {
            C16880lQ.LJJJ(tuxIconView2, new ACListenerS24S0100000_4(this, 90));
        }
    }

    public final void p4(boolean z) {
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser != null && curUser.isAccuratePrivateAccount()) {
            C26045AKb c26045AKb = new C26045AKb(getContainerView());
            c26045AKb.LJIIIIZZ(R.string.gcx);
            c26045AKb.LJIIJ();
        } else {
            if (z) {
                ((MusicPlayViewModel) this.LLFZ.LIZ(this, LLI[1])).lv0((C240719cZ) C51029K0z.LJIILLIIL(this), C51029K0z.LJIIZILJ(this), true);
                return;
            }
            Object LIZ = this.LLFZ.LIZ(this, LLI[1]);
            MusicModel musicModel = ((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLIL;
            LIZ.getClass();
            MusicPlayViewModel.kv0(musicModel);
        }
    }
}
