package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.ZtT, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91367ZtT extends AbstractC029409q<C91368ZtU> implements InterfaceC91083Zot {
    public C91488ZvQ LJLIL;
    public C91084Zou LJLILLLLZI = new C91084Zou();
    public final ArrayList<C91077Zon> LJLJI = new ArrayList<>();
    public View.OnClickListener LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJI.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return ((C91077Zon) ListProtector.get(this.LJLJI, i)).LIZ;
    }

    @Override // X.InterfaceC91083Zot
    public final void setConfig(C91084Zou config) {
        o.LJIIIZ(config, "config");
        this.LJLILLLLZI = config;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C91368ZtU c91368ZtU, int i) {
        InterfaceC91366ZtS interfaceC91366ZtS;
        C91368ZtU holder = c91368ZtU;
        o.LJIIIZ(holder, "holder");
        holder.setConfig(this.LJLILLLLZI);
        Object obj = ListProtector.get(this.LJLJI, i);
        o.LJIIIIZZ(obj, "mLyricsInfoList[position]");
        KeyEvent.Callback callback = holder.LJLIL;
        C91488ZvQ c91488ZvQ = null;
        if ((callback instanceof InterfaceC91366ZtS) && (interfaceC91366ZtS = (InterfaceC91366ZtS) callback) != null) {
            interfaceC91366ZtS.LJJZZIII(obj);
        }
        if (((C91077Zon) ListProtector.get(this.LJLJI, i)).LIZLLL) {
            View view = holder.itemView;
            if (view instanceof C91488ZvQ) {
                c91488ZvQ = (C91488ZvQ) view;
            }
            this.LJLIL = c91488ZvQ;
        }
        C16880lQ.LJIIJ(this.LJLJJI, holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C91368ZtU com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        View c91486ZvO;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    c91486ZvO = new View(parent.getContext());
                } else {
                    RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
                    Context context = parent.getContext();
                    o.LJIIIIZZ(context, "parent.context");
                    c91486ZvO = new C91488ZvQ(context);
                    c91486ZvO.setLayoutParams(layoutParams);
                }
            } else {
                RecyclerView.LayoutParams layoutParams2 = new RecyclerView.LayoutParams(-1, this.LJLILLLLZI.LJIIL);
                c91486ZvO = new C91487ZvP(parent.getContext());
                c91486ZvO.setLayoutParams(layoutParams2);
            }
        } else {
            RecyclerView.LayoutParams layoutParams3 = new RecyclerView.LayoutParams(-1, this.LJLILLLLZI.LJIIJJI);
            c91486ZvO = new C91486ZvO(parent.getContext());
            c91486ZvO.setLayoutParams(layoutParams3);
        }
        C91368ZtU c91368ZtU = new C91368ZtU(c91486ZvO);
        c91368ZtU.itemView.setTag(R.id.lj7, Integer.valueOf(parent.hashCode()));
        View view = c91368ZtU.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c91368ZtU.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C91368ZtU.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c91368ZtU.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c91368ZtU.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C91368ZtU.class.getName();
        return c91368ZtU;
    }
}
