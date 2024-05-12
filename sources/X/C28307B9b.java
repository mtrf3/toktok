package X;

import Y.ACListenerS23S0201000_5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.B9b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28307B9b extends AbstractC029409q<C28309B9d> {
    public final List<BannerInRoom> LJLIL;
    public final InterfaceC28308B9c LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C28307B9b(List list, CA8 ca8) {
        o.LJIIIZ(list, "list");
        this.LJLIL = list;
        this.LJLILLLLZI = ca8;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C28309B9d holder, int i) {
        o.LJIIIZ(holder, "holder");
        BannerInRoom bannerInRoom = (BannerInRoom) ListProtector.get(this.LJLIL, i);
        C78720Uuy LIZ = C15650jR.LIZ().LIZ(bannerInRoom.image.mUrls);
        LIZ.LJIIZILJ(Float.valueOf(C15380j0.LIZ(8.0f)));
        LIZ.LJIIJJI(holder.itemView);
        C16880lQ.LJIIJ(new ACListenerS23S0201000_5(i, this, bannerInRoom, 9), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C28309B9d com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        ImageView imageView = new ImageView(parent.getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C28309B9d c28309B9d = new C28309B9d(imageView);
        C0AX.LIZ(parent, c28309B9d.itemView, R.id.lj7);
        View view = c28309B9d.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c28309B9d.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C28309B9d.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c28309B9d.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c28309B9d.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C28309B9d.class.getName();
        return c28309B9d;
    }
}
