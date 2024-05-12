package X;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.FxI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40644FxI implements InterfaceC73592SuS, InterfaceC153055zZ {
    public Object LJLIL;

    public synchronized Bundle LIZ() {
        if (((Bundle) this.LJLIL) == null) {
            this.LJLIL = new Bundle();
        }
        return (Bundle) this.LJLIL;
    }

    @Override // X.InterfaceC153055zZ
    public Object a() {
        C40551Fvn c40551Fvn;
        Context context = ((C40647FxL) this.LJLIL).LIZ;
        synchronized (C40551Fvn.class) {
            if (C40551Fvn.LJIIIZ == null) {
                C40551Fvn.LJIIIZ = new C40551Fvn(context, EnumC39661FhR.a);
            }
            c40551Fvn = C40551Fvn.LJIIIZ;
        }
        C40654FxS.LJI(c40551Fvn);
        return c40551Fvn;
    }

    public /* synthetic */ C40644FxI() {
    }

    public /* synthetic */ C40644FxI(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        OSZ it = (OSZ) obj;
        o.LJIIJ(it, "it");
        return o.LJ(this.LJLIL, it.getFirst());
    }
}
