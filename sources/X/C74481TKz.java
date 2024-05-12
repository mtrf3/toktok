package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TKz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74481TKz extends TL5<Effect> implements TL0 {
    public boolean LJJIJIL;
    public final LifecycleOwner LJJIJL;
    public final int LJJIJLIJ;
    public final boolean LJJIL;

    @Override // X.TL0
    public final void LIZIZ() {
        if (!this.LJJIL || this.LJJIJIL) {
            return;
        }
        this.LJJIJIL = true;
        LJIILJJIL(this.LJJIJL);
    }

    @Override // X.TL5
    public final AbstractC030309z LJJIII() {
        int LJ = C81184Vtc.LJ(this.LJJIFFI);
        final float LIZIZ = ((LJ / this.LJJIJLIJ) - C74275TDb.LIZIZ(this.LJJIFFI, 57.0f)) / 2;
        return new AbstractC030309z(LIZIZ) { // from class: X.4X3
            public final float LJLIL;

            {
                this.LJLIL = LIZIZ;
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
                T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
                rect.left = (int) Math.max(0.0f, this.LJLIL);
                rect.right = (int) Math.max(0.0f, this.LJLIL);
            }
        };
    }

    @Override // X.TL5
    public final void LJIILL() {
        super.LJIILL();
        if (this.LJJIL) {
            TLG<TEN> tlg = this.LIZLLL;
            if (tlg != null) {
                tlg.setState(TEN.LOADING);
            } else {
                o.LJIJI("pageStateView");
                throw null;
            }
        }
    }

    @Override // X.TL5, X.InterfaceC74488TLg
    public final void destroy() {
        super.destroy();
        this.LJJIJIL = false;
    }

    @Override // X.TL5
    public final LifecycleOwner LJIIJ() {
        return this.LJJIJL;
    }

    @Override // X.TL5
    public final int LJIIJJI() {
        return this.LJJIJLIJ;
    }

    @Override // X.TL5
    public final RecyclerView.ViewHolder LJIIIZ(ViewGroup parent, InterfaceC88473Ynt clickListener) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(clickListener, "clickListener");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        int LIZIZ = (int) C74275TDb.LIZIZ(context, 57.0f);
        int LIZIZ2 = (int) C74275TDb.LIZIZ(context, 75.0f);
        Float valueOf = Float.valueOf(8.0f);
        OSZ LJIIJJI = C78999UzT.LJIIJJI(context, 40.0f, 40.0f, LIZIZ, LIZIZ2, null, valueOf, null, valueOf);
        return new TL2((View) LJIIJJI.getFirst(), (TDE) LJIIJJI.getSecond(), (IDqS436S0100000_12) clickListener);
    }

    @Override // X.TL5
    public final void LJII(RecyclerView.ViewHolder holder, int i, Effect sticker, TEA state, Integer num) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(sticker, "sticker");
        o.LJIIIZ(state, "state");
        if (!(holder instanceof TL2)) {
            holder = null;
        }
        TL1 tl1 = (TL1) holder;
        if (tl1 != null) {
            tl1.L(sticker, i, state, num);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74481TKz(Context context, LifecycleOwner lifecycle, TL9 tl9, TLD tld, boolean z, boolean z2, InterfaceC88472Yns interfaceC88472Yns) {
        super(context, lifecycle, tl9, tld, (ViewGroup) null, 5, false, true, true, z2, (InterfaceC88472Yns<? super TL7, C76800UCe>) interfaceC88472Yns);
        o.LJIIIZ(lifecycle, "lifecycle");
        this.LJJIJL = lifecycle;
        this.LJJIJLIJ = 5;
        this.LJJIL = z;
    }
}
