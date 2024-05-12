package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.1ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35871ax implements Iterable<Object>, InterfaceC90533gv {
    public int LJLILLLLZI;
    public int LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public int[] LJLIL = new int[0];
    public Object[] LJLJI = new Object[0];
    public ArrayList<C24400xY> LJLJLJ = new ArrayList<>();

    public final C24400xY LIZJ() {
        if (!this.LJLJJLL) {
            int i = this.LJLILLLLZI;
            if (i > 0) {
                ArrayList<C24400xY> arrayList = this.LJLJLJ;
                int LJJLI = C78847Ux1.LJJLI(arrayList, 0, i);
                if (LJJLI < 0) {
                    C24400xY c24400xY = new C24400xY(0);
                    ListProtector.add(arrayList, -(LJJLI + 1), c24400xY);
                    return c24400xY;
                }
                Object obj = ListProtector.get(arrayList, LJJLI);
                o.LJIIIIZZ(obj, "get(location)");
                return (C24400xY) obj;
            }
            "Parameter index is out of range".toString();
            throw new IllegalArgumentException("Parameter index is out of range");
        }
        "use active SlotWriter to create an anchor location instead ".toString();
        C24780yA.LIZJ("use active SlotWriter to create an anchor location instead ");
        throw null;
    }

    public final C24450xd LJIIIZ() {
        if (!this.LJLJJLL) {
            this.LJLJJL++;
            return new C24450xd(this);
        }
        "Cannot read while a writer is pending".toString();
        throw new IllegalStateException("Cannot read while a writer is pending");
    }

    public final C24570xp LJIILJJIL() {
        if (!this.LJLJJLL) {
            if (this.LJLJJL <= 0) {
                this.LJLJJLL = true;
                this.LJLJL++;
                return new C24570xp(this);
            }
            "Cannot start a writer when a reader is pending".toString();
            C24780yA.LIZJ("Cannot start a writer when a reader is pending");
            throw null;
        }
        "Cannot start a writer when another writer is pending".toString();
        C24780yA.LIZJ("Cannot start a writer when another writer is pending");
        throw null;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new C35981b8(0, this.LJLILLLLZI, this);
    }

    public final int LJII(C24400xY anchor) {
        o.LJIIIZ(anchor, "anchor");
        if (!this.LJLJJLL) {
            if (anchor.LIZ()) {
                return anchor.LIZ;
            }
            "Anchor refers to a group that was removed".toString();
            throw new IllegalArgumentException("Anchor refers to a group that was removed");
        }
        "Use active SlotWriter to determine anchor location instead".toString();
        C24780yA.LIZJ("Use active SlotWriter to determine anchor location instead");
        throw null;
    }

    public final boolean LJIILLIIL(C24400xY c24400xY) {
        int LJJLI;
        if (!c24400xY.LIZ() || (LJJLI = C78847Ux1.LJJLI(this.LJLJLJ, c24400xY.LIZ, this.LJLILLLLZI)) < 0 || !o.LJ(ListProtector.get(this.LJLJLJ, LJJLI), c24400xY)) {
            return false;
        }
        return true;
    }

    public final boolean LJIIIIZZ(int i, C24400xY c24400xY) {
        if (!this.LJLJJLL) {
            if (i >= 0 && i < this.LJLILLLLZI) {
                if (LJIILLIIL(c24400xY)) {
                    int LIZLLL = C78847Ux1.LIZLLL(i, this.LJLIL) + i;
                    int i2 = c24400xY.LIZ;
                    if (i <= i2 && i2 < LIZLLL) {
                        return true;
                    }
                }
                return false;
            }
            "Invalid group index".toString();
            C24780yA.LIZJ("Invalid group index");
            throw null;
        }
        "Writer is active".toString();
        C24780yA.LIZJ("Writer is active");
        throw null;
    }
}
