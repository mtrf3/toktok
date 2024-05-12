package com.ss.android.ugc.aweme.search.detail.shoot.ui;

import X.ActivityC45651qj;
import X.AnonymousClass843;
import X.C04270Et;
import X.C16880lQ;
import X.C17N;
import X.C201667vm;
import X.C212428Vi;
import X.C214298b3;
import X.C220858ld;
import X.C221108m2;
import X.C224868s6;
import X.C2321599f;
import X.C28289B8j;
import X.C2K0;
import X.C2KK;
import X.C32151Nz;
import X.C50420Jqa;
import X.C55096Ljo;
import X.C56509MFt;
import X.C57092Lx;
import X.C61447O9r;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C79043V0l;
import X.C7MY;
import X.C81156VtA;
import X.C9BD;
import X.InterfaceC55102Lju;
import X.KMA;
import X.MEW;
import X.O6R;
import X.QD3;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.search.detail.shoot.core.IDetailBottomMusicShootAbility;
import com.ss.android.ugc.aweme.search.detail.shoot.viewmodel.CreationIntentionMusicShootVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes10.dex */
public final class SearchDetailBottomMusicShootComponent extends ShootButtonBottomComponent implements IDetailBottomMusicShootAbility, InterfaceC55102Lju {
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 779));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 781));
    public final C214298b3 LJLJLJ;
    public View LJLJLLL;
    public TextView LJLL;
    public C81156VtA LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public RelativeLayout LJLLLLLL;
    public View LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public final AqS159S0100000_9 LJZL;

    public SearchDetailBottomMusicShootComponent() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CreationIntentionMusicShootVM.class);
        this.LJLJLJ = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 780), C2321599f.INSTANCE, null);
        this.LJZL = new AqS159S0100000_9(this, 618);
    }

    public final void K3() {
        L3(true, this.LJLJLLL);
        L3(false, this.LJLJJI, this.LJLLJ, this.LJLLL);
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1191199952) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final int x3() {
        return R.string.tie;
    }

    public final void F3() {
        if (this.LJZ && !C220858ld.LJIIIIZZ(getCurrentAweme())) {
            C17N.LJJLIIIJJI(this.LJLLLLLL);
            return;
        }
        RelativeLayout relativeLayout = this.LJLLLLLL;
        if (relativeLayout == null || relativeLayout.getVisibility() == 4) {
            return;
        }
        relativeLayout.setVisibility(4);
    }

    public final void H3() {
        if (this.LJZI) {
            return;
        }
        CreationIntentionMusicShootVM I3 = I3();
        Context context = getContext();
        String LIZLLL = C56509MFt.LIZLLL(getPanelContext());
        Aweme currentAweme = getCurrentAweme();
        I3.getClass();
        if (currentAweme != null && currentAweme.getCcTemplateInfo() != null) {
            C224868s6.LIZ(context, currentAweme, LIZLLL, currentAweme.getAid());
        }
    }

    public final CreationIntentionMusicShootVM I3() {
        return (CreationIntentionMusicShootVM) this.LJLJLJ.getValue();
    }

    public final Aweme getCurrentAweme() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLJJLL.getValue();
        if (iFeedPanelPlatformAbility != null) {
            return iFeedPanelPlatformAbility.getCurrentAweme();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.detail.shoot.core.IDetailBottomMusicShootAbility
    public final void h2() {
        View view = this.LJLZ;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            int i = C61447O9r.LJIILJJIL;
            C57092Lx.LIZ.getClass();
            int LIZ = C61447O9r.LIZ();
            if (i == 0) {
                i = LIZ;
            }
            layoutParams2.height = i;
            view.setLayoutParams(layoutParams2);
        }
        h1();
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent, com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
        C62814Ol0.LJJIJL(C55096Ljo.LJIIZILJ(this), IDetailBottomProtocol.class, this);
        this.LJLIL = true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        ((ArrayList) I3().LJLIL).remove(this.LJZL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
    
        if (r4 != null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    @Override // X.C8W0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onParentViewCreated() {
        /*
            r6 = this;
            super.onParentViewCreated()
            X.1qj r0 = X.C212428Vi.LIZ(r6)
            if (r0 != 0) goto L2c
        L9:
            r6.F3()
            X.Ol8 r0 = r6.LJLJL
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility r1 = (com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility) r1
            if (r1 == 0) goto L1e
            X.MER r0 = new X.MER
            r0.<init>(r6)
            r1.De0(r0)
        L1e:
            com.ss.android.ugc.aweme.search.detail.shoot.viewmodel.CreationIntentionMusicShootVM r0 = r6.I3()
            java.util.List<X.Pro<X.UCe>> r1 = r0.LJLIL
            kotlin.jvm.internal.AqS159S0100000_9 r0 = r6.LJZL
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r0)
            return
        L2c:
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L33
            goto L9
        L33:
            android.widget.RelativeLayout r0 = r6.LJLLLLLL
            if (r0 == 0) goto L38
            goto L9
        L38:
            androidx.fragment.app.Fragment r5 = X.C212428Vi.LIZLLL(r6)
            if (r5 != 0) goto L3f
            goto L9
        L3f:
            android.view.View r1 = r5.getView()
            r3 = 0
            if (r1 == 0) goto L86
            r0 = 2131363351(0x7f0a0617, float:1.8346508E38)
            android.view.View r2 = r1.findViewById(r0)
        L4d:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L83
            if (r2 == 0) goto L84
            android.view.ViewParent r4 = r2.getParent()
        L57:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L5f
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 != 0) goto L88
        L5f:
            android.view.View r1 = r5.getView()
            if (r1 == 0) goto L81
            r0 = 2131375019(0x7f0a33ab, float:1.8370174E38)
            android.view.View r4 = r1.findViewById(r0)
        L6c:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L74
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 != 0) goto L88
        L74:
            android.view.View r4 = r5.getView()
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L9
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 != 0) goto L88
            goto L9
        L81:
            r4 = r3
            goto L6c
        L83:
            r2 = r3
        L84:
            r4 = r3
            goto L57
        L86:
            r2 = r3
            goto L4d
        L88:
            android.widget.RelativeLayout r1 = new android.widget.RelativeLayout
            android.content.Context r0 = r6.getContext()
            r1.<init>(r0)
            r6.LJLLLLLL = r1
            android.view.View r1 = r6.K2(r1)
            r6.LJLZ = r1
            if (r1 != 0) goto L9d
            goto L9
        L9d:
            X.MES r0 = X.MES.LJLIL
            X.C16880lQ.LJIIJ(r0, r1)
            int r0 = r4.indexOfChild(r2)
            android.widget.RelativeLayout r3 = r6.LJLLLLLL
            if (r0 >= 0) goto Lcd
            int r2 = r4.getChildCount()
        Lae:
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r4.addView(r3, r2, r0)
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r0 = -2
            r2.<init>(r1, r0)
            r0 = 12
            r2.addRule(r0)
            android.widget.RelativeLayout r1 = r6.LJLLLLLL
            if (r1 == 0) goto L9
            android.view.View r0 = r6.LJLZ
            r1.addView(r0, r2)
            goto L9
        Lcd:
            int r2 = r0 + 1
            goto Lae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.detail.shoot.ui.SearchDetailBottomMusicShootComponent.onParentViewCreated():void");
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        F3();
    }

    @Override // com.ss.android.ugc.aweme.search.detail.shoot.core.IDetailBottomMusicShootAbility
    public final void n1() {
        F3();
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final View C3(ViewGroup viewGroup) {
        Drawable LIZIZ;
        ViewGroup.LayoutParams layoutParams;
        View LIZ = C28289B8j.LIZ(viewGroup, R.layout.chx, viewGroup, false);
        View findViewById = LIZ.findViewById(R.id.gu9);
        this.LJLLJ = findViewById;
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 164), findViewById);
        }
        View findViewById2 = LIZ.findViewById(R.id.gt3);
        if (findViewById2 != null) {
            C17N.LJJLIIIJJI(findViewById2);
        }
        C81156VtA c81156VtA = (C81156VtA) LIZ.findViewById(R.id.d81);
        this.LJLLI = c81156VtA;
        if (c81156VtA != null) {
            c81156VtA.setIsTextInCenterVertical(true);
        }
        this.LJLLILLLL = LIZ.findViewById(R.id.gea);
        View findViewById3 = LIZ.findViewById(R.id.ap4);
        this.LJLLLL = findViewById3;
        if (findViewById3 != null && (layoutParams = findViewById3.getLayoutParams()) != null) {
            layoutParams.height = C7MY.LIZIZ(40);
        }
        View view = this.LJLLLL;
        if (view != null) {
            if (KMA.LJLL) {
                LIZIZ = C04270Et.LIZIZ(LIZ.getContext(), R.drawable.c1l);
            } else {
                LIZIZ = C04270Et.LIZIZ(LIZ.getContext(), R.drawable.an1);
            }
            view.setBackground(LIZIZ);
        }
        this.LJLLL = LIZ.findViewById(R.id.ge_);
        C81156VtA c81156VtA2 = (C81156VtA) LIZ.findViewById(R.id.gef);
        if (c81156VtA2 != null) {
            E3(c81156VtA2, c81156VtA2.getResources().getString(R.string.ciu));
        }
        View view2 = this.LJLLL;
        if (view2 != null) {
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 65), view2);
        }
        View view3 = this.LJLLL;
        if (view3 != null) {
            C79043V0l.LJIIJ(view3);
        }
        View findViewById4 = LIZ.findViewById(R.id.ap7);
        this.LJLJLLL = findViewById4;
        if (findViewById4 != null) {
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 66), findViewById4);
        }
        this.LJLL = (TextView) LIZ.findViewById(R.id.b80);
        TuxIconView tuxIconView = (TuxIconView) LIZ.findViewById(R.id.irc);
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams2 = tuxIconView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = C7MY.LIZIZ(20);
                layoutParams2.height = C7MY.LIZIZ(20);
            }
            tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
            tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        }
        return LIZ;
    }

    @QD3
    public void onCancelVideoCoverMaskEvent(C201667vm c201667vm) {
        F3();
    }

    @QD3
    public final void onVideoEvent(C50420Jqa c50420Jqa) {
        ActivityC45651qj LIZ;
        C2KK c2kk;
        Boolean bool;
        if (c50420Jqa != null && (LIZ = C212428Vi.LIZ(this)) != null && c50420Jqa.LJLZ == System.identityHashCode(LIZ) && AnonymousClass843.LIZ()) {
            int i = c50420Jqa.LJLIL;
            float f = 0.0f;
            if (i != 72) {
                if (i != 73) {
                    return;
                }
                Object obj = c50420Jqa.LJLILLLLZI;
                if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                    boolean booleanValue = bool.booleanValue();
                    RelativeLayout relativeLayout = this.LJLLLLLL;
                    if (relativeLayout != null) {
                        if (booleanValue) {
                            f = 1.0f;
                        }
                        relativeLayout.setAlpha(f);
                    }
                    this.LJZI = !booleanValue;
                    return;
                }
                return;
            }
            Object obj2 = c50420Jqa.LJLILLLLZI;
            if (!(obj2 instanceof C2KK) || (c2kk = (C2KK) obj2) == null) {
                return;
            }
            RelativeLayout relativeLayout2 = this.LJLLLLLL;
            if (relativeLayout2 != null) {
                if (!c2kk.LJLIL) {
                    f = 1.0f;
                }
                relativeLayout2.setAlpha(f);
            }
            this.LJZI = c2kk.LJLIL;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final void v3(View view) {
        int i;
        Bundle arguments;
        if (this.LJZI) {
            return;
        }
        Aweme currentAweme = getCurrentAweme();
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null && (arguments = fragment.getArguments()) != null) {
            i = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
        } else {
            i = 0;
        }
        CreationIntentionMusicShootVM I3 = I3();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        String LIZLLL2 = C56509MFt.LIZLLL(getPanelContext());
        I3.getClass();
        if (currentAweme != null && currentAweme.getAwemeType() == 65) {
            return;
        }
        if (LIZ != null && MSAdaptionService.LJIIL().LJI(LIZ)) {
            C16880lQ.LLZILL(Toast.makeText(LIZ, LIZ.getString(R.string.f1i), 0));
        } else {
            MEW.LIZ(LIZ, LIZLLL, currentAweme, LIZLLL2, i);
        }
    }

    public static void L3(boolean z, View... viewArr) {
        for (View view : viewArr) {
            if (z) {
                if (view != null) {
                    C17N.LJJLIIIJJI(view);
                }
            } else if (view != null) {
                C79043V0l.LJIIJ(view);
            }
        }
    }
}
