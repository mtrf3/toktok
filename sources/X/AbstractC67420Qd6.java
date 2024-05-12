package X;

/* renamed from: X.Qd6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67420Qd6 {
    public abstract InterfaceC67370QcI LIZ();

    public abstract java.util.Map<EnumC67357Qc5, AbstractC67431QdH> LIZJ();

    public final long LIZIZ(EnumC67357Qc5 enumC67357Qc5, long j, int i) {
        long j2;
        long time = j - LIZ().getTime();
        AbstractC67431QdH abstractC67431QdH = LIZJ().get(enumC67357Qc5);
        long LIZ = abstractC67431QdH.LIZ();
        int i2 = i - 1;
        if (LIZ > 1) {
            j2 = LIZ;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * LIZ * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2))), time), abstractC67431QdH.LIZJ());
    }
}
