package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.CUn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31413CUn extends AbstractC029409q<RecyclerView.ViewHolder> {
    public List<?> LJLIL;
    public final InterfaceC31409CUj LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C31413CUn() {
        this(Collections.emptyList(), new C31411CUl());
    }

    public final AbstractC31414CUo LJLLLLLL(RecyclerView.ViewHolder viewHolder) {
        return ((C31411CUl) this.LJLILLLLZI).LIZIZ(viewHolder.getItemViewType());
    }

    public void LJZ(List<?> list) {
        this.LJLIL = list;
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        ListProtector.get(this.LJLIL, i);
        ((C31411CUl) this.LJLILLLLZI).LIZIZ(getItemViewType(i)).getClass();
        return -1L;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LJLIL, i);
        int LIZ = ((C31411CUl) this.LJLILLLLZI).LIZ(obj.getClass());
        if (LIZ != -1) {
            return ((InterfaceC31400CUa) ListProtector.get(((C31411CUl) this.LJLILLLLZI).LIZJ, LIZ)).LIZ(obj) + LIZ;
        }
        final Class<?> cls = obj.getClass();
        throw new RuntimeException(cls) { // from class: X.3CP
            {
                super("Do you have registered the binder for {className}.class in the adapter/pool?".replace("{className}", C16880lQ.LJLLJ(cls)));
            }
        };
    }

    @Override // X.AbstractC029409q
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        LJLLLLLL(viewHolder).getClass();
        return false;
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        LJLLLLLL(viewHolder).LIZLLL(viewHolder);
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        LJLLLLLL(viewHolder).LJ(viewHolder);
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        LJLLLLLL(viewHolder).LJFF(viewHolder);
    }

    public C31413CUn(List list, C31411CUl c31411CUl) {
        this.LJLIL = list;
        this.LJLILLLLZI = c31411CUl;
    }

    public final <T> void LJLZ(Class<? extends T> cls, AbstractC31414CUo<T, ?> abstractC31414CUo) {
        ((C31411CUl) this.LJLILLLLZI).LIZJ(cls);
        InterfaceC31409CUj interfaceC31409CUj = this.LJLILLLLZI;
        C31412CUm c31412CUm = new C31412CUm();
        C31411CUl c31411CUl = (C31411CUl) interfaceC31409CUj;
        ((ArrayList) c31411CUl.LIZ).add(cls);
        ((ArrayList) c31411CUl.LIZIZ).add(abstractC31414CUo);
        ((ArrayList) c31411CUl.LIZJ).add(c31412CUm);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        throw new IllegalAccessError("You should not call this method. Call RecyclerView.Adapter#onBindViewHolder(holder, position, payloads) instead.");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater LLZIL = C16880lQ.LLZIL(viewGroup.getContext());
        AbstractC31414CUo<?, ?> LIZIZ = ((C31411CUl) this.LJLILLLLZI).LIZIZ(i);
        LIZIZ.LIZ = this;
        ?? LIZJ = LIZIZ.LIZJ(LLZIL, viewGroup);
        C0AX.LIZ(viewGroup, LIZJ.itemView, R.id.lj7);
        View view = LIZJ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (LIZJ.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LIZJ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) LIZJ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(LIZJ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LIZJ.getClass().getName();
        return LIZJ;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        ((C31411CUl) this.LJLILLLLZI).LIZIZ(viewHolder.getItemViewType()).LIZIZ(viewHolder, ListProtector.get(this.LJLIL, i), list);
    }
}
