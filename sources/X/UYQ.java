package X;

import Y.ACListenerS47S0200000_13;
import android.R;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;
import o53.IDdS197S0200000_12;

/* loaded from: classes14.dex */
public final class UYQ extends AbstractC029409q<UYP> {
    public final InterfaceC88471Ynr<Integer, AbstractC77369UYb, C76800UCe> LJLIL;
    public final InterfaceC88471Ynr<Integer, AbstractC77369UYb, C76800UCe> LJLILLLLZI;
    public final InterfaceC88471Ynr<Integer, Float, C76800UCe> LJLJI;
    public final InterfaceC65784Pro<Boolean> LJLJJI;
    public final InterfaceC65784Pro<Boolean> LJLJJL;
    public final InterfaceC65784Pro<Boolean> LJLJJLL;
    public final TEZ LJLJL;
    public final List<AbstractC77369UYb> LJLJLJ;
    public InterfaceC71856SIa LJLJLLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJLJ).size();
    }

    public final int LJLLLLLL(AbstractC77369UYb slideEffect, boolean z) {
        o.LJIIIZ(slideEffect, "slideEffect");
        if ((slideEffect instanceof C77379UYl) && z) {
            List<AbstractC77369UYb> list = this.LJLJLJ;
            ArrayList arrayList = new ArrayList();
            for (AbstractC77369UYb abstractC77369UYb : list) {
                if (abstractC77369UYb instanceof C77379UYl) {
                    arrayList.add(abstractC77369UYb);
                }
            }
            return ORZ.LLIILII(arrayList).indexOf(slideEffect);
        }
        if ((slideEffect instanceof C77376UYi) && z) {
            List<AbstractC77369UYb> list2 = this.LJLJLJ;
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC77369UYb abstractC77369UYb2 : list2) {
                if (abstractC77369UYb2 instanceof C77376UYi) {
                    arrayList2.add(abstractC77369UYb2);
                }
            }
            return arrayList2.indexOf(slideEffect);
        }
        return ((ArrayList) this.LJLJLJ).indexOf(slideEffect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(UYP uyp, int i) {
        UYP holder = uyp;
        o.LJIIIZ(holder, "holder");
        if (i < 0 || i >= getItemCount()) {
            return;
        }
        Object data = (AbstractC77369UYb) ListProtector.get(this.LJLJLJ, i);
        o.LJIIIZ(data, "data");
        if (data instanceof InterfaceC47392Iiq) {
            String str = (String) ORZ.LJLLLL(((InterfaceC47392Iiq) data).LIZ().getIconUrl().getUrlList());
            if (str != null) {
                UYQ uyq = holder.LJLJJL;
                C78764Uvg.LJ(holder.L(), UriProtector.parse(str), -1, -1, new C78743UvL(), Bitmap.Config.ARGB_8888, new IDdS197S0200000_12(uyq.LJLJL, uyq.LJLJLLL, 0), new SIY());
            }
        } else if (data instanceof C77378UYk) {
            if (holder.LJLJI.invoke().booleanValue()) {
                holder.L().setActualImageResource(R.color.transparent);
            } else {
                holder.L().setActualImageResource(com.zhiliaoapp.musically.R.drawable.vq);
            }
        } else if (data instanceof C77371UYd) {
            holder.L().setAlpha(0.0f);
            holder.itemView.setBackground(null);
            holder.setIsRecyclable(false);
            int LJ = C74275TDb.LJ(holder.L().getContext());
            float LIZ = C74275TDb.LIZ(10.0f);
            float f = -C74275TDb.LIZ(25.0f);
            holder.L().getViewTreeObserver().addOnGlobalLayoutListener(new UYO(holder, new C76732zl(), LJ, f, LIZ));
        }
        C16880lQ.LJIIJ(new ACListenerS47S0200000_13(holder, this, 31), holder.itemView);
        this.LJLILLLLZI.invoke(Integer.valueOf(i), ListProtector.get(this.LJLJLJ, i));
        holder.itemView.setTag(ListProtector.get(this.LJLJLJ, i));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final UYP com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        UYP uyp = new UYP(this, C1FL.LIZIZ(parent, com.zhiliaoapp.musically.R.layout.lj, parent, false, "from(parent.context).inf…cker_item, parent, false)"), this.LJLJI, this.LJLJJI, this.LJLJJLL);
        C0AX.LIZ(parent, uyp.itemView, com.zhiliaoapp.musically.R.id.lj7);
        View view = uyp.itemView;
        if (view != null) {
            view.setTag(com.zhiliaoapp.musically.R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (uyp.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(UYP.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) uyp.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(uyp.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = UYP.class.getName();
        return uyp;
    }

    public UYQ(AqS195S0100000_13 aqS195S0100000_13, AqS195S0100000_13 aqS195S0100000_132, AqS195S0100000_13 aqS195S0100000_133, AqS163S0100000_13 aqS163S0100000_13, InterfaceC65784Pro supportLoadMore, InterfaceC65784Pro optimizeForbidIcon, TEZ tez) {
        o.LJIIIZ(supportLoadMore, "supportLoadMore");
        o.LJIIIZ(optimizeForbidIcon, "optimizeForbidIcon");
        this.LJLIL = aqS195S0100000_13;
        this.LJLILLLLZI = aqS195S0100000_132;
        this.LJLJI = aqS195S0100000_133;
        this.LJLJJI = aqS163S0100000_13;
        this.LJLJJL = supportLoadMore;
        this.LJLJJLL = optimizeForbidIcon;
        this.LJLJL = tez;
        this.LJLJLJ = new ArrayList();
    }
}
