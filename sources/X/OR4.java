package X;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.AqS192S0100000_10;

/* loaded from: classes11.dex */
public final class OR4 implements InterfaceC1039145z<File> {
    public final File LIZ;
    public final EnumC67182kM LIZIZ;
    public final InterfaceC88472Yns<File, Boolean> LIZJ;
    public final InterfaceC88472Yns<File, C76800UCe> LIZLLL;
    public final InterfaceC88471Ynr<File, IOException, C76800UCe> LJ;
    public final int LJFF;

    @Override // X.InterfaceC1039145z
    public final Iterator<File> iterator() {
        return new OR0(this);
    }

    public OR4(File file, EnumC67182kM enumC67182kM, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, AqS192S0100000_10 aqS192S0100000_10, int i) {
        this.LIZ = file;
        this.LIZIZ = enumC67182kM;
        this.LIZJ = interfaceC88472Yns;
        this.LIZLLL = interfaceC88472Yns2;
        this.LJ = aqS192S0100000_10;
        this.LJFF = i;
    }
}
