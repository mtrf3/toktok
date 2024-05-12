package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Se4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72576Se4 extends AbstractC029409q<C72577Se5> implements InterfaceC72574Se2 {
    public final C72582SeA LJLIL;
    public final InterfaceC72603SeV LJLILLLLZI;
    public final InterfaceC72578Se6 LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.LIZ().size();
    }

    @Override // X.InterfaceC72574Se2
    public final void LJJL(InterfaceC72575Se3 selectable) {
        o.LJIIIZ(selectable, "selectable");
        this.LJLJI.LJJL(selectable);
    }

    @Override // X.InterfaceC72574Se2
    public final void LJLIL(InterfaceC72575Se3 selectable, int i) {
        o.LJIIIZ(selectable, "selectable");
        this.LJLJI.LJLIL(selectable, i);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C72577Se5 c72577Se5, int i) {
        int i2;
        C72577Se5 holder = c72577Se5;
        o.LJIIIZ(holder, "holder");
        Object obj = ListProtector.get(this.LJLILLLLZI.LIZ(), i);
        o.LJIIIIZZ(obj, "data.children[position]");
        InterfaceC72580Se8 interfaceC72580Se8 = (InterfaceC72580Se8) obj;
        C72579Se7 c72579Se7 = new C72579Se7(this, interfaceC72580Se8);
        C72582SeA navi = this.LJLIL;
        o.LJIIIZ(navi, "navi");
        holder.LJLIL.setText(interfaceC72580Se8.getName());
        int i3 = 0;
        if (interfaceC72580Se8.LIZIZ() != null) {
            C72549Sdd LIZIZ = interfaceC72580Se8.LIZIZ();
            o.LJI(LIZIZ);
            RecyclerView recyclerView = holder.LJLILLLLZI;
            holder.itemView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            holder.LJLILLLLZI.setAdapter(new C72553Sdh(LIZIZ, c72579Se7));
        } else {
            holder.LJLILLLLZI.setVisibility(8);
        }
        if ((!interfaceC72580Se8.LJ().isEmpty()) || (!interfaceC72580Se8.LIZ().isEmpty())) {
            if (interfaceC72580Se8.getType() == EnumC46494IMo.GRID) {
                i3 = 1;
                i2 = 3;
            } else {
                i2 = 6;
            }
            int i4 = i3 ^ 1;
            if (i3 != 0) {
                holder.LJLJI.setPadding(C7MY.LIZIZ(9), C7MY.LIZIZ(9), C7MY.LIZIZ(9), O6R.LJJIIZ(C32151Nz.LJIIZILJ(9)));
            } else {
                holder.LJLJI.setPadding(C7MY.LIZIZ(12), C7MY.LIZIZ(12), C7MY.LIZIZ(12), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
            }
            RecyclerView recyclerView2 = holder.LJLJI;
            holder.itemView.getContext();
            recyclerView2.setLayoutManager(new GridLayoutManager(i2));
            holder.LJLJI.setAdapter(new C72571Sdz(i2, new ArrayList(interfaceC72580Se8.LJ().values()), interfaceC72580Se8.LIZ(), i4, this, new AqS178S0100000_12(navi, 730), new AqS143S0200000_12(interfaceC72580Se8, navi, 174)));
            return;
        }
        holder.LJLJI.setVisibility(8);
    }

    @Override // X.AbstractC029409q
    public final C72577Se5 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.c6x, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C72577Se5 c72577Se5 = new C72577Se5(view);
        C0AX.LIZ(viewGroup, c72577Se5.itemView, R.id.lj7);
        View view2 = c72577Se5.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c72577Se5.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C72577Se5.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c72577Se5.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c72577Se5.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C72577Se5.class.getName();
        return c72577Se5;
    }

    public C72576Se4(C72582SeA c72582SeA, InterfaceC72603SeV interfaceC72603SeV, InterfaceC72578Se6 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL = c72582SeA;
        this.LJLILLLLZI = interfaceC72603SeV;
        this.LJLJI = listener;
    }
}
