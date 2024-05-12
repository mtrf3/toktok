package X;

import com.ss.android.ugc.aweme.ui.feed.FeedPhotoSlideAssem;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import kotlin.jvm.internal.AqS93S0101000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.80w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2045080w extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedPhotoSlideAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C2045080w LJLIL = new C2045080w();

    public C2045080w() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedPhotoSlideAssem feedPhotoSlideAssem, C43I<? extends C76800UCe> c43i) {
        FeedPhotoSlideAssem selectSubscribe = feedPhotoSlideAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        AnonymousClass818 anonymousClass818 = selectSubscribe.LLIIZ;
        if (anonymousClass818 != null) {
            anonymousClass818.LW(selectSubscribe.u4());
        }
        PhotoViewModelV2 B4 = selectSubscribe.B4();
        int u4 = selectSubscribe.u4();
        B4.getClass();
        B4.setState(new AqS93S0101000_3(u4, B4, 19));
        C82L c82l = selectSubscribe.LLIILZL;
        if (c82l != null) {
            c82l.LJJIIJZLJL(selectSubscribe.u4());
        }
        selectSubscribe.B4().tv0();
        return C76800UCe.LIZ;
    }
}
