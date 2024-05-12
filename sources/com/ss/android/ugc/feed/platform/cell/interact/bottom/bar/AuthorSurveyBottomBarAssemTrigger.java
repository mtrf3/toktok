package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C188727au;
import X.C211288Qy;
import X.C211298Qz;
import X.C214348b8;
import X.C221108m2;
import X.C3C8;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8PS;
import X.C8R0;
import X.C8R2;
import X.C8T7;
import X.C8YN;
import X.C9BE;
import X.FMX;
import X.InterfaceC115514g7;
import X.InterfaceC65350Pko;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AuthorSurveyBottomBarAssemTrigger extends BaseCellTriggerComponent<AuthorSurveyBottomBarAssemTrigger> implements BottomBarPriorityProtocol {
    public static final C8R2 LLIIII;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIILZ;
    public boolean LLF;
    public boolean LLFF;
    public VideoItemParams LLFFF;
    public VideoItemParams LLFII;
    public final C5H3 LLFZ;
    public final InterfaceC115514g7 LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;
    public final C62822Ol8 LLII;

    static {
        TBT tbt = new TBT(AuthorSurveyBottomBarAssemTrigger.class, "surveyVM", "getSurveyVM()Lcom/ss/android/ugc/feed/platform/cell/interact/bottom/bar/AuthorSurveyViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIILZ = new InterfaceC74236TBo[]{tbt, new TBT(AuthorSurveyBottomBarAssemTrigger.class, "tagVM", "getTagVM()Lcom/ss/android/ugc/aweme/feed/assem/multitag/VideoFeedMultiTagVM;", 0)};
        LLIIII = new C8R2();
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(InteractAuthorSurveyBottomBarAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_banner_survey_publish";
    }

    public AuthorSurveyBottomBarAssemTrigger() {
        new LinkedHashMap();
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C211298Qz.INSTANCE);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AuthorSurveyViewModel.class);
        this.LLI = C214348b8.LIZ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1255), null, C211288Qy.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(VideoFeedMultiTagVM.class);
        this.LLIFFJFJJ = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 1256), null, C8PS.INSTANCE, null, null);
        this.LLII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1254));
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol
    public final void d1() {
        getContainerView().setVisibility(8);
    }

    public final void l4() {
        String str;
        Aweme aweme;
        String groupId;
        Aweme aweme2;
        if (getContainerView().getVisibility() == 0 && this.LLF && this.LLFF) {
            Map<String, Boolean> map = ((AuthorSurveyViewModel) this.LLI.LIZ(this, LLIIIILZ[0])).LJLIL;
            VideoItemParams videoItemParams = this.LLFFF;
            String str2 = null;
            if (videoItemParams != null && (aweme2 = videoItemParams.getAweme()) != null) {
                str2 = aweme2.getAid();
            }
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (o.LJ(((LinkedHashMap) map).get(str2), Boolean.FALSE)) {
                this.LLF = false;
                String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "video_detail");
                c188727au.LJIIIZ("author_id", currentUserID);
                VideoItemParams videoItemParams2 = this.LLFFF;
                if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null && (groupId = aweme.getGroupId()) != null) {
                    str3 = groupId;
                }
                c188727au.LJIIIZ("group_id", str3);
                if (AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService().isPositiveQuestionSet()) {
                    str = "most_wanted_set";
                } else {
                    str = "most_disappointed_set";
                }
                c188727au.LJIIIZ("survey_type", str);
                c188727au.LIZLLL(AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService().isCurrentTheLastTimeSurveyBannerShown() ? 1 : 0, "if_hit_quit");
                FMX.LJIIL("author_survey_banner_show", c188727au.LIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View m8() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        super.F0(item);
        this.LLFFF = item;
        this.LLF = false;
        if (k4(item)) {
            PriorityAbility priorityAbility = (PriorityAbility) this.LLII.getValue();
            if (priorityAbility != null) {
                priorityAbility.Es(this, null, new AqS134S0200000_3(this, item, 172));
                return;
            }
            return;
        }
        getContainerView().setVisibility(8);
        PriorityAbility priorityAbility2 = (PriorityAbility) this.LLII.getValue();
        if (priorityAbility2 == null) {
            return;
        }
        priorityAbility2.en(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        this.LLFII = item;
        LLIIII.getClass();
        return C8R2.LIZ(item);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LLF = false;
        this.LLFF = false;
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.8R1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C8R0.LJLIL, 6);
    }
}
