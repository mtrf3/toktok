package com.ss.android.ugc.feed.platform.cell.interact.right;

import X.C135355Sx;
import X.C203937zR;
import X.C203947zS;
import X.C2049582p;
import X.C209398Jr;
import X.C209408Js;
import X.C209428Ju;
import X.C214348b8;
import X.C2304092m;
import X.C241249dQ;
import X.C2K0;
import X.C2S6;
import X.C30581Hy;
import X.C3C8;
import X.C51029K0z;
import X.C55096Ljo;
import X.C59423NTv;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C79004UzY;
import X.C8K0;
import X.C8LU;
import X.C8LZ;
import X.C8MM;
import X.C8VR;
import X.C8YN;
import X.EnumC210578Of;
import X.InterfaceC115514g7;
import X.InterfaceC55102Lju;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.M89;
import X.TBT;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap;
import com.ss.android.ugc.aweme.feed.assem.clearmode.ExitClearModeAssem;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerVM;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.assem.report.ReportViewAssem;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoTrigger;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.AreaContainerProtocol;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InteractRightAreaComponent extends BaseContainer implements InteractRightAreaAttachAbility, AreaContainerProtocol, InterfaceC55102Lju {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final InterfaceC115514g7 LLFFF;
    public final C5H3 LLFII;
    public final C8LU LLFZ;
    public final EnumC210578Of LLI;

    static {
        TBT tbt = new TBT(InteractRightAreaComponent.class, "rightAreaVM", "getRightAreaVM()Lcom/ss/android/ugc/aweme/feed/assem/container/RightAreaContainerVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -902258490) {
            return null;
        }
        return this;
    }

    public InteractRightAreaComponent() {
        new LinkedHashMap();
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RightAreaContainerVM.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 1308), null, C209398Jr.INSTANCE, null, null);
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C209408Js.INSTANCE);
        this.LLFZ = new C8LU(false, false);
        this.LLI = EnumC210578Of.INTEARCT_RIGHT_AREA_COMPONENT;
    }

    public final RightAreaContainerVM n4() {
        return (RightAreaContainerVM) this.LLFFF.LIZ(this, LLIFFJFJJ[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final Rect K1() {
        return C135355Sx.LIZ(getContainerView());
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final EnumC210578Of c4() {
        return this.LLI;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Bs(int i) {
        getContainerView().setVisibility(i);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        c8mm.LIZ("event_enter_clear_mode", new AqS170S0100000_4(this, 806));
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        boolean z;
        String str;
        M89 m89;
        M89 m892;
        VideoItemParams videoItemParams;
        Aweme aweme;
        M89 m893;
        Context context;
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS169S0100000_3(this, 589));
        C8LU operator = this.LLFZ;
        o.LJIIIZ(operator, "operator");
        String str2 = null;
        if (C2304092m.LIZ() && a1().LIZ == 1) {
            if (a1().LIZ != 4) {
                VideoItemParams videoItemParams2 = (VideoItemParams) C51029K0z.LJIILLIIL(this);
                if (videoItemParams2 != null) {
                    str2 = videoItemParams2.mEventType;
                }
                if (C30581Hy.LJIL(str2) && C59423NTv.LIZ()) {
                    ReportViewAssem reportViewAssem = new ReportViewAssem();
                    ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(reportViewAssem);
                    ((ArrayList) C8LZ.LIZIZ).add(reportViewAssem);
                }
            }
            Context context2 = getContext();
            if (((context2 != null && !C79004UzY.LJJIJIIJI(context2)) || C209428Ju.LIZ.LIZJ()) && a1().LIZ != 4) {
                FeedAvatarAssemWrap feedAvatarAssemWrap = new FeedAvatarAssemWrap();
                ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(feedAvatarAssemWrap);
                ((ArrayList) C8LZ.LIZIZ).add(feedAvatarAssemWrap);
            }
            if (a1().LIZ != 4) {
                BaseFeedPageParams baseFeedPageParams = a1().LJ;
                if (baseFeedPageParams != null) {
                    C8VR.LIZ(this, new AqS134S0200000_3(this, baseFeedPageParams, 26));
                }
                VideoDiggAssem videoDiggAssem = new VideoDiggAssem();
                ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(videoDiggAssem);
                ((ArrayList) C8LZ.LIZIZ).add(videoDiggAssem);
            }
            if (a1().LIZ != 4) {
                VideoShareAssem videoShareAssem = new VideoShareAssem();
                ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(videoShareAssem);
                ((ArrayList) C8LZ.LIZIZ).add(videoShareAssem);
            }
            ExitClearModeAssem exitClearModeAssem = new ExitClearModeAssem();
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(exitClearModeAssem);
            ((ArrayList) C8LZ.LIZIZ).add(exitClearModeAssem);
        } else {
            Context context3 = getContext();
            if (context3 != null) {
                z = C2S6.LIZ(context3).isFromEffectDiscover();
            } else {
                z = false;
            }
            BaseFeedPageParams baseFeedPageParams2 = a1().LJ;
            if (a1().LIZ != 4) {
                VideoItemParams videoItemParams3 = (VideoItemParams) C51029K0z.LJIILLIIL(this);
                if (videoItemParams3 != null) {
                    str = videoItemParams3.mEventType;
                } else {
                    str = null;
                }
                if (C30581Hy.LJIL(str) && C59423NTv.LIZ()) {
                    ReportViewAssem reportViewAssem2 = new ReportViewAssem();
                    ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(reportViewAssem2);
                    ((ArrayList) C8LZ.LIZIZ).add(reportViewAssem2);
                }
            }
            ISearchService LLLZI = SearchServiceImpl.LLLZI();
            BaseFeedPageParams baseFeedPageParams3 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).baseFeedPageParams;
            if (baseFeedPageParams3 != null) {
                m89 = baseFeedPageParams3.param;
            } else {
                m89 = null;
            }
            if (LLLZI.LJZI(m89) && (context = getContext()) != null && !C79004UzY.LJJIJIIJI(context)) {
                TakoTrigger takoTrigger = new TakoTrigger();
                ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(takoTrigger);
                ((ArrayList) C8LZ.LIZIZ).add(takoTrigger);
            }
            Context context4 = getContext();
            if (((context4 != null && !C79004UzY.LJJIJIIJI(context4)) || C209428Ju.LIZ.LIZJ()) && a1().LIZ != 4) {
                FeedAvatarAssemWrap feedAvatarAssemWrap2 = new FeedAvatarAssemWrap();
                ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(feedAvatarAssemWrap2);
                ((ArrayList) C8LZ.LIZIZ).add(feedAvatarAssemWrap2);
            }
            if (a1().LIZ != 4) {
                if (baseFeedPageParams2 != null) {
                    C8VR.LIZ(this, new AqS134S0200000_3(this, baseFeedPageParams2, 25));
                }
                VideoDiggAssem videoDiggAssem2 = new VideoDiggAssem();
                ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(videoDiggAssem2);
                ((ArrayList) C8LZ.LIZIZ).add(videoDiggAssem2);
            }
            if (a1().LIZ != 4) {
                VideoCommentAssem videoCommentAssem = new VideoCommentAssem();
                ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(videoCommentAssem);
                ((ArrayList) C8LZ.LIZIZ).add(videoCommentAssem);
            }
            if (FavoriteServiceImpl.LJIJJLI().LJI() > 0) {
                VideoFavoriteAssem videoFavoriteAssem = new VideoFavoriteAssem();
                ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(videoFavoriteAssem);
                ((ArrayList) C8LZ.LIZIZ).add(videoFavoriteAssem);
            }
            if (a1().LIZ != 4) {
                VideoShareAssem videoShareAssem2 = new VideoShareAssem();
                ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(videoShareAssem2);
                ((ArrayList) C8LZ.LIZIZ).add(videoShareAssem2);
            }
            BaseCellPlaceHolderComponent baseCellPlaceHolderComponent = new BaseCellPlaceHolderComponent("ad_descriptive_fold_button_layout");
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(baseCellPlaceHolderComponent);
            ArrayList arrayList = (ArrayList) C8LZ.LIZIZ;
            arrayList.add(baseCellPlaceHolderComponent);
            if (a1().LIZ != 4) {
                if (baseFeedPageParams2 != null && (m893 = baseFeedPageParams2.param) != null) {
                    str2 = m893.getFrom();
                }
                if (!o.LJ("from_publish_add_video", str2) && baseFeedPageParams2 != null && (m892 = baseFeedPageParams2.param) != null && !m892.isFromDuetModeDetail() && (((videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(this)) == null || (aweme = videoItemParams.getAweme()) == null || !aweme.isPaidContent) && !z)) {
                    VideoMusicCoverAssem videoMusicCoverAssem = new VideoMusicCoverAssem();
                    ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(videoMusicCoverAssem);
                    arrayList.add(videoMusicCoverAssem);
                }
            }
            ExitClearModeAssem exitClearModeAssem2 = new ExitClearModeAssem();
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIIZZ(exitClearModeAssem2);
            arrayList.add(exitClearModeAssem2);
        }
        C8LU indexOperator = this.LLFZ;
        o.LJIIIZ(indexOperator, "indexOperator");
        C8K0.LIZIZ(this);
        if (getContainerView() instanceof ViewGroup) {
            C8LZ.LIZ(this, this.LLFZ, (ViewGroup) getContainerView());
        }
        C8K0.LIZ(this);
        C8YN.LJII(this, n4(), new TBT() { // from class: X.7z2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C203457yf) obj).LJLILLLLZI;
            }
        }, null, C2049582p.LJLIL, 6);
        C8YN.LJII(this, n4(), new TBT() { // from class: X.7z1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C203457yf) obj).LJLIL;
            }
        }, null, C203947zS.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.7zT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C203937zR.LJLIL, 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Sn(ReusedUIAssem<? extends C3C8> ins, InterfaceC65784Pro<C76800UCe> win) {
        o.LJIIIZ(ins, "ins");
        o.LJIIIZ(win, "win");
        this.LLFZ.LIZLLL(getContainerView(), ins);
        win.invoke();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final void AU(float f, int i, boolean z) {
        getContainerView().setAlpha(f);
    }
}
