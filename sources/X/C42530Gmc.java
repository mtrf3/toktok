package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Gmc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42530Gmc extends AbstractC029409q<C42532Gme> {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final float LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final InterfaceC42533Gmf LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJL;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C42532Gme r12, int r13) {
        /*
            Method dump skipped, instructions count: 191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42530Gmc.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C42532Gme com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        C42532Gme c42532Gme = new C42532Gme(C28289B8j.LIZ(viewGroup, R.layout.c8f, viewGroup, false));
        C0AX.LIZ(viewGroup, c42532Gme.itemView, R.id.lj7);
        View view = c42532Gme.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c42532Gme.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C42532Gme.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c42532Gme.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c42532Gme.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C42532Gme.class.getName();
        return c42532Gme;
    }

    public C42530Gmc(LifecycleOwner lifecycleOwner, int i, int i2, float f, int i3, String str, int i4, int i5, int i6) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = f;
        this.LJLJJI = i3;
        this.LJLJJL = i6;
        if (lifecycleOwner != null && str != null) {
            this.LJLJJLL = AVExternalServiceImpl.LIZ().abilityService().effectService().getVideoCoverBitmapCache(lifecycleOwner, str, i4, i5, i2, f);
        }
    }
}
