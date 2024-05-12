package X;

import androidx.lifecycle.Observer;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.L8z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53785L8z<T> implements Observer<List<? extends String>> {
    public static final C53785L8z LJLIL = new C53785L8z();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<? extends String> list) {
        List<? extends String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        o.LJIIIZ(list2, "<set-?>");
        C79260V8u.LIZ = list2;
    }
}
