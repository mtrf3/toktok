package X;

import Y.ACListenerS19S0201000_1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4dX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113914dX extends FrameLayout implements InterfaceC113814dN, InterfaceC62480Ofc {
    public static final /* synthetic */ int LJLLLLLL = 0;
    public final int LJLIL;
    public final String[] LJLILLLLZI;
    public final List<TuxIconView> LJLJI;
    public List<? extends InterfaceC62225ObV> LJLJJI;
    public InterfaceC113814dN LJLJJL;
    public C4RC LJLJJLL;
    public C62387Oe7 LJLJL;
    public LinearLayoutManager LJLJLJ;
    public boolean LJLJLLL;
    public InterfaceC114004dg LJLL;
    public RecyclerView LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public HashMap LJLLLL;

    public C113914dX(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null, 4);
    }

    @Override // X.InterfaceC62480Ofc
    public final View LIZ(C25600zU c25600zU, C62387Oe7 sharePanelConfig, Fragment hostFragment) {
        o.LJIIIZ(sharePanelConfig, "sharePanelConfig");
        o.LJIIIZ(hostFragment, "hostFragment");
        return null;
    }

    public final View LIZIZ(int i) {
        if (this.LJLLLL == null) {
            this.LJLLLL = new HashMap();
        }
        View view = (View) this.LJLLLL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJLLLL.put(Integer.valueOf(i), findViewById);
        return findViewById;
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
        C62387Oe7 c62387Oe7 = this.LJLJL;
        if (c62387Oe7 != null && c62387Oe7.LJFF) {
            ORS.LJJLIL(new AqS167S0100000_1(this, 301), c62387Oe7.LIZ);
        }
        return C113944da.LIZ(this.LJLJL);
    }

    @Override // X.InterfaceC62480Ofc
    public final void LJI() {
        RecyclerView recyclerView;
        if ((!this.LJLJJI.isEmpty()) && (recyclerView = this.LJLLI) != null) {
            recyclerView.LJLI(0);
        }
    }

    public final void LJIIJJI() {
        C62387Oe7 c62387Oe7 = this.LJLJL;
        if (c62387Oe7 != null) {
            List<InterfaceC62225ObV> list = c62387Oe7.LIZ;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC62225ObV interfaceC62225ObV : list) {
                if (!ORY.LJJIJIIJIL(interfaceC62225ObV.key(), this.LJLILLLLZI)) {
                    arrayList.add(interfaceC62225ObV);
                }
            }
            List LLILLL = ORZ.LLILLL(arrayList, ((ArrayList) this.LJLJI).size());
            int size = LLILLL.size();
            for (int i = 0; i < size; i++) {
                ((View) ListProtector.get(this.LJLJI, i)).setBackground(((InterfaceC62225ObV) ListProtector.get(LLILLL, i)).LIZJ(getContext()));
                ((ImageView) ListProtector.get(this.LJLJI, i)).setVisibility(0);
                C62468OfQ.LIZ((InterfaceC62225ObV) ListProtector.get(LLILLL, i));
                C16880lQ.LJJJ((TuxIconView) ListProtector.get(this.LJLJI, i), new ACListenerS19S0201000_1(LLILLL, this, i, 0));
                if (((InterfaceC62225ObV) ListProtector.get(LLILLL, i)).LJIILJJIL()) {
                    ((View) ListProtector.get(this.LJLJI, i)).setAlpha(((InterfaceC62225ObV) ListProtector.get(LLILLL, i)).LJIILLIIL());
                } else {
                    ((View) ListProtector.get(this.LJLJI, i)).setAlpha(1.0f);
                }
            }
        }
    }

    @Override // X.InterfaceC62480Ofc
    public EnumC62492Ofo getShowStyle() {
        EnumC62492Ofo enumC62492Ofo;
        C62387Oe7 c62387Oe7 = this.LJLJL;
        if (c62387Oe7 == null || (enumC62492Ofo = c62387Oe7.LIZIZ) == null) {
            return EnumC62492Ofo.EXPAND;
        }
        return enumC62492Ofo;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x040b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113914dX.onAttachedToWindow():void");
    }

    @Override // X.InterfaceC62480Ofc
    public C4SQ getLayoutPriority() {
        return C4SQ.values()[C113994df.LIZ().getPosition()];
    }

    public final List<InterfaceC62225ObV> getCurrentChannel() {
        return this.LJLJJI;
    }

    public final boolean getHasAnimation() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC62480Ofc
    public EnumC110664Vy getWidgetType() {
        return EnumC110664Vy.CHANNEL_BAR;
    }

    @Override // X.InterfaceC62480Ofc
    public final void LIZJ(C62387Oe7 sharePanelConfig) {
        o.LJIIIZ(sharePanelConfig, "sharePanelConfig");
        this.LJLJL = sharePanelConfig;
    }

    public final void setHasAnimation(boolean z) {
        RecyclerView recyclerView;
        if (z && (recyclerView = this.LJLLI) != null) {
            recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(getContext(), R.anim.fg));
        }
        this.LJLLJ = z;
    }

    @Override // X.InterfaceC113814dN
    public final void LJIIIZ(InterfaceC62225ObV channel, View view) {
        o.LJIIIZ(channel, "channel");
        InterfaceC113814dN interfaceC113814dN = this.LJLJJL;
        if (interfaceC113814dN != null) {
            interfaceC113814dN.LJIIIZ(channel, view);
        }
    }

    public final void LJIIJ(List<? extends InterfaceC62225ObV> channels, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(channels, "channels");
        if (z) {
            if (this.LJLJLLL) {
                getContext();
                this.LJLJLJ = new GridLayoutManager(4);
                RecyclerView recyclerView = this.LJLLI;
                if (recyclerView != null) {
                    layoutParams = recyclerView.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = -2;
                    }
                } else {
                    layoutParams = null;
                }
                RecyclerView recyclerView2 = this.LJLLI;
                if (recyclerView2 != null) {
                    recyclerView2.setLayoutParams(layoutParams);
                }
                RecyclerView recyclerView3 = this.LJLLI;
                if (recyclerView3 != null) {
                    recyclerView3.setPadding(C7MY.LIZIZ(27), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(27)), 0);
                }
                RecyclerView recyclerView4 = this.LJLLI;
                if (recyclerView4 != null) {
                    recyclerView4.LJII(new C113934dZ(C7MY.LIZIZ(16)), -1);
                }
            } else {
                getContext();
                this.LJLJLJ = new LinearLayoutManager(0, false);
            }
            RecyclerView recyclerView5 = this.LJLLI;
            if (recyclerView5 != null) {
                recyclerView5.setLayoutManager(this.LJLJLJ);
            }
        }
        this.LJLJJI = channels;
        C4RC c4rc = this.LJLJJLL;
        if (c4rc != null) {
            c4rc.setData(channels);
        }
        if (((ArrayList) this.LJLJI).size() > 0) {
            LJIIJJI();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C113914dX(android.content.Context r7, android.util.AttributeSet r8, java.lang.String r9, int r10) {
        /*
            r6 = this;
            r0 = r10 & 2
            if (r0 == 0) goto L5
            r8 = 0
        L5:
            r0 = r10 & 4
            if (r0 == 0) goto Lb
            java.lang.String r9 = "share_panel"
        Lb:
            java.lang.String r0 = "ctx"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "enterMethod"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            r6.<init>(r7, r8)
            android.content.Context r0 = r6.getContext()
            X.0zU r1 = X.C119364mK.LIZ(r0)
            r0 = 2130968739(0x7f0400a3, float:1.754614E38)
            int r0 = X.C1JI.LJIILL(r0, r1)
            r6.LJLIL = r0
            X.4de r0 = X.C113984de.LIZIZ
            r0.getClass()
            r5 = 1
            r3 = 0
            com.bytedance.ies.abmock.SettingsManager r4 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "share_preview_icon_forbid_list"
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            java.lang.String[] r2 = X.C113984de.LIZ     // Catch: java.lang.Throwable -> L48
            java.lang.Object r1 = r4.LJIIIIZZ(r1, r0, r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L4a
            int r0 = r1.length     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L46
            goto L4a
        L46:
            r2 = r1
            goto L4a
        L48:
            java.lang.String[] r2 = X.C113984de.LIZ
        L4a:
            r6.LJLILLLLZI = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.LJLJI = r0
            android.content.Context r0 = r6.getContext()
            X.0zU r2 = X.C119364mK.LIZ(r0)
            int[] r1 = new int[r5]
            r0 = 2130970272(0x7f0406a0, float:1.754925E38)
            r1[r3] = r0
            android.content.res.TypedArray r1 = r2.obtainStyledAttributes(r8, r1)
            java.lang.String r0 = "contextWrapper.obtainSty…tyleable.ShareChannelBar)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 2130968737(0x7f0400a1, float:1.7546136E38)
            int r0 = X.C1JI.LJIILL(r0, r2)
            int r0 = r1.getColor(r3, r0)
            r6.LJLIL = r0
            r1.recycle()
            X.OQg r0 = X.C61878OQg.INSTANCE
            r6.LJLJJI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113914dX.<init>(android.content.Context, android.util.AttributeSet, java.lang.String, int):void");
    }
}
