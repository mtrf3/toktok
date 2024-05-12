package X;

import Y.AObserverS69S0100000_1;
import Y.AObserverS70S0100000_2;
import Y.AObserverS72S0100000_4;
import Y.AObserverS73S0100000_5;
import Y.IDCListenerS298S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Btr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30239Btr {
    public final C30252Bu4 LIZ;
    public final ViewGroup LIZIZ;
    public final List<EnumC30241Btt> LIZJ;
    public final InterfaceC30266BuI LIZLLL;
    public final java.util.Map<EnumC30241Btt, InterfaceC30264BuG> LJ;
    public final java.util.Map<EnumC30241Btt, InterfaceC30269BuL> LJFF;
    public final LinkedList<EnumC30241Btt> LJI;

    public final void LIZIZ() {
        Iterator<EnumC30241Btt> it = this.LJI.iterator();
        while (it.hasNext()) {
            EnumC30241Btt next = it.next();
            InterfaceC30269BuL interfaceC30269BuL = (InterfaceC30269BuL) ((EnumMap) this.LJFF).get(next);
            if (interfaceC30269BuL != null) {
                InterfaceC30264BuG interfaceC30264BuG = this.LJ.get(next);
                if (interfaceC30264BuG != null) {
                    interfaceC30264BuG.LIZIZ(this.LIZ, interfaceC30269BuL);
                }
                C16880lQ.LJLLL(interfaceC30269BuL.LIZLLL(), this.LIZIZ);
                ((EnumMap) this.LJFF).remove(next);
            }
        }
        this.LJI.clear();
    }

    public final void LIZJ(EnumC30241Btt button) {
        Fragment fragment;
        o.LJIIIZ(button, "button");
        InterfaceC30269BuL interfaceC30269BuL = (InterfaceC30269BuL) ((EnumMap) this.LJFF).get(button);
        if (interfaceC30269BuL == null) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.LIZ.LIZIZ;
        if ((lifecycleOwner instanceof Fragment) && (fragment = (Fragment) lifecycleOwner) != null) {
            C30102Bre.LIZ(button, fragment).LJLJL.setValue(new C30268BuK(false, true));
        }
        InterfaceC30264BuG interfaceC30264BuG = this.LJ.get(button);
        if (interfaceC30264BuG != null) {
            interfaceC30264BuG.LIZIZ(this.LIZ, interfaceC30269BuL);
        }
        C16880lQ.LJLLL(interfaceC30269BuL.LIZLLL(), this.LIZIZ);
        ((EnumMap) this.LJFF).remove(button);
        this.LJI.remove(button);
    }

    public final void LIZ(EnumC30241Btt button, InterfaceC30264BuG behavior, boolean z) {
        int layoutId;
        View LJIIIZ;
        LiveIconView liveIconView;
        boolean z2;
        int LIZ;
        int i;
        C30233Btl iconConfig;
        o.LJIIIZ(button, "button");
        o.LJIIIZ(behavior, "behavior");
        if (!this.LIZJ.contains(button)) {
            return;
        }
        if (this.LJI.contains(button) && o.LJ(this.LJ.get(button), behavior)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Load Toolbar Button multi times = ");
            LIZ2.append(button.name());
            C0NB.LIZIZ("TOOLBAR_V2", X1D.LIZIZ(LIZ2));
            return;
        }
        LIZJ(button);
        String button2 = button.toString();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        o.LJIIIZ(button2, "button");
        C30211BtP.LIZIZ.put(button2, Long.valueOf(elapsedRealtime));
        this.LJI.add(button);
        EnumC30260BuC layoutStyle = this.LIZ.LIZLLL.getLayoutStyle();
        Integer layoutID = button.layoutID(this.LIZ.LIZLLL);
        if (layoutID != null) {
            layoutId = layoutID.intValue();
        } else {
            layoutId = layoutStyle.getLayoutId();
        }
        if (LiveLayoutPreloadSetting.INSTANCE.enable() && button.isLiveDesignLayout(this.LIZ.LIZLLL)) {
            C30249Bu1 c30249Bu1 = C30249Bu1.LIZ;
            C30252Bu4 c30252Bu4 = this.LIZ;
            Context context = c30252Bu4.LIZ;
            DataChannel dataChannel = c30252Bu4.LIZJ;
            c30249Bu1.getClass();
            LJIIIZ = C30249Bu1.LIZ(context, dataChannel, layoutId);
        } else {
            LJIIIZ = C20910rv.LJIIIZ(layoutId);
        }
        if (LJIIIZ == null) {
            LJIIIZ = C29306Beo.LJIIIIZZ(layoutId, this.LIZIZ, false);
        }
        View findViewById = LJIIIZ.findViewById(R.id.ld4);
        if (findViewById instanceof LiveIconView) {
            liveIconView = (LiveIconView) findViewById;
        } else {
            liveIconView = null;
        }
        int i2 = -1;
        if (liveIconView != null && (iconConfig = button.iconConfig(this.LIZ.LIZLLL)) != null) {
            liveIconView.setIconHeightRatio(iconConfig.LJFF);
            liveIconView.setIconWidthRatio(iconConfig.LJ);
            int i3 = iconConfig.LIZ;
            if (i3 != -1) {
                liveIconView.setIconTint(i3);
            } else {
                int i4 = iconConfig.LJI;
                if (i4 != -1) {
                    liveIconView.setIconTint(C259910h.LIZIZ(i4, this.LIZ.LIZ));
                }
            }
            Integer num = iconConfig.LIZIZ;
            if (num != null) {
                liveIconView.setIconBackgroundAppearance(num.intValue());
            }
            Integer num2 = iconConfig.LIZJ;
            if (num2 != null) {
                liveIconView.setIconBackground(num2.intValue());
            } else {
                Integer num3 = iconConfig.LIZLLL;
                if (num3 != null) {
                    liveIconView.setIconBackgroundColor(num3.intValue());
                }
            }
            C16310kV.LJIIIZ(liveIconView, C15380j0.LJIIZILJ() ? 1 : 0);
        }
        TBViewModel viewModel = button.getViewModel(this.LIZ.LIZJ);
        if (viewModel != null) {
            Context context2 = this.LIZ.LIZ;
            if (context2 == null) {
                context2 = LJIIIZ.getContext();
            }
            final FrameLayout frameLayout = new FrameLayout(context2);
            EnumC30260BuC style = this.LIZ.LIZLLL.getLayoutStyle();
            o.LJIIIZ(style, "style");
            float f = style.getLayoutParams().LIZ;
            if (f == -1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                LIZ = -2;
            } else if (f == -2.0f) {
                LIZ = -1;
            } else {
                LIZ = C15380j0.LIZ(style.getLayoutParams().LIZ);
            }
            float f2 = style.getLayoutParams().LIZIZ;
            if (f2 == -1.0f) {
                i2 = -2;
            } else if (f2 != -2.0f) {
                i2 = C15380j0.LIZ(style.getLayoutParams().LIZIZ);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LIZ, i2);
            layoutParams.gravity = 17;
            frameLayout.addView(LJIIIZ, layoutParams);
            C30252Bu4 toolbarContext = this.LIZ;
            o.LJIIIZ(toolbarContext, "toolbarContext");
            LifecycleOwner lifecycleOwner = toolbarContext.LIZIZ;
            viewModel.LJLJL.observe(lifecycleOwner, new Observer() { // from class: X.95Z
                public final /* synthetic */ boolean LJLILLLLZI = false;

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    int i5;
                    if (((C30268BuK) obj).LIZ) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    if (frameLayout.getVisibility() != i5) {
                        frameLayout.setVisibility(i5);
                        if (this.LJLILLLLZI) {
                            if (i5 == 0) {
                                View view = frameLayout;
                                o.LJIIIZ(view, "view");
                                view.setAlpha(0.0f);
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", 36.0f, 0.0f);
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(ofFloat, ofFloat2);
                                animatorSet.setDuration(500L);
                                animatorSet.start();
                                return;
                            }
                            View view2 = frameLayout;
                            o.LJIIIZ(view2, "view");
                            view2.setAlpha(1.0f);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "translationX", 0.0f, 36.0f);
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, "alpha", 1.0f, 0.0f);
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.playTogether(ofFloat3, ofFloat4);
                            animatorSet2.setDuration(500L);
                            animatorSet2.start();
                        }
                    }
                }
            });
            viewModel.LJLJLLL.observe(lifecycleOwner, new AObserverS69S0100000_1(frameLayout, 126));
            viewModel.LJLJJLL.observe(lifecycleOwner, new AObserverS69S0100000_1(frameLayout, 127));
            viewModel.LJLJLJ.observe(lifecycleOwner, new AObserverS70S0100000_2(frameLayout, 281));
            if (button.isLiveDesignLayout(toolbarContext.LIZLLL)) {
                LiveIconView liveIconView2 = (LiveIconView) frameLayout.findViewById(R.id.ld4);
                if (liveIconView2 != null) {
                    viewModel.LJLIL.observe(toolbarContext.LIZIZ, new AObserverS73S0100000_5(liveIconView2, 53));
                }
                C47121t6 c47121t6 = (C47121t6) frameLayout.findViewById(R.id.ldm);
                if (c47121t6 != null) {
                    if (toolbarContext.LIZLLL.getStyleDesc().LIZ) {
                        c47121t6.setVisibility(0);
                        viewModel.LJLILLLLZI.observe(toolbarContext.LIZIZ, new AObserverS72S0100000_4(c47121t6, 42));
                    } else {
                        c47121t6.setVisibility(8);
                    }
                }
                View findViewById2 = frameLayout.findViewById(R.id.ldn);
                if (findViewById2 != null) {
                    toolbarContext.LIZLLL.getStyleDesc().getClass();
                    findViewById2.setVisibility(8);
                }
                viewModel.LJLJJL.observe(toolbarContext.LIZIZ, new AObserverS69S0100000_1(frameLayout, 128));
                View findViewById3 = frameLayout.findViewById(R.id.ldl);
                if (findViewById3 != null) {
                    LifecycleOwner owner = toolbarContext.LIZIZ;
                    AObserverS73S0100000_5 aObserverS73S0100000_5 = new AObserverS73S0100000_5(findViewById3, 54);
                    o.LJIIIZ(owner, "owner");
                    viewModel.LJLL.observe(owner, aObserverS73S0100000_5);
                }
            }
            InterfaceC30266BuI interfaceC30266BuI = this.LIZLLL;
            if (interfaceC30266BuI != null) {
                interfaceC30266BuI.LIZIZ(button, viewModel);
            }
            C29306Beo.LJJJLL(frameLayout, behavior.LLJZ(), new AqS136S0200000_5(button, behavior, 49));
            frameLayout.setOnLongClickListener(new IDCListenerS298S0100000_5(behavior, 9));
            frameLayout.setTag(button);
            this.LIZ.LIZLLL.getLayoutStyle().getLayoutParams().getClass();
            Integer valueOf = Integer.valueOf(C15380j0.LIZ(0.0f));
            this.LIZ.LIZLLL.getLayoutStyle().getLayoutParams().getClass();
            Integer valueOf2 = Integer.valueOf(C15380j0.LIZ(0.0f));
            this.LIZ.LIZLLL.getLayoutStyle().getLayoutParams().getClass();
            Integer valueOf3 = Integer.valueOf(C15380j0.LIZ(0.0f));
            this.LIZ.LIZLLL.getLayoutStyle().getLayoutParams().getClass();
            C26338AVi.LJIIIZ(LJIIIZ, valueOf, valueOf2, valueOf3, Integer.valueOf(C15380j0.LIZ(0.0f)), 16);
            int i5 = C30251Bu3.LIZ[button.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 5) {
                                i = R.id.lsd;
                            } else {
                                i = R.id.aq_;
                            }
                        } else {
                            i = R.id.lsb;
                        }
                    } else {
                        i = R.id.ls_;
                    }
                } else {
                    i = R.id.lsa;
                }
            } else {
                i = R.id.lsf;
            }
            frameLayout.setId(i);
            frameLayout.setTag(button);
            C30158BsY c30158BsY = new C30158BsY(frameLayout, LJIIIZ, button, viewModel);
            ((EnumMap) this.LJFF).put((EnumMap) button, (EnumC30241Btt) c30158BsY);
            behavior.LIZ(this.LIZ, c30158BsY);
            C30252Bu4 c30252Bu42 = this.LIZ;
            EnumC30260BuC style2 = c30252Bu42.LIZLLL.getLayoutStyle();
            o.LJIIIZ(style2, "style");
            C30267BuJ layoutParams2 = style2.getLayoutParams();
            OSZ LIZ3 = C30246Bty.LIZ(c30252Bu42);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C15380j0.LIZ(((Number) LIZ3.getFirst()).floatValue()), C15380j0.LIZ(((Number) LIZ3.getSecond()).floatValue()));
            layoutParams2.getClass();
            marginLayoutParams.setMarginStart(C15380j0.LIZ(0.0f));
            marginLayoutParams.setMarginEnd(C15380j0.LIZ(0.0f));
            marginLayoutParams.topMargin = C15380j0.LIZ(0.0f);
            marginLayoutParams.bottomMargin = C15380j0.LIZ(0.0f);
            frameLayout.setLayoutParams(marginLayoutParams);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            ViewGroup viewGroup = this.LIZIZ;
            LinkedList<EnumC30241Btt> linkedList = this.LJI;
            ArrayList arrayList = new ArrayList();
            Iterator<EnumC30241Btt> it = linkedList.iterator();
            while (it.hasNext()) {
                EnumC30241Btt next = it.next();
                if (this.LIZJ.indexOf(next) < this.LIZJ.indexOf(button)) {
                    arrayList.add(next);
                }
            }
            viewGroup.addView(frameLayout, Math.min(arrayList.size(), this.LIZIZ.getChildCount()));
            C29306Beo.LJJLJLI(this.LIZIZ);
        }
        C30211BtP.LIZ(SystemClock.elapsedRealtime(), button.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C30239Btr(C30252Bu4 c30252Bu4, ViewGroup container, EnumC30206BtK location, List<? extends EnumC30241Btt> list, InterfaceC30266BuI interfaceC30266BuI, java.util.Map<EnumC30241Btt, InterfaceC30264BuG> behaviorMap) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(location, "location");
        o.LJIIIZ(behaviorMap, "behaviorMap");
        this.LIZ = c30252Bu4;
        this.LIZIZ = container;
        this.LIZJ = list;
        this.LIZLLL = interfaceC30266BuI;
        this.LJ = behaviorMap;
        this.LJFF = new EnumMap(EnumC30241Btt.class);
        this.LJI = new LinkedList<>();
    }
}
