package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Lle, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55210Lle extends AbstractC65781Prl implements InterfaceC88472Yns<FVC, View> {
    public static final C55210Lle LJLIL = new C55210Lle();

    public C55210Lle() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final View invoke(FVC fvc) {
        FVC it = fvc;
        o.LJIIIZ(it, "it");
        LayoutInflater layoutInflater = it.LIZJ;
        ViewGroup viewGroup = it.LIZ;
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "parent", layoutInflater, R.layout.bql, viewGroup, false, "inflater.inflate(R.layou…er_layout, parent, false)");
    }
}
