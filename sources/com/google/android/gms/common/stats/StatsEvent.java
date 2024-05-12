package com.google.android.gms.common.stats;

import X.C06510Nj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract int LJJJJL();

    public abstract long LJJJJZ();

    public abstract long LJJJJZI();

    public abstract String LJJJLIIL();

    public final String toString() {
        long LJJJJZI = LJJJJZI();
        int LJJJJL = LJJJJL();
        long LJJJJZ = LJJJJZ();
        String LJJJLIIL = LJJJLIIL();
        StringBuilder sb = new StringBuilder(LJJJLIIL.length() + 53);
        C06510Nj.LIZIZ(sb, LJJJJZI, "\t", LJJJJL);
        sb.append("\t");
        sb.append(LJJJJZ);
        sb.append(LJJJLIIL);
        return sb.toString();
    }
}
