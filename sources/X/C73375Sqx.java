package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Sqx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73375Sqx {
    public final C73305Spp LIZ;
    public final RecyclerView LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final ActivityC45651qj LJ;
    public final LifecycleOwner LJFF;
    public final C85193Vz LJI;

    public final void LIZ(boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        C73306Spq c73306Spq;
        RecyclerView recyclerView = this.LIZIZ;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        recyclerView.setVisibility(i);
        View view = this.LIZJ;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        View view2 = this.LIZLLL;
        if (z || z2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        if (z) {
            this.LIZ.setVisibility(8);
            return;
        }
        if (z2) {
            c73306Spq = new C73306Spq();
            String string = this.LJ.getString(R.string.tc6);
            o.LJIIIIZZ(string, "activity.getString(R.string.uikit_search_empty)");
            c73306Spq.LJFF = string;
            String string2 = this.LJ.getString(R.string.tc7);
            o.LJIIIIZZ(string2, "activity.getString(R.str….uikit_search_empty_desc)");
            c73306Spq.LJI = string2;
            Drawable LIZIZ = C04270Et.LIZIZ(this.LJ, R.drawable.bkq);
            c73306Spq.LIZJ = 1;
            c73306Spq.LIZ = LIZIZ;
        } else {
            c73306Spq = new C73306Spq();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_person;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            c73306Spq.LJFF = C03660Ck.LIZ(this.LJ, R.string.r7a, "activity.resources.getSt…dar_pp_invite_emptystate)");
            c73306Spq.LJI = C03660Ck.LIZ(this.LJ, R.string.r7b, "activity.resources.getSt…p_invite_emptystate_desc)");
        }
        this.LIZ.setStatus(c73306Spq);
        this.LIZ.setVisibility(0);
    }

    public C73375Sqx(C73305Spp c73305Spp, RecyclerView recyclerView, View view, View view2, ActivityC45651qj activity, DialogC73377Sqz lifecycleOwner, C85193Vz viewModel) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(viewModel, "viewModel");
        this.LIZ = c73305Spp;
        this.LIZIZ = recyclerView;
        this.LIZJ = view;
        this.LIZLLL = view2;
        this.LJ = activity;
        this.LJFF = lifecycleOwner;
        this.LJI = viewModel;
    }
}
