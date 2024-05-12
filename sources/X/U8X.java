package X;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U8X {
    public final ViewGroup LIZ;
    public final AbstractC75858Tpu LIZIZ;
    public final FrameLayout LIZJ;
    public final Layout LIZLLL;
    public final OSZ<Integer, Integer> LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final Rect LJII;
    public final OSZ<Integer, Integer> LJIIIIZZ;
    public final int LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U8X)) {
            return false;
        }
        U8X u8x = (U8X) obj;
        return o.LJ(this.LIZ, u8x.LIZ) && o.LJ(this.LIZIZ, u8x.LIZIZ) && o.LJ(this.LIZJ, u8x.LIZJ) && o.LJ(this.LIZLLL, u8x.LIZLLL) && o.LJ(this.LJ, u8x.LJ) && this.LJFF == u8x.LJFF && this.LJI == u8x.LJI && o.LJ(this.LJII, u8x.LJII) && o.LJ(this.LJIIIIZZ, u8x.LJIIIIZZ) && this.LJIIIZ == u8x.LJIIIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31)) * 31;
        OSZ<Integer, Integer> osz = this.LJ;
        int hashCode2 = (hashCode + (osz == null ? 0 : osz.hashCode())) * 31;
        boolean z = this.LJFF;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((this.LJIIIIZZ.hashCode() + ((this.LJII.hashCode() + ((((hashCode2 + i) * 31) + (this.LJI ? 1 : 0)) * 31)) * 31)) * 31) + this.LJIIIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MeasureData(viewParent=");
        LIZ.append(this.LIZ);
        LIZ.append(", commonLayout=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", containerFrameLayout=");
        LIZ.append(this.LIZJ);
        LIZ.append(", layout=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", originalSize=");
        LIZ.append(this.LJ);
        LIZ.append(", linked=");
        LIZ.append(this.LJFF);
        LIZ.append(", isRoomOwner=");
        LIZ.append(this.LJI);
        LIZ.append(", originalLocationRect=");
        LIZ.append(this.LJII);
        LIZ.append(", playerSize=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", offsetY=");
        return b0.LIZJ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public U8X(ViewGroup viewGroup, C76696U8e commonLayout, FrameLayout containerFrameLayout, Layout layout, OSZ osz, boolean z, boolean z2, Rect originalLocationRect, OSZ playerSize, int i) {
        o.LJIIIZ(commonLayout, "commonLayout");
        o.LJIIIZ(containerFrameLayout, "containerFrameLayout");
        o.LJIIIZ(layout, "layout");
        o.LJIIIZ(originalLocationRect, "originalLocationRect");
        o.LJIIIZ(playerSize, "playerSize");
        this.LIZ = viewGroup;
        this.LIZIZ = commonLayout;
        this.LIZJ = containerFrameLayout;
        this.LIZLLL = layout;
        this.LJ = osz;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = originalLocationRect;
        this.LJIIIIZZ = playerSize;
        this.LJIIIZ = i;
    }
}
