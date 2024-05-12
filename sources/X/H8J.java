package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8J {
    public static final String LIZ;

    public static final File LIZ() {
        File filesDir = C60903NvH.LJ.getFilesDir();
        o.LJIIIIZZ(filesDir, "{\n        CameraClient.g…lication().filesDir\n    }");
        return filesDir;
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("([0-9a-zA-Z-]+(_[0-9]+)?)");
        String str = File.separator;
        YE1.LIZLLL(LIZ2, str, "(([0-9a-zA-Z-]+)", str, ")?");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        LIZ = LIZIZ;
        StringBuilder LIZ3 = X1D.LIZ();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(C60903NvH.LJIIJJI().LJJIJL().getPathService().getCreativeRoot());
        LIZ4.append(LIZIZ);
        LIZ4.append("([0-9]+)");
        LIZ4.append(str);
        StringBuilder LIZIZ2 = C07780Sg.LIZIZ("(", X1D.LIZIZ(LIZ4), "(");
        EnumC43649HBd[] values = EnumC43649HBd.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            if (i != values.length - 1) {
                LIZIZ2.append(values[i].getNameSpace());
                LIZIZ2.append("|");
            } else {
                LIZIZ2.append(values[i].getNameSpace());
            }
        }
        LIZIZ2.append(")");
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(File.separator);
        LIZ5.append("(.*)");
        LIZIZ2.append(X1D.LIZIZ(LIZ5));
        LIZIZ2.append(")");
        String sb = LIZIZ2.toString();
        o.LJIIIIZZ(sb, "regex.toString()");
        LIZ3.append(sb);
        LIZ3.append('|');
        StringBuilder LIZIZ3 = C07780Sg.LIZIZ("(", C60903NvH.LJIIJJI().LJJIJL().getPathService().LJIILIIL(), "(");
        EnumC43651HBf[] values2 = EnumC43651HBf.values();
        int length2 = values2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            if (i2 != values2.length - 1) {
                LIZIZ3.append(values2[i2].getNameSpace());
                LIZIZ3.append("|");
            } else {
                LIZIZ3.append(values2[i2].getNameSpace());
            }
        }
        LIZIZ3.append(")");
        StringBuilder LIZ6 = X1D.LIZ();
        String str2 = File.separator;
        LIZ6.append(str2);
        LIZ6.append("(.*)");
        LIZIZ3.append(X1D.LIZIZ(LIZ6));
        LIZIZ3.append(")");
        String sb2 = LIZIZ3.toString();
        o.LJIIIIZZ(sb2, "regex.toString()");
        LIZ3.append(sb2);
        LIZ3.append('|');
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append(C60903NvH.LJIIJJI().LJJIJL().getPathService().getPersistentRoot());
        LIZ7.append("((");
        LIZ7.append(LIZ);
        LIZ7.append(")|(");
        LIZ7.append(HB7.LIZ.getCreationId());
        LIZ7.append(str2);
        LIZ7.append("))");
        StringBuilder LIZIZ4 = C07780Sg.LIZIZ("(", X1D.LIZIZ(LIZ7), "(");
        EnumC43652HBg[] values3 = EnumC43652HBg.values();
        int length3 = values3.length;
        for (int i3 = 0; i3 < length3; i3++) {
            if (i3 != values3.length - 1) {
                LIZIZ4.append(values3[i3].getNameSpace());
                LIZIZ4.append("|");
            } else {
                LIZIZ4.append(values3[i3].getNameSpace());
            }
        }
        LIZIZ4.append(")");
        StringBuilder LIZ8 = X1D.LIZ();
        LIZ8.append(File.separator);
        LIZ8.append("(.*)");
        LIZIZ4.append(X1D.LIZIZ(LIZ8));
        LIZIZ4.append(")");
        String sb3 = LIZIZ4.toString();
        o.LJIIIIZZ(sb3, "regex.toString()");
        LIZ3.append(sb3);
        LIZ3.append('|');
        StringBuilder LIZ9 = X1D.LIZ();
        LIZ9.append(C60903NvH.LJIIJJI().LJJIJL().getPathService().getCacheRoot());
        LIZ9.append(LIZ);
        StringBuilder LIZIZ5 = C07780Sg.LIZIZ("(", X1D.LIZIZ(LIZ9), "(");
        EnumC43650HBe[] values4 = EnumC43650HBe.values();
        int length4 = values4.length;
        for (int i4 = 0; i4 < length4; i4++) {
            if (i4 != values4.length - 1) {
                LIZIZ5.append(values4[i4].getNameSpace());
                LIZIZ5.append("|");
            } else {
                LIZIZ5.append(values4[i4].getNameSpace());
            }
        }
        LIZIZ5.append(")");
        StringBuilder LIZ10 = X1D.LIZ();
        LIZ10.append(File.separator);
        LIZ10.append("(.*)");
        LIZIZ5.append(X1D.LIZIZ(LIZ10));
        LIZIZ5.append(")");
        String sb4 = LIZIZ5.toString();
        o.LJIIIIZZ(sb4, "regex.toString()");
        LIZ3.append(sb4);
        new OJD(X1D.LIZIZ(LIZ3));
    }
}
