package X;

/* loaded from: classes11.dex */
public final class OIH {
    public final OIC LIZ;
    public boolean LIZIZ = true;
    public final OID LIZJ;

    public OIH(OIC oic) {
        this.LIZ = oic;
        if (OIF.LIZJ == null) {
            synchronized (OIF.class) {
                if (OIF.LIZJ == null) {
                    OIF.LIZJ = new OIF();
                }
            }
        }
        OIF.LIZJ.LIZIZ = oic;
        this.LIZJ = new OID(oic);
    }
}
