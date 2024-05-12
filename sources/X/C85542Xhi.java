package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Xhi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C85542Xhi {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final EnumC85544Xhk LJFF;
    public boolean LJI;
    public final boolean LJII;
    public final View.OnClickListener LJIIIIZZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C85542Xhi() {
        /*
            r10 = this;
            r1 = 0
            r5 = 0
            r9 = 511(0x1ff, float:7.16E-43)
            r0 = r10
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r5
            r7 = r1
            r8 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85542Xhi.<init>():void");
    }

    public /* synthetic */ C85542Xhi(int i, int i2, int i3, boolean z, String str, EnumC85544Xhk enumC85544Xhk, boolean z2, View.OnClickListener onClickListener, int i4) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? "" : str, (i4 & 32) != 0 ? EnumC85544Xhk.RECTANGLE : enumC85544Xhk, false, (i4 & 128) != 0 ? false : z2, (i4 & 256) != 0 ? ViewOnClickListenerC85561Xi1.LJLIL : onClickListener);
    }

    public C85542Xhi(int i, int i2, int i3, boolean z, String mobTag, EnumC85544Xhk type, boolean z2, boolean z3, View.OnClickListener onClickListener) {
        o.LJIIIZ(mobTag, "mobTag");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(onClickListener, "onClickListener");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = z;
        this.LJ = mobTag;
        this.LJFF = type;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = onClickListener;
    }
}
