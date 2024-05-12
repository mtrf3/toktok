package X;

import Y.ACallableS113S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.bullet.business.PlayableBusiness;
import com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS99S0300000_10;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import v82.IDdS502S0100000_10;

/* renamed from: X.NUj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59437NUj extends C59451NUx {
    public C59465NVl LLFZ;
    public Runnable LLI;
    public boolean LLIFFJFJJ;

    @Override // com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer
    public final int LJ() {
        return R.layout.fu;
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer
    public final boolean LJII() {
        NP1 np1;
        C59304NPg c59304NPg = this.LJLL;
        if ((c59304NPg instanceof NP1) && (np1 = (NP1) c59304NPg) != null) {
            C58909NAb.LIZ.getClass();
            if (NH3.LIZ() != null) {
                return C59252NNg.LJI(AwemeService.LIZ().m6(String.valueOf(np1.LJJZ.getValue())));
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer
    public final boolean LIZJ() {
        String LJ;
        boolean LIZJ = super.LIZJ();
        C59304NPg c59304NPg = this.LJLL;
        if (!(c59304NPg instanceof NP1)) {
            LIZJ = false;
        }
        if (c59304NPg == null || (LJ = c59304NPg.LJ()) == null || C2060386t.LIZ(LJ)) {
            return false;
        }
        String lowerCase = LJ.toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        if (!ujb.o.LJJJLIIL(lowerCase, "http://", false)) {
            String lowerCase2 = LJ.toLowerCase();
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (!ujb.o.LJJJLIIL(lowerCase2, "https://", false)) {
                return false;
            }
        }
        return LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer
    public final void LIZLLL() {
        super.LIZLLL();
        C59465NVl c59465NVl = this.LLFZ;
        if (c59465NVl == null) {
            return;
        }
        c59465NVl.setGradualChangeMode(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    @Override // com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            r11 = this;
            super.LJIILIIL()
            X.NPg r1 = r11.LJLL
            X.NP1 r1 = (X.NP1) r1
            if (r1 == 0) goto L48
            X.NVy r0 = r1.LJLLI
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = ""
            if (r0 != 0) goto L16
            r0 = r5
        L16:
            boolean r0 = X.C2060386t.LIZ(r0)
            if (r0 != 0) goto L31
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2d
            X.NVy r0 = r1.LJLLI     // Catch: java.lang.Exception -> L2d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L2d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L2d
            if (r0 != 0) goto L29
            r0 = r5
        L29:
            r10.<init>(r0)     // Catch: java.lang.Exception -> L2d
            goto L32
        L2d:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
        L31:
            r10 = 0
        L32:
            android.app.Activity r2 = r11.LJLZ
            java.lang.String r3 = "wap_stat"
            java.lang.String r4 = "wap_enter"
            X.NVy r0 = r1.LJLL
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L49
        L42:
            r6 = 0
            r8 = r6
            X.C38836FMa.LIZJ(r2, r3, r4, r5, r6, r8, r10)
        L48:
            return
        L49:
            r5 = r0
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59437NUj.LJIILIIL():void");
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer, X.InterfaceC60179Njb
    public final ViewGroup J0(Context context) {
        o.LJIIIZ(context, "context");
        ViewGroup J0 = super.J0(context);
        this.LLFZ = (C59465NVl) LJFF().findViewById(R.id.g3l);
        return J0;
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer
    public final void LJIIIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        super.LJIIIZ(activity);
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.LJLILLLLZI.LIZ(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            if (passBackWebInfoBusiness.LIZ()) {
                passBackWebInfoBusiness.LJIIJ = null;
                C10K.LIZJ(new ACallableS113S0100000_10(passBackWebInfoBusiness, 15));
            }
            ((Handler) passBackWebInfoBusiness.LIZIZ.getValue()).removeCallbacksAndMessages(null);
        }
        this.LLI = null;
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer
    public final void LJIIJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (this.LLIFFJFJJ) {
            return;
        }
        super.LJIIJ(activity);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLILLLLZI.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LJIILJJIL(false);
        }
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.LJLILLLLZI.LIZ(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.LJII(false);
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.LJLILLLLZI.LIZ(PlayableBusiness.class);
        if (playableBusiness == null || playableBusiness.LIZIZ) {
            return;
        }
        playableBusiness.LIZ(true, false);
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer
    public final void LJIIJJI(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (this.LLIFFJFJJ) {
            return;
        }
        super.LJIIJJI(activity);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLILLLLZI.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LIZJ();
        }
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.LJLILLLLZI.LIZ(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.LJII = false;
            adLynxStatBusiness.LJIIIIZZ = System.currentTimeMillis();
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.LJLILLLLZI.LIZ(PlayableBusiness.class);
        if (playableBusiness == null || playableBusiness.LIZIZ) {
            return;
        }
        playableBusiness.LIZ(false, true);
    }

    @QD3
    public final void onEvent(C40307Frr c40307Frr) {
        C59614NaU c59614NaU;
        PreRenderWebViewBusiness LIZ = NUW.LIZ(this.LJLILLLLZI);
        if (LIZ != null) {
            LIZ.LIZIZ(c40307Frr);
            return;
        }
        if (c40307Frr == null || c40307Frr.LJLILLLLZI == null || c40307Frr.LJLIL == 0 || (c59614NaU = this.LJLJLJ) == null || c59614NaU.hashCode() != c40307Frr.LJLIL) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 1);
            jSONObject.put("preloadType", 0);
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
        }
        c40307Frr.LJLILLLLZI.LIZIZ(jSONObject);
    }

    @QD3
    public final void onPopupShowEvent(C59219NLz event) {
        o.LJIIIZ(event, "event");
        Activity activity = this.LJLZ;
        if (activity == null) {
            return;
        }
        boolean z = event.LJLIL;
        if (z) {
            LJIIJ(activity);
            this.LLIFFJFJJ = z;
        } else {
            this.LLIFFJFJJ = z;
            LJIIJJI(activity);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59437NUj(F3T providerFactory, N5S n5s) {
        super(providerFactory, n5s);
        o.LJIIIZ(providerFactory, "providerFactory");
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer, X.NW3, X.InterfaceC60179Njb, X.InterfaceC60172NjU
    public final void LLLII(View view, android.net.Uri uri, InterfaceC40516FvE instance) {
        String str;
        Activity activity;
        C59478NVy c59478NVy;
        C59478NVy c59478NVy2;
        C59439NUl c59439NUl;
        int i;
        C59465NVl c59465NVl;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        super.LLLII(view, uri, instance);
        C59614NaU c59614NaU = this.LJLJLJ;
        if (c59614NaU != null) {
            c59614NaU.setWebScrollListener(new C59438NUk(this));
        }
        C59304NPg c59304NPg = this.LJLL;
        if (c59304NPg != null && (c59478NVy2 = c59304NPg.LJJIJ) != null && (c59439NUl = (C59439NUl) c59478NVy2.getValue()) != null && (i = c59439NUl.LJLIL) != -2 && (c59465NVl = this.LLFZ) != null) {
            c59465NVl.setBackgroundColor(i);
        }
        NOV nov = (NOV) instance.tf(NOV.class);
        if (nov == null || (c59478NVy = nov.LJJLL) == null || (str = (String) c59478NVy.getValue()) == null) {
            str = "";
        }
        if (!C2060386t.LIZ(str) && (activity = this.LJLZ) != null) {
            C58909NAb.LIZ.getClass();
            InterfaceC59440NUm LIZ = NH3.LIZ();
            if (LIZ != null) {
                ((NTF) LIZ).LJIJJLI(activity);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer, X.InterfaceC60172NjU
    public final void gk(InterfaceC40516FvE instance, android.net.Uri uri, AbstractC59475NVv paramsBundle) {
        String str;
        long j;
        long j2;
        Long LJJIZ;
        Long LJJIZ2;
        long j3;
        String str2;
        C59297NOz c59297NOz;
        boolean z;
        String str3;
        Integer value;
        Runnable runnable;
        String str4;
        C59478NVy c59478NVy;
        o.LJIIIZ(instance, "instance");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(paramsBundle, "paramsBundle");
        super.gk(instance, uri, paramsBundle);
        NOV nov = (NOV) instance.tf(NOV.class);
        F3T contextProviderFactory = this.LJLIL;
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        String str5 = "";
        if (nov == null || (c59478NVy = nov.LJJLL) == null || (str = (String) c59478NVy.getValue()) == null) {
            str = "";
        }
        if (!C2060386t.LIZ(str)) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            LJIIIIZZ.LIZIZ("AdBulletRootContainer");
            LJIIIIZZ.LJIJI = Bitmap.Config.ARGB_8888;
            LJIIIIZZ.LJIL = new MHO(25, 0);
            LJIIIIZZ.LJIIIZ(new IDdS502S0100000_10(this, 3));
        }
        C59304NPg c59304NPg = this.LJLL;
        if (!(c59304NPg instanceof NP1)) {
            return;
        }
        o.LJII(c59304NPg, "null cannot be cast to non-null type com.ss.android.ugc.aweme.bullet.module.ad.AdWebKitParamsBundle");
        NP1 np1 = (NP1) c59304NPg;
        Long value2 = np1.LJJZ.getValue();
        if (value2 == null || value2.longValue() <= 0) {
            String queryParameter = UriProtector.getQueryParameter(uri, "cid");
            if (queryParameter != null && (LJJIZ2 = C38350F3i.LJJIZ(queryParameter)) != null) {
                j = LJJIZ2.longValue();
            } else {
                j = 0;
            }
            String queryParameter2 = UriProtector.getQueryParameter(uri, "ad_id");
            if (queryParameter2 != null && (LJJIZ = C38350F3i.LJJIZ(queryParameter2)) != null) {
                j2 = LJJIZ.longValue();
            } else {
                j2 = 0;
            }
            if (j > 0) {
                np1.LJJZ.LIZLLL(Long.valueOf(j));
            } else if (j2 > 0) {
                np1.LJJZ.LIZLLL(Long.valueOf(j2));
            }
        }
        String queryParameter3 = UriProtector.getQueryParameter(uri, "log_extra");
        if (!C2060386t.LIZ(queryParameter3)) {
            np1.LJLJLLL.LIZLLL(queryParameter3);
        }
        Long value3 = np1.LJJZ.getValue();
        if (value3 != null) {
            j3 = value3.longValue();
        } else {
            j3 = 0;
        }
        if (j3 > 0 && C2060386t.LIZ((String) np1.LJLLL.getValue())) {
            C59478NVy c59478NVy2 = np1.LJLLL;
            C58909NAb.LIZ.getClass();
            if (NH3.LIZJ() != null) {
                str4 = NU7.LJIIJJI();
            } else {
                str4 = null;
            }
            c59478NVy2.LIZLLL(str4);
        }
        Integer value4 = np1.LJL.getValue();
        if (value4 == null || value4.intValue() != 1) {
            if (CardStruct.IStatusCode.DEFAULT.equals(np1.LJJJ.getValue())) {
                np1.LLI = true;
            } else if ("1".equals(np1.LJJJ.getValue())) {
                np1.LLI = false;
            }
        } else {
            np1.LLI = true;
        }
        if (np1.LLI && (runnable = this.LLI) != null) {
            runnable.run();
        }
        this.LLI = null;
        C59439NUl c59439NUl = (C59439NUl) np1.LJIILJJIL.getValue();
        if (c59439NUl != null && c59439NUl.LJLIL == -2) {
            C59478NVy c59478NVy3 = np1.LJJIJ;
            int LJJJ = C78609UtB.LJJJ(R.attr.cl, this.LJLZ);
            if (np1.LLFZ.getValue() != null && ((value = np1.LLFZ.getValue()) == null || value.intValue() != -2)) {
                Integer value5 = np1.LLFZ.getValue();
                o.LJI(value5);
                LJJJ = value5.intValue();
            }
            c59478NVy3.LIZLLL(new C59439NUl(LJJJ));
        }
        if (!C2060386t.LIZ(str)) {
            np1.LJJIJ.LIZLLL(null);
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.LJLILLLLZI.LIZ(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            try {
                C58909NAb.LIZ.getClass();
                InterfaceC59085NGv LIZJ = NH3.LIZJ();
                if (LIZJ != null) {
                    passBackWebInfoBusiness.LJ = NU7.LJIILLIIL();
                    passBackWebInfoBusiness.LJFF = NU7.LJIIIIZZ();
                    passBackWebInfoBusiness.LJI = NU7.LJI();
                    passBackWebInfoBusiness.LJII = NU7.LJFF();
                    String LJIIIZ = NU7.LJIIIZ();
                    if (LJIIIZ != null) {
                        passBackWebInfoBusiness.LJIIIIZZ = LJIIIZ;
                    }
                    passBackWebInfoBusiness.LJIIIZ = NU7.LJII();
                }
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
        if (!C2060386t.LIZ(np1.LJFF()) && np1.LJI() == 4) {
            C58909NAb.LIZ.getClass();
            if (NH3.LIZ() != null) {
                String LJFF = np1.LJFF();
                String str6 = (String) np1.LJJL.getValue();
                if (str6 != null) {
                    str5 = str6;
                }
                str3 = NTF.LJII(LJFF, str5);
            } else {
                str3 = null;
            }
            C74112vX.LIZJ(str3);
        }
        F3T providerFactory = instance.getProviderFactory();
        C58909NAb.LIZ.getClass();
        InterfaceC59440NUm LIZ = NH3.LIZ();
        if (LIZ != null) {
            new AqS99S0300000_10(this.LJLILLLLZI, LIZ, providerFactory, 14);
        }
        C59304NPg c59304NPg2 = this.LJLL;
        if (NH3.LIZJ() != null) {
            NU7.LJIJ();
        }
        if (c59304NPg2 != null && (c59297NOz = c59304NPg2.LJJIL) != null && (z = !o.LJ(c59297NOz.getValue(), Boolean.TRUE) ? 1 : 0) != 1) {
            if (z == 2) {
                KL2.LJIILLIIL(0, this.LJLJJLL);
                C59465NVl c59465NVl = this.LLFZ;
                if (c59465NVl != null) {
                    c59465NVl.setTitleBar(this.LJLJJI);
                }
                C59465NVl c59465NVl2 = this.LLFZ;
                if (c59465NVl2 != null) {
                    c59465NVl2.setGradualChangeMode(true);
                }
                C59462NVi c59462NVi = this.LJLJJI;
                if (c59462NVi != null) {
                    c59462NVi.setBackgroundColor(0);
                    c59462NVi.LIZ(R.id.aj1).setVisibility(0);
                    c59462NVi.LIZ(R.id.aj1).setBackground(C04270Et.LIZIZ(c59462NVi.getContext(), R.drawable.a7f));
                    c59462NVi.LIZ(R.id.title).setVisibility(8);
                    ((AppCompatImageView) c59462NVi.LIZ(R.id.bfl)).setImageResource(R.drawable.a8x);
                    ((AppCompatImageView) c59462NVi.LIZ(R.id.bfd)).setImageResource(R.drawable.a90);
                    ((AppCompatImageView) c59462NVi.LIZ(R.id.az6)).setImageResource(R.drawable.a97);
                    ((AppCompatImageView) c59462NVi.LIZ(R.id.iwu)).setImageResource(R.drawable.a94);
                    ((AppCompatImageView) c59462NVi.LIZ(R.id.j2p)).setImageResource(R.drawable.a92);
                }
            }
        } else {
            LIZLLL();
        }
        C59304NPg c59304NPg3 = this.LJLL;
        if ((c59304NPg3 instanceof NP1) && c59304NPg3 != null && (!((ArrayList) c59304NPg3.LIZ()).isEmpty())) {
            Iterator it = ((ArrayList) c59304NPg3.LIZ()).iterator();
            while (it.hasNext()) {
                InterfaceC59479NVz interfaceC59479NVz = (InterfaceC59479NVz) it.next();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(interfaceC59479NVz.getKey());
                LIZ2.append(": ");
                Object value6 = interfaceC59479NVz.getValue();
                if (value6 != null) {
                    str2 = value6.toString();
                } else {
                    str2 = null;
                }
                LIZ2.append(str2);
                LIZ2.append('\n');
                X1D.LIZIZ(LIZ2);
            }
        }
    }
}
