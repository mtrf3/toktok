package Y;

import X.C06460Ne;
import X.C111144Xu;
import X.C188727au;
import X.C26045AKb;
import X.C2MA;
import X.C32I;
import X.C36922EeM;
import X.C38333F2r;
import X.C44890Hja;
import X.C45382HrW;
import X.C45804HyK;
import X.C51029K0z;
import X.C57082Lw;
import X.C5S1;
import X.C61878OQg;
import X.C65822iA;
import X.C68322mC;
import X.C73411SrX;
import X.C89793fj;
import X.C89853fp;
import X.C90093gD;
import X.C90173gL;
import X.FMX;
import X.InterfaceC60822a6;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC73573Su9;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.JBR;
import X.OSZ;
import X.T72;
import X.V1B;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditItem;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditModel;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditViewModel;
import com.ss.android.ugc.aweme.detail.panel.AnalyticsDetailPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.DataInsightsMetric;
import com.ss.android.ugc.aweme.model.DataPoint;
import com.ss.android.ugc.aweme.model.InsightTypeResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.model.InviteUsersData;
import com.ss.android.ugc.aweme.qainvitation.model.InvitedYouUserListData;
import com.ss.android.ugc.aweme.qna.vm.QnaCreationViewModel;
import com.ss.android.ugc.aweme.question.model.CreateQuestionResponse;
import com.ss.android.ugc.aweme.story.feed.immersive.dm.StoryQuickDMBottomBarAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AfS50S0200000_1 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                accept$16(this, obj);
                return;
            case 17:
                accept$17(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS50S0200000_1 afS50S0200000_1, Object obj) {
        PdpViewModel.yx0((PdpViewModel) afS50S0200000_1.l0, (ProductPackStruct) obj, null, false, false, false, false, 124);
        PdpViewModel pdpViewModel = (PdpViewModel) afS50S0200000_1.l0;
        C73411SrX c73411SrX = pdpViewModel.LLJLLIL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        pdpViewModel.LLJLLIL = null;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS50S0200000_1.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void accept$1(AfS50S0200000_1 afS50S0200000_1, Object obj) {
        DataInsightsMetric dataInsightsMetric;
        List<DataPoint> list;
        InsightTypeResponse insightTypeResponse = (InsightTypeResponse) obj;
        String str = ((AnalyticsDetailPanel) afS50S0200000_1.l0).LLJJJJ;
        if (o.LJ(str, "retention")) {
            dataInsightsMetric = insightTypeResponse.videoRetentionRateHistory;
        } else if (o.LJ(str, "likes")) {
            dataInsightsMetric = insightTypeResponse.videoLikeRateHistory;
        } else {
            return;
        }
        if (dataInsightsMetric != null && (list = dataInsightsMetric.dataPoints) != null) {
            InterfaceC60822a6 interfaceC60822a6 = (InterfaceC60822a6) afS50S0200000_1.l1;
            AnalyticsDetailPanel analyticsDetailPanel = (AnalyticsDetailPanel) afS50S0200000_1.l0;
            interfaceC60822a6.setPoints(list);
            analyticsDetailPanel.LLJZ.clear();
            HashMap<Float, Float> hashMap = analyticsDetailPanel.LLJZ;
            int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
            if (LJJIIZ < 16) {
                LJJIIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
            for (DataPoint dataPoint : list) {
                OSZ osz = new OSZ(Float.valueOf(dataPoint.x), Float.valueOf(dataPoint.y));
                linkedHashMap.put(osz.getFirst(), osz.getSecond());
            }
            hashMap.putAll(linkedHashMap);
        }
    }

    public static final void accept$10(AfS50S0200000_1 afS50S0200000_1, Object obj) {
        ((InterfaceC65784Pro) afS50S0200000_1.l0).invoke();
        Activity LJIJJ = C45804HyK.LJIJJ((Context) afS50S0200000_1.l1);
        if (LJIJJ != null) {
            Context context = (Context) afS50S0200000_1.l1;
            C26045AKb c26045AKb = new C26045AKb(LJIJJ);
            c26045AKb.LJIIIZ(context.getString(R.string.pw));
            c26045AKb.LJIIJ();
        }
    }

    public static final void accept$11(AfS50S0200000_1 afS50S0200000_1, Object obj) {
        boolean z;
        int i;
        InvitedYouUserListData invitedYouUserListData = (InvitedYouUserListData) obj;
        if (invitedYouUserListData != null) {
            C89793fj c89793fj = (C89793fj) afS50S0200000_1.l0;
            c89793fj.getClass();
            Integer num = invitedYouUserListData.hasMore;
            if (num == null || num.intValue() != 1) {
                z = false;
            } else {
                z = true;
            }
            c89793fj.LJ = z;
            Integer num2 = invitedYouUserListData.cursor;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            c89793fj.LJFF = i;
            List<User> list = invitedYouUserListData.inviterList;
            if (list != null && !list.isEmpty()) {
                List<User> list2 = invitedYouUserListData.inviterList;
                o.LJI(list2);
                ((ArrayList) c89793fj.LJI).addAll(C90173gL.LIZJ(list2));
            }
            ((InterfaceC73573Su9) afS50S0200000_1.l1).onNext(((C89793fj) afS50S0200000_1.l0).LJI);
            return;
        }
        ((InterfaceC73573Su9) afS50S0200000_1.l1).onNext(((C89793fj) afS50S0200000_1.l0).LJI);
    }

    public static final void accept$12(AfS50S0200000_1 afS50S0200000_1, Object obj) {
        Throwable error = (Throwable) obj;
        o.LJIIIZ(error, "error");
        ((InterfaceC73573Su9) afS50S0200000_1.l0).onNext(((C89793fj) afS50S0200000_1.l1).LJI);
        error.getMessage();
    }

    public static final void accept$13(AfS50S0200000_1 afS50S0200000_1, Object obj) {
        List<CreatorCaptionEditData> list;
        List<CreatorCaptionEditData> transSubtitle;
        CreatorCaptionEditModel creatorCaptionEditModel = (CreatorCaptionEditModel) obj;
        CreatorCaptionEditViewModel creatorCaptionEditViewModel = (CreatorCaptionEditViewModel) afS50S0200000_1.l0;
        Aweme aweme = null;
        if (creatorCaptionEditModel != null) {
            list = creatorCaptionEditModel.getTransSubtitle();
        } else {
            list = null;
        }
        creatorCaptionEditViewModel.LJLJJLL = new CreatorCaptionEditItem(list);
        if (creatorCaptionEditModel != null && (transSubtitle = creatorCaptionEditModel.getTransSubtitle()) != null) {
            CreatorCaptionEditViewModel creatorCaptionEditViewModel2 = (CreatorCaptionEditViewModel) afS50S0200000_1.l0;
            Iterator<CreatorCaptionEditData> it = transSubtitle.iterator();
            while (it.hasNext()) {
                ((ArrayList) creatorCaptionEditViewModel2.LJLJLJ).add(it.next().getText());
            }
        }
        if (((CreatorCaptionEditViewModel) afS50S0200000_1.l0).gv0().getValue() == null) {
            MutableLiveData<Aweme> gv0 = ((CreatorCaptionEditViewModel) afS50S0200000_1.l0).gv0();
            if (creatorCaptionEditModel != null) {
                aweme = creatorCaptionEditModel.getAweme();
            }
            gv0.setValue(aweme);
        }
        if (creatorCaptionEditModel != null && creatorCaptionEditModel.getRemainingEditTimes() != null && creatorCaptionEditModel.isUnderReview() != null) {
            ((CreatorCaptionEditViewModel) afS50S0200000_1.l0).hv0().setValue(new C65822iA(creatorCaptionEditModel.getRemainingEditTimes().intValue(), creatorCaptionEditModel.isUnderReview().booleanValue()));
        }
        ((InterfaceC65784Pro) afS50S0200000_1.l1).invoke();
    }

    public static final void accept$14(AfS50S0200000_1 afS50S0200000_1, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        ((CreatorCaptionEditViewModel) afS50S0200000_1.l0).gv0().setValue(null);
        if (throwable instanceof C38333F2r) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS50S0200000_1.l1;
            String errorMsg = ((C38333F2r) throwable).getErrorMsg();
            o.LJIIIIZZ(errorMsg, "throwable.errorMsg");
            interfaceC88472Yns.invoke(errorMsg);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$15(Y.AfS50S0200000_1 r9, java.lang.Object r10) {
        /*
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r0 = r9.l0
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r0 = "data.iterator()"
            kotlin.jvm.internal.o.LJIIIIZZ(r8, r0)
        Lf:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r7 = r8.next()
            java.lang.String r0 = "iterator.next()"
            kotlin.jvm.internal.o.LJIIIIZZ(r7, r0)
            com.ss.android.ugc.aweme.profile.model.User r7 = (com.ss.android.ugc.aweme.profile.model.User) r7
            long r0 = r7.roomId
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L29
            goto Lf
        L29:
            java.lang.String r0 = r7.getUid()     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L38
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L34
            goto L3a
        L34:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L38:
            r0 = 0
        L3a:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r10.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L54
            long r5 = r0.longValue()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L54
            long r1 = r7.roomId
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto Lf
        L54:
            r7.roomId = r3
            goto Lf
        L57:
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM r0 = (com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM) r0
            com.bytedance.android.widget.NextLiveData r1 = r0.LJLIL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.postValue(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS50S0200000_1.accept$15(Y.AfS50S0200000_1, java.lang.Object):void");
    }

    public static final void accept$16(AfS50S0200000_1 afS50S0200000_1, Object it) {
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) afS50S0200000_1.l0;
        o.LJIIIIZZ(it, "it");
        interfaceC88471Ynr.invoke(it, (Context) afS50S0200000_1.l1);
    }

    public static final void accept$17(AfS50S0200000_1 afS50S0200000_1, Object obj) {
        String str;
        C111144Xu c111144Xu = (C111144Xu) obj;
        Aweme aweme = c111144Xu.LIZ;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (C06460Ne.LJ((VideoItemParams) afS50S0200000_1.l0, str) && c111144Xu.LIZIZ) {
            ((StoryQuickDMBottomBarAssem) afS50S0200000_1.l1).Y3().setVisibility(0);
        } else {
            ((StoryQuickDMBottomBarAssem) afS50S0200000_1.l1).Y3().setVisibility(8);
        }
    }

    public static final void accept$2(AfS50S0200000_1 afS50S0200000_1, Object obj) {
        ((C2MA) obj).g7((Map) afS50S0200000_1.l0);
    }

    public static final void accept$3(AfS50S0200000_1 afS50S0200000_1, Object obj) {
        int i = 1;
        if (obj != null) {
            ((InterfaceC73573Su9) afS50S0200000_1.l0).onNext(obj);
        } else {
            ((InterfaceC73573Su9) afS50S0200000_1.l0).onNext(new InviteUsersData(null, 1, null));
            i = 0;
        }
        ((C89853fp) afS50S0200000_1.l1).LJIIIZ(i);
    }

    public static final void accept$4(AfS50S0200000_1 afS50S0200000_1, Object obj) {
        Throwable error = (Throwable) obj;
        o.LJIIIZ(error, "error");
        ((InterfaceC73573Su9) afS50S0200000_1.l0).onNext(new InviteUsersData(null, 1, null));
        error.getMessage();
        ((C89853fp) afS50S0200000_1.l1).LJIIIZ(0);
    }

    public static final void accept$5(AfS50S0200000_1 afS50S0200000_1, Object obj) {
        Collection collection = (Collection) obj;
        ((ArrayList) ((C89853fp) afS50S0200000_1.l0).LJFF).clear();
        if (collection != null) {
            ((ArrayList) ((C89853fp) afS50S0200000_1.l0).LJFF).addAll(collection);
            ((InterfaceC73573Su9) afS50S0200000_1.l1).onNext(((C89853fp) afS50S0200000_1.l0).LJFF);
        } else {
            ((InterfaceC73573Su9) afS50S0200000_1.l1).onNext(C61878OQg.INSTANCE);
        }
    }

    public static final void accept$6(AfS50S0200000_1 afS50S0200000_1, Object obj) {
        OSZ osz = (OSZ) obj;
        boolean booleanValue = ((Boolean) osz.getFirst()).booleanValue();
        Object path = osz.getSecond();
        if (booleanValue) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS50S0200000_1.l0;
            o.LJIIIIZZ(path, "path");
            interfaceC88472Yns.invoke(path);
            Aweme aweme = (Aweme) afS50S0200000_1.l1;
            C44890Hja.LIZIZ = false;
            C57082Lw.LIZ.LIZJ("video_download_status").postValue(C45382HrW.LIZJ(4, aweme, 0, null, null, 28));
            return;
        }
        ((InterfaceC88472Yns) afS50S0200000_1.l0).invoke("");
        Aweme aweme2 = (Aweme) afS50S0200000_1.l1;
        C44890Hja.LIZIZ = false;
        C57082Lw.LIZ.LIZJ("video_download_status").postValue(C45382HrW.LIZJ(5, aweme2, 0, null, null, 28));
    }

    public static final void accept$7(AfS50S0200000_1 afS50S0200000_1, Object obj) {
        int i;
        CreateQuestionResponse it = (CreateQuestionResponse) obj;
        QnaCreationViewModel qnaCreationViewModel = (QnaCreationViewModel) afS50S0200000_1.l0;
        o.LJIIIIZZ(it, "it");
        List list = (List) afS50S0200000_1.l1;
        qnaCreationViewModel.getClass();
        String enterFrom = qnaCreationViewModel.getEnterFrom();
        String str = qnaCreationViewModel.LJLJJL;
        if (str != null) {
            Long valueOf = Long.valueOf(it.questionId);
            String str2 = qnaCreationViewModel.LJLJI;
            C188727au LJIIIIZZ = JBR.LJIIIIZZ("enter_from", enterFrom, "enter_method", str);
            if (valueOf != null) {
                LJIIIIZZ.LJ(valueOf.longValue(), "question_id");
            }
            if (str2 != null) {
                LJIIIIZZ.LJI("question_category_by_user", str2);
            }
            LJIIIIZZ.LJI("question_type", "textual");
            FMX.LJIIL("post_question", LJIIIIZZ.LIZ);
            String enterFrom2 = qnaCreationViewModel.getEnterFrom();
            Long valueOf2 = Long.valueOf(it.questionId);
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            C90093gD.LIZ(Integer.valueOf(i), 1, enterFrom2, valueOf2);
            ((AssemViewModel) qnaCreationViewModel.LJLILLLLZI.getValue()).setState(T72.LJLIL);
            qnaCreationViewModel.setState(new AqS167S0100000_1(it, 353));
            return;
        }
        o.LJIJI("enterMethod");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$8(AfS50S0200000_1 afS50S0200000_1, Object obj) {
        Throwable th = (Throwable) obj;
        Dialog dialog = (Dialog) ((C68322mC) afS50S0200000_1.l0).element;
        if (dialog != null) {
            V1B.LJLILLLLZI(dialog);
        }
        C36922EeM.LJFF(th);
        Context context = (Context) afS50S0200000_1.l1;
        if (context != null) {
            C5S1 c5s1 = new C5S1(context);
            c5s1.LIZLLL(context.getString(R.string.pei));
            c5s1.LJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$9(AfS50S0200000_1 afS50S0200000_1, Object obj) {
        Throwable th = (Throwable) obj;
        Dialog dialog = (Dialog) ((C68322mC) afS50S0200000_1.l0).element;
        if (dialog != null) {
            V1B.LJLILLLLZI(dialog);
        }
        C36922EeM.LJFF(th);
        Context context = (Context) afS50S0200000_1.l1;
        if (context != null) {
            C5S1 c5s1 = new C5S1(context);
            c5s1.LIZLLL(context.getString(R.string.pei));
            c5s1.LJ();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS50S0200000_1(X.C89853fp r2, X.C73433Srt r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 3: goto Le;
                case 4: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS50S0200000_1.<init>(X.3fp, X.Srt, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS50S0200000_1(X.C89793fj r2, X.C73433Srt r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 11: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS50S0200000_1.<init>(X.3fj, X.Srt, int):void");
    }

    public AfS50S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
