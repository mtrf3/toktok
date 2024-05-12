package X;

import Y.ACListenerS47S0200000_13;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UYT extends AbstractC029409q<UYU> {
    public final InterfaceC88471Ynr<Integer, AbstractC77373UYf, C76800UCe> LJLIL;
    public final InterfaceC88471Ynr<Integer, AbstractC77373UYf, C76800UCe> LJLILLLLZI;
    public final InterfaceC65784Pro<AbstractC77373UYf> LJLJI;
    public final int LJLJJI = R.layout.ln;
    public final int LJLJJL = R.layout.lm;
    public final int LJLJJLL = 1;
    public final int LJLJL = 2;
    public final CopyOnWriteArrayList<AbstractC77373UYf> LJLJLJ = new CopyOnWriteArrayList<>();

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJLJ.size();
    }

    public final int LJLLLLLL(AbstractC77373UYf slideEffect) {
        o.LJIIIZ(slideEffect, "slideEffect");
        int i = 0;
        if (slideEffect instanceof C77374UYg) {
            return 0;
        }
        Iterator<AbstractC77373UYf> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            AbstractC77373UYf it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            if (C86793Y4n.LJJIIZI(it2, slideEffect)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (this.LJLJLJ.get(i) instanceof C77374UYg) {
            return this.LJLJL;
        }
        return this.LJLJJLL;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(UYU uyu, int i) {
        UYU holder = uyu;
        o.LJIIIZ(holder, "holder");
        if (i < 0 || i >= getItemCount()) {
            return;
        }
        AbstractC77373UYf abstractC77373UYf = this.LJLJLJ.get(i);
        o.LJIIIIZZ(abstractC77373UYf, "data[position]");
        AbstractC77373UYf abstractC77373UYf2 = abstractC77373UYf;
        if (abstractC77373UYf2 instanceof UYY) {
            String str = (String) ORZ.LJLLLL(C86793Y4n.LJIJJ(abstractC77373UYf2).getIconUrl().getUrlList());
            if (str != null) {
                C78764Uvg.LIZLLL((W5G) holder.LJLILLLLZI.getValue(), UriProtector.parse(str), -1, -1, new C78744UvM(), Bitmap.Config.RGB_565, null);
            }
            ((TextView) holder.LJLJI.getValue()).setText(C86793Y4n.LJIJJ(abstractC77373UYf2).getName());
        }
        C16880lQ.LJIIJ(new ACListenerS47S0200000_13(holder, this, 17), holder.itemView);
        InterfaceC88471Ynr<Integer, AbstractC77373UYf, C76800UCe> interfaceC88471Ynr = this.LJLILLLLZI;
        Integer valueOf = Integer.valueOf(i);
        AbstractC77373UYf abstractC77373UYf3 = this.LJLJLJ.get(i);
        o.LJIIIIZZ(abstractC77373UYf3, "data[position]");
        interfaceC88471Ynr.invoke(valueOf, abstractC77373UYf3);
        holder.itemView.setTag(this.LJLJLJ.get(i));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final UYU com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        UYU uyu;
        o.LJIIIZ(parent, "parent");
        if (i == this.LJLJL) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), this.LJLJJL, parent, false);
            o.LJIIIIZZ(LLLLIILL, "from(parent.context).inf…outCancel, parent, false)");
            uyu = new UYU(LLLLIILL, this.LJLJI);
        } else {
            View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), this.LJLJJI, parent, false);
            o.LJIIIIZZ(LLLLIILL2, "from(parent.context).inf…te(layout, parent, false)");
            uyu = new UYU(LLLLIILL2, this.LJLJI);
        }
        C0AX.LIZ(parent, uyu.itemView, R.id.lj7);
        View view = uyu.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (uyu.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(UYU.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) uyu.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(uyu.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = UYU.class.getName();
        return uyu;
    }

    public UYT(WZK wzk, UYV uyv, UYW uyw) {
        this.LJLIL = wzk;
        this.LJLILLLLZI = uyv;
        this.LJLJI = uyw;
    }
}
