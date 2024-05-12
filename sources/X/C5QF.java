package X;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5QF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5QF {
    public final SurfaceView LIZ;
    public final java.util.Map<String, InterfaceC132925Jo> LIZIZ;
    public final C08630Vn<Boolean> LIZJ;
    public final NLEEditor LIZLLL;
    public final InterfaceC126684y8 LJ;
    public final OSZ<String, InterfaceC132925Jo> LJFF;
    public final C5Q2 LJI;
    public final InterfaceC132925Jo LJII;
    public final OSZ<Boolean, Bitmap> LJIIIIZZ;

    public C5QF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5QF)) {
            return false;
        }
        C5QF c5qf = (C5QF) obj;
        return o.LJ(this.LIZ, c5qf.LIZ) && o.LJ(this.LIZIZ, c5qf.LIZIZ) && o.LJ(this.LIZJ, c5qf.LIZJ) && o.LJ(this.LIZLLL, c5qf.LIZLLL) && o.LJ(this.LJ, c5qf.LJ) && o.LJ(this.LJFF, c5qf.LJFF) && o.LJ(this.LJI, c5qf.LJI) && o.LJ(this.LJII, c5qf.LJII) && o.LJ(this.LJIIIIZZ, c5qf.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreviewPanelStates(bindSurfaceView=");
        LIZ.append(this.LIZ);
        LIZ.append(", materials=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enableTouchEvent=");
        LIZ.append(this.LIZJ);
        LIZ.append(", nleEditor=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", nleSession=");
        LIZ.append(this.LJ);
        LIZ.append(", currentEditModeMaterial=");
        LIZ.append(this.LJFF);
        LIZ.append(", onTouchEventListener=");
        LIZ.append(this.LJI);
        LIZ.append(", lockedConsumer=");
        LIZ.append(this.LJII);
        LIZ.append(", showPreviewPlaceHolder=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        SurfaceView surfaceView = this.LIZ;
        int i = 0;
        if (surfaceView == null) {
            hashCode = 0;
        } else {
            hashCode = surfaceView.hashCode();
        }
        int LIZ = C12400eC.LIZ(this.LIZIZ, hashCode * 31, 31);
        C08630Vn<Boolean> c08630Vn = this.LIZJ;
        if (c08630Vn == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c08630Vn.hashCode();
        }
        int i2 = (LIZ + hashCode2) * 31;
        NLEEditor nLEEditor = this.LIZLLL;
        if (nLEEditor == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = nLEEditor.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        InterfaceC126684y8 interfaceC126684y8 = this.LJ;
        if (interfaceC126684y8 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = interfaceC126684y8.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        OSZ<String, InterfaceC132925Jo> osz = this.LJFF;
        if (osz == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = osz.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        C5Q2 c5q2 = this.LJI;
        if (c5q2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c5q2.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        InterfaceC132925Jo interfaceC132925Jo = this.LJII;
        if (interfaceC132925Jo == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = interfaceC132925Jo.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        OSZ<Boolean, Bitmap> osz2 = this.LJIIIIZZ;
        if (osz2 != null) {
            i = osz2.hashCode();
        }
        return i7 + i;
    }

    public /* synthetic */ C5QF(int i) {
        this(null, new HashMap(), null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5QF(SurfaceView surfaceView, java.util.Map<String, ? extends InterfaceC132925Jo> materials, C08630Vn<Boolean> c08630Vn, NLEEditor nLEEditor, InterfaceC126684y8 interfaceC126684y8, OSZ<String, ? extends InterfaceC132925Jo> osz, C5Q2 c5q2, InterfaceC132925Jo interfaceC132925Jo, OSZ<Boolean, Bitmap> osz2) {
        o.LJIIIZ(materials, "materials");
        this.LIZ = surfaceView;
        this.LIZIZ = materials;
        this.LIZJ = c08630Vn;
        this.LIZLLL = nLEEditor;
        this.LJ = interfaceC126684y8;
        this.LJFF = osz;
        this.LJI = c5q2;
        this.LJII = interfaceC132925Jo;
        this.LJIIIIZZ = osz2;
    }

    public static C5QF LIZ(C5QF c5qf, SurfaceView surfaceView, java.util.Map map, C08630Vn c08630Vn, NLEEditor nLEEditor, InterfaceC126684y8 interfaceC126684y8, OSZ osz, C5Q2 c5q2, InterfaceC132925Jo interfaceC132925Jo, OSZ osz2, int i) {
        OSZ osz3 = osz2;
        InterfaceC132925Jo interfaceC132925Jo2 = interfaceC132925Jo;
        C5Q2 c5q22 = c5q2;
        java.util.Map materials = map;
        SurfaceView surfaceView2 = surfaceView;
        C08630Vn c08630Vn2 = c08630Vn;
        NLEEditor nLEEditor2 = nLEEditor;
        InterfaceC126684y8 interfaceC126684y82 = interfaceC126684y8;
        OSZ osz4 = osz;
        if ((i & 1) != 0) {
            surfaceView2 = c5qf.LIZ;
        }
        if ((i & 2) != 0) {
            materials = c5qf.LIZIZ;
        }
        if ((i & 4) != 0) {
            c08630Vn2 = c5qf.LIZJ;
        }
        if ((i & 8) != 0) {
            nLEEditor2 = c5qf.LIZLLL;
        }
        if ((i & 16) != 0) {
            interfaceC126684y82 = c5qf.LJ;
        }
        if ((i & 32) != 0) {
            osz4 = c5qf.LJFF;
        }
        if ((i & 64) != 0) {
            c5q22 = c5qf.LJI;
        }
        if ((i & 128) != 0) {
            interfaceC132925Jo2 = c5qf.LJII;
        }
        if ((i & 256) != 0) {
            osz3 = c5qf.LJIIIIZZ;
        }
        c5qf.getClass();
        o.LJIIIZ(materials, "materials");
        return new C5QF(surfaceView2, materials, c08630Vn2, nLEEditor2, interfaceC126684y82, osz4, c5q22, interfaceC132925Jo2, osz3);
    }
}
