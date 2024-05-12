package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import java.util.HashMap;

/* renamed from: X.00l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C005500l {
    public final Context LIZ;
    public View LIZIZ;
    public int LJ;
    public int LJFF;
    public int LJII;
    public int LJIIIIZZ;
    public TimeInterpolator LJIIJ;
    public boolean LJIIL;
    public InterfaceC005200i LJIILIIL;
    public int LIZJ = -2;
    public int LIZLLL = -2;
    public int LJI = 3;
    public long LJIIIZ = 300;
    public String LJIIJJI = C005600m.LIZIZ;

    public final void LIZ() {
        java.util.Map<String, AbstractC004900f> map = C005600m.LIZ;
        if (((HashMap) map).containsKey(this.LJIIJJI)) {
            C0NB.LJ("LiveFloatWindowManager", "Float window has been added!");
            return;
        }
        if (this.LIZIZ == null) {
            C0NB.LJ("LiveFloatWindowManager", "view can not be null!");
            return;
        }
        if (this.LIZ == null) {
            C0NB.LJ("LiveFloatWindowManager", "host is null!");
        } else {
            if (this.LIZIZ == null) {
                C0NB.LJ("LiveFloatWindowManager", "view can not be null!");
                return;
            }
            HashMap hashMap = (HashMap) map;
            hashMap.put(this.LJIIJJI, new C278217i(this));
        }
    }

    public C005500l(Context context) {
        this.LIZ = context;
    }
}
