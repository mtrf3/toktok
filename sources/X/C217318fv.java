package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeInteractEntrancesContainer;
import kotlin.jvm.internal.o;

/* renamed from: X.8fv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217318fv extends AbstractC65781Prl implements InterfaceC88471Ynr<LandscapeInteractEntrancesContainer, C43I<? extends Boolean>, C76800UCe> {
    public static final C217318fv LJLIL = new C217318fv();

    public C217318fv() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(LandscapeInteractEntrancesContainer landscapeInteractEntrancesContainer, C43I<? extends Boolean> c43i) {
        View view;
        int i;
        LandscapeInteractEntrancesContainer selectSubscribe = landscapeInteractEntrancesContainer;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && selectSubscribe.LLIIIL && (view = selectSubscribe.LLII) != null) {
            if (((Boolean) c43i2.LIZ).booleanValue()) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }
        return C76800UCe.LIZ;
    }
}
