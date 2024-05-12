package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WVt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82405WVt extends WM7 {
    public LinearLayout LJLIL;
    public TGH LJLILLLLZI;
    public View LJLJI;

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.le, container, false);
        this.LJLIL = (LinearLayout) LLLLIILL.findViewById(R.id.kgm);
        return LLLLIILL;
    }
}
