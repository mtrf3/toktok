package X;

import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.9kO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245569kO extends FrameLayout {
    public InterfaceC65784Pro<C76800UCe> LJLIL;

    public final InterfaceC65784Pro<C76800UCe> getBlock() {
        return this.LJLIL;
    }

    public final void setBlock(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
    }

    public final void setCallback(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C245569kO(Context context, EnumC136925Yy enumC136925Yy) {
        super(context, null, 0);
        new LinkedHashMap();
        C16880lQ.LLLZIIL(R.layout.am_, C16880lQ.LLZIL(context), this);
        C116414hZ c116414hZ = (C116414hZ) findViewById(R.id.g8_);
        SY4 sy4 = (SY4) findViewById(R.id.axz);
        if (c116414hZ != null) {
            c116414hZ.setVisibility(0);
            c116414hZ.LIZ(R.raw.icon_spinner_normal, -65536);
        }
        if (sy4 == null) {
            return;
        }
        sy4.setBackground(C04270Et.LIZIZ(getContext(), R.drawable.a23));
        sy4.setTextColor(C04330Ez.LIZIZ(getContext(), R.color.c8));
        sy4.setBackground(C04270Et.LIZIZ(getContext(), R.drawable.a5_));
        sy4.setTextColor(C04330Ez.LIZIZ(getContext(), R.color.acm));
        C16880lQ.LJJIZ(sy4, new ACListenerS24S0100000_4(this, 195));
    }
}
