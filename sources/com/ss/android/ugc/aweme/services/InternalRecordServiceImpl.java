package com.ss.android.ugc.aweme.services;

import X.ActivityC45651qj;
import X.C10K;
import X.C19N;
import X.C1AU;
import X.C1E4;
import X.C1JD;
import X.C221108m2;
import X.C29S;
import X.C42130GgA;
import X.C42383GkF;
import X.C42470Gle;
import X.C43139GwR;
import X.C43465H4b;
import X.C44172HVg;
import X.C44244HYa;
import X.C44245HYb;
import X.C44252HYi;
import X.C44269HYz;
import X.C44356Hay;
import X.C44363Hb5;
import X.C52826KoI;
import X.C5H3;
import X.C60903NvH;
import X.C63946P7u;
import X.C6IC;
import X.C76800UCe;
import X.C77123UOp;
import X.C82622Wbi;
import X.GX0;
import X.H78;
import X.H9T;
import X.HB4;
import X.HD7;
import X.HD8;
import X.HJ4;
import X.HK4;
import X.HX3;
import X.HYX;
import X.HYY;
import X.HYZ;
import X.I0N;
import X.I38;
import X.InterfaceC42669Gor;
import X.InterfaceC43636HAq;
import X.InterfaceC43676HCe;
import X.InterfaceC43721HDx;
import X.InterfaceC74343TFr;
import X.InterfaceC83727WtX;
import X.InterfaceC83865Wvl;
import X.InterfaceC84497XEf;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.Q7K;
import X.TF5;
import X.TGD;
import X.THA;
import X.V18;
import X.W17;
import X.WXA;
import X.X1D;
import Y.ACallableS24S0001000_6;
import Y.AgS46S0000000_7;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.photo.PhotoModule;
import com.ss.android.ugc.aweme.services.duet.DuetUploadServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class InternalRecordServiceImpl implements InterfaceC43636HAq {
    public final C5H3 mMaxDurationResolver$delegate = C221108m2.LIZIZ(InternalRecordServiceImpl$mMaxDurationResolver$2.INSTANCE);

    @Override // X.InterfaceC43636HAq
    public boolean shouldDropCurrentMusicFor3min(Object currentShootTag, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(currentShootTag, "currentShootTag");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        return false;
    }

    private final InternalMaxDurationResolverImpl getMMaxDurationResolver() {
        return (InternalMaxDurationResolverImpl) this.mMaxDurationResolver$delegate.getValue();
    }

    @Override // X.InterfaceC43636HAq
    public C6IC getABService() {
        return new C6IC() { // from class: com.ss.android.ugc.aweme.services.InternalRecordServiceImpl$getABService$1
            public int getCameraOpenRetryCount() {
                return Q7K.LIZIZ("open_camera_retry_count", 10);
            }

            public int getCameraPreviewRetryCount() {
                return Q7K.LIZIZ("start_preview_retry_count", 0);
            }

            public boolean getEnablePreReleaseGPUResource() {
                return C19N.LJ("pre_release_gpu_resource", false);
            }

            public boolean getEnableRenderPause() {
                return C19N.LJ("shoot_page_pause_render_when_leaving", false);
            }

            @Override // X.C6IC
            public boolean getButtonPositionGoDownExperiment() {
                return C44363Hb5.LIZ();
            }
        };
    }

    @Override // X.InterfaceC43636HAq
    public InterfaceC42669Gor getAlbumService() {
        return new AlbumServiceImpl();
    }

    @Override // X.InterfaceC43636HAq
    public InterfaceC43676HCe getDuetUploadService() {
        return new DuetUploadServiceImpl();
    }

    @Override // X.InterfaceC43636HAq
    public HJ4 getNowUIService() {
        return new NowUIServiceImpl();
    }

    public boolean getRequestDuetSettingPermission() {
        if (Keva.getRepo("DUET_SETTING_REPO").getInt("DUET_SETTING_KEY", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43636HAq
    public void requestDuetSettingPermission() {
        C10K.LIZJ(new ACallableS24S0001000_6(0, 7)).LIZLLL(new AgS46S0000000_7(2));
    }

    @Override // X.InterfaceC43636HAq
    public boolean enable3MinRecord() {
        return C43465H4b.LIZIZ();
    }

    @Override // X.InterfaceC43636HAq
    public InterfaceC43721HDx getMaxDurationResolver() {
        return getMMaxDurationResolver();
    }

    @Override // X.InterfaceC43636HAq
    public boolean isRecordingOrEditing() {
        Activity LIZ = C42470Gle.LIZ();
        if (!(LIZ instanceof C29S) || !((C1AU) LIZ).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            ArrayList arrayList = new ArrayList(C42470Gle.LJFF);
            if (arrayList.size() != 0) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    LIZ = (Activity) ListProtector.get(arrayList, size);
                    if ((LIZ instanceof C29S) && ((C1AU) LIZ).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                        break;
                    }
                }
            }
            LIZ = null;
        }
        if (HK4.LIZ(LIZ) != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PublishParallel isRecordingOrEditing result: VideoRecordNewActivity ");
            o.LJII(LIZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            LIZ2.append(((C1AU) LIZ).getLifecycle().getCurrentState());
            H78.LJI(X1D.LIZIZ(LIZ2));
            return true;
        }
        if (!(LIZ instanceof SAAActivity) || !(((SAAActivity) LIZ).LLIIIILZ() instanceof VideoEditContainerScene)) {
            return false;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("PublishParallel isRecordingOrEditing result: VEVideoPublishEditActivity ");
        LIZ3.append(((C1AU) LIZ).getLifecycle().getCurrentState());
        H78.LJI(X1D.LIZIZ(LIZ3));
        return true;
    }

    @Override // X.InterfaceC43636HAq
    public void preloadEffectModel() {
        C44172HVg.LIZJ();
        new HX3().run();
    }

    private final TF5 assembleStickerDependencyRequired(C82622Wbi c82622Wbi) {
        return new TF5(((I0N) c82622Wbi.LJ(I0N.class, null)).LLLLL(), ((I0N) c82622Wbi.LJ(I0N.class, null)).LLZL(), (InterfaceC74343TFr) c82622Wbi.LJ(InterfaceC74343TFr.class, null), new C1E4(), new THA((InterfaceC84497XEf) c82622Wbi.LJ(InterfaceC84497XEf.class, null)), ((TGD) c82622Wbi.LJ(TGD.class, null)).LJLLILLLL);
    }

    private final int getDefaultShootMode(ShortVideoContext shortVideoContext) {
        int i = shortVideoContext.cameraComponentModel.mRestoreType;
        if (i != 1) {
            if (i != 2) {
                return -1;
            }
            return HB4.LIZIZ().shootMode;
        }
        return shortVideoContext.shootMode;
    }

    private final String getDefaultShootTabTagOrigin(ShortVideoContext shortVideoContext) {
        String str;
        if (GX0.LIZ() && !C77123UOp.LJJ(shortVideoContext)) {
            str = I38.RECORD_NOW.getTag();
        } else {
            str = "RecordCombinePhoto";
        }
        if (ORZ.LJLJJI(shortVideoContext.shootWay, C44356Hay.LIZIZ) && !C44252HYi.LIZ() && HYX.LIZ(shortVideoContext) && GX0.LIZ() && !C77123UOp.LJJ(shortVideoContext)) {
            return str;
        }
        String str2 = "";
        if (HYX.LIZIZ(shortVideoContext)) {
            if (e1.LIZ(31744, "studio_creation_record_photo_shootways_plus", true, false)) {
                String str3 = shortVideoContext.shootWay;
                if (str3 != null) {
                    str2 = str3;
                }
                if (C44244HYa.LIZ.getInt(i0.LJFF("last_photo_tab_child_tab_", str2), 17) == 10) {
                    return C44269HYz.LIZ;
                }
                return str;
            }
            return str;
        }
        if (((shortVideoContext.mIsFromDraft && shortVideoContext.shootMode == 17) || (!V18.LJI(shortVideoContext) && HYX.LIZ(shortVideoContext))) && e1.LIZ(31744, "studio_creation_record_photo_shootways_nonplus", true, false)) {
            String str4 = shortVideoContext.shootWay;
            if (str4 != null) {
                str2 = str4;
            }
            if (C44244HYa.LIZ.getInt(i0.LJFF("last_photo_tab_child_tab_", str2), 10) == 17) {
                return str;
            }
            return C44269HYz.LIZ;
        }
        if (C44245HYb.LIZ() && HYY.LIZIZ(shortVideoContext) && shortVideoContext.LJJIJIL()) {
            return HYY.LIZ(shortVideoContext.LJIIJJI());
        }
        return getDefaultTag(getDefaultShootMode(shortVideoContext), shortVideoContext);
    }

    private final int getDefaultTabRes(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.cameraComponentModel.mCurrentDurationMode) {
            if (C43465H4b.LIZIZ()) {
                return R.string.pvz;
            }
            return R.string.pw1;
        }
        return R.string.pvy;
    }

    private final String getSingleSongTag(int i) {
        return HYY.LIZ(i);
    }

    private final String replace3minTo10min(String str) {
        if (((Boolean) C52826KoI.LIZ.getValue()).booleanValue() && HYZ.LIZ() != 0 && o.LJ(str, C44269HYz.LIZJ)) {
            return C44269HYz.LIZLLL;
        }
        return str;
    }

    @Override // X.InterfaceC43636HAq
    public Activity findActivityInstance(Class<? extends ActivityC45651qj> clazz) {
        o.LJIIIZ(clazz, "clazz");
        C42383GkF c42383GkF = C42130GgA.LIZ;
        if (c42383GkF.LJ) {
            Iterator<Activity> it = c42383GkF.LIZ.iterator();
            while (it.hasNext()) {
                Activity next = it.next();
                if (TextUtils.equals(next.getClass().getName(), clazz.getName()) || TextUtils.equals(next.getComponentName().getClassName(), clazz.getName())) {
                    return next;
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC43636HAq
    public String getDefaultShootTabTag(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        return replace3minTo10min(getDefaultShootTabTagOrigin(shortVideoContext));
    }

    public void initVESDK(C63946P7u properties) {
        o.LJIIIZ(properties, "properties");
        C44172HVg.LIZLLL(properties);
    }

    public boolean isMusicUnavailableLongVideo(AVMusic aVMusic) {
        return C1JD.LJIIL(aVMusic);
    }

    @Override // X.InterfaceC43636HAq
    public boolean shouldDisable10MinDraftRecord(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (HYZ.LIZ() == 0 && model.getOriginal() == 1 && model.mShootMode == 18) {
            return true;
        }
        return false;
    }

    private final String getDefaultTag(int i, ShortVideoContext shortVideoContext) {
        int i2;
        if (i == 17) {
            return "RecordCombinePhoto";
        }
        if (i != 10) {
            if (i != 11) {
                if (i != 14) {
                    if (i != 18) {
                        i2 = getDefaultTabRes(shortVideoContext);
                    } else {
                        i2 = R.string.pw0;
                    }
                } else {
                    i2 = R.string.pvz;
                }
            } else {
                i2 = R.string.pw1;
            }
        } else {
            i2 = R.string.pvy;
        }
        String string = C60903NvH.LJ.getString(i2);
        o.LJIIIIZZ(string, "getApplication().getString(tagRes)");
        return string;
    }

    public WXA getARGestureDelegateListener(InterfaceC83727WtX effectController, ViewGroup.MarginLayoutParams clonedSurfaceViewLp) {
        o.LJIIIZ(effectController, "effectController");
        o.LJIIIZ(clonedSurfaceViewLp, "clonedSurfaceViewLp");
        return new W17(effectController, clonedSurfaceViewLp);
    }

    @Override // X.InterfaceC43636HAq
    public HD8 getPhotoModule(ActivityC45651qj activity, InterfaceC83865Wvl mediaController, HD7 onPhotoListener, CreativeInfo creativeInfo) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(mediaController, "mediaController");
        o.LJIIIZ(onPhotoListener, "onPhotoListener");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return new PhotoModule(activity, mediaController, onPhotoListener, creativeInfo);
    }

    @Override // X.InterfaceC43636HAq
    public void photoCanvasGoNext(ActivityC45651qj activity, String localPath, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, boolean z, MediaModel mediaModel, InterfaceC88472Yns<? super Boolean, C76800UCe> onFinish) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(localPath, "localPath");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(onFinish, "onFinish");
        H9T.LJII(new C43139GwR(activity, localPath, null, shortVideoContext, faceStickerBean, -1, z, null, mediaModel, new AqS138S0200000_7(activity, (ActivityC45651qj) onFinish, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 16)));
    }
}
