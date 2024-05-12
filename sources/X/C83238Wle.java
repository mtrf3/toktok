package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Wle, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83238Wle implements InterfaceC83293WmX {
    public final C80700Vlo LIZ;
    public final C8HP LIZIZ;
    public final Context LIZJ;
    public final View LIZLLL;
    public final C83232WlY LJ;
    public final C83252Wls LJFF;

    @Override // X.InterfaceC83293WmX
    public final void LIZ() {
        this.LIZ.requestLayout();
    }

    public C83238Wle(Context context, View parent, C83232WlY viewConfig, C83252Wls beautyListBusiness) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(viewConfig, "viewConfig");
        o.LJIIIZ(beautyListBusiness, "beautyListBusiness");
        this.LIZJ = context;
        this.LIZLLL = parent;
        this.LJ = viewConfig;
        this.LJFF = beautyListBusiness;
        this.LIZ = (C80700Vlo) parent.findViewById(R.id.lba);
        this.LIZIZ = (C8HP) parent.findViewById(R.id.n1z);
    }
}
