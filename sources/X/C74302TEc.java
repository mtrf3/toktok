package X;

import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import kotlin.jvm.internal.o;

/* renamed from: X.TEc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74302TEc<T> implements Observer {
    public final /* synthetic */ InterfaceC74309TEj LJLIL;
    public final /* synthetic */ TEZ LJLILLLLZI;
    public final /* synthetic */ RecyclerView LJLJI;
    public final /* synthetic */ C82410WVy LJLJJI;

    public C74302TEc(InterfaceC74309TEj interfaceC74309TEj, TEZ tez, RecyclerView recyclerView, C82410WVy c82410WVy) {
        this.LJLIL = interfaceC74309TEj;
        this.LJLILLLLZI = tez;
        this.LJLJI = recyclerView;
        this.LJLJJI = c82410WVy;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String str;
        UYQ uyq;
        String str2;
        String str3;
        C74413TIj c74413TIj = (C74413TIj) obj;
        if (c74413TIj != null && c74413TIj.LIZ != 0) {
            InterfaceC74309TEj interfaceC74309TEj = this.LJLIL;
            TEZ tez = this.LJLILLLLZI;
            RecyclerView recyclerView = this.LJLJI;
            C82410WVy c82410WVy = this.LJLJJI;
            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) ORZ.LJLLLL(interfaceC74309TEj.LJ());
            if (effectCategoryModel == null || (str = effectCategoryModel.getKey()) == null) {
                str = "";
            }
            tez.LJJIJ(str);
            AbstractC029409q adapter = recyclerView.getAdapter();
            String str4 = null;
            if ((adapter instanceof UYQ) && (uyq = (UYQ) adapter) != null) {
                C0A2 layoutManager = recyclerView.getLayoutManager();
                o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (effectCategoryModel != null) {
                    str2 = effectCategoryModel.getName();
                    str3 = effectCategoryModel.getKey();
                } else {
                    str2 = null;
                    str3 = null;
                }
                InterfaceC74343TFr LJLJJL = c82410WVy.LJLJJL();
                if (effectCategoryModel != null) {
                    str4 = effectCategoryModel.getId();
                }
                uyq.LJLJLLL = new C71857SIb(linearLayoutManager, LJLJJL, tez, str3, str2, str4);
            }
        }
    }
}
