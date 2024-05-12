package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;

/* loaded from: classes10.dex */
public final class MJV implements Observer<C50764Jw8<TypeWords>> {
    public final /* synthetic */ MJT LJLIL;

    public MJV(MJT mjt) {
        this.LJLIL = mjt;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C50764Jw8<TypeWords> c50764Jw8) {
        C50764Jw8<TypeWords> c50764Jw82 = c50764Jw8;
        MJU LJI = this.LJLIL.LJI();
        if (LJI != null) {
            LJI.LIZIZ(c50764Jw82);
        }
    }
}
