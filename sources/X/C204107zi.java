package X;

import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7zi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C204107zi extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoShareAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C204107zi LJLIL = new C204107zi();

    public C204107zi() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoShareAssem videoShareAssem, C43I<? extends C195357lb> c43i) {
        VideoShareAssem selectSubscribe = videoShareAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.r4();
            selectSubscribe.LLIIIL = false;
        }
        return C76800UCe.LIZ;
    }
}
