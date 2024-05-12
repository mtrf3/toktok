package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5YR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5YR {
    public static final /* synthetic */ int LJFF = 0;
    public final RecyclerView LIZ;
    public final List<String> LIZIZ;
    public final InterfaceC88472Yns<String, C76800UCe> LIZJ;
    public int LIZLLL = -1;
    public int LJ = -1;

    public C5YR(RecyclerView recyclerView, List list, AqS168S0100000_2 aqS168S0100000_2) {
        this.LIZ = recyclerView;
        this.LIZIZ = list;
        this.LIZJ = aqS168S0100000_2;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        if (list != null && (!list.isEmpty())) {
            recyclerView.setAdapter(new AbstractC029409q<C5YS>() { // from class: X.5YQ
                @Override // X.AbstractC029409q
                public final int getItemCount() {
                    List<String> list2 = C5YR.this.LIZIZ;
                    if (list2 != null) {
                        return list2.size();
                    }
                    return 0;
                }

                @Override // X.AbstractC029409q
                public final void onBindViewHolder(C5YS c5ys, int i) {
                    String str;
                    boolean z;
                    C5YS holder = c5ys;
                    o.LJIIIZ(holder, "holder");
                    List<String> list2 = C5YR.this.LIZIZ;
                    if (list2 != null && (str = (String) ORZ.LJLLLLLL(i, list2)) != null) {
                        if (C5YR.this.LJ == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        holder.LJLIL.setText(str);
                        holder.LJLIL.setSelected(z);
                    }
                }

                @Override // X.AbstractC029409q
                /* renamed from: onCreateViewHolder */
                public final C5YS com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
                    View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.yx, viewGroup, false);
                    C5YR c5yr = C5YR.this;
                    o.LJII(LIZIZ, "null cannot be cast to non-null type android.widget.TextView");
                    C5YS c5ys = new C5YS(c5yr, (TextView) LIZIZ);
                    C0AX.LIZ(viewGroup, c5ys.itemView, R.id.lj7);
                    View view = c5ys.itemView;
                    if (view != null) {
                        view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
                    }
                    try {
                        if (c5ys.itemView.getParent() != null) {
                            boolean z = true;
                            try {
                                SettingsManager.LIZLLL().getClass();
                                z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                            } catch (Exception unused) {
                            }
                            if (z) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(C5YS.class.getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(viewGroup.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i);
                                C78983UzD.LJIILL(stringBuffer.toString());
                                ViewGroup viewGroup2 = (ViewGroup) c5ys.itemView.getParent();
                                if (viewGroup2 != null) {
                                    C16880lQ.LJLLL(c5ys.itemView, viewGroup2);
                                }
                            }
                        }
                    } catch (Exception e) {
                        C78946Uyc.LIZIZ(e);
                        C36922EeM.LIZ(e);
                    }
                    C29127Bbv.LIZ = C5YS.class.getName();
                    return c5ys;
                }
            });
        } else {
            recyclerView.setVisibility(8);
        }
    }
}
