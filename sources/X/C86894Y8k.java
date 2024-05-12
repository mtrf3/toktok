package X;

import Y.ACListenerS6S0401000_15;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.tab.profiletab.mob.IProfileTabEventAbility;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Y8k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86894Y8k extends C80261Vej {
    public int LJLIL;
    public C1BC LJLILLLLZI;
    public final java.util.Map<Integer, C79236V7w> LJLJI;
    public final java.util.Map<Integer, Integer> LJLJJI;
    public final java.util.Map<Integer, View> LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r3 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86894Y8k.LJ():void");
    }

    public final int getLandingTabType() {
        return this.LJLJL;
    }

    public final int getTabViewMode() {
        return this.LJLIL;
    }

    public final boolean getTextNavigatorScrollable() {
        return this.LJLJJLL;
    }

    public static int LIZIZ(String text) {
        o.LJIIIZ(text, "text");
        LocaleSpan localeSpan = new LocaleSpan(Resources.getSystem().getConfiguration().locale);
        Paint paint = new Paint();
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(localeSpan, 0, spannableString.length(), 33);
        paint.setTextSize(C32151Nz.LJIIZILJ(16));
        return (int) paint.measureText(spannableString, 0, spannableString.length());
    }

    public static void LJII(View view) {
        View view2;
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            view2.onTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, 0.0f, 0.0f, 0));
            view2.onTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, 0.0f, 0.0f, 0));
        }
    }

    public final void LIZLLL(LBF lbf) {
        View view;
        if (this.LJLIL == 1) {
            return;
        }
        int width = (lbf.getWidth() - O6R.LJJIIZ(C32151Nz.LJIIZILJ(40))) / 2;
        C26338AVi.LJI(lbf, Integer.valueOf(width), 0, Integer.valueOf(width), 0, false, 16);
        C27570Aru.LJIIIZ(lbf, O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
        Object parent = lbf.getParent();
        Drawable drawable = null;
        if ((parent instanceof View) && (view = (View) parent) != null) {
            drawable = view.getBackground();
        }
        lbf.setBackground(drawable);
    }

    public final void LJFF(Y4F y4f) {
        if (this.LJLIL != 0 && y4f != null) {
            TuxTextView tuxTextView = (TuxTextView) y4f.findViewById(R.id.kyz);
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.go);
            }
            TuxTextView tuxTextView2 = (TuxTextView) y4f.findViewById(R.id.n6x);
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(R.attr.go);
            }
            TuxIconView tuxIconView = (TuxIconView) y4f.findViewById(R.id.wr);
            if (tuxIconView != null) {
                tuxIconView.setTintColorRes(R.attr.go);
            }
        }
    }

    public final void LJI(Y4F y4f) {
        if (this.LJLIL != 0 && y4f != null) {
            TuxTextView tuxTextView = (TuxTextView) y4f.findViewById(R.id.kyz);
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.gp);
            }
            TuxTextView tuxTextView2 = (TuxTextView) y4f.findViewById(R.id.n6x);
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(R.attr.gp);
            }
            TuxIconView tuxIconView = (TuxIconView) y4f.findViewById(R.id.wr);
            if (tuxIconView != null) {
                tuxIconView.setTintColorRes(R.attr.gp);
            }
        }
    }

    public final void setLandingTabType(int i) {
        this.LJLJL = i;
    }

    public final void setMode(int i) {
        setTabMode(1);
        C26338AVi.LJI(this, C1FJ.LIZIZ(16), 0, C1FJ.LIZIZ(16), 0, false, 16);
        this.LJLIL = i;
    }

    public final void setTextNavigatorScrollable(boolean z) {
        this.LJLJJLL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86894Y8k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJI = new LinkedHashMap();
        this.LJLJJI = new LinkedHashMap();
        this.LJLJJL = new LinkedHashMap();
        this.LJLJJLL = true;
    }

    public static int LIZ(int i, boolean z, C1BC c1bc) {
        int i2;
        if (c1bc != null) {
            i2 = c1bc.getCount();
        } else {
            i2 = 0;
        }
        if (i2 <= i) {
            return 0;
        }
        if (z && (c1bc instanceof T6H)) {
            T6H t6h = (T6H) c1bc;
            if (t6h == null) {
                return 0;
            }
            return t6h.LJJIIZ(i);
        }
        if (c1bc == null) {
            return 0;
        }
        return (int) c1bc.LJJIIJ(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [X.Y8o] */
    /* JADX WARN: Type inference failed for: r6v14, types: [X.LBF] */
    /* JADX WARN: Type inference failed for: r6v19, types: [X.LBF] */
    /* JADX WARN: Type inference failed for: r6v23, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v24, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.view.View] */
    public final void LIZJ(VW9 vw9, boolean z, List<C79235V7v> profileTabStandardDataList, List<C79237V7x> profileTabCustomViewList, int i, InterfaceC86908Y8y listener) {
        PagerAdapter pagerAdapter;
        C1BC c1bc;
        Y4F y4f;
        View view;
        Y4F y4f2;
        Y4F y4f3;
        Y4F y4f4;
        Drawable drawable;
        View view2;
        View view3;
        Object obj;
        Object obj2;
        int i2;
        o.LJIIIZ(profileTabStandardDataList, "profileTabStandardDataList");
        o.LJIIIZ(profileTabCustomViewList, "profileTabCustomViewList");
        o.LJIIIZ(listener, "listener");
        Y4F y4f5 = null;
        if (vw9 != null) {
            pagerAdapter = vw9.getAdapter();
        } else {
            pagerAdapter = null;
        }
        if (pagerAdapter instanceof C1BC) {
            c1bc = (C1BC) pagerAdapter;
        } else {
            c1bc = null;
        }
        this.LJLILLLLZI = c1bc;
        if (c1bc != null) {
            c1bc.notifyDataSetChanged();
        }
        setupWithViewPager(vw9, true);
        removeAllTabs();
        ((LinkedHashMap) this.LJLJI).clear();
        ((LinkedHashMap) this.LJLJJI).clear();
        C1BC c1bc2 = this.LJLILLLLZI;
        if (c1bc2 != null) {
            int count = c1bc2.getCount();
            for (int i3 = 0; i3 < count; i3++) {
                int LIZ = LIZ(i3, z, this.LJLILLLLZI);
                Iterator it = ((ArrayList) profileTabCustomViewList).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        C79237V7x c79237V7x = (C79237V7x) obj;
                        if (c79237V7x.LIZ == LIZ && c79237V7x.LJ == this.LJLIL && c79237V7x.LJII && c79237V7x.LJI) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C79236V7w c79236V7w = (C79237V7x) obj;
                Iterator it2 = ((ArrayList) profileTabStandardDataList).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (((C79236V7w) obj2).LIZ == LIZ) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                C79235V7v c79235V7v = (C79235V7v) obj2;
                if (c79236V7w == null) {
                    c79236V7w = c79235V7v;
                }
                this.LJLJI.put(Integer.valueOf(i3), c79236V7w);
                if (this.LJLIL == 1) {
                    if (c79236V7w instanceof C79237V7x) {
                        C79237V7x c79237V7x2 = (C79237V7x) c79236V7w;
                        if (c79237V7x2.LJ == 1) {
                            this.LJLJJI.put(Integer.valueOf(c79237V7x2.LIZ), Integer.valueOf(c79237V7x2.LJFF));
                        }
                    }
                    if (c79236V7w instanceof C79235V7v) {
                        C79235V7v c79235V7v2 = (C79235V7v) c79236V7w;
                        int LIZIZ = LIZIZ(c79235V7v2.LIZLLL);
                        if (c79235V7v2.LJI) {
                            i2 = C7MY.LIZIZ(25);
                        } else {
                            i2 = 0;
                        }
                        this.LJLJJI.put(Integer.valueOf(c79235V7v2.LIZ), Integer.valueOf(LIZIZ + i2));
                    }
                }
            }
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LJLJI).entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            C79236V7w c79236V7w2 = (C79236V7w) entry.getValue();
            if (c79236V7w2 instanceof C79235V7v) {
                C79235V7v c79235V7v3 = (C79235V7v) c79236V7w2;
                ?? r6 = (View) ((LinkedHashMap) this.LJLJJL).get(Integer.valueOf(c79235V7v3.LIZ));
                Y4F y4f6 = r6;
                if (r6 == 0) {
                    if (c79235V7v3.LJFF) {
                        Context context = getContext();
                        o.LJIIIIZZ(context, "context");
                        String str = c79235V7v3.LIZLLL;
                        int i4 = c79235V7v3.LJ;
                        boolean z2 = c79235V7v3.LJI;
                        if (this.LJLIL == 0) {
                            y4f3 = C58071Mqh.LIZ(context, i4, this);
                        } else {
                            y4f3 = C58071Mqh.LIZLLL(context, this, str, Integer.valueOf(i4), Boolean.valueOf(z2));
                        }
                        LIZLLL(y4f3);
                        y4f6 = y4f3;
                    } else {
                        Context context2 = getContext();
                        o.LJIIIIZZ(context2, "context");
                        String str2 = c79235V7v3.LIZLLL;
                        int i5 = c79235V7v3.LJ;
                        boolean z3 = c79235V7v3.LJI;
                        if (this.LJLIL == 0) {
                            y4f2 = C58071Mqh.LIZJ(context2, i5, this);
                        } else {
                            y4f2 = C58071Mqh.LIZLLL(context2, this, str2, Integer.valueOf(i5), Boolean.valueOf(z3));
                        }
                        LIZLLL(y4f2);
                        y4f6 = y4f2;
                    }
                }
                this.LJLJJL.put(Integer.valueOf(c79235V7v3.LIZ), y4f6);
                C86898Y8o c86898Y8o = c79235V7v3.LJII;
                if (c86898Y8o != null) {
                    c86898Y8o.LIZ(c79236V7w2, y4f6);
                }
                C16880lQ.LJIIJ(new ACListenerS6S0401000_15(vw9, intValue, this, c79236V7w2, listener, 1), y4f6);
                if (y4f6 instanceof Y4F) {
                    y4f = y4f6;
                } else {
                    y4f = null;
                }
                LJI(y4f);
                C78856UxA newTab = newTab();
                newTab.LJFF = y4f6;
                newTab.LJFF();
                addTab(newTab, intValue);
                Object parent = y4f6.getParent();
                if ((parent instanceof View) && (view = (View) parent) != null) {
                    view.setBackground(null);
                }
            } else if (c79236V7w2 instanceof C79237V7x) {
                C79237V7x c79237V7x3 = (C79237V7x) c79236V7w2;
                Y4F y4f7 = (View) ((LinkedHashMap) this.LJLJJL).get(Integer.valueOf(c79237V7x3.LIZ));
                if (y4f7 == null) {
                    y4f7 = c79237V7x3.LIZLLL;
                }
                this.LJLJJL.put(Integer.valueOf(c79237V7x3.LIZ), y4f7);
                ?? r0 = c79237V7x3.LJIIIIZZ;
                if (r0 != null) {
                    r0.LIZ(c79236V7w2, y4f7);
                }
                C16880lQ.LJIIJ(new ACListenerS6S0401000_15(vw9, intValue, this, c79236V7w2, listener, 2), y4f7);
                if (y4f7 instanceof Y4F) {
                    y4f4 = y4f7;
                } else {
                    y4f4 = null;
                }
                LJI(y4f4);
                C78856UxA newTab2 = newTab();
                newTab2.LJFF = y4f7;
                newTab2.LJFF();
                addTab(newTab2, intValue);
                Object parent2 = y4f7.getParent();
                if ((parent2 instanceof View) && (view3 = (View) parent2) != null) {
                    view3.setBackground(null);
                }
                if (this.LJLIL != 1) {
                    int i6 = c79237V7x3.LJFF;
                    int width = (y4f7.getWidth() - i6) / 2;
                    C26338AVi.LJI(y4f7, Integer.valueOf(width), 0, Integer.valueOf(width), 0, false, 16);
                    C27570Aru.LJIIIZ(y4f7, i6);
                    Object parent3 = y4f7.getParent();
                    if ((parent3 instanceof View) && (view2 = (View) parent3) != null) {
                        drawable = view2.getBackground();
                    } else {
                        drawable = null;
                    }
                    y4f7.setBackground(drawable);
                }
            }
        }
        LJ();
        IProfileTabEventAbility iProfileTabEventAbility = (IProfileTabEventAbility) C55096Ljo.LIZ(C55230Lly.LJ(this), IProfileTabEventAbility.class, null);
        if (iProfileTabEventAbility != null) {
            iProfileTabEventAbility.x60();
        }
        IProfileTabEventAbility iProfileTabEventAbility2 = (IProfileTabEventAbility) C55096Ljo.LIZ(C55230Lly.LJ(this), IProfileTabEventAbility.class, null);
        if (iProfileTabEventAbility2 != null) {
            iProfileTabEventAbility2.sh0();
        }
        C86897Y8n c86897Y8n = new C86897Y8n(this, z, listener);
        if (vw9 != null) {
            vw9.setOnPageChangeListener(c86897Y8n);
        }
        setOnTabSelectedListener((LHW) new C86899Y8p(this));
        C78856UxA tabAt = getTabAt(i);
        if (tabAt != null) {
            tabAt.LIZIZ();
            View view4 = tabAt.LJFF;
            if (view4 instanceof Y4F) {
                y4f5 = (Y4F) view4;
            }
            LJFF(y4f5);
        }
    }
}
