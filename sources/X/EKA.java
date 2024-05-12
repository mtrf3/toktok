package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes7.dex */
public final class EKA {
    public static boolean LIZ;

    public static final void LIZ(Activity activity) {
        LayoutInflater layoutInflater;
        if (!((Boolean) C34883DmZ.LIZ.getValue()).booleanValue()) {
            System.out.println("OptimizedRelativeLayout opt not enable, just return!");
            return;
        }
        System.out.println("OptimizedRelativeLayout opt is enable!!!");
        if (activity == null || (layoutInflater = activity.getLayoutInflater()) == null || LIZ) {
            return;
        }
        LIZ = true;
        layoutInflater.setFactory2(new LayoutInflater.Factory2() { // from class: X.0kl
            public final InterfaceC16490kn LJLIL = WFJ.LIZ;

            public final String toString() {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LayoutInflaterFactory2C16470kl.class.getName());
                LIZ2.append("{");
                LIZ2.append(this.LJLIL);
                LIZ2.append("}");
                return X1D.LIZIZ(LIZ2);
            }

            @Override // android.view.LayoutInflater.Factory
            public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
                return this.LJLIL.onCreateView(str, context, attributeSet);
            }

            @Override // android.view.LayoutInflater.Factory2
            public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
                return this.LJLIL.onCreateView(str, context, attributeSet);
            }
        });
    }
}
