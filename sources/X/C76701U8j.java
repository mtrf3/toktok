package X;

import android.view.SurfaceView;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.U8j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76701U8j {
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C75781Tof.LJLIL);
    public EnumC75419Tip LIZ;
    public Long LIZIZ;
    public String LIZJ;
    public SurfaceView LIZLLL;
    public WeakReference<ILayerControl.ILayer> LJ;
    public EnumC75419Tip LJFF;
    public final boolean LJI;
    public boolean LJII;

    public C76701U8j() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76701U8j)) {
            return false;
        }
        C76701U8j c76701U8j = (C76701U8j) obj;
        return this.LIZ == c76701U8j.LIZ && o.LJ(this.LIZIZ, c76701U8j.LIZIZ) && o.LJ(this.LIZJ, c76701U8j.LIZJ) && o.LJ(this.LIZLLL, c76701U8j.LIZLLL) && o.LJ(this.LJ, c76701U8j.LJ) && this.LJFF == c76701U8j.LJFF && this.LJI == c76701U8j.LJI && this.LJII == c76701U8j.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        EnumC75419Tip enumC75419Tip = this.LIZ;
        int hashCode = (enumC75419Tip == null ? 0 : enumC75419Tip.hashCode()) * 31;
        Long l = this.LIZIZ;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LIZJ;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        SurfaceView surfaceView = this.LIZLLL;
        int hashCode4 = (hashCode3 + (surfaceView == null ? 0 : surfaceView.hashCode())) * 31;
        WeakReference<ILayerControl.ILayer> weakReference = this.LJ;
        int hashCode5 = (this.LJFF.hashCode() + ((hashCode4 + (weakReference != null ? weakReference.hashCode() : 0)) * 31)) * 31;
        boolean z = this.LJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode5 + i) * 31) + (this.LJII ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MicInfo(state=");
        LIZ.append(this.LIZ);
        LIZ.append(", uid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", linkMicId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", surfaceView=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", layer=");
        LIZ.append(this.LJ);
        LIZ.append(", lastState=");
        LIZ.append(this.LJFF);
        LIZ.append(", canConsume=");
        LIZ.append(this.LJI);
        LIZ.append(", needRemoveSurfaceView=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public C76701U8j(EnumC75419Tip enumC75419Tip, Long l, String str, SurfaceView surfaceView, WeakReference weakReference, EnumC75419Tip lastState, int i) {
        surfaceView = (i & 8) != 0 ? null : surfaceView;
        weakReference = (i & 16) != 0 ? null : weakReference;
        lastState = (i & 32) != 0 ? EnumC75419Tip.StateIdle : lastState;
        o.LJIIIZ(lastState, "lastState");
        this.LIZ = enumC75419Tip;
        this.LIZIZ = l;
        this.LIZJ = str;
        this.LIZLLL = surfaceView;
        this.LJ = weakReference;
        this.LJFF = lastState;
        this.LJI = false;
        this.LJII = false;
    }
}
