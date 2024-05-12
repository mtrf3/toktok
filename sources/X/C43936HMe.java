package X;

import Y.ACallableS110S0100000_7;
import Y.ACallableS56S0300000_7;
import Y.AgS124S0100000_7;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.vesdk.VEUtils;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS62S1200000_7;
import kotlin.jvm.internal.AqS74S1100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HMe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43936HMe implements IAVInfoService {
    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final int getMusicDuration(String str) {
        String LJI;
        if (TextUtils.isEmpty(str) || (LJI = HOH.LJI(str)) == null || LJI.length() == 0) {
            return -1;
        }
        int[] iArr = new int[10];
        int audioFileInfo = VEUtils.getAudioFileInfo(LJI, iArr);
        if (audioFileInfo == 0) {
            return iArr[3];
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicUtil#getMusicDuration#VEUtils.getAudioFileInfo(path, audioInfo) ret is ");
        LIZ.append(audioFileInfo);
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
        return HOH.LIZJ(LJI);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final int[] photoInfo(String photoFilePath) {
        o.LJIIIZ(photoFilePath, "photoFilePath");
        if (!C44687HgJ.LIZIZ(photoFilePath)) {
            return new int[]{0, 0};
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C44694HgQ.LIZLLL(photoFilePath, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final boolean supportTrimmedMuisc(MusicModel music) {
        o.LJIIIZ(music, "music");
        if (HCG.LIZ() && music.getMusicType() != MusicModel.MusicType.REUSE_AUDIO && music.getTrimmedMusicDuration() >= 1000 && music.getDuration() - music.getTrimmedMusicDuration() > 100) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void audioLegal(List<String> audioList, IAVInfoService.IGetInfoCallback<List<Integer>> iGetInfoCallback) {
        o.LJIIIZ(audioList, "audioList");
        C10K.LIZJ(new ACallableS110S0100000_7(audioList, 61)).LJ(new AgS124S0100000_7(iGetInfoCallback, 35), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void mp3Legal(String mp3FilePath, IAVInfoService.IGetInfoCallback<Integer> iGetInfoCallback) {
        o.LJIIIZ(mp3FilePath, "mp3FilePath");
        C43939HMh c43939HMh = new C43939HMh();
        c43939HMh.LIZJ = false;
        c43939HMh.LIZIZ = new AqS74S1100000_7(mp3FilePath, iGetInfoCallback, 21);
        c43939HMh.LIZ = new AqS157S0100000_7(iGetInfoCallback, (IAVInfoService.IGetInfoCallback<Integer>) 737);
        c43939HMh.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void videoCover(AwemeDraft draft, IAVInfoService.IGetInfoCallback<Bitmap> iGetInfoCallback) {
        o.LJIIIZ(draft, "draft");
        C43939HMh c43939HMh = new C43939HMh();
        c43939HMh.LIZJ = false;
        c43939HMh.LIZIZ = new AqS154S0200000_7(draft, (AwemeDraft) iGetInfoCallback, (IAVInfoService.IGetInfoCallback<Bitmap>) 138);
        c43939HMh.LIZ = new AqS157S0100000_7(iGetInfoCallback, (IAVInfoService.IGetInfoCallback<Integer>) 738);
        c43939HMh.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void audioLegal(String audioFilePath, int i, IAVInfoService.IGetInfoCallback<Integer> iGetInfoCallback) {
        o.LJIIIZ(audioFilePath, "audioFilePath");
        if (iGetInfoCallback != null) {
            iGetInfoCallback.finish(Integer.valueOf(TEVideoUtils.nativeCheckAudioFile(audioFilePath)));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void mp3Legal(Context context, String mp3FilePath, IAVInfoService.IGetInfoCallback<Integer> iGetInfoCallback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(mp3FilePath, "mp3FilePath");
        C43939HMh c43939HMh = new C43939HMh();
        c43939HMh.LIZJ = false;
        c43939HMh.LIZIZ = new AqS62S1200000_7(context, mp3FilePath, iGetInfoCallback, 4);
        c43939HMh.LIZ = new AqS157S0100000_7(iGetInfoCallback, (IAVInfoService.IGetInfoCallback<Integer>) 736);
        c43939HMh.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void videoFrame(String videoPath, int[] ptsMs, IAVInfoService.VEFrameAvailableListener listener) {
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(ptsMs, "ptsMs");
        o.LJIIIZ(listener, "listener");
        C43937HMf c43937HMf = new C43937HMf(listener);
        C43939HMh c43939HMh = new C43939HMh();
        c43939HMh.LIZJ = true;
        c43939HMh.LIZIZ = new AqS62S1200000_7(videoPath, ptsMs, c43937HMf, 5);
        c43939HMh.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void videoInfo(String videoFilePath, boolean z, IAVInfoService.IGetInfoCallback<int[]> callback) {
        o.LJIIIZ(videoFilePath, "videoFilePath");
        o.LJIIIZ(callback, "callback");
        C43939HMh c43939HMh = new C43939HMh();
        c43939HMh.LIZJ = false;
        c43939HMh.LIZIZ = new C43643HAx(videoFilePath, z, callback);
        c43939HMh.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void audioLegal(Context context, List<? extends MusicModel> audioList, IAVInfoService.IFilterMedia<Integer> filterRule, IAVInfoService.IGetInfoCallback<List<MusicModel>> iGetInfoCallback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(audioList, "audioList");
        o.LJIIIZ(filterRule, "filterRule");
        C10K.LIZJ(new ACallableS56S0300000_7(audioList, context, filterRule, 12)).LJ(new AgS124S0100000_7(iGetInfoCallback, 34), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void importLegal(Context context, String videoPath, boolean z, int i, int i2, InterfaceC88471Ynr<? super String, ? super Long, C76800UCe> onSuccess, InterfaceC88474Ynu<? super String, ? super Long, ? super Integer, ? super String, C76800UCe> onError) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(onSuccess, "onSuccess");
        o.LJIIIZ(onError, "onError");
        C43939HMh c43939HMh = new C43939HMh();
        c43939HMh.LIZJ = true;
        c43939HMh.LIZIZ = new C43932HMa(context, videoPath, z, i, i2, onSuccess, onError);
        c43939HMh.LIZ = new AqS156S0100000_6(onError, (InterfaceC88474Ynu<? super String, ? super Long, ? super Integer, ? super String, C76800UCe>) 164);
        c43939HMh.LIZ();
    }
}
