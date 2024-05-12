package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.KCu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51336KCu extends KD0 {
    public final /* synthetic */ C51341KCz LIZJ;

    @Override // X.KD0
    public final RecyclerView.ViewHolder LIZIZ() {
        View itemView;
        C51341KCz c51341KCz = this.LIZJ;
        InterfaceC51343KDb interfaceC51343KDb = c51341KCz.LIZIZ;
        ViewGroup parent = c51341KCz.LIZ;
        C51323KCh c51323KCh = (C51323KCh) interfaceC51343KDb;
        String str = c51323KCh.LJLJI;
        AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew = c51323KCh.LJLJJI;
        K5C k5c = c51323KCh.LJLJLJ;
        K75 k75 = c51323KCh.LJLJL;
        o.LJIIIZ(parent, "parent");
        if (K7B.LJLILLLLZI.LJJII()) {
            itemView = C50365Jph.LIZIZ(R.layout.ch6, parent);
        } else {
            itemView = C28289B8j.LIZ(parent, R.layout.ch6, parent, false);
        }
        o.LJIIIIZZ(itemView, "itemView");
        return new C51327KCl(itemView, k75, abstractSearchIntermediateFragmentNew, k5c, str);
    }

    public C51336KCu(C51341KCz c51341KCz) {
        this.LIZJ = c51341KCz;
    }
}
