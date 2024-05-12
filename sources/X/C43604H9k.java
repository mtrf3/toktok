package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import kotlin.jvm.internal.o;

/* renamed from: X.H9k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43604H9k {
    public final C43606H9m LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final CanvasVideoData LIZLLL;
    public final int LJ;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJFF;
    public final Bundle LJI;

    public C43604H9k() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43604H9k)) {
            return false;
        }
        C43604H9k c43604H9k = (C43604H9k) obj;
        return o.LJ(this.LIZ, c43604H9k.LIZ) && o.LJ(this.LIZIZ, c43604H9k.LIZIZ) && this.LIZJ == c43604H9k.LIZJ && o.LJ(this.LIZLLL, c43604H9k.LIZLLL) && this.LJ == c43604H9k.LJ && o.LJ(this.LJFF, c43604H9k.LJFF) && o.LJ(this.LJI, c43604H9k.LJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextCanvasEnterEditParam(coreParam=");
        LIZ.append(this.LIZ);
        LIZ.append(", filePath=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", needWaitMusic=");
        LIZ.append(this.LIZJ);
        LIZ.append(", canvasVideoData=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LJ);
        LIZ.append(", finishListener=");
        LIZ.append(this.LJFF);
        LIZ.append(", extraInfo=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((this.LIZLLL.hashCode() + ((LJ + i) * 31)) * 31) + this.LJ) * 31;
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LJFF;
        int i2 = 0;
        if (interfaceC88472Yns == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC88472Yns.hashCode();
        }
        int i3 = (hashCode2 + hashCode) * 31;
        Bundle bundle = this.LJI;
        if (bundle != null) {
            i2 = bundle.hashCode();
        }
        return i3 + i2;
    }

    public C43604H9k(C43606H9m c43606H9m, String filePath, CanvasVideoData canvasVideoData, int i, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(filePath, "filePath");
        this.LIZ = c43606H9m;
        this.LIZIZ = filePath;
        this.LIZJ = false;
        this.LIZLLL = canvasVideoData;
        this.LJ = i;
        this.LJFF = interfaceC88472Yns;
        this.LJI = null;
    }
}
