package X;

import java.util.List;

/* renamed from: X.VrU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81052VrU {
    public java.util.Set<EnumC81057VrZ> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;
    public int LJI;
    public List<AbstractC81054VrW> LJII;
    public int LJIIIIZZ;
    public float LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;

    public final boolean LIZ() {
        if (this.LIZJ && EnumC81057VrZ.ofImage().containsAll(this.LIZ)) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        if (this.LIZJ && EnumC81057VrZ.ofVideo().containsAll(this.LIZ)) {
            return true;
        }
        return false;
    }
}
