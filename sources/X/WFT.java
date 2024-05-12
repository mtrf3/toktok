package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WFT extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<C81975WFf> LJLIL;
    public boolean LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    public WFT(List<? extends C81975WFf> list) {
        ArrayList arrayList = new ArrayList();
        this.LJLIL = arrayList;
        this.LJLILLLLZI = true;
        this.LJLJI = C7MY.LIZIZ(2);
        this.LJLJJI = C7MY.LIZIZ(1);
        arrayList.addAll(list);
    }

    public final void LJLZ(List<? extends C81975WFf> list) {
        ArrayList arrayList = new ArrayList(this.LJLIL);
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLIL).addAll(list);
        C03200Aq.LIZ(new WFW(arrayList, this.LJLIL), true).LIZJ(this);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        int i2;
        int i3;
        float f;
        WFY wfy;
        InterfaceC81974WFe interfaceC81974WFe;
        o.LJIIIZ(holder, "holder");
        C81975WFf c81975WFf = (C81975WFf) ListProtector.get(this.LJLIL, i);
        WFV wfv = (WFV) holder;
        SmartImageView smartImageView = wfv.LJLIL;
        if (C53557L0f.LIZ() && c81975WFf.LJLIL == 1) {
            c81975WFf.LJLLJ = new C81405VxB(this, smartImageView);
        }
        ImageUrlModel imageUrlModel = c81975WFf.LJLJJL;
        if (imageUrlModel != null) {
            W5F LJII = W5U.LJII(imageUrlModel);
            LJII.LJIIJJI = c81975WFf.LJLILLLLZI;
            LJII.LJJIIJ = smartImageView;
            C16880lQ.LLJJJ(LJII);
        } else if (c81975WFf.LJLJI != -1) {
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            int i4 = c81975WFf.LJLJJI;
            if (i4 == 0) {
                i4 = R.attr.dj;
            }
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZJ = C47135Ieh.LIZ(4, layoutParams.height);
            int i5 = layoutParams.width;
            if (c81975WFf.LJLIL == 0) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            c2068389v.LIZIZ = i5 - O6R.LJJIIZ(C32151Nz.LJIIZILJ(i2));
            c2068389v.LIZ = c81975WFf.LJLJI;
            c2068389v.LJ = Integer.valueOf(i4);
            c2068389v.LJFF = true;
            Context context = smartImageView.getContext();
            o.LJIIIIZZ(context, "icon.context");
            smartImageView.setImageDrawable(c2068389v.LIZ(context));
            if (c81975WFf.LJLIL == 0) {
                C26338AVi.LJIIIZ(smartImageView, Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJI), 16);
            } else {
                C26338AVi.LJIIIZ(smartImageView, Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJI), 16);
            }
        } else {
            smartImageView.setImageResource(c81975WFf.LJLILLLLZI);
        }
        if (c81975WFf.LJLJJLL) {
            i3 = 255;
        } else {
            i3 = 127;
        }
        smartImageView.setImageAlpha(i3);
        TextView textView = wfv.LJLJI;
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        if (c81975WFf.LJLJJLL) {
            f = 1.0f;
        } else {
            f = 0.49803922f;
        }
        textView.setAlpha(f);
        int i6 = 0;
        if (c81975WFf.LJLLLLLL <= 0) {
            textView.setVisibility(8);
            view.setContentDescription(null);
        } else {
            textView.setVisibility(0);
            textView.setText(c81975WFf.LJLLLLLL);
            view.setContentDescription(view.getContext().getText(c81975WFf.LJLLLLLL));
        }
        if (c81975WFf.LJLLL && (interfaceC81974WFe = c81975WFf.LJLZ) != null) {
            interfaceC81974WFe.LIZIZ(smartImageView);
        }
        if (c81975WFf.LJLIL == 6 && this.LJLILLLLZI) {
            Context context2 = smartImageView.getContext();
            o.LJIIIIZZ(context2, "icon.context");
            Activity LIZ = C105574Cj.LIZ(context2);
            if (LIZ != null) {
                this.LJLILLLLZI = false;
                C81434Vxe.LIZ(LIZ, smartImageView);
            }
        }
        TuxIconView tuxIconView = wfv.LJLJJI;
        if (!c81975WFf.LJLJLLL) {
            i6 = 8;
        }
        tuxIconView.setVisibility(i6);
        if (HYC.LIZ && c81975WFf.LJLIL == 4) {
            InterfaceC81972WFc interfaceC81972WFc = c81975WFf.LJLLI;
            if ((interfaceC81972WFc instanceof WFY) && (wfy = (WFY) interfaceC81972WFc) != null) {
                wfy.LJ(wfv.LJLILLLLZI);
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        WFV wfv = new WFV(this, C1FL.LIZIZ(parent, R.layout.az2, parent, false, "from(parent.context).inf…mall_icon, parent, false)"));
        C0AX.LIZ(parent, wfv.itemView, R.id.lj7);
        View view = wfv.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (wfv.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(WFV.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) wfv.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(wfv.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = WFV.class.getName();
        return wfv;
    }

    public static final C39661h4 LJLLLLLL(SmartImageView smartImageView, AbstractC45091pp abstractC45091pp, float f, float f2) {
        C39661h4 c39661h4 = new C39661h4(smartImageView, abstractC45091pp, f2);
        c39661h4.LJIL.LIZIZ(300.0f);
        c39661h4.LJIL.LIZ(0.594f);
        c39661h4.LJI(f);
        c39661h4.LIZ = 0.0f;
        return c39661h4;
    }
}
