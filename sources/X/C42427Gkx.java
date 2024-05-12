package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService;
import com.ss.android.ugc.aweme.shortvideo.video2sticker.ui.Video2StickerEditActivity;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gkx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42427Gkx implements InterfaceC42413Gkj {
    public final /* synthetic */ C42425Gkv LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ Aweme LIZJ;
    public final /* synthetic */ CreativeInfo LIZLLL;
    public final /* synthetic */ IVideo2StickerService.Callback LJ;

    @Override // X.InterfaceC42413Gkj
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC42413Gkj
    public final void onStart() {
    }

    @Override // X.InterfaceC42413Gkj
    public final void onSuccess(String fullFilePath) {
        o.LJIIIZ(fullFilePath, "fullFilePath");
        C42425Gkv c42425Gkv = this.LIZ;
        Activity activity = this.LIZIZ;
        Aweme aweme = this.LIZJ;
        CreativeInfo creativeInfo = this.LIZLLL;
        AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(this.LJ, 745);
        AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(this.LJ, 416);
        c42425Gkv.getClass();
        Intent intent = new Intent();
        intent.setClass(activity, Video2StickerEditActivity.class);
        intent.putExtra("aweme", aweme);
        intent.putExtra("video_file_path", fullFilePath);
        intent.putExtra("video2sticker_mode", true);
        C77412UZs.LJJIJIL(intent, creativeInfo);
        C43544H7c LIZIZ = C60903NvH.LJIIJJI().LJJIJIL().LIZIZ(activity, 100L, 3600000L);
        MediaModel LJII = C46104I7o.LJII(fullFilePath);
        if (LJII == null) {
            aqS173S0100000_7.invoke("Video2StickerServiceImpl convert media model failed");
        } else {
            LIZIZ.LJIL(LJII, intent, new AqS157S0100000_7(aqS157S0100000_7, 746));
        }
    }

    @Override // X.InterfaceC42413Gkj
    public final void LIZ(int i, String str, Exception exc) {
        C60903NvH.LJIIJJI().LJJIIJ();
        IVideo2StickerService.Callback callback = this.LJ;
        if (callback != null) {
            callback.onFailed(exc, str, i);
        }
    }

    public C42427Gkx(C42425Gkv c42425Gkv, Activity activity, Aweme aweme, CreativeInfo creativeInfo, IVideo2StickerService.Callback callback) {
        this.LIZ = c42425Gkv;
        this.LIZIZ = activity;
        this.LIZJ = aweme;
        this.LIZLLL = creativeInfo;
        this.LJ = callback;
    }
}
