package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.7wV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202117wV extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDiggAssem, C43I<? extends VideoItemParams>, C76800UCe> {
    public static final C202117wV LJLIL = new C202117wV();

    public C202117wV() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDiggAssem videoDiggAssem, C43I<? extends VideoItemParams> c43i) {
        VideoDiggAssem selectSubscribeOnAsync = videoDiggAssem;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        selectSubscribeOnAsync.A4(c43i);
        return C76800UCe.LIZ;
    }
}
