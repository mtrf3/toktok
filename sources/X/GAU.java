package X;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GAU<T> implements InterfaceC64592gB {
    public static final GAU<T> LJLIL = new GAU<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Context it = (Context) obj;
        o.LJIIIIZZ(it, "it");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(it);
        if (LJJIFFI != null) {
            List<WeakReference<Activity>> list = C41620GVc.LJFF;
            if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    if (o.LJ(((Reference) it2.next()).get(), LJJIFFI)) {
                        return;
                    }
                }
            }
            if (C41620GVc.LJ.contains(LJJIFFI.getClass().getName()) || !GUH.LJIJI(null)) {
                return;
            }
            C41620GVc.LIZ(LJJIFFI, true, 124);
        }
    }
}
