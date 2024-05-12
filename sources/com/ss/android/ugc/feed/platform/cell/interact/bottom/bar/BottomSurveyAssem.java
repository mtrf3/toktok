package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C214348b8;
import X.C2K0;
import X.C51029K0z;
import X.C55016LiW;
import X.C55096Ljo;
import X.C57822Os;
import X.C5H3;
import X.C61776OMi;
import X.C61780OMm;
import X.C61798ONe;
import X.C61811ONr;
import X.C65352Pkq;
import X.C79081V1x;
import X.C8YN;
import X.EnumC61773OMf;
import X.InterfaceC55102Lju;
import X.OBQ;
import X.OMB;
import X.OMC;
import X.OMF;
import X.OMH;
import X.OMI;
import X.OMM;
import X.OMU;
import X.ON9;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.ss.android.ugc.aweme.feed.survey.ability.ISurveyInteractAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class BottomSurveyAssem extends InteractBottomBannerAssem implements ISurveyInteractAbility, InterfaceC55102Lju {
    public final C5H3 LLII;
    public final String LLIIII;
    public final OMI LLIIIILZ;
    public FeedSurvey LLIIIJ;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -2141538595) {
            return null;
        }
        return this;
    }

    public BottomSurveyAssem() {
        new LinkedHashMap();
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), OMF.INSTANCE);
        this.LLIIII = "bottom_banner_survey";
        this.LLIIIILZ = new OMI();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.survey.ability.ISurveyInteractAbility
    public final void yk() {
        if (Y3().getVisibility() == 0) {
            z4((VideoItemParams) C51029K0z.LJIILLIIL(this));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final String r4() {
        return this.LLIIII;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r3 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003a, code lost:
    
        if (r1 != null) goto L17;
     */
    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F4(com.ss.android.ugc.aweme.feed.model.VideoItemParams r8) {
        /*
            r7 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            super.F4(r8)
            android.view.View r0 = r7.getContainerView()
            r6 = 0
            r0.setVisibility(r6)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.getAweme()
            com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey r0 = X.OMU.LIZJ(r0)
            r7.LLIIIJ = r0
            if (r0 == 0) goto L7f
            com.ss.android.ugc.aweme.feed.model.survey.Question[] r0 = r0.getQuestions()
            if (r0 == 0) goto L7f
            r0 = r0[r6]
            if (r0 == 0) goto L7f
            com.ss.android.ugc.aweme.feed.model.survey.Option[] r1 = r0.getOptions()
        L2b:
            java.lang.String r5 = ""
            if (r1 == 0) goto L39
            r0 = r1[r6]
            if (r0 == 0) goto L39
            java.lang.String r4 = r0.getName()
            if (r4 != 0) goto L3c
        L39:
            r4 = r5
            if (r1 == 0) goto L47
        L3c:
            r0 = 1
            r0 = r1[r0]
            if (r0 == 0) goto L47
            java.lang.String r3 = r0.getName()
            if (r3 != 0) goto L48
        L47:
            r3 = r5
        L48:
            com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig r0 = r7.u4()
            com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig$Builder r2 = r0.toBuilder()
            kotlin.jvm.internal.AqS17S2100000_10 r1 = new kotlin.jvm.internal.AqS17S2100000_10
            r0 = 3
            r1.<init>(r4, r3, r7, r0)
            r2.setInteractionWithButton(r1)
            r7.D4(r2)
            com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerUIProps$Title r1 = new com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerUIProps$Title
            com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey r0 = r7.LLIIIJ
            if (r0 == 0) goto L72
            com.ss.android.ugc.aweme.feed.model.survey.Question[] r0 = r0.getQuestions()
            if (r0 == 0) goto L72
            r0 = r0[r6]
            if (r0 == 0) goto L72
            java.lang.String r0 = r0.getTitle()
            if (r0 != 0) goto L7d
        L72:
            r1.<init>(r5)
            java.util.List r0 = X.C47261Igj.LJJIJ(r1)
            r7.G4(r0)
            return
        L7d:
            r5 = r0
            goto L72
        L7f:
            r1 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.BottomSurveyAssem.F4(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    public final void I4(int i) {
        Question[] questions;
        Question question;
        Option[] options;
        Option option;
        String str;
        FeedSurvey feedSurvey = this.LLIIIJ;
        String str2 = null;
        if (feedSurvey != null && (questions = feedSurvey.getQuestions()) != null && (question = questions[0]) != null && (options = question.getOptions()) != null && (option = options[i]) != null) {
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
            EnumC61773OMf enumC61773OMf = EnumC61773OMf.SUBMIT;
            ON9.LIZJ(enumC61773OMf.getType(), aweme, new Option[]{option});
            OMI omi = this.LLIIIILZ;
            omi.getClass();
            C61798ONe LIZ = C55016LiW.LIZ();
            Aweme aweme2 = omi.LJLIL;
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            C61811ONr LIZ2 = LIZ.LIZ(str);
            if (LIZ2 == null) {
                LIZ2 = new C61811ONr();
            }
            omi.LIZ(LIZ2, enumC61773OMf, option);
            C61798ONe LIZ3 = C55016LiW.LIZ();
            Aweme aweme3 = omi.LJLIL;
            if (aweme3 != null) {
                str2 = aweme3.getAid();
            }
            LIZ3.LJFF(str2, new OMH(OBQ.BOTTOM.getType(), false));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LJJIII(int i) {
        this.LLIIIILZ.LIZLLL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), false);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final boolean P2(VideoItemParams item) {
        boolean LIZJ;
        o.LJIIIZ(item, "item");
        C61798ONe LIZ = C55016LiW.LIZ();
        String aid = item.getAweme().getAid();
        OBQ obq = OBQ.BOTTOM;
        boolean LIZJ2 = LIZ.LIZJ(obq.getType(), aid);
        Aweme aweme = item.getAweme();
        if (aweme != null && OMU.LIZIZ(aweme) == obq.getType()) {
            Aweme aweme2 = item.getAweme();
            if (OMM.LIZ[C79081V1x.LJIILLIIL(aweme2).ordinal()] == 3) {
                LIZJ = C61780OMm.LJ(aweme2, false);
            } else {
                LIZJ = C61776OMi.LIZJ(aweme2, false);
            }
            if ((LIZJ || LIZJ2) && !C57822Os.LIZ(item.getAweme()) && !item.getAweme().isAd()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.OMD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, OMB.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.OME
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, OMC.LJLIL, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        if (r1 != null) goto L29;
     */
    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig B4(android.content.Context r10, com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig.Builder r11) {
        /*
            r9 = this;
            java.lang.String r0 = "bottomBannerBuilder"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            X.OBQ r8 = X.OBQ.BOTTOM
            java.lang.String r0 = "style"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.OMW> r0 = X.OMU.LIZ
            java.util.Collection r1 = r0.values()
            java.lang.String r0 = "surveyMap.values"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r3 = r1.iterator()
        L26:
            boolean r0 = r3.hasNext()
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L41
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.OMW r0 = (X.OMW) r0
            int r1 = r0.LIZLLL
            int r0 = r8.getType()
            if (r1 != r0) goto L26
            r7.add(r2)
            goto L26
        L41:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r7.iterator()
        L4a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r1.next()
            X.OMW r0 = (X.OMW) r0
            com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey r0 = r0.LIZJ
            if (r0 == 0) goto L4a
            r2.add(r0)
            goto L4a
        L5e:
            r6.addAll(r2)
            java.lang.Object r0 = X.ORZ.LJLLLL(r6)
            com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey r0 = (com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey) r0
            r9.LLIIIJ = r0
            if (r0 == 0) goto Lad
            com.ss.android.ugc.aweme.feed.model.survey.Question[] r0 = r0.getQuestions()
            if (r0 == 0) goto Lad
            r0 = r0[r4]
            if (r0 == 0) goto Lad
            com.ss.android.ugc.aweme.feed.model.survey.Option[] r1 = r0.getOptions()
        L79:
            java.lang.String r3 = ""
            if (r1 == 0) goto L87
            r0 = r1[r4]
            if (r0 == 0) goto L87
            java.lang.String r2 = r0.getName()
            if (r2 != 0) goto L8a
        L87:
            r2 = r3
            if (r1 == 0) goto L94
        L8a:
            r0 = r1[r5]
            if (r0 == 0) goto L94
            java.lang.String r0 = r0.getName()
            if (r0 != 0) goto Lab
        L94:
            r0 = 2131756269(0x7f1004ed, float:1.914344E38)
            r11.setIconWithLocalRes(r0)
            r11.setUpdateTitleSync(r4)
            kotlin.jvm.internal.AqS17S2100000_10 r1 = new kotlin.jvm.internal.AqS17S2100000_10
            r0 = 3
            r1.<init>(r2, r3, r9, r0)
            r11.setInteractionWithButton(r1)
            com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig r0 = r11.build()
            return r0
        Lab:
            r3 = r0
            goto L94
        Lad:
            r1 = 0
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.BottomSurveyAssem.B4(android.content.Context, com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig$Builder):com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig");
    }
}
