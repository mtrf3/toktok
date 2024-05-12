package X;

import Y.ACListenerS20S0201000_2;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6VZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VZ extends AbstractC029409q<C161386Va> {
    public final InterfaceC88471Ynr<ImageView, Integer, C76800UCe> LJLIL;
    public int LJLILLLLZI;
    public List<String> LJLJI = new ArrayList();

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJI.size();
    }

    public C6VZ(AqS184S0100000_2 aqS184S0100000_2) {
        this.LJLIL = aqS184S0100000_2;
    }

    @Override // X.AbstractC029409q
    /* renamed from: LJLLLLLL, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C161386Va holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (this.LJLILLLLZI == i) {
            holder.LJLILLLLZI.setVisibility(0);
        } else {
            holder.LJLILLLLZI.setVisibility(8);
        }
        String uri = android.net.Uri.fromFile(new File((String) ListProtector.get(this.LJLJI, i))).toString();
        o.LJIIIIZZ(uri, "fromFile(File(synthesisP…hs[position])).toString()");
        if (!o.LJ(uri, holder.LJLIL.getTag())) {
            holder.LJLIL.setTag(uri);
            Context context = holder.LJLIL.getContext();
            W5F LJIIIIZZ = W5U.LJIIIIZZ(uri);
            o.LJIIIIZZ(context, "context");
            int LIZIZ = (int) C74275TDb.LIZIZ(context, 38.0f);
            int LIZIZ2 = (int) C74275TDb.LIZIZ(context, 50.0f);
            LJIIIIZZ.LJII = LIZIZ;
            LJIIIIZZ.LJIIIIZZ = LIZIZ2;
            LJIIIIZZ.LJJIIJ = holder.LJLIL;
            C16880lQ.LLJJJ(LJIIIIZZ);
        }
        C16880lQ.LJJIJLIJ(holder.LJLIL, new ACListenerS20S0201000_2(i, this, holder, 1));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C161386Va com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View imageView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.ic, viewGroup, false);
        o.LJIIIIZZ(imageView, "imageView");
        C161386Va c161386Va = new C161386Va(imageView);
        C0AX.LIZ(viewGroup, c161386Va.itemView, R.id.lj7);
        View view = c161386Va.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c161386Va.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C161386Va.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c161386Va.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c161386Va.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C161386Va.class.getName();
        return c161386Va;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C161386Va c161386Va, int i, List payload) {
        C161386Va holder = c161386Va;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payload, "payload");
        if (payload.isEmpty()) {
            onBindViewHolder(holder, i);
            return;
        }
        if (!(ORZ.LJLLJ(payload) instanceof Integer) || !o.LJ(ORZ.LJLLJ(payload), 1)) {
            return;
        }
        if (this.LJLILLLLZI == i) {
            holder.LJLILLLLZI.setVisibility(0);
        } else {
            holder.LJLILLLLZI.setVisibility(8);
        }
    }
}
