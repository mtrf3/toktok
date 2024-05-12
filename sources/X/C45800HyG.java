package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HyG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45800HyG extends AbstractC45801HyH<C157166Eu> {
    public int LJLILLLLZI = -1;
    public int LJLJI = -1;
    public final /* synthetic */ C74496TLo LJLJJI;

    public final void LJZI() {
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        int i = -1;
        while (it.hasNext()) {
            C157166Eu c157166Eu = (C157166Eu) it.next();
            i++;
            List<MyMediaModel> list = this.LJLJJI.LJJJJLI;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<MyMediaModel> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (o.LJ(it2.next().id, ((ProviderEffect) c157166Eu.LJLIL).getId())) {
                        notifyItemChanged(i, new Object());
                        break;
                    }
                }
            }
        }
    }

    public final void LJZL() {
        C15070iV<Integer, Integer> LIZ = C8DQ.LIZ(this.LJLJJI.LJIIL());
        Integer num = LIZ.LIZ;
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        Integer num2 = LIZ.LIZIZ;
        if (num2 == null) {
            return;
        }
        notifyItemRangeChanged(intValue, (num2.intValue() - intValue) + 1, new Object());
    }

    public C45800HyG(C74496TLo c74496TLo) {
        this.LJLJJI = c74496TLo;
    }

    @Override // X.AbstractC45801HyH
    public final void LJLLLLLL(List<? extends C157166Eu> list) {
        if (list == null) {
            return;
        }
        int size = ((ArrayList) this.LJLJJI.LJJJJL).size();
        Iterator<? extends C157166Eu> it = list.iterator();
        while (it.hasNext()) {
            MyMediaModel LJZ = LJZ((com.ss.android.ugc.effectmanager.effect.model.ProviderEffect) it.next().LJLIL);
            if (LJZ != null) {
                LJZ.mediaIndex = size;
                size++;
                ((ArrayList) this.LJLJJI.LJJJJL).add(LJZ);
            }
        }
        super.LJLLLLLL(list);
    }

    @Override // X.AbstractC45801HyH
    public final void LJLZ(List<? extends C157166Eu> list) {
        ((ArrayList) this.LJLJJI.LJJJJL).clear();
        if (list == null) {
            return;
        }
        Iterator<? extends C157166Eu> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            MyMediaModel LJZ = LJZ((com.ss.android.ugc.effectmanager.effect.model.ProviderEffect) it.next().LJLIL);
            if (LJZ != null) {
                LJZ.mediaIndex = i;
                ((ArrayList) this.LJLJJI.LJJJJL).add(LJZ);
            }
            i = i2;
        }
        super.LJLZ(list);
    }

    public final MyMediaModel LJZ(com.ss.android.ugc.effectmanager.effect.model.ProviderEffect providerEffect) {
        Object obj;
        Iterator it = ((ArrayList) this.LJLJJI.LJJJJLI).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((MediaModel) obj).id, providerEffect.getId())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        MyMediaModel myMediaModel = (MyMediaModel) obj;
        if (myMediaModel != null) {
            return myMediaModel;
        }
        MediaModel LJIILJJIL = C46104I7o.LJIILJJIL(providerEffect, new C45495HtL(false, false, 0, false, 8, null));
        if (LJIILJJIL == null) {
            return null;
        }
        MyMediaModel.Companion.getClass();
        return C43966HNi.LIZIZ(LJIILJJIL);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        C157166Eu c157166Eu = (C157166Eu) ListProtector.get(this.LJLIL, i);
        this.LJLJJI.LJII(holder, i, (com.ss.android.ugc.effectmanager.effect.model.ProviderEffect) c157166Eu.LJLIL, (TEA) c157166Eu.LJLILLLLZI, (Integer) c157166Eu.LJLJI);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C74496TLo c74496TLo = this.LJLJJI;
        RecyclerView.ViewHolder LJIIIZ = c74496TLo.LJIIIZ(parent, c74496TLo.LJJJJLL);
        InterfaceC88472Yns<? super RecyclerView.ViewHolder, C76800UCe> interfaceC88472Yns = this.LJLJJI.LIZ.LIZLLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(LJIIIZ);
        }
        C0AX.LIZ(parent, LJIIIZ.itemView, R.id.lj7);
        View view = LJIIIZ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (LJIIIZ.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LJIIIZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) LJIIIZ.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(LJIIIZ.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LJIIIZ.getClass().getName();
        return LJIIIZ;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        C74499TLr c74499TLr;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (!this.LJLJJI.LJJIZ || payloads.isEmpty()) {
            onBindViewHolder(holder, i);
        } else {
            if (!(holder instanceof C74499TLr) || (c74499TLr = (C74499TLr) holder) == null) {
                return;
            }
            c74499TLr.P(true);
        }
    }
}
