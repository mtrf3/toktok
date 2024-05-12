package X;

import com.ss.android.ugc.aweme.ui.feed.FeedPhotoSlideAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.80u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2044880u extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedPhotoSlideAssem, Integer, C76800UCe> {
    public static final C2044880u LJLIL = new C2044880u();

    public C2044880u() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedPhotoSlideAssem feedPhotoSlideAssem, Integer num) {
        FeedPhotoSlideAssem selectSubscribe = feedPhotoSlideAssem;
        num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C84K c84k = selectSubscribe.LLIIJLIL;
        if (c84k != null) {
            c84k.removeCallbacks(selectSubscribe.LLILLL);
            if (selectSubscribe.B4().LLF) {
                C84K c84k2 = selectSubscribe.LLIIJLIL;
                if (c84k2 != null) {
                    c84k2.postDelayed(selectSubscribe.LLILLL, 50L);
                } else {
                    o.LJIJI("viewPager");
                    throw null;
                }
            } else {
                selectSubscribe.LLILLL.run();
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("viewPager");
        throw null;
    }
}
