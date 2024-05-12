package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JJc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48952JJc extends AbstractC029409q<RecyclerView.ViewHolder> {
    public List<C48954JJe> LJLIL = new ArrayList();
    public java.util.Map<String, String> LJLILLLLZI = new HashMap();

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (holder instanceof C48955JJf) {
            java.util.Map<String, String> params = this.LJLILLLLZI;
            o.LJIIIZ(params, "params");
            ((C48955JJf) holder).P(params, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0058, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L10;
     */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.util.List<X.JJe> r0 = r6.LJLIL
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r8)
            X.JJe r4 = (X.C48954JJe) r4
            boolean r0 = r7 instanceof X.C48955JJf
            if (r0 == 0) goto Ld8
            X.JJf r7 = (X.C48955JJf) r7
            java.lang.String r0 = "t"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r7.LJLJLJ = r4
            android.view.View r1 = r7.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 1084227584(0x40a00000, float:5.0)
            X.C48956JJg.LIZ(r1, r0)
            android.view.View r0 = r7.itemView
            r5 = 2131363338(0x7f0a060a, float:1.8346482E38)
            android.view.View r1 = r0.findViewById(r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r7.getLayoutPosition()
            r2 = 1
            int r0 = r0 + 1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setText(r0)
            java.lang.Integer r1 = r4.LIZLLL
            r3 = 0
            if (r1 == 0) goto L5a
            int r0 = r1.intValue()
            if (r0 <= r2) goto L5a
            r1.intValue()
            android.view.View r0 = r7.itemView
            android.view.View r0 = r0.findViewById(r5)
            X.C17N.LJJLIIIJJI(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L63
        L5a:
            android.view.View r0 = r7.itemView
            android.view.View r0 = r0.findViewById(r5)
            X.C17N.LJJIIJZLJL(r0)
        L63:
            android.view.View r1 = r7.itemView
            r0 = 2131363335(0x7f0a0607, float:1.8346476E38)
            android.view.View r2 = r1.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            Y.ACListenerS43S0200000_8 r1 = new Y.ACListenerS43S0200000_8
            r0 = 10
            r1.<init>(r7, r4, r0)
            X.C16880lQ.LJIL(r2, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LIZ
            if (r0 == 0) goto Le0
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto Le0
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.getCover()
        L86:
            java.lang.String r0 = "BotVideoCell"
            X.W5F r2 = X.C40084FoG.LIZLLL(r1, r0)
            android.view.View r1 = r7.itemView
            r0 = 2131363336(0x7f0a0608, float:1.8346478E38)
            android.view.View r0 = r1.findViewById(r0)
            com.bytedance.lighten.loader.SmartImageView r0 = (com.bytedance.lighten.loader.SmartImageView) r0
            r2.LJJIIJ = r0
            X.C16880lQ.LLJJJ(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.LIZ
            android.view.View r1 = r7.itemView
            r0 = 2131363339(0x7f0a060b, float:1.8346484E38)
            android.view.View r2 = r1.findViewById(r0)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r4.getStatistics()
            if (r0 == 0) goto Ldd
            long r0 = r0.getDiggCount()
        Lb3:
            java.lang.String r0 = X.C77123UOp.LJJIIJ(r0)
            r2.setText(r0)
            android.view.View r0 = r7.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131234107(0x7f080d3b, float:1.808437E38)
            android.graphics.drawable.Drawable r1 = X.C242689fk.LIZ(r1, r4, r0)
            X.Ol8 r0 = r7.LJLJL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld9
            r2.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r1, r3)
        Ld8:
            return
        Ld9:
            r2.setCompoundDrawablesWithIntrinsicBounds(r1, r3, r3, r3)
            goto Ld8
        Ldd:
            r0 = 0
            goto Lb3
        Le0:
            r1 = r3
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48952JJc.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C48955JJf c48955JJf = new C48955JJf(C50365Jph.LIZIZ(R.layout.cf6, parent));
        C0AX.LIZ(parent, c48955JJf.itemView, R.id.lj7);
        View view = c48955JJf.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c48955JJf.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C48955JJf.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c48955JJf.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c48955JJf.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C48955JJf.class.getName();
        return c48955JJf;
    }
}
