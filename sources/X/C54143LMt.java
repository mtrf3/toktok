package X;

import androidx.lifecycle.Observer;

/* renamed from: X.LMt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54143LMt<T> implements Observer {
    public static final C54143LMt<T> LJLIL = new C54143LMt<>();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() != 1) {
            return;
        }
        LRP lrp = LRP.LIZIZ;
        if (!lrp.isShowing()) {
            return;
        }
        lrp.LIZLLL();
    }
}
