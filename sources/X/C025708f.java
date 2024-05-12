package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;

/* renamed from: X.08f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C025708f {
    public int LIZ;
    public Fragment LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public Lifecycle.State LJI;
    public Lifecycle.State LJII;

    public C025708f() {
    }

    public C025708f(Fragment fragment, Lifecycle.State state) {
        this.LIZ = 10;
        this.LIZIZ = fragment;
        this.LJI = fragment.mMaxState;
        this.LJII = state;
    }

    public C025708f(int i, Fragment fragment) {
        this.LIZ = i;
        this.LIZIZ = fragment;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        this.LJI = state;
        this.LJII = state;
    }
}
