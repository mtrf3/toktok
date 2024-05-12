package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.viewholder;

import X.AbstractC019505v;
import X.AbstractC029409q;
import X.C117114ih;
import X.C118174kP;
import X.C118194kR;
import X.C16880lQ;
import X.C32151Nz;
import X.C45804HyK;
import X.C70759Rpr;
import X.C71745SDt;
import X.C79081V1x;
import X.C7MY;
import X.OUP;
import X.S3I;
import X.S3L;
import X.SE2;
import X.W5F;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SupportIconsHolder extends PowerCell<C118194kR> {
    public final S3L LJLIL;

    public SupportIconsHolder() {
        S3I s3i = new S3I();
        s3i.LIZLLL = C32151Nz.LJIIZILJ(2);
        this.LJLIL = new S3L(s3i);
        final int i = 0;
        new AbstractC029409q<C118174kP>(i) { // from class: X.4kO
            public final List<String> LJLIL = new ArrayList();
            public final S3L LJLILLLLZI;

            @Override // X.AbstractC029409q
            public final int getItemCount() {
                return this.LJLIL.size();
            }

            {
                S3I s3i2 = new S3I();
                s3i2.LIZLLL = C32151Nz.LJIIZILJ(2);
                this.LJLILLLLZI = new S3L(s3i2);
            }

            @Override // X.AbstractC029409q
            public final void onBindViewHolder(C118174kP c118174kP, int i2) {
                C118174kP holder = c118174kP;
                o.LJIIIZ(holder, "holder");
                Object LJLLLLLL = ORZ.LJLLLLLL(i2, this.LJLIL);
                if (LJLLLLLL != null) {
                    W5F LIZLLL = C70759Rpr.LIZLLL(LJLLLLLL);
                    Context context = holder.LJLIL.getContext();
                    o.LJIIIIZZ(context, "holder.view.context");
                    LIZLLL.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cj, context);
                    LIZLLL.LJJIIJ = holder.LJLILLLLZI;
                    C16880lQ.LLJJJ(LIZLLL);
                }
            }

            @Override // X.AbstractC029409q
            /* renamed from: onCreateViewHolder */
            public final C118174kP com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i2) {
                o.LJIIIZ(parent, "parent");
                FrameLayout frameLayout = new FrameLayout(parent.getContext());
                frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, C45804HyK.LJJI(30)));
                C26338AVi.LJI(frameLayout, null, null, null, Integer.valueOf(C45804HyK.LJJI(12)), false, 23);
                SmartImageView smartImageView = new SmartImageView(parent.getContext());
                smartImageView.setLayoutParams(new FrameLayout.LayoutParams(C45804HyK.LJJI(48), C45804HyK.LJJI(30), 17));
                smartImageView.setCircleOptions(this.LJLILLLLZI);
                frameLayout.addView(smartImageView);
                C118174kP c118174kP = new C118174kP(frameLayout, smartImageView);
                C0AX.LIZ(parent, c118174kP.itemView, R.id.lj7);
                View view = c118174kP.itemView;
                if (view != null) {
                    view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
                }
                try {
                    if (c118174kP.itemView.getParent() != null) {
                        boolean z = true;
                        try {
                            SettingsManager.LIZLLL().getClass();
                            z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (z) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C118174kP.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(parent.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i2);
                            C78983UzD.LJIILL(stringBuffer.toString());
                            ViewGroup viewGroup = (ViewGroup) c118174kP.itemView.getParent();
                            if (viewGroup != null) {
                                C16880lQ.LJLLL(c118174kP.itemView, viewGroup);
                            }
                        }
                    }
                } catch (Exception e) {
                    C78946Uyc.LIZIZ(e);
                    C36922EeM.LIZ(e);
                }
                C29127Bbv.LIZ = C118174kP.class.getName();
                return c118174kP;
            }
        };
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setTag(R.id.bn_, new C117114ih(C79081V1x.LJII(25), 0, 0, 0, false, 0, true, 254));
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C71745SDt.LIZJ(itemView2, new SE2(Integer.valueOf(C45804HyK.LJJI(16)), Integer.valueOf(C45804HyK.LJJI(16)), 10));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C118194kR c118194kR) {
        String string;
        ViewGroup viewGroup;
        C118194kR t = c118194kR;
        o.LJIIIZ(t, "t");
        String str = t.LJLILLLLZI;
        if (str == null || str.length() == 0) {
            string = this.itemView.getContext().getString(R.string.fb9);
        } else {
            string = t.LJLILLLLZI;
        }
        o.LJIIIIZZ(string, "if (t.title.isNullOrEmpt…t)\n        } else t.title");
        ((TextView) this.itemView.findViewById(R.id.title)).setText(string);
        for (String str2 : t.LJLIL) {
            int hashCode = str2.hashCode();
            SmartImageView smartImageView = new SmartImageView(this.itemView.getContext());
            smartImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(C45804HyK.LJJI(48), C45804HyK.LJJI(30)));
            smartImageView.setCircleOptions(this.LJLIL);
            W5F LIZLLL = C70759Rpr.LIZLLL(str2);
            LIZLLL.LJIILIIL = C7MY.LIZJ(this.itemView, "itemView.context", R.attr.cj);
            LIZLLL.LJJIIJ = smartImageView;
            C16880lQ.LLJJJ(LIZLLL);
            smartImageView.setId(hashCode);
            View view = this.itemView;
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                C16880lQ.LJLLL(view.findViewById(hashCode), viewGroup);
                viewGroup.addView(smartImageView);
            }
            ((AbstractC019505v) this.itemView.findViewById(R.id.dja)).addView(smartImageView);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return OUP.LJIL(R.layout.a8d, parent, false);
    }
}
