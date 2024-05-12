package com.ss.android.ugc.feed.platform.panel.loadmorepanel;

import X.AbstractC55113Lk5;
import X.C221138m5;
import X.C55065LjJ;
import X.C55108Lk0;
import X.C78996UzQ;
import X.InterfaceC54976Lhs;
import X.InterfaceC55066LjK;
import X.InterfaceC55109Lk1;
import X.InterfaceC55110Lk2;
import X.InterfaceC55112Lk4;
import X.JCR;
import X.KR0;
import X.KR8;
import X.KUR;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LoadMorePanelComponentTempHelper implements ILoadMoreAbility {
    public static final boolean LJLJJLL;
    public final Fragment LJLIL;
    public TuxTextView LJLILLLLZI;
    public C55108Lk0 LJLJI;
    public final C221138m5 LJLJJI;
    public final List<InterfaceC55066LjK> LJLJJL;

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void showLoadMoreError() {
        LIZ(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (((java.lang.Number) r2.getValue()).intValue() != 1) goto L4;
     */
    static {
        /*
            X.Ol8 r2 = X.C52885KpF.LIZ
            java.lang.Object r0 = r2.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L13
        Lf:
            r1 = 0
        L10:
            com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper.LJLJJLL = r1
            return
        L13:
            java.lang.Object r0 = r2.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 == r1) goto L10
        L21:
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper.<clinit>():void");
    }

    public final ILoadMoreAbility PZ() {
        return (ILoadMoreAbility) this.LJLJJI.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final boolean aY() {
        KUR LIZJ;
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ == null) {
                return false;
            }
            return PZ.aY();
        }
        C55108Lk0 c55108Lk0 = this.LJLJI;
        if (c55108Lk0 == null || (LIZJ = c55108Lk0.LIZJ(false)) == null || LIZJ.LJLILLLLZI != 0 || c55108Lk0.getViewPagerMarginTop() >= 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void fy() {
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.fy();
                return;
            }
            return;
        }
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView == null) {
            C55108Lk0 c55108Lk0 = this.LJLJI;
            if (c55108Lk0 == null) {
                return;
            }
            int childCount = c55108Lk0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = c55108Lk0.getChildAt(i);
                o.LJIIIIZZ(childAt, "getChildAt(i)");
                if (childAt instanceof KUR) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    int childCount2 = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount2; i2++) {
                        View childAt2 = viewGroup.getChildAt(i2);
                        o.LJIIIIZZ(childAt2, "getChildAt(i)");
                        if (childAt2 instanceof TuxTextView) {
                            TuxTextView tuxTextView2 = (TuxTextView) childAt2;
                            this.LJLILLLLZI = tuxTextView2;
                            tuxTextView2.setText("");
                        }
                    }
                }
            }
            return;
        }
        tuxTextView.setText("");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final int getMeasuredHeight() {
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ == null) {
                return 0;
            }
            return PZ.getMeasuredHeight();
        }
        C55108Lk0 c55108Lk0 = this.LJLJI;
        if (c55108Lk0 == null) {
            return 0;
        }
        return c55108Lk0.getMeasuredHeight();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void q1() {
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.q1();
                return;
            }
            return;
        }
        C55108Lk0 c55108Lk0 = this.LJLJI;
        if (c55108Lk0 == null) {
            return;
        }
        c55108Lk0.LJII();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void resetLoadMoreState() {
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.resetLoadMoreState();
                return;
            }
            return;
        }
        C55108Lk0 c55108Lk0 = this.LJLJI;
        if (c55108Lk0 == null) {
            return;
        }
        c55108Lk0.LJI();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void showLoadMoreEmpty() {
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.showLoadMoreEmpty();
                return;
            }
            return;
        }
        Iterator<InterfaceC55066LjK> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onEmpty();
        }
        C55108Lk0 c55108Lk0 = this.LJLJI;
        if (c55108Lk0 == null) {
            return;
        }
        c55108Lk0.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void ug0() {
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.ug0();
                return;
            }
            return;
        }
        C55108Lk0 c55108Lk0 = this.LJLJI;
        if (c55108Lk0 == null) {
            return;
        }
        c55108Lk0.LIZLLL();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void vR() {
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.vR();
                return;
            }
            return;
        }
        C55108Lk0 c55108Lk0 = this.LJLJI;
        if (c55108Lk0 == null) {
            return;
        }
        c55108Lk0.LJLLILLLL = 0;
        if (c55108Lk0.LJLLLLLL != -1) {
            return;
        }
        c55108Lk0.LJLLLLLL = System.currentTimeMillis();
    }

    public LoadMorePanelComponentTempHelper(Fragment curFragment) {
        o.LJIIIZ(curFragment, "curFragment");
        this.LJLIL = curFragment;
        this.LJLJJI = KR8.LJIIJJI(new AqS159S0100000_9(this, 736));
        this.LJLJJL = new ArrayList();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void Ci0(KR0 kr0) {
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.Ci0(kr0);
                return;
            }
            return;
        }
        C55108Lk0 c55108Lk0 = this.LJLJI;
        if (c55108Lk0 == null) {
            return;
        }
        c55108Lk0.LLFII.add(kr0);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void DA(InterfaceC55112Lk4 interfaceC55112Lk4) {
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.DA(interfaceC55112Lk4);
                return;
            }
            return;
        }
        C55108Lk0 c55108Lk0 = this.LJLJI;
        if (c55108Lk0 == null) {
            return;
        }
        c55108Lk0.setLoadMoreListener(interfaceC55112Lk4);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void Kv(String str) {
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.Kv("main_feed");
                return;
            }
            return;
        }
        C55108Lk0 c55108Lk0 = this.LJLJI;
        if (c55108Lk0 == null) {
            return;
        }
        c55108Lk0.setLabel("main_feed");
    }

    public final void LIZ(Exception exc) {
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.showLoadMoreError();
                return;
            }
            return;
        }
        Iterator it = ((ArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            ((InterfaceC55066LjK) it.next()).onFailed();
        }
        C55108Lk0 c55108Lk0 = this.LJLJI;
        if (c55108Lk0 == null) {
            return;
        }
        KUR LIZJ = c55108Lk0.LIZJ(true);
        if (LIZJ != null) {
            LIZJ.LJIIIIZZ();
        }
        c55108Lk0.LJLLILLLL = 2;
        c55108Lk0.LJI();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void LJZI(View view) {
        if (view != null) {
            if (LJLJJLL) {
                ILoadMoreAbility PZ = PZ();
                if (PZ != null) {
                    PZ.LJZI(view);
                    return;
                }
                return;
            }
            C55108Lk0 c55108Lk0 = this.LJLJI;
            if (c55108Lk0 == null) {
                return;
            }
            c55108Lk0.addView(view);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void NT(InterfaceC55110Lk2 interfaceC55110Lk2) {
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.NT(interfaceC55110Lk2);
                return;
            }
            return;
        }
        C55108Lk0 c55108Lk0 = this.LJLJI;
        if (c55108Lk0 == null) {
            return;
        }
        c55108Lk0.setOnGestureTriggerExit(interfaceC55110Lk2);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void Rg0(String enterFromPage) {
        o.LJIIIZ(enterFromPage, "enterFromPage");
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.Rg0(enterFromPage);
                return;
            }
            return;
        }
        C55108Lk0 c55108Lk0 = this.LJLJI;
        if (c55108Lk0 == null) {
            return;
        }
        c55108Lk0.setEnterFromPage(enterFromPage);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void Up0(InterfaceC55109Lk1 interfaceC55109Lk1) {
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.Up0(interfaceC55109Lk1);
                return;
            }
            return;
        }
        C55108Lk0 c55108Lk0 = this.LJLJI;
        if (c55108Lk0 == null) {
            return;
        }
        ((ArrayList) c55108Lk0.LL).add(interfaceC55109Lk1);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void ep0(JCR l) {
        o.LJIIIZ(l, "l");
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.ep0(l);
                return;
            }
            return;
        }
        ((ArrayList) this.LJLJJL).add(l);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void qW(boolean z) {
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.qW(z);
                return;
            }
            return;
        }
        C55108Lk0 c55108Lk0 = this.LJLJI;
        if (c55108Lk0 == null) {
            return;
        }
        c55108Lk0.setSkipTouchEvent(z);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void qt0(AbstractC55113Lk5 abstractC55113Lk5) {
        KeyEvent.Callback callback;
        C55108Lk0 c55108Lk0;
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.qt0(abstractC55113Lk5);
                return;
            }
            return;
        }
        View view = this.LJLIL.getView();
        if (view != null) {
            callback = view.findViewById(R.id.itq);
        } else {
            callback = null;
        }
        if (!(callback instanceof InterfaceC54976Lhs) || (c55108Lk0 = this.LJLJI) == null) {
            return;
        }
        c55108Lk0.LJLJI = abstractC55113Lk5;
        c55108Lk0.LJLJJI = (InterfaceC54976Lhs) callback;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void removeView(View view) {
        if (LJLJJLL) {
            ILoadMoreAbility PZ = PZ();
            if (PZ != null) {
                PZ.removeView(view);
                return;
            }
            return;
        }
        C55108Lk0 c55108Lk0 = this.LJLJI;
        if (c55108Lk0 == null) {
            return;
        }
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        c55108Lk0.removeView(view);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            if (LJLJJLL) {
                ILoadMoreAbility PZ = PZ();
                if (PZ != null) {
                    PZ.addView(view, layoutParams);
                    return;
                }
                return;
            }
            C55108Lk0 c55108Lk0 = this.LJLJI;
            if (c55108Lk0 == null) {
                return;
            }
            c55108Lk0.addView(view, layoutParams);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        if (!LJLJJLL) {
            this.LJLJI = (C55108Lk0) view.findViewById(R.id.g99);
            NT(new C55065LjJ(this));
        }
    }
}
