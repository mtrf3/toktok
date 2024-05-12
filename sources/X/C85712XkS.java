package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.XkS, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85712XkS {
    public String LIZ;
    public String LIZIZ;
    public EnumC252729vw LIZJ;
    public String LIZLLL;
    public final EnumC252729vw LJ;
    public boolean LJFF;
    public boolean LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public final Integer LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public C2068389v LJIILL;
    public boolean LJIILLIIL;

    public C85712XkS(String str, String str2, boolean z, String str3, String str4, boolean z2, String str5, boolean z3, boolean z4, int i) {
        EnumC252729vw titleBarLeftTextVariant;
        EnumC252729vw titleBarRightTextVariant;
        boolean z5 = z4;
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            titleBarLeftTextVariant = EnumC252729vw.SECONDARY;
        } else {
            titleBarLeftTextVariant = null;
        }
        if ((i & 16) != 0) {
            titleBarRightTextVariant = EnumC252729vw.SECONDARY;
        } else {
            titleBarRightTextVariant = null;
        }
        z = (i & 32) != 0 ? true : z;
        str3 = (i & 256) != 0 ? null : str3;
        str4 = (i & 512) != 0 ? null : str4;
        z2 = (i & 2048) != 0 ? false : z2;
        str5 = (i & 4096) != 0 ? null : str5;
        boolean z6 = (i & FileUtils.BUFFER_SIZE) == 0 ? z3 : true;
        z5 = (i & 16384) != 0 ? false : z5;
        o.LJIIIZ(titleBarLeftTextVariant, "titleBarLeftTextVariant");
        o.LJIIIZ(titleBarRightTextVariant, "titleBarRightTextVariant");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = titleBarLeftTextVariant;
        this.LIZLLL = null;
        this.LJ = titleBarRightTextVariant;
        this.LJFF = z;
        this.LJI = false;
        this.LJII = null;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = str4;
        this.LJIIJ = null;
        this.LJIIJJI = z2;
        this.LJIIL = str5;
        this.LJIILIIL = z6;
        this.LJIILJJIL = z5;
        this.LJIILL = null;
        this.LJIILLIIL = false;
    }
}
