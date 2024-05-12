package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NV2 implements NZ1 {
    public final /* synthetic */ NV3 LJLIL;

    @Override // X.NZ1
    public final ViewGroup LIZIZ() {
        return this.LJLIL.LIZIZ();
    }

    @Override // X.NZ1
    public final ViewGroup LIZJ() {
        this.LJLIL.LIZJ();
        return null;
    }

    @Override // X.NZ1
    public final int LJJ() {
        this.LJLIL.LIZ();
        return R.id.k8p;
    }

    public NV2(NV3 nv3) {
        this.LJLIL = nv3;
    }

    @Override // X.NZ1
    public final View LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        return this.LJLIL.LIZLLL(context);
    }
}
