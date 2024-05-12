package Y;

import X.AR4;
import X.ActivityC45651qj;
import X.C0NB;
import X.C0NC;
import X.C145995oB;
import X.C16880lQ;
import X.C1I0;
import X.C24540xm;
import X.C29867Bnr;
import X.C40599FwZ;
import X.C41859Gbn;
import X.C43882HKc;
import X.C43933HMb;
import X.C44019HPj;
import X.C44066HRe;
import X.C44172HVg;
import X.C44350Has;
import X.C45439HsR;
import X.C45658Hvy;
import X.C45804HyK;
import X.C5NP;
import X.C6BK;
import X.C73340SqO;
import X.C76800UCe;
import X.C77412UZs;
import X.C78915Uy7;
import X.C82891Wg3;
import X.EF7;
import X.FMX;
import X.G8G;
import X.GUH;
import X.GVM;
import X.H89;
import X.HU5;
import X.IDP;
import X.InterfaceC215138cP;
import X.InterfaceC30237Btp;
import X.InterfaceC40961G5t;
import X.InterfaceC88472Yns;
import X.MLL;
import X.NN1;
import X.OJY;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.prop.ReuseStickerUpdateSP;
import com.ss.android.ugc.aweme.services.IDLCallbackS16S0200000_7;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAlbumConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishDialogFragment;
import com.ss.android.ugc.aweme.shortvideo.util.performance.UGCOpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.utils.Au2S16S0100000_7;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes8.dex */
public class AObjectS40S0201000_7 implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS40S0201000_7 aObjectS40S0201000_7, Object obj) {
        String str;
        switch (aObjectS40S0201000_7.i2) {
            case 0:
                IDP idp = (IDP) aObjectS40S0201000_7.l0;
                idp.LJJLIIIJLLLLLLLZ(0, (Aweme) aObjectS40S0201000_7.l1);
                OJY LJIL = C73340SqO.LJIL();
                Context LJJIIZ = idp.LJJIIZ();
                LJIL.getClass();
                NN1.LJJIJ(LJJIIZ, (Aweme) obj);
                return C76800UCe.LIZ;
            default:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS40S0201000_7.l0;
                InterfaceC40961G5t interfaceC40961G5t = (InterfaceC40961G5t) aObjectS40S0201000_7.l1;
                videoPublishContainerScene.getClass();
                ((AR4) obj).LIZIZ = true;
                interfaceC40961G5t.LIZ();
                C145995oB c145995oB = new C145995oB();
                VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
                if (videoPublishEditModel != null) {
                    str = videoPublishEditModel.getCreationId();
                } else {
                    str = "mModel is null";
                }
                c145995oB.LJI("creation_id", str);
                c145995oB.LJI("content_type", videoPublishContainerScene.LLLLIILLL());
                c145995oB.LJI("content_source", videoPublishContainerScene.LLILZLL.getAvetParameter().getContentSource());
                c145995oB.LJI("exit_method", "Cancel");
                FMX.LJIIL("dismiss_aigc_pop_up", c145995oB.LIZ);
                return null;
        }
    }

    public static final Object invoke$1(AObjectS40S0201000_7 aObjectS40S0201000_7, Object obj) {
        switch (aObjectS40S0201000_7.i2) {
            case 0:
                C44019HPj c44019HPj = (C44019HPj) aObjectS40S0201000_7.l0;
                MLL mll = (MLL) aObjectS40S0201000_7.l1;
                c44019HPj.LIZ.deleteSmartLockAccount(mll.LIZ, mll.LIZIZ, mll.LJ);
                return C76800UCe.LIZ;
            default:
                String str = (String) aObjectS40S0201000_7.l0;
                Context context = (Context) aObjectS40S0201000_7.l1;
                NLETemplateModel nLETemplateModel = (NLETemplateModel) obj;
                UgcTemplateAlbumConfig ugcTemplateAlbumConfig = new UgcTemplateAlbumConfig();
                ugcTemplateAlbumConfig.setTemplateId("67999");
                ugcTemplateAlbumConfig.setTemplateUrl(str);
                ugcTemplateAlbumConfig.setTemplateMD5("gkgkgjh989y9y");
                ugcTemplateAlbumConfig.setCreativeInfo(new CreativeInfo());
                ugcTemplateAlbumConfig.setSlotIndex(0);
                if (nLETemplateModel != null) {
                    ugcTemplateAlbumConfig.setClipDurations(H89.LIZ.LIZIZ(nLETemplateModel));
                }
                G8G.LIZ.start(UGCOpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
                ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(2));
                shortVideoContext.cameraComponentModel.mWorkspace = HU5.LIZ(ugcTemplateAlbumConfig.getCreativeInfo());
                shortVideoContext.creativeInfo = ugcTemplateAlbumConfig.getCreativeInfo();
                shortVideoContext.LIZLLL().setCreationId(ugcTemplateAlbumConfig.getCreativeInfo().getCreationId());
                shortVideoContext.shootWay = ugcTemplateAlbumConfig.getShootWay();
                shortVideoContext.enterFrom = ugcTemplateAlbumConfig.getEnterFrom();
                Bundle bundle = new Bundle();
                bundle.putInt("key_template_slot_index", ugcTemplateAlbumConfig.getSlotIndex());
                bundle.putString("key_ugc_template_music_path", ugcTemplateAlbumConfig.getMusicPath());
                bundle.putSerializable("key_ugc_template_anchor", ugcTemplateAlbumConfig.getAnchor());
                bundle.putString("key_ugc_template_id", ugcTemplateAlbumConfig.getTemplateId());
                bundle.putString("key_ugc_template_url", ugcTemplateAlbumConfig.getTemplateUrl());
                bundle.putString("key_ugc_template_md5", ugcTemplateAlbumConfig.getTemplateMD5());
                bundle.putInt("key_ugc_template_music_relative_start", ugcTemplateAlbumConfig.getMusicRelativeStart());
                C77412UZs.LJJIJLIJ(bundle, ugcTemplateAlbumConfig.getCreativeInfo());
                bundle.putParcelable("key_short_video_context", shortVideoContext);
                bundle.putInt("key_choose_scene", 24);
                ArrayList<Integer> arrayList = new ArrayList<>();
                Iterator<Float> it = ugcTemplateAlbumConfig.getClipDurations().iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf((int) (it.next().floatValue() * 1000.0f)));
                }
                bundle.putIntegerArrayList("clip_arg_data_process_items", arrayList);
                bundle.putParcelableArrayList("clip_arg_data_process_origin_items", ugcTemplateAlbumConfig.getSlotList());
                bundle.putParcelable("clip_arg_data_process_music_item", ugcTemplateAlbumConfig.getMusicSlot());
                shortVideoContext.cameraComponentModel.mMusicStart = ugcTemplateAlbumConfig.getMusicStart();
                shortVideoContext.cameraComponentModel.musicEndTime = ugcTemplateAlbumConfig.getMusicEnd();
                MusicModel musicModel = ugcTemplateAlbumConfig.getMusicModel();
                if (musicModel != null) {
                    musicModel.setMusicBeginTime(ugcTemplateAlbumConfig.getMusicStart());
                    musicModel.setMusicEndTime(ugcTemplateAlbumConfig.getMusicEnd());
                }
                AVMusic transformMusicModel = C44172HVg.LJI.transformMusicModel(musicModel);
                if (transformMusicModel != null) {
                    bundle.putSerializable("aweme_music", transformMusicModel);
                    bundle.putSerializable("music_model", musicModel);
                }
                o.LJIIIZ(context, "context");
                Intent intent = new Intent(context, (Class<?>) MvChoosePhotoActivity.class);
                intent.putExtras(bundle);
                intent.putExtra("key_choose_request_code", 1);
                C16880lQ.LIZJ(context, intent);
                return null;
        }
    }

    public static final Object invoke$2(AObjectS40S0201000_7 aObjectS40S0201000_7, Object obj) {
        switch (aObjectS40S0201000_7.i2) {
            case 0:
                InterfaceC215138cP interfaceC215138cP = (InterfaceC215138cP) aObjectS40S0201000_7.l0;
                interfaceC215138cP.onNext(aObjectS40S0201000_7.l1);
                interfaceC215138cP.onComplete();
                return C76800UCe.LIZ;
            default:
                Object obj2 = aObjectS40S0201000_7.l0;
                Object obj3 = aObjectS40S0201000_7.l1;
                RecorderConcatResult recorderConcatResult = (RecorderConcatResult) obj;
                obj2.getClass();
                C5NP LIZLLL = C82891Wg3.LIZLLL();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("CameraVideoRecorder executeAsync concatasync result ");
                LIZ.append(recorderConcatResult.ret);
                LIZLLL.i(X1D.LIZIZ(LIZ));
                new Handler(C16880lQ.LLJJJJ()).post(new C0NC(1, obj2, obj3, recorderConcatResult));
                return C76800UCe.LIZ;
        }
    }

    public static final Object invoke$3(AObjectS40S0201000_7 aObjectS40S0201000_7, Object obj) {
        switch (aObjectS40S0201000_7.i2) {
            case 0:
                C29867Bnr c29867Bnr = (C29867Bnr) aObjectS40S0201000_7.l0;
                InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) aObjectS40S0201000_7.l1;
                c29867Bnr.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C16880lQ.LJLLJ(C29867Bnr.class));
                LIZ.append("_guestClickEmptyContainer receive MultiGuestGuestShowSharePanelEvent");
                C0NB.LIZIZ("voice_chat", X1D.LIZIZ(LIZ));
                c29867Bnr.LLFF = true;
                c29867Bnr.onClick(interfaceC30237Btp.LJFF());
                return C76800UCe.LIZ;
            default:
                C45658Hvy c45658Hvy = (C45658Hvy) aObjectS40S0201000_7.l0;
                Context context = (Context) aObjectS40S0201000_7.l1;
                C43933HMb c43933HMb = (C43933HMb) obj;
                c45658Hvy.getClass();
                c45658Hvy.LJLZ(1, c43933HMb.LJLILLLLZI, c43933HMb.LJLJI);
                C6BK c6bk = new C6BK();
                c6bk.LIZ.put("errorCode", String.valueOf(c43933HMb.LJLJJL));
                c6bk.LIZ.put("errorMsg", c43933HMb.LJLJJLL);
                C43882HKc.LIZLLL(1, "aweme_movie_import_error_rate", c6bk.LJ(), true);
                C45804HyK.LJJLIIIJJI(context, c43933HMb.LJLJJL, -1, 0, 24);
                return null;
        }
    }

    public static final Object invoke$4(AObjectS40S0201000_7 aObjectS40S0201000_7, Object obj) {
        String str;
        switch (aObjectS40S0201000_7.i2) {
            case 0:
                Activity activity = (Activity) aObjectS40S0201000_7.l0;
                String str2 = (String) aObjectS40S0201000_7.l1;
                UgCommonServiceImpl.LJIJ().LJI();
                C40599FwZ.LIZ(activity);
                ReuseStickerUpdateSP reuseStickerUpdateSP = (ReuseStickerUpdateSP) new C44350Has(new C45439HsR()).LIZ(activity, ReuseStickerUpdateSP.class);
                long currentTimeMillis = System.currentTimeMillis();
                reuseStickerUpdateSP.setEid(str2);
                reuseStickerUpdateSP.setTime(currentTimeMillis);
                reuseStickerUpdateSP.setVcode((int) EF7.LIZJ());
                return null;
            case 1:
                IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7 = (IDLCallbackS16S0200000_7) aObjectS40S0201000_7.l0;
                n nVar = (n) aObjectS40S0201000_7.l1;
                ((C44066HRe) iDLCallbackS16S0200000_7.l1).LJI = (Effect) obj;
                nVar.LJ(null);
                return C76800UCe.LIZ;
            default:
                Au2S16S0100000_7 au2S16S0100000_7 = (Au2S16S0100000_7) aObjectS40S0201000_7.l1;
                Activity activity2 = (Activity) aObjectS40S0201000_7.l0;
                String str3 = ((PublishDialogFragment) au2S16S0100000_7.l0).LJLJI;
                if (str3 != null && GUH.LJII(str3)) {
                    C24540xm.LIZ(R.string.q6c, activity2, 2033);
                    ((PublishDialogFragment) au2S16S0100000_7.l0).onDestroy();
                } else {
                    C41859Gbn LIZIZ = C1I0.LIZIZ();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("publishId is Null: ");
                    LIZ.append(((PublishDialogFragment) au2S16S0100000_7.l0).LJLJI);
                    LIZ.append("publish progress: ");
                    TextView textView = ((PublishDialogFragment) au2S16S0100000_7.l0).LJLJL;
                    if (textView != null) {
                        str = textView.getText().toString();
                    } else {
                        str = "mProgressText is null";
                    }
                    LIZ.append(str);
                    LIZIZ.LIZJ("report_cancel_failure_reason", X1D.LIZIZ(LIZ));
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(R.string.q6_);
                    C78915Uy7.LJJIIZI(activity2, 2034, creativeToastBuilder);
                }
                GVM.LIZ(((PublishDialogFragment) au2S16S0100000_7.l0).LJLJLJ.getArgs(), "quit");
                return C76800UCe.LIZ;
        }
    }

    public AObjectS40S0201000_7(Au2S16S0100000_7 au2S16S0100000_7, ActivityC45651qj activityC45651qj, int i) {
        this.$t = i;
        this.i2 = 2;
        this.l1 = au2S16S0100000_7;
        this.l0 = activityC45651qj;
    }

    public AObjectS40S0201000_7(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
