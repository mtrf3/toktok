package com.ss.android.ugc.aweme.panel;

import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C00F;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C158166Iq;
import X.C16360ka;
import X.C16880lQ;
import X.C1DG;
import X.C2068389v;
import X.C26338AVi;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C45631qh;
import X.C45940I1g;
import X.C52529KjV;
import X.C52908Kpc;
import X.C65300Pk0;
import X.C6IE;
import X.C6IG;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C73305Spp;
import X.C73306Spq;
import X.C74216TAu;
import X.C74275TDb;
import X.C76800UCe;
import X.C78596Usy;
import X.C81455Vxz;
import X.C82622Wbi;
import X.C90903hW;
import X.EnumC81461Vy5;
import X.EnumC81464Vy8;
import X.I1R;
import X.I1S;
import X.I1U;
import X.I20;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC81454Vxy;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.O6R;
import X.T3B;
import X.T4X;
import X.TBW;
import X.TMG;
import X.W1T;
import Y.ACListenerS34S0100000_14;
import Y.AObjectS89S0100000_14;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class CommentAndQuestionStickerPanelPageFragment extends Fragment implements InterfaceC151715xP {
    public static final /* synthetic */ int LL = 0;
    public C82622Wbi LJLIL;
    public InterfaceC81454Vxy LJLILLLLZI;
    public String LJLJI;
    public LinearLayout LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public C45631qh LJLL;
    public C81455Vxz LJLLI;
    public C81455Vxz LJLLILLLL;
    public C81455Vxz LJLLJ;
    public C81455Vxz LJLLL;
    public C81455Vxz LJLLLL;
    public C81455Vxz LJLLLLLL;
    public T3B LJLZ;
    public final MutableLiveData<Boolean> LJZ;
    public boolean LJZI;
    public final Map<Integer, View> LJZL = new LinkedHashMap();
    public EnumC81464Vy8 LJLJJI = EnumC81464Vy8.SUGGEST_TAB;

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public CommentAndQuestionStickerPanelPageFragment() {
        new MutableLiveData();
        this.LJZ = new MutableLiveData<>();
    }

    public final C82622Wbi wl() {
        C82622Wbi c82622Wbi = this.LJLIL;
        if (c82622Wbi != null) {
            return c82622Wbi;
        }
        o.LJIJI("diContainer");
        throw null;
    }

    public final void xl() {
        Al("loading");
        InterfaceC81454Vxy interfaceC81454Vxy = this.LJLILLLLZI;
        if (interfaceC81454Vxy != null) {
            interfaceC81454Vxy.x00(new AqS180S0100000_14(this, 124));
            Dl(C52908Kpc.LIZ());
        } else {
            o.LJIJI("commentAndQuestionStickerPanelApi");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJZL).clear();
    }

    public final void vl() {
        Context context = getContext();
        if (context != null && C158166Iq.LIZIZ()) {
            C6IE c6ie = C6IE.RECORD_PAGE_PANEL;
            if (C6IG.LIZIZ(c6ie) && C158166Iq.LIZ() == 2) {
                InterfaceC81454Vxy interfaceC81454Vxy = this.LJLILLLLZI;
                if (interfaceC81454Vxy != null) {
                    if (interfaceC81454Vxy.L10() == EnumC81464Vy8.SUGGEST_TAB) {
                        InterfaceC81454Vxy interfaceC81454Vxy2 = this.LJLILLLLZI;
                        if (interfaceC81454Vxy2 != null) {
                            if (interfaceC81454Vxy2.getPanelType() == c6ie && C74216TAu.LIZIZ.LJIIIZ()) {
                                C81455Vxz c81455Vxz = new C81455Vxz(context, EnumC81461Vy5.AskAQuestion, wl());
                                LinearLayout linearLayout = this.LJLJJL;
                                if (linearLayout != null) {
                                    linearLayout.addView(c81455Vxz);
                                    return;
                                } else {
                                    o.LJIJI("normalPage");
                                    throw null;
                                }
                            }
                            return;
                        }
                        o.LJIJI("commentAndQuestionStickerPanelApi");
                        throw null;
                    }
                    return;
                }
                o.LJIJI("commentAndQuestionStickerPanelApi");
                throw null;
            }
        }
    }

    public final void Al(String str) {
        C73305Spp c73305Spp;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (o.LJ(str, "error") || o.LJ(str, "noInternet")) {
            if (this.LJZI) {
                C78596Usy.LJJJLIIL(getContext(), true);
            }
            this.LJZI = true;
        }
        switch (str.hashCode()) {
            case -1039745817:
                if (!str.equals("normal")) {
                    return;
                }
                LinearLayout linearLayout = this.LJLJJL;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    View view = this.LJLJJLL;
                    if (view != null) {
                        view.setVisibility(8);
                        View view2 = this.LJLJL;
                        if (view2 != null) {
                            view2.setVisibility(8);
                            View view3 = this.LJLJLJ;
                            if (view3 != null) {
                                view3.setVisibility(8);
                                View view4 = this.LJLJLJ;
                                if (view4 != null) {
                                    ((T4X) view4.findViewById(R.id.g94)).setVisibility(8);
                                    return;
                                } else {
                                    o.LJIJI("loadingPage");
                                    throw null;
                                }
                            }
                            o.LJIJI("loadingPage");
                            throw null;
                        }
                        o.LJIJI("networkErrorPage");
                        throw null;
                    }
                    o.LJIJI("emptyStickerPage");
                    throw null;
                }
                o.LJIJI("normalPage");
                throw null;
            case 96634189:
                if (!str.equals("empty")) {
                    return;
                }
                LinearLayout linearLayout2 = this.LJLJJL;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                    View view5 = this.LJLJJLL;
                    if (view5 != null) {
                        view5.setVisibility(0);
                        View view6 = this.LJLJL;
                        if (view6 != null) {
                            view6.setVisibility(8);
                            View view7 = this.LJLJLJ;
                            if (view7 != null) {
                                view7.setVisibility(8);
                                View view8 = getView();
                                if (view8 != null) {
                                    c73305Spp = (C73305Spp) view8.findViewById(R.id.kfl);
                                } else {
                                    c73305Spp = null;
                                }
                                if (I1R.LIZLLL()) {
                                    String str2 = this.LJLJI;
                                    if (str2 != null) {
                                        InterfaceC81454Vxy interfaceC81454Vxy = this.LJLILLLLZI;
                                        if (interfaceC81454Vxy != null) {
                                            if (o.LJ(str2, ListProtector.get(interfaceC81454Vxy.XD(), 0))) {
                                                if (c73305Spp == null) {
                                                    return;
                                                }
                                                C73306Spq c73306Spq = new C73306Spq();
                                                C2068389v c2068389v = new C2068389v();
                                                c2068389v.LIZ = R.raw.icon_large_lightbulb;
                                                c2068389v.LJ = Integer.valueOf(R.attr.dn);
                                                c73306Spq.LIZJ = 0;
                                                c73306Spq.LIZIZ = c2068389v;
                                                String string = getString(R.string.pmw);
                                                o.LJIIIIZZ(string, "getString(R.string.qa_ha…screen_recommended_title)");
                                                c73306Spq.LJFF = string;
                                                String string2 = getString(R.string.pmu);
                                                o.LJIIIIZZ(string2, "getString(R.string.qa_halfscreen_recommended_desc)");
                                                c73306Spq.LJI = string2;
                                                c73305Spp.setStatus(c73306Spq);
                                                return;
                                            }
                                            String str3 = this.LJLJI;
                                            if (str3 != null) {
                                                InterfaceC81454Vxy interfaceC81454Vxy2 = this.LJLILLLLZI;
                                                if (interfaceC81454Vxy2 != null) {
                                                    if (o.LJ(str3, ListProtector.get(interfaceC81454Vxy2.XD(), 1))) {
                                                        if (I1U.LIZ() != 0) {
                                                            i4 = R.raw.icon_large_error_qa_ltr;
                                                        } else {
                                                            i4 = R.raw.icon_large_bubble_bookmark;
                                                        }
                                                        if (I1S.LIZ()) {
                                                            i5 = R.string.gaj;
                                                        } else {
                                                            i5 = R.string.pmt;
                                                        }
                                                        if (I1S.LIZ()) {
                                                            i6 = R.string.gai;
                                                        } else {
                                                            i6 = R.string.pmr;
                                                        }
                                                        if (c73305Spp == null) {
                                                            return;
                                                        }
                                                        C73306Spq c73306Spq2 = new C73306Spq();
                                                        C2068389v c2068389v2 = new C2068389v();
                                                        c2068389v2.LIZ = i4;
                                                        c2068389v2.LJ = Integer.valueOf(R.attr.dn);
                                                        c73306Spq2.LIZJ = 0;
                                                        c73306Spq2.LIZIZ = c2068389v2;
                                                        String string3 = getString(i5);
                                                        o.LJIIIIZZ(string3, "getString(title)");
                                                        c73306Spq2.LJFF = string3;
                                                        String string4 = getString(i6);
                                                        o.LJIIIIZZ(string4, "getString(message)");
                                                        c73306Spq2.LJI = string4;
                                                        c73305Spp.setStatus(c73306Spq2);
                                                        return;
                                                    }
                                                    if (c73305Spp == null) {
                                                        return;
                                                    }
                                                    C73306Spq c73306Spq3 = new C73306Spq();
                                                    C2068389v c2068389v3 = new C2068389v();
                                                    c2068389v3.LIZ = R.raw.icon_large_bubble_bookmark;
                                                    c2068389v3.LJ = Integer.valueOf(R.attr.dn);
                                                    c73306Spq3.LIZJ = 0;
                                                    c73306Spq3.LIZIZ = c2068389v3;
                                                    String string5 = getString(R.string.pmq);
                                                    o.LJIIIIZZ(string5, "getString(title)");
                                                    c73306Spq3.LJFF = string5;
                                                    String string6 = getString(R.string.pmo);
                                                    o.LJIIIIZZ(string6, "getString(message)");
                                                    c73306Spq3.LJI = string6;
                                                    c73305Spp.setStatus(c73306Spq3);
                                                    return;
                                                }
                                                o.LJIJI("commentAndQuestionStickerPanelApi");
                                                throw null;
                                            }
                                            o.LJIJI("tabTitle");
                                            throw null;
                                        }
                                        o.LJIJI("commentAndQuestionStickerPanelApi");
                                        throw null;
                                    }
                                    o.LJIJI("tabTitle");
                                    throw null;
                                }
                                String str4 = this.LJLJI;
                                if (str4 != null) {
                                    InterfaceC81454Vxy interfaceC81454Vxy3 = this.LJLILLLLZI;
                                    if (interfaceC81454Vxy3 != null) {
                                        if (o.LJ(str4, ListProtector.get(interfaceC81454Vxy3.XD(), 0))) {
                                            if (c73305Spp == null) {
                                                return;
                                            }
                                            C73306Spq c73306Spq4 = new C73306Spq();
                                            C2068389v c2068389v4 = new C2068389v();
                                            c2068389v4.LIZ = R.raw.icon_large_lightbulb;
                                            c2068389v4.LJ = Integer.valueOf(R.attr.dn);
                                            c73306Spq4.LIZJ = 0;
                                            c73306Spq4.LIZIZ = c2068389v4;
                                            String string7 = getString(R.string.pmw);
                                            o.LJIIIIZZ(string7, "getString(R.string.qa_ha…screen_recommended_title)");
                                            c73306Spq4.LJFF = string7;
                                            String string8 = getString(R.string.pmu);
                                            o.LJIIIIZZ(string8, "getString(R.string.qa_halfscreen_recommended_desc)");
                                            c73306Spq4.LJI = string8;
                                            c73305Spp.setStatus(c73306Spq4);
                                            return;
                                        }
                                        String str5 = this.LJLJI;
                                        if (str5 != null) {
                                            InterfaceC81454Vxy interfaceC81454Vxy4 = this.LJLILLLLZI;
                                            if (interfaceC81454Vxy4 != null) {
                                                if (!o.LJ(str5, ListProtector.get(interfaceC81454Vxy4.XD(), 1))) {
                                                    return;
                                                }
                                                if (I1U.LIZ() != 0) {
                                                    i = R.raw.icon_large_error_qa_ltr;
                                                } else {
                                                    i = R.raw.icon_large_bubble_bookmark;
                                                }
                                                if (I1S.LIZ()) {
                                                    i2 = R.string.gaj;
                                                } else {
                                                    i2 = R.string.pmt;
                                                }
                                                if (I1S.LIZ()) {
                                                    i3 = R.string.gai;
                                                } else {
                                                    i3 = R.string.pmr;
                                                }
                                                if (c73305Spp == null) {
                                                    return;
                                                }
                                                C73306Spq c73306Spq5 = new C73306Spq();
                                                C2068389v c2068389v5 = new C2068389v();
                                                c2068389v5.LIZ = i;
                                                c2068389v5.LJ = Integer.valueOf(R.attr.dn);
                                                c73306Spq5.LIZJ = 0;
                                                c73306Spq5.LIZIZ = c2068389v5;
                                                String string9 = getString(i2);
                                                o.LJIIIIZZ(string9, "getString(title)");
                                                c73306Spq5.LJFF = string9;
                                                String string10 = getString(i3);
                                                o.LJIIIIZZ(string10, "getString(message)");
                                                c73306Spq5.LJI = string10;
                                                c73305Spp.setStatus(c73306Spq5);
                                                return;
                                            }
                                            o.LJIJI("commentAndQuestionStickerPanelApi");
                                            throw null;
                                        }
                                        o.LJIJI("tabTitle");
                                        throw null;
                                    }
                                    o.LJIJI("commentAndQuestionStickerPanelApi");
                                    throw null;
                                }
                                o.LJIJI("tabTitle");
                                throw null;
                            }
                            o.LJIJI("loadingPage");
                            throw null;
                        }
                        o.LJIJI("networkErrorPage");
                        throw null;
                    }
                    o.LJIJI("emptyStickerPage");
                    throw null;
                }
                o.LJIJI("normalPage");
                throw null;
            case 96784904:
                if (!str.equals("error")) {
                    return;
                }
                LinearLayout linearLayout3 = this.LJLJJL;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                    View view9 = this.LJLJJLL;
                    if (view9 != null) {
                        view9.setVisibility(8);
                        View view10 = this.LJLJL;
                        if (view10 != null) {
                            view10.setVisibility(0);
                            if (C52908Kpc.LIZ()) {
                                T3B t3b = this.LJLZ;
                                if (t3b != null) {
                                    t3b.LIZLLL();
                                }
                                T3B t3b2 = this.LJLZ;
                                if (t3b2 != null) {
                                    t3b2.LIZ();
                                }
                            } else {
                                View view11 = this.LJLJL;
                                if (view11 != null) {
                                    view11.findViewById(R.id.bl_).setVisibility(8);
                                    View view12 = this.LJLJL;
                                    if (view12 != null) {
                                        C1DG.LJI(view12, R.string.pmn, (TuxTextView) view12.findViewById(R.id.bl5));
                                    } else {
                                        o.LJIJI("networkErrorPage");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("networkErrorPage");
                                    throw null;
                                }
                            }
                            View view13 = this.LJLJLJ;
                            if (view13 != null) {
                                view13.setVisibility(8);
                                return;
                            } else {
                                o.LJIJI("loadingPage");
                                throw null;
                            }
                        }
                        o.LJIJI("networkErrorPage");
                        throw null;
                    }
                    o.LJIJI("emptyStickerPage");
                    throw null;
                }
                o.LJIJI("normalPage");
                throw null;
            case 336650556:
                if (!str.equals("loading")) {
                    return;
                }
                LinearLayout linearLayout4 = this.LJLJJL;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                    View view14 = this.LJLJJLL;
                    if (view14 != null) {
                        view14.setVisibility(8);
                        View view15 = this.LJLJL;
                        if (view15 != null) {
                            view15.setVisibility(8);
                            View view16 = this.LJLJLJ;
                            if (view16 != null) {
                                view16.setVisibility(0);
                                View view17 = this.LJLJLJ;
                                if (view17 != null) {
                                    ((T4X) view17.findViewById(R.id.g94)).setVisibility(0);
                                    return;
                                } else {
                                    o.LJIJI("loadingPage");
                                    throw null;
                                }
                            }
                            o.LJIJI("loadingPage");
                            throw null;
                        }
                        o.LJIJI("networkErrorPage");
                        throw null;
                    }
                    o.LJIJI("emptyStickerPage");
                    throw null;
                }
                o.LJIJI("normalPage");
                throw null;
            case 1729423394:
                if (!str.equals("noInternet")) {
                    return;
                }
                LinearLayout linearLayout5 = this.LJLJJL;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                    View view18 = this.LJLJJLL;
                    if (view18 != null) {
                        view18.setVisibility(8);
                        View view19 = this.LJLJL;
                        if (view19 != null) {
                            view19.setVisibility(0);
                            View view20 = this.LJLJL;
                            if (view20 != null) {
                                if (C52908Kpc.LIZ()) {
                                    T3B t3b3 = this.LJLZ;
                                    if (t3b3 != null) {
                                        t3b3.LIZLLL();
                                    }
                                    T3B t3b4 = this.LJLZ;
                                    if (t3b4 != null) {
                                        t3b4.LIZ();
                                    }
                                } else {
                                    ((TextView) view20.findViewById(R.id.bl6)).setText(view20.getContext().getString(R.string.ha1));
                                    C1DG.LJI(view20, R.string.ha0, (TuxTextView) view20.findViewById(R.id.bl5));
                                }
                                View view21 = this.LJLJLJ;
                                if (view21 != null) {
                                    view21.setVisibility(8);
                                    return;
                                } else {
                                    o.LJIJI("loadingPage");
                                    throw null;
                                }
                            }
                            o.LJIJI("networkErrorPage");
                            throw null;
                        }
                        o.LJIJI("networkErrorPage");
                        throw null;
                    }
                    o.LJIJI("emptyStickerPage");
                    throw null;
                }
                o.LJIJI("normalPage");
                throw null;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        if (r0.LIZ() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
    
        Al("normal");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
    
        if (r0.LIZ() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b3, code lost:
    
        if (r0.LIZ() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bd, code lost:
    
        if (r0.LIZ() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c8, code lost:
    
        if (r0.LIZ() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d2, code lost:
    
        if (r0.LIZ() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00dc, code lost:
    
        if (r0.LIZ() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00e6, code lost:
    
        if (r0.LIZ() == false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dl(boolean r7) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.panel.CommentAndQuestionStickerPanelPageFragment.Dl(boolean):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C52908Kpc.LIZ()) {
            T3B t3b = this.LJLZ;
            if (t3b != null) {
                t3b.setRetryCallback(new AqS164S0100000_14(this, 121));
                return;
            }
            return;
        }
        View view = this.LJLJL;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 20), view.findViewById(R.id.cyn));
        } else {
            o.LJIJI("networkErrorPage");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C45631qh c45631qh;
        C81455Vxz c81455Vxz;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "6862305282212335670");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/panel/CommentAndQuestionStickerPanelPageFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/panel/CommentAndQuestionStickerPanelPageFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (C52529KjV.LIZ() && (c45631qh = this.LJLL) != null) {
            C16360ka.LJIJI(c45631qh, z);
            LinearLayout linearLayout = this.LJLJJL;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    LinearLayout linearLayout2 = this.LJLJJL;
                    if (linearLayout2 != null) {
                        View childAt = linearLayout2.getChildAt(i);
                        if ((childAt instanceof C81455Vxz) && (c81455Vxz = (C81455Vxz) childAt) != null) {
                            c81455Vxz.setIsVisibleToUser(z);
                        }
                    } else {
                        o.LJIJI("normalPage");
                        throw null;
                    }
                }
                c45631qh.requestLayout();
            } else {
                o.LJIJI("normalPage");
                throw null;
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/panel/CommentAndQuestionStickerPanelPageFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (I20.LIZ()) {
            Al("loading");
            InterfaceC81454Vxy interfaceC81454Vxy = this.LJLILLLLZI;
            if (interfaceC81454Vxy != null) {
                interfaceC81454Vxy.wu0().observe(this, new AObjectS89S0100000_14(this, 121));
            } else {
                o.LJIJI("commentAndQuestionStickerPanelApi");
                throw null;
            }
        } else {
            Dl(false);
        }
        this.LJZ.observe(this, new AObjectS89S0100000_14(this, 122));
        if (C52908Kpc.LIZ()) {
            InterfaceC81454Vxy interfaceC81454Vxy2 = this.LJLILLLLZI;
            if (interfaceC81454Vxy2 != null) {
                interfaceC81454Vxy2.LLJLILLLLZIIL().LIZLLL(this, new AObjectS89S0100000_14(this, 123));
            } else {
                o.LJIJI("commentAndQuestionStickerPanelApi");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        this.LJLILLLLZI = (InterfaceC81454Vxy) wl().LJ(InterfaceC81454Vxy.class, null);
        boolean z4 = false;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.wh, viewGroup, false);
        View findViewById = LLLLIILL.findViewById(R.id.h37);
        o.LJII(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.LJLJJL = (LinearLayout) findViewById;
        if (C158166Iq.LIZIZ() && C158166Iq.LIZ() == 1) {
            LinearLayout linearLayout = this.LJLJJL;
            if (linearLayout != null) {
                C26338AVi.LJIIIZ(linearLayout, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(112))), 23);
            } else {
                o.LJIJI("normalPage");
                throw null;
            }
        }
        View findViewById2 = LLLLIILL.findViewById(R.id.h2r);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.no_sticker_page)");
        this.LJLJJLL = findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.gyv);
        ViewGroup viewGroup2 = (ViewGroup) findViewById3;
        if (C52908Kpc.LIZ()) {
            Context context = viewGroup2.getContext();
            o.LJIIIIZZ(context, "context");
            T3B t3b = new T3B(context);
            t3b.setId(R.id.cyn);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = (int) C74275TDb.LIZ(24.0f);
            layoutParams.bottomMargin = (int) C74275TDb.LIZ(16.0f);
            t3b.setLayoutParams(layoutParams);
            t3b.setRetryCallback(new AqS164S0100000_14(this, 122));
            t3b.setAutoRetryCondition(new AqS164S0100000_14(this, 123));
            this.LJLZ = t3b;
            viewGroup2.addView(t3b);
        } else {
            C16880lQ.LLLLIILL(inflater, R.layout.we, viewGroup2, true);
        }
        o.LJIIIIZZ(findViewById3, "rootView.findViewById<Vi…)\n            }\n        }");
        this.LJLJL = findViewById3;
        C45631qh c45631qh = (C45631qh) LLLLIILL.findViewById(R.id.gym);
        if (C52529KjV.LIZ()) {
            c45631qh.setFillViewport(true);
        }
        this.LJLL = c45631qh;
        View findViewById4 = LLLLIILL.findViewById(R.id.g8s);
        o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.loading_page)");
        this.LJLJLJ = findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.bm0);
        o.LJIIIIZZ(findViewById5, "rootView.findViewById(R.…nt_sticker_panel_shallow)");
        this.LJLJLLL = findViewById5;
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("tabTitle", "");
            o.LJIIIIZZ(string, "it.getString(TAB_TITLE, \"\")");
            this.LJLJI = string;
        }
        if (I1R.LIZLLL()) {
            String str = this.LJLJI;
            if (str != null) {
                InterfaceC81454Vxy interfaceC81454Vxy = this.LJLILLLLZI;
                if (interfaceC81454Vxy != null) {
                    if (o.LJ(str, ListProtector.get(interfaceC81454Vxy.TW(), 0))) {
                        this.LJLJJI = EnumC81464Vy8.FAVORITE_TAB;
                        Context context2 = getContext();
                        if (context2 != null) {
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                            if (I1U.LIZ() != 0) {
                                z4 = true;
                            }
                            if (z4) {
                                C81455Vxz c81455Vxz = new C81455Vxz(context2, EnumC81461Vy5.FavoriteQuestion, wl());
                                this.LJLLL = c81455Vxz;
                                c81455Vxz.setLayoutParams(layoutParams2);
                                LinearLayout linearLayout2 = this.LJLJJL;
                                if (linearLayout2 != null) {
                                    linearLayout2.addView(this.LJLLL);
                                } else {
                                    o.LJIJI("normalPage");
                                    throw null;
                                }
                            }
                            if (!C45940I1g.LIZIZ()) {
                                this.LJLLLL = new C81455Vxz(context2, EnumC81461Vy5.FavoriteComment, wl());
                                C81455Vxz c81455Vxz2 = this.LJLLJ;
                                if (c81455Vxz2 != null) {
                                    c81455Vxz2.setLayoutParams(layoutParams2);
                                }
                                LinearLayout linearLayout3 = this.LJLJJL;
                                if (linearLayout3 != null) {
                                    linearLayout3.addView(this.LJLLLL);
                                } else {
                                    o.LJIJI("normalPage");
                                    throw null;
                                }
                            }
                        }
                    } else {
                        String str2 = this.LJLJI;
                        if (str2 != null) {
                            InterfaceC81454Vxy interfaceC81454Vxy2 = this.LJLILLLLZI;
                            if (interfaceC81454Vxy2 != null) {
                                if (o.LJ(str2, ListProtector.get(interfaceC81454Vxy2.TW(), 1))) {
                                    this.LJLJJI = EnumC81464Vy8.SUGGEST_TAB;
                                    vl();
                                    Context context3 = getContext();
                                    if (context3 != null) {
                                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                                        this.LJLLLLLL = new C81455Vxz(context3, EnumC81461Vy5.MIX_INVITE_RECOMMEND_QUESTION, wl());
                                        C81455Vxz c81455Vxz3 = this.LJLLL;
                                        if (c81455Vxz3 != null) {
                                            c81455Vxz3.setLayoutParams(layoutParams3);
                                        }
                                        LinearLayout linearLayout4 = this.LJLJJL;
                                        if (linearLayout4 != null) {
                                            linearLayout4.addView(this.LJLLLLLL);
                                        } else {
                                            o.LJIJI("normalPage");
                                            throw null;
                                        }
                                    }
                                } else {
                                    this.LJLJJI = EnumC81464Vy8.COMMENTSTAB;
                                    Context context4 = getContext();
                                    if (context4 != null && !C45940I1g.LIZIZ()) {
                                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                                        C81455Vxz c81455Vxz4 = new C81455Vxz(context4, EnumC81461Vy5.RecommendComment, wl());
                                        this.LJLLJ = c81455Vxz4;
                                        c81455Vxz4.setLayoutParams(layoutParams4);
                                        LinearLayout linearLayout5 = this.LJLJJL;
                                        if (linearLayout5 != null) {
                                            linearLayout5.addView(this.LJLLJ);
                                        } else {
                                            o.LJIJI("normalPage");
                                            throw null;
                                        }
                                    }
                                }
                            } else {
                                o.LJIJI("commentAndQuestionStickerPanelApi");
                                throw null;
                            }
                        } else {
                            o.LJIJI("tabTitle");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("commentAndQuestionStickerPanelApi");
                    throw null;
                }
            } else {
                o.LJIJI("tabTitle");
                throw null;
            }
        } else {
            if (C00F.LIZ(31744, 0, "studio_improve_qa_reply_panel", true) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (C00F.LIZ(31744, 0, "studio_improve_qa_reply_panel", true) == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if (C00F.LIZ(31744, 0, "studio_improve_qa_reply_panel", true) == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        String str3 = this.LJLJI;
                        if (str3 != null) {
                            InterfaceC81454Vxy interfaceC81454Vxy3 = this.LJLILLLLZI;
                            if (interfaceC81454Vxy3 != null) {
                                if (o.LJ(str3, ListProtector.get(interfaceC81454Vxy3.XD(), 0))) {
                                    this.LJLJJI = EnumC81464Vy8.SUGGEST_TAB;
                                    vl();
                                    Context context5 = getContext();
                                    if (context5 != null) {
                                        if (I1U.LIZIZ()) {
                                            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                                            this.LJLLI = new C81455Vxz(context5, EnumC81461Vy5.InvitationQuestion, wl());
                                            C81455Vxz c81455Vxz5 = this.LJLLL;
                                            if (c81455Vxz5 != null) {
                                                c81455Vxz5.setLayoutParams(layoutParams5);
                                            }
                                            LinearLayout linearLayout6 = this.LJLJJL;
                                            if (linearLayout6 != null) {
                                                linearLayout6.addView(this.LJLLI);
                                            } else {
                                                o.LJIJI("normalPage");
                                                throw null;
                                            }
                                        }
                                        if (I1U.LIZ() == 3) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                                            C81455Vxz c81455Vxz6 = new C81455Vxz(context5, EnumC81461Vy5.RecommendQuestion, wl());
                                            this.LJLLILLLL = c81455Vxz6;
                                            c81455Vxz6.setLayoutParams(layoutParams6);
                                            LinearLayout linearLayout7 = this.LJLJJL;
                                            if (linearLayout7 != null) {
                                                linearLayout7.addView(this.LJLLILLLL);
                                            } else {
                                                o.LJIJI("normalPage");
                                                throw null;
                                            }
                                        }
                                        if (!C45940I1g.LIZIZ()) {
                                            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
                                            C81455Vxz c81455Vxz7 = new C81455Vxz(context5, EnumC81461Vy5.RecommendComment, wl());
                                            this.LJLLJ = c81455Vxz7;
                                            c81455Vxz7.setLayoutParams(layoutParams7);
                                            LinearLayout linearLayout8 = this.LJLJJL;
                                            if (linearLayout8 != null) {
                                                linearLayout8.addView(this.LJLLJ);
                                            } else {
                                                o.LJIJI("normalPage");
                                                throw null;
                                            }
                                        }
                                    }
                                } else {
                                    this.LJLJJI = EnumC81464Vy8.FAVORITE_TAB;
                                    Context context6 = getContext();
                                    if (context6 != null) {
                                        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
                                        if (I1U.LIZ() != 0) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            C81455Vxz c81455Vxz8 = new C81455Vxz(context6, EnumC81461Vy5.FavoriteQuestion, wl());
                                            this.LJLLL = c81455Vxz8;
                                            c81455Vxz8.setLayoutParams(layoutParams8);
                                            LinearLayout linearLayout9 = this.LJLJJL;
                                            if (linearLayout9 != null) {
                                                linearLayout9.addView(this.LJLLL);
                                            } else {
                                                o.LJIJI("normalPage");
                                                throw null;
                                            }
                                        }
                                        if (!C45940I1g.LIZIZ()) {
                                            this.LJLLLL = new C81455Vxz(context6, EnumC81461Vy5.FavoriteComment, wl());
                                            C81455Vxz c81455Vxz9 = this.LJLLJ;
                                            if (c81455Vxz9 != null) {
                                                c81455Vxz9.setLayoutParams(layoutParams8);
                                            }
                                            LinearLayout linearLayout10 = this.LJLJJL;
                                            if (linearLayout10 != null) {
                                                linearLayout10.addView(this.LJLLLL);
                                            } else {
                                                o.LJIJI("normalPage");
                                                throw null;
                                            }
                                        }
                                    }
                                }
                            } else {
                                o.LJIJI("commentAndQuestionStickerPanelApi");
                                throw null;
                            }
                        } else {
                            o.LJIJI("tabTitle");
                            throw null;
                        }
                    } else {
                        String str4 = this.LJLJI;
                        if (str4 != null) {
                            InterfaceC81454Vxy interfaceC81454Vxy4 = this.LJLILLLLZI;
                            if (interfaceC81454Vxy4 != null) {
                                if (o.LJ(str4, ListProtector.get(interfaceC81454Vxy4.XD(), 0))) {
                                    this.LJLJJI = EnumC81464Vy8.SUGGEST_TAB;
                                    Context context7 = getContext();
                                    if (context7 != null) {
                                        vl();
                                        if (I1U.LIZIZ()) {
                                            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
                                            this.LJLLI = new C81455Vxz(context7, EnumC81461Vy5.InvitationQuestion, wl());
                                            C81455Vxz c81455Vxz10 = this.LJLLL;
                                            if (c81455Vxz10 != null) {
                                                c81455Vxz10.setLayoutParams(layoutParams9);
                                            }
                                            LinearLayout linearLayout11 = this.LJLJJL;
                                            if (linearLayout11 != null) {
                                                linearLayout11.addView(this.LJLLI);
                                            } else {
                                                o.LJIJI("normalPage");
                                                throw null;
                                            }
                                        }
                                        if (I1U.LIZ() == 3) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2);
                                            C81455Vxz c81455Vxz11 = new C81455Vxz(context7, EnumC81461Vy5.RecommendQuestion, wl());
                                            this.LJLLILLLL = c81455Vxz11;
                                            c81455Vxz11.setLayoutParams(layoutParams10);
                                            LinearLayout linearLayout12 = this.LJLJJL;
                                            if (linearLayout12 != null) {
                                                linearLayout12.addView(this.LJLLILLLL);
                                            } else {
                                                o.LJIJI("normalPage");
                                                throw null;
                                            }
                                        }
                                        if (!C45940I1g.LIZIZ()) {
                                            LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, -2);
                                            C81455Vxz c81455Vxz12 = new C81455Vxz(context7, EnumC81461Vy5.RecommendComment, wl());
                                            this.LJLLJ = c81455Vxz12;
                                            c81455Vxz12.setLayoutParams(layoutParams11);
                                            LinearLayout linearLayout13 = this.LJLJJL;
                                            if (linearLayout13 != null) {
                                                linearLayout13.addView(this.LJLLJ);
                                            } else {
                                                o.LJIJI("normalPage");
                                                throw null;
                                            }
                                        }
                                    }
                                } else {
                                    this.LJLJJI = EnumC81464Vy8.FAVORITE_TAB;
                                    Context context8 = getContext();
                                    if (context8 != null) {
                                        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, -2);
                                        if (I1U.LIZ() != 0) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            C81455Vxz c81455Vxz13 = new C81455Vxz(context8, EnumC81461Vy5.FavoriteQuestion, wl());
                                            this.LJLLL = c81455Vxz13;
                                            c81455Vxz13.setLayoutParams(layoutParams12);
                                            LinearLayout linearLayout14 = this.LJLJJL;
                                            if (linearLayout14 != null) {
                                                linearLayout14.addView(this.LJLLL);
                                            } else {
                                                o.LJIJI("normalPage");
                                                throw null;
                                            }
                                        }
                                        if (!C45940I1g.LIZIZ()) {
                                            this.LJLLLL = new C81455Vxz(context8, EnumC81461Vy5.FavoriteComment, wl());
                                            C81455Vxz c81455Vxz14 = this.LJLLJ;
                                            if (c81455Vxz14 != null) {
                                                c81455Vxz14.setLayoutParams(layoutParams12);
                                            }
                                            LinearLayout linearLayout15 = this.LJLJJL;
                                            if (linearLayout15 != null) {
                                                linearLayout15.addView(this.LJLLLL);
                                            } else {
                                                o.LJIJI("normalPage");
                                                throw null;
                                            }
                                        }
                                    }
                                }
                            } else {
                                o.LJIJI("commentAndQuestionStickerPanelApi");
                                throw null;
                            }
                        } else {
                            o.LJIJI("tabTitle");
                            throw null;
                        }
                    }
                }
            }
            String str5 = this.LJLJI;
            if (str5 != null) {
                InterfaceC81454Vxy interfaceC81454Vxy5 = this.LJLILLLLZI;
                if (interfaceC81454Vxy5 != null) {
                    if (o.LJ(str5, ListProtector.get(interfaceC81454Vxy5.XD(), 0))) {
                        this.LJLJJI = EnumC81464Vy8.SUGGEST_TAB;
                        vl();
                        Context context9 = getContext();
                        if (context9 != null) {
                            LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
                            this.LJLLLLLL = new C81455Vxz(context9, EnumC81461Vy5.MIX_INVITE_RECOMMEND_QUESTION, wl());
                            C81455Vxz c81455Vxz15 = this.LJLLL;
                            if (c81455Vxz15 != null) {
                                c81455Vxz15.setLayoutParams(layoutParams13);
                            }
                            LinearLayout linearLayout16 = this.LJLJJL;
                            if (linearLayout16 != null) {
                                linearLayout16.addView(this.LJLLLLLL);
                                if (!C45940I1g.LIZIZ()) {
                                    LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, -2);
                                    C81455Vxz c81455Vxz16 = new C81455Vxz(context9, EnumC81461Vy5.RecommendComment, wl());
                                    this.LJLLJ = c81455Vxz16;
                                    c81455Vxz16.setLayoutParams(layoutParams14);
                                    LinearLayout linearLayout17 = this.LJLJJL;
                                    if (linearLayout17 != null) {
                                        linearLayout17.addView(this.LJLLJ);
                                    } else {
                                        o.LJIJI("normalPage");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("normalPage");
                                throw null;
                            }
                        }
                    } else {
                        this.LJLJJI = EnumC81464Vy8.FAVORITE_TAB;
                        Context context10 = getContext();
                        if (context10 != null) {
                            LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-1, -2);
                            if (I1U.LIZ() != 0) {
                                z4 = true;
                            }
                            if (z4) {
                                C81455Vxz c81455Vxz17 = new C81455Vxz(context10, EnumC81461Vy5.FavoriteQuestion, wl());
                                this.LJLLL = c81455Vxz17;
                                c81455Vxz17.setLayoutParams(layoutParams15);
                                LinearLayout linearLayout18 = this.LJLJJL;
                                if (linearLayout18 != null) {
                                    linearLayout18.addView(this.LJLLL);
                                } else {
                                    o.LJIJI("normalPage");
                                    throw null;
                                }
                            }
                            if (!C45940I1g.LIZIZ()) {
                                this.LJLLLL = new C81455Vxz(context10, EnumC81461Vy5.FavoriteComment, wl());
                                C81455Vxz c81455Vxz18 = this.LJLLJ;
                                if (c81455Vxz18 != null) {
                                    c81455Vxz18.setLayoutParams(layoutParams15);
                                }
                                LinearLayout linearLayout19 = this.LJLJJL;
                                if (linearLayout19 != null) {
                                    linearLayout19.addView(this.LJLLLL);
                                } else {
                                    o.LJIJI("normalPage");
                                    throw null;
                                }
                            }
                        }
                    }
                } else {
                    o.LJIJI("commentAndQuestionStickerPanelApi");
                    throw null;
                }
            } else {
                o.LJIJI("tabTitle");
                throw null;
            }
        }
        View view = this.LJLJL;
        if (view != null) {
            view.setVisibility(8);
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            return LLLLIILL;
        }
        o.LJIJI("networkErrorPage");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
