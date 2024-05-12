package X;

import Y.AObserverS80S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TKy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74480TKy extends TL5<Effect> implements InterfaceC74452TJw<EffectCategoryResponse, Effect>, TL0 {
    public C74478TKw LJJIJIL;
    public C42230Ghm LJJIJL;
    public C42230Ghm LJJIJLIJ;
    public final List<OSZ<EffectCategoryResponse, List<Effect>>> LJJIL;
    public final C73849Syb<List<OSZ<EffectCategoryResponse, List<Effect>>>> LJJIZ;
    public boolean LJJJ;
    public View LJJJI;
    public final LifecycleOwner LJJJIL;
    public final InterfaceC74451TJv<EffectCategoryResponse, Effect> LJJJJ;
    public final int LJJJJI;
    public final boolean LJJJJIZL;
    public final boolean LJJJJJ;
    public final boolean LJJJJJL;

    @Override // X.TL0
    public final void LIZIZ() {
        if (!this.LJJJJJL || this.LJJJ) {
            return;
        }
        this.LJJJ = true;
        LJIILJJIL(this.LJJJIL);
    }

    public final C73426Srm LJJIJ() {
        C73849Syb<List<OSZ<EffectCategoryResponse, List<Effect>>>> c73849Syb = this.LJJIZ;
        return C42193GhB.LIZJ(c73849Syb, c73849Syb);
    }

    @Override // X.TL5
    public final void LJIILL() {
        super.LJIILL();
        if (this.LJJJJJ) {
            View view = this.LIZIZ;
            if (view != null) {
                View fakeHeaderView = view.findViewById(R.id.d3s);
                o.LJIIIIZZ(fakeHeaderView, "fakeHeaderView");
                View findViewById = fakeHeaderView.findViewById(R.id.khv);
                o.LJIIIIZZ(findViewById, "fakeHeaderView.findViewB…R.id.sticker_header_text)");
                this.LJJIJL = new C42230Ghm(fakeHeaderView, (TextView) findViewById);
                View view2 = this.LIZIZ;
                if (view2 != null) {
                    View fakeAboutHeaderView = view2.findViewById(R.id.d2y);
                    o.LJIIIIZZ(fakeAboutHeaderView, "fakeAboutHeaderView");
                    View findViewById2 = fakeAboutHeaderView.findViewById(R.id.khv);
                    o.LJIIIIZZ(findViewById2, "fakeAboutHeaderView.find…R.id.sticker_header_text)");
                    this.LJJIJLIJ = new C42230Ghm(fakeAboutHeaderView, (TextView) findViewById2);
                    return;
                }
                o.LJIJI("contentView");
                throw null;
            }
            o.LJIJI("contentView");
            throw null;
        }
    }

    @Override // X.TL5
    public final AbstractC029409q<RecyclerView.ViewHolder> LJJI() {
        C74478TKw c74478TKw = new C74478TKw(this, super.LJJI());
        this.LJJIJIL = c74478TKw;
        return c74478TKw;
    }

    @Override // X.TL5, X.InterfaceC74488TLg
    public final void destroy() {
        LiveData<List<OSZ<EffectCategoryResponse, List<Effect>>>> qq0;
        super.destroy();
        InterfaceC74451TJv<EffectCategoryResponse, Effect> interfaceC74451TJv = this.LJJJJ;
        if (interfaceC74451TJv != null && (qq0 = interfaceC74451TJv.qq0()) != null) {
            qq0.removeObservers(this.LJJJIL);
        }
        this.LJJJ = false;
    }

    @Override // X.TL5
    public final LifecycleOwner LJIIJ() {
        return this.LJJJIL;
    }

    @Override // X.TL5
    public final int LJIIJJI() {
        return this.LJJJJI;
    }

    @Override // X.TL5
    public final void LJIILJJIL(LifecycleOwner lifecycle) {
        LiveData<List<OSZ<EffectCategoryResponse, List<Effect>>>> qq0;
        o.LJIIIZ(lifecycle, "lifecycle");
        super.LJIILJJIL(lifecycle);
        InterfaceC74451TJv<EffectCategoryResponse, Effect> interfaceC74451TJv = this.LJJJJ;
        if (interfaceC74451TJv != null && (qq0 = interfaceC74451TJv.qq0()) != null) {
            qq0.observe(lifecycle, new AObserverS80S0100000_12(this, 49));
        }
        if (this.LJJJJJ) {
            LJIIL().LJIIJJI(new C74479TKx(this));
        }
    }

    @Override // X.TL5
    public final int LJIILLIIL(int i) {
        C74478TKw c74478TKw = this.LJJIJIL;
        if (c74478TKw != null) {
            i = c74478TKw.LJZL(i);
        }
        return super.LJIILLIIL(i);
    }

    @Override // X.TL5
    public final View LJJIFFI(ViewGroup viewGroup) {
        if (this.LJJJJJ) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJJIFFI), R.layout.cri, viewGroup, this.LJJJJIZL);
            o.LJIIIIZZ(LLLLIILL, "LayoutInflater.from(cont…      root, attachToRoot)");
            return LLLLIILL;
        }
        return super.LJJIFFI(viewGroup);
    }

    @Override // X.TL5
    public final RecyclerView LJJIIJZLJL(View content) {
        o.LJIIIZ(content, "content");
        RecyclerView LJJIIJZLJL = super.LJJIIJZLJL(content);
        if (this.LJJJJI >= 4) {
            Context context = content.getContext();
            o.LJIIIIZZ(context, "content.context");
            LJJIIJZLJL.setFadingEdgeLength((int) C74275TDb.LIZIZ(context, 4.0f));
            LJJIIJZLJL.setVerticalFadingEdgeEnabled(true);
            Context context2 = content.getContext();
            o.LJIIIIZZ(context2, "content.context");
            int LIZIZ = (int) C74275TDb.LIZIZ(context2, 3.0f);
            LJJIIJZLJL.setPadding(LIZIZ, 0, LIZIZ, 0);
        }
        return LJJIIJZLJL;
    }

    @Override // X.InterfaceC74452TJw
    public final void LIZJ(int i, Object obj) {
        Iterator it = ORZ.LLILLL(this.LJJIL, i).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((List) ((OSZ) it.next()).getSecond()).size();
        }
        AbstractC45801HyH<C157166Eu> abstractC45801HyH = this.LJ;
        C0A2 c0a2 = null;
        if (abstractC45801HyH != null) {
            List<C157166Eu> data = abstractC45801HyH.getData();
            int size = ((ArrayList) data).size();
            while (i2 < size) {
                if (o.LJ(((C157166Eu) ListProtector.get(data, i2)).LJLIL, obj)) {
                    if (i2 >= 0) {
                        C0A2 layoutManager = LJIIL().getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            c0a2 = layoutManager;
                        }
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0a2;
                        if (linearLayoutManager != null) {
                            C74478TKw c74478TKw = this.LJJIJIL;
                            if (c74478TKw != null) {
                                i2 = c74478TKw.LJZI(i2);
                            }
                            linearLayoutManager.LJFF(i2, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                i2++;
            }
            return;
        }
        o.LJIJI("dataAdapter");
        throw null;
    }

    @Override // X.TL5
    public final RecyclerView.ViewHolder LJIIIZ(ViewGroup parent, InterfaceC88473Ynt clickListener) {
        OSZ LIZ;
        Context context;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(clickListener, "clickListener");
        Context context2 = parent.getContext();
        o.LJIIIIZZ(context2, "parent.context");
        Activity LIZ2 = C105574Cj.LIZ(context2);
        ArrayList arrayList = (ArrayList) TLA.LIZ;
        if (!arrayList.isEmpty()) {
            OSZ osz = (OSZ) ORZ.LJLLJ(arrayList);
            View view = (View) osz.getSecond();
            if (view != null && (context = view.getContext()) != null) {
                while (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            context = null;
            if (o.LJ(context, LIZ2)) {
                ORS.LJJLJ(TLA.LIZ);
                LIZ = new OSZ(osz.getFirst(), osz.getSecond());
                return new TL2((View) LIZ.getFirst(), (TDE) LIZ.getSecond(), (IDqS436S0100000_12) clickListener);
            }
        }
        Context context3 = parent.getContext();
        o.LJIIIIZZ(context3, "parent.context");
        LIZ = TLA.LIZ(context3);
        return new TL2((View) LIZ.getFirst(), (TDE) LIZ.getSecond(), (IDqS436S0100000_12) clickListener);
    }

    public final void LJJIIZI(RecyclerView.ViewHolder holder, EffectCategoryResponse category) {
        TextView textView;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(category, "category");
        if (this.LJJJJJ) {
            if (!(holder instanceof C42230Ghm)) {
                holder = null;
            }
            C42230Ghm c42230Ghm = (C42230Ghm) holder;
            if (c42230Ghm != null && (textView = c42230Ghm.LJLIL) != null) {
                textView.setText(category.getName());
            }
        }
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
    public C74480TKy(Context context, LifecycleOwner lifecycle, InterfaceC74451TJv interfaceC74451TJv, TLD tld, ViewGroup viewGroup, int i, boolean z, boolean z2, boolean z3, InterfaceC88472Yns interfaceC88472Yns) {
        super(context, lifecycle, (TL9) interfaceC74451TJv, tld, viewGroup, i, true, false, true, z3, (InterfaceC88472Yns<? super TL7, C76800UCe>) interfaceC88472Yns);
        o.LJIIIZ(lifecycle, "lifecycle");
        this.LJJJIL = lifecycle;
        this.LJJJJ = interfaceC74451TJv;
        this.LJJJJI = i;
        this.LJJJJIZL = true;
        this.LJJJJJ = z;
        this.LJJJJJL = z2;
        this.LJJIL = new ArrayList();
        this.LJJIZ = new C73849Syb<>();
    }
}
