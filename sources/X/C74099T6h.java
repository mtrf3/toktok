package X;

import com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel;
import java.util.Collection;

/* renamed from: X.T6h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74099T6h<I, O> implements C14Q {
    public final /* synthetic */ QnaSuggestedTabViewModel LJLIL;

    public C74099T6h(QnaSuggestedTabViewModel qnaSuggestedTabViewModel) {
        this.LJLIL = qnaSuggestedTabViewModel;
    }

    @Override // X.C14Q
    public final Object apply(Object obj) {
        if (!((Collection) ((C74100T6i) obj).LIZ).isEmpty()) {
            QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.LJLIL;
            if (qnaSuggestedTabViewModel.LJLJLLL) {
                qnaSuggestedTabViewModel.LJLJLLL = false;
                return new C74100T6i(Boolean.TRUE);
            }
        }
        return new C74100T6i(Boolean.FALSE);
    }
}
