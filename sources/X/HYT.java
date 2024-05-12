package X;

import Y.ACallableS9S1400000_7;
import android.app.Activity;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.beauty.MBeautyStateInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfoCopy;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import kotlin.jvm.internal.AqS13S0500000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class HYT {
    public static void LIZ(Activity activity, ShortVideoContext shortVideoContext, C82622Wbi diContainer, EditEffectAnchorManager editEffectAnchorManager) {
        String str;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(diContainer, "diContainer");
        InterfaceC83142Wk6 f7 = ((I37) diContainer.LJ(I37.class, null)).f7();
        if (L2L.LIZ(diContainer) && diContainer.LIZIZ(InterfaceC82199WNv.class)) {
            ((C1EP) diContainer.LJ(C1EP.class, null)).m3(InterfaceC82199WNv.class, new AqS13S0500000_7(shortVideoContext, f7, activity, editEffectAnchorManager, diContainer, 1));
            return;
        }
        InterfaceC82199WNv interfaceC82199WNv = (InterfaceC82199WNv) diContainer.LJIIIIZZ(null, InterfaceC82199WNv.class);
        if (interfaceC82199WNv == null || (str = interfaceC82199WNv.lF()) == null) {
            str = "";
        }
        C10K.LIZJ(new ACallableS9S1400000_7(activity, diContainer, editEffectAnchorManager, shortVideoContext, f7, str, 1));
    }

    public static final void LIZIZ(C82622Wbi c82622Wbi, EditEffectAnchorManager editEffectAnchorManager, ShortVideoContext shortVideoContext, InterfaceC83142Wk6 interfaceC83142Wk6, String str) {
        FaceStickerBean faceStickerBean;
        Integer num;
        C0IB<FilterBean> curSelectedFilter;
        FilterBean LIZ;
        QM9 qm9 = new QM9(4);
        qm9.LIZ("enter_from", shortVideoContext.shootWay);
        FMX.LJI(0L, "upload_click", "shoot_page", CardStruct.IStatusCode.DEFAULT, new JSONObject((java.util.Map) qm9.LJLIL));
        if (C1DG.LJIIIIZZ()) {
            C46002I3q.LLI.getClass();
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("content_type", "video/photo");
            GXR.LIZ("click_upload_entrance", c145995oB.LIZ);
        } else {
            C43635HAp.LIZ(shortVideoContext, editEffectAnchorManager, str, (C6UV) ((C1EP) c82622Wbi.LJ(C1EP.class, null)).sO(C6UV.class), "video_shoot_page");
        }
        InterfaceC83624Wrs e8 = ((WLT) c82622Wbi.LJ(InterfaceC82086WJm.class, null)).e8();
        long dx = ((HYU) c82622Wbi.LJ(HYU.class, null)).dx();
        InterfaceC83865Wvl mediaController = e8.getMediaController();
        InterfaceC83727WtX effectController = e8.getEffectController();
        I9W i9w = (I9W) c82622Wbi.LJIIIIZZ(null, I0N.class);
        if (i9w != null) {
            faceStickerBean = i9w.Z5();
        } else {
            faceStickerBean = null;
        }
        WRP wrp = (WRP) c82622Wbi.LJIIIIZZ(null, WRP.class);
        if (wrp != null && (curSelectedFilter = wrp.getCurSelectedFilter()) != null && (LIZ = curSelectedFilter.LIZ()) != null) {
            num = Integer.valueOf(LIZ.getId());
        } else {
            num = null;
        }
        HYT hyt = C46002I3q.LLI;
        ComposerBeautyBuriedInfoCopy r7 = interfaceC83142Wk6.r7();
        hyt.getClass();
        Object LJJIIZI = C78880UxY.LJJIIZI(C78880UxY.LJLILLLLZI(r7), ComposerBeautyBuriedInfo.class);
        o.LJIIIIZZ(LJJIIZI, "fromJson(strCopy, Compos…tyBuriedInfo::class.java)");
        ComposerBeautyBuriedInfo composerBeautyBuriedInfo = (ComposerBeautyBuriedInfo) LJJIIZI;
        Object LJJIIZI2 = C78880UxY.LJJIIZI(C78880UxY.LJLILLLLZI(interfaceC83142Wk6.m7()), MBeautyStateInfo.class);
        o.LJIIIIZZ(LJJIIZI2, "fromJson(strCopy, MBeautyStateInfo::class.java)");
        MBeautyStateInfo mBeautyStateInfo = (MBeautyStateInfo) LJJIIZI2;
        int cameraFacing = ((WLT) c82622Wbi.LJ(InterfaceC82086WJm.class, null)).getCameraFacing();
        String LIZLLL = I9T.LIZLLL(shortVideoContext.creativeModel.musicBuzModel);
        if (LIZLLL == null) {
            LIZLLL = "";
        }
        C43912HLg.LIZIZ(shortVideoContext, mediaController, effectController, faceStickerBean, num, composerBeautyBuriedInfo, mBeautyStateInfo, cameraFacing, "click_upload", LIZLLL, dx, C42323GjH.LJLIL);
    }
}
