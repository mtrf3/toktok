package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.4pm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121504pm extends C122024qc {
    public String LJIIJJI;
    public String LJIIL;
    public Integer LJIILIIL;
    public String LJIILJJIL;
    public boolean LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public String LJIJ;
    public final String[] LJIJI;

    public C121504pm() {
        this(null, 3);
    }

    @Override // X.C122024qc
    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LyricStickerParams(path=");
        LIZ.append(this.LJIJ);
        LIZ.append(", params=");
        String[] strArr = this.LJIJI;
        if (strArr != null) {
            str = Arrays.toString(strArr);
            o.LJIIIIZZ(str, "java.util.Arrays.toString(this)");
        } else {
            str = null;
        }
        C1DI.LIZIZ(LIZ, str, ", ", "srt=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", audioStartTime=");
        LIZ.append((Object) null);
        LIZ.append(", fontPath=");
        LIZ.append(this.LJIIL);
        LIZ.append(", color=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", ");
        LIZ.append("audioSlotId=");
        LIZ.append(this.LJIILJJIL);
        LIZ.append(", isCycle=");
        LIZ.append(this.LJIILL);
        LIZ.append(", trimIn=");
        LIZ.append(this.LJIILLIIL);
        LIZ.append(", trimOut=");
        LIZ.append(this.LJIIZILJ);
        LIZ.append(')');
        LIZ.append(super.toString());
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C121504pm(String[] strArr, int i) {
        super(EnumC121564ps.LYRIC);
        strArr = (i & 2) != 0 ? null : strArr;
        this.LJIJ = null;
        this.LJIJI = strArr;
        this.LJIILL = true;
        this.LJIIZILJ = -2L;
    }
}
