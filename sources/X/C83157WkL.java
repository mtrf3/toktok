package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import kotlin.jvm.internal.o;

/* renamed from: X.WkL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83157WkL extends C83148WkC {
    public final String LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83157WkL(String uid) {
        super("");
        o.LJIIIZ(uid, "uid");
        this.LIZJ = uid;
    }

    @Override // X.C83148WkC, X.InterfaceC83159WkN
    public final float LJIILIIL(ComposerBeauty composerBeauty, ILU gender, String str, float f) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        o.LJIIIZ(gender, "gender");
        return C83148WkC.LIZIZ.getFloat(C83161WkP.LIZJ(this.LIZJ, this.LIZ, gender.getFlag(), composerBeauty.getEffect().getResourceId(), str), f);
    }

    @Override // X.C83148WkC, X.InterfaceC83159WkN
    public final void LJIILL(ComposerBeauty composerBeauty, ILU gender, String str, float f) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        o.LJIIIZ(gender, "gender");
        String LIZJ = C83161WkP.LIZJ(this.LIZJ, this.LIZ, gender.getFlag(), composerBeauty.getEffect().getResourceId(), str);
        C83148WkC.LIZIZ.storeFloat(LIZJ, f);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("saveBeautyTagValue key: ");
        LIZ.append(LIZJ);
        LIZ.append(" val: ");
        LIZ.append(f);
        C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ));
    }
}
