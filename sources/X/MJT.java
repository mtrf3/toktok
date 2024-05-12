package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.legacy.network.viewmodel.SuggestWordsViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class MJT implements InterfaceC84755XOd {
    public final MJO LIZ;
    public boolean LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;

    @Override // X.InterfaceC84755XOd
    public final void onCreate() {
    }

    @Override // X.InterfaceC84755XOd
    public final void onDestroy() {
    }

    @Override // X.InterfaceC84755XOd
    public final void LJ() {
        SuggestWordsViewModel suggestWordsViewModel;
        if (this.LIZIZ && (suggestWordsViewModel = (SuggestWordsViewModel) this.LIZLLL.getValue()) != null) {
            suggestWordsViewModel.gv0((KO1) this.LJ.getValue(), new MJS(this));
        }
        MJU LJI = LJI();
        if (LJI != null) {
            LJI.LIZIZ = true;
        }
    }

    public final MJU LJI() {
        return (MJU) this.LJFF.getValue();
    }

    @Override // X.InterfaceC84755XOd
    public final void LIZ() {
        MJU LJI = LJI();
        if (LJI != null) {
            LJI.LIZLLL();
        }
    }

    @Override // X.InterfaceC84755XOd
    public final void LIZIZ() {
        MJU LJI = LJI();
        if (LJI != null) {
            LJI.LIZJ();
        }
    }

    @Override // X.InterfaceC84755XOd
    public final void LIZJ() {
        MJU LJI = LJI();
        if (LJI != null) {
            LJI.LJI();
        }
    }

    @Override // X.InterfaceC84755XOd
    public final void LIZLLL() {
        MJU LJI = LJI();
        if (LJI != null) {
            LJI.LJFF();
        }
    }

    @Override // X.InterfaceC84755XOd
    public final void LJFF() {
        MJU LJI = LJI();
        if (LJI != null) {
            LJI.LJ();
        }
    }

    @Override // X.InterfaceC84755XOd
    public final void onPause() {
        MJU LJI = LJI();
        if (LJI != null) {
            LJI.LIZIZ = false;
        }
    }

    @Override // X.InterfaceC84755XOd
    public final void onResume() {
        MJU LJI = LJI();
        if (LJI != null) {
            LJI.LIZIZ = true;
        }
    }

    public MJT(MJO mjo) {
        this.LIZ = mjo;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 12));
        this.LIZJ = LIZIZ;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS158S0100000_8(this, 15));
        this.LIZLLL = LIZIZ2;
        C62822Ol8 LIZIZ3 = C221108m2.LIZIZ(KO2.LJLIL);
        this.LJ = LIZIZ3;
        this.LJFF = C221108m2.LIZIZ(new AqS159S0100000_9(this, 13));
        C62822Ol8 LIZIZ4 = C221108m2.LIZIZ(MJZ.LJLIL);
        C1AU c1au = (C1AU) LIZIZ.getValue();
        if (c1au != null) {
            ((C84754XOc) LIZIZ4.getValue()).LIZJ(new WeakReference<>(c1au));
            C84754XOc c84754XOc = (C84754XOc) LIZIZ4.getValue();
            c84754XOc.getClass();
            ((ArrayList) c84754XOc.LIZ).add(this);
            MJU LJI = LJI();
            if (LJI != null) {
                LJI.LIZIZ = true;
            }
            SuggestWordsViewModel suggestWordsViewModel = (SuggestWordsViewModel) LIZIZ2.getValue();
            if (suggestWordsViewModel != null) {
                ((LiveData) suggestWordsViewModel.LJLIL.getValue()).observe(c1au, new MJV(this));
                suggestWordsViewModel.gv0((KO1) LIZIZ3.getValue(), new MJS(this));
            }
        }
    }
}
