package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class P7K {
    public P7P LIZ;
    public EnumC63901P6b LIZIZ;
    public TEFrameSizei LIZJ;
    public final X10 LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public P6S LJI;
    public boolean LJII = false;
    public P75 LJIIIIZZ = null;
    public final P7Q LJIIIZ = new P7Q();
    public final P7R LJIIJ = new P7R();

    public Surface LIZIZ() {
        return null;
    }

    public abstract Surface LIZJ();

    public Surface LIZLLL(int i) {
        return null;
    }

    public Surface LJ() {
        return null;
    }

    public EnumC63904P6e LJFF() {
        return null;
    }

    public abstract SurfaceTexture LJI();

    public SurfaceTexture LJII() {
        return null;
    }

    public Surface[] LJIIIIZZ() {
        return null;
    }

    public Surface[] LJIIIZ(int i) {
        return null;
    }

    public int LJIIJ() {
        return -1;
    }

    public abstract int LJIIJJI();

    public int LJIIL(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return -1;
    }

    public abstract void LJIILIIL(List list, TEFrameSizei tEFrameSizei);

    public abstract void LJIILJJIL();

    public void LJIILLIIL() {
    }

    public void LJIIZILJ() {
    }

    public void LJIJ() {
    }

    public void LJIJJ(EnumC63904P6e enumC63904P6e) {
    }

    public abstract void LJIJJLI(SurfaceTexture surfaceTexture);

    public void LJIL(SurfaceTexture surfaceTexture, int i) {
    }

    public void LJJ(SurfaceTexture surfaceTexture, EnumC63904P6e enumC63904P6e) {
    }

    public void LJJI(int i) {
    }

    public void LJJIFFI() {
    }

    public void LJIILL() {
        if (this.LIZ instanceof P7S) {
            this.LIZ = this.LJIIJ;
        } else {
            this.LIZ = this.LJIIIZ;
        }
    }

    public static List<TEFrameSizei> LIZ(Size[] sizeArr) {
        if (sizeArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    public void LJIJI(P7P p7p) {
        this.LIZ = p7p;
    }

    public P7K(C63915P6p c63915P6p, X10 x10) {
        this.LIZJ = new TEFrameSizei();
        this.LJ = true;
        this.LJFF = 1;
        this.LIZIZ = c63915P6p.LJIIIIZZ;
        this.LIZ = c63915P6p.LIZJ;
        this.LIZJ = c63915P6p.LIZIZ;
        this.LIZLLL = x10;
        this.LJ = c63915P6p.LIZ;
        this.LJFF = c63915P6p.LJFF;
    }
}
