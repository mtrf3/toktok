package X;

import Y.ACListenerS23S0301000_13;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.wallet.model.LocationObject;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UHH extends AbstractC029409q<UHI> {
    public final List<LocationObject> LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public int LJLJL;
    public final int LJLJLJ;
    public UHJ LJLJLLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<LocationObject> list = this.LJLIL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(UHI uhi, int i) {
        String str;
        boolean z;
        UHI holder = uhi;
        o.LJIIIZ(holder, "holder");
        List<LocationObject> list = this.LJLIL;
        if (list != null) {
            boolean z2 = false;
            if (!this.LJLJJI || (i != 0 && o.LJ(((LocationObject) ListProtector.get(list, i)).M(), ((LocationObject) ListProtector.get(list, i - 1)).M()))) {
                str = "";
            } else {
                str = String.valueOf(((LocationObject) ListProtector.get(list, i)).name.charAt(0));
            }
            LocationObject l = (LocationObject) ListProtector.get(list, i);
            o.LJIIIZ(l, "l");
            holder.LJLILLLLZI.setText(l.name);
            if (!o.LJ(str, "")) {
                holder.LJLIL.setVisibility(0);
                holder.LJLIL.setText(str);
            } else {
                holder.LJLIL.setVisibility(8);
            }
            if (this.LJLILLLLZI == this.LJLJI) {
                z = true;
            } else {
                z = false;
            }
            holder.LJLILLLLZI.setVisibility(0);
            if (z) {
                holder.LJLJJI.setVisibility(0);
                holder.LJLJI.setVisibility(8);
            } else {
                holder.LJLJI.setVisibility(0);
                holder.LJLJJI.setVisibility(8);
            }
            C41061jK c41061jK = holder.LJLJJI;
            if (i == this.LJLJL) {
                z2 = true;
            }
            c41061jK.setChecked(z2);
            C16880lQ.LJIIJ(new ACListenerS23S0301000_13(this, holder, list, i, 0), holder.itemView);
            if (this.LJLILLLLZI == this.LJLJI && this.LJLJL == -1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(((LocationObject) ListProtector.get(list, i)).L());
                LIZ.append(", ");
                LIZ.append(this.LJLJJLL);
                if (o.LJ(X1D.LIZIZ(LIZ), this.LJLJJL)) {
                    this.LJLJL = i;
                    holder.LJLJJI.setChecked(true);
                    UHJ uhj = this.LJLJLLL;
                    if (uhj != null) {
                        uhj.LIZIZ((LocationObject) ListProtector.get(list, i));
                    }
                }
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final UHI com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLZIIL(this.LJLJLJ, C16880lQ.LLZIL(parent.getContext()), null);
        o.LJIIIIZZ(view, "view");
        UHI uhi = new UHI(view);
        C0AX.LIZ(parent, uhi.itemView, R.id.lj7);
        View view2 = uhi.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (uhi.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(UHI.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) uhi.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(uhi.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = UHI.class.getName();
        return uhi;
    }

    public UHH(List<LocationObject> list, int i, int i2, boolean z, String defaultLocation, String currentLocation) {
        o.LJIIIZ(defaultLocation, "defaultLocation");
        o.LJIIIZ(currentLocation, "currentLocation");
        this.LJLIL = list;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = z;
        this.LJLJJL = defaultLocation;
        this.LJLJJLL = currentLocation;
        this.LJLJL = -1;
        this.LJLJLJ = R.layout.d74;
    }
}
