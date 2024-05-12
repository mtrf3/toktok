package X;

import Y.AObserverS72S0100000_4;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusViewModel;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A85 {
    public final View LIZ;
    public final int LIZIZ;
    public final ActivityC45651qj LIZJ;
    public final String LIZLLL;
    public final C25851ACp LJ;
    public final String LJFF;
    public final C62822Ol8 LJI;
    public List<? extends AG6<?>> LJII;

    public final CreatorPlusViewModel LIZ() {
        return (CreatorPlusViewModel) this.LJI.getValue();
    }

    public final void LIZIZ() {
        LIZ().hv0().observe(this.LIZJ, new AObserverS72S0100000_4(this, 45));
        ((LiveData) LIZ().LJLJI.getValue()).observe(this.LIZJ, new AObserverS72S0100000_4(this, 46));
    }

    public final LiveData<Boolean> LIZJ() {
        LiveData<Boolean> map = Transformations.map(LIZ().hv0(), A86.LJLIL);
        o.LJIIIIZZ(map, "map(viewModel.creatorPlu…res.isNullOrEmpty()\n    }");
        return map;
    }

    public A85(ConstraintLayout constraintLayout, int i, ActivityC45651qj activity, String str, C25851ACp unitManager, String mProcessId) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(unitManager, "unitManager");
        o.LJIIIZ(mProcessId, "mProcessId");
        this.LIZ = constraintLayout;
        this.LIZIZ = i;
        this.LIZJ = activity;
        this.LIZLLL = str;
        this.LJ = unitManager;
        this.LJFF = mProcessId;
        this.LJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1211));
        this.LJII = C61878OQg.INSTANCE;
        LIZ().gv0();
    }
}
