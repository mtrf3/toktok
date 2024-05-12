package X;

import java.io.File;

/* loaded from: classes12.dex */
public final class PU6 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(File file) {
        StringBuilder sb = new StringBuilder();
        byte[] bArr = new byte[524288];
        C64532PUi LIZ2 = PU7.LIZ(PU7.LJI(file));
        try {
            LIZ2.read(bArr);
            AnonymousClass636.LJFF(LIZ2, null);
            sb.append(C09100Xi.LIZ(C78847Ux1.LJJJJJL(bArr)));
            sb.append(file.getTotalSpace());
            sb.append(file.getName());
            return sb.toString();
        } finally {
        }
    }

    public static String LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        FZC fzc = FZC.LIZ;
        if (fzc.LIZLLL(str)) {
            return LIZ(new File(str));
        }
        String LIZ2 = fzc.LIZ(EF7.LIZIZ(), str);
        if (LIZ2 == null || LIZ2.length() == 0) {
            return null;
        }
        return LIZ(new File(LIZ2));
    }
}
