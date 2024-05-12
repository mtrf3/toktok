package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.MallMainToolPanelBean;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.ShopMainContentBean;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS0S0010100_9;
import kotlin.jvm.internal.AqS14S0010000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS38S0100100_9;
import kotlin.jvm.internal.AqS4S1001000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Lza, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56074Lza extends AbstractC029409q<RecyclerView.ViewHolder> implements M1Y {
    public final ShopMainContentBean LJLIL;
    public final MallMainToolPanelBean LJLILLLLZI;
    public final InterfaceC56083Lzj LJLJI;
    public C56020Lyi LJLJJI;
    public C55975Lxz LJLJJL;
    public AqS38S0100100_9 LJLJJLL;
    public C56075Lzb LJLJL;

    @Override // X.M1Y
    public final void LJJJJJL() {
        EnumC56059LzL enumC56059LzL;
        TemplateData templateData;
        C36746EbW.LIZ(3, "ErrorViewDisplay");
        C56075Lzb c56075Lzb = this.LJLJL;
        if (c56075Lzb != null) {
            c56075Lzb.setLynxLoadStatus(true);
        }
        C56075Lzb c56075Lzb2 = this.LJLJL;
        if (c56075Lzb2 != null) {
            C56020Lyi c56020Lyi = this.LJLJJI;
            Object obj = null;
            if (c56020Lyi != null) {
                enumC56059LzL = c56020Lyi.LJLJLJ;
            } else {
                enumC56059LzL = null;
            }
            C36746EbW.LIZ(3, "ErrorViewDisplay");
            try {
                if (c56075Lzb2.LJLJL != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c56075Lzb2.LJLJI;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                        obj = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
                    }
                    if ((obj instanceof VNS) && (templateData = c56075Lzb2.LJLJL) != null) {
                        if (!((HashMap) templateData.LJIIIIZZ()).containsKey("error_code") && enumC56059LzL != null) {
                            templateData.LJI("type", enumC56059LzL.getValue());
                        }
                        c56075Lzb2.LIZ(c56020Lyi, false);
                        ((VNS) obj).updateData(templateData);
                    }
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C56045Lz7.LIZ.getClass();
        C76542zS.LIZJ("rd_tiktokec_lynx_template_result", new AqS14S0010000_9(true, 9));
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return 3;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i != 0) {
            return i != 1 ? 2 : 1;
        }
        return 0;
    }

    @Override // X.M1Y
    public final void LJIILJJIL() {
        int i;
        int i2;
        this.LJLJI.LJIILJJIL();
        C36746EbW.LIZ(3, "lynxDataTemplate onSparkLoadFailed");
        RecyclerView recyclerView = this.LJLIL.getRecyclerView();
        if (recyclerView != null) {
            i = recyclerView.getHeight();
        } else {
            i = 0;
        }
        C55975Lxz c55975Lxz = this.LJLJJL;
        if (c55975Lxz != null) {
            i2 = c55975Lxz.getHeight();
        } else {
            i2 = 0;
        }
        int i3 = i - i2;
        C56075Lzb c56075Lzb = this.LJLJL;
        if (c56075Lzb != null) {
            if (i3 <= 0) {
                i3 = -1;
            }
            C56020Lyi c56020Lyi = this.LJLJJI;
            C36746EbW.LIZ(3, "ErrorViewDisplay");
            if (c56020Lyi != null) {
                ILR ilr = ILR.FAILED;
                o.LJIIIZ(ilr, "<set-?>");
                c56020Lyi.LJLLLLLL = ilr;
            }
            c56075Lzb.setVisibility(0);
            if (c56075Lzb.LJLJJI == null) {
                Context context = c56075Lzb.getContext();
                o.LJIIIIZZ(context, "context");
                C73305Spp c73305Spp = new C73305Spp(context, null, 6);
                c56075Lzb.LJLJJI = c73305Spp;
                c73305Spp.setLayoutParams(new FrameLayout.LayoutParams(-1, i3));
                c56075Lzb.addView(c56075Lzb.LJLJJI);
            }
            C73305Spp c73305Spp2 = c56075Lzb.LJLJJI;
            if (c73305Spp2 != null) {
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJIIJ(c73306Spq, new AqS159S0100000_9(c56075Lzb, 14));
                c73305Spp2.setStatus(c73306Spq);
            }
            C36746EbW.LIZ(3, "lynxDataTemplate setErrorViewVis");
            c56075Lzb.setErrorViewVis$ecommerce_fashionmall_release(true);
            C36746EbW.LIZ(3, "lynxDataTemplate setSkeletonViewVis");
            c56075Lzb.setSkeletonViewVis$ecommerce_fashionmall_release(false);
            C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
            int status = EnumC56039Lz1.SHOW.getStatus();
            String errMsg = EnumC56120M0u.NO_DATA.getErrMsg();
            c56045Lz7.getClass();
            C56045Lz7.LJII(status, errMsg);
        }
        C56045Lz7.LIZ.getClass();
        C76542zS.LIZJ("rd_tiktokec_lynx_template_result", new AqS14S0010000_9(false, 9));
    }

    @Override // X.M1Y
    public final void LJLJI(LynxError lynxError) {
        if (lynxError != null) {
            C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
            int i = lynxError.LIZ;
            String LIZ = lynxError.LIZ();
            o.LJIIIIZZ(LIZ, "lynxError.msg");
            c56045Lz7.getClass();
            C76542zS.LIZJ("rd_tiktokec_mall_lynx_fail", new AqS4S1001000_9(i, LIZ, 1));
        }
    }

    @Override // X.M1Y
    public final void LJJIIJZLJL(long j, boolean z) {
        C56075Lzb c56075Lzb = this.LJLJL;
        boolean z2 = false;
        if (c56075Lzb != null) {
            c56075Lzb.setSparkViewVis$ecommerce_fashionmall_release(true);
            C36746EbW.LIZ(3, "lynxDataTemplate setSkeletonViewVis");
            c56075Lzb.setSkeletonViewVis$ecommerce_fashionmall_release(false);
            c56075Lzb.setErrorViewVis$ecommerce_fashionmall_release(false);
        }
        InterfaceC56083Lzj interfaceC56083Lzj = this.LJLJI;
        C56075Lzb c56075Lzb2 = this.LJLJL;
        if (c56075Lzb2 != null) {
            z2 = c56075Lzb2.LJLJJL;
        }
        interfaceC56083Lzj.LJIJJLI(z2, z);
        long currentTimeMillis = System.currentTimeMillis() - j;
        C56045Lz7.LIZ.getClass();
        C76542zS.LIZJ("rd_tiktokec_mall_page_lynx_dur", new AqS0S0010100_9(currentTimeMillis, z, 1));
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof C56001LyP) {
            MallMainToolPanelBean data = this.LJLILLLLZI;
            o.LJIIIZ(data, "data");
            C55999LyN.LIZ(((C56001LyP) holder).LJLIL, data);
        } else {
            if (!(holder instanceof C56073LzZ)) {
                return;
            }
            ShopMainContentBean data2 = this.LJLIL;
            o.LJIIIZ(data2, "data");
            C56060LzM.LIZ(((C56073LzZ) holder).LJLIL, data2);
        }
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c56086Lzm;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                C56075Lzb c56075Lzb = this.LJLJL;
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
                if (c56075Lzb != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = c56075Lzb.LJLJI;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
                    }
                    c56075Lzb.LJLJI = null;
                    M1V monitor = c56075Lzb.LJLJLLL;
                    o.LJIIJ(monitor, "monitor");
                    C61269O2v.LIZ.remove(monitor);
                }
                Context context = parent.getContext();
                o.LJIIIIZZ(context, "parent.context");
                C56075Lzb c56075Lzb2 = new C56075Lzb(context);
                this.LJLJL = c56075Lzb2;
                c56075Lzb2.setShopContentAction(this.LJLJI);
                C56075Lzb c56075Lzb3 = this.LJLJL;
                if (c56075Lzb3 != null) {
                    AqS38S0100100_9 aqS38S0100100_9 = this.LJLJJLL;
                    if (aqS38S0100100_9 != null) {
                        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) aqS38S0100100_9.invoke();
                    }
                    c56075Lzb3.setSparkView(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mShopContentView new = ");
                LIZ.append(this.LJLJL);
                C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                C56075Lzb c56075Lzb4 = this.LJLJL;
                if (c56075Lzb4 != null) {
                    c56075Lzb4.setLayoutParams(layoutParams);
                }
                C56075Lzb c56075Lzb5 = this.LJLJL;
                if (c56075Lzb5 == null) {
                    Context context2 = parent.getContext();
                    o.LJIIIIZZ(context2, "parent.context");
                    c56075Lzb5 = new C56075Lzb(context2);
                }
                c56086Lzm = new C56073LzZ(c56075Lzb5);
            } else {
                Context context3 = parent.getContext();
                o.LJIIIIZZ(context3, "parent.context");
                this.LJLJJL = new C55975Lxz(context3);
                C55975Lxz c55975Lxz = this.LJLJJL;
                if (c55975Lxz == null) {
                    Context context4 = parent.getContext();
                    o.LJIIIIZZ(context4, "parent.context");
                    c55975Lxz = new C55975Lxz(context4);
                }
                c56086Lzm = new C56001LyP(c55975Lxz);
            }
        } else {
            View view = new View(parent.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, C7MY.LIZIZ(1)));
            c56086Lzm = new C56086Lzm(view);
        }
        C0AX.LIZ(parent, c56086Lzm.itemView, R.id.lj7);
        View view2 = c56086Lzm.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c56086Lzm.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c56086Lzm.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c56086Lzm.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c56086Lzm.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c56086Lzm.getClass().getName();
        return c56086Lzm;
    }

    public C56074Lza(ShopMainContentBean shopMainContentBean, MallMainToolPanelBean mallMainToolPanelBean, C56021Lyj c56021Lyj) {
        this.LJLIL = shopMainContentBean;
        this.LJLILLLLZI = mallMainToolPanelBean;
        this.LJLJI = c56021Lyj;
    }
}
