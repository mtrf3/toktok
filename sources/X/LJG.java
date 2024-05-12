package X;

import androidx.lifecycle.Observer;

/* loaded from: classes10.dex */
public final class LJG<T> implements Observer {
    public static final LJG<T> LJLIL = new LJG<>();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() != 1) {
            return;
        }
        C54030LIk.LIZIZ = LJF.SLIDE.getValue();
    }
}
