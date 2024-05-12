package X;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OR2 extends OR5 {
    public boolean LIZIZ;
    public File[] LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public final /* synthetic */ OR0 LJFF;

    @Override // X.OR6
    public final File LIZ() {
        if (!this.LJ && this.LIZJ == null) {
            InterfaceC88472Yns<File, Boolean> interfaceC88472Yns = this.LJFF.LJLJJI.LIZJ;
            if (interfaceC88472Yns != null && !interfaceC88472Yns.invoke(this.LIZ).booleanValue()) {
                return null;
            }
            File[] listFiles = this.LIZ.listFiles();
            this.LIZJ = listFiles;
            if (listFiles == null) {
                InterfaceC88471Ynr<File, IOException, C76800UCe> interfaceC88471Ynr = this.LJFF.LJLJJI.LJ;
                if (interfaceC88471Ynr != null) {
                    interfaceC88471Ynr.invoke(this.LIZ, new C48174IvS(this.LIZ, null, "Cannot list files in a directory", 2, null));
                }
                this.LJ = true;
            }
        }
        File[] fileArr = this.LIZJ;
        if (fileArr != null) {
            int i = this.LIZLLL;
            o.LJI(fileArr);
            if (i < fileArr.length) {
                File[] fileArr2 = this.LIZJ;
                o.LJI(fileArr2);
                int i2 = this.LIZLLL;
                this.LIZLLL = i2 + 1;
                return fileArr2[i2];
            }
        }
        if (!this.LIZIZ) {
            this.LIZIZ = true;
            return this.LIZ;
        }
        InterfaceC88472Yns<File, C76800UCe> interfaceC88472Yns2 = this.LJFF.LJLJJI.LIZLLL;
        if (interfaceC88472Yns2 != null) {
            interfaceC88472Yns2.invoke(this.LIZ);
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OR2(OR0 or0, File rootDir) {
        super(rootDir);
        o.LJIIIZ(rootDir, "rootDir");
        this.LJFF = or0;
    }
}
