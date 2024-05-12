package X;

import Y.ACListenerS42S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.GAn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41085GAn extends AbstractC029409q<C41086GAo> {
    public List<TranslatedRegion> LJLIL;
    public final List<TranslatedRegion> LJLILLLLZI;
    public final C73849Syb<Boolean> LJLJI;
    public List<TranslatedRegion> LJLJJI;

    public final List<TranslatedRegion> LJLLLLLL() {
        List<TranslatedRegion> list = this.LJLIL;
        ArrayList arrayList = new ArrayList();
        for (TranslatedRegion translatedRegion : list) {
            if (translatedRegion.getSelected()) {
                arrayList.add(translatedRegion);
            }
        }
        return arrayList;
    }

    public final void LJLZ() {
        TranslatedRegion translatedRegion;
        List<TranslatedRegion> list = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        for (TranslatedRegion translatedRegion2 : list) {
            if (translatedRegion2.getSelected()) {
                arrayList.add(translatedRegion2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TranslatedRegion translatedRegion3 = (TranslatedRegion) it.next();
            Iterator<TranslatedRegion> it2 = this.LJLIL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    translatedRegion = it2.next();
                    if (o.LJ(translatedRegion.getCode(), translatedRegion3.getCode())) {
                        break;
                    }
                } else {
                    translatedRegion = null;
                    break;
                }
            }
            TranslatedRegion translatedRegion4 = translatedRegion;
            if (translatedRegion4 != null) {
                translatedRegion4.setSelected(true);
            }
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJI.size();
    }

    public final void LJZ(String filter) {
        o.LJIIIZ(filter, "filter");
        List<TranslatedRegion> list = this.LJLIL;
        ArrayList arrayList = new ArrayList();
        for (TranslatedRegion translatedRegion : list) {
            if (s.LJJLIIIJL(translatedRegion.getTranslation(), filter, 0, true, 2) != -1) {
                arrayList.add(translatedRegion);
            }
        }
        this.LJLJJI = arrayList;
        notifyDataSetChanged();
    }

    public C41085GAn(C61878OQg regionList, List selectedRegion) {
        o.LJIIIZ(regionList, "regionList");
        o.LJIIIZ(selectedRegion, "selectedRegion");
        this.LJLIL = regionList;
        this.LJLILLLLZI = selectedRegion;
        this.LJLJI = C73849Syb.LJJZZI(Boolean.FALSE);
        this.LJLJJI = this.LJLIL;
        LJLZ();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C41086GAo c41086GAo, int i) {
        int i2;
        C41086GAo holder = c41086GAo;
        o.LJIIIZ(holder, "holder");
        TranslatedRegion translatedRegion = (TranslatedRegion) ListProtector.get(this.LJLJJI, i);
        holder.LJLIL.setText(translatedRegion.getTranslation());
        ImageView imageView = holder.LJLILLLLZI;
        if (translatedRegion.getSelected()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        C16880lQ.LJIIJ(new ACListenerS42S0200000_7(translatedRegion, this, 48), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C41086GAo com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bc6, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        C41086GAo c41086GAo = new C41086GAo(itemView);
        C0AX.LIZ(viewGroup, c41086GAo.itemView, R.id.lj7);
        View view = c41086GAo.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c41086GAo.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C41086GAo.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c41086GAo.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c41086GAo.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C41086GAo.class.getName();
        return c41086GAo;
    }
}
