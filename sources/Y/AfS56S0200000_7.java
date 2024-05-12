package Y;

import X.AI8;
import X.AbstractC43455H3r;
import X.C1535060s;
import X.C17J;
import X.C3CK;
import X.C41700GYe;
import X.C43021GuX;
import X.C43026Guc;
import X.C43045Guv;
import X.C43457H3t;
import X.C43773HFx;
import X.C44422Hc2;
import X.C47261Igj;
import X.C5VH;
import X.C67996QmO;
import X.C68322mC;
import X.C73411SrX;
import X.C76800UCe;
import X.C79234V7u;
import X.EnumC43531H6p;
import X.G66;
import X.G7X;
import X.GYE;
import X.H44;
import X.H45;
import X.H4Z;
import X.H78;
import X.HGQ;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC82548WaW;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.ORZ;
import X.OSZ;
import X.W5G;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.SearchAidSurveyResp;
import com.ss.android.ugc.aweme.creatorcaption.FeedCaptionView;
import com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity;
import com.ss.android.ugc.aweme.panel.model.InviteRecommendMixQuestionStickerPanelResponseModel;
import com.ss.android.ugc.aweme.panel.model.QuestionStickerPanelResponseModel;
import com.ss.android.ugc.aweme.panel.net.QuestionStickerPanelMixInviteRecommendRequestApi;
import com.ss.android.ugc.aweme.panel.net.QuestionStickerPanelRequestApi;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.Error;
import com.ss.android.ugc.aweme.shortvideo.model.State;
import com.ss.android.ugc.aweme.shortvideo.model.Success;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net.MergedTemplateListResponseWrapper;
import com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net.UlikeMergedTemplateStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS62S1200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AfS56S0200000_7 implements InterfaceC64592gB {
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
            case 18:
                accept$18(this, obj);
                return;
            case 19:
                accept$19(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        Throwable th = (Throwable) obj;
        ((C43021GuX) afS56S0200000_7.l0).LJIIJJI = false;
        if (C43026Guc.LIZ() && !NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).isWeakNetwork()) {
            C43021GuX c43021GuX = (C43021GuX) afS56S0200000_7.l0;
            List list = (List) afS56S0200000_7.l1;
            String th2 = th.toString();
            c43021GuX.getClass();
            C43045Guv.LIZIZ(new AqS62S1200000_7(c43021GuX, th2, list, 0));
            return;
        }
        C43021GuX.LIZIZ((C43021GuX) afS56S0200000_7.l0, (List) afS56S0200000_7.l1, null, false, 4);
    }

    public static final void accept$1(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        Throwable th = (Throwable) obj;
        if (C43026Guc.LIZ()) {
            ((C43021GuX) afS56S0200000_7.l0).getClass();
            if (!NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).isWeakNetwork()) {
                C43021GuX c43021GuX = (C43021GuX) afS56S0200000_7.l0;
                List list = (List) afS56S0200000_7.l1;
                String th2 = th.toString();
                c43021GuX.getClass();
                C43045Guv.LIZIZ(new AqS62S1200000_7(c43021GuX, th2, list, 0));
                return;
            }
        }
        C43021GuX.LIZIZ((C43021GuX) afS56S0200000_7.l0, (List) afS56S0200000_7.l1, th.toString(), false, 2);
    }

    public static final void accept$10(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        String cacheSizeString = (String) obj;
        KidsDiskClearActivity kidsDiskClearActivity = (KidsDiskClearActivity) afS56S0200000_7.l0;
        AI8 ai8 = (AI8) afS56S0200000_7.l1;
        o.LJIIIIZZ(cacheSizeString, "cacheSizeString");
        kidsDiskClearActivity.getClass();
        ai8.setTitle(cacheSizeString);
        ai8.setLoading(false);
    }

    public static final void accept$11(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        ((InterfaceC65784Pro) afS56S0200000_7.l0).invoke();
        InterfaceC92693kP interfaceC92693kP = (InterfaceC92693kP) ((C68322mC) afS56S0200000_7.l1).element;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    public static final void accept$12(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        W5G w5g = (W5G) afS56S0200000_7.l0;
        if (w5g != null) {
            w5g.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        W5G w5g2 = (W5G) afS56S0200000_7.l0;
        if (w5g2 != null) {
            w5g2.setImageBitmap(bitmap);
        }
        ((PUgcSlotData) afS56S0200000_7.l1).cover = bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0421  */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$13(Y.AfS56S0200000_7 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 1451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS56S0200000_7.accept$13(Y.AfS56S0200000_7, java.lang.Object):void");
    }

    public static final void accept$14(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        ((HGQ) afS56S0200000_7.l0).onFinish(false);
        ((C43773HFx) afS56S0200000_7.l1).getClass();
        C44422Hc2.LIZJ();
        ((C43773HFx) afS56S0200000_7.l1).LJ();
    }

    public static final void accept$15(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        InviteRecommendMixQuestionStickerPanelResponseModel inviteRecommendMixQuestionStickerPanelResponseModel = (InviteRecommendMixQuestionStickerPanelResponseModel) obj;
        if (inviteRecommendMixQuestionStickerPanelResponseModel.statusCode == 0) {
            ListProtector.set(((QuestionStickerPanelMixInviteRecommendRequestApi) afS56S0200000_7.l0).LIZIZ, 0, 1);
            ((InterfaceC88472Yns) afS56S0200000_7.l1).invoke(inviteRecommendMixQuestionStickerPanelResponseModel);
        } else {
            ListProtector.set(((QuestionStickerPanelMixInviteRecommendRequestApi) afS56S0200000_7.l0).LIZIZ, 0, 2);
        }
    }

    public static final void accept$16(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        QuestionStickerPanelResponseModel questionStickerPanelResponseModel = (QuestionStickerPanelResponseModel) obj;
        Integer num = questionStickerPanelResponseModel.statusCode;
        if (num == null || num.intValue() != 0) {
            ((QuestionStickerPanelRequestApi) afS56S0200000_7.l0).LIZJ(2);
        } else {
            ((QuestionStickerPanelRequestApi) afS56S0200000_7.l0).LIZJ(1);
            ((InterfaceC88472Yns) afS56S0200000_7.l1).invoke(questionStickerPanelResponseModel);
        }
    }

    public static final void accept$17(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        CanvasVideoData LJJJIL;
        C5VH photoPrepareInfo = (C5VH) obj;
        o.LJIIIIZZ(photoPrepareInfo, "photoPrepareInfo");
        LJJJIL = C79234V7u.LJJJIL(photoPrepareInfo, C47261Igj.LJJIJ(photoPrepareInfo.LIZ), C1535060s.LIZ());
        C41700GYe.LJIIIZ((C3CK) afS56S0200000_7.l0, new OSZ((GYE) afS56S0200000_7.l1, LJJJIL));
    }

    public static final void accept$18(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        MergedTemplateListResponseWrapper mergedTemplateListResponseWrapper = (MergedTemplateListResponseWrapper) obj;
        if (mergedTemplateListResponseWrapper.status == 0) {
            ArrayList<UlikeMergedTemplateStruct> arrayList = mergedTemplateListResponseWrapper.data.templateList;
            ArrayList arrayList2 = new ArrayList();
            Iterator<UlikeMergedTemplateStruct> it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC82548WaW LJJJJL = C17J.LJJJJL(it.next());
                if (LJJJJL != null) {
                    arrayList2.add(LJJJJL);
                }
            }
            Object LJLLLL = ORZ.LJLLLL(arrayList2);
            if (LJLLLL != null) {
                ((InterfaceC88472Yns) afS56S0200000_7.l0).invoke(LJLLLL);
                return;
            } else {
                ((InterfaceC88472Yns) afS56S0200000_7.l1).invoke("");
                return;
            }
        }
        ((InterfaceC88472Yns) afS56S0200000_7.l1).invoke(mergedTemplateListResponseWrapper.message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$19(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        String message;
        InterfaceC88472Yns interfaceC88472Yns;
        State state = (State) obj;
        if (state instanceof Success) {
            InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) afS56S0200000_7.l0;
            if (interfaceC88472Yns2 != null) {
                T t = state.resource;
                o.LJII(t, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.cutsame.ITemplateData>");
                interfaceC88472Yns2.invoke(t);
                return;
            }
            return;
        }
        if (!(state instanceof Error) || (message = ((Throwable) state.resource).getMessage()) == null || (interfaceC88472Yns = (InterfaceC88472Yns) afS56S0200000_7.l1) == null) {
            return;
        }
        interfaceC88472Yns.invoke(message);
    }

    public static final void accept$2(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        ((FeedCaptionView) afS56S0200000_7.l0).LJJIIJZLJL((Exception) afS56S0200000_7.l1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$3(Y.AfS56S0200000_7 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS56S0200000_7.accept$3(Y.AfS56S0200000_7, java.lang.Object):void");
    }

    public static final void accept$4(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        SearchAidSurveyResp searchAidSurveyResp = (SearchAidSurveyResp) obj;
        if (searchAidSurveyResp.status_code == 0) {
            ((InterfaceC88472Yns) afS56S0200000_7.l0).invoke(searchAidSurveyResp.getSurveyData());
        } else {
            ((InterfaceC65784Pro) afS56S0200000_7.l1).invoke();
        }
    }

    public static final void accept$5(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        if (((BaseResponse) obj).status_code == 0) {
            ((InterfaceC65784Pro) afS56S0200000_7.l0).invoke();
        } else {
            ((InterfaceC65784Pro) afS56S0200000_7.l1).invoke();
        }
    }

    public static final void accept$6(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        AbstractC43455H3r abstractC43455H3r = (AbstractC43455H3r) afS56S0200000_7.l0;
        C67996QmO c67996QmO = (C67996QmO) afS56S0200000_7.l1;
        if (!abstractC43455H3r.LJ && abstractC43455H3r.LIZIZ == 0) {
            c67996QmO.LIZIZ(new C43457H3t(abstractC43455H3r.LJIIIZ(), H4Z.CLIENT, "wave_task"), EnumC43531H6p.OUTER);
        }
    }

    public static final void accept$7(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        H44 h44 = (H44) afS56S0200000_7.l0;
        if (!h44.LJII) {
            h44.LJIIJJI(new H45(true, 1), (C67996QmO) afS56S0200000_7.l1);
            return;
        }
        C73411SrX c73411SrX = h44.LJIIIIZZ;
        if (c73411SrX == null || c73411SrX.isDisposed()) {
            return;
        }
        C73411SrX c73411SrX2 = h44.LJIIIIZZ;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        h44.LJIIIIZZ = null;
    }

    public static final void accept$8(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        H78.LIZ("TitleSensitivity  sync data failed");
        ((G66) afS56S0200000_7.l0).LJLJL.invoke();
        ((G66) afS56S0200000_7.l0).LJ((G7X) afS56S0200000_7.l1);
    }

    public static final void accept$9(AfS56S0200000_7 afS56S0200000_7, Object obj) {
        H78.LIZ("TitleSensitivity  sync data failed");
        ((InterfaceC65784Pro) afS56S0200000_7.l0).invoke();
        ((InterfaceC65784Pro) afS56S0200000_7.l1).invoke();
    }

    public AfS56S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS56S0200000_7(QuestionStickerPanelRequestApi questionStickerPanelRequestApi, QuestionStickerPanelRequestApi questionStickerPanelRequestApi2, int i, InterfaceC88472Yns<? super QuestionStickerPanelResponseModel, C76800UCe> interfaceC88472Yns) {
        this.$t = interfaceC88472Yns;
        this.l0 = questionStickerPanelRequestApi;
        this.l1 = i;
    }
}
