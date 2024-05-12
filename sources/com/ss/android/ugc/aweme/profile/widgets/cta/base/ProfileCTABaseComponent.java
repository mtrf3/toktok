package com.ss.android.ugc.aweme.profile.widgets.cta.base;

import X.AVS;
import X.C16120kC;
import X.C16880lQ;
import X.C212428Vi;
import X.C221018lt;
import X.C221108m2;
import X.C234339Hp;
import X.C237259Sv;
import X.C252659vp;
import X.C2L4;
import X.C32151Nz;
import X.C40675Fxn;
import X.C47135Ieh;
import X.C47261Igj;
import X.C47704Ins;
import X.C47959Irz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65776Prg;
import X.C76800UCe;
import X.C76965UIn;
import X.C7MY;
import X.C9HL;
import X.C9I0;
import X.C9I1;
import X.C9I2;
import X.C9I3;
import X.C9I4;
import X.C9ID;
import X.C9IF;
import X.EnumC234329Ho;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.KL2;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS24S0100000_4;
import Y.IDComparatorS32S0000000_4;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes5.dex */
public class ProfileCTABaseComponent extends UIContentAssem implements ProfileCTAAbility, C2L4 {
    public final List<C9I1> LJLIL;
    public final C55749LuL LJLILLLLZI;
    public View LJLJI;
    public final Map<C9IF, C9I0> LJLJJI;
    public final List<C9IF> LJLJJL;
    public final List<C9IF> LJLJJLL;
    public final List<C9IF> LJLJL;
    public final List<C9IF> LJLJLJ;
    public boolean LJLJLLL;
    public LinearLayout LJLL;
    public Context LJLLI;
    public float LJLLILLLL;
    public int LJLLJ;
    public final List<C252659vp> LJLLL;
    public int LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    public ProfileCTABaseComponent() {
        new LinkedHashMap();
        this.LJLIL = new ArrayList();
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, C9ID.class, null), checkSupervisorPrepared());
        this.LJLJJI = new LinkedHashMap();
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = new ArrayList();
        this.LJLJL = new ArrayList();
        this.LJLJLJ = new ArrayList();
        this.LJLLJ = 15;
        this.LJLLL = new ArrayList();
        this.LJLLLL = C7MY.LIZIZ(24);
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 724));
    }

    public final void C3() {
        boolean z;
        C9I2 c9i2;
        ((ArrayList) this.LJLJLJ).clear();
        ((ArrayList) this.LJLJJLL).clear();
        ((ArrayList) this.LJLJL).clear();
        ArrayList arrayList = (ArrayList) this.LJLJJL;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS32S0000000_4(2));
        }
        ListIterator<C9IF> listIterator = ((ArrayList) this.LJLJJL).listIterator();
        while (listIterator.hasNext()) {
            C9IF next = listIterator.next();
            int nextIndex = listIterator.nextIndex();
            C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(next);
            if (c9i0 != null && (c9i2 = c9i0.LJII) != null) {
                c9i2.setVisibility(8);
            }
            if (nextIndex == C47261Igj.LJJI(this.LJLJJL)) {
                z = true;
            } else {
                z = false;
            }
            A3(next, z, listIterator);
        }
    }

    public final void F3() {
        List<C252659vp> list;
        int i;
        ((ArrayList) this.LJLLL).clear();
        ArrayList arrayList = (ArrayList) this.LJLJL;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS32S0000000_4(3));
        }
        Iterator it = ((ArrayList) this.LJLJL).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next == C9IF.SOCIAL_BUTTON) {
                C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(next);
                if (c9i0 != null && (list = c9i0.LJIIIZ) != null) {
                    ((ArrayList) this.LJLLL).addAll(list);
                }
            } else {
                C9I0 c9i02 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(next);
                if (c9i02 != null) {
                    List<C252659vp> list2 = this.LJLLL;
                    Integer num = c9i02.LIZJ;
                    String str = c9i02.LIZLLL;
                    InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns = c9i02.LJ;
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
                    c252659vp.LJ = new ACListenerS21S0100000_1(new AqS167S0100000_1(interfaceC88472Yns, (InterfaceC88472Yns<? super FrameLayout, C76800UCe>) 421), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                    ((ArrayList) list2).add(c252659vp);
                }
            }
        }
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(ProfileCTAScope.class);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void tX() {
        int i;
        int LIZIZ;
        int i2 = 0;
        for (C9I0 c9i0 : ((LinkedHashMap) this.LJLJJI).values()) {
            C9HL c9hl = c9i0.LIZ;
            if (c9hl != null) {
                int i3 = C234339Hp.LIZIZ[c9hl.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            Integer TE = TE(c9i0.LIZLLL);
                            if (TE != null) {
                                i = TE.intValue();
                            } else {
                                i = 0;
                            }
                            LIZIZ = C7MY.LIZIZ(24);
                        }
                    } else {
                        i2 = C47959Irz.LIZJ(48, i2);
                    }
                } else {
                    Integer TE2 = TE(c9i0.LIZLLL);
                    if (TE2 != null) {
                        i = TE2.intValue();
                    } else {
                        i = 0;
                    }
                    LIZIZ = C7MY.LIZIZ(4);
                }
                i2 += LIZIZ + i;
            }
        }
        if (this.LJLLI != null) {
            if (i2 > KL2.LJIIJJI(r0) - (C32151Nz.LJIIZILJ(16) * 2) && this.LJLLLL >= C7MY.LIZIZ(6)) {
                this.LJLLLL = C47135Ieh.LIZ(6, this.LJLLLL);
                tX();
                return;
            }
            return;
        }
        o.LJIJI("nonNullContext");
        throw null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), ProfileCTAAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final C9HL Hb0(C9IF tag) {
        o.LJIIIZ(tag, "tag");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 != null) {
            return c9i0.LIZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void Is(C9IF tag) {
        C9I2 c9i2;
        o.LJIIIZ(tag, "tag");
        if (!((ArrayList) this.LJLJJL).contains(tag)) {
            return;
        }
        ((ArrayList) this.LJLJJL).remove(tag);
        ((ArrayList) this.LJLJLJ).remove(tag);
        if (((ArrayList) this.LJLJJLL).contains(tag)) {
            ((ArrayList) this.LJLJJLL).remove(tag);
        }
        if (((ArrayList) this.LJLJL).contains(tag)) {
            ((ArrayList) this.LJLJL).remove(tag);
        }
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 != null && (c9i2 = c9i0.LJII) != null) {
            c9i2.setVisibility(8);
        }
        if (this.LJLLJ == 15 && ((ArrayList) this.LJLJL).isEmpty()) {
            return;
        }
        if (((ArrayList) this.LJLJL).contains(tag)) {
            if (((ArrayList) this.LJLJL).size() > 2) {
                ((ArrayList) this.LJLJL).remove(tag);
                F3();
                return;
            } else if (((ArrayList) this.LJLJL).size() == 2) {
                C3();
                return;
            } else {
                C3();
                return;
            }
        }
        if (!((ArrayList) this.LJLJJLL).contains(tag)) {
            return;
        }
        if (this.LJLLI != null) {
            this.LJLLILLLL = KL2.LJIIJJI(r0) - (C32151Nz.LJIIZILJ(16) * 2);
            this.LJLLJ = 15;
            C3();
            return;
        }
        o.LJIJI("nonNullContext");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void PQ(C9IF tag) {
        C9HL c9hl;
        C9HL c9hl2;
        o.LJIIIZ(tag, "tag");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 != null && !c9i0.LJI) {
            return;
        }
        C9I0 c9i02 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i02 != null) {
            C9I2 c9i2 = c9i02.LJII;
            if (c9i2 != null && (c9hl2 = c9i2.LJLIL) != null) {
                int i = C9I3.LIZ[c9hl2.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        c9i2.LIZ(R.id.d5s).setVisibility(8);
                        c9i2.LIZ(R.id.d5t).setVisibility(8);
                    }
                } else {
                    c9i2.LIZ(R.id.d5z).setVisibility(8);
                }
            }
            c9i02.LJI = false;
        }
        C9I0 c9i03 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i03 != null) {
            c9hl = c9i03.LIZ;
        } else {
            c9hl = null;
        }
        if (c9hl == C9HL.TEXT) {
            if ((this.LJLJLLL && this.LJLLILLLL >= C7MY.LIZIZ(79)) || this.LJLLJ < 15) {
                if (this.LJLLI != null) {
                    this.LJLLILLLL = KL2.LJIIJJI(r0) - (C32151Nz.LJIIZILJ(16) * 2);
                    this.LJLLJ = 15;
                    C3();
                    return;
                }
                o.LJIJI("nonNullContext");
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final Integer TE(String str) {
        return Integer.valueOf(((int) v3(this.LJLLJ, str)) + this.LJLLLL);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final C9I2 me0(C9IF tag) {
        o.LJIIIZ(tag, "tag");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 != null) {
            return c9i0.LJII;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        boolean z;
        LinearLayout linearLayout;
        o.LJIIIZ(view, "view");
        C9ID c9id = (C9ID) this.LJLILLLLZI.getValue();
        if (c9id != null) {
            z = c9id.LJLJI;
        } else {
            z = false;
        }
        if (z) {
            if (!(view instanceof LinearLayout) || (linearLayout = (LinearLayout) view) == null) {
                return;
            }
        } else {
            View findViewById = view.findViewById(R.id.c0d);
            if (!(findViewById instanceof LinearLayout) || (linearLayout = (LinearLayout) findViewById) == null) {
                return;
            }
        }
        this.LJLL = linearLayout;
        this.LJLJI = view;
        Context context = getContext();
        if (context == null) {
            return;
        }
        this.LJLLI = context;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, ProfileCTAAbility.class, null);
        }
        if (this.LJLLI != null) {
            this.LJLLILLLL = KL2.LJIIJJI(r0) - (C32151Nz.LJIIZILJ(16) * 2);
        } else {
            o.LJIJI("nonNullContext");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void sl0(C9IF tag) {
        C9I2 c9i2;
        o.LJIIIZ(tag, "tag");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 != null) {
            c9i2 = c9i0.LJII;
        } else {
            c9i2 = null;
        }
        LinearLayout linearLayout = this.LJLL;
        if (linearLayout != null) {
            if (linearLayout.indexOfChild(c9i2) == 0) {
                return;
            }
            LinearLayout linearLayout2 = this.LJLL;
            if (linearLayout2 != null) {
                C16880lQ.LJZI(linearLayout2, c9i2);
                LinearLayout linearLayout3 = this.LJLL;
                if (linearLayout3 != null) {
                    linearLayout3.addView(c9i2, 0);
                    return;
                } else {
                    o.LJIJI("ctaContainerView");
                    throw null;
                }
            }
            o.LJIJI("ctaContainerView");
            throw null;
        }
        o.LJIJI("ctaContainerView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final TuxTextView tY(C9IF tag) {
        C9I2 c9i2;
        o.LJIIIZ(tag, "tag");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 != null && (c9i2 = c9i0.LJII) != null) {
            return c9i2.getTextView();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final TuxIconView uW(C9IF tag) {
        C9I2 c9i2;
        o.LJIIIZ(tag, "tag");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 != null && (c9i2 = c9i0.LJII) != null) {
            return c9i2.getIconView();
        }
        return null;
    }

    public final C9I2 x3(C9IF c9if) {
        long currentTimeMillis = System.currentTimeMillis();
        Context context = this.LJLLI;
        if (context != null) {
            C9I2 c9i2 = new C9I2(context);
            c9i2.setTag(c9if);
            c9i2.setVisibility(8);
            C237259Sv.LJIIL(System.currentTimeMillis() - currentTimeMillis, c9if.toString());
            return c9i2;
        }
        o.LJIJI("nonNullContext");
        throw null;
    }

    public final void E3(ListIterator<C9IF> listIterator, C9IF c9if) {
        if (listIterator != null) {
            listIterator.add(c9if);
        } else {
            ((ArrayList) this.LJLJJL).add(c9if);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        if (((r6 - r5) + r8.LJLLILLLL) < X.C7MY.LIZIZ(96)) goto L36;
     */
    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EY(X.C9IF r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "tag"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.util.Map<X.9IF, X.9I0> r0 = r8.LJLJJI
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r9)
            X.9I0 r0 = (X.C9I0) r0
            r7 = 0
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.LIZLLL
        L14:
            boolean r0 = android.text.TextUtils.equals(r10, r0)
            if (r0 == 0) goto L1d
            return
        L1b:
            r0 = r7
            goto L14
        L1d:
            java.util.Map<X.9IF, X.9I0> r0 = r8.LJLJJI
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r2 = r0.get(r9)
            X.9I0 r2 = (X.C9I0) r2
            if (r2 == 0) goto L44
            X.9I2 r1 = r2.LJII
            if (r1 == 0) goto L3b
            if (r10 == 0) goto L3b
            r0 = 2131366728(0x7f0a1348, float:1.8353358E38)
            android.view.View r0 = r1.LIZ(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r10)
        L3b:
            java.util.Map<java.lang.Integer, java.lang.Float> r0 = r2.LJIIIIZZ
            if (r0 == 0) goto L42
            r0.clear()
        L42:
            r2.LIZLLL = r10
        L44:
            java.util.Map<X.9IF, X.9I0> r0 = r8.LJLJJI
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r9)
            X.9I0 r0 = (X.C9I0) r0
            if (r0 == 0) goto Lc3
            java.lang.String r1 = r0.LIZLLL
        L52:
            int r0 = r8.LJLLJ
            float r6 = r8.v3(r0, r1)
            int r0 = r8.LJLLJ
            float r5 = r8.v3(r0, r10)
            java.lang.String r2 = "nonNullContext"
            r4 = 2
            r1 = 16
            r3 = 15
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 >= 0) goto L8c
            float r5 = r5 - r6
            float r0 = r8.LJLLILLLL
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8b
            android.content.Context r0 = r8.LJLLI
            if (r0 == 0) goto Lc5
            int r0 = X.KL2.LJIIJJI(r0)
            float r2 = (float) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r1 = X.C32151Nz.LJIIZILJ(r0)
            float r0 = (float) r4
            float r1 = r1 * r0
            float r2 = r2 - r1
            r8.LJLLILLLL = r2
            r8.LJLLJ = r3
            r8.C3()
        L8b:
            return
        L8c:
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 <= 0) goto L8b
            boolean r0 = r8.LJLJLLL
            if (r0 == 0) goto La3
            float r0 = r8.LJLLILLLL
            float r6 = r6 - r5
            float r6 = r6 + r0
            r0 = 96
            int r0 = X.C7MY.LIZIZ(r0)
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto La7
        La3:
            int r0 = r8.LJLLJ
            if (r0 >= r3) goto L8b
        La7:
            android.content.Context r0 = r8.LJLLI
            if (r0 == 0) goto Lc9
            int r0 = X.KL2.LJIIJJI(r0)
            float r2 = (float) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r1 = X.C32151Nz.LJIIZILJ(r0)
            float r0 = (float) r4
            float r1 = r1 * r0
            float r2 = r2 - r1
            r8.LJLLILLLL = r2
            r8.LJLLJ = r3
            r8.C3()
            goto L8b
        Lc3:
            r1 = r7
            goto L52
        Lc5:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r7
        Lc9:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTABaseComponent.EY(X.9IF, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void Fi0(C9IF tag, List<C252659vp> actionList) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(actionList, "actionList");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 != null) {
            c9i0.LJIIIZ = actionList;
        }
        F3();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void J00(C9IF tag, C9HL style) {
        C9I2 c9i2;
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(style, "style");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 != null && (c9i2 = c9i0.LJII) != null) {
            c9i2.LIZIZ(style);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void JU(C9IF tag, C9I4 variant) {
        C9I2 c9i2;
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(variant, "variant");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 != null && (c9i2 = c9i0.LJII) != null) {
            c9i2.setCtaBackground(variant);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void LT(C9IF tag, int i) {
        C9I2 c9i2;
        o.LJIIIZ(tag, "tag");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 != null && (c9i2 = c9i0.LJII) != null) {
            c9i2.setComponentWidth(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void MQ(C9IF tag, final CharSequence className) {
        C9I2 c9i2;
        final String str;
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(className, "className");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 == null || (c9i2 = c9i0.LJII) == null) {
            return;
        }
        C9I0 c9i02 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i02 != null) {
            str = c9i02.LIZLLL;
        } else {
            str = null;
        }
        h0.LJIJI(c9i2, new C16120kC() { // from class: X.9xo
            @Override // X.C16120kC
            public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
                o.LJIIIZ(host, "host");
                o.LJIIIZ(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.LJIILJJIL(className);
                info.LJIJ(str);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void Ow(C9IF tag, CharSequence value) {
        C9I2 c9i2;
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(value, "value");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 == null || (c9i2 = c9i0.LJII) == null) {
            return;
        }
        c9i2.setContentDescription(value);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void Zb0(C9IF tag, final CharSequence roleDescription) {
        C9I2 c9i2;
        final String str;
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(roleDescription, "roleDescription");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 == null || (c9i2 = c9i0.LJII) == null) {
            return;
        }
        C9I0 c9i02 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i02 != null) {
            str = c9i02.LIZLLL;
        } else {
            str = null;
        }
        h0.LJIJI(c9i2, new C16120kC() { // from class: X.9xp
            @Override // X.C16120kC
            public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
                o.LJIIIZ(host, "host");
                o.LJIIIZ(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.LJJIFFI(roleDescription);
                info.LJIJ(str);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void a90(C9IF tag, InterfaceC65784Pro<C76800UCe> clickFunc) {
        C9I2 c9i2;
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(clickFunc, "clickFunc");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 != null && (c9i2 = c9i0.LJII) != null) {
            c9i2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS24S0100000_4(clickFunc, 297)));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void gp0(C9IF tag, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(tag, "tag");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 == null || c9i0.LJII == null || ((ArrayList) this.LJLJJL).contains(tag)) {
            return;
        }
        A3(tag, false, null);
        if (interfaceC65784Pro == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public final float v3(int i, String str) {
        if (str == null) {
            return 0.0f;
        }
        ((TextView) this.LJLLLLLL.getValue()).setTextSize(i);
        return (C32151Nz.LJIIZILJ(20) * 2) + ((TextView) this.LJLLLLLL.getValue()).getPaint().measureText(str);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void vI(C9IF tag, Integer num) {
        C9I2 c9i2;
        o.LJIIIZ(tag, "tag");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 == null || (c9i2 = c9i0.LJII) == null || num == null) {
            return;
        }
        num.intValue();
        ((TuxIconView) c9i2.LIZ(R.id.d5r)).setIconRes(num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A3(X.C9IF r15, boolean r16, java.util.ListIterator<X.C9IF> r17) {
        /*
            Method dump skipped, instructions count: 1131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTABaseComponent.A3(X.9IF, boolean, java.util.ListIterator):void");
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void TX(EnumC234329Ho maxStyle, C9IF type, C65776Prg c65776Prg) {
        C9I2 c9i2;
        o.LJIIIZ(type, "type");
        o.LJIIIZ(maxStyle, "maxStyle");
        C9I2 x3 = x3(type);
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(type);
        if (c9i0 == null) {
            c9i0 = new C9I0(null);
        }
        c9i0.LIZIZ = maxStyle;
        c9i0.LJII = x3;
        int i = C234339Hp.LIZ[maxStyle.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c9i0.LIZ = C9HL.TEXT;
            }
        } else {
            c9i0.LIZ = C9HL.ICON;
        }
        this.LJLJJI.put(type, c9i0);
        ((ArrayList) this.LJLIL).add(new C9I1(maxStyle, type, c65776Prg));
        ArrayList arrayList = (ArrayList) this.LJLIL;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS32S0000000_4(8));
        }
        LinearLayout linearLayout = this.LJLL;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Iterator it = ((ArrayList) this.LJLIL).iterator();
            while (it.hasNext()) {
                C9I0 c9i02 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(((C9I1) it.next()).LJLIL);
                if (c9i02 != null && (c9i2 = c9i02.LJII) != null) {
                    LinearLayout linearLayout2 = this.LJLL;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(c9i2);
                    } else {
                        o.LJIJI("ctaContainerView");
                        throw null;
                    }
                }
            }
            return;
        }
        o.LJIJI("ctaContainerView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void jc0(C9IF tag, int i, int i2) {
        boolean z;
        C9HL c9hl;
        C9HL c9hl2;
        o.LJIIIZ(tag, "tag");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 != null) {
            z = c9i0.LJI;
        } else {
            z = false;
        }
        C9I0 c9i02 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i02 != null) {
            C9I2 c9i2 = c9i02.LJII;
            if (c9i2 != null && (c9hl2 = c9i2.LJLIL) != null) {
                int i3 = C9I3.LIZ[c9hl2.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (i != 0) {
                            if (i != 1) {
                                c9i2.LIZ(R.id.d5t).setVisibility(8);
                                c9i2.LIZ(R.id.d5s).setVisibility(8);
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("Error displaying CTA ICON alert badge! alertType ");
                                LIZ.append(i);
                                C221018lt.LIZIZ("CTASingleComponentView", X1D.LIZIZ(LIZ));
                            } else {
                                AVS avs = (AVS) c9i2.LIZ(R.id.d5s);
                                avs.setVariant(1);
                                avs.setCount(i2);
                                avs.setVisibility(0);
                                c9i2.LIZ(R.id.d5t).setVisibility(8);
                            }
                        } else {
                            AVS avs2 = (AVS) c9i2.LIZ(R.id.d5t);
                            avs2.setVariant(0);
                            avs2.setVisibility(0);
                            c9i2.LIZ(R.id.d5s).setVisibility(8);
                        }
                    }
                } else {
                    AVS avs3 = (AVS) c9i2.LIZ(R.id.d5z);
                    avs3.setVariant(i);
                    avs3.setCount(i2);
                    avs3.setVisibility(0);
                }
            }
            c9i02.LJI = true;
        }
        if (!z && this.LJLLILLLL < C7MY.LIZIZ(17)) {
            C9I0 c9i03 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
            if (c9i03 != null) {
                c9hl = c9i03.LIZ;
            } else {
                c9hl = null;
            }
            if (c9hl == C9HL.TEXT) {
                if (this.LJLLI != null) {
                    this.LJLLILLLL = KL2.LJIIJJI(r0) - (C32151Nz.LJIIZILJ(16) * 2);
                    this.LJLLJ = 15;
                    C3();
                    return;
                }
                o.LJIJI("nonNullContext");
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void Lq(C9IF tag, Integer num, String str, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        C9HL c9hl;
        o.LJIIIZ(tag, "tag");
        C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
        if (c9i0 != null) {
            C9I2 c9i2 = c9i0.LJII;
            if (c9i2 != null) {
                C9I0 c9i02 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
                if (c9i02 != null) {
                    c9hl = c9i02.LIZ;
                } else {
                    c9hl = null;
                }
                c9i2.LIZJ(c9hl, num, str, interfaceC88472Yns);
            }
            c9i0.LJ = interfaceC88472Yns;
            c9i0.LIZJ = num;
            c9i0.LIZLLL = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility
    public final void m00(C9IF tag, String str, Integer num, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        String str2;
        C9I2 c9i2;
        o.LJIIIZ(tag, "tag");
        if (str != null && num != null) {
            num.intValue();
            C9I0 c9i0 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
            if (c9i0 != null && (c9i2 = c9i0.LJII) != null) {
                spannableStringBuilder = c9i2.LIZLLL(i, i2, num, str);
            } else {
                spannableStringBuilder = null;
            }
            C9I0 c9i02 = (C9I0) ((LinkedHashMap) this.LJLJJI).get(tag);
            if (c9i02 == null) {
                return;
            }
            if (spannableStringBuilder == null || (str2 = spannableStringBuilder.toString()) == null) {
                str2 = "";
            }
            c9i02.LIZLLL = str2;
        }
    }
}
