package X;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PQn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64433PQn {
    public static volatile C64433PQn LJFF;
    public final Context LIZ;
    public C64430PQk LIZIZ;
    public float LIZJ;
    public boolean LIZLLL;
    public final List<InterfaceC64434PQo> LJ = new ArrayList();

    public static C64433PQn LIZ() {
        if (LJFF == null) {
            synchronized (C64433PQn.class) {
                if (LJFF == null) {
                    LJFF = new C64433PQn(EF7.LIZIZ());
                }
            }
        }
        return LJFF;
    }

    public C64433PQn(Context context) {
        this.LIZ = context;
    }

    public final synchronized void LIZIZ(InterfaceC64434PQo interfaceC64434PQo) {
        if (((ArrayList) this.LJ).contains(interfaceC64434PQo)) {
            return;
        }
        interfaceC64434PQo.LIZ(this.LIZLLL);
        ((ArrayList) this.LJ).add(interfaceC64434PQo);
    }

    public final void LIZJ(Intent intent) {
        boolean z;
        this.LIZJ = (intent.getIntExtra("level", -1) / intent.getIntExtra("scale", -1)) * 100.0f;
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            z = true;
        } else {
            z = false;
        }
        if (this.LIZLLL != z) {
            Iterator it = ((ArrayList) this.LJ).iterator();
            while (it.hasNext()) {
                ((InterfaceC64434PQo) it.next()).LIZ(z);
            }
        }
        this.LIZLLL = z;
    }
}
