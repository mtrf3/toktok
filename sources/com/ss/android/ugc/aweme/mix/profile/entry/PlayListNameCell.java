package com.ss.android.ugc.aweme.mix.profile.entry;

import X.AnonymousClass391;
import X.C00F;
import X.C16880lQ;
import X.C228888ya;
import X.C229238z9;
import X.C26338AVi;
import X.C32151Nz;
import X.C45804HyK;
import X.C50289JoT;
import X.C99W;
import X.C9XU;
import X.FFL;
import X.G27;
import X.HG3;
import X.MG8;
import X.MGB;
import X.MGD;
import X.MGE;
import X.MGF;
import X.O6R;
import X.SY4;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PlayListNameCell extends PowerCell<MGD> implements G27 {
    public MGD LJLIL;
    public SY4 LJLILLLLZI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(MGD mgd) {
        SY4 sy4;
        int i;
        boolean z;
        MGD t = mgd;
        o.LJIIIZ(t, "t");
        View view = this.itemView;
        if ((view instanceof SY4) && (sy4 = (SY4) view) != null) {
            this.LJLIL = t;
            this.LJLILLLLZI = sy4;
            sy4.setIconTintColorRes(R.attr.go);
            sy4.setText(t.LJLIL);
            HG3.LJIIL();
            boolean LJ = o.LJ(HG3.LJLJL.LJFF().getCurUserId(), t.LJLJJI);
            if (t.LJLJLJ) {
                C26338AVi.LJI(sy4, null, AnonymousClass391.LIZJ(4), null, AnonymousClass391.LIZJ(4), false, 16);
                C50289JoT.LIZ.getClass();
                FFL.LJIIIZ().getClass();
                if (FFL.LJIIJ(31744, 0, "unified_horizontal_tab_style", true) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    sy4.setHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
                    sy4.setTextSize(13.0f);
                    sy4.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    sy4.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                } else if (C00F.LIZ(31744, 0, "unified_horizontal_tab_style", true) == 2 || C00F.LIZ(31744, 0, "unified_horizontal_tab_style", true) == 3) {
                    sy4.setHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28)));
                    sy4.setTextSize(13.0f);
                    sy4.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    sy4.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                } else {
                    sy4.setButtonSize(2);
                    sy4.setTextSize(14.0f);
                    sy4.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
                    sy4.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
                }
            }
            String str = t.LJLL;
            if (t.LJLJLJ) {
                i = 0;
            } else {
                i = -1;
            }
            C229238z9 c229238z9 = new C229238z9(str, Integer.valueOf(i), t.LJLLILLLL, 0, null, null, 56, null);
            if (t.LJLJI) {
                String str2 = t.LJLJJLL;
                String str3 = t.LJLILLLLZI;
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = t.LJLJJI;
                String str6 = t.LJLL;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = t.LJLLI;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = t.LJLJLLL;
                if (str8 != null) {
                    str4 = str8;
                }
                C228888ya.LJIIJJI(str2, str3, null, str5, str6, str7, str4, c229238z9, null, 260);
                t.LJLJI = false;
            }
            if (C99W.LIZ) {
                sy4.setButtonVariant(5);
            }
            C16880lQ.LJIIJ(new MGB(sy4, t, LJ, c229238z9, this), this.itemView);
            sy4.setMinWidth(MG8.LLD);
            sy4.getViewTreeObserver().addOnPreDrawListener(new MGF(this, t, sy4));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        int i;
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            i = LJIJJ.hashCode();
        } else {
            i = -1;
        }
        C9XU.LIZ(i, this);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.c5p, parent, false);
        o.LJIIIIZZ(LLLLIILL, "from(parent.context)\n   …ntry_item, parent, false)");
        return LLLLIILL;
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        MGD mgd;
        ViewTreeObserver viewTreeObserver;
        o.LJIIIZ(newConfig, "newConfig");
        SY4 sy4 = this.LJLILLLLZI;
        if (sy4 != null && (mgd = this.LJLIL) != null && (viewTreeObserver = sy4.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new MGE(this, mgd, sy4));
        }
    }

    public final boolean L(MGD mgd, SY4 sy4, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        boolean z;
        boolean z2;
        int measureText = ((int) sy4.getPaint().measureText(String.valueOf(mgd.LJLIL))) + MG8.LL;
        int i = MG8.LLD;
        if (measureText <= i) {
            measureText = i;
        }
        int i2 = sy4.getLayoutParams().width;
        boolean z3 = false;
        if ((i2 > MG8.LLFFF && i2 > measureText) || i2 < measureText) {
            ViewGroup.LayoutParams layoutParams = sy4.getLayoutParams();
            layoutParams.width = measureText;
            sy4.setLayoutParams(layoutParams);
            if (measureText <= MG8.LLFFF) {
                z2 = true;
            } else {
                z2 = false;
            }
            MG8.LLFII = z2;
            MG8.LLFZ = false;
            return true;
        }
        if (!MG8.LLFII) {
            ViewGroup.LayoutParams layoutParams2 = sy4.getLayoutParams();
            if (layoutParams2.width != measureText) {
                layoutParams2.width = measureText;
                sy4.setLayoutParams(layoutParams2);
            }
            if (onPreDrawListener != null) {
                sy4.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
            return true;
        }
        if (i2 == MG8.LLFFF && MG8.LLFZ) {
            if (onPreDrawListener != null) {
                sy4.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
            return true;
        }
        if (MG8.LLFZ) {
            ViewGroup.LayoutParams layoutParams3 = sy4.getLayoutParams();
            layoutParams3.width = MG8.LLFFF;
            sy4.setLayoutParams(layoutParams3);
            if (onPreDrawListener != null) {
                sy4.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
            return true;
        }
        if (sy4.getRight() >= MG8.LLIFFJFJJ) {
            MG8.LLFII = false;
            if (onPreDrawListener != null) {
                sy4.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
            return true;
        }
        if (getLayoutPosition() < MG8.LLI - 1) {
            if (MG8.LLFII && sy4.getWidth() <= MG8.LLFFF) {
                z3 = true;
            }
            MG8.LLFII = z3;
            return true;
        }
        if (getLayoutPosition() == MG8.LLI - 1) {
            if (MG8.LLFII && sy4.getWidth() <= MG8.LLFFF) {
                z = true;
            } else {
                z = false;
            }
            MG8.LLFII = z;
            MG8.LLFZ = z;
            if (z) {
                return false;
            }
            if (onPreDrawListener != null) {
                sy4.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }
        return true;
    }
}
