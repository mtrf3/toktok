package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.EfZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36997EfZ {
    public boolean LIZ;
    public long LIZIZ;
    public EnumC36999Efb LIZJ;
    public final ArrayList<OSZ<String, String>> LIZLLL;
    public final ArrayList<OSZ<String, String>> LJ;
    public final String LJFF;
    public final String LJI;

    public C36997EfZ(String pathString, String str) {
        o.LJIIJ(pathString, "pathString");
        this.LJFF = pathString;
        this.LJI = str;
        this.LIZJ = EnumC36999Efb.GET;
        this.LIZLLL = new ArrayList<>();
        this.LJ = new ArrayList<>();
    }

    public final void LIZ(String str, String str2) {
        this.LJ.add(new OSZ<>(str, str2));
    }
}
