package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7yi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203487yi extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoFavoriteAssem, C193097hx, C76800UCe> {
    public static final C203487yi LJLIL = new C203487yi();

    public C203487yi() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoFavoriteAssem videoFavoriteAssem, C193097hx c193097hx) {
        VideoFavoriteAssem selectSubscribe = videoFavoriteAssem;
        C193097hx c193097hx2 = c193097hx;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c193097hx2 != null && !TextUtils.isEmpty(c193097hx2.LJLIL)) {
            if (c193097hx2.LJLJI) {
                selectSubscribe.q4().pv0(c193097hx2.LJLIL, true, true);
            } else {
                selectSubscribe.q4().pv0(c193097hx2.LJLIL, false, false);
            }
        }
        return C76800UCe.LIZ;
    }
}
