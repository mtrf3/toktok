package X;

import com.bytedance.ies.xelement.viewpager.foldview.LynxFoldViewNG;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VTB implements VTU {
    public final /* synthetic */ LynxFoldViewNG LIZ;

    @Override // X.VTU
    public final void LIZIZ() {
        VNU lynxContext = this.LIZ.mContext;
        o.LJFF(lynxContext, "lynxContext");
        VNV vnv = lynxContext.LJLLL;
        LynxFoldViewNG lynxFoldViewNG = this.LIZ;
        vnv.LJJII(new C60877Nur(lynxFoldViewNG.mView, lynxFoldViewNG.getTagName(), this.LIZ.mScrollMonitorTag));
    }

    @Override // X.VTU
    public final void LIZJ() {
        VNU lynxContext = this.LIZ.mContext;
        o.LJFF(lynxContext, "lynxContext");
        VNV vnv = lynxContext.LJLLL;
        LynxFoldViewNG lynxFoldViewNG = this.LIZ;
        vnv.LJJIII(new C60877Nur(lynxFoldViewNG.mView, lynxFoldViewNG.getTagName(), this.LIZ.mScrollMonitorTag));
    }

    @Override // X.VTU
    public final void LIZLLL() {
        VNU lynxContext = this.LIZ.mContext;
        o.LJFF(lynxContext, "lynxContext");
        VNV vnv = lynxContext.LJLLL;
        LynxFoldViewNG lynxFoldViewNG = this.LIZ;
        vnv.LJIIIIZZ(new C60877Nur(lynxFoldViewNG.mView, lynxFoldViewNG.getTagName(), this.LIZ.mScrollMonitorTag));
    }

    public VTB(LynxFoldViewNG lynxFoldViewNG) {
        this.LIZ = lynxFoldViewNG;
    }
}
