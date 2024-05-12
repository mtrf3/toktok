package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GK9 extends WM7 {
    public C223338pd LJLIL;

    public final boolean LLJILJIL() {
        C223338pd c223338pd = this.LJLIL;
        if (c223338pd == null || c223338pd.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.g94);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.loading_view)");
        this.LJLIL = (C223338pd) requireViewById;
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.blz, viewGroup, false, "inflater.inflate(R.layou…m_edit, container, false)");
    }
}
