package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.83D, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C83D extends AbstractC65781Prl implements InterfaceC88471Ynr<BubbleListAssem, C43I<? extends View>, C76800UCe> {
    public static final C83D LJLIL = new C83D();

    public C83D() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(BubbleListAssem bubbleListAssem, C43I<? extends View> c43i) {
        View view;
        BubbleListAssem selectSubscribe = bubbleListAssem;
        C43I<? extends View> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (view = (View) c43i2.LIZ) != null && selectSubscribe.LLFF == null) {
            selectSubscribe.LLFF = view;
            selectSubscribe.e4();
        }
        return C76800UCe.LIZ;
    }
}
