package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;
import com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HdF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44497HdF<T> implements InterfaceC66992k3 {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C44497HdF(Aweme aweme, String str) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<String> interfaceC65052gv) {
        if (C44896Hjg.LJII(this.LJLIL)) {
            ((C73578SuE) interfaceC65052gv).onSuccess(this.LJLILLLLZI);
            return;
        }
        C39579Fg7.LJ((String) C44890Hja.LJIIJ.getValue(), false);
        C44886HjW c44886HjW = new C44886HjW(this.LJLIL, (C73578SuE) interfaceC65052gv);
        WaterMarkBuilder waterMarkBuilder = new WaterMarkBuilder();
        String str = this.LJLILLLLZI;
        Aweme aweme = this.LJLIL;
        waterMarkBuilder.setInputPath(str);
        waterMarkBuilder.setOutPath(C44890Hja.LJFF);
        ShareDependService LJJIZ = ShareDependServiceImpl.LJJIZ();
        User author = aweme.getAuthor();
        o.LJIIIIZZ(author, "aweme.author");
        C44423Hc3 LJJIIZ = LJJIZ.LJJIIZ(author);
        Video video = aweme.getVideo();
        if (video.getWidth() == 0 || video.getHeight() == 0) {
            video.setWidth(576);
            video.setHeight(1024);
        }
        waterMarkBuilder.setWaterParams(LJJIIZ, video);
        waterMarkBuilder.setSaveType(-1);
        waterMarkBuilder.setAddInterMark(true);
        waterMarkBuilder.setAddEndMark(false);
        waterMarkBuilder.setListener(c44886HjW);
        waterMarkBuilder.setIsRichEndMode(false);
        String str2 = "";
        if (AudioWatermarkServiceImpl.LIZLLL().enbaleAudioWatermarkTTSVC()) {
            waterMarkBuilder.setTTSVoiceCreatorDesc("");
        } else {
            if (this.LJLIL.needTTSWatermarkWhenDownload()) {
                str2 = C44890Hja.LIZ().getString(R.string.t4d);
            }
            waterMarkBuilder.setTTSVoiceCreatorDesc(str2);
        }
        waterMarkBuilder.setVcCreatorIdList(this.LJLIL.getVcVoiceIDs());
        waterMarkBuilder.setTtsCreatorIdList(this.LJLIL.getTtsVoiceIDs());
        WaterMarkServiceImpl.LIZ().waterMark(waterMarkBuilder);
    }
}
