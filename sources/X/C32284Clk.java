package X;

import android.content.Context;

/* renamed from: X.Clk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32284Clk {
    public InterfaceC32418Cnu LIZ;
    public InterfaceC64517PTt LIZIZ;
    public int LJ;
    public final Context LJI;
    public int LIZJ = 2;
    public int LIZLLL = 3;
    public long LJFF = 600000;

    public final C32287Cln LIZ() {
        if (this.LIZ == null) {
            this.LIZ = new C32285Cll(this.LJI);
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new C64513PTp();
        }
        return new C32287Cln(this);
    }

    public C32284Clk(Context context) {
        this.LJI = context;
    }
}
