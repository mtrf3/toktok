package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C10K;
import X.C16880lQ;
import X.C189737cX;
import X.C34K;
import X.C41043G8x;
import X.C43921HLp;
import X.C44336Hae;
import X.C44340Hai;
import X.C44343Hal;
import X.C44729Hgz;
import X.C46193IAz;
import X.C47959Irz;
import X.C76800UCe;
import X.FFL;
import X.I2Y;
import X.I2Z;
import X.InterfaceC43927HLv;
import X.InterfaceC88472Yns;
import X.ORZ;
import Y.ACallableS110S0100000_7;
import android.graphics.Bitmap;
import android.os.Looper;
import com.bytedance.ies.smartmovie.jni.PictureInfo;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.fragment.QnaSuggestedTabFragment;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.RecordPresetResourceState;
import com.zhiliaoapp.musically.R;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class AqS60S1100000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(EffectPlatformBuilder effectplatform) {
        o.LJIIIZ(effectplatform, "$this$effectplatform");
        String str = this.s0;
        if (str != null) {
            effectplatform.setRegion(str);
        }
        effectplatform.setCacheDir(((EffectService) this.l1).MV_RES_CACHE_FILE);
        ((EffectService) this.l1).setMvEffectPlatformCacheSize(effectplatform);
    }

    public static final Object invoke$0(AqS60S1100000_7 aqS60S1100000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = ((QnaSuggestedTabFragment) aqS60S1100000_7.l1).requireContext().getString(R.string.efd);
        o.LJIIIIZZ(string, "requireContext().getString(R.string.delete)");
        actionGroup.LJFF(string, new AqS65S1100000_12((QnaSuggestedTabFragment) aqS60S1100000_7.l1, aqS60S1100000_7.s0, 2));
        String string2 = ((QnaSuggestedTabFragment) aqS60S1100000_7.l1).requireContext().getString(R.string.cg_);
        o.LJIIIIZZ(string2, "requireContext().getString(R.string.cancel)");
        actionGroup.LJIIIZ(string2, C41043G8x.LJLIL);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS60S1100000_7 aqS60S1100000_7, Object obj) {
        aqS60S1100000_7.invoke$0((EffectPlatformBuilder) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS60S1100000_7 aqS60S1100000_7, Object obj) {
        InterfaceC43927HLv invokeCallback = (InterfaceC43927HLv) obj;
        o.LJIIIZ(invokeCallback, "$this$invokeCallback");
        invokeCallback.LIZ(C43921HLp.LIZIZ);
        invokeCallback.LIZJ(aqS60S1100000_7.s0, ((C189737cX) aqS60S1100000_7.l1).LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS60S1100000_7 aqS60S1100000_7, Object obj) {
        C44340Hai it = (C44340Hai) obj;
        o.LJIIIZ(it, "it");
        it.LIZ = false;
        it.LIZIZ = new AqS60S1100000_7((C44336Hae) aqS60S1100000_7.l1, aqS60S1100000_7.s0, 12);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS60S1100000_7 aqS60S1100000_7, Object obj) {
        List selected = (List) obj;
        o.LJIIIZ(selected, "selected");
        User friend = (User) ORZ.LJLLJ(selected);
        C44336Hae c44336Hae = (C44336Hae) aqS60S1100000_7.l1;
        C44343Hal c44343Hal = (C44343Hal) c44336Hae.LJLJJL.LIZ(c44336Hae, C44336Hae.LJLJL[1]);
        c44343Hal.getClass();
        o.LJIIIZ(friend, "friend");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sec_uid", friend.getSecUid());
        jSONObject.put("uid", friend.getUid());
        c44343Hal.LJ().LIZ(16385, 3L, 0L, jSONObject.toString());
        C44336Hae c44336Hae2 = (C44336Hae) aqS60S1100000_7.l1;
        String sessionUrl = aqS60S1100000_7.s0;
        o.LJIIIIZZ(sessionUrl, "sessionUrl");
        c44336Hae2.getClass();
        AqS62S1200000_7 aqS62S1200000_7 = new AqS62S1200000_7(friend, c44336Hae2, sessionUrl, 3);
        if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            aqS62S1200000_7.invoke();
        } else {
            C10K.LIZJ(new ACallableS110S0100000_7(aqS62S1200000_7, 53));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS60S1100000_7 aqS60S1100000_7, Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        Set<I2Y> set = ((I2Z) aqS60S1100000_7.l1).LIZJ;
        String str = aqS60S1100000_7.s0;
        Iterator<I2Y> it2 = set.iterator();
        while (it2.hasNext()) {
            it2.next().LJJLIIIJL(str, it);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS60S1100000_7 aqS60S1100000_7, Object obj) {
        ChooseMediaState setState = (ChooseMediaState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ChooseMediaState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, setState.getPreviewNextBtnState().copy(aqS60S1100000_7.s0, ((C34K) aqS60S1100000_7.l1).element), null, null, false, null, null, null, null, null, null, null, null, null, -4194305, 7, null);
    }

    public static final Object invoke$3(AqS60S1100000_7 aqS60S1100000_7, Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        ((C46193IAz) aqS60S1100000_7.l1).LLF().LLIIIJ(aqS60S1100000_7.s0, it);
        ((C46193IAz) aqS60S1100000_7.l1).LLJI = 1;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS60S1100000_7 aqS60S1100000_7, Object obj) {
        ChooseMediaState setState = (ChooseMediaState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ChooseMediaState.copy$default(setState, null, null, null, null, null, setState.getLastPreMusicState().copy((MusicModel) aqS60S1100000_7.l1, aqS60S1100000_7.s0), null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -33, 7, null);
    }

    public static final Object invoke$5(AqS60S1100000_7 aqS60S1100000_7, Object obj) {
        ChooseMediaState setState = (ChooseMediaState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ChooseMediaState.copy$default(setState, null, null, null, null, null, setState.getPreMusicState().copy((MusicModel) aqS60S1100000_7.l1, aqS60S1100000_7.s0), null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -33, 7, null);
    }

    public static final Object invoke$6(AqS60S1100000_7 aqS60S1100000_7, Object obj) {
        ChooseMediaState setState = (ChooseMediaState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ChooseMediaState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, new RecordPresetResourceState((AVMusic) aqS60S1100000_7.l1, aqS60S1100000_7.s0), null, null, null, null, null, null, null, null, -67108865, 7, null);
    }

    public static final Object invoke$7(AqS60S1100000_7 aqS60S1100000_7, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((MvChoosePhotoScene) aqS60S1100000_7.l1).LLZL(aqS60S1100000_7.s0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS60S1100000_7 aqS60S1100000_7, Object obj) {
        Bitmap.CompressFormat compressFormat;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            PictureInfo pictureInfo = (PictureInfo) aqS60S1100000_7.l1;
            String str = aqS60S1100000_7.s0;
            SmartMovieJniJNI.PictureInfo_resizeWidth_set(pictureInfo.LIZJ, pictureInfo, bitmap.getWidth());
            SmartMovieJniJNI.PictureInfo_resizeHeight_set(pictureInfo.LIZJ, pictureInfo, bitmap.getHeight());
            if (SmartMovieJniJNI.UploadInfo_needFeature_get(pictureInfo.LIZ, pictureInfo)) {
                ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
                bitmap.copyPixelsToBuffer(allocate);
                byte[] array = allocate.array();
                o.LJIIIIZZ(array, "buf.array()");
                SmartMovieJniJNI.PictureInfo_setData(pictureInfo.LIZJ, pictureInfo, array);
            } else {
                String LIZLLL = C47959Irz.LIZLLL(31744, "autocut_frame_upload_type", "png", true);
                if (o.LJ(LIZLLL, "png")) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                } else if (o.LJ(LIZLLL, "webp")) {
                    compressFormat = Bitmap.CompressFormat.WEBP;
                } else {
                    compressFormat = Bitmap.CompressFormat.PNG;
                }
                FFL.LJIIIZ().getClass();
                C44729Hgz.LJJJJL(bitmap, str, compressFormat, FFL.LJIIJ(31744, 100, "autocut_frame_upload_quality", true));
                SmartMovieJniJNI.PictureInfo_resizePath_set(pictureInfo.LIZJ, pictureInfo, str);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS60S1100000_7 aqS60S1100000_7, Object obj) {
        InterfaceC43927HLv invokeCallback = (InterfaceC43927HLv) obj;
        o.LJIIIZ(invokeCallback, "$this$invokeCallback");
        invokeCallback.LJI(aqS60S1100000_7.s0, (C189737cX) aqS60S1100000_7.l1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S1100000_7(C44336Hae c44336Hae, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c44336Hae;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S1100000_7(I2Z i2z, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = i2z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S1100000_7(C46193IAz c46193IAz, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c46193IAz;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S1100000_7(PictureInfo pictureInfo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = pictureInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S1100000_7(QnaSuggestedTabFragment qnaSuggestedTabFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = qnaSuggestedTabFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S1100000_7(AVMusic aVMusic, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = aVMusic;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S1100000_7(MusicModel musicModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = musicModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S1100000_7(MvChoosePhotoScene mvChoosePhotoScene, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = mvChoosePhotoScene;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S1100000_7(String str, C34K c34k, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S1100000_7(String str, C189737cX c189737cX, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c189737cX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S1100000_7(String str, EffectService effectService, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = effectService;
    }
}
