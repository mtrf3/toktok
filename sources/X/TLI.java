package X;

import Y.AObserverS75S0200000_12;
import Y.IDrS50S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class TLI extends TL5<ProviderEffect> implements InterfaceC74486TLe<ProviderEffect> {
    public String LJJIJIL;
    public int LJJIJL;
    public C42229Ghl LJJIJLIJ;
    public C42230Ghm LJJIL;
    public final LifecycleOwner LJJIZ;
    public final TLK<ProviderEffect> LJJJ;
    public final int LJJJI;
    public final boolean LJJJIL;
    public final boolean LJJJJ;
    public final boolean LJJJJI;

    @Override // X.InterfaceC74486TLe
    public final void K4() {
    }

    @Override // X.TL5
    public final void LJIILL() {
        super.LJIILL();
        if (this.LJJJJ && this.LJJJJI) {
            View view = this.LIZIZ;
            if (view != null) {
                View headerView = view.findViewById(R.id.d3s);
                o.LJIIIIZZ(headerView, "headerView");
                View findViewById = headerView.findViewById(R.id.khv);
                o.LJIIIIZZ(findViewById, "headerView.findViewById(R.id.sticker_header_text)");
                C42230Ghm c42230Ghm = new C42230Ghm(headerView, (TextView) findViewById);
                View view2 = c42230Ghm.itemView;
                o.LJIIIIZZ(view2, "holder.itemView");
                view2.setVisibility(0);
                LJJIIZI(c42230Ghm);
                this.LJJIL = c42230Ghm;
                return;
            }
            o.LJIJI("contentView");
            throw null;
        }
    }

    @Override // X.TL5
    public final AbstractC029409q<RecyclerView.ViewHolder> LJJI() {
        AbstractC029409q<RecyclerView.ViewHolder> LJJI = super.LJJI();
        if (this.LJJJJ && !this.LJJJJI) {
            C42229Ghl c42229Ghl = new C42229Ghl(this, LJJI);
            this.LJJIJLIJ = c42229Ghl;
            return c42229Ghl;
        }
        return LJJI;
    }

    @Override // X.TL5, X.InterfaceC74488TLg
    public final void destroy() {
        MutableLiveData LLZZJLIL;
        super.destroy();
        TLK<ProviderEffect> tlk = this.LJJJ;
        if (tlk != null && (LLZZJLIL = tlk.LLZZJLIL()) != null) {
            LLZZJLIL.removeObservers(this.LJJIZ);
        }
    }

    @Override // X.TL5
    public final LifecycleOwner LJIIJ() {
        return this.LJJIZ;
    }

    @Override // X.TL5
    public final int LJIIJJI() {
        return this.LJJJI;
    }

    @Override // X.InterfaceC74486TLe
    public final String LLZZJLIL() {
        return this.LJJIJIL;
    }

    @Override // X.InterfaceC74486TLe
    public final void J4(String str) {
        TLK<ProviderEffect> tlk = this.LJJJ;
        if (tlk != null) {
            tlk.J4(str);
        }
    }

    @Override // X.TL5
    public final void LJIILJJIL(LifecycleOwner lifecycle) {
        o.LJIIIZ(lifecycle, "lifecycle");
        super.LJIILJJIL(lifecycle);
        TLK<ProviderEffect> tlk = this.LJJJ;
        if (tlk != null) {
            tlk.LLZZJLIL().observe(lifecycle, new AObserverS75S0200000_12(this, lifecycle, 15));
            C73340SqO.LJIILL(tlk.ga()).observe(lifecycle, new AObserverS75S0200000_12(this, lifecycle, 16));
        }
        LJIIL().LJIIJJI(new IDrS50S0100000_12(this, 9));
    }

    @Override // X.TL5
    public final int LJIILLIIL(int i) {
        C42229Ghl c42229Ghl;
        if (this.LJJJJ && !this.LJJJJI && (c42229Ghl = this.LJJIJLIJ) != null) {
            i -= c42229Ghl.LJLZ();
        }
        return super.LJIILLIIL(i);
    }

    @Override // X.TL5
    public final View LJJIFFI(ViewGroup viewGroup) {
        if (this.LJJJJ && this.LJJJJI) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJJIFFI), R.layout.cri, viewGroup, this.LJJJIL);
            o.LJIIIIZZ(LLLLIILL, "LayoutInflater.from(cont…      root, attachToRoot)");
            return LLLLIILL;
        }
        return super.LJJIFFI(viewGroup);
    }

    @Override // X.TL5
    public final TEW LJJIIJ(View content) {
        o.LJIIIZ(content, "content");
        TEW LJJIIJ = super.LJJIIJ(content);
        LJJIIJ.LIZ(TEN.EMPTY, C42449GlJ.LJLIL);
        return LJJIIJ;
    }

    @Override // X.TL5
    public final RecyclerView LJJIIJZLJL(View content) {
        o.LJIIIZ(content, "content");
        RecyclerView LJJIIJZLJL = super.LJJIIJZLJL(content);
        if (this.LJJJI >= 4) {
            Context context = content.getContext();
            o.LJIIIIZZ(context, "content.context");
            LJJIIJZLJL.setFadingEdgeLength((int) C74275TDb.LIZIZ(context, 8.0f));
            LJJIIJZLJL.setVerticalFadingEdgeEnabled(true);
            Context context2 = content.getContext();
            o.LJIIIIZZ(context2, "content.context");
            int LIZIZ = (int) C74275TDb.LIZIZ(context2, 3.0f);
            LJJIIJZLJL.setPadding(LIZIZ, 0, LIZIZ, 0);
        }
        return LJJIIJZLJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIIZI(RecyclerView.ViewHolder holder) {
        TextView textView;
        MutableLiveData ga;
        o.LJIIIZ(holder, "holder");
        String str = null;
        if (!(holder instanceof C42230Ghm)) {
            holder = null;
        }
        C42230Ghm c42230Ghm = (C42230Ghm) holder;
        if (c42230Ghm != null && (textView = c42230Ghm.LJLIL) != null) {
            TLK<ProviderEffect> tlk = this.LJJJ;
            if (tlk != null && (ga = tlk.ga()) != null) {
                str = (String) ga.getValue();
            }
            textView.setText(str);
        }
    }

    public final void LJJIJ(int i) {
        int LLILL;
        int LLILLJJLI;
        boolean z;
        C0A2 layoutManager = LJIIL().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager == null || (LLILL = linearLayoutManager.LLILL()) > (LLILLJJLI = linearLayoutManager.LLILLJJLI())) {
            return;
        }
        while (true) {
            RecyclerView.ViewHolder LJJIZ = LJIIL().LJJIZ(LLILL);
            if (!(LJJIZ instanceof C74497TLp)) {
                LJJIZ = null;
            }
            TL1 tl1 = (TL1) LJJIZ;
            if (tl1 != null) {
                C72790ShW imageView = tl1.LJLJJI.getImageView();
                if ((imageView instanceof C72791ShX) && imageView != null) {
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    imageView.LIZ(z);
                }
            }
            if (LLILL != LLILLJJLI) {
                LLILL++;
            } else {
                return;
            }
        }
    }

    @Override // X.TL5
    public final RecyclerView.ViewHolder LJIIIZ(ViewGroup parent, InterfaceC88473Ynt clickListener) {
        OSZ LJIILL;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(clickListener, "clickListener");
        if (this.LJJJI >= 4) {
            Context context = parent.getContext();
            o.LJIIIIZZ(context, "parent.context");
            LJIILL = C78999UzT.LJIILLIIL(context);
        } else {
            Context context2 = parent.getContext();
            o.LJIIIIZZ(context2, "parent.context");
            LJIILL = C78999UzT.LJIILL(context2);
        }
        return new C74497TLp((View) LJIILL.getFirst(), (TDE) LJIILL.getSecond(), (IDqS436S0100000_12) clickListener);
    }

    @Override // X.TL5
    public final void LJII(RecyclerView.ViewHolder holder, int i, ProviderEffect sticker, TEA state, Integer num) {
        boolean z;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(sticker, "sticker");
        o.LJIIIZ(state, "state");
        if (!(holder instanceof C74497TLp)) {
            holder = null;
        }
        TL1 tl1 = (TL1) holder;
        if (tl1 != null) {
            int i2 = this.LJJIJL;
            tl1.L(sticker, i, state, num);
            C72790ShW imageView = tl1.LJLJJI.getImageView();
            if (!(imageView instanceof C72791ShX) || imageView == null) {
                return;
            }
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            imageView.LIZ(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLI(Context context, LifecycleOwner lifecycle, TLK tlk, TLD tld, ViewGroup viewGroup, int i, boolean z, InterfaceC88472Yns interfaceC88472Yns) {
        super(context, lifecycle, (TL9) tlk, tld, viewGroup, i, true, true, true, interfaceC88472Yns, 512);
        o.LJIIIZ(lifecycle, "lifecycle");
        this.LJJIZ = lifecycle;
        this.LJJJ = tlk;
        this.LJJJI = i;
        this.LJJJIL = true;
        this.LJJJJ = true;
        this.LJJJJI = z;
    }
}
