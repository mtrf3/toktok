package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KBT {
    public static C51320KCe LIZ(ViewGroup parent, String str, EcAbstractSearchIntermediateFragmentNew ecAbstractSearchIntermediateFragmentNew, K75 k75, C51261K9x c51261K9x) {
        View itemView;
        InterfaceC51123K4p inflater;
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        InterfaceC45601Hv3 LJ = C78840Uwu.LJ(context);
        if (LJ == null || (inflater = LJ.getInflater()) == null || (itemView = inflater.LIZ(R.layout.ap1)) == null) {
            itemView = C28289B8j.LIZ(parent, R.layout.ap1, parent, false);
        }
        o.LJIIIIZZ(itemView, "itemView");
        return new C51320KCe(itemView, str, ecAbstractSearchIntermediateFragmentNew, k75, c51261K9x);
    }
}
