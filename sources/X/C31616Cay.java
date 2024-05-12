package X;

import Y.ACListenerS40S0200000_5;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.iap.model.response.iap.IapProductDetail;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionGiftSendDialog;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.o;
import webcast.api.sub.GiftSubTemplateInfo;

/* renamed from: X.Cay, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31616Cay extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final boolean LJLIL;
    public final SubscriptionGiftSendDialog LJLILLLLZI;
    public View LJLJI;
    public boolean LJLJJI;
    public C31619Cb1 LJLJJL;
    public C31614Caw LJLJJLL;

    public final void LJLLLLLL() {
        InterfaceC88472Yns<? super BZI, BZI> interfaceC88472Yns = this.LJLILLLLZI.LJZ;
        if (interfaceC88472Yns != null) {
            BZI LIZ = C28787BRn.LIZ("livesdk_subscription_gift_sub_detail_page_click");
            LIZ.LJIJJ(this.LJLILLLLZI.LJLLLLLL, "room_id");
            BZI invoke = interfaceC88472Yns.invoke(LIZ);
            if (invoke != null) {
                invoke.LJJIIJZLJL();
            }
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<GiftSubTemplateInfo> list;
        C31619Cb1 c31619Cb1 = this.LJLJJL;
        if (c31619Cb1 != null && (list = c31619Cb1.LIZ) != null) {
            return list.size();
        }
        return 0;
    }

    public final void LJLZ(C31614Caw c31614Caw) {
        if (!c31614Caw.LIZLLL) {
            return;
        }
        String str = this.LJLILLLLZI.LJLLLL;
        o.LJIIIZ(str, "<set-?>");
        c31614Caw.LJII = str;
        String str2 = c31614Caw.LJ;
        if (str2 == null) {
            str2 = "";
        }
        c31614Caw.LJ = str2;
        String id = TimeZone.getDefault().getID();
        o.LJIIIIZZ(id, "getDefault().id");
        c31614Caw.LJIIIIZZ = id;
        String str3 = this.LJLILLLLZI.LJLLLLLL;
        o.LJIIIZ(str3, "<set-?>");
        c31614Caw.LJIIIZ = str3;
        c31614Caw.LIZ = c31614Caw.LIZ;
        c31614Caw.LJI = c31614Caw.LJI;
        this.LJLJJLL = c31614Caw;
    }

    public final void LJZ(View view) {
        View view2 = this.LJLJI;
        if (view2 != null) {
            view2.setBackground(C15380j0.LJI(R.drawable.dbf));
        }
        view.setBackground(C15380j0.LJI(R.drawable.dbg));
        this.LJLJI = view;
    }

    public C31616Cay(boolean z, SubscriptionGiftSendDialog subscriptionGiftSendDialog) {
        o.LJIIIZ(subscriptionGiftSendDialog, "subscriptionGiftSendDialog");
        this.LJLIL = z;
        this.LJLILLLLZI = subscriptionGiftSendDialog;
        this.LJLJJL = new C31619Cb1();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        C31618Cb0 c31618Cb0;
        C31619Cb1 c31619Cb1;
        C31614Caw c31614Caw;
        IapProductDetail iapProductDetail;
        C35371a9 c35371a9;
        String str;
        IWalletExchange walletExchange;
        o.LJIIIZ(holder, "holder");
        String str2 = null;
        if ((holder instanceof C31618Cb0) && (c31618Cb0 = (C31618Cb0) holder) != null && (c31619Cb1 = this.LJLJJL) != null) {
            try {
                GiftSubTemplateInfo giftSubTemplateInfo = (GiftSubTemplateInfo) ListProtector.get(c31619Cb1.LIZ, i);
                java.util.Map<String, IapProductDetail> map = c31619Cb1.LIZIZ.LIZLLL;
                if (map == null || (iapProductDetail = map.get(giftSubTemplateInfo.iapId)) == null || (c35371a9 = iapProductDetail.oneTimePurchaseProduct) == null) {
                    c31614Caw = new C31614Caw(giftSubTemplateInfo.count, "", "", false, giftSubTemplateInfo.id, giftSubTemplateInfo.iapId);
                } else {
                    String LIZIZ = Q8U.LIZIZ(new Object[]{Double.valueOf(c35371a9.priceAmountMicros * 1.0E-6d)}, 1, "%.2f", "format(format, *args)");
                    String str3 = c35371a9.priceCurrencyCode;
                    IWalletService iWalletService = (IWalletService) CN1.LIZ(IWalletService.class);
                    if (iWalletService != null && (walletExchange = iWalletService.walletExchange()) != null) {
                        str = ((WalletExchange) walletExchange).LJIIJ(str3, null);
                    } else {
                        str = null;
                    }
                    c31614Caw = new C31614Caw(giftSubTemplateInfo.count, LIZIZ, str, true, giftSubTemplateInfo.id, giftSubTemplateInfo.iapId);
                }
                c31618Cb0.LJLIL.setText(String.valueOf(c31614Caw.LIZ));
                if (c31614Caw.LIZLLL) {
                    C47121t6 c47121t6 = c31618Cb0.LJLILLLLZI;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(c31614Caw.LIZJ);
                    LIZ.append(' ');
                    LIZ.append(c31614Caw.LIZIZ);
                    c47121t6.setText(X1D.LIZIZ(LIZ));
                } else {
                    c31618Cb0.LJLILLLLZI.setText("-");
                }
                if (this.LJLIL) {
                    String str4 = c31614Caw.LJFF;
                    C31614Caw c31614Caw2 = C31621Cb3.LIZ;
                    if (c31614Caw2 != null) {
                        str2 = c31614Caw2.LJFF;
                    }
                    if (o.LJ(str4, str2)) {
                        View itemView = holder.itemView;
                        o.LJIIIIZZ(itemView, "itemView");
                        LJZ(itemView);
                        LJLZ(c31614Caw);
                        LJLLLLLL();
                    }
                } else if (i == 0) {
                    View itemView2 = holder.itemView;
                    o.LJIIIIZZ(itemView2, "itemView");
                    LJZ(itemView2);
                    LJLZ(c31614Caw);
                    LJLLLLLL();
                }
                C16880lQ.LJIIJ(new ACListenerS40S0200000_5(c31614Caw, this, 49), holder.itemView);
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C31618Cb0 c31618Cb0 = new C31618Cb0(C29306Beo.LJIIIIZZ(R.layout.cu2, parent, false));
        C0AX.LIZ(parent, c31618Cb0.itemView, R.id.lj7);
        View view = c31618Cb0.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c31618Cb0.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C31618Cb0.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c31618Cb0.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c31618Cb0.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C31618Cb0.class.getName();
        return c31618Cb0;
    }
}
