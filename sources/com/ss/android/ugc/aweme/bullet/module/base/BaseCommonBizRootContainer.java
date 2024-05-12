package com.ss.android.ugc.aweme.bullet.module.base;

import X.AbstractC59475NVv;
import X.C107794Kx;
import X.C116474hf;
import X.C16880lQ;
import X.C279017q;
import X.C38349F3h;
import X.C40261Fr7;
import X.C40681ii;
import X.C45804HyK;
import X.C58909NAb;
import X.C59231NMl;
import X.C59297NOz;
import X.C59304NPg;
import X.C59437NUj;
import X.C59439NUl;
import X.C59445NUr;
import X.C59455NVb;
import X.C59456NVc;
import X.C59457NVd;
import X.C59458NVe;
import X.C59462NVi;
import X.C59470NVq;
import X.C59472NVs;
import X.C59478NVy;
import X.C59614NaU;
import X.C59827Ndv;
import X.C59896Nf2;
import X.C60213Nk9;
import X.C62905OmT;
import X.C63081OpJ;
import X.C72818Shy;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C73318Sq2;
import X.C76052yf;
import X.C78983UzD;
import X.C79045V0n;
import X.C84763XOl;
import X.EF7;
import X.EnumC59901Nf7;
import X.F0S;
import X.F15;
import X.F3T;
import X.FMR;
import X.InterfaceC40516FvE;
import X.InterfaceC59085NGv;
import X.InterfaceC59237NMr;
import X.InterfaceC59440NUm;
import X.InterfaceC60180Njc;
import X.KL2;
import X.NH3;
import X.NOV;
import X.NP1;
import X.NTF;
import X.NU7;
import X.NUT;
import X.NUX;
import X.NVT;
import X.NVW;
import X.NVX;
import X.NW3;
import X.QD3;
import X.ViewOnClickListenerC59660NbE;
import X.ViewOnTouchListenerC59464NVk;
import Y.ACListenerS30S0100000_10;
import Y.ACListenerS45S0200000_10;
import Y.ACallableS113S0100000_10;
import Y.ARunnableS46S0100000_10;
import Y.AfS62S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.bullet.business.WalletBusiness;
import com.ss.android.ugc.aweme.bullet.module.base.ui.BulletWebViewTouchDelegate;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class BaseCommonBizRootContainer extends NW3 implements InterfaceC59237NMr {
    public final F3T LJLIL;
    public final NUT LJLILLLLZI;
    public View LJLJI;
    public C59462NVi LJLJJI;
    public View LJLJJL;
    public Space LJLJJLL;
    public ViewOnClickListenerC59660NbE LJLJL;
    public C59614NaU LJLJLJ;
    public InterfaceC40516FvE LJLJLLL;
    public C59304NPg LJLL;
    public NOV LJLLI;
    public String LJLLILLLL;
    public C73305Spp LJLLJ;
    public C59455NVb LJLLL;
    public ACListenerS45S0200000_10 LJLLLL;
    public Runnable LJLLLLLL;
    public Activity LJLZ;
    public boolean LJZ;
    public List<String> LJZI;
    public long LJZL;
    public String LL;
    public ACallableS113S0100000_10 LLD;
    public C59458NVe LLF;
    public BulletWebViewTouchDelegate LLFF;
    public final C73318Sq2 LLFFF;
    public boolean LLFII;

    public int LJ() {
        return R.layout.a_l;
    }

    public boolean LJII() {
        return false;
    }

    public abstract void LJIIL(C59304NPg c59304NPg);

    @Override // X.NW3
    public final C59827Ndv LIZ() {
        return new NVT(this);
    }

    @Override // X.NW3
    public final C59458NVe LIZIZ() {
        return new NVX(this);
    }

    public void LIZLLL() {
        KL2.LJIILLIIL(8, this.LJLJJLL);
        KL2.LJIILLIIL(8, this.LJLJJL);
        C59462NVi c59462NVi = this.LJLJJI;
        if (c59462NVi != null) {
            c59462NVi.setBackgroundColor(0);
            c59462NVi.LIZ(R.id.aj1).setVisibility(0);
            c59462NVi.LIZ(R.id.title).setVisibility(8);
            ((AppCompatImageView) c59462NVi.LIZ(R.id.bfl)).setImageResource(R.drawable.a8x);
            ((AppCompatImageView) c59462NVi.LIZ(R.id.bfd)).setImageResource(R.drawable.a90);
            ((AppCompatImageView) c59462NVi.LIZ(R.id.az6)).setImageResource(R.drawable.a97);
            ((AppCompatImageView) c59462NVi.LIZ(R.id.iwu)).setImageResource(R.drawable.a94);
            ((AppCompatImageView) c59462NVi.LIZ(R.id.j2p)).setImageResource(R.drawable.a92);
        }
    }

    public final View LJFF() {
        View view = this.LJLJI;
        if (view != null) {
            return view;
        }
        o.LJIJI("rootView");
        throw null;
    }

    public void LJIILIIL() {
        C59304NPg c59304NPg = this.LJLL;
        if (c59304NPg != null) {
            Boolean value = c59304NPg.LJJLIIIJJI.getValue();
            if (value != null && value.booleanValue()) {
                EF7.LIZIZ();
                if (!TextUtils.isEmpty("open_url")) {
                    if (!TextUtils.isEmpty(null)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("launch_from", (Object) null);
                        } catch (JSONException unused) {
                            FMR.LIZ.LIZIZ("event_v1", "open_url", "push", null, null, jSONObject);
                        }
                    } else {
                        FMR.LIZ.LIZIZ("event_v1", "open_url", "push", null, null, null);
                    }
                }
            }
            if (ujb.o.LJJJJ(c59304NPg.LJ(), "pay", false)) {
                this.LJLILLLLZI.LIZ(WalletBusiness.class);
            }
        }
    }

    @Override // X.NW3, X.InterfaceC60179Njb
    public final InterfaceC60180Njc Ug() {
        return new BaseCommonBizRootContainer$provideActivityDelegate$1(this);
    }

    @Override // X.InterfaceC60179Njb
    public final ViewGroup Ic() {
        View findViewById = LJFF().findViewById(R.id.b0w);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.….bullet_container_layout)");
        return (ViewGroup) findViewById;
    }

    public boolean LIZJ() {
        String str;
        LJIILIIL();
        C59304NPg c59304NPg = this.LJLL;
        if (c59304NPg != null) {
            str = c59304NPg.LJ();
        } else {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }

    @Override // X.InterfaceC60179Njb
    public ViewGroup J0(Context context) {
        C59304NPg c59304NPg;
        o.LJIIIZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        o.LJI(LJIJJ);
        this.LJLZ = LJIJJ;
        View inflate = View.inflate(context, LJ(), null);
        o.LJIIIIZZ(inflate, "inflate(context, getRootContainerLayout(), null)");
        this.LJLJI = inflate;
        this.LJLLJ = (C73305Spp) LJFF().findViewById(R.id.cyv);
        Activity LJIJJ2 = C45804HyK.LJIJJ(context);
        o.LJI(LJIJJ2);
        C73305Spp c73305Spp = this.LJLLJ;
        if (c73305Spp != null) {
            c73305Spp.setOnTouchListener(ViewOnTouchListenerC59464NVk.LJLIL);
        }
        Integer LJI = C79045V0n.LJI(R.attr.ct, LJIJJ2);
        if (LJI != null) {
            int intValue = LJI.intValue();
            C73305Spp c73305Spp2 = this.LJLLJ;
            if (c73305Spp2 != null) {
                c73305Spp2.setBackgroundColor(intValue);
            }
        }
        this.LJLJJI = (C59462NVi) LJFF().findViewById(R.id.b13);
        this.LJLJJL = LJFF().findViewById(R.id.title_shadow);
        this.LJLJJLL = (Space) LJFF().findViewById(R.id.gwj);
        this.LJLJL = (ViewOnClickListenerC59660NbE) LJFF().findViewById(R.id.b12);
        try {
            try {
                ACallableS113S0100000_10 aCallableS113S0100000_10 = this.LLD;
                if (aCallableS113S0100000_10 != null) {
                    c59304NPg = (C59304NPg) ((AbstractC59475NVv) aCallableS113S0100000_10.l0);
                } else {
                    c59304NPg = null;
                }
                o.LJI(c59304NPg);
                LJI(c59304NPg);
                if (o.LJ(c59304NPg.LJ.getValue(), Boolean.TRUE)) {
                    KL2.LJIILLIIL(8, this.LJLJJI);
                    KL2.LJIILLIIL(8, this.LJLJJLL);
                }
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
            this.LLD = null;
            return (ViewGroup) LJFF();
        } catch (Throwable th) {
            this.LLD = null;
            throw th;
        }
    }

    public final void LJI(C59472NVs c59472NVs) {
        NOV nov;
        Boolean value;
        ViewOnClickListenerC59660NbE viewOnClickListenerC59660NbE;
        int i;
        Boolean value2;
        CharSequence charSequence;
        int i2;
        int i3;
        C59462NVi c59462NVi = this.LJLJJI;
        C59304NPg c59304NPg = null;
        if (c59462NVi != null && c59472NVs != null) {
            TextView textView = (TextView) c59462NVi.LIZ(R.id.title);
            if (TextUtils.isEmpty((CharSequence) c59472NVs.LJIIIZ.getValue())) {
                Resources resources = c59462NVi.getContext().getResources();
                if (resources != null) {
                    charSequence = resources.getString(R.string.rkd);
                } else {
                    charSequence = null;
                }
            } else {
                charSequence = (CharSequence) c59472NVs.LJIIIZ.getValue();
            }
            textView.setText(charSequence);
            C16880lQ.LJJIJIIJIL((C116474hf) c59462NVi.LIZ(R.id.j2p), new ACListenerS30S0100000_10(c59462NVi, 198));
            C16880lQ.LJJIJIIJIL((C116474hf) c59462NVi.LIZ(R.id.bfl), new ACListenerS30S0100000_10(c59462NVi, 199));
            C16880lQ.LJJIJIIJIL((C116474hf) c59462NVi.LIZ(R.id.bfd), new ACListenerS30S0100000_10(c59462NVi, 200));
            Boolean value3 = c59472NVs.LJJJI.getValue();
            Boolean bool = Boolean.TRUE;
            if (o.LJ(value3, bool)) {
                ((ImageView) c59462NVi.LIZ(R.id.j2p)).setVisibility(8);
                ((ImageView) c59462NVi.LIZ(R.id.az6)).setVisibility(8);
            }
            C16880lQ.LJJIJIIJIL((C116474hf) c59462NVi.LIZ(R.id.az6), new ACListenerS30S0100000_10(c59462NVi, 201));
            if (o.LJ(c59472NVs.LJIJJLI.getValue(), bool)) {
                ((ImageView) c59462NVi.LIZ(R.id.bfl)).setVisibility(0);
            }
            C59439NUl c59439NUl = (C59439NUl) c59472NVs.LJI.getValue();
            if (c59439NUl != null && (i3 = c59439NUl.LJLIL) != -2) {
                c59462NVi.LIZ(R.id.title).setBackground(new ColorDrawable(i3));
                c59462NVi.setBackgroundColor(i3);
            }
            C59439NUl c59439NUl2 = (C59439NUl) c59472NVs.LJIIJ.getValue();
            if (c59439NUl2 != null && (i2 = c59439NUl2.LJLIL) != -2) {
                ((TextView) c59462NVi.LIZ(R.id.title)).setTextColor(i2);
                Context context = c59462NVi.getContext();
                if (context != null) {
                    C40681ii LIZ = C40681ii.LIZ(context.getResources(), R.drawable.no, context.getTheme());
                    if (LIZ != null) {
                        LIZ.setTint(i2);
                    }
                    ((C116474hf) c59462NVi.LIZ(R.id.bfl)).setImageDrawable(LIZ);
                }
            }
            if (o.LJ(AbstractC59475NVv.LIZIZ(c59472NVs, "show_report"), bool)) {
                if (AwemeService.LIZ().o6((String) AbstractC59475NVv.LIZIZ(c59472NVs, "aweme_id")) != null) {
                    ((ImageView) c59462NVi.LIZ(R.id.iwu)).setVisibility(0);
                    C16880lQ.LJJIJIIJIL((C116474hf) c59462NVi.LIZ(R.id.iwu), new ACListenerS30S0100000_10(c59462NVi, 202));
                }
                ((ImageView) c59462NVi.LIZ(R.id.az6)).setVisibility(8);
            }
            if (c59472NVs.LJIIJJI.getValue() == EnumC59901Nf7.SHARE) {
                ((ImageView) c59462NVi.LIZ(R.id.az6)).setVisibility(0);
                ((ImageView) c59462NVi.LIZ(R.id.iwu)).setVisibility(8);
            } else if (c59472NVs.LJIIJJI.getValue() == EnumC59901Nf7.REPORT) {
                ((ImageView) c59462NVi.LIZ(R.id.az6)).setVisibility(8);
                ((ImageView) c59462NVi.LIZ(R.id.iwu)).setVisibility(0);
            }
            c59462NVi.LIZ(R.id.j2p);
        }
        C59462NVi c59462NVi2 = this.LJLJJI;
        if (c59462NVi2 != null) {
            c59462NVi2.setTitleWrap(new NVW(this, c59472NVs));
        }
        if (c59472NVs instanceof C59304NPg) {
            c59304NPg = (C59304NPg) c59472NVs;
        }
        if (((c59304NPg != null && (value2 = c59304NPg.LJJLIIIJLJLI.getValue()) != null && value2.booleanValue()) || ((nov = this.LJLLI) != null && (value = nov.LJJLIIIJLJLI.getValue()) != null && value.booleanValue())) && (viewOnClickListenerC59660NbE = this.LJLJL) != null) {
            Context context2 = viewOnClickListenerC59660NbE.getContext();
            if (context2 != null) {
                i = C63081OpJ.LJJJJLI(context2);
            } else {
                i = 0;
            }
            viewOnClickListenerC59660NbE.setPadding(0, i, 0, 0);
        }
    }

    public final void LJIIIIZZ(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        String[] strArr = new String[2];
        strArr[0] = "platform = ";
        if (this.LJLL != null) {
            str2 = "webview";
        } else {
            str2 = "unknown";
        }
        strArr[1] = str2;
        C38349F3h.LJJIJIL(sb, strArr);
        C38349F3h.LJJIJIL(sb, "status = ", str);
        C38349F3h.LJJIJIL(sb, "url = ", this.LJLLILLLL);
    }

    public void LJIIIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LLFFF.LIZLLL();
        C59304NPg c59304NPg = this.LJLL;
        if (c59304NPg != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", c59304NPg.LJ());
            hashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
            long currentTimeMillis = System.currentTimeMillis();
            new F15();
            C72818Shy.LIZ(new C76052yf(currentTimeMillis, F15.LIZLLL(hashMap), "ad_webview_close"));
        }
    }

    public void LJIIJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            NTF.LJJIIZI(this);
        }
    }

    public void LJIIJJI(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C58909NAb.LIZ.getClass();
        InterfaceC59440NUm LIZ = NH3.LIZ();
        if (LIZ != null) {
            ((NTF) LIZ).LIZJ(this, this.LJLJLJ);
        }
    }

    @Override // X.NW3, X.InterfaceC60179Njb, X.InterfaceC60172NjU
    public final void LLLLL(Uri uri) {
        o.LJIIIZ(uri, "uri");
        this.LJZ = false;
        this.LJLLILLLL = uri.toString();
        C58909NAb.LIZ.getClass();
        NH3.LIZ();
        if (NH3.LIZ() != null) {
            NTF.LJIILJJIL(this, this.LJLLILLLL);
        }
    }

    @Override // X.NW3, X.InterfaceC60179Njb
    public final void Rd(NP1 np1) {
        if (TextUtils.isEmpty((CharSequence) np1.LJIIIZ.getValue())) {
            np1.LJIIIZ.LIZLLL(np1.LJJLIL.getValue());
        }
        this.LLD = new ACallableS113S0100000_10(np1, 19);
    }

    @QD3
    public final void onEvent(C40261Fr7 c40261Fr7) {
        F0S f0s;
        C59614NaU c59614NaU;
        InterfaceC40516FvE interfaceC40516FvE;
        InterfaceC40516FvE interfaceC40516FvE2 = this.LJLJLLL;
        if (interfaceC40516FvE2 != null) {
            f0s = interfaceC40516FvE2.LLLIZZ();
        } else {
            f0s = null;
        }
        if (f0s == F0S.LYNX) {
            if (c40261Fr7 != null && c40261Fr7.LJLIL != 0 && (interfaceC40516FvE = this.LJLJLLL) != null && interfaceC40516FvE.hashCode() == c40261Fr7.LJLIL) {
                this.LJLLLLLL.run();
                return;
            }
            return;
        }
        if (c40261Fr7 != null && c40261Fr7.LJLIL != 0 && (c59614NaU = this.LJLJLJ) != null && c59614NaU.hashCode() == c40261Fr7.LJLIL) {
            this.LJLLLLLL.run();
        }
    }

    @QD3
    public final void onJsBroadcast(C59231NMl event) {
        o.LJIIIZ(event, "event");
        BulletWebViewTouchDelegate bulletWebViewTouchDelegate = this.LLFF;
        if (bulletWebViewTouchDelegate != null) {
            bulletWebViewTouchDelegate.LIZJ(event);
        }
    }

    @QD3
    public final void onEvent(C107794Kx c107794Kx) {
        String str;
        if (c107794Kx != null) {
            str = c107794Kx.LJLJJI;
        } else {
            str = null;
        }
        if (TextUtils.equals("web", str)) {
            C58909NAb.LIZ.getClass();
            if (NH3.LIZ() != null) {
                NTF.LJJIFFI(this.LJLZ, this.LJLJJI, c107794Kx);
            }
        }
    }

    @QD3
    public void onEvent(C59470NVq c59470NVq) {
        C58909NAb.LIZ.getClass();
        NH3.LIZ();
    }

    public BaseCommonBizRootContainer(F3T providerFactory, NUT bulletBusiness) {
        o.LJIIIZ(providerFactory, "providerFactory");
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        this.LJLIL = providerFactory;
        this.LJLILLLLZI = bulletBusiness;
        this.LJLLLLLL = new ARunnableS46S0100000_10(this, 36);
        this.LLFFF = new C73318Sq2();
    }

    @Override // X.NW3, X.InterfaceC60179Njb, X.InterfaceC60172NjU
    public final void LLL(Uri uri, Throwable e) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(e, "e");
        C73305Spp c73305Spp = this.LJLLJ;
        if (c73305Spp != null) {
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJI(c73306Spq, new AqS160S0100000_10(this, 63));
            c73305Spp.setStatus(c73306Spq);
        }
        C73305Spp c73305Spp2 = this.LJLLJ;
        if (c73305Spp2 == null) {
            return;
        }
        c73305Spp2.setVisibility(0);
    }

    @Override // X.NW3, X.InterfaceC60179Njb, X.InterfaceC60172NjU
    public void LLLII(View view, Uri uri, InterfaceC40516FvE instance) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        boolean z = true;
        this.LJZ = true;
        this.LJLLILLLL = uri.toString();
        C58909NAb.LIZ.getClass();
        NH3.LIZ();
        if (NH3.LIZ() != null) {
            NTF.LJJIJ(this, this.LJLLILLLL);
        }
        C59614NaU c59614NaU = this.LJLJLJ;
        if (c59614NaU == null || !c59614NaU.canGoBack()) {
            z = false;
        }
        if (z) {
            C59462NVi c59462NVi = this.LJLJJI;
            if (c59462NVi != null) {
                ((ImageView) c59462NVi.LIZ(R.id.bfd)).setVisibility(0);
            }
        } else {
            C59462NVi c59462NVi2 = this.LJLJJI;
            if (c59462NVi2 != null) {
                ((ImageView) c59462NVi2.LIZ(R.id.bfd)).setVisibility(8);
            }
        }
        C73305Spp c73305Spp = this.LJLLJ;
        if (c73305Spp == null) {
            return;
        }
        c73305Spp.setVisibility(8);
    }

    @Override // X.InterfaceC60172NjU
    public void gk(InterfaceC40516FvE instance, Uri uri, AbstractC59475NVv paramsBundle) {
        Activity activity;
        C59297NOz c59297NOz;
        Object obj;
        C59478NVy c59478NVy;
        NP1 np1;
        o.LJIIIZ(instance, "instance");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(paramsBundle, "paramsBundle");
        this.LJLJLLL = instance;
        if (!(paramsBundle instanceof C59472NVs)) {
            return;
        }
        if (paramsBundle instanceof C59896Nf2) {
            this.LLFFF.LIZ(C84763XOl.LJI().LJJJJZI(new AfS62S0100000_10(instance, 2)));
        }
        if (paramsBundle instanceof C59304NPg) {
            this.LJLL = (C59304NPg) paramsBundle;
        }
        this.LJLLI = (NOV) instance.tf(NOV.class);
        if (this.LLFII && (paramsBundle instanceof NP1) && (np1 = (NP1) paramsBundle) != null) {
            np1.LLIFFJFJJ = 1;
        }
        if ((this instanceof C59437NUj) && this.LJLL != null && !LIZJ()) {
            return;
        }
        C59472NVs c59472NVs = (C59472NVs) paramsBundle;
        this.LJLILLLLZI.LJ(c59472NVs);
        this.LJLILLLLZI.LJII(this.LJLLI);
        Activity activity2 = this.LJLZ;
        if (activity2 != null) {
            if (this.LJLLLL == null) {
                this.LJLLLL = new ACListenerS45S0200000_10(this, activity2, 32);
            }
            this.LJLLL = new C59455NVb(activity2, this.LJLLLL);
        }
        if (TextUtils.isEmpty((CharSequence) c59472NVs.LJIIIZ.getValue())) {
            C59478NVy c59478NVy2 = c59472NVs.LJIIIZ;
            C59304NPg c59304NPg = this.LJLL;
            if (c59304NPg != null && (c59478NVy = c59304NPg.LJJLIL) != null) {
                obj = c59478NVy.getValue();
            } else {
                obj = null;
            }
            c59478NVy2.LIZLLL(obj);
        }
        C59304NPg c59304NPg2 = this.LJLL;
        if (c59304NPg2 != null && (c59297NOz = c59304NPg2.LJJJJI) != null && o.LJ(c59297NOz.getValue(), Boolean.TRUE)) {
            c59472NVs.LJJIL.LIZLLL(Boolean.FALSE);
        }
        LJI(c59472NVs);
        C59304NPg c59304NPg3 = this.LJLL;
        if (c59304NPg3 != null) {
            C58909NAb.LIZ.getClass();
            NH3.LIZ();
            if (!TextUtils.isEmpty(c59304NPg3.LJ())) {
                NH3.LIZ();
            }
            Boolean value = c59304NPg3.LJJLIIIJ.getValue();
            if (value != null && value.booleanValue() && (activity = this.LJLZ) != null) {
                C62905OmT c62905OmT = new C62905OmT(activity);
                c62905OmT.LIZ(R.string.ive);
                c62905OmT.LJII(R.string.dsn, null);
                C279017q.LIZLLL(c62905OmT);
            }
            LJIIL(c59304NPg3);
        }
        if (o.LJ(c59472NVs.LJ.getValue(), Boolean.TRUE)) {
            KL2.LJIILLIIL(8, this.LJLJJI);
            KL2.LJIILLIIL(8, this.LJLJJLL);
        }
    }

    @Override // X.NW3, X.InterfaceC60179Njb, X.InterfaceC60172NjU
    public final void LLIIL(List<? extends C60213Nk9<? extends View>> viewComponents, Uri uri, InterfaceC40516FvE instance, boolean z) {
        boolean z2;
        o.LJIIIZ(viewComponents, "viewComponents");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        if (instance instanceof NUX) {
            WebView view = ((NUX) instance).getView();
            C59614NaU c59614NaU = this.LJLJLJ;
            if ((c59614NaU == null || !o.LJ(c59614NaU, view)) && (view instanceof C59614NaU)) {
                C59614NaU c59614NaU2 = (C59614NaU) view;
                boolean z3 = false;
                c59614NaU2.setBackgroundColor(0);
                this.LJLJLJ = c59614NaU2;
                c59614NaU2.resumeTimers();
                C59614NaU c59614NaU3 = this.LJLJLJ;
                if (c59614NaU3 != null) {
                    BulletWebViewTouchDelegate bulletWebViewTouchDelegate = new BulletWebViewTouchDelegate(c59614NaU3);
                    this.LLFF = bulletWebViewTouchDelegate;
                    c59614NaU3.setWebViewEventDelegate(bulletWebViewTouchDelegate);
                }
                C58909NAb.LIZ.getClass();
                InterfaceC59440NUm LIZ = NH3.LIZ();
                if (LIZ != null) {
                    ((NTF) LIZ).LJIL(this, this.LJLJLJ);
                }
                InterfaceC59440NUm LIZ2 = NH3.LIZ();
                if (LIZ2 != null) {
                    ((NTF) LIZ2).LIZJ(this, this.LJLJLJ);
                }
                C59614NaU c59614NaU4 = this.LJLJLJ;
                if (c59614NaU4 != null) {
                    C59445NUr.LIZIZ(new AqS141S0200000_10(c59614NaU4, this, 48));
                    C59304NPg c59304NPg = this.LJLL;
                    if (c59304NPg != null) {
                        Boolean value = c59304NPg.LJJIFFI.getValue();
                        if (value != null) {
                            z2 = value.booleanValue();
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            c59614NaU4.setLayerType(1, null);
                        }
                        Boolean value2 = c59304NPg.LJJLIIIJJIZ.getValue();
                        if (value2 != null && value2.booleanValue()) {
                            try {
                                WebSettings settings = c59614NaU4.getSettings();
                                InterfaceC59085NGv LIZJ = NH3.LIZJ();
                                if (LIZJ != null) {
                                    if (NU7.LJIIZILJ()) {
                                        z3 = true;
                                    }
                                }
                                settings.setMediaPlaybackRequiresUserGesture(!z3);
                            } catch (Exception e) {
                                C78983UzD.LJIIZILJ(e);
                                c59614NaU4.getSettings().setMediaPlaybackRequiresUserGesture(true);
                            }
                        }
                    }
                }
            }
            this.LJLILLLLZI.LJFF(view);
            this.LJLILLLLZI.LJI(new C59456NVc(instance));
            this.LJLILLLLZI.LIZJ(new C59457NVd(instance));
        }
    }
}
