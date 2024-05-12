package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5QB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5QB {
    public final C08630Vn<NLEModel> LIZ;
    public final OSZ<NLETrack, NLETrackSlot> LIZIZ;
    public final long LIZJ;
    public final OSZ<Float, Float> LIZLLL;
    public final List<InterfaceC132925Jo> LJ;
    public final C08630Vn<C76800UCe> LJFF;
    public final C08630Vn<Boolean> LJI;

    public C5QB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5QB)) {
            return false;
        }
        C5QB c5qb = (C5QB) obj;
        return o.LJ(this.LIZ, c5qb.LIZ) && o.LJ(this.LIZIZ, c5qb.LIZIZ) && this.LIZJ == c5qb.LIZJ && o.LJ(this.LIZLLL, c5qb.LIZLLL) && o.LJ(this.LJ, c5qb.LJ) && o.LJ(this.LJFF, c5qb.LJFF) && o.LJ(this.LJI, c5qb.LJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CropPreviewStates(updateNleModel=");
        LIZ.append(this.LIZ);
        LIZ.append(", currentSelectSlot=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", currentPlayProcess=");
        LIZ.append(this.LIZJ);
        LIZ.append(", canvasSize=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", materials=");
        LIZ.append(this.LJ);
        LIZ.append(", notifyInvalidate=");
        LIZ.append(this.LJFF);
        LIZ.append(", enableTouchEvent=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.LIZ.hashCode() * 31;
        OSZ<NLETrack, NLETrackSlot> osz = this.LIZIZ;
        int i = 0;
        if (osz == null) {
            hashCode = 0;
        } else {
            hashCode = osz.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJ, (this.LIZLLL.hashCode() + JBR.LIZJ(this.LIZJ, (hashCode3 + hashCode) * 31, 31)) * 31, 31);
        C08630Vn<C76800UCe> c08630Vn = this.LJFF;
        if (c08630Vn == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c08630Vn.hashCode();
        }
        int i2 = (LIZIZ + hashCode2) * 31;
        C08630Vn<Boolean> c08630Vn2 = this.LJI;
        if (c08630Vn2 != null) {
            i = c08630Vn2.hashCode();
        }
        return i2 + i;
    }

    public C5QB(int i) {
        this(new C08630Vn(new NLEModel()), null, 0L, new OSZ(Float.valueOf(0.0f), Float.valueOf(0.0f)), C61878OQg.INSTANCE, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5QB(C08630Vn<NLEModel> updateNleModel, OSZ<? extends NLETrack, ? extends NLETrackSlot> osz, long j, OSZ<Float, Float> canvasSize, List<? extends InterfaceC132925Jo> materials, C08630Vn<C76800UCe> c08630Vn, C08630Vn<Boolean> c08630Vn2) {
        o.LJIIIZ(updateNleModel, "updateNleModel");
        o.LJIIIZ(canvasSize, "canvasSize");
        o.LJIIIZ(materials, "materials");
        this.LIZ = updateNleModel;
        this.LIZIZ = osz;
        this.LIZJ = j;
        this.LIZLLL = canvasSize;
        this.LJ = materials;
        this.LJFF = c08630Vn;
        this.LJI = c08630Vn2;
    }

    public static C5QB LIZ(C5QB c5qb, C08630Vn c08630Vn, OSZ osz, long j, OSZ osz2, List list, C08630Vn c08630Vn2, int i) {
        C08630Vn<C76800UCe> c08630Vn3;
        C08630Vn c08630Vn4 = c08630Vn2;
        List materials = list;
        OSZ canvasSize = osz2;
        long j2 = j;
        C08630Vn updateNleModel = c08630Vn;
        OSZ osz3 = osz;
        if ((i & 1) != 0) {
            updateNleModel = c5qb.LIZ;
        }
        if ((i & 2) != 0) {
            osz3 = c5qb.LIZIZ;
        }
        if ((i & 4) != 0) {
            j2 = c5qb.LIZJ;
        }
        if ((i & 8) != 0) {
            canvasSize = c5qb.LIZLLL;
        }
        if ((i & 16) != 0) {
            materials = c5qb.LJ;
        }
        if ((i & 32) != 0) {
            c08630Vn3 = c5qb.LJFF;
        } else {
            c08630Vn3 = null;
        }
        if ((i & 64) != 0) {
            c08630Vn4 = c5qb.LJI;
        }
        c5qb.getClass();
        o.LJIIIZ(updateNleModel, "updateNleModel");
        o.LJIIIZ(canvasSize, "canvasSize");
        o.LJIIIZ(materials, "materials");
        return new C5QB(updateNleModel, osz3, j2, canvasSize, materials, c08630Vn3, c08630Vn4);
    }
}
