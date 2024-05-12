package X;

import Y.ARunnableS39S0100000_3;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialPrivacyTagAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8QR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8QR extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedSocialPrivacyTagAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C8QR LJLIL = new C8QR();

    public C8QR() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedSocialPrivacyTagAssem feedSocialPrivacyTagAssem, C43I<? extends Boolean> c43i) {
        TuxTag tuxTag;
        FeedSocialPrivacyTagAssem selectSubscribe = feedSocialPrivacyTagAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && o.LJ(c43i2.LIZ(), Boolean.TRUE) && (tuxTag = selectSubscribe.LLFZ) != null && tuxTag.getVisibility() == 0) {
            TuxTag tuxTag2 = selectSubscribe.LLFZ;
            if (tuxTag2 != null) {
                tuxTag2.animate().alpha(0.0f).setDuration(150L).withEndAction(new ARunnableS39S0100000_3(selectSubscribe, 3)).start();
            } else {
                o.LJIJI("privacyTag");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
