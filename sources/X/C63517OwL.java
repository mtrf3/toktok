package X;

import java.util.Random;

/* renamed from: X.OwL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C63517OwL {
    public static C63517OwL LIZIZ;
    public long LIZ;

    public final synchronized long LIZ() {
        long j;
        if (this.LIZ <= 0) {
            this.LIZ = 1L;
        }
        j = this.LIZ;
        this.LIZ = 1 + j;
        return j;
    }

    public C63517OwL() {
        if (this.LIZ == 0) {
            this.LIZ = new Random().nextInt(1000000);
        }
    }
}
