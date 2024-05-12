package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WlX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83231WlX implements InterfaceC83197Wkz {
    public final ViewGroup LIZ;
    public final C80371VgV LIZIZ;
    public final View LIZJ;
    public final C83232WlY LIZLLL;
    public final C83248Wlo LJ;

    @Override // X.InterfaceC83197Wkz
    public final void LIZ() {
        if (this.LIZLLL.LIZLLL && !LIZLLL()) {
            C80371VgV swEnableBeauty = this.LIZIZ;
            o.LJIIIIZZ(swEnableBeauty, "swEnableBeauty");
            swEnableBeauty.setChecked(true);
        }
    }

    @Override // X.InterfaceC83197Wkz
    public final boolean LIZIZ() {
        return this.LIZLLL.LIZLLL;
    }

    @Override // X.InterfaceC83197Wkz
    public final void LIZJ() {
        if (this.LIZLLL.LIZLLL) {
            C80371VgV swEnableBeauty = this.LIZIZ;
            o.LJIIIIZZ(swEnableBeauty, "swEnableBeauty");
            if (!swEnableBeauty.LJLJLJ) {
                C80371VgV swEnableBeauty2 = this.LIZIZ;
                o.LJIIIIZZ(swEnableBeauty2, "swEnableBeauty");
                swEnableBeauty2.setChecked(true);
            }
        }
    }

    @Override // X.InterfaceC83197Wkz
    public final boolean LIZLLL() {
        C80371VgV swEnableBeauty = this.LIZIZ;
        o.LJIIIIZZ(swEnableBeauty, "swEnableBeauty");
        return swEnableBeauty.LJLJLJ;
    }

    public C83231WlX(Context context, View parent, C83232WlY viewConfig, C83248Wlo business) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(viewConfig, "viewConfig");
        o.LJIIIZ(business, "business");
        this.LIZJ = parent;
        this.LIZLLL = viewConfig;
        this.LJ = business;
        this.LIZ = (ViewGroup) parent.findViewById(R.id.dd2);
        this.LIZIZ = (C80371VgV) parent.findViewById(R.id.d_e);
    }
}
