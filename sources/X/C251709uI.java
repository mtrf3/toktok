package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.9uI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251709uI extends C0A6 {
    public C73411SrX LJLIL;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        C73411SrX c73411SrX;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            if (i != 1) {
                return;
            }
            C73411SrX c73411SrX2 = this.LJLIL;
            if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = this.LJLIL) != null) {
                c73411SrX.dispose();
            }
            this.LJLIL = (C73411SrX) AbstractC73672Svk.LJJIIZI(0L, 500L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new InterfaceC64592gB() { // from class: X.9uK
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    Thread.sleep(((Number) C34261DcX.LIZ.getValue()).intValue() * 16);
                }
            });
            return;
        }
        C73411SrX c73411SrX3 = this.LJLIL;
        if (c73411SrX3 == null || c73411SrX3.isDisposed()) {
            return;
        }
        C73411SrX c73411SrX4 = this.LJLIL;
        if (c73411SrX4 != null) {
            c73411SrX4.dispose();
        }
        this.LJLIL = null;
    }
}
