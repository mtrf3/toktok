package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.model.ManagementPagePaidVideo;
import com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel.ManageSeriesViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A13 extends AbstractC029409q<A14> {
    public final A1F LJLIL;
    public final List<ManagementPagePaidVideo> LJLILLLLZI;
    public boolean LJLJI;
    public final LinkedHashMap<A15, A16> LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJI.size() + ((ArrayList) this.LJLILLLLZI).size();
    }

    public A13(ManageSeriesViewModel listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
        this.LJLILLLLZI = new ArrayList();
        this.LJLJJI = new LinkedHashMap<>();
    }

    public final void LJLLLLLL(int i, int i2) {
        if (i < 0 || i > ((ArrayList) this.LJLILLLLZI).size() - 1 || i2 < 0 || i2 > ((ArrayList) this.LJLILLLLZI).size() - 1) {
            return;
        }
        if (i < i2) {
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                Collections.swap(this.LJLILLLLZI, i3, i4);
                i3 = i4;
            }
        } else {
            int i5 = i2 + 1;
            if (i5 <= i) {
                int i6 = i;
                while (true) {
                    Collections.swap(this.LJLILLLLZI, i6, i6 - 1);
                    if (i6 == i5) {
                        break;
                    } else {
                        i6--;
                    }
                }
            }
        }
        notifyItemMoved(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x020d, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L50;
     */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.A14 r14, int r15) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A13.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final A14 com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.aik, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        A14 a14 = new A14(this, view);
        C0AX.LIZ(viewGroup, a14.itemView, R.id.lj7);
        View view2 = a14.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (a14.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(A14.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a14.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(a14.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = A14.class.getName();
        return a14;
    }
}
