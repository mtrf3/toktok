package X;

import Y.AObserverS64S0101000_14;
import Y.AObserverS75S0200000_12;
import Y.IDrS50S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes13.dex */
public final class T4A implements InterfaceC83331Wn9 {
    public final RecyclerView LIZ;
    public final T45 LIZIZ;
    public final ActivityC45651qj LIZJ;
    public final LifecycleOwner LIZLLL;
    public final InterfaceC64335PMt LJ;
    public final LinearLayoutManager LJFF;
    public List<Effect> LJI;
    public final TKR LJII;
    public final RelativeLayout LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    @Override // X.InterfaceC83331Wn9
    public final void LIZ() {
        RelativeLayout relativeLayout;
        LJ(true);
        if (this.LJII.LLIIL.invoke().booleanValue() && (relativeLayout = this.LJIIIIZZ) != null) {
            T4D.LIZ(this.LIZJ, relativeLayout);
        }
    }

    @Override // X.InterfaceC83331Wn9
    public final void LIZLLL() {
        throw null;
    }

    @Override // X.InterfaceC83331Wn9
    public final void hideStickerView() {
        throw null;
    }

    public final void LJ(boolean z) {
        if (z) {
            this.LIZ.setVisibility(0);
            return;
        }
        if (this.LJII.LLIIIJ && this.LJIIIIZZ != null && this.LIZ.getVisibility() == 0) {
            this.LJIIIIZZ.setBackground(null);
        }
        this.LIZ.setVisibility(8);
    }

    public T4A(ActivityC45651qj activityC45651qj, View view, TEZ tez, TEF tef, T46 t46, TKR tkr, LifecycleOwner lifecycleOwner) {
        C64328PMm c64328PMm = C64328PMm.LJLILLLLZI;
        this.LJIIJ = true;
        this.LIZJ = activityC45651qj;
        this.LIZLLL = lifecycleOwner;
        RecyclerView recyclerView = (RecyclerView) ((ViewStubCompat) view.findViewById(R.id.kml)).LIZ();
        this.LIZ = recyclerView;
        this.LJ = c64328PMm;
        T45 t45 = new T45(tez, tef, t46, tkr);
        this.LIZIZ = t45;
        this.LJII = tkr;
        if (tkr.LLIIIJ && !tkr.LLIILZL) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.b3l);
            this.LJIIIIZZ = relativeLayout;
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.height = (int) C74275TDb.LIZ(200.0f);
            relativeLayout.setLayoutParams(layoutParams);
        }
        recyclerView.LJIIJJI(new IDrS50S0100000_12(this, 20));
        tez.LJIIIIZZ().LJI().observe(lifecycleOwner, new AObserverS64S0101000_14(1, this, 10));
        t46.Sg0().observe(lifecycleOwner, new AObserverS75S0200000_12(this, t46, 48));
        t46.qK().observe(lifecycleOwner, new AObserverS64S0101000_14(2, this, 0));
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.LJFF = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(t45);
        if (tkr.LLIIIJ) {
            recyclerView.LJII(new C208828Hm(true, tkr.LJLLILLLL, true), -1);
        }
    }
}
