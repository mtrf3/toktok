package X;

import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7yk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203507yk extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoFavoriteAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C203507yk LJLIL = new C203507yk();

    public C203507yk() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoFavoriteAssem videoFavoriteAssem, C43I<? extends Integer> c43i) {
        VideoFavoriteAssem selectSubscribe = videoFavoriteAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLIIIL = true;
        }
        return C76800UCe.LIZ;
    }
}
