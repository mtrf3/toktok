package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew;
import com.zhiliaoapp.musically.R;

/* renamed from: X.KCx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51339KCx extends KD0 {
    public final /* synthetic */ C51341KCz LIZJ;

    @Override // X.KD0
    public final RecyclerView.ViewHolder LIZIZ() {
        View LIZ;
        C51341KCz c51341KCz = this.LIZJ;
        InterfaceC51343KDb interfaceC51343KDb = c51341KCz.LIZIZ;
        ViewGroup viewGroup = c51341KCz.LIZ;
        C51323KCh c51323KCh = (C51323KCh) interfaceC51343KDb;
        String str = c51323KCh.LJLJI;
        AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew = c51323KCh.LJLJJI;
        K5C k5c = c51323KCh.LJLJLJ;
        K75 k75 = c51323KCh.LJLJL;
        if (K7B.LJLILLLLZI.LJJII()) {
            LIZ = C50365Jph.LIZIZ(R.layout.ch8, viewGroup);
        } else {
            LIZ = C28289B8j.LIZ(viewGroup, R.layout.ch8, viewGroup, false);
        }
        return new C51325KCj(LIZ, k75, abstractSearchIntermediateFragmentNew, k5c, str);
    }

    public C51339KCx(C51341KCz c51341KCz) {
        this.LIZJ = c51341KCz;
    }
}
