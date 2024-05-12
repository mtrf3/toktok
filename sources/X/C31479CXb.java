package X;

import android.view.View;
import com.bytedance.android.livesdk.broadcast.feedback.FeedbackAnimWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.CXb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31479CXb extends AbstractC65781Prl implements InterfaceC88472Yns<int[], C76800UCe> {
    public final /* synthetic */ FeedbackAnimWidget LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31479CXb(FeedbackAnimWidget feedbackAnimWidget, int i) {
        super(1);
        this.LJLIL = feedbackAnimWidget;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(int[] iArr) {
        int[] it = iArr;
        o.LJIIIZ(it, "it");
        View view = this.LJLIL.getView();
        if (view != null) {
            ((C15540jG) this.LJLIL.LJLIL.getValue()).LIZ();
            this.LJLIL.show();
            view.getLocationInWindow(new int[2]);
            this.LJLIL.LJLZ().setTranslationY((it[1] - r4[1]) - (this.LJLILLLLZI / 2));
            if (C15380j0.LJIIZILJ()) {
                this.LJLIL.LJLZ().setTranslationX(it[0] - r4[0]);
            } else {
                this.LJLIL.LJLZ().setTranslationX((it[0] - r4[0]) - this.LJLILLLLZI);
            }
            ((C15540jG) this.LJLIL.LJLIL.getValue()).LJ();
        }
        return C76800UCe.LIZ;
    }
}
