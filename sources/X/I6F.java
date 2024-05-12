package X;

import android.os.Bundle;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I6F extends I6N {
    public final String LJLZ;
    public final C62822Ol8 LJZ;

    @Override // X.I6N
    public final int LLJJI() {
        return R.layout.iq;
    }

    @Override // X.I6N
    public final void initView() {
        super.initView();
        View requireViewById = requireViewById(R.id.n41);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.videoEditView)");
        this.LJLJJL = (I50) requireViewById;
    }

    @Override // X.InterfaceC46100I7k
    public final String getTag() {
        return this.LJLZ;
    }

    @Override // X.I6N, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((I5Z) this.LJLLLL.getValue()).show();
        ((I6H) this.LJZ.getValue()).show();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I6F(C82622Wbi diContainer, C46084I6u parentScene) {
        super(diContainer, parentScene);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLZ = "SingleClipAdjustBottomScene";
        this.LJZ = C221108m2.LIZIZ(new AqS154S0200000_7(diContainer, this, 149));
    }
}
