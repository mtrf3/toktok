package com.ss.android.ugc.aweme.input;

import X.C110614Vt;
import X.C16880lQ;
import X.C2068389v;
import X.C213688a4;
import X.C214298b3;
import X.C214838bv;
import X.C214928c4;
import X.C26338AVi;
import X.C2K0;
import X.C62562cu;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71799SFv;
import X.C72A;
import X.C72E;
import X.C72F;
import X.C78926UyI;
import X.C7MY;
import X.C8YN;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.OJD;
import X.SY9;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import Y.IDObjectS176S0100000_3;
import android.animation.AnimatorSet;
import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.input.DanmakuInputAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class DanmakuInputAssem extends UISlotAssem implements DanmakuInputAbility, InterfaceC55102Lju {
    public static final OJD LJLLLL = new OJD("[\r|\n]+");
    public final C214298b3 LJLJLLL;
    public TuxIconView LJLL;
    public C72F LJLLI;
    public TuxIconView LJLLILLLL;
    public C71799SFv LJLLJ;
    public AnimatorSet LJLLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -145495641) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.ajv;
    }

    public DanmakuInputAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(DanmakuInputVM.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 439), C72A.INSTANCE, null);
    }

    public final DanmakuInputVM H3() {
        return (DanmakuInputVM) this.LJLJLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        UrlModel avatarThumb;
        C62562cu c62562cu;
        C71799SFv c71799SFv;
        CharSequence charSequence;
        TuxIconView tuxIconView;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLLILLLL = (TuxIconView) view.findViewById(R.id.jo1);
        Context context = getContext();
        if (context != null && (tuxIconView = this.LJLLILLLL) != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZIZ = C7MY.LIZIZ(16);
            c2068389v.LIZJ = C7MY.LIZIZ(16);
            c2068389v.LIZ = R.raw.icon_arrow_up_fill;
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            SY9 LIZ = c2068389v.LIZ(context);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LJII = C7MY.LIZIZ(28);
            c110614Vt.LJI = C7MY.LIZIZ(28);
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
            c110614Vt.LIZJ = Float.valueOf(Float.MAX_VALUE);
            tuxIconView.setImageDrawable(C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context)));
        }
        TuxIconView tuxIconView2 = this.LJLLILLLL;
        if (tuxIconView2 != null) {
            C16880lQ.LJJJ(tuxIconView2, new ACListenerS23S0100000_3(this, 212));
        }
        this.LJLLI = (C72F) view.findViewById(R.id.cq8);
        C214928c4 c214928c4 = H3().LJLIL;
        if (c214928c4 != null && (charSequence = c214928c4.LJLJI) != null && charSequence.length() > 0) {
            C72F c72f = this.LJLLI;
            if (c72f != null) {
                c72f.setText(charSequence);
            }
            TuxIconView tuxIconView3 = this.LJLLILLLL;
            if (tuxIconView3 != null) {
                tuxIconView3.setVisibility(0);
            }
        }
        C72F c72f2 = this.LJLLI;
        if (c72f2 != null) {
            c72f2.addTextChangedListener(new IDObjectS176S0100000_3(this, 11));
        }
        C72F c72f3 = this.LJLLI;
        String str = null;
        if (c72f3 != null) {
            Context context2 = getContext();
            if (context2 != null) {
                str = context2.getString(R.string.ca9);
            }
            c72f3.setHint(str);
        }
        C72F c72f4 = this.LJLLI;
        if (c72f4 != null) {
            final View containerView = getContainerView();
            c72f4.setFilters(new InputFilter[]{new InputFilter(containerView) { // from class: X.7K6
                public final View LJLIL;
                public final int LJLILLLLZI;

                {
                    o.LJIIIZ(containerView, "rootView");
                    this.LJLIL = containerView;
                    this.LJLILLLLZI = ((Number) C7K7.LIZ.getValue()).intValue();
                }

                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence2, int i, int i2, Spanned spanned, int i3, int i4) {
                    if (spanned == null || charSequence2 == null) {
                        return null;
                    }
                    int length = this.LJLILLLLZI - (spanned.length() - (i4 - i3));
                    int i5 = i2 - i;
                    if (length < i5) {
                        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
                        c26045AKb.LJIIIIZZ(R.string.j__);
                        c26045AKb.LJIIJ();
                    }
                    if (length <= 0) {
                        return "";
                    }
                    if (length >= i5) {
                        return null;
                    }
                    int i6 = length + i;
                    int i7 = i6 - 1;
                    if (Character.isHighSurrogate(charSequence2.charAt(i7))) {
                        if (i7 == i) {
                            return "";
                        }
                        i6 = i7;
                    }
                    return charSequence2.subSequence(i, i6);
                }
            }});
        }
        C72F c72f5 = this.LJLLI;
        if (c72f5 != null) {
            c72f5.setFocusChangeListener(new C72E() { // from class: X.72B
                @Override // X.C72E
                public final void LIZ() {
                    KeyboardUtils.LIZLLL(DanmakuInputAssem.this.LJLLI);
                }
            });
        }
        C72F c72f6 = this.LJLLI;
        if (c72f6 != null) {
            c72f6.setFocusableInTouchMode(true);
        }
        C72F c72f7 = this.LJLLI;
        if (c72f7 != null) {
            c72f7.setFocusable(true);
        }
        C72F c72f8 = this.LJLLI;
        if (c72f8 != null) {
            c72f8.requestFocus();
        }
        TuxIconView tuxIconView4 = (TuxIconView) view.findViewById(R.id.cu2);
        this.LJLL = tuxIconView4;
        if (tuxIconView4 != null) {
            C16880lQ.LJJJ(tuxIconView4, new ACListenerS23S0100000_3(this, 213));
        }
        this.LJLLJ = (C71799SFv) view.findViewById(R.id.ad0);
        User curUser = C214838bv.LIZ().LJFF().getCurUser();
        if (curUser.getAvatarMedium() != null) {
            avatarThumb = curUser.getAvatarMedium();
        } else if (curUser.getAvatarLarger() != null) {
            avatarThumb = curUser.getAvatarLarger();
        } else {
            if (curUser.getAvatarThumb() != null) {
                avatarThumb = curUser.getAvatarThumb();
            }
            C8YN.LJII(this, H3(), new TBT() { // from class: X.71y
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((AnonymousClass724) obj).LJLIL;
                }
            }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 165), 4);
            C8YN.LJII(this, H3(), new TBT() { // from class: X.6zL
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((AnonymousClass724) obj).LJLJJI);
                }
            }, C213688a4.LJ(), new AqS185S0100000_3(this, 166), 4);
        }
        if (avatarThumb != null && (c62562cu = new C62562cu(avatarThumb.getUrlList())) != null && (c71799SFv = this.LJLLJ) != null) {
            C71799SFv.LJIIJ(c71799SFv, c62562cu, null, false, null, 110);
        }
        C8YN.LJII(this, H3(), new TBT() { // from class: X.71y
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AnonymousClass724) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 165), 4);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.6zL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((AnonymousClass724) obj).LJLJJI);
            }
        }, C213688a4.LJ(), new AqS185S0100000_3(this, 166), 4);
    }
}
