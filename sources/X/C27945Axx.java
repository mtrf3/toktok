package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.shop.GlobalMainOrderInfoVH;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Axx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27945Axx extends AbstractC029409q<C27972AyO> {
    public C26965Ai9 LJLIL;
    public final List<C27959AyB> LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final /* synthetic */ GlobalMainOrderInfoVH LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    public C27945Axx(GlobalMainOrderInfoVH globalMainOrderInfoVH) {
        ArrayList arrayList = new ArrayList();
        this.LJLJJI = globalMainOrderInfoVH;
        this.LJLIL = null;
        this.LJLILLLLZI = arrayList;
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(globalMainOrderInfoVH, 318));
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x03eb, code lost:
    
        if (r0.intValue() == 1) goto L153;
     */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Throwable, android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r12v2 */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C27972AyO r24, int r25) {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27945Axx.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C27972AyO com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.a__, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C27972AyO c27972AyO = new C27972AyO(view);
        C0AX.LIZ(viewGroup, c27972AyO.itemView, R.id.lj7);
        View view2 = c27972AyO.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c27972AyO.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C27972AyO.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c27972AyO.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c27972AyO.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C27972AyO.class.getName();
        return c27972AyO;
    }
}
