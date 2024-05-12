package com.ss.android.ugc.aweme.image;

import X.AbstractC81686W4c;
import X.C61092NyK;
import X.C61093NyL;
import X.C81706W4w;
import X.EF7;
import X.W4P;
import X.W52;
import com.fackbook.drawee.IDraweeConfigOutService;
import java.util.HashSet;

/* loaded from: classes11.dex */
public class DraweeConfigOutService implements IDraweeConfigOutService {
    @Override // com.fackbook.drawee.IDraweeConfigOutService
    public final W4P<? extends AbstractC81686W4c<?, ?, ?, ?>> LIZ() {
        C61092NyK c61092NyK = new C61092NyK();
        W52 w52 = new W52();
        if (c61092NyK.LIZ == null) {
            c61092NyK.LIZ = new HashSet();
        }
        ((HashSet) c61092NyK.LIZ).add(w52);
        return new C81706W4w(EF7.LIZIZ(), new C61093NyL(c61092NyK));
    }
}
