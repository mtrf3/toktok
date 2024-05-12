package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.services.external.ability.IAVVESDKService;
import com.ss.android.ugc.aweme.services.external.ability.VEAudioFileInfo;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.vesdk.VEUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.Ups, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78404Ups implements InterfaceC19890qH, InterfaceC73592SuS, C0K7, IAVVESDKService {
    public static String LJLIL = "";
    public static long LJLILLLLZI;
    public static long LJLJI;
    public static long LJLJJI;
    public static final C78404Ups LJLJJL = new C78404Ups();
    public static final C78404Ups LJLJJLL = new C78404Ups();
    public static final C78404Ups LJLJL = new C78404Ups();

    @Override // X.InterfaceC19890qH
    public void onShow() {
        InterfaceC30442Bx8.LLZIL.LIZ(Boolean.TRUE);
    }

    public static void LIZ(C78368UpI c78368UpI) {
        String str = LJLIL;
        if (str == null || str.isEmpty()) {
            return;
        }
        c78368UpI.addPerformanceLog("get_store_callback_duration", Long.toString(LJLILLLLZI));
        c78368UpI.addPerformanceLog("upload_receipt_duration", Long.toString(LJLJI));
        c78368UpI.addPerformanceLog("query_payment_duration", Long.toString(LJLJJI));
        LJLIL = "";
        LJLILLLLZI = 0L;
        LJLJI = 0L;
        LJLJJI = 0L;
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.cancel();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVVESDKService
    public VEAudioFileInfo getAudioFileInfo(String strInVideo) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        o.LJIIIZ(strInVideo, "strInVideo");
        VEUtils.VEAudioFileInfo audioFileInfo = VEUtils.getAudioFileInfo(strInVideo);
        Integer num5 = null;
        if (audioFileInfo != null) {
            num5 = Integer.valueOf(audioFileInfo.sampleRate);
            num = Integer.valueOf(audioFileInfo.channelSize);
            num2 = Integer.valueOf(audioFileInfo.sampleFormat);
            num3 = Integer.valueOf(audioFileInfo.duration);
            num4 = Integer.valueOf(audioFileInfo.bitRate);
        } else {
            num = null;
            num2 = null;
            num3 = null;
            num4 = null;
        }
        return new VEAudioFileInfo(num5, num, num2, num3, num4);
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        C81154Vt8 output = (C81154Vt8) obj;
        o.LJIIIZ(output, "output");
        if (output.LIZLLL >= 0) {
            return true;
        }
        return false;
    }

    public static final EV6 LIZIZ(AssemViewModel assemViewModel, C65776Prg c65776Prg) {
        o.LJIIIZ(assemViewModel, "<this>");
        return new EV6(assemViewModel, c65776Prg);
    }

    public static final C214188as LIZJ(AssemViewModel assemViewModel, InterfaceC65784Pro factory) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(factory, "factory");
        return new C214188as(assemViewModel, factory);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVVESDKService
    public AVMusicWaveBean getMusicWaveData(String audioFile, int i, int i2) {
        o.LJIIIZ(audioFile, "audioFile");
        return WG0.LIZJ(VEUtils.getMusicWaveData(audioFile, i, i2));
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVVESDKService
    public AVMusicWaveBean getResampleMusicWaveData(float[] waveData, int i, int i2) {
        o.LJIIIZ(waveData, "waveData");
        return WG0.LIZJ(VEUtils.getResampleMusicWaveData(waveData, i, i2));
    }
}
