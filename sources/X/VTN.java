package X;

import android.content.Context;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VTN extends VTL<VTS> {
    @Override // X.VTL
    public int getLayoutIntRes() {
        return R.layout.duc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VTN(Context context) {
        super(context);
        o.LJIIJ(context, "context");
    }

    @Override // X.VTL
    public void setScrollEnable(boolean z) {
        setMScrollEnable(z);
        ViewGroup.LayoutParams layoutParams = getMCollapsingToolbarLayout().getLayoutParams();
        if (layoutParams instanceof C80218Ve2) {
            if (!z) {
                ((C80218Ve2) layoutParams).LIZ = 0;
            } else {
                ((C80218Ve2) layoutParams).LIZ = getMInitScrollFlag();
            }
            getMCollapsingToolbarLayout().setLayoutParams(layoutParams);
        }
    }
}
