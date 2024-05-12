package X;

import com.ss.android.ugc.aweme.feed.landscape.LandscapeEntranceAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8g8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217448g8 extends AbstractC65781Prl implements InterfaceC88471Ynr<LandscapeEntranceAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C217448g8 LJLIL = new C217448g8();

    public C217448g8() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(LandscapeEntranceAssem landscapeEntranceAssem, C43I<? extends C76800UCe> c43i) {
        LandscapeEntranceAssem selectSubscribe = landscapeEntranceAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && selectSubscribe.getContainerView().getVisibility() == 0) {
            C218678i7.LIZ();
        }
        return C76800UCe.LIZ;
    }
}
