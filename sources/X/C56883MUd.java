package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.MUd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56883MUd implements InterfaceC56825MRx {
    @Override // X.InterfaceC56825MRx
    public final void LIZ(C56890MUk c56890MUk) {
    }

    @Override // X.InterfaceC56825MRx
    public final void LIZIZ(C56890MUk c56890MUk) {
    }

    @Override // X.InterfaceC56825MRx
    public final boolean LIZJ(C56889MUj c56889MUj) {
        View view;
        AbstractViewOnClickListenerC56920MVo abstractViewOnClickListenerC56920MVo;
        MVZ mvz = c56889MUj.LJIIJ;
        if (mvz != null && (view = mvz.itemView) != null && (abstractViewOnClickListenerC56920MVo = (AbstractViewOnClickListenerC56920MVo) view.findViewById(R.id.h57)) != null) {
            return abstractViewOnClickListenerC56920MVo.LIZLLL(c56889MUj.LIZIZ);
        }
        return false;
    }
}
