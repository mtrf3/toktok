package X;

import Y.ACListenerS34S0100000_14;
import Y.IDAListenerS146S0200000_14;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.scene.navigation.NavigationScene;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;
import o3.IDaS471S0100000_14;
import o3.h0;

/* renamed from: X.Vzc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81556Vzc extends WMH implements G7O {
    public static final /* synthetic */ int LLIIIJ = 0;
    public WM7 LJLJI;
    public InterfaceC65784Pro<? extends WM7> LJLJJI;
    public boolean LJLJJL;
    public boolean LJLL;
    public int LJLLL;
    public C81478VyM LJLLLL;
    public ASI LJLLLLLL;
    public InterfaceC65784Pro<C76800UCe> LJLZ;
    public InterfaceC65784Pro<C76800UCe> LJZ;
    public InterfaceC88473Ynt<? super Float, ? super Float, ? super Integer, C76800UCe> LJZI;
    public boolean LJZL;
    public boolean LL;
    public Integer LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public int LLIIII;
    public int LJLIL = -1;
    public String LJLILLLLZI = "";
    public EnumC81480VyO LJLJJLL = EnumC81480VyO.AUTO_SIZE;
    public int LJLJL = -1;
    public final int LJLJLJ = -1;
    public final int LJLJLLL = -1;
    public final boolean LJLLI = true;
    public final boolean LJLLILLLL = true;
    public final boolean LJLLJ = true;
    public final C5H3 LLD = C221108m2.LIZ(EnumC221088m0.NONE, C44415Hbv.LJLIL);
    public final C81557Vzd LLIFFJFJJ = new C81557Vzd(this);
    public final C81555Vzb LLII = new C81555Vzb(this);
    public long LLIIIILZ = -1;

    public final void LLJJI() {
        WMH wmh;
        this.LLFII = false;
        if (this.LJLJJL) {
            WM7 wm7 = this.mParentScene;
            if ((wm7 instanceof WMH) && (wmh = (WMH) wm7) != null) {
                wmh.hide(this);
            }
        } else {
            NavigationScene LJIIJJI = C78923UyF.LJIIJJI(this);
            if (LJIIJJI != null) {
                LJIIJJI.remove(this);
            }
        }
        this.LLFFF = false;
    }

    public final void LLJJIII() {
        if (this.LLI || this.mParentScene == null || !isVisible()) {
            return;
        }
        this.LLFZ = false;
        this.LLI = true;
        C81478VyM c81478VyM = this.LJLLLL;
        if (c81478VyM != null) {
            c81478VyM.clearAnimation();
            BottomSheetBehavior<?> behavior = c81478VyM.getBehavior();
            if (behavior != null) {
                behavior.setState(5);
            }
        }
        LLJJI();
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        NavigationScene LJIIJJI = C78923UyF.LJIIJJI(this);
        if (LJIIJJI != null) {
            LJIIJJI.LLJJL(this.LLII);
        }
        WM7 findSceneByTag = findSceneByTag("sheet_content_scene");
        if (findSceneByTag != null) {
            remove(findSceneByTag);
        }
        this.LJLJI = null;
    }

    @Override // X.WM7
    public final void onStart() {
        BottomSheetBehavior<?> behavior;
        ActivityC45651qj activityC45651qj;
        super.onStart();
        Integer num = null;
        if (this.LJZL && (activityC45651qj = (ActivityC45651qj) this.mActivity) != null) {
            Context sceneContext = getSceneContext();
            if (sceneContext != null) {
                num = Integer.valueOf(LLJILJIL(sceneContext));
            }
            C61713OJx LIZJ = C61712OJw.LIZJ(activityC45651qj);
            LIZJ.LIZIZ.LJIIL();
            if (num != null) {
                LIZJ.LJFF(num.intValue());
            }
            LIZJ.LIZ(true);
            LIZJ.LIZJ();
        }
        C81478VyM c81478VyM = this.LJLLLL;
        if (c81478VyM != null && (behavior = c81478VyM.getBehavior()) != null && behavior.getState() != 5) {
            behavior.setState(4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLJILJIL(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.Integer r1 = r9.LLF
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L68
            int r0 = r1.intValue()
            if (r0 == 0) goto L68
            android.view.ContextThemeWrapper r7 = new android.view.ContextThemeWrapper
            int r8 = r1.intValue()
            r1 = 1083179008(0x40900000, float:4.5)
            r6 = -1
            int r0 = X.C07290Qj.LJIIIIZZ(r1, r6, r8)
            r5 = 1077936128(0x40400000, float:3.0)
            int r2 = X.C07290Qj.LJIIIIZZ(r5, r6, r8)
            if (r0 == r6) goto L53
            if (r2 == r6) goto L53
        L23:
            r0 = 2130971832(0x7f040cb8, float:1.7552413E38)
        L26:
            java.lang.Integer r0 = X.C79045V0n.LJ(r0, r10)
            if (r0 == 0) goto L51
            int r0 = r0.intValue()
        L30:
            r7.<init>(r10, r0)
            r10 = r7
        L34:
            r0 = 22
            int[] r2 = new int[r0]
            r2 = {x0076: FILL_ARRAY_DATA , data: [2130969124, 2130969125, 2130969126, 2130969127, 2130969128, 2130969129, 2130969130, 2130969131, 2130969132, 2130969133, 2130969134, 2130969135, 2130969136, 2130969137, 2130969138, 2130969139, 2130969140, 2130969141, 2130969142, 2130969143, 2130969144, 2130969145} // fill-array
            r1 = 2130968898(0x7f040142, float:1.7546463E38)
            r0 = 0
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r0, r2, r1, r4)
            java.lang.String r0 = "ctx.obtainStyledAttribut….R.attr.TuxSheetStyle, 0)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 3
            int r0 = r1.getColor(r0, r3)
            r1.recycle()
            return r0
        L51:
            r0 = 0
            goto L30
        L53:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r1 = X.C07290Qj.LJIIIIZZ(r1, r0, r8)
            int r0 = X.C07290Qj.LJIIIIZZ(r5, r0, r8)
            if (r1 == r6) goto L65
            if (r0 == r6) goto L65
        L61:
            r0 = 2130971834(0x7f040cba, float:1.7552418E38)
            goto L26
        L65:
            if (r2 == r6) goto L61
            goto L23
        L68:
            int r0 = r9.LJLLL
            if (r0 == 0) goto L34
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            int r0 = r9.LJLLL
            r1.<init>(r10, r0)
            r10 = r1
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81556Vzc.LLJILJIL(android.content.Context):int");
    }

    public final void LLJJ(boolean z) {
        BottomSheetBehavior<?> behavior;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        C81478VyM c81478VyM = this.LJLLLL;
        if (c81478VyM != null && (behavior = c81478VyM.getBehavior()) != null) {
            int state = behavior.getState();
            if (this.LLI || state == 5 || state > 4) {
                return;
            }
            this.LLFZ = false;
            this.LLI = true;
            C81478VyM c81478VyM2 = this.LJLLLL;
            if (c81478VyM2 != null) {
                c81478VyM2.clearAnimation();
                BottomSheetBehavior<?> behavior2 = c81478VyM2.getBehavior();
                if (behavior2 != null) {
                    behavior2.setState(5);
                }
            }
            if (z || (interfaceC65784Pro = this.LJLZ) == null) {
                return;
            }
            interfaceC65784Pro.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLJJIJI(WMH hostScene) {
        Activity activity;
        BottomSheetBehavior<?> behavior;
        o.LJIIIZ(hostScene, "hostScene");
        if (hostScene.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || (activity = hostScene.mActivity) == null || activity.isFinishing() || activity.isDestroyed() || this.LLFFF) {
            return;
        }
        this.LLI = false;
        this.LLFII = true;
        if (this.LJLJJL) {
            if (this.mParentScene != null) {
                hostScene.show(this);
                C81478VyM c81478VyM = this.LJLLLL;
                if (c81478VyM != null) {
                    LLJJIJIIJIL(c81478VyM);
                }
                C81478VyM c81478VyM2 = this.LJLLLL;
                if (c81478VyM2 != null && (behavior = c81478VyM2.getBehavior()) != null) {
                    behavior.setState(4);
                }
            } else {
                hostScene.add(this.LJLIL, this, this.LJLILLLLZI);
            }
        } else {
            if (this.mParentScene != null) {
                return;
            }
            C42663Gol c42663Gol = new C42663Gol();
            c42663Gol.LIZJ = new C82161WMj();
            C42664Gom LIZ = c42663Gol.LIZ();
            if (hostScene instanceof NavigationScene) {
                ((NavigationScene) hostScene).LLJJJJ(this, LIZ);
            } else {
                NavigationScene LJIIJJI = C78923UyF.LJIIJJI(hostScene);
                if (LJIIJJI != null) {
                    LJIIJJI.LLJJJJ(this, LIZ);
                }
            }
        }
        this.LLFFF = true;
    }

    public final void LLJJIJIIJIL(C81478VyM c81478VyM) {
        int i;
        Activity activity = this.mActivity;
        if (activity == null) {
            return;
        }
        int i2 = C81482VyQ.LIZ[this.LJLJJLL.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 == 5) {
                        i = LLJILJILJ(this.LJLJLJ, activity);
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    i = R.anim.hq;
                }
            } else {
                i = LLJILJILJ(this.LJLJL, activity);
            }
        } else {
            i = R.anim.hu;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(activity, i);
        loadAnimation.setAnimationListener(new IDAListenerS146S0200000_14(loadAnimation, this, 3));
        loadAnimation.setInterpolator(new InterpolatorC81558Vze(this, loadAnimation.getInterpolator()));
        c81478VyM.startAnimation(loadAnimation);
    }

    public final void LLJJIJIL(boolean z) {
        if (z) {
            if (!this.LLFF) {
                C81478VyM c81478VyM = this.LJLLLL;
                if (c81478VyM != null) {
                    c81478VyM.LIZIZ(true);
                }
                this.LLFF = true;
                return;
            }
            return;
        }
        if (!this.LLFF) {
            return;
        }
        C81478VyM c81478VyM2 = this.LJLLLL;
        if (c81478VyM2 != null) {
            c81478VyM2.LIZIZ(false);
        }
        this.LLFF = false;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C78923UyF.LJIILLIIL(this).LLJILJILJ(this, this.LLII);
    }

    public static int LLJILJILJ(int i, Context context) {
        float LJJJJJL = i / C63081OpJ.LJJJJJL(context);
        if (LJJJJJL < 0.33333334f) {
            return R.anim.hs;
        }
        if (LJJJJJL < 0.6666667f) {
            return R.anim.hu;
        }
        return R.anim.hq;
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        WM7 wm7;
        WMH wmh;
        C235119Kp c235119Kp;
        ViewGroup.LayoutParams layoutParams;
        InterfaceC219588ja interfaceC219588ja;
        WMH wmh2;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        Context context = container.getContext();
        o.LJIIIIZZ(context, "container.context");
        int i = this.LJLLL;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.zd, typedValue, true)) {
                i = typedValue.resourceId;
            } else {
                i = R.style.py;
            }
        }
        setTheme(i);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cry, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) LLLLIILL;
        C81478VyM c81478VyM = (C81478VyM) viewGroup.findViewById(R.id.jvv);
        c81478VyM.setFixedHeightPx(this.LJLJL);
        c81478VyM.setDynamicPeekHeightPx(this.LJLJLJ);
        c81478VyM.setDynamicMaxHeightPx(this.LJLJLLL);
        c81478VyM.setVariant(this.LJLJJLL);
        c81478VyM.setHideable(this.LJLLILLLL);
        c81478VyM.setDismissFunc(new AqS164S0100000_14(this, 265));
        c81478VyM.setBottomSheetCallback(this.LLIFFJFJJ);
        Integer num = this.LLF;
        if (num != null) {
            c81478VyM.setBottomSheetBackgroundColor$tools_creative_sheet_scene_release(num);
        } else {
            Context context2 = container.getContext();
            o.LJIIIIZZ(context2, "container.context");
            c81478VyM.setBottomSheetBackgroundColor$tools_creative_sheet_scene_release(Integer.valueOf(LLJILJIL(context2)));
        }
        h0.LJIJI(c81478VyM, new IDaS471S0100000_14(this, 2));
        LLJJIJIIJIL(c81478VyM);
        this.LJLLLL = c81478VyM;
        this.LLFF = false;
        LLJJIJIL(true);
        View findViewById = viewGroup.findViewById(R.id.jvy);
        if (this.LJLL) {
            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            layoutParams2.height = -1;
            findViewById.setLayoutParams(layoutParams2);
        }
        C53860LBw c53860LBw = null;
        if (this.LJLJJL) {
            WM7 wm72 = this.LJLJI;
            if (wm72 != null) {
                WM7 wm73 = wm72.mParentScene;
                if ((wm73 instanceof WMH) && (wmh2 = (WMH) wm73) != null) {
                    wmh2.remove(wm72);
                }
                add(R.id.jvy, wm72, "sheet_content_scene");
            }
        } else {
            InterfaceC65784Pro<? extends WM7> interfaceC65784Pro = this.LJLJJI;
            if (interfaceC65784Pro != null && (wm7 = interfaceC65784Pro.invoke()) != null) {
                WM7 wm74 = wm7.mParentScene;
                if ((wm74 instanceof WMH) && (wmh = (WMH) wm74) != null) {
                    wmh.remove(wm7);
                }
                add(R.id.jvy, wm7, "sheet_content_scene");
            } else {
                wm7 = null;
            }
            this.LJLJI = wm7;
        }
        this.LJLLLLLL = (ASI) viewGroup.findViewById(R.id.jw8);
        InterfaceC36571c5 interfaceC36571c5 = this.LJLJI;
        if (!(interfaceC36571c5 instanceof InterfaceC219588ja) || (interfaceC219588ja = (InterfaceC219588ja) interfaceC36571c5) == null || (c235119Kp = interfaceC219588ja.createNavActions()) == null) {
            c235119Kp = null;
        }
        ASI asi = this.LJLLLLLL;
        if (asi != null) {
            asi.setNavActions(c235119Kp);
        }
        ASI asi2 = this.LJLLLLLL;
        if (asi2 != null) {
            asi2.setNavBarBackgroundColor(0);
        }
        if (this.LJLJJLL == EnumC81480VyO.DYNAMIC && c235119Kp != null) {
            ASI asi3 = this.LJLLLLLL;
            if (asi3 != null) {
                layoutParams = asi3.getLayoutParams();
            } else {
                layoutParams = null;
            }
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams3.topMargin = C7MY.LIZIZ(14);
            ASI asi4 = this.LJLLLLLL;
            if (asi4 != null) {
                asi4.setLayoutParams(layoutParams3);
            }
            C81478VyM c81478VyM2 = this.LJLLLL;
            if (c81478VyM2 != null) {
                c53860LBw = c81478VyM2.getHandleView();
            }
            ASI asi5 = this.LJLLLLLL;
            if (asi5 != null) {
                asi5.LJLIL.LJIJJ();
                asi5.LJLILLLLZI.LJIJJ();
            }
            ASI asi6 = this.LJLLLLLL;
            if (asi6 != null) {
                int currentNavBarBackgroundColor = asi6.getCurrentNavBarBackgroundColor();
                if (c53860LBw != null) {
                    c53860LBw.setBackgroundColor(currentNavBarBackgroundColor);
                }
            }
            ASI asi7 = this.LJLLLLLL;
            if (asi7 != null) {
                asi7.getCurrentNavBarBackgroundColor();
            }
        }
        if (this.LL) {
            ColorDrawable colorDrawable = (ColorDrawable) this.LLD.getValue();
            colorDrawable.setColor(C44384HbQ.LLJJ(0.5f, colorDrawable.getColor()));
            viewGroup.setBackground(colorDrawable);
        }
        C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 68), viewGroup.findViewById(R.id.liz));
        viewGroup.setOnTouchListener(ViewOnTouchListenerC81559Vzf.LJLIL);
        return viewGroup;
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
