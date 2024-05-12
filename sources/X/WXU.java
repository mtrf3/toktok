package X;

import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WXU {
    public final Bitmap LIZ;
    public final Bitmap LIZIZ;
    public final Bitmap LIZJ;
    public final View LIZLLL;
    public final C08630Vn<Boolean> LJ;
    public final C08630Vn<Boolean> LJFF;
    public final C08630Vn<Boolean> LJI;
    public final C08630Vn<Boolean> LJII;
    public final C08630Vn<Boolean> LJIIIIZZ;
    public final boolean LJIIIZ;
    public final C08630Vn<Boolean> LJIIJ;
    public final C08630Vn<Boolean> LJIIJJI;
    public final int LJIIL;
    public final boolean LJIILIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WXU)) {
            return false;
        }
        WXU wxu = (WXU) obj;
        return o.LJ(this.LIZ, wxu.LIZ) && o.LJ(this.LIZIZ, wxu.LIZIZ) && o.LJ(this.LIZJ, wxu.LIZJ) && o.LJ(this.LIZLLL, wxu.LIZLLL) && o.LJ(this.LJ, wxu.LJ) && o.LJ(this.LJFF, wxu.LJFF) && o.LJ(this.LJI, wxu.LJI) && o.LJ(this.LJII, wxu.LJII) && o.LJ(this.LJIIIIZZ, wxu.LJIIIIZZ) && this.LJIIIZ == wxu.LJIIIZ && o.LJ(this.LJIIJ, wxu.LJIIJ) && o.LJ(this.LJIIJJI, wxu.LJIIJJI) && this.LJIIL == wxu.LJIIL && this.LJIILIIL == wxu.LJIILIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Bitmap bitmap = this.LIZ;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Bitmap bitmap2 = this.LIZIZ;
        int hashCode2 = (hashCode + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
        Bitmap bitmap3 = this.LIZJ;
        int hashCode3 = (this.LIZLLL.hashCode() + ((hashCode2 + (bitmap3 == null ? 0 : bitmap3.hashCode())) * 31)) * 31;
        C08630Vn<Boolean> c08630Vn = this.LJ;
        int hashCode4 = (hashCode3 + (c08630Vn == null ? 0 : c08630Vn.hashCode())) * 31;
        C08630Vn<Boolean> c08630Vn2 = this.LJFF;
        int hashCode5 = (hashCode4 + (c08630Vn2 == null ? 0 : c08630Vn2.hashCode())) * 31;
        C08630Vn<Boolean> c08630Vn3 = this.LJI;
        int hashCode6 = (hashCode5 + (c08630Vn3 == null ? 0 : c08630Vn3.hashCode())) * 31;
        C08630Vn<Boolean> c08630Vn4 = this.LJII;
        int hashCode7 = (hashCode6 + (c08630Vn4 == null ? 0 : c08630Vn4.hashCode())) * 31;
        C08630Vn<Boolean> c08630Vn5 = this.LJIIIIZZ;
        int hashCode8 = (hashCode7 + (c08630Vn5 == null ? 0 : c08630Vn5.hashCode())) * 31;
        boolean z = this.LJIIIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode8 + i) * 31;
        C08630Vn<Boolean> c08630Vn6 = this.LJIIJ;
        int hashCode9 = (i2 + (c08630Vn6 == null ? 0 : c08630Vn6.hashCode())) * 31;
        C08630Vn<Boolean> c08630Vn7 = this.LJIIJJI;
        return ((((hashCode9 + (c08630Vn7 != null ? c08630Vn7.hashCode() : 0)) * 31) + this.LJIIL) * 31) + (this.LJIILIIL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NowsCameraStates(loadOuterImage=");
        sb.append(this.LIZ);
        sb.append(", loadInnerImage=");
        sb.append(this.LIZIZ);
        sb.append(", loadFakeSurface=");
        sb.append(this.LIZJ);
        sb.append(", surfaceView=");
        sb.append(this.LIZLLL);
        sb.append(", backToPreview=");
        sb.append(this.LJ);
        sb.append(", afterSwitchSurfaceShow=");
        sb.append(this.LJFF);
        sb.append(", openFrontFlash=");
        sb.append(this.LJI);
        sb.append(", closeFrontFlash=");
        sb.append(this.LJII);
        sb.append(", switchImages=");
        sb.append(this.LJIIIIZZ);
        sb.append(", isDefaultDualCamera=");
        sb.append(this.LJIIIZ);
        sb.append(", isDualCamera=");
        sb.append(this.LJIIJ);
        sb.append(", isCameraFacingFront=");
        sb.append(this.LJIIJJI);
        sb.append(", recordingType=");
        sb.append(this.LJIIL);
        sb.append(", flashOn=");
        return C08880Wm.LIZJ(sb, this.LJIILIIL, ')');
    }

    public WXU(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, View surfaceView, C08630Vn<Boolean> c08630Vn, C08630Vn<Boolean> c08630Vn2, C08630Vn<Boolean> c08630Vn3, C08630Vn<Boolean> c08630Vn4, C08630Vn<Boolean> c08630Vn5, boolean z, C08630Vn<Boolean> c08630Vn6, C08630Vn<Boolean> c08630Vn7, int i, boolean z2) {
        o.LJIIIZ(surfaceView, "surfaceView");
        this.LIZ = bitmap;
        this.LIZIZ = bitmap2;
        this.LIZJ = bitmap3;
        this.LIZLLL = surfaceView;
        this.LJ = c08630Vn;
        this.LJFF = c08630Vn2;
        this.LJI = c08630Vn3;
        this.LJII = c08630Vn4;
        this.LJIIIIZZ = c08630Vn5;
        this.LJIIIZ = z;
        this.LJIIJ = c08630Vn6;
        this.LJIIJJI = c08630Vn7;
        this.LJIIL = i;
        this.LJIILIIL = z2;
    }

    public static WXU LIZ(WXU wxu, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, C08630Vn c08630Vn, C08630Vn c08630Vn2, C08630Vn c08630Vn3, C08630Vn c08630Vn4, C08630Vn c08630Vn5, C08630Vn c08630Vn6, C08630Vn c08630Vn7, int i, boolean z, int i2) {
        View surfaceView;
        boolean z2;
        boolean z3 = z;
        int i3 = i;
        C08630Vn c08630Vn8 = c08630Vn7;
        C08630Vn c08630Vn9 = c08630Vn6;
        C08630Vn c08630Vn10 = c08630Vn5;
        C08630Vn c08630Vn11 = c08630Vn4;
        Bitmap bitmap4 = bitmap2;
        Bitmap bitmap5 = bitmap;
        Bitmap bitmap6 = bitmap3;
        C08630Vn c08630Vn12 = c08630Vn;
        C08630Vn c08630Vn13 = c08630Vn2;
        C08630Vn c08630Vn14 = c08630Vn3;
        if ((i2 & 1) != 0) {
            bitmap5 = wxu.LIZ;
        }
        if ((i2 & 2) != 0) {
            bitmap4 = wxu.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            bitmap6 = wxu.LIZJ;
        }
        if ((i2 & 8) != 0) {
            surfaceView = wxu.LIZLLL;
        } else {
            surfaceView = null;
        }
        if ((i2 & 16) != 0) {
            c08630Vn12 = wxu.LJ;
        }
        if ((i2 & 32) != 0) {
            c08630Vn13 = wxu.LJFF;
        }
        if ((i2 & 64) != 0) {
            c08630Vn14 = wxu.LJI;
        }
        if ((i2 & 128) != 0) {
            c08630Vn11 = wxu.LJII;
        }
        if ((i2 & 256) != 0) {
            c08630Vn10 = wxu.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            z2 = wxu.LJIIIZ;
        } else {
            z2 = false;
        }
        if ((i2 & 1024) != 0) {
            c08630Vn9 = wxu.LJIIJ;
        }
        if ((i2 & 2048) != 0) {
            c08630Vn8 = wxu.LJIIJJI;
        }
        if ((i2 & 4096) != 0) {
            i3 = wxu.LJIIL;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            z3 = wxu.LJIILIIL;
        }
        wxu.getClass();
        o.LJIIIZ(surfaceView, "surfaceView");
        return new WXU(bitmap5, bitmap4, bitmap6, surfaceView, c08630Vn12, c08630Vn13, c08630Vn14, c08630Vn11, c08630Vn10, z2, c08630Vn9, c08630Vn8, i3, z3);
    }
}
