package com.bytedance.lynx.hybrid;

import X.C37692Eqm;
import X.C39048FUe;
import X.C60726NsQ;
import X.FD5;
import X.KMP;
import X.OJU;
import X.Q7L;
import X.VNS;
import X.VNU;
import X.VPA;
import X.VPD;
import X.X1D;
import android.content.Context;
import com.lynx.tasm.behavior.ui.LynxUI;
import defpackage.i0;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LynxSkeletonUI extends LynxUI<OJU> {
    public OJU LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxSkeletonUI(VNU lynxContext) {
        super(lynxContext);
        o.LJIIJ(lynxContext, "lynxContext");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(VPA vpa) {
        super.afterPropsUpdated(vpa);
        StringBuilder LIZ = X1D.LIZ();
        VNU lynxContext = this.mContext;
        o.LJFF(lynxContext, "lynxContext");
        VNS LJI = lynxContext.LJI();
        if (LJI != null) {
            LIZ.append(((C60726NsQ) LJI).getHybridContext().resourcePath);
            OJU oju = this.LJLIL;
            if (oju != null) {
                LIZ.append(oju.getSrc());
                File file = new File(X1D.LIZIZ(LIZ));
                if (file.exists()) {
                    OJU oju2 = this.LJLIL;
                    if (oju2 != null) {
                        oju2.LIZ(file);
                        oju2.setVisibility(0);
                        return;
                    } else {
                        o.LJIJI("lynxSkeletonLoading");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("lynxSkeletonLoading");
            throw null;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final OJU createView(Context context) {
        o.LJIIJ(context, "context");
        C39048FUe.LIZIZ(C39048FUe.LIZIZ, "create view", null, "LynxSkeletonUI", 2);
        this.LJLIL = new OJU(context);
        VNU lynxContext = this.mContext;
        o.LJFF(lynxContext, "lynxContext");
        VNS LJI = lynxContext.LJI();
        if (LJI != null) {
            String str = ((C60726NsQ) LJI).getHybridContext().containerId;
            VNU lynxContext2 = this.mContext;
            o.LJFF(lynxContext2, "lynxContext");
            VNS LJI2 = lynxContext2.LJI();
            if (LJI2 != null) {
                String str2 = ((C60726NsQ) LJI2).getHybridContext().url;
                VNU lynxContext3 = this.mContext;
                o.LJFF(lynxContext3, "lynxContext");
                VNS LJI3 = lynxContext3.LJI();
                if (LJI3 != null) {
                    FD5.LJIIIZ(str, "lynx_skeleton", "use", null, str2, ((C60726NsQ) LJI3).getHybridContext().bid, null, null, 200);
                    OJU oju = this.LJLIL;
                    if (oju != null) {
                        return oju;
                    }
                    o.LJIJI("lynxSkeletonLoading");
                    throw null;
                }
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
    }

    @VPD(name = "duration")
    public void setDuration(int i) {
        C39048FUe.LIZIZ(C39048FUe.LIZIZ, KMP.LJ("duration: ", i), null, "LynxSkeletonUI", 2);
        OJU oju = this.LJLIL;
        if (oju != null) {
            oju.setDuration(Long.valueOf(i));
        } else {
            o.LJIJI("lynxSkeletonLoading");
            throw null;
        }
    }

    @VPD(name = "fromalpha")
    public void setFromAlpha(float f) {
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fromalpha: ");
        LIZ.append(f);
        C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ), null, "LynxSkeletonUI", 2);
        OJU oju = this.LJLIL;
        if (oju != null) {
            oju.setFromAlpha(Float.valueOf(f));
        } else {
            o.LJIJI("lynxSkeletonLoading");
            throw null;
        }
    }

    @VPD(name = "hasanimation")
    public void setHasAnimation(boolean z) {
        C39048FUe.LIZIZ(C39048FUe.LIZIZ, Q7L.LIZJ("hasanimation: ", z), null, "LynxSkeletonUI", 2);
        OJU oju = this.LJLIL;
        if (oju != null) {
            oju.setHasAnimation(z);
        } else {
            o.LJIJI("lynxSkeletonLoading");
            throw null;
        }
    }

    @VPD(name = "src")
    public void setSrc(String src) {
        o.LJIIJ(src, "src");
        C39048FUe.LIZIZ(C39048FUe.LIZIZ, i0.LJFF("src: ", src), null, "LynxSkeletonUI", 2);
        OJU oju = this.LJLIL;
        if (oju != null) {
            oju.setSrc(src);
        } else {
            o.LJIJI("lynxSkeletonLoading");
            throw null;
        }
    }

    @VPD(name = "toalpha")
    public void setToAlpha(float f) {
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("toalpha: ");
        LIZ.append(f);
        C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ), null, "LynxSkeletonUI", 2);
        OJU oju = this.LJLIL;
        if (oju != null) {
            oju.setToAlpha(Float.valueOf(f));
        } else {
            o.LJIJI("lynxSkeletonLoading");
            throw null;
        }
    }
}
