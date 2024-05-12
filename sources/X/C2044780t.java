package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IPanelUIAbility;
import com.ss.android.ugc.aweme.ui.feed.FeedPhotoSlideAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.80t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2044780t extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedPhotoSlideAssem, Boolean, C76800UCe> {
    public static final C2044780t LJLIL = new C2044780t();

    public C2044780t() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedPhotoSlideAssem feedPhotoSlideAssem, Boolean bool) {
        FeedPhotoSlideAssem selectSubscribe = feedPhotoSlideAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        IPanelUIAbility iPanelUIAbility = (IPanelUIAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(selectSubscribe), IPanelUIAbility.class, null);
        if (iPanelUIAbility != null) {
            iPanelUIAbility.enableSwipeToRefresh(!booleanValue);
        }
        return C76800UCe.LIZ;
    }
}
