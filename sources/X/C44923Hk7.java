package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.services.watermark.ViralEffectInfo;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Hk7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44923Hk7 extends QXX {
    public final Aweme LJLIL;
    public final Context LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public boolean LJLJJL;
    public WaterMarkBuilder LJLJJLL;
    public InterfaceC44926HkA LJLJL;
    public final C44924Hk8 LJLJLJ;
    public final C44925Hk9 LJLJLLL;

    @Override // X.QXX
    public final void LJLJI() {
        IWaterMarkService iWaterMarkService = (IWaterMarkService) this.LJLJLJ.get();
        if (iWaterMarkService != null) {
            iWaterMarkService.cancelWaterMark();
        }
    }

    public C44923Hk7(AbstractC44957Hkf abstractC44957Hkf) {
        super(abstractC44957Hkf);
        this.LJLJLJ = new C44924Hk8();
        this.LJLJLLL = new C44925Hk9(this);
        this.LJLIL = abstractC44957Hkf.LJFF;
        this.LJLILLLLZI = abstractC44957Hkf.LIZIZ;
        this.LJLJI = abstractC44957Hkf.LIZJ();
        this.LJLJJI = abstractC44957Hkf.LIZLLL();
    }

    @Override // X.QXX
    public final void LLLLLIL(C87753YcH c87753YcH) {
        this.LJLJL = c87753YcH;
    }

    @Override // X.QXX
    public final void LJLJJLL(String str, String str2) {
        C44938HkM.LIZJ = true;
        if (str == null || str2 == null) {
            return;
        }
        C77413UZt.LJIIIIZZ(str, false);
        if (this.LJLJJI) {
            C44496HdE.LIZ();
        }
        C58604MzI.LIZIZ.waterMarkStart();
        WaterMarkBuilder waterMarkBuilder = this.LJLJJLL;
        if (waterMarkBuilder == null) {
            return;
        }
        if (C44927HkB.LIZLLL(this.LJLIL)) {
            IWaterMarkService iWaterMarkService = (IWaterMarkService) this.LJLJLJ.get();
            if (iWaterMarkService == null) {
                return;
            }
            iWaterMarkService.watermarkForTikTokNow(waterMarkBuilder);
            return;
        }
        if (this.LJLJJL) {
            IWaterMarkService iWaterMarkService2 = (IWaterMarkService) this.LJLJLJ.get();
            if (iWaterMarkService2 == null) {
                return;
            }
            iWaterMarkService2.addEffectWatermark(waterMarkBuilder);
            return;
        }
        IWaterMarkService iWaterMarkService3 = (IWaterMarkService) this.LJLJLJ.get();
        if (iWaterMarkService3 == null) {
            return;
        }
        iWaterMarkService3.waterMark(waterMarkBuilder);
    }

    @Override // X.QXX
    public final void LLJJJJJIL(long j, long j2, boolean z, String inputPath, String outputPath) {
        int i;
        String str;
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        Aweme aweme = this.LJLIL;
        if (aweme != null) {
            if (C44927HkB.LIZLLL(aweme)) {
                if (this.LJLJJI) {
                    i = 17;
                } else {
                    i = 16;
                }
            } else if (this.LJLJJI) {
                i = 2;
            } else {
                i = -1;
            }
            String LIZJ = C44927HkB.LIZJ(aweme);
            this.LJLJJL = !TextUtils.isEmpty(LIZJ);
            WaterMarkBuilder waterMarkBuilder = new WaterMarkBuilder();
            waterMarkBuilder.setInputPath(inputPath);
            waterMarkBuilder.setOutPath(outputPath);
            ShareDependService.LIZ.getClass();
            ShareDependService LIZ = C44498HdG.LIZ();
            User author = aweme.getAuthor();
            o.LJIIIIZZ(author, "aweme.author");
            waterMarkBuilder.setWaterParams(LIZ.LJJIIZ(author), aweme.getVideo());
            waterMarkBuilder.setAddInterMark(this.LJLJI);
            waterMarkBuilder.setIsInstagram(this.LJLJJI);
            waterMarkBuilder.setSaveType(i);
            waterMarkBuilder.setForce16To9Ratio(false);
            C45399Hrn LJFF = C45399Hrn.LJFF();
            LJFF.getClass();
            String str2 = "";
            if (!C78688UuS.LJJIJIIJIL()) {
                str = "";
            } else {
                str = LJFF.LJLIL;
            }
            waterMarkBuilder.setActivityWaterMark(str);
            waterMarkBuilder.setIsRichEndMode(true);
            waterMarkBuilder.setUrl(waterMarkBuilder.mUrl);
            waterMarkBuilder.setDownloadDuration(j);
            waterMarkBuilder.setDownloadRate(j2);
            if (AudioWatermarkServiceImpl.LIZLLL().enbaleAudioWatermarkTTSVC()) {
                waterMarkBuilder.setTTSVoiceCreatorDesc("");
            } else {
                if (aweme.needTTSWatermarkWhenDownload()) {
                    Context context = this.LJLILLLLZI;
                    if (context != null) {
                        str2 = context.getString(R.string.t4d);
                    } else {
                        str2 = null;
                    }
                }
                waterMarkBuilder.setTTSVoiceCreatorDesc(str2);
            }
            waterMarkBuilder.setTtsCreatorIdList(aweme.getTtsVoiceIDs());
            waterMarkBuilder.setVcCreatorIdList(aweme.getVcVoiceIDs());
            waterMarkBuilder.setListener(this.LJLJLLL);
            if (this.LJLJJL) {
                waterMarkBuilder.setEffectInfo(new ViralEffectInfo(LIZJ, null, null, 6, null));
            }
            waterMarkBuilder.setForceInputResolution(z);
            waterMarkBuilder.aigcLabelType = aweme.aigcInfo.getAIGCLabelType();
            this.LJLJJLL = waterMarkBuilder;
        }
    }
}
