package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.MainOrderInfoVH;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Axy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27946Axy extends AbstractC029409q<C27971AyN> {
    public C26965Ai9 LJLIL;
    public final List<C27959AyB> LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final /* synthetic */ MainOrderInfoVH LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    public C27946Axy(MainOrderInfoVH mainOrderInfoVH) {
        ArrayList arrayList = new ArrayList();
        this.LJLJJI = mainOrderInfoVH;
        this.LJLIL = null;
        this.LJLILLLLZI = arrayList;
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(mainOrderInfoVH, 174));
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0344, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L123;
     */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Throwable, android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C27971AyN r26, int r27) {
        /*
            Method dump skipped, instructions count: 1169
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27946Axy.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C27971AyN com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        C27971AyN c27971AyN = new C27971AyN(C26558Aba.LIZ(R.layout.a_9, context, parent));
        C0AX.LIZ(parent, c27971AyN.itemView, R.id.lj7);
        View view = c27971AyN.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c27971AyN.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C27971AyN.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c27971AyN.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c27971AyN.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C27971AyN.class.getName();
        return c27971AyN;
    }
}
