package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ntd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60801Ntd implements InterfaceC60813Ntp {
    public View LIZ;

    @Override // X.InterfaceC60813Ntp
    public final ViewGroup LIZ() {
        View view = this.LIZ;
        if (view != null) {
            return (ViewGroup) view.findViewById(R.id.dm6);
        }
        o.LJIJI("rootView");
        throw null;
    }

    @Override // X.InterfaceC60813Ntp
    public final ViewGroup LIZIZ() {
        View view = this.LIZ;
        if (view != null) {
            View findViewById = view.findViewById(R.id.dmp);
            o.LJFF(findViewById, "rootView.findViewById<Fr…R.id.fragment_spark_view)");
            return (ViewGroup) findViewById;
        }
        o.LJIJI("rootView");
        throw null;
    }

    @Override // X.InterfaceC60813Ntp
    public final ViewGroup LIZLLL() {
        View view = this.LIZ;
        if (view != null) {
            return (ViewGroup) view.findViewById(R.id.dmr);
        }
        o.LJIJI("rootView");
        throw null;
    }

    @Override // X.InterfaceC60813Ntp
    public final View LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.LIZ == null) {
            View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.cn_, viewGroup, false);
            o.LJFF(LLLLIILL, "inflater.inflate(R.layou…layout, container, false)");
            this.LIZ = LLLLIILL;
        }
        View view = this.LIZ;
        if (view != null) {
            return view;
        }
        o.LJIJI("rootView");
        throw null;
    }
}
