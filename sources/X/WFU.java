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
import defpackage.e1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WFU extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public final List<C81975WFf> LJLILLLLZI;
    public boolean LJLJI;
    public InterfaceC88472Yns<? super C81975WFf, C76800UCe> LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public final void LJLZ(List<? extends C81975WFf> list) {
        ArrayList arrayList = new ArrayList(this.LJLILLLLZI);
        ((ArrayList) this.LJLILLLLZI).clear();
        ((ArrayList) this.LJLILLLLZI).addAll(list);
        C03200Aq.LIZ(new WFX(arrayList, this.LJLILLLLZI), true).LIZJ(this);
    }

    public WFU(List<? extends C81975WFf> list, InterfaceC65784Pro<C76800UCe> autoHideToolBarMoreScene) {
        o.LJIIIZ(autoHideToolBarMoreScene, "autoHideToolBarMoreScene");
        this.LJLIL = autoHideToolBarMoreScene;
        ArrayList arrayList = new ArrayList();
        this.LJLILLLLZI = arrayList;
        this.LJLJI = true;
        this.LJLJJL = C7MY.LIZIZ(2);
        this.LJLJJLL = C7MY.LIZIZ(1);
        arrayList.addAll(list);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        SmartImageView smartImageView;
        int i2;
        int i3;
        float f;
        int i4;
        WFY wfy;
        InterfaceC81974WFe interfaceC81974WFe;
        InterfaceC81973WFd interfaceC81973WFd;
        o.LJIIIZ(holder, "holder");
        C81975WFf c81975WFf = (C81975WFf) ListProtector.get(this.LJLILLLLZI, i);
        InterfaceC88472Yns<? super C81975WFf, C76800UCe> interfaceC88472Yns = this.LJLJJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c81975WFf);
        }
        C81970WFa c81970WFa = (C81970WFa) holder;
        SmartImageView smartImageView2 = c81970WFa.LJLIL;
        if (C53557L0f.LIZ() && c81975WFf.LJLIL == 1) {
            c81975WFf.LJLLJ = new C81408VxE(this, smartImageView2);
        }
        if (c81975WFf.LJLIL == 18 && (interfaceC81973WFd = c81975WFf.LJLLJ) != null) {
            interfaceC81973WFd.LIZ(c81970WFa);
        }
        ImageUrlModel imageUrlModel = c81975WFf.LJLJJL;
        int i5 = 0;
        if (imageUrlModel != null) {
            W5F LJII = W5U.LJII(imageUrlModel);
            LJII.LJIIL = 0;
            LJII.LJJIIJ = smartImageView2;
            C16880lQ.LLJJJ(LJII);
        } else if (c81975WFf.LJLJI != -1) {
            try {
                ViewGroup.LayoutParams layoutParams = smartImageView2.getLayoutParams();
                int i6 = c81975WFf.LJLJJI;
                if (i6 == 0) {
                    i6 = R.attr.dj;
                }
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZJ = layoutParams.height - O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
                int i7 = layoutParams.width;
                if (c81975WFf.LJLIL == 0) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                c2068389v.LIZIZ = i7 - O6R.LJJIIZ(C32151Nz.LJIIZILJ(i2));
                c2068389v.LIZ = c81975WFf.LJLJI;
                c2068389v.LJ = Integer.valueOf(i6);
                Context context = smartImageView2.getContext();
                o.LJIIIIZZ(context, "icon.context");
                smartImageView2.setImageDrawable(c2068389v.LIZ(context));
            } catch (Throwable unused) {
            }
            if (c81975WFf.LJLIL == 0) {
                C26338AVi.LJIIIZ(smartImageView2, Integer.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJJL), 16);
            } else {
                C26338AVi.LJIIIZ(smartImageView2, Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJL), 16);
            }
            if ((holder instanceof C81970WFa) && (smartImageView = c81970WFa.LJLJJLL) != null) {
                smartImageView.setVisibility(0);
            }
        } else {
            smartImageView2.setImageResource(c81975WFf.LJLILLLLZI);
        }
        if (c81975WFf.LJLJJLL && !c81975WFf.LJLJL) {
            i3 = 255;
        } else {
            i3 = 127;
        }
        smartImageView2.setImageAlpha(i3);
        TextView textView = c81970WFa.LJLILLLLZI;
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        if (c81975WFf.LJLJJLL && !c81975WFf.LJLJL) {
            f = 1.0f;
        } else {
            f = 0.49803922f;
        }
        textView.setAlpha(f);
        if (c81975WFf.LJLLLLLL <= 0) {
            textView.setVisibility(8);
            view.setContentDescription(null);
        } else {
            textView.setVisibility(0);
            textView.setText(c81975WFf.LJLLLLLL);
            view.setContentDescription(view.getContext().getText(c81975WFf.LJLLLLLL));
        }
        if (c81975WFf.LJLLL && (interfaceC81974WFe = c81975WFf.LJLZ) != null) {
            interfaceC81974WFe.LIZIZ(smartImageView2);
        }
        if (c81975WFf.LJLIL == 8 && this.LJLJI) {
            Context context2 = smartImageView2.getContext();
            o.LJIIIIZZ(context2, "icon.context");
            Activity LIZ = C105574Cj.LIZ(context2);
            if (LIZ != null) {
                this.LJLJI = false;
                C81434Vxe.LIZ(LIZ, smartImageView2);
            }
        }
        C164106cI c164106cI = c81970WFa.LJLJI;
        if (c81975WFf.LJLJLJ) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        c164106cI.setVisibility(i4);
        int i8 = c81975WFf.LJLL;
        if (i8 > 0) {
            c81970WFa.LJLJJI.setIconRes(i8);
        }
        TuxIconView tuxIconView = c81970WFa.LJLJJI;
        if (!c81975WFf.LJLJLLL) {
            i5 = 8;
        }
        tuxIconView.setVisibility(i5);
        if (HYC.LIZ) {
            InterfaceC81972WFc interfaceC81972WFc = c81975WFf.LJLLI;
            if ((interfaceC81972WFc instanceof WFY) && (wfy = (WFY) interfaceC81972WFc) != null) {
                wfy.LJ(c81970WFa.LJLJJI);
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        int i2;
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        int LJJI = SFS.LJJI(C81184Vtc.LIZIZ(context), context);
        boolean z = true;
        if (e1.LIZ(31744, "record_toolbar_small_screen_adaptation", true, false) && LJJI <= 640) {
            i2 = R.layout.bdy;
        } else {
            i2 = R.layout.bdw;
        }
        C81970WFa c81970WFa = new C81970WFa(this, C1FL.LIZIZ(parent, i2, parent, false, "from(parent.context).inf…te(layout, parent, false)"));
        C0AX.LIZ(parent, c81970WFa.itemView, R.id.lj7);
        View view = c81970WFa.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c81970WFa.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C81970WFa.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c81970WFa.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c81970WFa.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C81970WFa.class.getName();
        return c81970WFa;
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
