package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CUK extends CUF<CQJ, CSG<CQJ>> {
    @Override // X.CUF
    public final Drawable f0() {
        if (!this.LLD) {
            return C04270Et.LIZIZ(this.itemView.getContext(), R.drawable.cj4);
        }
        return null;
    }

    public CUK(View view, CQQ cqq) {
        super(view, cqq, true);
    }

    @Override // X.CUF
    public final boolean h0(CSG<CQJ> csg, List payloads) {
        CSG<CQJ> pinnedPublicScreenMessageModel = csg;
        o.LJIIIZ(pinnedPublicScreenMessageModel, "pinnedPublicScreenMessageModel");
        o.LJIIIZ(payloads, "payloads");
        boolean z = false;
        for (Object obj : payloads) {
            if ((obj instanceof CU5) && pinnedPublicScreenMessageModel.LJIIL) {
                z = true;
            }
            if ((obj instanceof CU6) && pinnedPublicScreenMessageModel.LJIIL) {
                c0(pinnedPublicScreenMessageModel);
                z = true;
            }
        }
        return z;
    }

    public CUK(View view, CQQ cqq, int i) {
        super(view, cqq, false);
    }
}
