package X;

/* renamed from: X.WEj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81953WEj implements InterfaceC81962WEs {
    public final /* synthetic */ C81947WEd LIZ;

    public C81953WEj(C81947WEd c81947WEd) {
        this.LIZ = c81947WEd;
    }

    public final void LIZ(float f) {
        if (f > 1.0f) {
            this.LIZ.LIZLLL();
            return;
        }
        C81947WEd c81947WEd = this.LIZ;
        C81949WEf c81949WEf = c81947WEd.LJLJJI;
        if (c81949WEf == null) {
            return;
        }
        C81951WEh c81951WEh = c81949WEf.LJIILIIL;
        if (c81951WEh != null && (c81949WEf.LJIJJ >= 2 || c81949WEf.LJIIZILJ)) {
            c81951WEh.LIZ(c81947WEd.LJLILLLLZI);
        }
        C81949WEf c81949WEf2 = c81947WEd.LJLJJI;
        C81954WEk c81954WEk = c81949WEf2.LJIIL;
        if (c81954WEk == null) {
            return;
        }
        if (c81949WEf2.LJIJJ < 2 && !c81949WEf2.LJIIZILJ) {
            return;
        }
        c81954WEk.LIZ(c81947WEd.LJLILLLLZI);
    }
}
