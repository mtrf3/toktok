package X;

import Y.ACListenerS23S0101000_4;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.9YC, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9YC extends AbstractC029409q<C9YD> {
    public final List<LiveEventStruct> LJLIL;
    public InterfaceC236469Pu LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C9YC(List<LiveEventStruct> mDataList) {
        o.LJIIIZ(mDataList, "mDataList");
        this.LJLIL = mDataList;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C9YD c9yd, int i) {
        String LIZJ;
        C9YD holder = c9yd;
        o.LJIIIZ(holder, "holder");
        LiveEventStruct event = (LiveEventStruct) ListProtector.get(this.LJLIL, i);
        o.LJIIIZ(event, "event");
        holder.LJLILLLLZI.setText(event.getTitle());
        TuxTextView tuxTextView = holder.LJLJI;
        long startTime = event.getStartTime();
        long millis = TimeUnit.SECONDS.toMillis(startTime);
        if (startTime == 0) {
            LIZJ = "";
        } else if (SU4.LJ(millis)) {
            LIZJ = BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIJ.getValue(), millis);
        } else if (SU4.LIZLLL(millis)) {
            LIZJ = BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIJJ.getValue(), millis);
        } else if (C86036Xpg.LJIIIZ(millis)) {
            LIZJ = BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIL.getValue(), millis);
        } else if (!C86036Xpg.LJIIIIZZ(millis)) {
            LIZJ = BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJI.getValue(), millis);
        } else {
            LIZJ = BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIIIIZZ.getValue(), millis);
        }
        tuxTextView.setText(LIZJ);
        if (i == getItemCount() - 1) {
            holder.LJLJJI.setVisibility(4);
        }
        C16880lQ.LJIIJ(new ACListenerS23S0101000_4(i, this, 8), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C9YD com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.c5k, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C9YD c9yd = new C9YD(view);
        C0AX.LIZ(viewGroup, c9yd.itemView, R.id.lj7);
        View view2 = c9yd.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c9yd.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C9YD.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c9yd.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c9yd.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C9YD.class.getName();
        return c9yd;
    }
}
