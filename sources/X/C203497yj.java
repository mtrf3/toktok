package X;

import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7yj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203497yj extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoFavoriteAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C203497yj LJLIL = new C203497yj();

    public C203497yj() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoFavoriteAssem videoFavoriteAssem, C43I<? extends C195357lb> c43i) {
        VideoFavoriteAssem selectSubscribe = videoFavoriteAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLIIIL = false;
        }
        return C76800UCe.LIZ;
    }
}
