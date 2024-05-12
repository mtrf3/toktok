package X;

import Y.ACListenerS19S0301000_8;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubTabsComponent;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchLabel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS125S0300000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.AqS78S0400000_8;
import kotlin.jvm.internal.AqS96S0101000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Jno, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50248Jno extends AbstractC029409q<C50249Jnp> {
    public final float LJLIL;
    public ColorStateList LJLILLLLZI;
    public StateListDrawable LJLJI;
    public final StateListDrawable LJLJJI;
    public int LJLJJL;
    public final ArrayList<SearchLabel> LJLJJLL;
    public final T5S LJLJL;
    public final int LJLJLJ;
    public int LJLJLLL;
    public String LJLL;
    public final /* synthetic */ SearchHubTabsComponent LJLLI;
    public final /* synthetic */ RecyclerView LJLLILLLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJLL.size();
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(C50249Jnp holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        SearchHubHeaderVM H3 = this.LJLLI.H3();
        H3.getClass();
        H3.withState(new AqS96S0101000_8(bindingAdapterPosition, H3, 2));
    }

    public C50248Jno(RecyclerView recyclerView, SearchHubTabsComponent searchHubTabsComponent) {
        this.LJLLI = searchHubTabsComponent;
        this.LJLLILLLL = recyclerView;
        float LIZIZ = C7MY.LIZIZ(25);
        this.LJLIL = LIZIZ;
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {R.attr.state_pressed};
        C110614Vt c110614Vt = new C110614Vt();
        Context context = searchHubTabsComponent.x3().getContext();
        o.LJIIIIZZ(context, "contentView.context");
        c110614Vt.LIZ = C79045V0n.LJI(com.zhiliaoapp.musically.R.attr.dv, context);
        c110614Vt.LIZJ = Float.valueOf(LIZIZ);
        Context context2 = searchHubTabsComponent.x3().getContext();
        o.LJIIIIZZ(context2, "contentView.context");
        stateListDrawable.addState(iArr, c110614Vt.LIZ(context2));
        this.LJLJJI = stateListDrawable;
        this.LJLJJL = -1;
        this.LJLJJLL = new ArrayList<>();
        T5S t5s = new T5S();
        t5s.LIZ(62);
        this.LJLJL = t5s;
        this.LJLJLJ = KL2.LJIIJJI(searchHubTabsComponent.x3().getContext());
        this.LJLL = "";
        C8YN.LJII(searchHubTabsComponent, searchHubTabsComponent.H3(), new TBT() { // from class: X.JnL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C50201Jn3) obj).LJLJL;
            }
        }, null, new AqS78S0400000_8(this, recyclerView, this, searchHubTabsComponent, 1), 6);
        C8YN.LJII(searchHubTabsComponent, searchHubTabsComponent.H3(), new TBT() { // from class: X.JnJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C50201Jn3) obj).LJLJJLL);
            }
        }, null, new AqS190S0100000_8(this, 43), 6);
        C8YN.LJII(searchHubTabsComponent, searchHubTabsComponent.H3(), new TBT() { // from class: X.Jn5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C50201Jn3) obj).LJLLI;
            }
        }, null, new AqS125S0300000_8(this, recyclerView, searchHubTabsComponent, 0), 6);
    }

    @Override // X.AbstractC029409q
    /* renamed from: LJLLLLLL, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C50249Jnp holder, int i) {
        Drawable drawable;
        boolean z;
        Drawable mutate;
        Drawable.ConstantState constantState;
        o.LJIIIZ(holder, "holder");
        SearchLabel searchLabel = (SearchLabel) ORZ.LJLLLLLL(i, this.LJLJJLL);
        if (searchLabel == null) {
            return;
        }
        TuxTextView tuxTextView = holder.LJLIL;
        SearchHubTabsComponent searchHubTabsComponent = this.LJLLI;
        RecyclerView recyclerView = this.LJLLILLLL;
        tuxTextView.setTextColor(this.LJLILLLLZI);
        StateListDrawable stateListDrawable = this.LJLJI;
        if (stateListDrawable != null && (mutate = stateListDrawable.mutate()) != null && (constantState = mutate.getConstantState()) != null) {
            drawable = constantState.newDrawable();
        } else {
            drawable = null;
        }
        tuxTextView.setBackground(drawable);
        if (i == this.LJLJJL) {
            z = true;
        } else {
            z = false;
        }
        tuxTextView.setSelected(z);
        tuxTextView.setText(searchLabel.labelText);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS19S0301000_8(tuxTextView, searchHubTabsComponent, i, recyclerView, 0));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C50249Jnp com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        Context context = this.LJLLI.x3().getContext();
        o.LJIIIIZZ(context, "contentView.context");
        Drawable drawable = null;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(62);
        tuxTextView.setPadding((this.LJLJLLL / 2) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), 0, (this.LJLJLLL / 2) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), 0);
        tuxTextView.setGravity(16);
        tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        tuxTextView.setMinHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
        boolean z = true;
        tuxTextView.setClickable(true);
        if (Build.VERSION.SDK_INT >= 23) {
            Drawable.ConstantState constantState = this.LJLJJI.mutate().getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            tuxTextView.setForeground(drawable);
        }
        C50249Jnp c50249Jnp = new C50249Jnp(tuxTextView);
        C0AX.LIZ(parent, c50249Jnp.itemView, com.zhiliaoapp.musically.R.id.lj7);
        View view = c50249Jnp.itemView;
        if (view != null) {
            view.setTag(com.zhiliaoapp.musically.R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c50249Jnp.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C50249Jnp.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c50249Jnp.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c50249Jnp.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C50249Jnp.class.getName();
        return c50249Jnp;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C50249Jnp c50249Jnp, int i, List payloads) {
        Boolean bool;
        C50249Jnp holder = c50249Jnp;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        Object LJLLLL = ORZ.LJLLLL(payloads);
        if (!(LJLLLL instanceof Boolean) || (bool = (Boolean) LJLLLL) == null) {
            onBindViewHolder(holder, i);
        } else {
            holder.LJLIL.setSelected(bool.booleanValue());
        }
    }
}
