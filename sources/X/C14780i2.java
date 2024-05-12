package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.0i2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14780i2 {
    public C15010iP LIZ = new C15010iP(C08460Uw.LIZ, C08350Ul.LIZIZ, (C08350Ul) null);
    public C14820i6 LIZIZ;

    public C14780i2() {
        C15010iP c15010iP = this.LIZ;
        this.LIZIZ = new C14820i6(c15010iP.LIZ, c15010iP.LIZIZ);
    }

    public final C15010iP LIZ(List<? extends InterfaceC14750hz> editCommands) {
        InterfaceC14750hz interfaceC14750hz;
        InterfaceC14750hz interfaceC14750hz2;
        o.LJIIIZ(editCommands, "editCommands");
        try {
            int size = editCommands.size();
            int i = 0;
            interfaceC14750hz = null;
            while (i < size) {
                try {
                    interfaceC14750hz2 = (InterfaceC14750hz) ListProtector.get(editCommands, i);
                } catch (Exception e) {
                    e = e;
                    interfaceC14750hz2 = interfaceC14750hz;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Error while applying EditCommand batch to buffer (length=");
                    LIZ.append(this.LIZIZ.LIZLLL());
                    LIZ.append(", composition=");
                    LIZ.append(this.LIZIZ.LIZJ());
                    LIZ.append(", selection=");
                    C14820i6 c14820i6 = this.LIZIZ;
                    LIZ.append((Object) C08350Ul.LJI(C17N.LIZLLL(c14820i6.LIZIZ, c14820i6.LIZJ)));
                    LIZ.append("):");
                    sb.append(X1D.LIZIZ(LIZ));
                    sb.append('\n');
                    ORZ.LL(editCommands, sb, "\n", new IDqS172S0200000(interfaceC14750hz2, this, 58), 60);
                    String sb2 = sb.toString();
                    o.LJIIIIZZ(sb2, "StringBuilder().apply(builderAction).toString()");
                    throw new RuntimeException(sb2, e);
                }
                try {
                    interfaceC14750hz2.LIZ(this.LIZIZ);
                    i++;
                    interfaceC14750hz = interfaceC14750hz2;
                } catch (Exception e2) {
                    e = e2;
                    StringBuilder sb3 = new StringBuilder();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Error while applying EditCommand batch to buffer (length=");
                    LIZ2.append(this.LIZIZ.LIZLLL());
                    LIZ2.append(", composition=");
                    LIZ2.append(this.LIZIZ.LIZJ());
                    LIZ2.append(", selection=");
                    C14820i6 c14820i62 = this.LIZIZ;
                    LIZ2.append((Object) C08350Ul.LJI(C17N.LIZLLL(c14820i62.LIZIZ, c14820i62.LIZJ)));
                    LIZ2.append("):");
                    sb3.append(X1D.LIZIZ(LIZ2));
                    sb3.append('\n');
                    ORZ.LL(editCommands, sb3, "\n", new IDqS172S0200000(interfaceC14750hz2, this, 58), 60);
                    String sb22 = sb3.toString();
                    o.LJIIIIZZ(sb22, "StringBuilder().apply(builderAction).toString()");
                    throw new RuntimeException(sb22, e);
                }
            }
            C14820i6 c14820i63 = this.LIZIZ;
            c14820i63.getClass();
            C08440Uu c08440Uu = new C08440Uu(c14820i63.toString(), null, 6);
            C14820i6 c14820i64 = this.LIZIZ;
            C15010iP c15010iP = new C15010iP(c08440Uu, C17N.LIZLLL(c14820i64.LIZIZ, c14820i64.LIZJ), this.LIZIZ.LIZJ());
            this.LIZ = c15010iP;
            return c15010iP;
        } catch (Exception e3) {
            e = e3;
            interfaceC14750hz = null;
        }
    }
}
