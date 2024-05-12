package X;

import android.util.SparseArray;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.JTw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49232JTw {
    public final String LIZ;
    public final LifecycleOwner LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;

    public final Taco LIZ() {
        Taco LIZJ = C49218JTi.LIZJ(this.LIZIZ, this.LIZ);
        SparseArray sparseArray = (SparseArray) this.LIZJ.getValue();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            LIZJ.LIZ((InterfaceC49224JTo) sparseArray.valueAt(i), sparseArray.keyAt(i));
        }
        Iterator it = ((ArrayList) this.LIZLLL.getValue()).iterator();
        while (it.hasNext()) {
            LIZJ.LIZJ((InterfaceC49220JTk) it.next());
        }
        return LIZJ;
    }

    public final void LIZJ(InterfaceC49220JTk interfaceC49220JTk) {
        if (interfaceC49220JTk == null) {
            return;
        }
        ((ArrayList) this.LIZLLL.getValue()).add(interfaceC49220JTk);
    }

    public C49232JTw(LifecycleOwner owner, String str) {
        o.LJIIIZ(owner, "owner");
        this.LIZ = str;
        this.LIZIZ = owner;
        this.LIZJ = C221108m2.LIZIZ(C49228JTs.LJLIL);
        this.LIZLLL = C221108m2.LIZIZ(C49233JTx.LJLIL);
    }

    public static void LIZIZ(C49232JTw c49232JTw, InterfaceC49224JTo interfaceC49224JTo) {
        if (interfaceC49224JTo != null) {
            ((SparseArray) c49232JTw.LIZJ.getValue()).put(interfaceC49224JTo.hashCode(), interfaceC49224JTo);
        }
    }
}
