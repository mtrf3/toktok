package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import kotlin.jvm.internal.o;

/* renamed from: X.H0o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43374H0o implements InterfaceC65753PrJ<VideoCreation> {
    public final /* synthetic */ InterfaceC73573Su9<UploadAuthKeyConfig> LIZ;

    public C43374H0o(C73433Srt c73433Srt) {
        this.LIZ = c73433Srt;
    }

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        this.LIZ.tryOnError(new C43377H0r("Request failed", t));
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(VideoCreation videoCreation) {
        if (videoCreation instanceof UploadAuthKeyConfig) {
            this.LIZ.onNext(videoCreation);
            this.LIZ.onComplete();
        } else {
            this.LIZ.tryOnError(new C43377H0r("Result is not UploadAuthKeyConfig"));
        }
    }
}
