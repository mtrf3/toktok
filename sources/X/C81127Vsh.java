package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.Vsh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81127Vsh extends AbstractC38633FEf {
    @Override // X.AbstractC38633FEf
    public final View LJIJI(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @Override // X.AbstractC38633FEf
    public final View LJIJJLI(Context context, AttributeSet attributeSet) {
        return new ImageView(context, attributeSet);
    }

    @Override // X.AbstractC38633FEf
    public final boolean LJIJ(Context context) {
        if (!AbstractC38635FEh.LJIILLIIL(context)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC38633FEf
    public final View LJIJJ(Context context, AttributeSet attributeSet) {
        View onCreateView;
        o.LJIIJ(context, "context");
        Activity LIZJ = C109434Rf.LIZJ(context);
        if (LIZJ != null) {
            LayoutInflater LLZIL = C16880lQ.LLZIL(context);
            LayoutInflater.Factory factory = LLZIL.getFactory();
            LayoutInflater.Factory2 factory2 = LLZIL.getFactory2();
            if (factory2 == null ? factory == null || (onCreateView = factory.onCreateView("ImageView", context, attributeSet)) == null : (onCreateView = factory2.onCreateView(null, "ImageView", context, attributeSet)) == null) {
                onCreateView = LIZJ.onCreateView(null, "ImageView", context, attributeSet);
                if (onCreateView == null) {
                    throw new IllegalStateException(i0.LJFF("Cannot create view : ", "ImageView"));
                }
            }
            return onCreateView;
        }
        throw new IllegalStateException("context must be an Activity.");
    }
}
