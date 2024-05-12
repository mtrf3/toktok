package com.ss.android.ugc.profile.platform.business.header.business.cta.assemble;

import X.AVS;
import X.C16120kC;
import X.C16880lQ;
import X.C2068389v;
import X.C212428Vi;
import X.C221018lt;
import X.C221108m2;
import X.C232459Aj;
import X.C234319Hn;
import X.C234409Hw;
import X.C234419Hx;
import X.C234439Hz;
import X.C252659vp;
import X.C32151Nz;
import X.C40675Fxn;
import X.C47261Igj;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C76800UCe;
import X.C7MY;
import X.C9HJ;
import X.C9HK;
import X.EnumC234309Hm;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.KL2;
import X.O6R;
import X.QZZ;
import X.SY9;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS24S0100000_4;
import Y.IDComparatorS337S0100000_4;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.DynamicDrawableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes5.dex */
public abstract class ProfileHeaderCTABaseComponent extends HeaderBaseContainerComponent implements IHeaderCTAAbility {
    public final Map<String, EnumC234309Hm> LJLLILLLL;
    public final Map<String, C234419Hx> LJLLJ;
    public final List<String> LJLLL;
    public final List<String> LJLLLL;
    public final List<String> LJLLLLLL;
    public final List<String> LJLZ;
    public boolean LJZ;
    public Context LJZI;
    public float LJZL;
    public int LL;
    public final List<C252659vp> LLD;
    public final C62822Ol8 LLF;

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void A3() {
    }

    public ProfileHeaderCTABaseComponent() {
        new LinkedHashMap();
        this.LJLLILLLL = new LinkedHashMap();
        this.LJLLJ = new LinkedHashMap();
        this.LJLLL = new ArrayList();
        this.LJLLLL = new ArrayList();
        this.LJLLLLLL = new ArrayList();
        this.LJLZ = new ArrayList();
        this.LL = 15;
        this.LLD = new ArrayList();
        this.LLF = C221108m2.LIZIZ(new AqS154S0100000_4(this, 942));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void OI() {
        C234409Hw c234409Hw;
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get("cta_social_interaction_follow");
        if (c234419Hx != null && (c234409Hw = c234419Hx.LJIIIIZZ) != null) {
            c234409Hw.findViewById(R.id.c0e).setBackground(c234409Hw.getContext().getResources().getDrawable(R.drawable.bz3, c234409Hw.getContext().getTheme()));
            ((TuxTextView) c234409Hw.findViewById(R.id.c0j)).setTextColorRes(R.attr.go);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void TG() {
        C234409Hw c234409Hw;
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get("cta_social_interaction_follow");
        if (c234419Hx != null && (c234409Hw = c234419Hx.LJIIIIZZ) != null) {
            c234409Hw.findViewById(R.id.c0e).setBackground(c234409Hw.getContext().getResources().getDrawable(R.drawable.bz3, c234409Hw.getContext().getTheme()));
            ((TuxTextView) c234409Hw.findViewById(R.id.c0j)).setTextColorRes(R.attr.dj);
        }
    }

    public final void Y3() {
        List<C252659vp> list;
        int i;
        ((ArrayList) this.LLD).clear();
        ArrayList arrayList = (ArrayList) this.LJLLLLLL;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS337S0100000_4(this, 2));
        }
        Iterator it = ((ArrayList) this.LJLLLLLL).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (o.LJ(next, "cta_social_entrance")) {
                C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(next);
                if (c234419Hx != null && (list = c234419Hx.LJIIJ) != null) {
                    ((ArrayList) this.LLD).addAll(list);
                }
            } else {
                C234419Hx c234419Hx2 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(next);
                if (c234419Hx2 != null) {
                    List<C252659vp> list2 = this.LLD;
                    Integer num = c234419Hx2.LIZLLL;
                    String str = c234419Hx2.LJ;
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c234419Hx2.LJFF;
                    C252659vp c252659vp = new C252659vp();
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    c252659vp.LIZJ(i);
                    if (str == null) {
                        str = "";
                    }
                    c252659vp.LIZ = str;
                    c252659vp.LJ = new ACListenerS21S0100000_1(new AqS170S0100000_4(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 1040), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                    ((ArrayList) list2).add(c252659vp);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final String Z10() {
        CharSequence charSequence;
        TextView textView;
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get("cta_social_interaction_message");
        if (c234419Hx != null) {
            C234409Hw c234409Hw = c234419Hx.LJIIIIZZ;
            if (c234409Hw != null && (textView = c234409Hw.getTextView()) != null) {
                charSequence = textView.getText();
            } else {
                charSequence = null;
            }
            return String.valueOf(charSequence);
        }
        return "";
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void fe() {
        C234409Hw c234409Hw;
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get("cta_social_interaction_follow");
        if (c234419Hx != null && (c234409Hw = c234419Hx.LJIIIIZZ) != null) {
            c234409Hw.findViewById(R.id.c0e).setBackground(c234409Hw.getContext().getResources().getDrawable(R.drawable.bz4, c234409Hw.getContext().getTheme()));
            ((TuxTextView) c234409Hw.findViewById(R.id.c0j)).setTextColorRes(R.attr.dj);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void M3() {
        Context context = getContext();
        if (context != null) {
            LinearLayout linearLayout = new LinearLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C7MY.LIZIZ(44));
            layoutParams.gravity = 17;
            layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
            layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
            layoutParams.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setGravity(17);
            linearLayout.setOrientation(0);
            this.LJLJLLL = linearLayout;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        Context context = getContext();
        if (context == null) {
            return;
        }
        this.LJZI = context;
        this.LJZL = KL2.LJIIJJI(context) - (C32151Nz.LJIIZILJ(16) * 2);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, IHeaderCTAAbility.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), IHeaderCTAAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void C80(String str) {
        if (((ArrayList) this.LJLLL).contains(str)) {
            return;
        }
        W3(str, false);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final C9HK Cp0(String str) {
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx != null) {
            return c234419Hx.LIZIZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void JA(String str) {
        R3(str);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void O3(String componentName) {
        o.LJIIIZ(componentName, "componentName");
        R3(componentName);
    }

    public final void R3(String str) {
        ProfileComponents profileComponents;
        List<? extends ProfileComponents> list;
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx == null) {
            c234419Hx = new C234419Hx(null);
        }
        EnumC234309Hm enumC234309Hm = (EnumC234309Hm) ((LinkedHashMap) this.LJLLILLLL).get(str);
        c234419Hx.LIZJ = enumC234309Hm;
        int i = -1;
        if (enumC234309Hm != null) {
            int i2 = C234319Hn.LIZ[enumC234309Hm.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    c234419Hx.LIZIZ = C9HK.TEXT;
                }
            } else {
                c234419Hx.LIZIZ = C9HK.ICON;
            }
        }
        C232459Aj N3 = N3();
        if (N3 != null && (profileComponents = N3.LJLILLLLZI) != null && (list = profileComponents.components) != null) {
            Iterator<? extends ProfileComponents> it = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (o.LJ(it.next().componentId, str)) {
                    i = i3;
                    break;
                }
                i3++;
            }
        }
        c234419Hx.LIZ = i;
        this.LJLLJ.put(str, c234419Hx);
        this.LJLJJI.add(str);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final C234409Hw Tj0(String str) {
        C9HK c9hk;
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx == null) {
            c234419Hx = new C234419Hx(null);
        }
        C234409Hw U3 = U3(str);
        C234419Hx c234419Hx2 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx2 != null) {
            c9hk = c234419Hx2.LIZIZ;
        } else {
            c9hk = null;
        }
        U3.LIZIZ(c9hk, null, C234439Hz.LJLIL);
        c234419Hx.LJIIIIZZ = U3;
        return U3;
    }

    public final C234409Hw U3(String str) {
        Context context = this.LJZI;
        if (context != null) {
            C234409Hw c234409Hw = new C234409Hw(context);
            c234409Hw.setTag(str);
            c234409Hw.setVisibility(8);
            return c234409Hw;
        }
        o.LJIJI("nonNullContext");
        throw null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void WF(String str) {
        C9HK c9hk;
        C9HK c9hk2;
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx != null && !c234419Hx.LJII) {
            return;
        }
        C234419Hx c234419Hx2 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx2 != null) {
            C234409Hw c234409Hw = c234419Hx2.LJIIIIZZ;
            if (c234409Hw != null && (c9hk2 = c234409Hw.LJLIL) != null) {
                int i = C9HJ.LIZ[c9hk2.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        View findViewById = c234409Hw.findViewById(R.id.c0g);
                        if (findViewById != null) {
                            findViewById.setVisibility(8);
                        }
                        View findViewById2 = c234409Hw.findViewById(R.id.c0h);
                        if (findViewById2 != null) {
                            findViewById2.setVisibility(8);
                        }
                    }
                } else {
                    c234409Hw.findViewById(R.id.c0k).setVisibility(8);
                }
            }
            c234419Hx2.LJII = false;
        }
        C234419Hx c234419Hx3 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx3 != null) {
            c9hk = c234419Hx3.LIZIZ;
        } else {
            c9hk = null;
        }
        if (c9hk == C9HK.TEXT) {
            if ((this.LJZ && this.LJZL >= C7MY.LIZIZ(79)) || this.LL < 15) {
                if (this.LJZI != null) {
                    this.LJZL = KL2.LJIIJJI(r0) - (C32151Nz.LJIIZILJ(16) * 2);
                    this.LL = 15;
                    X3(false);
                    return;
                }
                o.LJIJI("nonNullContext");
                throw null;
            }
        }
    }

    public final void X3(boolean z) {
        boolean z2;
        C234409Hw c234409Hw;
        if (this.LJZ && z) {
            if (this.LJZI != null) {
                this.LJZL = ((KL2.LJIIJJI(r0) - (C32151Nz.LJIIZILJ(16) * 2)) - C7MY.LIZIZ(44)) - C7MY.LIZIZ(4);
            } else {
                o.LJIJI("nonNullContext");
                throw null;
            }
        }
        ((ArrayList) this.LJLZ).clear();
        ((ArrayList) this.LJLLLL).clear();
        ((ArrayList) this.LJLLLLLL).clear();
        ArrayList arrayList = (ArrayList) this.LJLLL;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS337S0100000_4(this, 1));
        }
        int i = 0;
        for (String str : this.LJLLL) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = str;
                C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str2);
                if (c234419Hx != null && (c234409Hw = c234419Hx.LJIIIIZZ) != null) {
                    c234409Hw.setVisibility(8);
                }
                if (i == C47261Igj.LJJI(this.LJLLL)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                W3(str2, z2);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final C234409Hw ep(String str) {
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx != null) {
            return c234419Hx.LJIIIIZZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void gh0(String str) {
        C234409Hw c234409Hw;
        if (!((ArrayList) this.LJLLL).contains(str)) {
            return;
        }
        ((ArrayList) this.LJLLL).remove(str);
        ((ArrayList) this.LJLZ).remove(str);
        if (((ArrayList) this.LJLLLL).contains(str)) {
            ((ArrayList) this.LJLLLL).remove(str);
        }
        if (((ArrayList) this.LJLLLLLL).contains(str)) {
            ((ArrayList) this.LJLLLLLL).remove(str);
        }
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx != null && (c234409Hw = c234419Hx.LJIIIIZZ) != null) {
            c234409Hw.setVisibility(8);
        }
        if (this.LL == 15 && ((ArrayList) this.LJLLLLLL).isEmpty()) {
            return;
        }
        if (((ArrayList) this.LJLLLLLL).contains(str)) {
            if (((ArrayList) this.LJLLLLLL).size() > 2) {
                ((ArrayList) this.LJLLLLLL).remove(str);
                Y3();
                return;
            } else if (((ArrayList) this.LJLLLLLL).size() == 2) {
                X3(false);
                return;
            } else {
                X3(false);
                return;
            }
        }
        if (!((ArrayList) this.LJLLLL).contains(str)) {
            return;
        }
        if (this.LJZI != null) {
            this.LJZL = KL2.LJIIJJI(r0) - (C32151Nz.LJIIZILJ(16) * 2);
            this.LL = 15;
            X3(false);
            return;
        }
        o.LJIJI("nonNullContext");
        throw null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC234089Gq
    public final void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        L3(profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void Fz(int i, String str) {
        C234409Hw c234409Hw;
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx != null) {
            c234409Hw = c234419Hx.LJIIIIZZ;
        } else {
            c234409Hw = null;
        }
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null) {
            C16880lQ.LLIFFJFJJ(i, viewGroup);
        }
        ViewGroup viewGroup2 = this.LJLJLLL;
        if (viewGroup2 != null) {
            viewGroup2.addView(c234409Hw, 0);
        }
    }

    public final float Q3(int i, String str) {
        if (str == null) {
            return 0.0f;
        }
        ((TextView) this.LLF.getValue()).setTextSize(i);
        return (C32151Nz.LJIIZILJ(20) * 2) + ((TextView) this.LLF.getValue()).getPaint().measureText(str);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void TS(String str, List<C252659vp> actionList) {
        o.LJIIIZ(actionList, "actionList");
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx != null) {
            c234419Hx.LJIIJ = actionList;
        }
        Y3();
    }

    public final void W3(String str, boolean z) {
        C234409Hw c234409Hw;
        boolean z2;
        int i;
        int i2;
        C234409Hw c234409Hw2;
        C9HK c9hk;
        C234419Hx c234419Hx;
        C234409Hw c234409Hw3;
        float f;
        float f2;
        Float f3;
        C9HK c9hk2;
        String str2;
        Map<Integer, Float> map;
        float f4;
        String str3;
        Map<Integer, Float> map2;
        float f5;
        Map<Integer, Float> map3;
        Float f6;
        Map<Integer, Float> map4;
        Map<Integer, Float> map5;
        Float f7;
        Map<Integer, Float> map6;
        int i3;
        int i4;
        C234419Hx c234419Hx2 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx2 == null || (c234409Hw = c234419Hx2.LJIIIIZZ) == null) {
            return;
        }
        Iterator it = ((ArrayList) this.LJLLLLLL).iterator();
        while (it.hasNext()) {
            C234419Hx c234419Hx3 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(it.next());
            if (c234419Hx3 != null) {
                i3 = c234419Hx3.LIZ;
            } else {
                i3 = -1;
            }
            C234419Hx c234419Hx4 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
            if (c234419Hx4 != null) {
                i4 = c234419Hx4.LIZ;
            } else {
                i4 = -1;
            }
            if (i3 < i4) {
                ((ArrayList) this.LJLLLLLL).add(str);
                Y3();
                return;
            }
        }
        int i5 = this.LL;
        while (i5 >= 12) {
            i5--;
            C9HK c9hk3 = c234419Hx2.LIZIZ;
            if (c9hk3 == null) {
                break;
            }
            int i6 = C234319Hn.LIZIZ[c9hk3.ordinal()];
            if (i6 != 1 && i6 != 2) {
                if (i6 != 3) {
                    break;
                } else {
                    f2 = C7MY.LIZIZ(44) + 0.0f;
                }
            } else {
                Map<Integer, Float> map7 = c234419Hx2.LJIIIZ;
                if (map7 == null || map7.get(Integer.valueOf(i5 + 1)) == null) {
                    int i7 = i5 + 1;
                    float Q3 = Q3(i7, c234419Hx2.LJ) + (O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)) * 2);
                    if (c234419Hx2.LJII) {
                        Q3 += C7MY.LIZIZ(17);
                    }
                    Map<Integer, Float> map8 = c234419Hx2.LJIIIZ;
                    if (map8 != null) {
                        map8.put(Integer.valueOf(i7), Float.valueOf(Q3));
                    }
                }
                Map<Integer, Float> map9 = c234419Hx2.LJIIIZ;
                if (map9 != null && (f3 = map9.get(Integer.valueOf(i5 + 1))) != null) {
                    f = f3.floatValue();
                } else {
                    f = 0.0f;
                }
                f2 = f + 0.0f;
            }
            float LIZIZ = f2 + C7MY.LIZIZ(4);
            float f8 = this.LJZL;
            if (f8 > LIZIZ) {
                this.LJZL = f8 - LIZIZ;
            } else {
                Iterator it2 = ((ArrayList) this.LJLLLL).iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    C234419Hx c234419Hx5 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(next);
                    if (c234419Hx5 != null) {
                        c9hk2 = c234419Hx5.LIZIZ;
                    } else {
                        c9hk2 = null;
                    }
                    if (c9hk2 == C9HK.TEXT) {
                        C234419Hx c234419Hx6 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(next);
                        if (c234419Hx6 == null || (map6 = c234419Hx6.LJIIIZ) == null || map6.get(Integer.valueOf(i5 + 1)) == null) {
                            C234419Hx c234419Hx7 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(next);
                            if (c234419Hx7 != null) {
                                str2 = c234419Hx7.LJ;
                            } else {
                                str2 = null;
                            }
                            int i8 = i5 + 1;
                            float Q32 = Q3(i8, str2);
                            C234419Hx c234419Hx8 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(next);
                            if (c234419Hx8 != null && (map = c234419Hx8.LJIIIZ) != null) {
                                map.put(Integer.valueOf(i8), Float.valueOf(Q32));
                            }
                        }
                        C234419Hx c234419Hx9 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(next);
                        if (c234419Hx9 != null && (map5 = c234419Hx9.LJIIIZ) != null && (f7 = map5.get(Integer.valueOf(i5 + 1))) != null) {
                            f4 = f7.floatValue();
                        } else {
                            f4 = 0.0f;
                        }
                        C234419Hx c234419Hx10 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(next);
                        if (c234419Hx10 == null || (map4 = c234419Hx10.LJIIIZ) == null || map4.get(Integer.valueOf(i5)) == null) {
                            C234419Hx c234419Hx11 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(next);
                            if (c234419Hx11 != null) {
                                str3 = c234419Hx11.LJ;
                            } else {
                                str3 = null;
                            }
                            float Q33 = Q3(i5, str3);
                            C234419Hx c234419Hx12 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(next);
                            if (c234419Hx12 != null && (map2 = c234419Hx12.LJIIIZ) != null) {
                                map2.put(Integer.valueOf(i5), Float.valueOf(Q33));
                            }
                        }
                        C234419Hx c234419Hx13 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(next);
                        if (c234419Hx13 != null && (map3 = c234419Hx13.LJIIIZ) != null && (f6 = map3.get(Integer.valueOf(i5))) != null) {
                            f5 = f6.floatValue();
                        } else {
                            f5 = 0.0f;
                        }
                        this.LJZL = (f4 - f5) + this.LJZL;
                    }
                }
                if (i5 < 12) {
                    if (c234419Hx2.LIZIZ == C9HK.ICON) {
                        break;
                    }
                    if (c234419Hx2.LIZIZ == C9HK.TEXT && this.LJZL >= C7MY.LIZIZ(48)) {
                        this.LJZL -= C7MY.LIZIZ(48);
                        C9HK c9hk4 = C9HK.ICON;
                        c234419Hx2.LIZIZ = c9hk4;
                        C234409Hw c234409Hw4 = c234419Hx2.LJIIIIZZ;
                        if (c234409Hw4 != null) {
                            c234409Hw4.LIZ(c9hk4);
                        }
                    }
                }
            }
            z2 = true;
            break;
        }
        z2 = false;
        if (z2) {
            c234409Hw.setVisibility(0);
            if (!((ArrayList) this.LJLLL).contains(str)) {
                ((ArrayList) this.LJLLL).add(str);
            }
            if (!((ArrayList) this.LJLLLL).contains(str)) {
                ((ArrayList) this.LJLLLL).add(str);
            }
            ((ArrayList) this.LJLZ).add(str);
            int i9 = i5 + 1;
            if (this.LL != i9) {
                Iterator it3 = ((ArrayList) this.LJLLLL).iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    C234419Hx c234419Hx14 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(next2);
                    if (c234419Hx14 != null) {
                        c9hk = c234419Hx14.LIZIZ;
                    } else {
                        c9hk = null;
                    }
                    if (c9hk == C9HK.TEXT && (c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(next2)) != null && (c234409Hw3 = c234419Hx.LJIIIIZZ) != null) {
                        ((TuxTextView) c234409Hw3.findViewById(R.id.c0j)).LJJJ(i9);
                    }
                }
                this.LL = i9;
            }
            if (((ArrayList) this.LJLLLLLL).isEmpty() && z) {
                this.LJZ = false;
                C234419Hx c234419Hx15 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get("cta_more");
                if (c234419Hx15 == null || (c234409Hw2 = c234419Hx15.LJIIIIZZ) == null) {
                    return;
                }
                c234409Hw2.setVisibility(8);
                return;
            }
            return;
        }
        Iterator it4 = ((ArrayList) this.LJLZ).iterator();
        boolean z3 = false;
        while (it4.hasNext()) {
            C234419Hx c234419Hx16 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(it4.next());
            if (c234419Hx16 != null) {
                i = c234419Hx16.LIZ;
            } else {
                i = -1;
            }
            C234419Hx c234419Hx17 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
            if (c234419Hx17 != null) {
                i2 = c234419Hx17.LIZ;
            } else {
                i2 = -1;
            }
            if (i > i2) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.LJZI != null) {
                this.LJZL = KL2.LJIIJJI(r0) - (C32151Nz.LJIIZILJ(16) * 2);
                this.LL = 15;
                if (!((ArrayList) this.LJLLL).contains(str)) {
                    ((ArrayList) this.LJLLL).add(str);
                }
                X3(true);
                return;
            }
            o.LJIJI("nonNullContext");
            throw null;
        }
        if (this.LJZ) {
            if (!((ArrayList) this.LJLLL).contains(str)) {
                ((ArrayList) this.LJLLL).add(str);
            }
            if (!((ArrayList) this.LJLLLLLL).contains(str)) {
                ((ArrayList) this.LJLLLLLL).add(str);
            }
            Y3();
            return;
        }
        this.LJZ = true;
        if (this.LJZI != null) {
            this.LJZL = ((KL2.LJIIJJI(r0) - (C32151Nz.LJIIZILJ(16) * 2)) - C7MY.LIZIZ(44)) - C7MY.LIZIZ(4);
            this.LL = 15;
            if (!((ArrayList) this.LJLLL).contains(str)) {
                ((ArrayList) this.LJLLL).add(str);
            }
            if (((LinkedHashMap) this.LJLLJ).get("cta_more") == null) {
                C234419Hx c234419Hx18 = new C234419Hx(null);
                C234409Hw U3 = U3("cta_more");
                U3.LIZIZ(C9HK.ICON, Integer.valueOf(R.raw.icon_ellipsis_horizontal), new AqS154S0100000_4(this, 1140));
                U3.setVisibility(0);
                ViewGroup viewGroup = this.LJLJLLL;
                if (viewGroup != null) {
                    viewGroup.addView(U3, viewGroup.getChildCount());
                }
                c234419Hx18.LJIIIIZZ = U3;
                this.LJLLJ.put("cta_more", c234419Hx18);
            }
            X3(true);
            return;
        }
        o.LJIJI("nonNullContext");
        throw null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void o40(String str, InterfaceC88472Yns<? super TuxIconView, C76800UCe> updateIconStateFunc) {
        C234409Hw c234409Hw;
        View findViewById;
        o.LJIIIZ(updateIconStateFunc, "updateIconStateFunc");
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx != null && (c234409Hw = c234419Hx.LJIIIIZZ) != null && (findViewById = c234409Hw.findViewById(R.id.c0f)) != null) {
            updateIconStateFunc.invoke(findViewById);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void oe(final CharSequence roleDescription, String str) {
        C234409Hw c234409Hw;
        final String str2;
        o.LJIIIZ(roleDescription, "roleDescription");
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx == null || (c234409Hw = c234419Hx.LJIIIIZZ) == null) {
            return;
        }
        C234419Hx c234419Hx2 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx2 != null) {
            str2 = c234419Hx2.LJ;
        } else {
            str2 = null;
        }
        h0.LJIJI(c234409Hw, new C16120kC() { // from class: X.9xr
            @Override // X.C16120kC
            public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
                o.LJIIIZ(host, "host");
                o.LJIIIZ(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.LJJIFFI(roleDescription);
                info.LJIJ(str2);
            }
        });
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void oh(int i, String str) {
        C234409Hw c234409Hw;
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx != null && (c234409Hw = c234419Hx.LJIIIIZZ) != null) {
            c234409Hw.setComponentWidth(i);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void pn0(String str, C9HK style) {
        C234409Hw c234409Hw;
        o.LJIIIZ(style, "style");
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx != null && (c234409Hw = c234419Hx.LJIIIIZZ) != null) {
            c234409Hw.LIZ(style);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void tW(int i, String str) {
        C234409Hw c234409Hw;
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx == null || c234419Hx.LJIIIIZZ == null) {
            R3(str);
        }
        C234419Hx c234419Hx2 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx2 != null && (c234409Hw = c234419Hx2.LJIIIIZZ) != null) {
            HeaderBaseContainerComponent.I3(this, str, i, c234409Hw, null, null, 24);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void updateClickFunc(String str, InterfaceC65784Pro<C76800UCe> clickFunc) {
        o.LJIIIZ(clickFunc, "clickFunc");
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx != null) {
            C234409Hw c234409Hw = c234419Hx.LJIIIIZZ;
            if (c234409Hw != null) {
                c234409Hw.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS24S0100000_4(clickFunc, 259)));
            }
            c234419Hx.LJFF = clickFunc;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void updateIcon(String str, Integer num) {
        C234409Hw c234409Hw;
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx == null || (c234409Hw = c234419Hx.LJIIIIZZ) == null || num == null) {
            return;
        }
        num.intValue();
        ((TuxIconView) c234409Hw.findViewById(R.id.c0f)).setIconRes(num.intValue());
        int intValue = num.intValue();
        C234419Hx c234419Hx2 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx2 == null) {
            return;
        }
        c234419Hx2.LIZLLL = Integer.valueOf(intValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        if (((r6 - r5) + r8.LJZL) < X.C7MY.LIZIZ(96)) goto L37;
     */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateText(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.Map<java.lang.String, X.9Hx> r0 = r8.LJLLJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r9)
            X.9Hx r0 = (X.C234419Hx) r0
            r7 = 0
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.LJ
        Lf:
            boolean r0 = android.text.TextUtils.equals(r10, r0)
            if (r0 == 0) goto L18
            return
        L16:
            r0 = r7
            goto Lf
        L18:
            java.util.Map<java.lang.String, X.9Hx> r0 = r8.LJLLJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r9)
            X.9Hx r0 = (X.C234419Hx) r0
            if (r0 == 0) goto Lc2
            java.lang.String r1 = r0.LJ
        L26:
            int r0 = r8.LL
            float r6 = r8.Q3(r0, r1)
            int r0 = r8.LL
            float r5 = r8.Q3(r0, r10)
            java.util.Map<java.lang.String, X.9Hx> r0 = r8.LJLLJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r2 = r0.get(r9)
            X.9Hx r2 = (X.C234419Hx) r2
            if (r2 == 0) goto L5b
            X.9Hw r1 = r2.LJIIIIZZ
            if (r1 == 0) goto L50
            if (r10 == 0) goto L50
            r0 = 2131365159(0x7f0a0d27, float:1.8350175E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r10)
        L50:
            java.util.Map<java.lang.Integer, java.lang.Float> r0 = r2.LJIIIZ
            if (r0 == 0) goto L57
            r0.clear()
        L57:
            if (r10 == 0) goto L5b
            r2.LJ = r10
        L5b:
            java.lang.String r2 = "nonNullContext"
            r4 = 2
            r1 = 16
            r3 = 15
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 >= 0) goto L8a
            float r5 = r5 - r6
            float r0 = r8.LJZL
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L89
            android.content.Context r0 = r8.LJZI
            if (r0 == 0) goto Lc5
            int r0 = X.KL2.LJIIJJI(r0)
            float r2 = (float) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r1 = X.C32151Nz.LJIIZILJ(r0)
            float r0 = (float) r4
            float r1 = r1 * r0
            float r2 = r2 - r1
            r8.LJZL = r2
            r8.LL = r3
            r0 = 1
            r8.X3(r0)
        L89:
            return
        L8a:
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 <= 0) goto L89
            boolean r0 = r8.LJZ
            if (r0 == 0) goto La1
            float r0 = r8.LJZL
            float r6 = r6 - r5
            float r6 = r6 + r0
            r0 = 96
            int r0 = X.C7MY.LIZIZ(r0)
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto La5
        La1:
            int r0 = r8.LL
            if (r0 >= r3) goto L89
        La5:
            android.content.Context r0 = r8.LJZI
            if (r0 == 0) goto Lc9
            int r0 = X.KL2.LJIIJJI(r0)
            float r2 = (float) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r1 = X.C32151Nz.LJIIZILJ(r0)
            float r0 = (float) r4
            float r1 = r1 * r0
            float r2 = r2 - r1
            r8.LJZL = r2
            r8.LL = r3
            r0 = 0
            r8.X3(r0)
            goto L89
        Lc2:
            r1 = r7
            goto L26
        Lc5:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r7
        Lc9:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.cta.assemble.ProfileHeaderCTABaseComponent.updateText(java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void vi(final CharSequence className, String str) {
        C234409Hw c234409Hw;
        final String str2;
        o.LJIIIZ(className, "className");
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx == null || (c234409Hw = c234419Hx.LJIIIIZZ) == null) {
            return;
        }
        C234419Hx c234419Hx2 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx2 != null) {
            str2 = c234419Hx2.LJ;
        } else {
            str2 = null;
        }
        h0.LJIJI(c234409Hw, new C16120kC() { // from class: X.9xq
            @Override // X.C16120kC
            public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
                o.LJIIIZ(host, "host");
                o.LJIIIZ(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.LJIILJJIL(className);
                info.LJIJ(str2);
            }
        });
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void vj(CharSequence value, String str) {
        C234409Hw c234409Hw;
        o.LJIIIZ(value, "value");
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx == null || (c234409Hw = c234419Hx.LJIIIIZZ) == null) {
            return;
        }
        c234409Hw.setContentDescription(value);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void xd(String str, InterfaceC65784Pro<C76800UCe> clickFunc) {
        C234409Hw c234409Hw;
        o.LJIIIZ(clickFunc, "clickFunc");
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx != null && (c234409Hw = c234419Hx.LJIIIIZZ) != null) {
            c234409Hw.setIconDebounceOnClickListener(new AqS154S0100000_4(clickFunc, (InterfaceC65784Pro<C76800UCe>) 943));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void Sr(int i, int i2, String str) {
        boolean z;
        C9HK c9hk;
        C9HK c9hk2;
        C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx != null) {
            z = c234419Hx.LJII;
        } else {
            z = false;
        }
        C234419Hx c234419Hx2 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
        if (c234419Hx2 != null) {
            C234409Hw c234409Hw = c234419Hx2.LJIIIIZZ;
            if (c234409Hw != null && (c9hk2 = c234409Hw.LJLIL) != null) {
                int i3 = C9HJ.LIZ[c9hk2.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (i != 0) {
                            if (i != 1) {
                                View findViewById = c234409Hw.findViewById(R.id.c0g);
                                if (findViewById != null) {
                                    findViewById.setVisibility(8);
                                }
                                View findViewById2 = c234409Hw.findViewById(R.id.c0h);
                                if (findViewById2 != null) {
                                    findViewById2.setVisibility(8);
                                }
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("Error displaying CTA ICON alert badge! alertType ");
                                LIZ.append(i);
                                C221018lt.LIZIZ("CTASingleComponentView", X1D.LIZIZ(LIZ));
                            } else {
                                AVS avs = (AVS) c234409Hw.findViewById(R.id.c0g);
                                if (avs != null) {
                                    avs.setVariant(1);
                                    avs.setCount(i2);
                                    avs.setVisibility(0);
                                }
                                View findViewById3 = c234409Hw.findViewById(R.id.c0h);
                                if (findViewById3 != null) {
                                    findViewById3.setVisibility(8);
                                }
                            }
                        } else {
                            AVS avs2 = (AVS) c234409Hw.findViewById(R.id.c0h);
                            if (avs2 != null) {
                                avs2.setVariant(0);
                                avs2.setVisibility(0);
                            }
                            View findViewById4 = c234409Hw.findViewById(R.id.c0g);
                            if (findViewById4 != null) {
                                findViewById4.setVisibility(8);
                            }
                        }
                    }
                } else {
                    AVS avs3 = (AVS) c234409Hw.findViewById(R.id.c0k);
                    avs3.setVariant(i);
                    avs3.setCount(i2);
                    avs3.setVisibility(0);
                }
            }
            c234419Hx2.LJII = true;
        }
        if (!z && this.LJZL < C7MY.LIZIZ(17)) {
            C234419Hx c234419Hx3 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
            if (c234419Hx3 != null) {
                c9hk = c234419Hx3.LIZIZ;
            } else {
                c9hk = null;
            }
            if (c9hk == C9HK.TEXT) {
                if (this.LJZI != null) {
                    this.LJZL = KL2.LJIIJJI(r0) - (C32151Nz.LJIIZILJ(16) * 2);
                    this.LL = 15;
                    X3(true);
                    return;
                }
                o.LJIJI("nonNullContext");
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility
    public final void Ld0(final int i, String str, Integer num, String str2) {
        SpannableStringBuilder spannableStringBuilder;
        C234409Hw c234409Hw;
        if (str2 != null && num != null) {
            num.intValue();
            C234419Hx c234419Hx = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
            if (c234419Hx != null && (c234409Hw = c234419Hx.LJIIIIZZ) != null) {
                int intValue = num.intValue();
                spannableStringBuilder = new SpannableStringBuilder(QZZ.LIZIZ(' ', str2));
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = intValue;
                c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
                c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
                Context context = c234409Hw.getContext();
                o.LJIIIIZZ(context, "context");
                final SY9 LIZ = c2068389v.LIZ(context);
                LIZ.setBounds(0, 0, LIZ.LJI, LIZ.LJII);
                spannableStringBuilder.setSpan(new DynamicDrawableSpan(LIZ, i) { // from class: X.8Fi
                    public final Drawable LJLIL;
                    public final int LJLILLLLZI;

                    @Override // android.text.style.DynamicDrawableSpan
                    public final Drawable getDrawable() {
                        return this.LJLIL;
                    }

                    {
                        this.LJLIL = LIZ;
                        this.LJLILLLLZI = i;
                    }

                    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                    public final int getSize(Paint paint, CharSequence text, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                        o.LJIIIZ(paint, "paint");
                        o.LJIIIZ(text, "text");
                        Drawable drawable = this.LJLIL;
                        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.LJLIL.getIntrinsicHeight());
                        return this.LJLIL.getIntrinsicWidth() + this.LJLILLLLZI;
                    }

                    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                    public final void draw(Canvas canvas, CharSequence text, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                        o.LJIIIZ(canvas, "canvas");
                        o.LJIIIZ(text, "text");
                        o.LJIIIZ(paint, "paint");
                        Drawable drawable = this.LJLIL;
                        canvas.save();
                        canvas.translate(f, ((i4 + i6) / 2.0f) - (drawable.getBounds().height() / 2.0f));
                        drawable.draw(canvas);
                        canvas.restore();
                    }
                }, 0, 1, 33);
                ((TextView) c234409Hw.findViewById(R.id.c0j)).setText(spannableStringBuilder);
            } else {
                spannableStringBuilder = null;
            }
            C234419Hx c234419Hx2 = (C234419Hx) ((LinkedHashMap) this.LJLLJ).get(str);
            if (c234419Hx2 == null) {
                return;
            }
            c234419Hx2.LJ = String.valueOf(spannableStringBuilder);
        }
    }
}
