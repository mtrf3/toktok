package X;

import Y.AfS54S0100000_2;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6Zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162626Zu extends AbstractC029409q<C162636Zv> {
    public final WFB LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final OSZ<?, ?>[] LJLJJI;
    public boolean LJLJJL = true;
    public boolean LJLJJLL;
    public C73411SrX LJLJL;

    public final void LJLLLLLL() {
        InterfaceC92693kP interfaceC92693kP;
        T0J LIZ;
        WFB wfb = this.LJLIL;
        if (wfb != null && (LIZ = wfb.LIZ()) != null) {
            interfaceC92693kP = LIZ.LJJJJZI(new AfS54S0100000_2(this, 1));
        } else {
            interfaceC92693kP = null;
        }
        this.LJLJL = (C73411SrX) interfaceC92693kP;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        WFB wfb = this.LJLIL;
        if (wfb != null) {
            return wfb.LIZJ;
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C162636Zv c162636Zv, int i) {
        int i2;
        OSZ<?, ?> osz;
        Bitmap bitmap;
        C162636Zv holder = c162636Zv;
        o.LJIIIZ(holder, "holder");
        int itemCount = getItemCount();
        if (!this.LJLJJLL || (itemCount - i) - 1 < 0 || i2 >= itemCount) {
            i2 = i;
        }
        OSZ<?, ?> osz2 = this.LJLJJI[i2];
        if ((osz2 == null || (bitmap = (Bitmap) osz2.getSecond()) == null || bitmap.isRecycled()) && ((osz = this.LJLJJI[0]) == null || (bitmap = (Bitmap) osz.getSecond()) == null || bitmap.isRecycled())) {
            bitmap = null;
        }
        holder.LJLIL.setImageBitmap(bitmap);
        if (i == 0) {
            holder.LJLIL.setPadding(0, 0, 0, 0);
        } else if (i == itemCount - 1) {
            holder.LJLIL.setPadding(0, 0, 0, 0);
        } else {
            holder.LJLIL.setPadding(0, 0, 0, 0);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C162636Zv com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.cqg, parent, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.ImageView");
        ViewGroup.LayoutParams layoutParams = LLLLIILL.getLayoutParams();
        layoutParams.height = this.LJLJI;
        layoutParams.width = this.LJLILLLLZI;
        LLLLIILL.setLayoutParams(layoutParams);
        C162636Zv c162636Zv = new C162636Zv(LLLLIILL);
        C0AX.LIZ(parent, c162636Zv.itemView, R.id.lj7);
        View view = c162636Zv.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c162636Zv.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C162636Zv.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c162636Zv.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c162636Zv.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C162636Zv.class.getName();
        return c162636Zv;
    }

    public C162626Zu(WFB wfb, int i, int i2) {
        int i3;
        this.LJLIL = wfb;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        if (wfb != null) {
            i3 = wfb.LIZJ;
        } else {
            i3 = 0;
        }
        this.LJLJJI = new OSZ[i3];
        LJLLLLLL();
    }
}
