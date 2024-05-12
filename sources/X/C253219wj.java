package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253219wj extends AbstractC029409q<C253239wl> {
    public final Context LJLIL;
    public final List<C253249wm> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public C253219wj(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = new ArrayList();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C253239wl c253239wl, final int i) {
        C253239wl holder = c253239wl;
        o.LJIIIZ(holder, "holder");
        final C253249wm c253249wm = (C253249wm) ListProtector.get(this.LJLILLLLZI, i);
        holder.LJLIL.setTitle(c253249wm.LIZ);
        AI8 ai8 = holder.LJLIL;
        final C25991AHz c25991AHz = new C25991AHz(this.LJLIL);
        c25991AHz.LJIILIIL(c253249wm.LIZIZ);
        c25991AHz.LJIILL(new CompoundButton.OnCheckedChangeListener() { // from class: X.9wk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                boolean z2;
                o.LJIIIZ(compoundButton, "<anonymous parameter 0>");
                if (C25991AHz.this.LJIIL()) {
                    C253219wj c253219wj = this;
                    int i2 = i;
                    Iterator it = ((ArrayList) c253219wj.LJLILLLLZI).iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            C253249wm c253249wm2 = (C253249wm) next;
                            if (i3 == i2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c253249wm2.LIZIZ = z2;
                            i3 = i4;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    c253219wj.notifyDataSetChanged();
                    AqS93S0300000_4 aqS93S0300000_4 = c253249wm.LIZJ;
                    if (aqS93S0300000_4 != null) {
                        aqS93S0300000_4.invoke();
                    }
                }
            }
        });
        ai8.setAccessory(c25991AHz);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C253239wl com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.m8, parent, false);
        o.LJIIIIZZ(view, "view");
        C253239wl c253239wl = new C253239wl(view);
        C0AX.LIZ(parent, c253239wl.itemView, R.id.lj7);
        View view2 = c253239wl.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c253239wl.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C253239wl.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c253239wl.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c253239wl.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C253239wl.class.getName();
        return c253239wl;
    }
}
