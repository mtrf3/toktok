package Y;

import X.AbstractC73638SvC;
import X.C143495k9;
import X.C145995oB;
import X.C147295qH;
import X.C164246cW;
import X.C164266cY;
import X.C168716jj;
import X.C168966k8;
import X.C3C5;
import X.C47261Igj;
import X.C52529KjV;
import X.C5Z2;
import X.C68322mC;
import X.C73411SrX;
import X.C78897Uxp;
import X.C78983UzD;
import X.GXR;
import X.H7R;
import X.H8F;
import X.InterfaceC150395vH;
import X.InterfaceC164626d8;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.T16;
import X.X1D;
import X.XJL;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.InitialMobParams;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectResponse;
import com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListRecommendViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AfS51S0200000_2 implements InterfaceC64592gB {
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
            default:
                return;
        }
    }

    public static final void accept$0(AfS51S0200000_2 afS51S0200000_2, Object obj) {
        ImportVideoInfo importInfo = (ImportVideoInfo) obj;
        C147295qH c147295qH = (C147295qH) afS51S0200000_2.l0;
        o.LJIIIIZZ(importInfo, "importInfo");
        C143495k9 veVideoDecodeInfo = (C143495k9) afS51S0200000_2.l1;
        o.LJIIIIZZ(veVideoDecodeInfo, "veVideoDecodeInfo");
        c147295qH.getClass();
        C145995oB c145995oB = new C145995oB();
        VideoPublishEditModel videoPublishEditModel = c147295qH.LJLLJ;
        if (videoPublishEditModel != null) {
            c145995oB.LIZ(!H7R.LJJJJ(videoPublishEditModel) ? 1 : 0, "is_fast_import");
            c145995oB.LJ("fast_import_depend_hw_decode", importInfo.getFastImportDependHW());
            c145995oB.LIZ(veVideoDecodeInfo.LJLIL, "video_decode_type");
            c145995oB.LIZ(veVideoDecodeInfo.LJLILLLLZI, "video_decode_hw_switch_sw");
            GXR.LIZ("tool_performance_video_decode_info", c145995oB.LIZ);
            return;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final void accept$1(AfS51S0200000_2 afS51S0200000_2, Object obj) {
        RecommendEffectResponse recommendEffectResponse = (RecommendEffectResponse) obj;
        Integer num = recommendEffectResponse.statusCode;
        if (num == null || num.intValue() != 0) {
            ((InterfaceC88472Yns) afS51S0200000_2.l1).invoke(String.valueOf(recommendEffectResponse.statusCode));
        } else {
            ((InterfaceC88472Yns) afS51S0200000_2.l0).invoke(recommendEffectResponse);
        }
    }

    public static final void accept$2(AfS51S0200000_2 afS51S0200000_2, Object obj) {
        if (!((XJL) afS51S0200000_2.l0).isActive()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((C168966k8) afS51S0200000_2.l1).LIZIZ);
        LIZ.append(" ; restore success ... ");
        C5Z2.LIZ(X1D.LIZIZ(LIZ));
        XJL xjl = (XJL) afS51S0200000_2.l0;
        ArrayList LJII = C47261Igj.LJII(C168716jj.LIZIZ((C168966k8) afS51S0200000_2.l1, null, null, 7));
        C3C5.m7constructorimpl(LJII);
        xjl.resumeWith(LJII);
    }

    public static final void accept$3(AfS51S0200000_2 afS51S0200000_2, Object obj) {
        Throwable th = (Throwable) obj;
        if (!((XJL) afS51S0200000_2.l0).isActive()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((C168966k8) afS51S0200000_2.l1).LIZIZ);
        LIZ.append(" ; restore failed ... ; e : ");
        LIZ.append(Log.getStackTraceString(th));
        C5Z2.LIZ(X1D.LIZIZ(LIZ));
        C168966k8 c168966k8 = (C168966k8) afS51S0200000_2.l1;
        AVDraftExtras aVDraftExtras = ((AwemeDraft) c168966k8.LIZ.LIZLLL).LJJJJI;
        aVDraftExtras.selectedFilterId = null;
        aVDraftExtras.selectedFilterResId = null;
        aVDraftExtras.selectedFilterLabel = null;
        XJL xjl = (XJL) afS51S0200000_2.l0;
        ArrayList LJII = C47261Igj.LJII(C168716jj.LIZIZ(c168966k8, Integer.valueOf(R.string.eyo), new DraftFileRestoreException(-3001, th), 2));
        C3C5.m7constructorimpl(LJII);
        xjl.resumeWith(LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS51S0200000_2 afS51S0200000_2, Object obj) {
        String str = (String) obj;
        InfoStickerListRecommendViewModel infoStickerListRecommendViewModel = (InfoStickerListRecommendViewModel) ((C68322mC) afS51S0200000_2.l0).element;
        String creationId = ((C164246cW) afS51S0200000_2.l1).LLJJI().getCreationId();
        o.LJIIIIZZ(creationId, "mModel.creationId");
        infoStickerListRecommendViewModel.getClass();
        MutableLiveData<AbstractC73638SvC<List<Effect>>> mutableLiveData = infoStickerListRecommendViewModel.LJLJJL;
        InterfaceC164626d8 interfaceC164626d8 = infoStickerListRecommendViewModel.LJLL;
        if (str == null) {
            str = "";
        }
        mutableLiveData.setValue(interfaceC164626d8.LIZ(1, creationId, str).LIZIZ().LJJIIJ(T16.LIZ()).LJIJI(new IDhS95S0100000_2(infoStickerListRecommendViewModel, 5)));
        C73411SrX c73411SrX = ((C164246cW) afS51S0200000_2.l1).LJZ;
        if (c73411SrX != null && (!c73411SrX.isDisposed())) {
            c73411SrX.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$5(AfS51S0200000_2 afS51S0200000_2, Object obj) {
        ((InfoStickerListRecommendViewModel) ((C68322mC) afS51S0200000_2.l0).element).LJLJJL.setValue(null);
        C73411SrX c73411SrX = ((C164246cW) afS51S0200000_2.l1).LJZ;
        if (c73411SrX != null && (!c73411SrX.isDisposed())) {
            c73411SrX.dispose();
        }
    }

    public static final void accept$6(AfS51S0200000_2 afS51S0200000_2, Object obj) {
        Boolean it = (Boolean) obj;
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue()) {
            C164246cW c164246cW = (C164246cW) afS51S0200000_2.l0;
            C145995oB LJJJLIIL = H8F.LJJJLIIL(c164246cW.LLJJI());
            LJJJLIIL.LIZ(1002, "scene_id");
            LJJJLIIL.LJI("creation_id", c164246cW.LLJJI().getCreationId());
            LJJJLIIL.LJI("shoot_way", c164246cW.LLJJI().mShootWay);
            LJJJLIIL.LJI("enter_from", "video_edit_page");
            LJJJLIIL.LJI("content_type", c164246cW.LLJJI().getAvetParameter().getContentType());
            LJJJLIIL.LJI("content_source", c164246cW.LLJJI().getAvetParameter().getContentSource());
            LJJJLIIL.LIZ(H8F.LJIIL(c164246cW.LLJJI()), "is_multi_content");
            LJJJLIIL.LJI("enter_method", c164246cW.LJLILLLLZI);
            LJJJLIIL.LJI("from_group_id", C78983UzD.LJJIJL());
            if (c164246cW.LLJJI().draftId != 0) {
                LJJJLIIL.LIZ(c164246cW.LLJJI().draftId, "draft_id");
            }
            if (!TextUtils.isEmpty(c164246cW.LLJJI().newDraftId)) {
                LJJJLIIL.LIZLLL("new_draft_id", c164246cW.LLJJI().newDraftId);
            }
            if (H7R.LJJLIIIJJIZ(c164246cW.LLJJI())) {
                LJJJLIIL.LIZLLL("content_type", H7R.LJIIIZ(c164246cW.LLJJI()));
            }
            InitialMobParams initialMobParams = c164246cW.LLJJI().creativeModel.initialModel.mobParams;
            String str = null;
            if (initialMobParams != null) {
                str = initialMobParams.enterType;
            }
            if (str != null && str.length() != 0) {
                LJJJLIIL.LIZLLL("enter_type", str);
            }
            String str2 = c164246cW.LLJJI().creativeModel.initialModel.dmCameraModel.enterDM;
            if (str2 != null && str2.length() != 0 && str2 != null) {
                LJJJLIIL.LIZLLL("enter_dm", str2);
            }
            GXR.LIZ("click_prop_entrance", LJJJLIIL.LIZ);
            C164246cW c164246cW2 = (C164246cW) afS51S0200000_2.l0;
            if (c164246cW2.LJLL) {
                c164246cW2.LLJILJIL().tU();
            }
        }
        if (it.booleanValue()) {
            if (!C52529KjV.LIZ()) {
                C78897Uxp.LJJJJ((C164246cW) afS51S0200000_2.l0).LLJILJILJ((C164246cW) afS51S0200000_2.l0, (C164266cY) afS51S0200000_2.l1);
            }
            InterfaceC150395vH interfaceC150395vH = ((C164246cW) afS51S0200000_2.l0).LJLLLLLL;
            if (interfaceC150395vH != null) {
                interfaceC150395vH.W3();
                return;
            }
            return;
        }
        if (!C52529KjV.LIZ()) {
            C78897Uxp.LJJJJ((C164246cW) afS51S0200000_2.l0).LLJJL((C164266cY) afS51S0200000_2.l1);
        }
        InterfaceC150395vH interfaceC150395vH2 = ((C164246cW) afS51S0200000_2.l0).LJLLLLLL;
        if (interfaceC150395vH2 == null) {
            return;
        }
        interfaceC150395vH2.s1();
    }

    public AfS51S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
