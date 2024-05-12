package X;

import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7ze, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C204067ze extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoShareAssem, C43I<? extends VideoItemParams>, C76800UCe> {
    public static final C204067ze LJLIL = new C204067ze();

    public C204067ze() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoShareAssem videoShareAssem, C43I<? extends VideoItemParams> c43i) {
        VideoShareAssem selectSubscribeOnAsync = videoShareAssem;
        C43I<? extends VideoItemParams> c43i2 = c43i;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (c43i2 != null) {
            VideoShareViewModel z4 = selectSubscribeOnAsync.z4();
            VideoItemParams videoItemParams = (VideoItemParams) c43i2.LIZ;
            z4.getClass();
            if (videoItemParams != null) {
                z4.setState(new AqS134S0200000_3(z4, videoItemParams, 195));
            }
        }
        return C76800UCe.LIZ;
    }
}
