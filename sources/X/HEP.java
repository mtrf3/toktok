package X;

import android.R;
import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes8.dex */
public final class HEP {
    public final Activity LIZ;
    public final Class<? extends WM7> LIZIZ;
    public Bundle LIZJ;
    public boolean LJI;
    public InterfaceC80245VeT LJII;
    public boolean LIZLLL = true;
    public boolean LJ = true;
    public int LJFF = R.id.content;
    public String LJIIIIZZ = "LifeCycleFragment";
    public boolean LJIIIZ = true;

    public final HXO LIZ() {
        HJO hjo = new HJO(this.LIZJ, this.LIZIZ);
        hjo.LIZJ = this.LIZLLL;
        hjo.LIZLLL = this.LJ;
        hjo.LJ = 0;
        return C44272HZc.LIZIZ(this.LIZ, this.LJFF, hjo, this.LJII, this.LJI, this.LJIIIIZZ, this.LJIIIZ);
    }

    public HEP(Activity activity, Class cls) {
        C78932UyO.LJI(activity, "Activity can't be null");
        this.LIZ = activity;
        C78932UyO.LJI(cls, "Root Scene class can't be null");
        this.LIZIZ = cls;
    }
}
