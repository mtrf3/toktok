package X;

import android.util.Pair;
import java.util.LinkedList;

/* renamed from: X.PGy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64184PGy implements InterfaceC64208PHw {
    public double LIZ = -1.0d;
    public double LIZIZ = -1.0d;
    public Pair<Long, LinkedList<C64206PHu>> LIZJ = new Pair<>(0L, new LinkedList());
    public Pair<Long, LinkedList<C64206PHu>> LIZLLL = new Pair<>(0L, new LinkedList());

    @Override // X.InterfaceC64208PHw
    public final double LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC64208PHw
    public final double getCpuRate() {
        return this.LIZ;
    }
}
