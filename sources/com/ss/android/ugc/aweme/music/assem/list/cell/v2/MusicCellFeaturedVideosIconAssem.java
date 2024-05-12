package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C16880lQ;
import X.C188727au;
import X.C213688a4;
import X.C214348b8;
import X.C240719cZ;
import X.C240999d1;
import X.C241899eT;
import X.C241919eV;
import X.C241939eX;
import X.C241989ec;
import X.C26045AKb;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C61845OOz;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8YN;
import X.C9BE;
import X.FMX;
import X.HG3;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.RBX;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicCellFeaturedVideosIconAssem extends DefaultFeaturedVideoIconAssem {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final C55749LuL LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final InterfaceC115514g7 LLI;

    static {
        TBT tbt = new TBT(MusicCellFeaturedVideosIconAssem.class, "featuredVideosIconViewModel", "getFeaturedVideosIconViewModel()Lcom/ss/android/ugc/aweme/music/assem/list/cell/v2/MusicCellFeaturedVideosIconViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(MusicCellFeaturedVideosIconAssem.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0, c65351Pkp)};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.LIZ(this, LLIFFJFJJ[0]), new TBT() { // from class: X.9ea
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C241959eZ) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 119), 4);
    }

    public MusicCellFeaturedVideosIconAssem() {
        new LinkedHashMap();
        this.LLFII = new C55749LuL(C47704Ins.LIZJ(this, OriginMusicArg.class, null), checkSupervisorPrepared());
        C240999d1 c240999d1 = C240999d1.LIZ;
        C241919eV c241919eV = C241919eV.LJLIL;
        C241939eX c241939eX = C241939eX.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicCellFeaturedVideosIconViewModel.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, c240999d1, new AqS154S0100000_4(LIZ, 442), null, C241989ec.INSTANCE, c241919eV, c241939eX);
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 441);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MusicPlayViewModel.class);
        this.LLI = C214348b8.LIZ(this, LIZ2, c9be, new AqS154S0100000_4(LIZ2, 443), aqS154S0100000_4, C241899eT.INSTANCE, null, null);
    }

    public final void q4() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("button_name", "plus");
        String userId = ((OriginMusicArg) this.LLFII.getValue()).getUserId();
        if (userId == null) {
            userId = "";
        }
        c188727au.LJIIIZ("to_user_id", userId);
        c188727au.LIZLLL(((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLILLLLZI.LJLILLLLZI ? 1 : 0, "highlight");
        FMX.LJIIL("new_song_click", c188727au.LIZ);
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
        MusicCellFeaturedVideosIconViewModel musicCellFeaturedVideosIconViewModel = (MusicCellFeaturedVideosIconViewModel) this.LLFZ.LIZ(this, LLIFFJFJJ[0]);
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
            C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(this, 80));
        }
        TuxIconView tuxIconView2 = this.LLFFF;
        if (tuxIconView2 != null) {
            C16880lQ.LJJJ(tuxIconView2, new ACListenerS24S0100000_4(this, 81));
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
                ((MusicPlayViewModel) this.LLI.LIZ(this, LLIFFJFJJ[1])).lv0((C240719cZ) C51029K0z.LJIILLIIL(this), C51029K0z.LJIIZILJ(this), true);
                return;
            }
            Object LIZ = this.LLI.LIZ(this, LLIFFJFJJ[1]);
            MusicModel musicModel = ((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLIL;
            LIZ.getClass();
            MusicPlayViewModel.kv0(musicModel);
        }
    }
}
