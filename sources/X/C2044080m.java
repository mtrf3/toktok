package X;

import com.ss.android.ugc.aweme.ui.feed.FeedPhotoSlideAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.80m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2044080m extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedPhotoSlideAssem, Boolean, C76800UCe> {
    public static final C2044080m LJLIL = new C2044080m();

    public C2044080m() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedPhotoSlideAssem feedPhotoSlideAssem, Boolean bool) {
        FeedPhotoSlideAssem selectSubscribe = feedPhotoSlideAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            C203027xy c203027xy = selectSubscribe.LLILLJJLI;
            if (c203027xy != null && !c203027xy.LIZIZ.isActive()) {
                c203027xy.LIZIZ = c203027xy.LIZ();
            }
        } else {
            C203027xy c203027xy2 = selectSubscribe.LLILLJJLI;
            if (c203027xy2 != null) {
                c203027xy2.LIZIZ.LIZIZ(null);
            }
            C84K c84k = selectSubscribe.LLIIJLIL;
            if (c84k != null) {
                c84k.removeCallbacks(selectSubscribe.LLILLL);
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        }
        C81C c81c = selectSubscribe.LLIIL;
        if (c81c != null) {
            c81c.LIZIZ = booleanValue;
            C216848fA c216848fA = c81c.LIZ;
            c216848fA.LIZLLL = booleanValue;
            c216848fA.LIZ = 0;
            return C76800UCe.LIZ;
        }
        o.LJIJI("scroller");
        throw null;
    }
}
