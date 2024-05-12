package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NuJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60843NuJ implements NZ1 {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 21));
    public final /* synthetic */ SparkActivity LJLILLLLZI;

    @Override // X.NZ1
    public final int LJJ() {
        return R.id.pa;
    }

    @Override // X.NZ1
    public final ViewGroup LIZIZ() {
        View findViewById = ((View) this.LJLIL.getValue()).findViewById(R.id.l_7);
        o.LJFF(findViewById, "rootView.findViewById(R.id.title_bar_container)");
        return (ViewGroup) findViewById;
    }

    @Override // X.NZ1
    public final ViewGroup LIZJ() {
        return (ViewGroup) ((View) this.LJLIL.getValue()).findViewById(R.id.iae);
    }

    public C60843NuJ(SparkActivity sparkActivity) {
        this.LJLILLLLZI = sparkActivity;
    }

    @Override // X.NZ1
    public final View LIZLLL(Context context) {
        o.LJIIJ(context, "context");
        View rootView = (View) this.LJLIL.getValue();
        o.LJFF(rootView, "rootView");
        return rootView;
    }
}
