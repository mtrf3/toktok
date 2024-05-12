package X;

import Y.ACListenerS28S0101000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.core.ui.campaign.SharingOperationConfig;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OcV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62287OcV extends AbstractC029409q<C62288OcW> {
    public final List<String> LJLIL;
    public int LJLILLLLZI;
    public AqS176S0100000_10 LJLJI;
    public final String LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<String> list = this.LJLIL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C62287OcV(String templateResourcePrefix) {
        List<String> list;
        o.LJIIIZ(templateResourcePrefix, "templateResourcePrefix");
        this.LJLJJI = templateResourcePrefix;
        SharingOperationConfig LIZ = C62285OcT.LIZ();
        if (LIZ != null) {
            list = LIZ.operationTemplateList;
        } else {
            list = null;
        }
        this.LJLIL = list;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C62288OcW c62288OcW, int i) {
        boolean z;
        C62288OcW holder = c62288OcW;
        o.LJIIIZ(holder, "holder");
        if (this.LJLIL == null || getItemCount() <= i) {
            return;
        }
        int i2 = 0;
        if (this.LJLILLLLZI == i) {
            z = true;
        } else {
            z = false;
        }
        String templateId = (String) ListProtector.get(this.LJLIL, i);
        o.LJIIIZ(templateId, "templateId");
        holder.LJLILLLLZI.setClickable(false);
        holder.LJLILLLLZI.setChecked(z);
        if (z) {
            holder.LJLILLLLZI.setVisibility(0);
        } else {
            holder.LJLILLLLZI.setVisibility(4);
        }
        SharingOperationConfig LIZ = C62285OcT.LIZ();
        if (LIZ != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(holder.LJLJI);
            String str = File.separator;
            LIZ2.append(str);
            YE1.LIZLLL(LIZ2, LIZ.operationName, str, templateId, ".png");
            W5F LJI = W5U.LJI(new File(X1D.LIZIZ(LIZ2)));
            SmartImageView smartImageView = holder.LJLIL;
            LJI.LJJIIJ = smartImageView;
            Context context = smartImageView.getContext();
            o.LJIIIIZZ(context, "ivBackground.context");
            Integer LJI2 = C79045V0n.LJI(R.attr.ez, context);
            if (LJI2 != null) {
                i2 = LJI2.intValue();
            }
            LJI.LJIIJJI = i2;
            C16880lQ.LLJJJ(LJI);
        }
        C16880lQ.LJIIJ(new ACListenerS28S0101000_10(i, this, 4), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C62288OcW com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bmb, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        C62288OcW c62288OcW = new C62288OcW(itemView, this.LJLJJI);
        C0AX.LIZ(viewGroup, c62288OcW.itemView, R.id.lj7);
        View view = c62288OcW.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c62288OcW.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C62288OcW.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c62288OcW.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c62288OcW.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C62288OcW.class.getName();
        return c62288OcW;
    }
}
