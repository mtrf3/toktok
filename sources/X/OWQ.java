package X;

import android.content.Context;
import android.graphics.PorterDuff;

/* loaded from: classes11.dex */
public final class OWQ extends C02Z {
    public InterfaceC88473Ynt<? super String, ? super java.util.Map<String, ? extends Object>, ? super OWQ, C76800UCe> LJLILLLLZI;

    public OWQ(Context context) {
        super(context, null);
        getThumb().clearColorFilter();
        getProgressDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        getThumb().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        setOnSeekBarChangeListener(new OWP(this));
    }

    public final void setStateReporter(InterfaceC88473Ynt<? super String, ? super java.util.Map<String, ? extends Object>, ? super OWQ, C76800UCe> interfaceC88473Ynt) {
        this.LJLILLLLZI = interfaceC88473Ynt;
    }

    public final void LIZ(String str, java.util.Map<String, ? extends Object> map) {
        InterfaceC88473Ynt<? super String, ? super java.util.Map<String, ? extends Object>, ? super OWQ, C76800UCe> interfaceC88473Ynt = this.LJLILLLLZI;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(str, map, this);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
