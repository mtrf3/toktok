package X;

import Y.ARunnableS38S0100000_2;
import Y.ARunnableS6S0101000_2;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6i5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC167696i5 extends AbstractC029409q<RecyclerView.ViewHolder> {
    public RecyclerView LJLIL;
    public InterfaceC150015uf LJLILLLLZI;
    public List<? extends Effect> LJLJJI;
    public C150145us LJLJJL;
    public final ArrayList<C167736i9> LJLJI = new ArrayList<>();
    public int LJLJJLL = -1;
    public int LJLJL = -1;
    public final C167726i8 LJLJLJ = new InterfaceC168976k9() { // from class: X.6i8
        @Override // X.InterfaceC168976k9
        public final void LIZ(int i, View view) {
            o.LJIIIZ(view, "view");
            if (-1 == i) {
                return;
            }
            Object obj = ListProtector.get(AbstractC167696i5.this.LJLJI, i);
            o.LJIIIIZZ(obj, "effectWrappers[position]");
            C167736i9 c167736i9 = (C167736i9) obj;
            InterfaceC150015uf interfaceC150015uf = AbstractC167696i5.this.LJLILLLLZI;
            if (interfaceC150015uf != null) {
                interfaceC150015uf.LIZ(i, c167736i9);
            }
        }
    };

    public abstract List<C167736i9> LJLLLLLL(int i);

    public abstract void LJZ(RecyclerView.ViewHolder viewHolder, C167736i9 c167736i9);

    public abstract RecyclerView.ViewHolder LJZI(ViewGroup viewGroup, int i, C167726i8 c167726i8);

    public final void LJZL() {
        int i = this.LJLJJLL;
        if (i >= 0 && i < this.LJLJI.size()) {
            RecyclerView recyclerView = this.LJLIL;
            if (recyclerView != null) {
                recyclerView.post(new ARunnableS6S0101000_2(i, this, 11));
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.LJLIL;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.post(new ARunnableS38S0100000_2(this, 166));
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJI.size();
    }

    public final void LL(int i) {
        Effect effect;
        boolean z;
        int i2 = this.LJLJJLL;
        if (i2 == i) {
            return;
        }
        this.LJLJJLL = i;
        Iterator<C167736i9> it = this.LJLJI.iterator();
        String str = null;
        int i3 = 0;
        C167736i9 c167736i9 = null;
        while (it.hasNext()) {
            C167736i9 next = it.next();
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C167736i9 c167736i92 = next;
                if (i == i3) {
                    c167736i9 = c167736i92;
                }
                if (i == i3) {
                    z = true;
                } else {
                    z = false;
                }
                c167736i92.LJII = z;
                i3 = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        StringBuilder LJ = C7MY.LJ("select ", i, "  ");
        if (c167736i9 != null && (effect = c167736i9.LIZ) != null) {
            str = effect.getName();
        }
        LJ.append(str);
        X1D.LIZIZ(LJ);
        notifyItemChanged(i2);
        notifyItemChanged(i);
    }

    @Override // X.AbstractC029409q
    public int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LJLJI, i);
        o.LJIIIIZZ(obj, "effectWrappers[position]");
        return !((C167736i9) obj).LIZIZ ? 1 : 0;
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLIL = recyclerView;
    }

    public static boolean LJLZ(Effect effect, Effect effect2) {
        String str;
        String str2;
        String effectId = effect.getEffectId();
        String str3 = null;
        if (effect2 != null) {
            str = effect2.getEffectId();
        } else {
            str = null;
        }
        if (!o.LJ(effectId, str)) {
            String name = effect.getName();
            if (effect2 != null) {
                str2 = effect2.getName();
            } else {
                str2 = null;
            }
            if (o.LJ(name, str2)) {
                String LJJJLIIL = OUP.LJJJLIIL(effect);
                if (effect2 != null) {
                    str3 = OUP.LJJJLIIL(effect2);
                }
                if (o.LJ(LJJJLIIL, str3)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        Object obj = ListProtector.get(this.LJLJI, i);
        o.LJIIIIZZ(obj, "effectWrappers[position]");
        C167736i9 c167736i9 = (C167736i9) obj;
        if (holder instanceof C168986kA) {
            ((C168986kA) holder).L(c167736i9);
        }
        LJZ(holder, c167736i9);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        RecyclerView.ViewHolder LJZI = LJZI(parent, i, this.LJLJLJ);
        C0AX.LIZ(parent, LJZI.itemView, R.id.lj7);
        View view = LJZI.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (LJZI.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LJZI.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) LJZI.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(LJZI.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LJZI.getClass().getName();
        return LJZI;
    }
}
