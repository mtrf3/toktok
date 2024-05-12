package X;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V1t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79077V1t {
    public static final C78712Uuq LJIILLIIL = InterfaceC78716Uuu.LJJLIIIJ;
    public static final C78714Uus LJIIZILJ = InterfaceC78716Uuu.LJJLIIIJILLIZJL;
    public static int LJIJ = -1;
    public final Resources LIZ;
    public float LIZIZ;
    public Drawable LIZJ;
    public InterfaceC78716Uuu LIZLLL;
    public Drawable LJ;
    public InterfaceC78716Uuu LJFF;
    public Drawable LJI;
    public InterfaceC78716Uuu LJII;
    public Drawable LJIIIIZZ;
    public InterfaceC78716Uuu LJIIIZ;
    public InterfaceC78716Uuu LJIIJ;
    public PointF LJIIJJI;
    public Drawable LJIIL;
    public List<Drawable> LJIILIIL;
    public Drawable LJIILJJIL;
    public V8L LJIILL;

    public final V92 LIZ() {
        List<Drawable> list = this.LJIILIIL;
        if (list != null) {
            Iterator<Drawable> it = list.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        return new V92(this);
    }

    public C79077V1t(Resources resources) {
        this.LIZ = resources;
        if (LJIJ < 0) {
            LJIJ = 300;
        }
        this.LIZIZ = 0.0f;
        this.LIZJ = null;
        C78712Uuq c78712Uuq = LJIILLIIL;
        this.LIZLLL = c78712Uuq;
        this.LJ = null;
        this.LJFF = c78712Uuq;
        this.LJI = null;
        this.LJII = c78712Uuq;
        this.LJIIIIZZ = null;
        this.LJIIIZ = c78712Uuq;
        this.LJIIJ = LJIIZILJ;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIILL = null;
    }
}
