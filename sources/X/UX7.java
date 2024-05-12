package X;

import androidx.lifecycle.Observer;

/* loaded from: classes14.dex */
public final class UX7<T> implements Observer {
    public static final UX7<T> LJLIL = new UX7<>();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String str = ((C61172af) obj).LIZ;
        if (str == null || str.length() <= 0) {
            return;
        }
        C30868C9o.LJI(str);
    }
}
