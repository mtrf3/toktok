package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EffectDataTransport;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.services.recording.NowsShootActivityArg;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import dmt.av.video.SingleImageCoverBitmapData;
import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.HBt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43665HBt extends WMH {
    public final NowsShootActivityArg LJLIL;
    public final CreativeInfo LJLILLLLZI;
    public final C82622Wbi LJLJI;
    public final C43670HBy LJLJJI;
    public final HC0 LJLJJL;
    public final C43671HBz LJLJJLL;
    public final C62822Ol8 LJLJL;
    public WXN LJLJLJ;
    public I9Y LJLJLLL;
    public final CameraComponentModel LJLL;
    public final NowsShootModel LJLLI;
    public final int LJLLILLLL;

    public C6UV LLJJI() {
        return null;
    }

    public abstract ShortVideoContext LLJJIII();

    public static boolean LLJILJILJ() {
        if (e1.LIZ(31744, "forbid_fake_dual_camera", true, false)) {
            return false;
        }
        if (!HC1.LIZ()) {
            return true;
        }
        Keva keva = (Keva) C43879HJz.LIZ.getValue();
        FFL.LJIIIZ().getClass();
        return keva.getBoolean("is_dual_camera", FFL.LJ(31744, "now_default_use_dual_flow", true, true));
    }

    public final void LLJJIJIL() {
        View requireViewById = requireViewById(R.id.dcp);
        o.LJIIIIZZ(requireViewById, "requireViewById<View>(R.id.fl_camera_container)");
        int i = 0;
        View requireViewById2 = requireViewById(R.id.drl);
        o.LJIIIIZZ(requireViewById2, "requireViewById<View>(R.id.gesture_container)");
        View[] viewArr = {requireViewById, requireViewById2};
        do {
            View view = viewArr[i];
            Activity requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            C6IA.LJII(requireActivity, view);
            i++;
        } while (i < 2);
        C82442WXe.LIZ = new AqS157S0100000_7(requireViewById, 511);
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        C43662HBq.LIZ();
    }

    public InterfaceC88472Yns<C82621Wbh, C76800UCe> LLJILJIL() {
        return this.LJLJJI;
    }

    public InterfaceC88472Yns<Intent, C76800UCe> LLJJ() {
        return this.LJLJJLL;
    }

    public C82622Wbi getDiContainer() {
        return this.LJLJI;
    }

    public static Bitmap LLJJIJI(Bitmap bitmap) {
        if (bitmap == null) {
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
            o.LJIIIIZZ(createBitmap, "createBitmap(1, 1, Bitmap.Config.RGB_565)");
            return createBitmap;
        }
        return bitmap;
    }

    public final void LLJJIJIIJIL(MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        ExtractFramesModel extractFramesModel;
        C82367WUh c82367WUh;
        Serializable serializable;
        HC5 Xq;
        InterfaceC82400WVo interfaceC82400WVo;
        String str;
        Long publishTime;
        String str2;
        boolean z;
        OSZ osz;
        int width;
        int height;
        List list;
        CanvasVideoData LJJJIL;
        C6UV LLJJI = LLJJI();
        if (LLJJI != null) {
            LLJJI.ai();
        }
        LLJJIII().creativeModel.nowsShootModel = this.LJLLI;
        Intent intent = new Intent();
        intent.putExtra("workspace", LLJJIII().cameraComponentModel.mWorkspace);
        if (LLJJIII().LJJIJIL()) {
            intent.putExtra("music_start", LLJJIII().cameraComponentModel.mMusicStart);
            intent.putExtra("extra_music_end", LLJJIII().cameraComponentModel.musicEndTime);
            intent.putExtra("music_origin", LLJJIII().LJIIL());
        }
        CreativeModel creativeModel = LLJJIII().creativeModel;
        o.LJIIIIZZ(creativeModel, "shortVideoContext.creativeModel");
        C78996UzQ.LJJIZ(intent, creativeModel);
        CreativeInfo creativeInfo = LLJJIII().creativeInfo;
        o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
        C77412UZs.LJJIJIL(intent, creativeInfo);
        if (multiEditVideoStatusRecordData != null) {
            CameraComponentModel cameraComponentModel = this.LJLL;
            C6NQ c6nq = new C6NQ(cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight, false, null, null, 252);
            MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
            o.LJIIIIZZ(multiEditVideoRecordData, "recordData.curMultiEditVideoRecordData");
            EditPreviewInfo LIZ = c6nq.LIZ(multiEditVideoRecordData);
            multiEditVideoStatusRecordData.originalSegments = LLJJIII().LIZIZ();
            LIZ.setPreviewVideoLength((int) LLJJIII().cameraComponentModel.mTotalRecordingTime);
            C42315Gj9.LIZ = (int) LLJJIII().cameraComponentModel.mTotalRecordingTime;
            intent.putExtra("extra_edit_preview_info", (Parcelable) LIZ);
            intent.putExtra("extra_multi_edit_video_data", (Parcelable) multiEditVideoStatusRecordData);
        }
        intent.putExtra("shoot_mode", 16);
        NowsShootModel nowsShootModel = this.LJLLI;
        if (nowsShootModel.type == 0) {
            NowsExtra nowsExtra = nowsShootModel.nowsExtra;
            if (!nowsExtra.isDualCamera && o.LJ(nowsExtra.shootOrder, "front_first")) {
                z = true;
                osz = new OSZ(LLJJIJI(this.LJLLI.frontBitmap), C43653HBh.LIZJ(this.LJLILLLLZI, false));
            } else {
                z = false;
                osz = new OSZ(LLJJIJI(this.LJLLI.backBitmap), C43653HBh.LIZJ(this.LJLILLLLZI, true));
            }
            Bitmap bitmap = (Bitmap) osz.getFirst();
            String str3 = (String) osz.getSecond();
            C5VH c5vh = new C5VH();
            if (z) {
                width = LLJJIJI(this.LJLLI.frontBitmap).getWidth();
                height = LLJJIJI(this.LJLLI.frontBitmap).getHeight();
            } else {
                width = LLJJIJI(this.LJLLI.backBitmap).getWidth();
                height = LLJJIJI(this.LJLLI.backBitmap).getHeight();
            }
            c5vh.LIZ(str3);
            c5vh.LIZJ = 1.0f;
            c5vh.LIZIZ = C65282hI.LIZJ(c5vh.LIZ);
            if (C82398WVm.LIZJ((InterfaceC82400WVo) this.LJLJL.getValue()) != null) {
                CreativeInfo creativeInfo2 = LLJJIII().creativeInfo;
                o.LJIIIIZZ(creativeInfo2, "shortVideoContext.creativeInfo");
                list = C47261Igj.LJJIJ(C43653HBh.LIZ(creativeInfo2));
            } else {
                list = null;
            }
            LJJJIL = C79234V7u.LJJJIL(c5vh, list, C1535060s.LIZ());
            String LIZ2 = C15190ih.LIZ();
            if (bitmap != null) {
                C43662HBq.LIZ = new OSZ<>(LIZ2, bitmap);
            }
            intent.putExtra("key_choose_media_item_cover_bitmap_data", (Parcelable) new SingleImageCoverBitmapData(str3, bitmap.getWidth(), System.currentTimeMillis(), 1, bitmap.getWidth(), bitmap.getHeight(), LIZ2));
            intent.putExtra("photo_canvas_data", LJJJIL);
            VideoFileInfo videoFileInfo = new VideoFileInfo(width, height, C149525ts.LIZ().defaultDuration, 30, 0, 0, 0, 0, 0.0f, 496, null);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJJ(this.LJLILLLLZI));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
            Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(simpleDateFormat.format(time));
            LIZ4.append(".mp4");
            LIZ3.append(X1D.LIZIZ(LIZ4));
            String LIZIZ = X1D.LIZIZ(LIZ3);
            C78966Uyw.LJJJJZ(new File(LIZIZ));
            intent.putExtra("extra_edit_preview_info", (Parcelable) new C149505tq(width, height, 12).LIZ(new EditVideoSegment(LIZIZ, null, videoFileInfo)));
        }
        CreativeModel creativeModel2 = LLJJIII().creativeModel;
        HCA hca = LLJJIII().cameraComponentModel.mDurings;
        o.LJIIIIZZ(hca, "shortVideoContext.durings");
        ArrayList arrayList = new ArrayList(C32I.LJJL(hca, 10));
        Iterator<TimeSpeedModelExtension> it = hca.iterator();
        while (it.hasNext()) {
            SimpleEffect effectInfo = it.next().getEffectInfo();
            if (effectInfo != null) {
                str2 = effectInfo.getResourceId();
            } else {
                str2 = null;
            }
            arrayList.add(str2);
        }
        String LLD = ORZ.LLD(ORZ.LJLL(arrayList), ",", null, null, null, 62);
        HCA hca2 = LLJJIII().cameraComponentModel.mDurings;
        o.LJIIIIZZ(hca2, "shortVideoContext.durings");
        ArrayList arrayList2 = new ArrayList();
        Iterator<TimeSpeedModelExtension> it2 = hca2.iterator();
        while (it2.hasNext()) {
            SimpleEffect effectInfo2 = it2.next().getEffectInfo();
            if (effectInfo2 != null && (publishTime = effectInfo2.getPublishTime()) != null) {
                arrayList2.add(publishTime);
            }
        }
        EffectDataTransport effectDataTransport = new EffectDataTransport(LLD, arrayList2);
        creativeModel2.getClass();
        creativeModel2.effectData = effectDataTransport;
        HCA LIZIZ2 = LLJJIII().LIZIZ();
        intent.putExtra("commerce_data_in_tools_line", LLJJIII().extraSession.commerceData);
        if (this.LJLLI.type == 0) {
            C82622Wbi LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(this);
            if (LJJLIIIJJI != null && (interfaceC82400WVo = (InterfaceC82400WVo) LJJLIIIJJI.LJIIIIZZ(null, I0N.class)) != null) {
                LLJJIII().creativeModel.recordEffectModel.stickerInfo = C60903NvH.LJIIJJI().LJJIII().getNowUIService().buildStickerInfo(C44384HbQ.LJJLIIIJJI(this));
                if (C82398WVm.LIZJ(interfaceC82400WVo) != null) {
                    FaceStickerBean LIZLLL = SFS.LIZLLL(C82398WVm.LIZJ(interfaceC82400WVo));
                    o.LJIIIIZZ(LIZLLL, "covert(it.currentEffect)");
                    LLJJIII().creativeModel.recordEffectModel.stickerChallenges = C63081OpJ.LJJJJLL(interfaceC82400WVo);
                    RecordEffectModel recordEffectModel = LLJJIII().creativeModel.recordEffectModel;
                    UrlModel iconUrl = LIZLLL.getIconUrl();
                    o.LJIIIIZZ(iconUrl, "faceStickerBean.iconUrl");
                    String name = LIZLLL.getName();
                    o.LJIIIIZZ(name, "faceStickerBean.name");
                    recordEffectModel.effectInfo = new SimpleEffect(iconUrl, name, LIZLLL.getExtra(), LIZLLL.getDesignerId(), LIZLLL.getTypes(), LIZLLL.getResourceID(), null, 64, null);
                    Effect LIZJ = C82398WVm.LIZJ(interfaceC82400WVo);
                    if (LIZJ != null) {
                        str = LIZJ.getEffectId();
                    } else {
                        str = null;
                    }
                    intent.putExtra("sticker_id", str);
                    intent.putExtra("sticker_info", LLJJIII().creativeModel.recordEffectModel.stickerInfo);
                }
            }
        } else {
            intent.putExtra("sticker_id", RecordScene.getStickerIdsByModel(LIZIZ2));
            intent.putExtra("sticker_info", RecordScene.getStickerInfo(LIZIZ2));
            intent.putExtra("first_sticker_music_ids", RecordScene.getFirstStickerMusicIds(LIZIZ2));
        }
        intent.putExtra("shoot_way", this.LJLIL.getShootWay());
        intent.putExtra("enter_method", this.LJLIL.getEnterMethod());
        intent.putExtra("origin", 1);
        intent.putExtra("nows_count_down_duration", this.LJLLILLLL);
        C82622Wbi LJJLIIIJJI2 = C44384HbQ.LJJLIIIJJI(this);
        if (LJJLIIIJJI2 != null && (Xq = ((WLT) LJJLIIIJJI2.LJ(InterfaceC82086WJm.class, null)).Xq()) != null) {
            extractFramesModel = ((C43786HGk) Xq).LIZ;
        } else {
            extractFramesModel = null;
        }
        intent.putExtra("extract_model", extractFramesModel);
        intent.putExtra("video_segment", C79045V0n.LJIJI(LLJJIII().LIZIZ()));
        intent.putExtra("enable_music_path_check", false);
        intent.putExtra("creative_flow_data", (Parcelable) LLJJIII().creativeFlowData);
        intent.putExtra("extra_is_now_story_combine", true);
        LLJJ().invoke(intent);
        intent.putExtra("now_shoot_activity_arg", this.LJLIL);
        if (!LLJJIII().mIsFromDraft) {
            List<AVChallenge> list2 = C41658GWo.LIZLLL().LIZ;
            o.LJIIIIZZ(list2, "inst().challenges");
            if (list2 instanceof Serializable) {
                serializable = (Serializable) list2;
            } else {
                serializable = null;
            }
            intent.putExtra("challenge", serializable);
        }
        InterfaceC41645GWb LIZ5 = HZV.LIZ();
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        LIZ5.LJIIIZ(requireActivity, 12348, intent);
        C82622Wbi LJJLIIIJJI3 = C44384HbQ.LJJLIIIJJI(this);
        if (LJJLIIIJJI3 != null && (c82367WUh = (C82367WUh) LJJLIIIJJI3.LJIIIIZZ(null, C82367WUh.class)) != null) {
            c82367WUh.Il(false);
        }
    }

    @Override // X.WM7
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        CameraComponentModel cameraComponentModel = this.LJLL;
        cameraComponentModel.mWorkspace = HU5.LIZ(this.LJLILLLLZI);
        C44735Hh5 c44735Hh5 = C44172HVg.LJIILJJIL;
        c44735Hh5.LIZ();
        cameraComponentModel.mVideoWidth = c44735Hh5.LIZ;
        C44172HVg.LJIILJJIL.LIZ();
        cameraComponentModel.mVideoHeight = (int) (r0.LIZ / 0.75f);
        cameraComponentModel.mMaxDuration = LivePlayEnforceIntervalSetting.DEFAULT;
        cameraComponentModel.mHardEncode = C44739Hh9.LIZ() ? 1 : 0;
        C41653GWj.LIZ = new C41654GWk(this.LJLIL.getShootWay(), this.LJLILLLLZI.getCreationId(), this.LJLIL.getEnterFrom());
        NowsExtra nowsExtra = this.LJLLI.nowsExtra;
        nowsExtra.countDownStart = this.LJLLILLLL;
        nowsExtra.isBlueVUser = this.LJLIL.isBlueVUser();
        String nowCardType = this.LJLIL.getNowCardType();
        o.LJIIIZ(nowCardType, "<set-?>");
        nowsExtra.nowCardType = nowCardType;
        nowsExtra.nowType = this.LJLIL.getNowType();
        String nowPostBy = this.LJLIL.getNowPostBy();
        o.LJIIIZ(nowPostBy, "<set-?>");
        nowsExtra.nowPostBy = nowPostBy;
        nowsExtra.shootEnterPosition = this.LJLIL.getEnterPosition();
        String shootPosition = this.LJLIL.getShootPosition();
        o.LJIIIZ(shootPosition, "<set-?>");
        nowsExtra.nowBlurShootPosition = shootPosition;
        nowsExtra.enterFrom = this.LJLIL.getEnterFrom();
        nowsExtra.isDualCamera = LLJILJILJ();
        nowsExtra.shootWay = this.LJLIL.getShootWay();
        nowsExtra.shootEnterScene = this.LJLIL.getNowShootEnterScene();
        nowsExtra.isNewPage = this.LJLIL.isNewPage();
        nowsExtra.previousPage = this.LJLIL.getPreviousPage();
        nowsExtra.nowTabEnterMethod = this.LJLIL.getNowTabEnterMethod();
        LLJJIJIL();
        C78688UuS.LJIIIZ(this, false, new AqS173S0100000_7(this, 300));
        C44384HbQ.LJIIIZ(this, new AqS173S0100000_7(this, 301));
    }

    public AbstractC43665HBt(NowsShootActivityArg nowsShootActivityArg, CreativeInfo creativeInfo, C82622Wbi diContainer) {
        int i;
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = nowsShootActivityArg;
        this.LJLILLLLZI = creativeInfo;
        this.LJLJI = diContainer;
        this.LJLJJI = C43670HBy.LJLIL;
        this.LJLJJL = HC0.LJLIL;
        this.LJLJJLL = C43671HBz.LJLIL;
        this.LJLJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 512));
        CameraComponentModel cameraComponentModel = new CameraComponentModel(0, creativeInfo.getCreationId(), creativeInfo.getVersion());
        C44172HVg.LJIILJJIL.LIZ();
        cameraComponentModel.mVideoHeight = (int) (r0.LIZ / 0.75f);
        C44735Hh5 c44735Hh5 = C44172HVg.LJIILJJIL;
        c44735Hh5.LIZ();
        cameraComponentModel.mVideoWidth = c44735Hh5.LIZ;
        this.LJLL = cameraComponentModel;
        this.LJLLI = new NowsShootModel(0, null, null, null, null, null, null, null, null, null, false, 0L, null, 8191, null);
        if (s.LJJJLZIJ(nowsShootActivityArg.getEnterMethod(), "regular_push", false)) {
            i = 180;
        } else {
            i = LiveTryModeCountDownThresholdSetting.DEFAULT;
        }
        this.LJLLILLLL = i;
    }

    @Override // X.WMH, X.WM7
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
