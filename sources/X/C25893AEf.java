package X;

import Y.ACListenerS24S0100000_4;
import Y.IDCListenerS142S0200000_4;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.trill.setting.ImagesData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AEf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25893AEf extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final InterfaceC25897AEj LJLIL;
    public boolean LJLILLLLZI;
    public List<C25895AEh> LJLJI;
    public boolean LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        int i;
        int i2;
        boolean z = this.LJLILLLLZI;
        if (this.LJLJJI) {
            i2 = this.LJLJI.size();
        } else {
            int LJLLLLLL = LJLLLLLL();
            if (LJLLLLLL() <= this.LJLJI.size()) {
                i = 1;
            } else {
                i = 0;
            }
            i2 = LJLLLLLL + i;
        }
        return (z ? 1 : 0) + i2;
    }

    public final int LJLLLLLL() {
        ContentLanguage[] LIZ = C2299390r.LIZ();
        String appLanguage = SettingServiceImpl.LIZ().getAppLanguage();
        if (LIZ.length == 0) {
            List<C25895AEh> list = this.LJLJI;
            ArrayList arrayList = new ArrayList();
            for (C25895AEh c25895AEh : list) {
                if (o.LJ(c25895AEh.LJLIL, appLanguage)) {
                    arrayList.add(c25895AEh);
                }
            }
            return arrayList.size();
        }
        List<C25895AEh> list2 = this.LJLJI;
        ArrayList arrayList2 = new ArrayList();
        for (C25895AEh c25895AEh2 : list2) {
            if (o.LJ(c25895AEh2.LJLIL, appLanguage)) {
                arrayList2.add(c25895AEh2);
            }
        }
        int size = arrayList2.size();
        List<C25895AEh> list3 = this.LJLJI;
        ArrayList arrayList3 = new ArrayList();
        for (C25895AEh c25895AEh3 : list3) {
            C25895AEh c25895AEh4 = c25895AEh3;
            int length = LIZ.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    ContentLanguage contentLanguage = LIZ[i];
                    if (!o.LJ(contentLanguage.getLanguageCode(), appLanguage) && o.LJ(c25895AEh4.LJLIL, contentLanguage.getLanguageCode())) {
                        arrayList3.add(c25895AEh3);
                        break;
                    }
                    i++;
                }
            }
        }
        return arrayList3.size() + size;
    }

    public C25893AEf(InterfaceC25897AEj delegate) {
        o.LJIIIZ(delegate, "delegate");
        this.LJLIL = delegate;
        this.LJLJI = C61878OQg.INSTANCE;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (this.LJLILLLLZI) {
            if (i == 0) {
                return 0;
            }
            if (!this.LJLJJI && i >= LJLLLLLL() + 1) {
                return 2;
            }
        } else if (!this.LJLJJI && i >= LJLLLLLL()) {
            return 2;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        C25892AEe c25892AEe;
        int i2;
        int i3;
        int i4;
        int i5;
        C25894AEg c25894AEg;
        Object LIZ;
        String str;
        SmartImageView smartImageView;
        o.LJIIIZ(holder, "holder");
        int itemViewType = getItemViewType(i);
        Object obj = null;
        if (itemViewType == 0) {
            if ((holder instanceof C25894AEg) && (c25894AEg = (C25894AEg) holder) != null) {
                try {
                    LIZ = (ImagesData) SettingsManager.LIZLLL().LJIIIIZZ("content_language_panel_images", ImagesData.class, null);
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (!C3C5.m12isFailureimpl(LIZ)) {
                    obj = LIZ;
                }
                ImagesData imagesData = (ImagesData) obj;
                if (imagesData != null && (str = imagesData.lightUrl) != null && (smartImageView = (SmartImageView) c25894AEg.LJLIL.getValue()) != null) {
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                    LJIIIIZZ.LJJIIJ = smartImageView;
                    LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
                    C16880lQ.LLJJJ(LJIIIIZZ);
                    return;
                }
                return;
            }
            return;
        }
        if (itemViewType == 1) {
            if ((holder instanceof C25892AEe) && (c25892AEe = (C25892AEe) holder) != null) {
                C68322mC c68322mC = new C68322mC();
                ?? r0 = ListProtector.get(this.LJLJI, i - (this.LJLILLLLZI ? 1 : 0));
                c68322mC.element = r0;
                c25892AEe.LJLIL.setTitle(((C25895AEh) r0).LJLILLLLZI);
                boolean LJIIL = c25892AEe.LJLILLLLZI.LJIIL();
                boolean z = ((C25895AEh) c68322mC.element).LJLJI;
                if (LJIIL != z) {
                    c25892AEe.LJLILLLLZI.LJIILIIL(z);
                }
                c25892AEe.LJLILLLLZI.LJIILL(new IDCListenerS142S0200000_4(this, c68322mC, 6));
                if (i == 0) {
                    c25892AEe.LJLIL.LJ(true, false);
                    C26338AVi.LJI(c25892AEe.LJLIL, null, AnonymousClass391.LIZJ(8), null, 0, false, 21);
                    return;
                }
                if (i == getItemCount() - 1) {
                    c25892AEe.LJLIL.LJ(false, true);
                    AI8 ai8 = c25892AEe.LJLIL;
                    int LIZIZ = C7MY.LIZIZ(16);
                    if (this.LJLILLLLZI) {
                        i4 = C7MY.LIZIZ(12);
                    } else {
                        i4 = 0;
                    }
                    if (this.LJLILLLLZI) {
                        i5 = C7MY.LIZIZ(12);
                    } else {
                        i5 = 0;
                    }
                    C26338AVi.LJI(ai8, Integer.valueOf(i4), 0, Integer.valueOf(i5), Integer.valueOf(LIZIZ), false, 16);
                    return;
                }
                c25892AEe.LJLIL.LJ(false, false);
                AI8 ai82 = c25892AEe.LJLIL;
                if (this.LJLILLLLZI) {
                    i2 = C7MY.LIZIZ(12);
                } else {
                    i2 = 0;
                }
                if (this.LJLILLLLZI) {
                    i3 = C7MY.LIZIZ(12);
                } else {
                    i3 = 0;
                }
                C26338AVi.LJI(ai82, Integer.valueOf(i2), 0, Integer.valueOf(i3), 0, false, 16);
                return;
            }
            return;
        }
        if (itemViewType == 2 && (holder instanceof C25896AEi) && holder != null) {
            C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 322), holder.itemView);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c25896AEi;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i == 0) {
            c25896AEi = new C25894AEg(C1FL.LIZIZ(parent, R.layout.cld, parent, false, "from(parent.context)\n   …ge_header, parent, false)"));
        } else if (i == 1) {
            c25896AEi = new C25892AEe(C1FL.LIZIZ(parent, R.layout.clf, parent, false, "from(parent.context)\n   …guage_row, parent, false)"));
        } else if (i == 2) {
            c25896AEi = new C25896AEi(C1FL.LIZIZ(parent, R.layout.cle, parent, false, "from(parent.context)\n   …_more_row, parent, false)"));
        } else {
            throw new IllegalStateException("Unknown view type");
        }
        C0AX.LIZ(parent, c25896AEi.itemView, R.id.lj7);
        View view = c25896AEi.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c25896AEi.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c25896AEi.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c25896AEi.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c25896AEi.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c25896AEi.getClass().getName();
        return c25896AEi;
    }
}
