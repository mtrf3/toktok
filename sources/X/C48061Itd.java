package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.Itd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48061Itd {
    public String LIZ;
    public String LIZIZ;
    public C48091Iu7 LIZJ;
    public InterfaceC47454Ijq LIZLLL;
    public AbstractC47939Irf LJ;
    public C47961Is1 LJFF;
    public List<C48099IuF> LJI;
    public int LJII;
    public C48077Itt LJIIIIZZ;
    public InterfaceC48093Iu9 LJIIIZ;
    public boolean LJIIJ;

    public final C48071Itn LIZ() {
        if (this.LJ != null && this.LJFF != null && (this.LIZLLL != null || (!TextUtils.isEmpty(this.LIZ) && !TextUtils.isEmpty(this.LIZIZ) && this.LIZJ != null))) {
            return new C48071Itn(this);
        }
        throw new IllegalArgumentException();
    }
}
