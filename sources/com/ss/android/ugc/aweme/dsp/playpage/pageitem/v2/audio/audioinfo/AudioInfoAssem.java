package com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.audioinfo;

import X.AbstractC73672Svk;
import X.AbstractC91380Ztg;
import X.AbstractC91590Zx4;
import X.C16880lQ;
import X.C214348b8;
import X.C221108m2;
import X.C227768wm;
import X.C243119gR;
import X.C26045AKb;
import X.C40883G2t;
import X.C5H3;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77266UUc;
import X.C77869UhF;
import X.C78939UyV;
import X.C84763XOl;
import X.C8YN;
import X.C91234ZrK;
import X.C91264Zro;
import X.C91304ZsS;
import X.C91334Zsw;
import X.C91395Ztv;
import X.C91415ZuF;
import X.C91493ZvV;
import X.C91548ZwO;
import X.C91549ZwP;
import X.C91605ZxJ;
import X.C91615ZxT;
import X.C9BD;
import X.EnumC221088m0;
import X.EnumC91305ZsT;
import X.EnumC91310ZsY;
import X.EnumC91311ZsZ;
import X.HG3;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.InterfaceC91289ZsD;
import X.InterfaceC91296ZsK;
import X.J9P;
import X.ORZ;
import X.RBX;
import X.TBT;
import X.W5F;
import X.W5U;
import Y.IDCListenerS137S0100000_29;
import Y.IDObserverS226S0100000_29;
import Y.IDfS293S0100000_29;
import Y.IDgS353S0100000_29;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.dsp.IAudioCardUIStateAbility;
import com.ss.android.ugc.aweme.dsp.arch.BaseDspItemReusedAssem;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpirePlayableVM;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IEventDispatchAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.IDqS440S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class AudioInfoAssem extends BaseDspItemReusedAssem implements InterfaceC91289ZsD {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIJLIL;
    public C91395Ztv LLFII;
    public C91234ZrK LLFZ;
    public final C5H3 LLI;
    public final C5H3 LLIFFJFJJ;
    public final C5H3 LLII;
    public final C5H3 LLIIII;
    public final C5H3 LLIIIILZ;
    public View LLIIIJ;
    public final InterfaceC115514g7 LLIIIL;
    public final InterfaceC115514g7 LLIIIZ;
    public boolean LLIIJI;

    static {
        TBT tbt = new TBT(AudioInfoAssem.class, "followVM", "getFollowVM()Lcom/ss/android/ugc/aweme/dsp/playpage/pageitem/v2/audio/audioinfo/FollowViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        TBT tbt2 = new TBT(AudioInfoAssem.class, "expireVM", "getExpireVM()Lcom/ss/android/ugc/aweme/dsp/playerservice/plugin/expired/ExpirePlayableVM;", 0);
        c65351Pkp.getClass();
        LLIIJLIL = new InterfaceC74236TBo[]{tbt, tbt2};
    }

    @Override // X.InterfaceC91289ZsD
    public final void onBufferingUpdate(float f) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onCompletion() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlayableChanged(InterfaceC91296ZsK interfaceC91296ZsK) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackTimeChanged(long j) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepare() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepared() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onRenderStart() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onVideoSizeChanged(int i, int i2) {
    }

    public AudioInfoAssem() {
        new LinkedHashMap();
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LLI = C221108m2.LIZ(enumC221088m0, new IDqS421S0100000_29(this, 32));
        this.LLIFFJFJJ = C221108m2.LIZ(enumC221088m0, new IDqS421S0100000_29(this, 27));
        this.LLII = C221108m2.LIZ(enumC221088m0, new IDqS421S0100000_29(this, 28));
        this.LLIIII = C221108m2.LIZ(enumC221088m0, new IDqS421S0100000_29(this, 29));
        this.LLIIIILZ = C221108m2.LIZ(enumC221088m0, new IDqS421S0100000_29(this, 30));
        C65776Prg LIZ = C65352Pkq.LIZ(FollowViewModel.class);
        this.LLIIIL = C214348b8.LIZ(this, LIZ, null, new IDqS421S0100000_29(LIZ, 33), null, C91548ZwO.INSTANCE, null, null);
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(ExpirePlayableVM.class);
        this.LLIIIZ = C214348b8.LIZ(this, LIZ2, c9bd, new IDqS421S0100000_29(LIZ2, 34), null, C91549ZwP.INSTANCE, null, null);
    }

    public final void e4() {
        Integer num;
        String str;
        C91395Ztv c91395Ztv = this.LLFII;
        if (c91395Ztv == null || (num = c91395Ztv.LJZ) == null || num.intValue() != 0) {
            return;
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            Object LIZ = this.LLIIIL.LIZ(this, LLIIJLIL[0]);
            C91395Ztv c91395Ztv2 = this.LLFII;
            if (c91395Ztv2 == null) {
                return;
            }
            C91615ZxT c91615ZxT = new C91615ZxT(this);
            LIZ.getClass();
            Aweme aweme = c91395Ztv2.LJLLLL;
            String str2 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            C40883G2t c40883G2t = new C40883G2t();
            c40883G2t.LIZLLL("group_id", str);
            Aweme aweme2 = c91395Ztv2.LJLLLL;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            }
            c40883G2t.LIZLLL("author_id", str2);
            c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(str));
            J9P.LIZIZ(LJIIIIZZ, "", "click_favorite_video", (Bundle) c40883G2t.LIZ, new IDgS353S0100000_29(c91615ZxT, 2));
            return;
        }
        g4().playAnimation();
        FollowViewModel followViewModel = (FollowViewModel) this.LLIIIL.LIZ(this, LLIIJLIL[0]);
        C91395Ztv c91395Ztv3 = this.LLFII;
        if (c91395Ztv3 == null) {
            return;
        }
        followViewModel.getClass();
        MusicOwnerInfo musicOwnerInfo = c91395Ztv3.LJLZ;
        followViewModel.LJLIL.getValue().getClass();
        followViewModel.disposeOnClear(AbstractC73672Svk.LJIIJ(new C91493ZvV(C77266UUc.LIZIZ.getFollowPresenter(), musicOwnerInfo)).LJJJLIIL(new IDfS293S0100000_29(followViewModel, 8), C91415ZuF.LJLIL));
    }

    public final C77869UhF g4() {
        return (C77869UhF) this.LLIIIILZ.getValue();
    }

    public final void m4() {
        Integer num;
        C91395Ztv c91395Ztv = this.LLFII;
        if (c91395Ztv == null || (num = c91395Ztv.LJZ) == null || num.intValue() != 0) {
            C16880lQ.LJIILJJIL((FrameLayout) this.LLIIII.getValue(), null);
            if (!g4().isAnimating()) {
                g4().setProgress(1.0f);
                return;
            }
            return;
        }
        C16880lQ.LJIILJJIL((FrameLayout) this.LLIIII.getValue(), new IDCListenerS137S0100000_29(this, 9));
        g4().cancelAnimation();
        g4().setProgress(0.0f);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        AbstractC91590Zx4 HS;
        C91605ZxJ c91605ZxJ;
        C91334Zsw c91334Zsw;
        IAudioPlayerAbility LIZJ = C91264Zro.LIZJ(this);
        if (LIZJ != null && (HS = LIZJ.HS()) != null && (c91605ZxJ = HS.LJLILLLLZI) != null && (c91334Zsw = c91605ZxJ.LJLJI.LJLIL) != null) {
            c91334Zsw.LJIIL(this);
        }
    }

    public final void k4() {
        MusicOwnerInfo musicOwnerInfo;
        IContainerUtilityAbility LJ = C91264Zro.LJ(this);
        if (LJ != null && LJ.z3()) {
            return;
        }
        C91395Ztv c91395Ztv = this.LLFII;
        if (c91395Ztv == null || (musicOwnerInfo = c91395Ztv.LJLZ) == null) {
            View view = this.LLIIIJ;
            if (view != null) {
                C26045AKb c26045AKb = new C26045AKb(view);
                c26045AKb.LJIIIIZZ(R.string.igs);
                c26045AKb.LJIIJ();
                return;
            }
            o.LJIJI("cardRootView");
            throw null;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "aweme://user/profile/");
        buildRoute.withParam("uid", musicOwnerInfo.getUid());
        buildRoute.withParam("sec_user_id", musicOwnerInfo.getSecUid());
        buildRoute.open();
    }

    public final void l4() {
        EnumC91310ZsY enumC91310ZsY;
        AbstractC91590Zx4 HS;
        if (!b4()) {
            C91234ZrK c91234ZrK = this.LLFZ;
            if (c91234ZrK != null) {
                c91234ZrK.setMarqueeEnable(false);
                return;
            } else {
                o.LJIJI("songNameView");
                throw null;
            }
        }
        if (this.LLIIJI) {
            C91234ZrK c91234ZrK2 = this.LLFZ;
            if (c91234ZrK2 != null) {
                c91234ZrK2.setMarqueeEnable(false);
                return;
            } else {
                o.LJIJI("songNameView");
                throw null;
            }
        }
        IAudioPlayerAbility LIZJ = C91264Zro.LIZJ(this);
        if (LIZJ == null || (HS = LIZJ.HS()) == null || (enumC91310ZsY = HS.LJIJI()) == null) {
            enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_STOPPED;
        }
        if (enumC91310ZsY.isPlayingState()) {
            C91234ZrK c91234ZrK3 = this.LLFZ;
            if (c91234ZrK3 != null) {
                if (!c91234ZrK3.getMarqueeEnable()) {
                    C91234ZrK c91234ZrK4 = this.LLFZ;
                    if (c91234ZrK4 != null) {
                        c91234ZrK4.setMarqueeEnable(true);
                        return;
                    } else {
                        o.LJIJI("songNameView");
                        throw null;
                    }
                }
                C91234ZrK c91234ZrK5 = this.LLFZ;
                if (c91234ZrK5 != null) {
                    c91234ZrK5.LJLJJLL.resume();
                    return;
                } else {
                    o.LJIJI("songNameView");
                    throw null;
                }
            }
            o.LJIJI("songNameView");
            throw null;
        }
        if (enumC91310ZsY.isPauseState()) {
            C91234ZrK c91234ZrK6 = this.LLFZ;
            if (c91234ZrK6 != null) {
                c91234ZrK6.LJLJJLL.pause();
                return;
            } else {
                o.LJIJI("songNameView");
                throw null;
            }
        }
        C91234ZrK c91234ZrK7 = this.LLFZ;
        if (c91234ZrK7 != null) {
            if (!c91234ZrK7.getMarqueeEnable()) {
                return;
            }
            C91234ZrK c91234ZrK8 = this.LLFZ;
            if (c91234ZrK8 != null) {
                c91234ZrK8.setMarqueeEnable(false);
                return;
            } else {
                o.LJIJI("songNameView");
                throw null;
            }
        }
        o.LJIJI("songNameView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.dsp.arch.BaseDspItemReusedAssem, X.C8XO
    public final void unBind() {
        if (g4().isAnimating()) {
            g4().cancelAnimation();
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C91395Ztv c91395Ztv) {
        C91395Ztv item = c91395Ztv;
        o.LJIIIZ(item, "item");
        this.LLFII = item;
        C91234ZrK c91234ZrK = this.LLFZ;
        if (c91234ZrK != null) {
            c91234ZrK.setText(item.LJLLJ);
            Object LIZ = this.LLIIIZ.LIZ(this, LLIIJLIL[1]);
            String str = item.LJLJJL;
            boolean z = item.LJLJJLL;
            LIZ.getClass();
            this.LLIIJI = ExpirePlayableVM.gv0(str, z);
            if (item.LJLJLJ.getUrlList() != null && (!r0.isEmpty())) {
                ((ImageView) this.LLIFFJFJJ.getValue()).setVisibility(0);
                W5F LJII = W5U.LJII(C78939UyV.LJ(item.LJLJLJ));
                LJII.LJIIJJI = R.drawable.b7n;
                LJII.LJJIJIIJIL = true;
                LJII.LJJIIJ = (SmartImageView) this.LLIFFJFJJ.getValue();
                C16880lQ.LLJJJ(LJII);
            } else {
                ((ImageView) this.LLIFFJFJJ.getValue()).setVisibility(8);
            }
            ((TextView) this.LLII.getValue()).setText(item.LJLLL);
            m4();
            l4();
            return;
        }
        o.LJIJI("songNameView");
        throw null;
    }

    public final void n4(FollowStatus followStatus) {
        Music music;
        List<MusicOwnerInfo> musicOwnerInfos;
        MusicOwnerInfo musicOwnerInfo;
        String uid;
        C91395Ztv c91395Ztv;
        AbstractC91590Zx4 HS;
        AbstractC91380Ztg LJIIZILJ;
        CopyOnWriteArrayList<InterfaceC91296ZsK> copyOnWriteArrayList;
        List<MusicOwnerInfo> musicOwnerInfos2;
        MusicOwnerInfo musicOwnerInfo2;
        String uid2;
        IAudioPlayerAbility LIZJ = C91264Zro.LIZJ(this);
        if (LIZJ != null && (HS = LIZJ.HS()) != null && (LJIIZILJ = HS.LJIIZILJ()) != null && (copyOnWriteArrayList = LJIIZILJ.LJLIL) != null) {
            Iterator<InterfaceC91296ZsK> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC91296ZsK next = it.next();
                Music music2 = next.LJIIIIZZ().getDspMusic().getMusic();
                if (music2 != null && (musicOwnerInfos2 = music2.getMusicOwnerInfos()) != null && (musicOwnerInfo2 = (MusicOwnerInfo) ORZ.LJLLLL(musicOwnerInfos2)) != null && (uid2 = musicOwnerInfo2.getUid()) != null && o.LJ(uid2, followStatus.userId)) {
                    next.LJI(Integer.valueOf(followStatus.followStatus));
                }
            }
        }
        C91395Ztv c91395Ztv2 = this.LLFII;
        if (c91395Ztv2 == null || (music = c91395Ztv2.LJLLILLLL) == null || (musicOwnerInfos = music.getMusicOwnerInfos()) == null || (musicOwnerInfo = (MusicOwnerInfo) ORZ.LJLLLL(musicOwnerInfos)) == null || (uid = musicOwnerInfo.getUid()) == null || !o.LJ(uid, followStatus.userId) || (c91395Ztv = this.LLFII) == null) {
            return;
        }
        c91395Ztv.LJZ = Integer.valueOf(followStatus.followStatus);
    }

    @Override // X.InterfaceC91289ZsD
    public final void onError(C91304ZsS errorCode) {
        o.LJIIIZ(errorCode, "errorCode");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onLoadStateChanged(EnumC91305ZsT loadingState) {
        o.LJIIIZ(loadingState, "loadingState");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackStateChanged(EnumC91310ZsY currentState) {
        o.LJIIIZ(currentState, "currentState");
        C243119gR.LIZIZ(new IDqS421S0100000_29(this, 31));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        MutableLiveData RA;
        AbstractC91590Zx4 HS;
        C91605ZxJ c91605ZxJ;
        C91334Zsw c91334Zsw;
        MutableLiveData OO;
        o.LJIIIZ(view, "view");
        this.LLIIIJ = view;
        g4().loop(false);
        g4().setAnimation("lottie/music_dsp_author_follow.json");
        Object value = this.LLI.getValue();
        o.LJIIIIZZ(value, "<get-songNameLayout>(...)");
        ViewGroup viewGroup = (ViewGroup) value;
        Context context = viewGroup.getRootView().getContext();
        o.LJIIIIZZ(context, "rootView.context");
        C91234ZrK c91234ZrK = new C91234ZrK(context);
        c91234ZrK.setTuxFont(13);
        c91234ZrK.setImportantForAccessibility(2);
        this.LLFZ = c91234ZrK;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) g0.LJIJJ(31));
        C91234ZrK c91234ZrK2 = this.LLFZ;
        if (c91234ZrK2 != null) {
            viewGroup.addView(c91234ZrK2, layoutParams);
            IAudioCardUIStateAbility LIZ = C91264Zro.LIZ(this);
            if (LIZ != null && (OO = LIZ.OO()) != null) {
                OO.observe(this, new IDObserverS226S0100000_29(this, 11));
            }
            IAudioPlayerAbility LIZJ = C91264Zro.LIZJ(this);
            if (LIZJ != null && (HS = LIZJ.HS()) != null && (c91605ZxJ = HS.LJLILLLLZI) != null && (c91334Zsw = c91605ZxJ.LJLJI.LJLIL) != null) {
                c91334Zsw.LJII(this);
            }
            C16880lQ.LJJJJL((SmartAvatarImageView) this.LLIFFJFJJ.getValue(), new IDCListenerS137S0100000_29(this, 2));
            C16880lQ.LJJJJI((TuxTextView) this.LLII.getValue(), new IDCListenerS137S0100000_29(this, 3));
            IEventDispatchAbility LIZIZ = C91264Zro.LIZIZ(this);
            if (LIZIZ != null && (RA = LIZIZ.RA()) != null) {
                RA.observe(this, new IDObserverS226S0100000_29(this, 12));
            }
            C8YN.LJIIJ(this, (AssemViewModel) this.LLIIIL.LIZ(this, LLIIJLIL[0]), new TBT() { // from class: X.Zxb
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((C91414ZuE) obj).LJLIL);
                }
            }, new TBT() { // from class: X.Zxc
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C91414ZuE) obj).LJLILLLLZI;
                }
            }, null, new IDqS440S0100000_29(this, 0), 12);
            return;
        }
        o.LJIJI("songNameView");
        throw null;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onSeekStateChanged(EnumC91311ZsZ seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
    }
}
