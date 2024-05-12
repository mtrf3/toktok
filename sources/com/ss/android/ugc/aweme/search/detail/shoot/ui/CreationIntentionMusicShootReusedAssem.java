package com.ss.android.ugc.aweme.search.detail.shoot.ui;

import X.C213688a4;
import X.C214348b8;
import X.C2309694q;
import X.C2309794r;
import X.C5H3;
import X.C61845OOz;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8XO;
import X.C8YN;
import X.C97V;
import X.C97W;
import X.C97X;
import X.C9BD;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.detail.shoot.viewmodel.CreationIntentionMusicShootVM;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CreationIntentionMusicShootReusedAssem extends ReusedAssem<CreationIntentionMusicShootReusedAssem> implements C8XO<VideoItemParams> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final C5H3 LJLLLL;

    static {
        TBT tbt = new TBT(CreationIntentionMusicShootReusedAssem.class, "baseMusicVM", "getBaseMusicVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicBaseVM;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLLLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(CreationIntentionMusicShootReusedAssem.class, "creationIntentionVM", "getCreationIntentionVM()Lcom/ss/android/ugc/aweme/search/detail/shoot/viewmodel/CreationIntentionMusicShootVM;", 0, c65351Pkp)};
    }

    public CreationIntentionMusicShootReusedAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(VideoMusicBaseVM.class);
        this.LJLLJ = C214348b8.LIZ(this, LIZ, null, new AqS154S0100000_4(LIZ, 777), null, C2309794r.INSTANCE, null, null);
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(CreationIntentionMusicShootVM.class);
        this.LJLLL = C214348b8.LIZ(this, LIZ2, c9bd, new AqS154S0100000_4(LIZ2, 778), null, C2309694q.INSTANCE, null, null);
        this.LJLLLL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C97X.INSTANCE);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8YN.LJII(this, (AssemViewModel) this.LJLLL.LIZ(this, LJLLLLLL[1]), new TBT() { // from class: X.92i
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2303592h) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C97V.LJLIL, 4);
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LJLLLL.getValue(), new TBT() { // from class: X.8Uw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C97W.LJLIL, 4);
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(VideoItemParams videoItemParams) {
    }
}
