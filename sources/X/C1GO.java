package X;

import Y.IDCListenerS83S0200000;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1GO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1GO extends AbstractC029409q<C1GN> {
    public final RecyclerView LJLIL;
    public List<C09730Zt> LJLILLLLZI;
    public final DataChannel LJLJI;
    public final InterfaceC11010bx LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C1GN c1gn, int i) {
        C1GN holder = c1gn;
        o.LJIIIZ(holder, "holder");
        C09730Zt quality = (C09730Zt) ListProtector.get(this.LJLILLLLZI, i);
        o.LJIIIZ(quality, "quality");
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Holder.bindView(). quality=");
            LIZ.append(quality);
            LIZ.append(". ");
            C0NB.LJIIIZ("GamePreparationDefinitionDialogTag", X1D.LIZIZ(LIZ));
        }
        C41061jK c41061jK = holder.LJLJJL;
        if (c41061jK != null) {
            c41061jK.setClickable(false);
        }
        C47121t6 c47121t6 = holder.LJLILLLLZI;
        if (c47121t6 != null) {
            c47121t6.setText(quality.LIZ);
        }
        C47121t6 c47121t62 = holder.LJLJI;
        if (c47121t62 != null) {
            String str = quality.LIZIZ;
            if (str == null) {
                str = "";
            }
            c47121t62.setText(str);
        }
        C41061jK c41061jK2 = holder.LJLJJL;
        if (c41061jK2 != null) {
            c41061jK2.setChecked(quality.LIZLLL);
        }
        ConstraintLayout constraintLayout = holder.LJLIL;
        if (constraintLayout != null) {
            constraintLayout.setSelected(quality.LIZLLL);
        }
        C47121t6 c47121t63 = holder.LJLILLLLZI;
        if (c47121t63 != null) {
            c47121t63.setSelected(quality.LIZLLL);
        }
        if (C77357UXp.LJJIII() && quality.LJ) {
            C47121t6 c47121t64 = holder.LJLJJI;
            if (c47121t64 != null) {
                c47121t64.setVisibility(0);
            }
        } else {
            C47121t6 c47121t65 = holder.LJLJJI;
            if (c47121t65 != null) {
                c47121t65.setVisibility(8);
            }
        }
        C16880lQ.LJIIJ(new IDCListenerS83S0200000(holder, this, 2), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C1GN com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.cx7, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C1GN c1gn = new C1GN(view);
        C0AX.LIZ(viewGroup, c1gn.itemView, R.id.lj7);
        View view2 = c1gn.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c1gn.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1GN.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1gn.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c1gn.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C1GN.class.getName();
        return c1gn;
    }

    public C1GO(RecyclerView recyclerView, List<C09730Zt> list, DataChannel dataChannel, InterfaceC11010bx finishSelectionListener) {
        o.LJIIIZ(finishSelectionListener, "finishSelectionListener");
        this.LJLIL = recyclerView;
        this.LJLILLLLZI = list;
        this.LJLJI = dataChannel;
        this.LJLJJI = finishSelectionListener;
        int size = ((ArrayList) list).size();
        for (int i = 0; i < size; i++) {
            if (((C09730Zt) ListProtector.get(this.LJLILLLLZI, i)).LIZLLL) {
                this.LJLJJL = i;
                return;
            }
        }
    }
}
