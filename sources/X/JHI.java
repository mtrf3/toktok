package X;

/* loaded from: classes9.dex */
public final class JHI {
    public static volatile JHI LJIILL;
    public InterfaceC46330IGg LIZ;
    public String LIZIZ;
    public boolean LIZLLL;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public String LJIILIIL;
    public long LIZJ = -1;
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public String LJIIIZ = "";
    public Long LJIIL = 0L;
    public int LJIILJJIL = -1;

    public static JHI LIZ() {
        if (LJIILL == null) {
            synchronized (JHI.class) {
                if (LJIILL == null) {
                    LJIILL = new JHI();
                }
            }
        }
        return LJIILL;
    }
}
