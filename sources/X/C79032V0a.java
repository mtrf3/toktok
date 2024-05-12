package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* renamed from: X.V0a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79032V0a implements C15X {
    public final /* synthetic */ C79033V0b LJLIL;

    public C79032V0a(C79033V0b c79033V0b) {
        this.LJLIL = c79033V0b;
    }

    @Override // X.C15X
    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        o.LJIIIZ(view, "view");
        C79033V0b c79033V0b = this.LJLIL;
        c79033V0b.LIZLLL = view;
        c79033V0b.LJFF = false;
        CountDownLatch countDownLatch = V0Z.LIZIZ.get(c79033V0b.LIZ);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
