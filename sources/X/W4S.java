package X;

import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class W4S<INFO> extends W4V<INFO> {
    public final List<W4Z<? super INFO>> LIZIZ = new ArrayList(2);

    public final synchronized void LJIILIIL() {
        ((ArrayList) this.LIZIZ).clear();
    }

    public final synchronized void LJIILJJIL() {
    }

    @Override // X.W4V, X.W4Z
    public final synchronized void LIZJ(String str) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                W4Z w4z = (W4Z) ((ArrayList) this.LIZIZ).get(i);
                if (w4z != null) {
                    w4z.LIZJ(str);
                }
            } catch (Exception unused) {
                LJIILJJIL();
            }
        }
    }

    public final synchronized void LJIIL(W4Z<? super INFO> w4z) {
        ((ArrayList) this.LIZIZ).add(w4z);
    }

    @Override // X.W4V, X.W4Z
    public final void LIZIZ(String str, Throwable th) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                W4Z w4z = (W4Z) ((ArrayList) this.LIZIZ).get(i);
                if (w4z != null) {
                    w4z.LIZIZ(str, th);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LIZLLL(Object obj, String str) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                W4Z w4z = (W4Z) ((ArrayList) this.LIZIZ).get(i);
                if (w4z != null) {
                    w4z.LIZLLL(obj, str);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // X.W4V, X.W4Z
    public final synchronized void LJ(String str, Throwable th) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                W4Z w4z = (W4Z) ((ArrayList) this.LIZIZ).get(i);
                if (w4z != null) {
                    w4z.LJ(str, th);
                }
            } catch (Exception unused) {
                LJIILJJIL();
            }
        }
    }

    @Override // X.W4V, X.W4Z
    public final synchronized void LJI(Object obj, String str) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                W4Z w4z = (W4Z) ((ArrayList) this.LIZIZ).get(i);
                if (w4z != null) {
                    w4z.LJI(obj, str);
                }
            } catch (Exception unused) {
                LJIILJJIL();
            }
        }
    }

    @Override // X.W4V
    public final void LJII(W5O w5o, long j) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                W4Z w4z = (W4Z) ((ArrayList) this.LIZIZ).get(i);
                if (w4z instanceof C81695W4l) {
                    ((C81695W4l) w4z).LJII(w5o, j);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // X.W4V
    public final synchronized void LJIIJJI(String str, W5O w5o) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                W4Z w4z = (W4Z) ((ArrayList) this.LIZIZ).get(i);
                if (w4z instanceof C81695W4l) {
                    ((C81695W4l) w4z).LJIIJJI(str, w5o);
                }
            } catch (Exception unused) {
                LJIILJJIL();
            }
        }
    }

    @Override // X.W4V, X.W4Z
    public final synchronized void LJFF(String str, INFO info, Animatable animatable) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                W4Z w4z = (W4Z) ((ArrayList) this.LIZIZ).get(i);
                if (w4z != null) {
                    w4z.LJFF(str, info, animatable);
                }
            } catch (Exception unused) {
                LJIILJJIL();
            }
        }
    }

    @Override // X.W4V
    public final synchronized void LJIIIIZZ(String str, W5O w5o, Throwable th) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                W4Z w4z = (W4Z) ((ArrayList) this.LIZIZ).get(i);
                if (w4z instanceof C81695W4l) {
                    ((C81695W4l) w4z).LJIIIIZZ(str, w5o, th);
                }
            } catch (Exception unused) {
                LJIILJJIL();
            }
        }
    }

    @Override // X.W4V
    public final void LJIIJ(String str, INFO info, Animatable animatable) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                W4Z w4z = (W4Z) ((ArrayList) this.LIZIZ).get(i);
                if (w4z instanceof W4V) {
                    ((W4V) w4z).LJIIJ(str, info, animatable);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // X.W4V
    public final void LJIIIZ(String str, INFO info, Animatable animatable, W5O w5o, java.util.Map map) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                W4Z w4z = (W4Z) ((ArrayList) this.LIZIZ).get(i);
                if (w4z != null && (w4z instanceof C81695W4l)) {
                    ((C81695W4l) w4z).LJIIIZ(str, info, animatable, w5o, map);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }
}
