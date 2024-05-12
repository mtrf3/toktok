package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import kotlin.jvm.internal.o;

/* renamed from: X.HjZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44889HjZ implements IAVProcessService.IConvertImageToVideoCallback {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ InterfaceC65052gv<String> LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IConvertImageToVideoCallback
    public final void onFailure() {
        ((C73578SuE) this.LIZIZ).onSuccess("");
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IConvertImageToVideoCallback
    public final void onProgress(float f) {
        if (C44890Hja.LIZ) {
            return;
        }
        C57082Lw.LIZ.LIZJ("video_download_status").postValue(C45382HrW.LIZJ(2, this.LIZ, (int) ((f * 100.0f) / 2), null, null, 24));
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IConvertImageToVideoCallback
    public final void onSuccess(String path) {
        o.LJIIIZ(path, "path");
        if (C44890Hja.LIZ) {
            ((C73578SuE) this.LIZIZ).onSuccess("");
        } else {
            ((C73578SuE) this.LIZIZ).onSuccess(path);
        }
    }

    public C44889HjZ(Aweme aweme, C73578SuE c73578SuE) {
        this.LIZ = aweme;
        this.LIZIZ = c73578SuE;
    }
}
