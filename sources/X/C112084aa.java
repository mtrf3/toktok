package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4aa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112084aa extends AbstractC029409q<C112074aZ> {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final List<C112124ae> LJLJJI = new ArrayList();

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJJI).size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C112074aZ c112074aZ, int i) {
        int i2;
        C112074aZ c112074aZ2 = c112074aZ;
        C112124ae c112124ae = (C112124ae) ListProtector.get(this.LJLJJI, i);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) c112074aZ2.LJLIL.getLayoutParams();
        if (c112124ae.LIZIZ == R.drawable.ase) {
            i2 = c112074aZ2.LJLJI;
        } else {
            i2 = c112074aZ2.LJLILLLLZI;
        }
        layoutParams.height = i2;
        layoutParams.width = i2;
        c112074aZ2.LJLIL.setLayoutParams(layoutParams);
        c112074aZ2.LJLIL.setSelected(c112124ae.LIZ);
        c112074aZ2.LJLIL.setImageResource(c112124ae.LIZIZ);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C112074aZ com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        C112074aZ c112074aZ = new C112074aZ(C28289B8j.LIZ(viewGroup, R.layout.ati, viewGroup, false));
        C0AX.LIZ(viewGroup, c112074aZ.itemView, R.id.lj7);
        View view = c112074aZ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c112074aZ.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C112074aZ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c112074aZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c112074aZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C112074aZ.class.getName();
        return c112074aZ;
    }
}
