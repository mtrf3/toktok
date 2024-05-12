package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import kotlin.jvm.internal.o;

/* renamed from: X.HjW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44886HjW implements WaterMarkListener {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ InterfaceC65052gv<String> LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
    public final /* synthetic */ void onCancel() {
        C44887HjX.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
    public final void onStart() {
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
    public final void onError(int i) {
        C39579Fg7.LJIL(C44890Hja.LJI);
        C39579Fg7.LJIL(C44890Hja.LJIIIIZZ);
        C39579Fg7.LJIL(C44890Hja.LJII);
        C39579Fg7.LJIL(C44890Hja.LJFF);
        ((C73578SuE) this.LIZIZ).onSuccess("");
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
    public final void onProgress(int i) {
        if (C44890Hja.LIZ) {
            return;
        }
        C57082Lw.LIZ.LIZJ("video_download_status").postValue(C45382HrW.LIZJ(2, this.LIZ, (i / 2) + 50, null, null, 24));
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
    public final void onSuccess(String path) {
        o.LJIIIZ(path, "path");
        C39579Fg7.LJIL(C44890Hja.LJI);
        C39579Fg7.LJIL(C44890Hja.LJIIIIZZ);
        C39579Fg7.LJIL(C44890Hja.LJII);
        if (C44890Hja.LIZ) {
            C39579Fg7.LJIL(C44890Hja.LJFF);
            ((C73578SuE) this.LIZIZ).onSuccess("");
        } else {
            ((C73578SuE) this.LIZIZ).onSuccess(path);
        }
    }

    public C44886HjW(Aweme aweme, C73578SuE c73578SuE) {
        this.LIZ = aweme;
        this.LIZIZ = c73578SuE;
    }
}
