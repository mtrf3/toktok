package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.PdpInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.HashMap;
import kotlin.jvm.internal.AqS178S0100000_12;

/* renamed from: X.RfQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70112RfQ implements InterfaceC70593RnB {
    public boolean LIZ;
    public boolean LIZIZ;
    public final /* synthetic */ PdpInfoViewHolder LIZJ;
    public final /* synthetic */ ViewGroup LIZLLL;

    @Override // X.InterfaceC70593RnB
    public final void LIZJ(View view) {
        if (!this.LIZIZ) {
            if (view != null) {
                C78946Uyc.LJJIIJ(view, new C70920RsS(), new AqS178S0100000_12(this.LIZJ, 124));
            }
            this.LIZIZ = true;
        }
    }

    public C70112RfQ(PdpInfoViewHolder pdpInfoViewHolder, ViewGroup viewGroup) {
        this.LIZJ = pdpInfoViewHolder;
        this.LIZLLL = viewGroup;
    }

    @Override // X.InterfaceC70593RnB
    public final void LIZ(PromotionView promotionView, int i) {
        String LJII;
        if (!this.LIZ) {
            C70414RkI c70414RkI = this.LIZJ.getViewModel().LLFII;
            if (c70414RkI != null) {
                C70116RfU c70116RfU = new C70116RfU();
                c70116RfU.LIZLLL(c70414RkI.LIZIZ);
                if (promotionView != null) {
                    String LJ = C69889Rbp.LJ(promotionView, i);
                    if (LJ != null) {
                        c70116RfU.LIZIZ.put("coupon_id", LJ);
                    }
                    if (promotionView != null) {
                        String LJI = C69889Rbp.LJI(promotionView, i);
                        if (LJI != null) {
                            c70116RfU.LIZIZ.put("coupon_type_id", LJI);
                        }
                        if (promotionView != null) {
                            String LJFF = C69889Rbp.LJFF(promotionView, i);
                            if (LJFF != null) {
                                c70116RfU.LIZIZ.put("coupon_name", LJFF);
                            }
                            if (promotionView != null && (LJII = C69889Rbp.LJII(promotionView, i)) != null) {
                                c70116RfU.LIZIZ.put("coupon_type", LJII);
                            }
                        }
                    }
                }
                c70116RfU.LIZIZ();
            }
            this.LIZ = true;
        }
    }

    @Override // X.InterfaceC70593RnB
    public final void LIZLLL(View view, String str) {
        Object obj;
        String str2;
        HashMap<String, Object> hashMap;
        HashMap<String, Object> trackParams;
        String str3 = str;
        Context context = this.LIZLLL.getContext();
        PdpInfoViewHolder pdpInfoViewHolder = this.LIZJ;
        if (context instanceof ActivityC45651qj) {
            C70376Rjg c70376Rjg = InterfaceC27046AjS.LIZ;
            if (str3 == null) {
                str3 = "";
            }
            IPdpStarter.PdpEnterParam pdpEnterParam = pdpInfoViewHolder.getViewModel().LJLJJLL;
            String str4 = null;
            if (pdpEnterParam != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
                obj = trackParams.get("entrance_info");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str2 = (String) obj;
            } else {
                str2 = null;
            }
            IPdpStarter.PdpEnterParam pdpEnterParam2 = pdpInfoViewHolder.getViewModel().LJLJJLL;
            if (pdpEnterParam2 != null) {
                hashMap = pdpEnterParam2.getTrackParams();
            } else {
                hashMap = null;
            }
            C70101RfF c70101RfF = IPdpStarter.LIZ;
            IPdpStarter.PdpEnterParam pdpEnterParam3 = pdpInfoViewHolder.getViewModel().LJLJJLL;
            c70101RfF.getClass();
            String valueOf = String.valueOf(C70101RfF.LIZIZ(pdpEnterParam3));
            Boolean valueOf2 = Boolean.valueOf(pdpInfoViewHolder.getViewModel().LJLJL);
            IPdpStarter.PdpEnterParam pdpEnterParam4 = pdpInfoViewHolder.getViewModel().LJLJJLL;
            if (pdpEnterParam4 != null) {
                str4 = pdpEnterParam4.getSourceInfo();
            }
            c70376Rjg.LIZ(context, str3, str2, hashMap, null, "discounts_module", valueOf, valueOf2, str4, pdpInfoViewHolder.getViewModel().lw0(), null);
        }
        if (view != null) {
            C78946Uyc.LJJIIJ(view, new C70919RsR(), new AqS178S0100000_12(this.LIZJ, 126));
        }
    }

    @Override // X.InterfaceC70593RnB
    public final void LIZIZ(PromotionView promotionView, int i, String str) {
        Object obj;
        String str2;
        HashMap<String, Object> hashMap;
        HashMap<String, Object> trackParams;
        String LJII;
        String str3 = str;
        C70414RkI c70414RkI = this.LIZJ.getViewModel().LLFII;
        String str4 = null;
        if (c70414RkI != null) {
            C70113RfR c70113RfR = new C70113RfR();
            c70113RfR.LIZLLL(c70414RkI.LIZIZ);
            if (promotionView != null) {
                String LJ = C69889Rbp.LJ(promotionView, i);
                if (LJ != null) {
                    c70113RfR.LIZIZ.put("coupon_id", LJ);
                }
                if (promotionView != null) {
                    String LJI = C69889Rbp.LJI(promotionView, i);
                    if (LJI != null) {
                        c70113RfR.LIZIZ.put("coupon_type_id", LJI);
                    }
                    if (promotionView != null) {
                        String LJFF = C69889Rbp.LJFF(promotionView, i);
                        if (LJFF != null) {
                            c70113RfR.LIZIZ.put("coupon_name", LJFF);
                        }
                        if (promotionView != null && (LJII = C69889Rbp.LJII(promotionView, i)) != null) {
                            c70113RfR.LIZIZ.put("coupon_type", LJII);
                        }
                    }
                }
            }
            c70113RfR.LIZIZ();
        }
        Context context = this.LIZLLL.getContext();
        PdpInfoViewHolder pdpInfoViewHolder = this.LIZJ;
        if (context instanceof ActivityC45651qj) {
            C70376Rjg c70376Rjg = InterfaceC27046AjS.LIZ;
            if (str3 == null) {
                str3 = "";
            }
            IPdpStarter.PdpEnterParam pdpEnterParam = pdpInfoViewHolder.getViewModel().LJLJJLL;
            if (pdpEnterParam != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
                obj = trackParams.get("entrance_info");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str2 = (String) obj;
            } else {
                str2 = null;
            }
            IPdpStarter.PdpEnterParam pdpEnterParam2 = pdpInfoViewHolder.getViewModel().LJLJJLL;
            if (pdpEnterParam2 != null) {
                hashMap = pdpEnterParam2.getTrackParams();
            } else {
                hashMap = null;
            }
            C70101RfF c70101RfF = IPdpStarter.LIZ;
            IPdpStarter.PdpEnterParam pdpEnterParam3 = pdpInfoViewHolder.getViewModel().LJLJJLL;
            c70101RfF.getClass();
            String valueOf = String.valueOf(C70101RfF.LIZIZ(pdpEnterParam3));
            Boolean valueOf2 = Boolean.valueOf(pdpInfoViewHolder.getViewModel().LJLJL);
            IPdpStarter.PdpEnterParam pdpEnterParam4 = pdpInfoViewHolder.getViewModel().LJLJJLL;
            if (pdpEnterParam4 != null) {
                str4 = pdpEnterParam4.getSourceInfo();
            }
            c70376Rjg.LIZ(context, str3, str2, hashMap, null, "price", valueOf, valueOf2, str4, pdpInfoViewHolder.getViewModel().lw0(), null);
        }
    }
}
