package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.OfZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62477OfZ extends FrameLayout implements InterfaceC62548Ogi, InterfaceC62480Ofc {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public List<? extends InterfaceC62486Ofi> LJLJI;
    public List<Integer> LJLJJI;
    public InterfaceC62548Ogi LJLJJL;
    public AbstractC62496Ofs LJLJJLL;
    public boolean LJLJL;
    public RecyclerView LJLJLJ;
    public LinearLayoutManager LJLJLLL;
    public final java.util.Set<String> LJLL;
    public C62387Oe7 LJLLI;
    public View LJLLILLLL;
    public boolean LJLLJ;
    public final String LJLLL;

    public C62477OfZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null, 4);
    }

    @Override // X.InterfaceC62480Ofc
    public final View LIZ(C25600zU c25600zU, C62387Oe7 sharePanelConfig, Fragment hostFragment) {
        o.LJIIIZ(sharePanelConfig, "sharePanelConfig");
        o.LJIIIZ(hostFragment, "hostFragment");
        return null;
    }

    @Override // X.InterfaceC62480Ofc
    public final View LJ(C25600zU c25600zU, C62387Oe7 sharePanelConfig, C4P8 hostPanelPanelCallback, Fragment hostFragment) {
        o.LJIIIZ(sharePanelConfig, "sharePanelConfig");
        o.LJIIIZ(hostPanelPanelCallback, "hostPanelPanelCallback");
        o.LJIIIZ(hostFragment, "hostFragment");
        return this;
    }

    @Override // X.InterfaceC62480Ofc
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC62480Ofc
    public final boolean LJII() {
        return false;
    }

    @Override // X.InterfaceC62480Ofc
    public final void LJIIIIZZ(C25600zU c25600zU, Fragment hostFragment, C4P8 hostPanelPanelCallback) {
        o.LJIIIZ(hostFragment, "hostFragment");
        o.LJIIIZ(hostPanelPanelCallback, "hostPanelPanelCallback");
    }

    @Override // X.InterfaceC62480Ofc
    public View getWidgetView() {
        return this;
    }

    @Override // X.InterfaceC62480Ofc
    public void setUpAdditionView(Fragment hostFragment) {
        o.LJIIIZ(hostFragment, "hostFragment");
    }

    @Override // X.InterfaceC62480Ofc
    public final boolean LIZLLL() {
        C62387Oe7 c62387Oe7 = this.LJLLI;
        if (c62387Oe7 == null) {
            return true;
        }
        List<InterfaceC62486Ofi> list = c62387Oe7.LIZJ;
        if (list != null && !list.isEmpty() && !c62387Oe7.LJIJI) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62480Ofc
    public final void LJI() {
        RecyclerView recyclerView;
        if ((!this.LJLJI.isEmpty()) && (recyclerView = this.LJLJLJ) != null) {
            recyclerView.LJLI(0);
        }
    }

    @Override // X.InterfaceC62548Ogi
    public final void LJIIIZ() {
        InterfaceC62548Ogi interfaceC62548Ogi = this.LJLJJL;
        if (interfaceC62548Ogi != null) {
            interfaceC62548Ogi.LJIIIZ();
        }
    }

    public final void LJIIJ() {
        int i;
        BaseSharePackage baseSharePackage;
        List<? extends InterfaceC62486Ofi> list = this.LJLJI;
        if (list == null || list.isEmpty()) {
            return;
        }
        LinearLayoutManager linearLayoutManager = this.LJLJLLL;
        int i2 = -1;
        if (linearLayoutManager != null) {
            i = linearLayoutManager.LLILLJJLI();
        } else {
            i = -1;
        }
        LinearLayoutManager linearLayoutManager2 = this.LJLJLLL;
        if (linearLayoutManager2 != null) {
            i2 = linearLayoutManager2.LLILL();
        }
        if (i < 0 || i2 < 0 || i2 > i) {
            return;
        }
        while (true) {
            InterfaceC62486Ofi interfaceC62486Ofi = (InterfaceC62486Ofi) ListProtector.get(this.LJLJI, i2);
            if (!this.LJLL.contains(interfaceC62486Ofi.key())) {
                this.LJLL.add(interfaceC62486Ofi.key());
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                C62387Oe7 c62387Oe7 = this.LJLLI;
                if (c62387Oe7 != null) {
                    baseSharePackage = c62387Oe7.LJIIJ;
                } else {
                    baseSharePackage = null;
                }
                interfaceC62486Ofi.LJJIII(context, baseSharePackage);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // X.InterfaceC62480Ofc
    public C4SQ getLayoutPriority() {
        BaseSharePackage baseSharePackage;
        InterfaceC62484Ofg interfaceC62484Ofg = C62494Ofq.LIZ;
        if (interfaceC62484Ofg != null) {
            C62387Oe7 c62387Oe7 = this.LJLLI;
            if (c62387Oe7 != null) {
                baseSharePackage = c62387Oe7.LJIIJ;
            } else {
                baseSharePackage = null;
            }
            if (interfaceC62484Ofg.LJIIJ(baseSharePackage)) {
                String str = this.LJLLL;
                if (str.hashCode() != -326696768 || !str.equals("long_press")) {
                    return C4SQ.values()[C62483Off.LIZ().getPositionInShare()];
                }
                return C4SQ.values()[C62483Off.LIZ().getPositionInLongPress()];
            }
        }
        return C4SQ.BOTTOM;
    }

    @Override // X.InterfaceC62480Ofc
    public EnumC62492Ofo getShowStyle() {
        BaseSharePackage baseSharePackage;
        InterfaceC62484Ofg interfaceC62484Ofg = C62494Ofq.LIZ;
        if (interfaceC62484Ofg != null) {
            C62387Oe7 c62387Oe7 = this.LJLLI;
            if (c62387Oe7 != null) {
                baseSharePackage = c62387Oe7.LJIIJ;
            } else {
                baseSharePackage = null;
            }
            if (interfaceC62484Ofg.LJIIJ(baseSharePackage)) {
                EnumC62492Ofo LIZJ = C62483Off.LIZJ();
                C99Y LIZIZ = C62483Off.LIZIZ();
                EnumC62492Ofo enumC62492Ofo = EnumC62492Ofo.HORIZONTAL;
                if (LIZJ == enumC62492Ofo && LIZIZ == C99Y.SOLID) {
                    return EnumC62492Ofo.HORIZONTAL_WITH_FILLMODE;
                }
                if (LIZJ == enumC62492Ofo && LIZIZ == C99Y.HOLLOW) {
                    return EnumC62492Ofo.HORIZONTAL_WITHOUT_FILLMODE;
                }
                EnumC62492Ofo enumC62492Ofo2 = EnumC62492Ofo.VERTICAL;
                if (LIZJ != enumC62492Ofo2) {
                    return enumC62492Ofo;
                }
                return enumC62492Ofo2;
            }
        }
        return EnumC62492Ofo.HORIZONTAL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r0) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r0) == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01af  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62477OfZ.onAttachedToWindow():void");
    }

    public final AbstractC62496Ofs getConfigActionAdapter() {
        AbstractC62496Ofs c62487Ofj;
        BaseSharePackage baseSharePackage;
        InterfaceC62484Ofg interfaceC62484Ofg;
        BaseSharePackage baseSharePackage2;
        AbstractC62496Ofs abstractC62496Ofs;
        if (OVS.LIZ() && (abstractC62496Ofs = this.LJLJJLL) != null) {
            return abstractC62496Ofs;
        }
        BaseSharePackage baseSharePackage3 = null;
        try {
        } catch (Exception unused) {
            if (C62483Off.LIZJ() == EnumC62492Ofo.VERTICAL) {
                c62487Ofj = new C62488Ofk(this, 0, 0);
            } else {
                String str = this.LJLLL;
                C62387Oe7 c62387Oe7 = this.LJLLI;
                if (c62387Oe7 != null) {
                    baseSharePackage3 = c62387Oe7.LJIIJ;
                }
                c62487Ofj = new C62487Ofj(this, 0, 0, str, baseSharePackage3, this.LJLJL);
            }
        }
        if (C62483Off.LIZJ() == EnumC62492Ofo.VERTICAL && (interfaceC62484Ofg = C62494Ofq.LIZ) != null) {
            C62387Oe7 c62387Oe72 = this.LJLLI;
            if (c62387Oe72 != null) {
                baseSharePackage2 = c62387Oe72.LJIIJ;
            } else {
                baseSharePackage2 = null;
            }
            if (interfaceC62484Ofg.LJIIJ(baseSharePackage2)) {
                c62487Ofj = new C62488Ofk(this, this.LJLIL, this.LJLILLLLZI);
                this.LJLJJLL = c62487Ofj;
                return c62487Ofj;
            }
        }
        int i = this.LJLIL;
        int i2 = this.LJLILLLLZI;
        String str2 = this.LJLLL;
        C62387Oe7 c62387Oe73 = this.LJLLI;
        if (c62387Oe73 != null) {
            baseSharePackage = c62387Oe73.LJIIJ;
        } else {
            baseSharePackage = null;
        }
        c62487Ofj = new C62487Ofj(this, i, i2, str2, baseSharePackage, this.LJLJL);
        this.LJLJJLL = c62487Ofj;
        return c62487Ofj;
    }

    @Override // X.InterfaceC62480Ofc
    public EnumC110664Vy getWidgetType() {
        return EnumC110664Vy.ACTION_BAR;
    }

    public static void LJIIJJI(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (recyclerView != null) {
            layoutParams = recyclerView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams2 = layoutParams;
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
        if (layoutParams3 == null) {
            return;
        }
        layoutParams3.topMargin = C7MY.LIZIZ(0);
        recyclerView.setLayoutParams(layoutParams3);
    }

    @Override // X.InterfaceC62548Ogi
    public final void LIZIZ(InterfaceC62486Ofi action) {
        o.LJIIIZ(action, "action");
        InterfaceC62548Ogi interfaceC62548Ogi = this.LJLJJL;
        if (interfaceC62548Ogi != null) {
            interfaceC62548Ogi.LIZIZ(action);
        }
    }

    @Override // X.InterfaceC62480Ofc
    public final void LIZJ(C62387Oe7 sharePanelConfig) {
        o.LJIIIZ(sharePanelConfig, "sharePanelConfig");
        this.LJLLI = sharePanelConfig;
    }

    public final void setActionAdapter(AbstractC62496Ofs actionAdapter) {
        o.LJIIIZ(actionAdapter, "actionAdapter");
        this.LJLJJLL = actionAdapter;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C62477OfZ(android.content.Context r4, android.util.AttributeSet r5, java.lang.String r6, int r7) {
        /*
            r3 = this;
            r0 = r7 & 2
            if (r0 == 0) goto L5
            r5 = 0
        L5:
            r0 = r7 & 4
            if (r0 == 0) goto Lb
            java.lang.String r6 = "share_panel"
        Lb:
            java.lang.String r0 = "ctx"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "enterMethod"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r3.<init>(r4, r5)
            r3.LJLLL = r6
            android.content.Context r1 = r3.getContext()
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x004c: FILL_ARRAY_DATA , data: [2130969260, 2130970112} // fill-array
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r5, r0)
            java.lang.String r0 = "context.obtainStyledAttr…styleable.ShareActionBar)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r1 = 0
            int r0 = r2.getColor(r1, r1)
            r3.LJLIL = r0
            r0 = 1
            int r0 = r2.getColor(r0, r1)
            r3.LJLILLLLZI = r0
            r2.recycle()
            X.OQg r0 = X.C61878OQg.INSTANCE
            r3.LJLJI = r0
            r3.LJLJJI = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r3.LJLL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62477OfZ.<init>(android.content.Context, android.util.AttributeSet, java.lang.String, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postDelayed(new ARunnableS46S0100000_10((Object) new C62521OgH(this), 57), 300L);
    }
}
