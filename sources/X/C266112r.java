package X;

/* renamed from: X.12r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C266112r {
    public EnumC264912f LIZ = EnumC264912f.RESET;
    public long LIZIZ;
    public long LIZJ;

    public final void LIZ() {
        EnumC264912f enumC264912f = this.LIZ;
        EnumC264912f enumC264912f2 = EnumC264912f.PAUSED;
        if (enumC264912f == enumC264912f2) {
            return;
        }
        this.LIZ = enumC264912f2;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.LIZJ;
        if (1 <= j && j < currentTimeMillis) {
            this.LIZIZ = (currentTimeMillis - j) + this.LIZIZ;
        }
    }
}
