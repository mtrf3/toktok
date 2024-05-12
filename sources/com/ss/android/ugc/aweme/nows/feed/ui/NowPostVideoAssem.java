package com.ss.android.ugc.aweme.nows.feed.ui;

import X.AbstractC181797Bn;
import X.AbstractC193947jK;
import X.AbstractC196927o8;
import X.C16880lQ;
import X.C181807Bo;
import X.C181837Br;
import X.C181847Bs;
import X.C193867jC;
import X.C193887jE;
import X.C193897jF;
import X.C194237jn;
import X.C194437k7;
import X.C195657m5;
import X.C195937mX;
import X.C196157mt;
import X.C196287n6;
import X.C196297n7;
import X.C196367nE;
import X.C196387nG;
import X.C196477nP;
import X.C196547nW;
import X.C196757nr;
import X.C196777nt;
import X.C196807nw;
import X.C196817nx;
import X.C196867o2;
import X.C196877o3;
import X.C196887o4;
import X.C196897o5;
import X.C196947oA;
import X.C196957oB;
import X.C196987oE;
import X.C197057oL;
import X.C197387os;
import X.C1JI;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C25620zW;
import X.C32151Nz;
import X.C44384HbQ;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C62682Ois;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78565UsT;
import X.C78897Uxp;
import X.C7MK;
import X.C7ML;
import X.C7NO;
import X.C7NP;
import X.C7XD;
import X.C7YD;
import X.C8YN;
import X.CME;
import X.EF7;
import X.EnumC181857Bt;
import X.EnumC196787nu;
import X.EnumC196967oC;
import X.EnumC197067oM;
import X.EnumC47177IfN;
import X.IPG;
import X.IPH;
import X.IT4;
import X.InterfaceC115514g7;
import X.InterfaceC194547kI;
import X.InterfaceC196737np;
import X.InterfaceC197017oH;
import X.InterfaceC197277oh;
import X.InterfaceC197787pW;
import X.InterfaceC46540IOi;
import X.InterfaceC46541IOj;
import X.InterfaceC46811IYt;
import X.InterfaceC74236TBo;
import X.S3I;
import X.S3L;
import X.TBT;
import X.X1D;
import Y.ACListenerS23S0100000_3;
import Y.AObserverS71S0100000_3;
import Y.IDCListenerS243S0100000_3;
import android.content.IntentFilter;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.nows.feed.common.MarkReadApi;
import com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionAbility;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowAreaMonitorViewModel;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowShareViewModel;
import com.ss.android.ugc.aweme.nows.player.strategy.LifecycleStrategy;
import com.ss.android.ugc.aweme.nows.player.util.PlayerPositionStore;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS11S0401000_3;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS27S0210000_3;
import kotlin.jvm.internal.AqS54S0201000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class NowPostVideoAssem extends NowPostTypeAssem<NowPostVideoAssem, C195657m5> implements InterfaceC197787pW, InterfaceC46540IOi {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIL;
    public static boolean LLILII;
    public final InterfaceC115514g7 LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;
    public final C196477nP LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final C55749LuL LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public long LLIILII;
    public boolean LLIILZL;
    public final C62822Ol8 LLIIZ;

    static {
        TBT tbt = new TBT(NowPostVideoAssem.class, "shareVM", "getShareVM()Lcom/ss/android/ugc/aweme/nows/interaction/viewmodel/NowShareViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIL = new InterfaceC74236TBo[]{tbt, new TBT(NowPostVideoAssem.class, "areaMonitorVM", "getAreaMonitorVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowAreaMonitorViewModel;", 0)};
        LLILII = true;
    }

    @Override // X.IZ2
    public final /* synthetic */ void Q2() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.byr;
    }

    @Override // X.IZ2
    public final /* synthetic */ Surface getSurface() {
        return null;
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onBuffering(String str, boolean z) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onBuffering(boolean z) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPausePlay(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayCompleted(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayFailed(IPG ipg) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayPrepare(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayProgressChange(float f) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayRelease(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayStop(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
    public final /* synthetic */ void onPreRenderReady(String str) {
        C196987oE.LIZ(this, str);
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPreparePlay(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onRenderFirstFrame(IT4 it4) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onRenderReady(IPH iph) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onResumePlay(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onRetryOnError(IPG ipg) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onRetryOnError(String str, IPG ipg) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onSeekEnd(String str, boolean z) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
    }

    public NowPostVideoAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowShareViewModel.class);
        this.LLI = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 634), null, C196867o2.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(NowAreaMonitorViewModel.class);
        this.LLIFFJFJJ = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 635), null, C196877o3.INSTANCE, null, null);
        this.LLII = C1JI.LJJIII(this);
        this.LLIIII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 628));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 627));
        this.LLIIIJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 633));
        this.LLIIIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 630));
        this.LLIIIZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 629));
        this.LLIIJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 636));
        this.LLIIJLIL = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
        this.LLIIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 632));
        this.LLIIZ = C221108m2.LIZIZ(C196817nx.LJLIL);
    }

    public final TuxIconView A4() {
        Object value = this.LLIIIL.getValue();
        o.LJIIIIZZ(value, "<get-loadRing>(...)");
        return (TuxIconView) value;
    }

    public final C181847Bs B4() {
        return (C181847Bs) this.LLIIJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        if (!this.LJLLL) {
            return;
        }
        Y3().post(new Runnable() { // from class: X.7ns
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    C196777nt.LJLIL.getClass();
                    if (C196777nt.LJLJI && C196777nt.LJLJJL != null) {
                        C16880lQ.LJJLIIIJL(EF7.LIZIZ(), C196777nt.LJLJJL);
                        C196777nt.LJLJJL = null;
                        C196777nt.LJLJI = false;
                    }
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public final InterfaceC196737np getPlayer() {
        return (InterfaceC196737np) this.LLII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.NowPostTypeAssem
    public final SmartImageView n4() {
        Object value = this.LLIIIZ.getValue();
        o.LJIIIIZZ(value, "<get-largeWindow>(...)");
        return (SmartImageView) value;
    }

    public final SmartImageView u4() {
        Object value = this.LLIIIILZ.getValue();
        o.LJIIIIZZ(value, "<get-ivCover>(...)");
        return (SmartImageView) value;
    }

    public final TuxIconView z4() {
        Object value = this.LLIIII.getValue();
        o.LJIIIIZZ(value, "<get-ivMute>(...)");
        return (TuxIconView) value;
    }

    public final void C4() {
        InterfaceC196737np player;
        int i;
        C197057oL LJIIJ;
        C196947oA c196947oA;
        InterfaceC196737np player2 = getPlayer();
        if ((player2 == null || (LJIIJ = player2.LJIIJ()) == null || (c196947oA = LJIIJ.LIZJ) == null || !c196947oA.LJLIL) && (player = getPlayer()) != null) {
            player.LJIILLIIL(isMute());
        }
        if (isMute()) {
            i = R.raw.icon_speaker_x_mark_fill_ltr;
        } else {
            i = R.raw.icon_speaker_2_fill_ltr;
        }
        z4().setIconRes(i);
    }

    public final void E4() {
        InterfaceC197017oH playState;
        InterfaceC196737np player;
        InterfaceC196737np player2 = getPlayer();
        if (player2 != null && (playState = player2.getPlayState()) != null && playState.isPlaying() && (player = getPlayer()) != null && player.LJIIL(this)) {
            return;
        }
        u4().setVisibility(0);
    }

    @Override // X.InterfaceC197787pW, X.IZ2
    public final FrameLayout LJJLIIIJLJLI() {
        View findViewById = Y3().findViewById(R.id.dhu);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.fl_video_container)");
        return (FrameLayout) findViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isMute() {
        /*
            r6 = this;
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r6)
            X.7m5 r0 = (X.C195657m5) r0
            boolean r0 = r0.LJLJLJ
            r5 = 0
            if (r0 == 0) goto Lc
            return r5
        Lc:
            X.JYH r4 = X.JYH.LIZIZ
            boolean r0 = r4.LJIIJ()
            if (r0 == 0) goto L42
            X.7nt r3 = X.C196777nt.LJLIL
            r3.getClass()
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r2 = X.C196777nt.LJLILLLLZI
            java.lang.Object r0 = r2.getValue()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 != 0) goto L42
            r3.getClass()
            r2.setValue(r1)
        L2d:
            X.7nt r0 = X.C196777nt.LJLIL
            r0.getClass()
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = X.C196777nt.LJLILLLLZI
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L3d
        L3c:
            return r5
        L3d:
            boolean r5 = r0.booleanValue()
            goto L3c
        L42:
            boolean r0 = r4.LJIIJJI()
            if (r0 == 0) goto L2d
            boolean r0 = com.ss.android.ugc.aweme.nows.feed.ui.NowPostVideoAssem.LLILII
            if (r0 == 0) goto L2d
            com.ss.android.ugc.aweme.nows.feed.ui.NowPostVideoAssem.LLILII = r5
            X.7nt r3 = X.C196777nt.LJLIL
            r3.getClass()
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r2 = X.C196777nt.LJLILLLLZI
            java.lang.Object r0 = r2.getValue()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 != 0) goto L2d
            r3.getClass()
            r2.setValue(r1)
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.feed.ui.NowPostVideoAssem.isMute():boolean");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C196777nt.LJLIL.getClass();
        if (C196777nt.LJLJI) {
            return;
        }
        C196777nt.LJLJJL = new CME();
        IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        C16880lQ.LJJLIIIJILLIZJL(C196777nt.LJLJJL, EF7.LIZIZ(), intentFilter);
        C196777nt.LJLJI = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [X.7pY] */
    public final void D4(AbstractC196927o8 abstractC196927o8) {
        InterfaceC197277oh LIZJ;
        C197057oL LJIIJ;
        InterfaceC46811IYt interfaceC46811IYt;
        String key;
        int i;
        C197057oL LLIZ;
        EnumC197067oM enumC197067oM;
        Lifecycle lifecycle;
        String str = "";
        InterfaceC197277oh interfaceC197277oh = null;
        int i2 = 0;
        if (abstractC196927o8 instanceof C196887o4) {
            PlayerPositionStore playerPositionStore = (PlayerPositionStore) this.LLIIL.getValue();
            if (playerPositionStore != null) {
                String aid = ((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL.getAid();
                if (aid != null) {
                    str = aid;
                }
                Integer num = (Integer) ((Map) playerPositionStore.LJLIL.getValue()).get(str);
                if (num != null) {
                    i = num.intValue();
                    LLIZ = C44384HbQ.LLIZ(((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL, i, isMute());
                    if (LLIZ.LIZ == EnumC197067oM.INVALID && LLIZ.LIZIZ != null) {
                        InterfaceC196737np player = getPlayer();
                        if (player != null) {
                            C197057oL LJIIJ2 = player.LJIIJ();
                            if (LJIIJ2 != null) {
                                enumC197067oM = LJIIJ2.LIZ;
                            } else {
                                enumC197067oM = null;
                            }
                            if (enumC197067oM != EnumC197067oM.VIDEO) {
                                InterfaceC196737np player2 = getPlayer();
                                if (player2 != null) {
                                    player2.reset();
                                }
                                Fragment LIZLLL = C212428Vi.LIZLLL(this);
                                if (LIZLLL == null || (lifecycle = LIZLLL.getLifecycle()) == null) {
                                    return;
                                }
                                InterfaceC196737np player3 = getPlayer();
                                if (player3 != null) {
                                    player3.LJIIIZ(LifecycleStrategy.class, new LifecycleStrategy(lifecycle));
                                }
                            }
                        }
                        InterfaceC196737np player4 = getPlayer();
                        if (player4 != null && player4.LJIIL(this)) {
                            InterfaceC196737np player5 = getPlayer();
                            if (player5 != null) {
                                C78565UsT.LJJJ(player5, LLIZ);
                                return;
                            }
                            return;
                        }
                        InterfaceC196737np player6 = getPlayer();
                        if (player6 != null) {
                            player6.LJIILIIL(this);
                        }
                        InterfaceC196737np player7 = getPlayer();
                        if (player7 != null) {
                            player7.LJII(this);
                        }
                        String LIZLLL2 = C7MK.LIZLLL(B4().LJLILLLLZI, (C7ML) C51029K0z.LJIILLIIL(this));
                        Aweme aweme = ((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL;
                        InterfaceC196737np player8 = getPlayer();
                        if (player8 != null) {
                            interfaceC197277oh = player8.LIZJ();
                        }
                        C196757nr c196757nr = new C196757nr(LIZLLL2, aweme, interfaceC197277oh);
                        InterfaceC196737np player9 = getPlayer();
                        if (player9 != 0) {
                            player9.LJIILL(new InterfaceC46541IOj(c196757nr) { // from class: X.7pY
                                public final C196757nr LIZ;

                                @Override // X.InterfaceC46541IOj
                                public final /* synthetic */ void LIZ() {
                                }

                                @Override // X.InterfaceC46541IOj
                                public final HashMap LIZIZ() {
                                    return C113554cx.LJJJLZIJ(new OSZ("enter_from", this.LIZ.LIZ), new OSZ("aweme_type", Integer.valueOf(LJII())));
                                }

                                @Override // X.InterfaceC46541IOj
                                public final HashMap LIZJ() {
                                    return C113554cx.LJJJLZIJ(new OSZ("enter_from", this.LIZ.LIZ), new OSZ("aweme_type", Integer.valueOf(LJII())));
                                }

                                @Override // X.InterfaceC46541IOj
                                public final HashMap LIZLLL() {
                                    return C113554cx.LJJJLZIJ(new OSZ("enter_from", this.LIZ.LIZ), new OSZ("aweme_type", Integer.valueOf(LJII())));
                                }

                                @Override // X.InterfaceC46541IOj
                                public final HashMap LJ() {
                                    String str2;
                                    Video video;
                                    OSZ[] oszArr = new OSZ[4];
                                    int i3 = 0;
                                    oszArr[0] = new OSZ("enter_from", this.LIZ.LIZ);
                                    oszArr[1] = new OSZ("aweme_type", Integer.valueOf(LJII()));
                                    Aweme aweme2 = this.LIZ.LIZIZ;
                                    if (aweme2 != null && (video = aweme2.getVideo()) != null) {
                                        i3 = video.getDuration();
                                    }
                                    oszArr[2] = new OSZ("duration", Integer.valueOf(i3));
                                    Aweme aweme3 = this.LIZ.LIZIZ;
                                    if (aweme3 != null) {
                                        str2 = aweme3.getAid();
                                    } else {
                                        str2 = null;
                                    }
                                    oszArr[3] = new OSZ("is_from_feed_cache", Integer.valueOf(C48236IwS.LJIILLIIL(str2) ? 1 : 0));
                                    return C113554cx.LJJJLZIJ(oszArr);
                                }

                                @Override // X.InterfaceC46541IOj
                                public final HashMap LJFF() {
                                    return C113554cx.LJJJLZIJ(new OSZ("enter_from", this.LIZ.LIZ), new OSZ("aweme_type", Integer.valueOf(LJII())));
                                }

                                public final int LJII() {
                                    Aweme aweme2 = this.LIZ.LIZIZ;
                                    if (aweme2 != null) {
                                        return aweme2.getAwemeType();
                                    }
                                    return 43;
                                }

                                @Override // X.InterfaceC46541IOj
                                public final HashMap LJI() {
                                    ITI videoInfo;
                                    C197817pZ c197817pZ;
                                    HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(new OSZ("enter_from", this.LIZ.LIZ), new OSZ("aweme_type", Integer.valueOf(LJII())), new OSZ("access", C16880lQ.LLJJ(EF7.LIZIZ())));
                                    InterfaceC197277oh interfaceC197277oh2 = this.LIZ.LIZJ;
                                    if (interfaceC197277oh2 != null && (videoInfo = interfaceC197277oh2.getVideoInfo()) != null && (c197817pZ = videoInfo.LJI) != null) {
                                        LJJJLZIJ.put("ffr_fst_data_dur", Long.valueOf(c197817pZ.LIZIZ));
                                        LJJJLZIJ.put("ffr_play_buf_dur", Long.valueOf(c197817pZ.LIZLLL));
                                        LJJJLZIJ.put("ffr_render_dur", Long.valueOf(c197817pZ.LIZJ));
                                        LJJJLZIJ.put("ffr_free_dur", Long.valueOf(c197817pZ.LIZ));
                                    }
                                    return LJJJLZIJ;
                                }

                                {
                                    this.LIZ = c196757nr;
                                }
                            });
                        }
                        InterfaceC196737np player10 = getPlayer();
                        if (player10 != null) {
                            player10.LJIIZILJ(LLIZ);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            i = 0;
            LLIZ = C44384HbQ.LLIZ(((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL, i, isMute());
            if (LLIZ.LIZ == EnumC197067oM.INVALID) {
                return;
            } else {
                return;
            }
        }
        if (abstractC196927o8 instanceof C196897o5) {
            InterfaceC196737np player11 = getPlayer();
            if (player11 != null && player11.LJIIL(this)) {
                InterfaceC196737np player12 = getPlayer();
                if (player12 != null && (LJIIJ = player12.LJIIJ()) != null && (interfaceC46811IYt = LJIIJ.LIZIZ) != null && (key = interfaceC46811IYt.getKey()) != null) {
                    str = key;
                }
                InterfaceC196737np player13 = getPlayer();
                if (player13 != null && (LIZJ = player13.LIZJ()) != null) {
                    i2 = (int) LIZJ.getCurrentPosition();
                }
                PlayerPositionStore playerPositionStore2 = (PlayerPositionStore) this.LLIIL.getValue();
                if (playerPositionStore2 != null) {
                    ((Map) playerPositionStore2.LJLIL.getValue()).put(str, Integer.valueOf(i2));
                }
                InterfaceC196737np player14 = getPlayer();
                if (player14 != null) {
                    player14.LJIIJJI(EnumC196787nu.CELL);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC196927o8.LIZ() != EnumC196967oC.LIFECYCLE_CHANGE && abstractC196927o8.LIZ() != EnumC196967oC.HOX_CHANGE) {
            InterfaceC196737np player15 = getPlayer();
            if (player15 != null && player15.LJIIL(this)) {
                this.LLIILZL = false;
                InterfaceC196737np player16 = getPlayer();
                if (player16 != null) {
                    player16.stop();
                }
            }
            PlayerPositionStore playerPositionStore3 = (PlayerPositionStore) this.LLIIL.getValue();
            if (playerPositionStore3 != null) {
                String aid2 = ((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL.getAid();
                if (aid2 != null) {
                    str = aid2;
                }
                ((Map) playerPositionStore3.LJLIL.getValue()).remove(str);
            }
            E4();
        }
    }

    @Override // X.C8XO
    public final void F0(Object obj) {
        UrlModel urlModel;
        int i;
        C195657m5 item = (C195657m5) obj;
        o.LJIIIZ(item, "item");
        if (LJJLIIIJLJLI().getChildCount() > 0) {
            LJJLIIIJLJLI().removeAllViews();
        }
        C194237jn.LIZ(this, p4());
        SmartImageView u4 = u4();
        C7ML c7ml = (C7ML) C51029K0z.LJIILLIIL(this);
        Video video = ((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL.getVideo();
        if (video != null) {
            urlModel = video.getCover();
        } else {
            urlModel = null;
        }
        C195937mX.LJIIJJI(u4, c7ml, 1, urlModel, null, null, 56);
        E4();
        C4();
        TuxIconView z4 = z4();
        if (!item.LJLJLJ) {
            i = 0;
        } else {
            i = 8;
        }
        z4.setVisibility(i);
        this.LLIILZL = false;
    }

    public final AbstractC196927o8 F4(AbstractC196927o8 abstractC196927o8) {
        AbstractC193947jK abstractC193947jK = p4().getState().LJLIL;
        if (!(abstractC193947jK instanceof C193887jE) && !(abstractC193947jK instanceof C193897jF)) {
            return C196957oB.LIZIZ;
        }
        return abstractC196927o8;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void N3(View view) {
        o.LJIIIZ(view, "view");
        if (C7YD.LIZ(this)) {
            return;
        }
        C196777nt.LJLIL.getClass();
        C196777nt.LJLILLLLZI.observe(this, new AObserverS71S0100000_3(this, 29));
        view.setLayoutDirection(0);
    }

    @Override // X.InterfaceC46540IOi
    public final void onPlayCompletedFirstTime(String str) {
        Integer num;
        if (this.LLIILII != 0 && o.LJ(str, ((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL.getAid())) {
            InterfaceC194547kI item = (InterfaceC194547kI) C51029K0z.LJIILLIIL(this);
            C181847Bs nowsFeedHierarchyData = B4();
            NowOtherCollectionAbility LJJ = C78897Uxp.LJJ(this);
            if (LJJ != null) {
                num = Integer.valueOf(LJJ.getCurrentPosition());
            } else {
                num = null;
            }
            AqS169S0100000_3 aqS169S0100000_3 = new AqS169S0100000_3(this, 320);
            o.LJIIIZ(item, "item");
            o.LJIIIZ(nowsFeedHierarchyData, "nowsFeedHierarchyData");
            C7MK.LJII("video_play_finish", new AqS11S0401000_3(1, item, nowsFeedHierarchyData, num, aqS169S0100000_3, 2));
        }
    }

    @Override // X.InterfaceC46540IOi
    public final void onPlayPause(String str) {
        Integer num;
        if (this.LLIILII != 0 && o.LJ(str, ((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL.getAid())) {
            InterfaceC194547kI interfaceC194547kI = (InterfaceC194547kI) C51029K0z.LJIILLIIL(this);
            C181847Bs B4 = B4();
            long currentTimeMillis = System.currentTimeMillis() - this.LLIILII;
            NowOtherCollectionAbility LJJ = C78897Uxp.LJJ(this);
            if (LJJ != null) {
                num = Integer.valueOf(LJJ.getCurrentPosition());
            } else {
                num = null;
            }
            C196157mt.LIZLLL(1, interfaceC194547kI, B4, currentTimeMillis, num);
            this.LLIILII = 0L;
        }
    }

    @Override // X.InterfaceC46540IOi
    public final void onPlaying(String str) {
        Integer num;
        AssemViewModel assemViewModel = (AssemViewModel) this.LLIFFJFJJ.LIZ(this, LLIL[1]);
        assemViewModel.setStateImmediate(C196297n7.LJLIL);
        AbstractC196927o8 F4 = F4(((C196287n6) assemViewModel.getState()).LJLIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("playing video, key: ");
        LIZ.append(str);
        LIZ.append(", state: ");
        LIZ.append(F4);
        LIZ.append(", feed type: ");
        LIZ.append(((C195657m5) C51029K0z.LJIILLIIL(this)).LJLJJI);
        C7XD.LIZ("NowPostVideoAssem", X1D.LIZIZ(LIZ));
        if (!(F4 instanceof C196887o4)) {
            InterfaceC196737np player = getPlayer();
            if (player != null) {
                player.stop();
                return;
            }
            return;
        }
        u4().setVisibility(8);
        A4().clearAnimation();
        A4().setVisibility(8);
        if (o.LJ(str, ((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL.getAid())) {
            C196367nE c196367nE = C196367nE.LIZ;
            InterfaceC194547kI interfaceC194547kI = (InterfaceC194547kI) C51029K0z.LJIILLIIL(this);
            c196367nE.getClass();
            if (C196367nE.LJIIIZ(interfaceC194547kI)) {
                InterfaceC194547kI item = (InterfaceC194547kI) C51029K0z.LJIILLIIL(this);
                C181847Bs nowsFeedHierarchyData = B4();
                o.LJIIIZ(item, "item");
                o.LJIIIZ(nowsFeedHierarchyData, "nowsFeedHierarchyData");
                C7MK.LJII("more_button_show", new AqS134S0200000_3(item, nowsFeedHierarchyData, 213));
            } else {
                InterfaceC194547kI item2 = (InterfaceC194547kI) C51029K0z.LJIILLIIL(this);
                C181847Bs nowsFeedHierarchyData2 = B4();
                o.LJIIIZ(item2, "item");
                o.LJIIIZ(nowsFeedHierarchyData2, "nowsFeedHierarchyData");
                C7MK.LJII("now_dot_button", new AqS54S0201000_3(1, item2, nowsFeedHierarchyData2, 8));
            }
            InterfaceC194547kI interfaceC194547kI2 = (InterfaceC194547kI) C51029K0z.LJIILLIIL(this);
            C181847Bs B4 = B4();
            NowOtherCollectionAbility LJJ = C78897Uxp.LJJ(this);
            if (LJJ != null) {
                num = Integer.valueOf(LJJ.getCurrentPosition());
            } else {
                num = null;
            }
            C196157mt.LJ(1, interfaceC194547kI2, B4, num, new AqS169S0100000_3(this, 321));
            this.LLIILII = System.currentTimeMillis();
            C197387os.LJLIL.LIZJ(((C195657m5) C51029K0z.LJIILLIIL(this)).LJLJJI);
            if (this.LLIILZL) {
                InterfaceC194547kI item3 = (InterfaceC194547kI) C51029K0z.LJIILLIIL(this);
                C181847Bs nowsFeedHierarchyData3 = B4();
                o.LJIIIZ(item3, "item");
                o.LJIIIZ(nowsFeedHierarchyData3, "nowsFeedHierarchyData");
                C7MK.LJII("click_now_retry", new AqS27S0210000_3(item3, nowsFeedHierarchyData3, true, 9));
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        Object value = this.LLIIIZ.getValue();
        o.LJIIIIZZ(value, "<get-largeWindow>(...)");
        S3I s3i = new S3I();
        s3i.LIZLLL = C32151Nz.LJIIZILJ(28);
        ((SmartImageView) value).setCircleOptions(new S3L(s3i));
        p4().hv0(this, C213688a4.LIZLLL());
        C16880lQ.LJJJ(z4(), new ACListenerS23S0100000_3(this, 101));
        view.addOnAttachStateChangeListener(new IDCListenerS243S0100000_3(new AqS153S0100000_3(this, 631), 2));
        C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.LIZ(this, LLIL[1]), new TBT() { // from class: X.7nz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C196287n6) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C196807nw.LJLIL, 4);
        C8YN.LJII(this, p4(), new TBT() { // from class: X.7nV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C194437k7) obj).LJLLI);
            }
        }, C213688a4.LIZLLL(), C196547nW.LJLIL, 4);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.NowPostTypeAssem, X.InterfaceC193877jD
    public final void t1(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        Object value = this.LLIIIZ.getValue();
        o.LJIIIIZZ(value, "<get-largeWindow>(...)");
        ((ImageView) value).setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.NowPostTypeAssem, X.InterfaceC193877jD
    public final void x1(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        this.LLIILZL = false;
        Object value = this.LLIIIJ.getValue();
        o.LJIIIIZZ(value, "<get-retryLoadBtn>(...)");
        ((ImageView) value).setVisibility(0);
        A4().clearAnimation();
        A4().setVisibility(8);
        Object value2 = this.LLIIIJ.getValue();
        o.LJIIIIZZ(value2, "<get-retryLoadBtn>(...)");
        C16880lQ.LJJJ((TuxIconView) value2, new ACListenerS23S0100000_3(this, 100));
        C196157mt.LIZJ((InterfaceC194547kI) C51029K0z.LJIILLIIL(this), B4());
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.NowPostTypeAssem, X.InterfaceC194257jp
    public final void LLIIJLIL(AbstractC193947jK cellState, C194437k7 nowPostCellState) {
        o.LJIIIZ(cellState, "cellState");
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        C193867jC.LIZ(this, cellState, nowPostCellState);
        Object value = this.LLIIJI.getValue();
        o.LJIIIIZZ(value, "<get-videoRootView>(...)");
        View view = (View) value;
        AbstractC193947jK abstractC193947jK = nowPostCellState.LJLIL;
        int i = 0;
        if (!(abstractC193947jK instanceof C193887jE) && !(abstractC193947jK instanceof C193897jF)) {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // X.InterfaceC46540IOi
    public final void onPlayCompleted(String sourceId, int i) {
        o.LJIIIZ(sourceId, "sourceId");
        if (C44384HbQ.LJIIJJI(((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL) && i >= 2) {
            C196387nG c196387nG = (C196387nG) C196387nG.LIZJ.getValue();
            c196387nG.getClass();
            CopyOnWriteArrayList<String> copyOnWriteArrayList = c196387nG.LIZ;
            o.LJI(copyOnWriteArrayList);
            if (!copyOnWriteArrayList.contains(sourceId)) {
                StringBuilder LIZIZ = C25620zW.LIZIZ("onPlayCompleted(", sourceId, ", ");
                C181807Bo c181807Bo = new AbstractC181797Bn() { // from class: X.7Bo
                    public final String toString() {
                        return "2";
                    }
                };
                LIZIZ.append(c181807Bo);
                LIZIZ.append(')');
                C7XD.LIZ("NowPostVideoAssem", X1D.LIZIZ(LIZIZ));
                C181837Br.LIZ = c181807Bo;
                ((NowShareViewModel) this.LLI.LIZ(this, LLIL[0])).jv0(EnumC181857Bt.FLIP, (InterfaceC194547kI) C51029K0z.LJIILLIIL(this));
            }
        }
    }

    @Override // X.InterfaceC46540IOi
    public final void onPlayFailed(String str, IPG ipg) {
        if (o.LJ(str, ((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL.getAid())) {
            if (this.LLIILZL) {
                InterfaceC194547kI item = (InterfaceC194547kI) C51029K0z.LJIILLIIL(this);
                C181847Bs nowsFeedHierarchyData = B4();
                o.LJIIIZ(item, "item");
                o.LJIIIZ(nowsFeedHierarchyData, "nowsFeedHierarchyData");
                C7MK.LJII("click_now_retry", new AqS27S0210000_3(item, nowsFeedHierarchyData, false, 9));
            }
            p4().jv0(C193897jF.LIZIZ);
        }
    }

    @Override // X.InterfaceC46540IOi
    public final void onRenderFirstFrame(String str, IT4 it4) {
        String str2;
        int i;
        u4().setVisibility(8);
        String str3 = null;
        if (it4 == null || (str2 = it4.getId()) == null) {
            str2 = "";
        }
        if (str2.length() > 0) {
            int awemeType = ((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL.getAwemeType();
            C7NP c7np = MarkReadApi.LIZ;
            C7NO c7no = C7NO.VISIBLE;
            String authorUid = ((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL.getAuthorUid();
            c7np.getClass();
            C7NP.LIZ(awemeType, str2, c7no, "video onRenderFirstFrame", authorUid);
        }
        String LIZLLL = C7MK.LIZLLL(B4().LJLILLLLZI, (C7ML) C51029K0z.LJIILLIIL(this));
        int i2 = ((C195657m5) C51029K0z.LJIILLIIL(this)).LJLJJI;
        if (i2 != 2) {
            if (i2 != 5) {
                i = 34;
            } else {
                i = 31;
            }
        } else {
            i = 0;
        }
        if (it4 != null) {
            str3 = it4.getId();
        }
        C62682Ois.LIZ(LIZLLL, i, str3, ((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL.getAwemeType(), ((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL, ((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL.getRequestId());
        C78565UsT.LJJJI(C212428Vi.LIZLLL(this), ((C195657m5) C51029K0z.LJIILLIIL(this)).LJLIL);
    }
}
