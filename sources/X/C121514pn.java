package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.4pn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121514pn extends C122024qc {
    public String LJIIJJI;
    public String[] LJIIL;
    public boolean LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public boolean LJIIZILJ;
    public String LJIJ;

    public C121514pn() {
        this(0);
    }

    @Override // X.C122024qc
    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InfoStickerParams(path=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", params=");
        String[] strArr = this.LJIIL;
        if (strArr != null) {
            str = Arrays.toString(strArr);
            o.LJIIIIZZ(str, "java.util.Arrays.toString(this)");
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", buffer=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(')');
        LIZ.append(super.toString());
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C121514pn(EnumC121564ps type) {
        super(type);
        o.LJIIIZ(type, "type");
    }

    public /* synthetic */ C121514pn(int i) {
        this(EnumC121564ps.INFO);
    }
}
