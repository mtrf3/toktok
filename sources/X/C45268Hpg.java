package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Hpg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45268Hpg extends AbstractC029409q<C45270Hpi> {
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLIL;
    public final InterfaceC88471Ynr<View, Integer, C76800UCe> LJLILLLLZI;
    public int LJLJJI;
    public final List<AutoCutThemeData> LJLJI = new ArrayList();
    public boolean LJLJJL = true;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJI).size();
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(C45270Hpi holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        this.LJLIL.invoke(Integer.valueOf(holder.getBindingAdapterPosition()));
    }

    public C45268Hpg(AqS181S0100000_15 aqS181S0100000_15, AqS197S0100000_15 aqS197S0100000_15) {
        this.LJLIL = aqS181S0100000_15;
        this.LJLILLLLZI = aqS197S0100000_15;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C45270Hpi c45270Hpi, int i) {
        boolean z;
        int i2;
        boolean z2;
        C45270Hpi holder = c45270Hpi;
        o.LJIIIZ(holder, "holder");
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) ListProtector.get(this.LJLJI, i);
        String str = autoCutThemeData.coverUrl;
        if (str != null) {
            C78765Uvh.LJIIIZ(holder.LJLIL, str, -1, -1);
        }
        int i3 = autoCutThemeData.templateType;
        boolean z3 = false;
        if (e1.LIZ(31744, "enable_show_cc_author_info", true, false) && i3 == EnumC43998HOo.CUT_SAME.getValue()) {
            z = true;
        } else {
            z = false;
        }
        TuxIconView tuxIconView = holder.LJLJL;
        int i4 = 8;
        if (tuxIconView != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            tuxIconView.setVisibility(i2);
        }
        String str2 = autoCutThemeData.name;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        C8HB c8hb = holder.LJLJI;
        if (c8hb != null) {
            c8hb.setText(str2);
        }
        if (i == this.LJLJJI) {
            z2 = true;
        } else {
            z2 = false;
        }
        View view = holder.LJLILLLLZI;
        if (view != null) {
            if (z2) {
                i4 = 0;
            }
            view.setVisibility(i4);
        }
        if (!z2) {
            holder.L(null, false, false);
        }
        if (this.LJLJJL && i == this.LJLJJI) {
            String str4 = autoCutThemeData.nickName;
            if (str4 != null) {
                str3 = str4;
            }
            if (e1.LIZ(31744, "enable_show_cc_author_info", true, false) && autoCutThemeData.templateType == EnumC43998HOo.CUT_SAME.getValue()) {
                z3 = true;
            }
            holder.L(str3, true, z3);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C45270Hpi com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.i9, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        C45270Hpi c45270Hpi = new C45270Hpi(itemView, this.LJLILLLLZI);
        C0AX.LIZ(viewGroup, c45270Hpi.itemView, R.id.lj7);
        View view = c45270Hpi.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c45270Hpi.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C45270Hpi.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c45270Hpi.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c45270Hpi.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C45270Hpi.class.getName();
        return c45270Hpi;
    }
}
