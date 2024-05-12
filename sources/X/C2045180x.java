package X;

import Y.ARunnableS22S0200000_3;
import com.ss.android.ugc.aweme.ui.feed.FeedPhotoSlideAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.80x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2045180x extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedPhotoSlideAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C2045180x LJLIL = new C2045180x();

    public C2045180x() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedPhotoSlideAssem feedPhotoSlideAssem, C43I<? extends Boolean> c43i) {
        FeedPhotoSlideAssem selectSubscribe = feedPhotoSlideAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            if (!((Boolean) c43i2.LIZ).booleanValue()) {
                C82N r4 = selectSubscribe.r4();
                AnonymousClass818 anonymousClass818 = selectSubscribe.LLIIZ;
                if (r4 != null && anonymousClass818 != null) {
                    r4.LIZ.postDelayed(new ARunnableS22S0200000_3(r4, anonymousClass818, 77), 100L);
                }
            } else {
                AnonymousClass818 anonymousClass8182 = selectSubscribe.LLIIZ;
                if (anonymousClass8182 != null) {
                    anonymousClass8182.QS(true);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
