package X;

import X.InterfaceC99233ux;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ol1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62815Ol1<T extends InterfaceC99233ux> implements InterfaceC80653En {
    public final List<T> LJLIL = new ArrayList();
    public final List<T> LJLILLLLZI = new ArrayList();
    public boolean LJLJI;

    public final void LIZ(List<? extends T> list, boolean z) {
        List<T> list2;
        synchronized (this) {
            if (!z) {
                list2 = this.LJLILLLLZI;
            } else {
                list2 = this.LJLIL;
            }
            list2.addAll(list);
        }
    }
}
