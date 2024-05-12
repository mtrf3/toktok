package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import kotlin.jvm.internal.o;

/* renamed from: X.H0m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43372H0m implements InterfaceC65753PrJ<VideoCreation> {
    public final /* synthetic */ InterfaceC73573Su9<String> LIZ;

    public C43372H0m(C73433Srt c73433Srt) {
        this.LIZ = c73433Srt;
    }

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        this.LIZ.tryOnError(t);
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(VideoCreation videoCreation) {
        if (videoCreation instanceof UploadAuthKeyConfig) {
            this.LIZ.onNext(C78880UxY.LJLILLLLZI(videoCreation));
        } else {
            this.LIZ.tryOnError(new IllegalArgumentException("upload tos key result is not UploadAuthKeyConfig"));
        }
    }
}
