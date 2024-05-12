package X;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;

/* renamed from: X.Oda, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C62354Oda extends SmartImageView {
    public InterfaceC62353OdZ LJLJLJ;

    @Override // com.bytedance.lighten.loader.SmartImageView
    public void LIZIZ() {
        setCornerRadius(KL2.LIZJ(getContext(), 2.0f));
        getHierarchy().LJIILJJIL(InterfaceC78716Uuu.LJJLIIIJILLIZJL);
    }

    public C62354Oda(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        InterfaceC62353OdZ interfaceC62353OdZ = this.LJLJLJ;
        if (interfaceC62353OdZ != null) {
            interfaceC62353OdZ.LIZ();
        }
    }

    public void setConfigurationChangedListener(InterfaceC62353OdZ interfaceC62353OdZ) {
        this.LJLJLJ = interfaceC62353OdZ;
    }

    public void setCornerRadius(float f) {
        V8L v8l = new V8L();
        v8l.LJFF(f);
        getHierarchy().LJIL(v8l);
    }

    public C62354Oda(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C62354Oda(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
