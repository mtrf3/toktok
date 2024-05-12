package X;

import com.bytedance.android.live.liveinteract.linkroom.InteractService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Tk5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75497Tk5<T> implements InterfaceC28471BFj {
    public final /* synthetic */ InteractService LJLIL;

    public C75497Tk5(InteractService interactService) {
        this.LJLIL = interactService;
    }

    @Override // X.InterfaceC28471BFj
    public final void onChanged(Object obj) {
        this.LJLIL.getClass();
        T t = C74740TUy.LIZLLL().LIZIZ;
        o.LJIIIIZZ(t, "inst().data");
        int intValue = ((Number) t).intValue();
        boolean z = true;
        if (intValue != 2 && intValue != 1) {
            z = false;
        }
        Iterator it = ((ArrayList) this.LJLIL.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC75512TkK) it.next()).LIZ(z);
        }
    }
}
