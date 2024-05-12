package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.play.core.appupdate.i;
import com.google.android.play.core.appupdate.p;
import com.google.android.play.core.appupdate.q;
import kotlin.jvm.internal.o;

/* renamed from: X.1dY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37481dY implements InterfaceC153055zZ {
    public Object LJLIL;
    public Object LJLILLLLZI;

    public /* synthetic */ C37481dY(i iVar, InterfaceC153055zZ interfaceC153055zZ) {
        this.LJLIL = iVar;
        this.LJLILLLLZI = interfaceC153055zZ;
    }

    @Override // X.InterfaceC153055zZ
    public final Object a() {
        Context context = (Context) ((i) ((InterfaceC153055zZ) this.LJLIL)).LJLIL.LIZ;
        C40654FxS.LJI(context);
        return new p(context, (q) ((InterfaceC153055zZ) this.LJLILLLLZI).a());
    }

    public /* synthetic */ C37481dY() {
    }

    public /* synthetic */ C37481dY(C55952Hn rootCoordinates) {
        o.LJIIIZ(rootCoordinates, "rootCoordinates");
        this.LJLIL = rootCoordinates;
        this.LJLILLLLZI = new C11G();
    }

    public /* synthetic */ C37481dY(int i) {
        this.LJLIL = "PlayerSettingDebugCache-1";
    }

    public final void LIZ(long j, C1DU pointerInputNodes) {
        C37491dZ c37491dZ;
        C37491dZ c37491dZ2;
        o.LJIIIZ(pointerInputNodes, "pointerInputNodes");
        C11G c11g = (C11G) this.LJLILLLLZI;
        int i = pointerInputNodes.LJLJJI;
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            C1DO c1do = (C1DO) ListProtector.get(pointerInputNodes, i2);
            if (z) {
                C25710zf<C37491dZ> c25710zf = c11g.LIZ;
                int i3 = c25710zf.LJLJI;
                if (i3 > 0) {
                    C37491dZ[] c37491dZArr = c25710zf.LJLIL;
                    o.LJII(c37491dZArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int i4 = 0;
                    do {
                        c37491dZ2 = c37491dZArr[i4];
                        if (o.LJ(c37491dZ2.LIZIZ, c1do)) {
                            break;
                        } else {
                            i4++;
                        }
                    } while (i4 < i3);
                }
                c37491dZ2 = null;
                c37491dZ = c37491dZ2;
                if (c37491dZ != null) {
                    c37491dZ.LJII = true;
                    if (!c37491dZ.LIZJ.LJIIIIZZ(new C11O(j))) {
                        c37491dZ.LIZJ.LIZLLL(new C11O(j));
                    }
                    c11g = c37491dZ;
                } else {
                    z = false;
                }
            }
            c37491dZ = new C37491dZ(c1do);
            c37491dZ.LIZJ.LIZLLL(new C11O(j));
            c11g.LIZ.LIZLLL(c37491dZ);
            c11g = c37491dZ;
        }
    }

    public final boolean LIZIZ(C11B c11b, boolean z) {
        if (!((C11G) this.LJLILLLLZI).LIZ(c11b.LIZ, (InterfaceC274415w) this.LJLIL, c11b, z)) {
            return false;
        }
        boolean LJ = ((C11G) this.LJLILLLLZI).LJ(c11b.LIZ, (InterfaceC274415w) this.LJLIL, c11b, z);
        if (!((C11G) this.LJLILLLLZI).LIZLLL(c11b) && !LJ) {
            return false;
        }
        return true;
    }
}
