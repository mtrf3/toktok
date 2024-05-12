package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.ui.feed.FeedPhotoSlideAssem;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.81A, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C81A extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedPhotoSlideAssem, Boolean, C76800UCe> {
    public static final C81A LJLIL = new C81A();

    public C81A() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedPhotoSlideAssem feedPhotoSlideAssem, Boolean bool) {
        FeedPhotoSlideAssem selectSubscribe = feedPhotoSlideAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            XKQ xkq = selectSubscribe.LLILZIL;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            XKQ LIZLLL = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(selectSubscribe), null, null, new C81B(selectSubscribe, null), 3);
            LIZLLL.LJJIII(new AqS169S0100000_3(selectSubscribe, 989));
            selectSubscribe.LLILZIL = LIZLLL;
        }
        return C76800UCe.LIZ;
    }
}
