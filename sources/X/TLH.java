package X;

import Y.AObserverS75S0200000_12;
import Y.IDrS50S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class TLH extends TL5<InfoStickerEffect> implements TLM<InfoStickerEffect> {
    public String LJJIJIL;
    public int LJJIJL;
    public C42173Ggr LJJIJLIJ;
    public C42230Ghm LJJIL;
    public TextView LJJIZ;
    public final LifecycleOwner LJJJ;
    public final TLL<InfoStickerEffect> LJJJI;
    public final int LJJJIL;
    public final boolean LJJJJ;
    public final boolean LJJJJI;
    public final boolean LJJJJIZL;
    public final String LJJJJJ;

    @Override // X.TL5
    public final void LJIILL() {
        super.LJIILL();
        if (this.LJJJJI && this.LJJJJIZL) {
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
        if (this.LJJJJI && !this.LJJJJIZL) {
            C42173Ggr c42173Ggr = new C42173Ggr(this, LJJI);
            this.LJJIJLIJ = c42173Ggr;
            return c42173Ggr;
        }
        return LJJI;
    }

    @Override // X.TL5, X.InterfaceC74488TLg
    public final void destroy() {
        MutableLiveData keyword;
        super.destroy();
        TLL<InfoStickerEffect> tll = this.LJJJI;
        if (tll != null && (keyword = tll.getKeyword()) != null) {
            keyword.removeObservers(this.LJJJ);
        }
    }

    @Override // X.TL5
    public final LifecycleOwner LJIIJ() {
        return this.LJJJ;
    }

    @Override // X.TL5
    public final int LJIIJJI() {
        return this.LJJJIL;
    }

    @Override // X.TLM
    public final String LLZZJLIL() {
        return this.LJJIJIL;
    }

    @Override // X.TL5
    public final void LJIILJJIL(LifecycleOwner lifecycle) {
        o.LJIIIZ(lifecycle, "lifecycle");
        super.LJIILJJIL(lifecycle);
        TLL<InfoStickerEffect> tll = this.LJJJI;
        if (tll != null) {
            tll.getKeyword().observe(lifecycle, new AObserverS75S0200000_12(this, lifecycle, 17));
            tll.ga().observe(lifecycle, new AObserverS75S0200000_12(this, lifecycle, 18));
        }
        LJIIL().LJIIJJI(new IDrS50S0100000_12(this, 10));
    }

    @Override // X.TL5
    public final int LJIILLIIL(int i) {
        C42173Ggr c42173Ggr;
        if (this.LJJJJI && !this.LJJJJIZL && (c42173Ggr = this.LJJIJLIJ) != null) {
            i -= c42173Ggr.LJLZ();
        }
        return super.LJIILLIIL(i);
    }

    @Override // X.TL5
    public final View LJJIFFI(ViewGroup viewGroup) {
        if (this.LJJJJI && this.LJJJJIZL) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJJIFFI), R.layout.cri, viewGroup, this.LJJJJ);
            o.LJIIIIZZ(LLLLIILL, "LayoutInflater.from(cont…      root, attachToRoot)");
            return LLLLIILL;
        }
        return super.LJJIFFI(viewGroup);
    }

    @Override // X.TL5
    public final TEW LJJIIJ(View content) {
        o.LJIIIZ(content, "content");
        TEW LJJIIJ = super.LJJIIJ(content);
        LJJIIJ.LIZ(TEN.EMPTY, C42450GlK.LJLIL);
        return LJJIIJ;
    }

    @Override // X.TL5
    public final RecyclerView LJJIIJZLJL(View content) {
        o.LJIIIZ(content, "content");
        RecyclerView LJJIIJZLJL = super.LJJIIJZLJL(content);
        if (this.LJJJIL >= 4) {
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

    @Override // X.TL5
    public final void LJJIIZ(TEN pageState) {
        o.LJIIIZ(pageState, "pageState");
        int i = TEY.LIZ[pageState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                super.LJJIIZ(pageState);
                return;
            }
            TLL<InfoStickerEffect> tll = this.LJJJI;
            if (tll != null) {
                tll.GI();
            }
            TextView textView = this.LJJIZ;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            textView.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) C74275TDb.LIZIZ(this.LJJIFFI, 64.0f)));
            return;
        }
        if (NetworkUtils.isNetworkAvailable(this.LJJIFFI)) {
            TLL<InfoStickerEffect> tll2 = this.LJJJI;
            if (tll2 != null) {
                tll2.GI();
            }
            TextView textView2 = this.LJJIZ;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(0);
            textView2.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) C74275TDb.LIZIZ(this.LJJIFFI, 64.0f)));
            return;
        }
        super.LJJIIZ(pageState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIIZI(RecyclerView.ViewHolder viewHolder) {
        String str;
        MutableLiveData ga;
        TextView textView = ((C42230Ghm) viewHolder).LJLIL;
        if (textView != null) {
            TLL<InfoStickerEffect> tll = this.LJJJI;
            if (tll != null && (ga = tll.ga()) != null) {
                str = (String) ga.getValue();
            } else {
                str = null;
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
            if (!(LJJIZ instanceof C74498TLq)) {
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
        if (this.LJJJIL >= 4) {
            Context context = parent.getContext();
            o.LJIIIIZZ(context, "parent.context");
            LJIILL = C78999UzT.LJIILLIIL(context);
        } else {
            Context context2 = parent.getContext();
            o.LJIIIIZZ(context2, "parent.context");
            LJIILL = C78999UzT.LJIILL(context2);
        }
        return new C74498TLq((View) LJIILL.getFirst(), (TDE) LJIILL.getSecond(), (IDqS436S0100000_12) clickListener);
    }

    @Override // X.TL5
    public final void LJII(RecyclerView.ViewHolder holder, int i, InfoStickerEffect sticker, TEA state, Integer num) {
        boolean z;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(sticker, "sticker");
        o.LJIIIZ(state, "state");
        if (!(holder instanceof C74498TLq)) {
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
    public TLH(Context context, LifecycleOwner lifecycle, TLL tll, TLD tld, ViewGroup viewGroup, int i, String noStickerHint, InterfaceC88472Yns interfaceC88472Yns) {
        super(context, lifecycle, (TL9) tll, tld, viewGroup, i, true, true, true, interfaceC88472Yns, 512);
        o.LJIIIZ(lifecycle, "lifecycle");
        o.LJIIIZ(noStickerHint, "noStickerHint");
        this.LJJJ = lifecycle;
        this.LJJJI = tll;
        this.LJJJIL = i;
        this.LJJJJ = true;
        this.LJJJJI = true;
        this.LJJJJIZL = false;
        this.LJJJJJ = noStickerHint;
    }
}
