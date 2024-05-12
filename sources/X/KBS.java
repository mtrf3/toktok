package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KBS {
    public static C51321KCf LIZ(ViewGroup parent, C51261K9x c51261K9x, KDD kdd, K75 k75, EcAbstractSearchIntermediateFragmentNew ecAbstractSearchIntermediateFragmentNew, String str) {
        View itemView;
        InterfaceC51123K4p inflater;
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        InterfaceC45601Hv3 LJ = C78840Uwu.LJ(context);
        if (LJ == null || (inflater = LJ.getInflater()) == null || (itemView = inflater.LIZ(R.layout.aoz)) == null) {
            itemView = C28289B8j.LIZ(parent, R.layout.aoz, parent, false);
        }
        o.LJIIIIZZ(itemView, "itemView");
        return new C51321KCf(itemView, c51261K9x, kdd, k75, ecAbstractSearchIntermediateFragmentNew, str);
    }
}
