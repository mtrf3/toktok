package com.ss.android.ugc.aweme.nows.feed.ui;

import X.AbstractC196927o8;
import X.C193847jA;
import X.C194437k7;
import X.C196287n6;
import X.C196297n7;
import X.C196477nP;
import X.C196797nv;
import X.C196847o0;
import X.C196857o1;
import X.C196887o4;
import X.C196897o5;
import X.C196957oB;
import X.C196987oE;
import X.C197057oL;
import X.C1JI;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C44384HbQ;
import X.C51029K0z;
import X.C61845OOz;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78565UsT;
import X.C78596Usy;
import X.C7ML;
import X.C7XD;
import X.C8XO;
import X.C8YN;
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
import X.InterfaceC197277oh;
import X.InterfaceC197787pW;
import X.InterfaceC46540IOi;
import X.InterfaceC46811IYt;
import X.InterfaceC74236TBo;
import X.TBT;
import X.X1D;
import Y.IDCListenerS243S0100000_3;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowAreaMonitorViewModel;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import com.ss.android.ugc.aweme.nows.player.strategy.LifecycleStrategy;
import com.ss.android.ugc.aweme.nows.player.util.PlayerPositionStore;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class NowPostAudioAssem extends ReusedUIContentAssem<NowPostAudioAssem> implements C8XO<InterfaceC194547kI>, InterfaceC46540IOi, InterfaceC197787pW {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFF;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final C196477nP LLD;
    public final C62822Ol8 LLF;

    static {
        TBT tbt = new TBT(NowPostAudioAssem.class, "nowCellVM", "getNowCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(NowPostAudioAssem.class, "areaMonitorVM", "getAreaMonitorVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowAreaMonitorViewModel;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC197787pW, X.IZ2
    public final FrameLayout LJJLIIIJLJLI() {
        return null;
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.IZ2
    public final /* synthetic */ void Q2() {
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
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayFailed(IPG ipg) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayPause(String str) {
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
    public final /* synthetic */ void onRenderFirstFrame(String str, IT4 it4) {
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

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowPostAudioAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LJZL = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 606), null, C196847o0.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(NowAreaMonitorViewModel.class);
        this.LL = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 607), null, C196857o1.INSTANCE, null, null);
        this.LLD = C1JI.LJJIII(this);
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 605));
    }

    public final InterfaceC196737np getPlayer() {
        return (InterfaceC196737np) this.LLD.getValue();
    }

    @Override // X.C8XO
    public final void F0(InterfaceC194547kI item) {
        o.LJIIIZ(item, "item");
    }

    public final void Z3(AbstractC196927o8 abstractC196927o8) {
        InterfaceC196737np player;
        String str;
        InterfaceC197277oh LIZJ;
        C197057oL LJIIJ;
        InterfaceC46811IYt interfaceC46811IYt;
        int i;
        C197057oL LLILL;
        final Lifecycle lifecycle;
        EnumC197067oM enumC197067oM = null;
        int i2 = 0;
        if (abstractC196927o8 instanceof C196887o4) {
            PlayerPositionStore playerPositionStore = (PlayerPositionStore) this.LLF.getValue();
            if (playerPositionStore != null) {
                String key = C44384HbQ.LJIIJ(((C7ML) C51029K0z.LJIILLIIL(this)).getAweme());
                o.LJIIIZ(key, "key");
                Integer num = (Integer) ((Map) playerPositionStore.LJLIL.getValue()).get(key);
                if (num != null) {
                    i = num.intValue();
                    LLILL = C44384HbQ.LLILL(((C7ML) C51029K0z.LJIILLIIL(this)).getAweme(), i, 1);
                    if (LLILL.LIZ == EnumC197067oM.INVALID && LLILL.LIZIZ != null) {
                        InterfaceC196737np player2 = getPlayer();
                        if (player2 != null) {
                            C197057oL LJIIJ2 = player2.LJIIJ();
                            if (LJIIJ2 != null) {
                                enumC197067oM = LJIIJ2.LIZ;
                            }
                            if (enumC197067oM != EnumC197067oM.AUDIO) {
                                InterfaceC196737np player3 = getPlayer();
                                if (player3 != null) {
                                    player3.reset();
                                }
                                Fragment LIZLLL = C212428Vi.LIZLLL(this);
                                if (LIZLLL == null || (lifecycle = LIZLLL.getLifecycle()) == null) {
                                    return;
                                }
                                LifecycleStrategy lifecycleStrategy = new LifecycleStrategy(lifecycle) { // from class: com.ss.android.ugc.aweme.nows.feed.ui.NowPostAudioAssem$handlePlayState$strategy$1
                                    @Override // com.ss.android.ugc.aweme.nows.player.strategy.LifecycleStrategy, androidx.lifecycle.LifecycleEventObserver
                                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                                        super.onStateChanged(lifecycleOwner, event);
                                    }

                                    @Override // com.ss.android.ugc.aweme.nows.player.strategy.LifecycleStrategy
                                    public final void onResume() {
                                        if (C78596Usy.LJJIFFI().LIZJ.LIZ.size() > 0) {
                                            return;
                                        }
                                        super.onResume();
                                    }
                                };
                                InterfaceC196737np player4 = getPlayer();
                                if (player4 != null) {
                                    player4.LJIIIZ(LifecycleStrategy.class, lifecycleStrategy);
                                }
                            }
                        }
                        InterfaceC196737np player5 = getPlayer();
                        if (player5 != null && player5.LJIIL(this)) {
                            InterfaceC196737np player6 = getPlayer();
                            if (player6 != null) {
                                C78565UsT.LJJJ(player6, LLILL);
                                return;
                            }
                            return;
                        }
                        InterfaceC196737np player7 = getPlayer();
                        if (player7 != null) {
                            player7.LJIILIIL(this);
                        }
                        InterfaceC196737np player8 = getPlayer();
                        if (player8 != null) {
                            player8.LJII(this);
                        }
                        InterfaceC196737np player9 = getPlayer();
                        if (player9 != null) {
                            player9.LJIIZILJ(LLILL);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            i = 0;
            LLILL = C44384HbQ.LLILL(((C7ML) C51029K0z.LJIILLIIL(this)).getAweme(), i, 1);
            if (LLILL.LIZ == EnumC197067oM.INVALID) {
                return;
            } else {
                return;
            }
        }
        if (abstractC196927o8 instanceof C196897o5) {
            InterfaceC196737np player10 = getPlayer();
            if (player10 != null && player10.LJIIL(this)) {
                InterfaceC196737np player11 = getPlayer();
                if (player11 == null || (LJIIJ = player11.LJIIJ()) == null || (interfaceC46811IYt = LJIIJ.LIZIZ) == null || (str = interfaceC46811IYt.getKey()) == null) {
                    str = "";
                }
                InterfaceC196737np player12 = getPlayer();
                if (player12 != null && (LIZJ = player12.LIZJ()) != null) {
                    i2 = (int) LIZJ.getCurrentPosition();
                }
                PlayerPositionStore playerPositionStore2 = (PlayerPositionStore) this.LLF.getValue();
                if (playerPositionStore2 != null) {
                    ((Map) playerPositionStore2.LJLIL.getValue()).put(str, Integer.valueOf(i2));
                }
                InterfaceC196737np player13 = getPlayer();
                if (player13 != null) {
                    player13.LJIIJJI(EnumC196787nu.CELL);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC196927o8.LIZ() != EnumC196967oC.LIFECYCLE_CHANGE && abstractC196927o8.LIZ() != EnumC196967oC.HOX_CHANGE) {
            InterfaceC196737np player14 = getPlayer();
            if (player14 != null && player14.LJIIL(this) && (player = getPlayer()) != null) {
                player.stop();
            }
            PlayerPositionStore playerPositionStore3 = (PlayerPositionStore) this.LLF.getValue();
            if (playerPositionStore3 != null) {
                String key2 = C44384HbQ.LJIIJ(((C7ML) C51029K0z.LJIILLIIL(this)).getAweme());
                o.LJIIIZ(key2, "key");
                ((Map) playerPositionStore3.LJLIL.getValue()).remove(key2);
            }
        }
    }

    public final AbstractC196927o8 a4(AbstractC196927o8 abstractC196927o8) {
        if (((C194437k7) ((AssemViewModel) this.LJZL.LIZ(this, LLFF[0])).getState()).LJLIL instanceof C193847jA) {
            return abstractC196927o8;
        }
        return C196957oB.LIZIZ;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    @Override // X.InterfaceC46540IOi
    public final void onPlaying(String str) {
        InterfaceC196737np player;
        AssemViewModel assemViewModel = (AssemViewModel) this.LL.LIZ(this, LLFF[1]);
        assemViewModel.setStateImmediate(C196297n7.LJLIL);
        AbstractC196927o8 a4 = a4(((C196287n6) assemViewModel.getState()).LJLIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("playing audio, key: ");
        LIZ.append(str);
        LIZ.append(", state: ");
        LIZ.append(a4);
        LIZ.append(", feed type: ");
        LIZ.append(((C7ML) C51029K0z.LJIILLIIL(this)).z());
        C7XD.LIZ("NowPostAudioAssem", X1D.LIZIZ(LIZ));
        if (!(a4 instanceof C196887o4) && (player = getPlayer()) != null) {
            player.stop();
        }
        C78565UsT.LJJJI(C212428Vi.LIZLLL(this), ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        view.addOnAttachStateChangeListener(new IDCListenerS243S0100000_3(new AqS153S0100000_3(this, 604), 2));
        C8YN.LJII(this, (AssemViewModel) this.LL.LIZ(this, LLFF[1]), new TBT() { // from class: X.7ny
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C196287n6) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C196797nv.LJLIL, 4);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }
}
