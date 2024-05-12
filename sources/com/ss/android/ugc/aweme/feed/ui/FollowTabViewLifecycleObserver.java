package com.ss.android.ugc.aweme.feed.ui;

import X.AbstractC53958LFq;
import X.ActivityC45651qj;
import X.C00F;
import X.C0F0;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C1DG;
import X.C221108m2;
import X.C32I;
import X.C35138Dqg;
import X.C36307EMt;
import X.C3C5;
import X.C40517FvF;
import X.C47135Ieh;
import X.C47261Igj;
import X.C53295Kvr;
import X.C54189LOn;
import X.C54192LOq;
import X.C54195LOt;
import X.C54198LOw;
import X.C54199LOx;
import X.C54200LOy;
import X.C54201LOz;
import X.C54246LQs;
import X.C54251LQx;
import X.C54262LRi;
import X.C54362LVe;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56672Kh;
import X.C62822Ol8;
import X.C62846OlW;
import X.C72433Sbl;
import X.C76800UCe;
import X.C78765Uvh;
import X.C78847Ux1;
import X.C78866UxK;
import X.C78897Uxp;
import X.C82694Wcs;
import X.C84193Sd;
import X.E6F;
import X.EF7;
import X.ENH;
import X.ENR;
import X.FAJ;
import X.FMX;
import X.IKD;
import X.InterfaceC54080LKi;
import X.InterfaceC54194LOs;
import X.InterfaceC54196LOu;
import X.InterfaceC54197LOv;
import X.KL2;
import X.LCP;
import X.LGE;
import X.LGF;
import X.LI5;
import X.LYU;
import X.ORZ;
import X.QD3;
import Y.ALAdapterS7S0100000_9;
import Y.AObserverS73S0200000_9;
import Y.ARunnableS45S0100000_9;
import Y.AUListenerS90S0100000_1;
import Y.IDCListenerS116S0200000_9;
import Y.IDComparatorS34S0000000_6;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleConfig;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.MainFragmentBusinessAbility;
import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.follow.spi.FollowTabAbility;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.service.protection.TooltipProtectionSetting;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class FollowTabViewLifecycleObserver extends AbstractC53958LFq implements FollowTabAbility {
    public View LJLIL;
    public View LJLILLLLZI;
    public ViewStub LJLJI;
    public TextView LJLJJI;
    public ViewStub LJLJJL;
    public TextView LJLJJLL;
    public ViewGroup LJLJL;
    public ViewStub LJLJLJ;
    public List<? extends C72433Sbl> LJLJLLL;
    public View LJLL;
    public ViewStub LJLLI;
    public C36307EMt LJLLJ;
    public InterfaceC54194LOs LJLLLLLL;
    public InterfaceC54197LOv LJZI;
    public final Map<Integer, C36307EMt> LJLLILLLL = new LinkedHashMap();
    public final Handler LJLLL = new Handler(C16880lQ.LLJJJJ());
    public final ARunnableS45S0100000_9 LJLLLL = new ARunnableS45S0100000_9(this, 39);
    public int LJLZ = -1;
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(LI5.LJLIL);
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(C54189LOn.LJLIL);
    public final C54199LOx LL = new C54199LOx(this);
    public final C54198LOw LLD = new C54198LOw(this);
    public final C54192LOq LLF = new C54192LOq(this);

    public static String LJIIIZ(int i) {
        switch (i) {
            case 38:
                return "live";
            case 39:
                return "head";
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return "dot";
            case 41:
                return "number";
            default:
                return "";
        }
    }

    @Override // X.AbstractC53958LFq
    public final void LIZJ() {
        LJIIL(true);
        LJIJJ();
    }

    @Override // X.AbstractC53958LFq
    public final void LJ() {
        LJIIL(true);
    }

    @Override // com.ss.android.ugc.aweme.follow.spi.FollowTabAbility
    public final String Eo0() {
        C36307EMt c36307EMt = this.LJLLJ;
        if (c36307EMt != null) {
            return LJIIIZ(c36307EMt.LJLIL);
        }
        return null;
    }

    public final InterfaceC54196LOu LJIIJJI() {
        return (InterfaceC54196LOu) this.LJZ.getValue();
    }

    public final void LJIILIIL() {
        int i;
        ViewGroup.LayoutParams layoutParams;
        View view = this.LJLL;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(536870912, LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(536870912, LiveLayoutPreloadThreadPriority.DEFAULT));
        }
        View view2 = this.LJLL;
        if (view2 != null) {
            i = view2.getMeasuredWidth();
        } else {
            i = 0;
        }
        View view3 = this.LJLL;
        if (view3 != null) {
            layoutParams = view3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i2 = -i;
            if (!SearchServiceImpl.LLLZI().LJJJI()) {
                i2 = C47135Ieh.LIZ(2, i2);
            }
            marginLayoutParams.setMarginStart(i2);
        }
        View view4 = this.LJLL;
        if (view4 != null) {
            view4.setLayoutParams(layoutParams);
        }
        if (this.LJLL != null) {
            LYU.LJFF = true;
        }
    }

    public final void LJIILL() {
        ViewGroup viewGroup = this.LJLJL;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup2 = this.LJLJL;
        if (viewGroup2 != null) {
            List LJJIJIIJI = C47261Igj.LJJIJIIJI(Integer.valueOf(R.id.f13), Integer.valueOf(R.id.f14), Integer.valueOf(R.id.f15));
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIJIIJI, 10));
            Iterator it = LJJIJIIJI.iterator();
            while (it.hasNext()) {
                arrayList.add(viewGroup2.findViewById(((Number) it.next()).intValue()));
            }
            this.LJLJLLL = arrayList;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((ImageView) it2.next()).setVisibility(8);
            }
        }
    }

    public final boolean LJIILLIIL() {
        MainFragmentBusinessAbility mainFragmentBusinessAbility;
        View view = this.LJLIL;
        if (view == null || (mainFragmentBusinessAbility = (MainFragmentBusinessAbility) C55096Ljo.LIZ(C55230Lly.LJ(view), MainFragmentBusinessAbility.class, null)) == null || !mainFragmentBusinessAbility.ma("For You")) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC53958LFq
    public final void LIZ() {
        C36307EMt c36307EMt;
        if (!C53295Kvr.LIZJ() && (c36307EMt = this.LJLLJ) != null) {
            LJIJ(c36307EMt, "click");
        }
    }

    public final void LJIJJ() {
        int i;
        Object obj;
        boolean z;
        String valueOf;
        int i2;
        if (C53295Kvr.LIZJ()) {
            return;
        }
        Iterator it = ORZ.LLILII(new IDComparatorS34S0000000_6(2), ((LinkedHashMap) this.LJLLILLLL).values()).iterator();
        while (true) {
            i = 0;
            if (it.hasNext()) {
                obj = it.next();
                C36307EMt c36307EMt = (C36307EMt) obj;
                if (LJIIZILJ(c36307EMt.LJLIL) && C54362LVe.LJIIZILJ(c36307EMt.LJLIL)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C36307EMt c36307EMt2 = (C36307EMt) obj;
        if (c36307EMt2 == null) {
            if (this.LJLLJ != null) {
                LJIIL(true);
                return;
            }
            return;
        }
        C36307EMt c36307EMt3 = this.LJLLJ;
        if (c36307EMt3 != null && c36307EMt2.LJLIL == c36307EMt3.LJLIL) {
            return;
        }
        InterfaceC54197LOv interfaceC54197LOv = this.LJZI;
        if (interfaceC54197LOv != null && interfaceC54197LOv.LJFF()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || ((i2 = c36307EMt2.LJLIL) != 40 && i2 != 41 && i2 != 38)) {
            LJIJ(c36307EMt2, "show");
        }
        this.LJLLJ = c36307EMt2;
        this.LJLLL.removeCallbacks(this.LJLLLL);
        int i3 = c36307EMt2.LJLIL;
        switch (i3) {
            case 38:
                LJIJJLI(i3);
                this.LJLLL.postDelayed(this.LJLLLL, 120000L);
                return;
            case 39:
                LJIJJLI(-1);
                List<User> list = c36307EMt2.LJLJI;
                if (list == null) {
                    return;
                }
                int size = list.size();
                if (C35138Dqg.LIZ() && this.LJLJL == null && this.LJLJLJ != null) {
                    FAJ.LJIIIIZZ(new ARunnableS45S0100000_9(this, LiveCoverMinSizeSetting.DEFAULT));
                }
                List<? extends C72433Sbl> list2 = this.LJLJLLL;
                if (list2 != null) {
                    Iterator it2 = ((ArrayList) list2).iterator();
                    int i4 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            C62846OlW c62846OlW = (C62846OlW) next;
                            if (i4 < size) {
                                C78765Uvh.LJFF(c62846OlW, ((User) ListProtector.get(list, i4)).getAvatarThumb());
                                c62846OlW.setVisibility(4);
                            } else {
                                c62846OlW.setVisibility(8);
                            }
                            i4 = i5;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
                TextView textView = this.LJLJJLL;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ViewGroup viewGroup = this.LJLJL;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ArrayList arrayList = new ArrayList();
                List<? extends C72433Sbl> list3 = this.LJLJLLL;
                if (list3 != null) {
                    Iterator it3 = ((ArrayList) list3).iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        int i6 = i + 1;
                        if (i >= 0) {
                            C72433Sbl c72433Sbl = (C72433Sbl) next2;
                            if (i < size) {
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                                ofFloat.setDuration(400L);
                                ofFloat.setStartDelay(i * 30);
                                ofFloat.addUpdateListener(new AUListenerS90S0100000_1(c72433Sbl, 93));
                                arrayList.add(ofFloat);
                            }
                            i = i6;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.start();
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                LJIJJLI(i3);
                return;
            case 41:
                int LJIILJJIL = C54362LVe.LJIILJJIL(i3);
                if (LJIILJJIL > 0) {
                    TextView textView2 = this.LJLJJI;
                    if (textView2 != null) {
                        if (LJIILJJIL > 99) {
                            valueOf = "99+";
                        } else {
                            valueOf = String.valueOf(LJIILJJIL);
                        }
                        textView2.setText(valueOf);
                    }
                    LJIJJLI(c36307EMt2.LJLIL);
                    return;
                }
                LJIJJLI(40);
                return;
            default:
                return;
        }
    }

    @Override // X.AbstractC53958LFq
    public final void onResume() {
        if (LJIILLIIL()) {
            LJIJJ();
        }
    }

    public static void LJIIIIZZ(View view) {
        if (e1.LIZ(31744, "following_red_dot_reverse", true, false)) {
            if (view != null) {
                view.setBackgroundResource(R.drawable.avf);
            }
        } else {
            if (view == null) {
                return;
            }
            view.setBackgroundResource(R.drawable.avc);
        }
    }

    public static boolean LJIIZILJ(int i) {
        int LIZ;
        if (i != 38) {
            if ((i == 40 || i == 41) && (LIZ = C00F.LIZ(31744, 0, "follow_feed_type", true)) != 0 && LIZ >= 0 && LIZ <= 2 && LIZ == 2) {
                return false;
            }
        } else if (C00F.LIZ(31744, 0, "i18n_following_live_skylight_type", true) == 0) {
            return false;
        }
        return true;
    }

    public final void LJIIL(boolean z) {
        List<? extends C72433Sbl> list;
        int i;
        C36307EMt c36307EMt = this.LJLLJ;
        if (c36307EMt != null) {
            int i2 = c36307EMt.LJLIL;
            LJIJJLI(-1);
            if (i2 == 39) {
                if (C35138Dqg.LIZ() && this.LJLJL == null && this.LJLJLJ != null) {
                    FAJ.LJIIIIZZ(new ARunnableS45S0100000_9(this, LiveCoverMinSizeSetting.DEFAULT));
                }
                ViewGroup viewGroup = this.LJLJL;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && (list = this.LJLJLLL) != null) {
                    ArrayList arrayList = (ArrayList) list;
                    if (arrayList.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it = arrayList.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (((View) it.next()).getVisibility() == 0 && (i = i + 1) < 0) {
                                C47261Igj.LJJJJIZL();
                                throw null;
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    List<? extends C72433Sbl> list2 = this.LJLJLLL;
                    if (list2 != null) {
                        Iterator it2 = ((ArrayList) list2).iterator();
                        int i3 = 0;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                C72433Sbl c72433Sbl = (C72433Sbl) next;
                                if (i3 < i) {
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.setDuration(400L);
                                    ofFloat.setStartDelay(((i - i3) - 1) * 30);
                                    ofFloat.addUpdateListener(new AUListenerS90S0100000_1(c72433Sbl, 92));
                                    arrayList2.add(ofFloat);
                                }
                                i3 = i4;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.addListener(new ALAdapterS7S0100000_9(this, 20));
                    animatorSet.playTogether(arrayList2);
                    animatorSet.start();
                }
            }
            if (z) {
                C54362LVe.LJ(38);
                C54362LVe.LJ(39);
                C54362LVe.LJ(40);
                C54362LVe.LJ(41);
                LYU.LJFF = false;
            } else {
                C54362LVe.LJ(i2);
                if (i2 == 38) {
                    LYU.LJFF = false;
                }
            }
            this.LJLLJ = null;
        }
    }

    public final void LJIJI(int i) {
        int i2;
        int i3;
        View view = this.LJLILLLLZI;
        int i4 = 8;
        if (view != null) {
            if (i == 40) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            view.setVisibility(i3);
        }
        TextView textView = this.LJLJJI;
        if (textView != null) {
            if (i == 41) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
        }
        TextView textView2 = this.LJLJJI;
        if (textView2 != null) {
            textView2.post(new ARunnableS45S0100000_9(this, 40));
        }
        View view2 = this.LJLL;
        if (view2 != null) {
            if (i == 38) {
                i4 = 0;
            }
            view2.setVisibility(i4);
        }
        if (i == 38) {
            InterfaceC54196LOu LJIIJJI = LJIIJJI();
            if (LJIIJJI != null) {
                LJIIJJI.LIZIZ(new ArrayList(), 1);
                return;
            }
            return;
        }
        InterfaceC54196LOu LJIIJJI2 = LJIIJJI();
        if (LJIIJJI2 == null) {
            return;
        }
        LJIIJJI2.LIZIZ(new ArrayList(), -1);
    }

    public final void LJIJJLI(int i) {
        if (C35138Dqg.LIZ()) {
            if (i == 40) {
                if (this.LJLILLLLZI == null && this.LJLJI != null) {
                    FAJ.LJIIIIZZ(new ARunnableS45S0100000_9(this, 248));
                }
                LJIIIIZZ(this.LJLJJI);
            } else if (i == 41) {
                if (this.LJLJJI == null && this.LJLJJL != null) {
                    FAJ.LJIIIIZZ(new ARunnableS45S0100000_9(this, 247));
                }
            } else if (i == 38 && this.LJLL == null && this.LJLLI != null) {
                FAJ.LJIIIIZZ(new ARunnableS45S0100000_9(this, 249));
            }
        }
        InterfaceC54197LOv interfaceC54197LOv = this.LJZI;
        if (interfaceC54197LOv != null && interfaceC54197LOv.LJFF()) {
            this.LJLZ = i;
        } else {
            LJIJI(i);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onFollowFeedHideRedDotEvent(IKD ikd) {
        LJIIL(true);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onFollowLiveBubbleShowEvent(C54246LQs event) {
        Integer valueOf;
        InterfaceC54197LOv interfaceC54197LOv;
        InterfaceC54197LOv interfaceC54197LOv2;
        E6F e6f;
        InterfaceC54194LOs interfaceC54194LOs;
        boolean z;
        o.LJIIIZ(event, "event");
        C54201LOz c54201LOz = null;
        Context context = null;
        if (TooltipProtectionSetting.INSTANCE.isKillSwitchDisabled()) {
            InterfaceC54196LOu LJIIJJI = LJIIJJI();
            if (LJIIJJI != null) {
                WeakReference weakReference = new WeakReference(this.LJLJJLL);
                FollowLiveBubbleConfig followLiveBubbleConfig = (FollowLiveBubbleConfig) this.LJZL.getValue();
                WeakReference weakReference2 = new WeakReference(this.LJZI);
                if (event.LJLIL == 3) {
                    z = true;
                } else {
                    z = false;
                }
                e6f = LJIIJJI.LIZ(weakReference, followLiveBubbleConfig, weakReference2, z);
            } else {
                e6f = null;
            }
            InterfaceC54196LOu LJIIJJI2 = LJIIJJI();
            if (LJIIJJI2 != null) {
                o.LJII(e6f, "null cannot be cast to non-null type com.ss.android.ugc.aweme.service.protection.ITooltipDependency");
                View view = this.LJLIL;
                if (view != null) {
                    context = view.getContext();
                }
                c54201LOz = LJIIJJI2.LJ(e6f, new WeakReference(context));
            }
            this.LJLLLLLL = c54201LOz;
            if (c54201LOz != null && c54201LOz.shouldShow() && (interfaceC54194LOs = this.LJLLLLLL) != null) {
                interfaceC54194LOs.LIZ(C54200LOy.LJLIL);
                return;
            }
            return;
        }
        if (!ENH.LIZ()) {
            Object LIZJ = C0F0.LIZIZ().LIZJ(Boolean.TRUE, "following_inbox_bubble_enable");
            o.LJIIIIZZ(LIZJ, "get()\n                .g…box_bubble_enable\", true)");
            if (!((Boolean) LIZJ).booleanValue()) {
                return;
            }
        }
        C40517FvF c40517FvF = new C40517FvF(2, 3);
        FollowLiveBubbleConfig followLiveBubbleConfig2 = (FollowLiveBubbleConfig) this.LJZL.getValue();
        if (followLiveBubbleConfig2 == null || (valueOf = Integer.valueOf(followLiveBubbleConfig2.expGroup)) == null || !c40517FvF.LJIILJJIL(valueOf.intValue())) {
            return;
        }
        if (event.LJLIL == 2 && (interfaceC54197LOv2 = this.LJZI) != null) {
            interfaceC54197LOv2.show(false);
        }
        if (event.LJLIL != 3 || (interfaceC54197LOv = this.LJZI) == null) {
            return;
        }
        interfaceC54197LOv.show(true);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onNoticeCountChangedEvent(C54262LRi event) {
        o.LJIIIZ(event, "event");
        if ((event.LIZ(38) || event.LIZ(39) || event.LIZ(40) || event.LIZ(41)) && LJIILLIIL()) {
            LJIJJ();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onNoticeFollowingTabInfo(C36307EMt event) {
        o.LJIIIZ(event, "event");
        this.LJLLILLLL.put(Integer.valueOf(event.LJLIL), event);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onNotificationIndicatorEvent(C54251LQx event) {
        o.LJIIIZ(event, "event");
        if (this.LJLIL == null || ENR.LIZ()) {
            return;
        }
        if ((event.LIZ(38) || event.LIZ(39) || event.LIZ(40) || event.LIZ(41)) && LJIILLIIL()) {
            LJIJJ();
        }
    }

    @Override // X.AbstractC53958LFq
    public final void LIZIZ(View view, Fragment fragment) {
        Bundle arguments;
        o.LJIIIZ(view, "view");
        if (fragment != null && (arguments = fragment.getArguments()) != null) {
            int i = arguments.getInt("tab", -1);
            LGE.Companion.getClass();
            if (LGF.LIZ(i) == LGE.FOLLOW) {
                LJIIL(true);
            }
        }
    }

    @Override // X.AbstractC53958LFq
    public final void LIZLLL(int i, Fragment fragment) {
        HomeTabAbility homeTabAbility;
        List<InterfaceC54080LKi> p5;
        o.LJIIIZ(fragment, "fragment");
        View view = this.LJLIL;
        if (view == null || (homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LJ(view), HomeTabAbility.class, null)) == null || (p5 = homeTabAbility.p5()) == null) {
            return;
        }
        try {
            if (o.LJ(((InterfaceC54080LKi) ListProtector.get(p5, i)).tag(), "Following") && (fragment instanceof FeedFollowFragment)) {
                LJIIL(true);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // X.AbstractC53958LFq
    public final void LJII(View view, LCP lcp) {
        C82694Wcs c82694Wcs;
        TextView textView;
        View view2;
        TextView textView2;
        View view3;
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        InterfaceC54197LOv interfaceC54197LOv;
        o.LJIIIZ(view, "view");
        this.LJLIL = view;
        final ActivityC45651qj LJ = C1DG.LJ(view, "view.context");
        if (LJ != null) {
            InterfaceC54196LOu LJIIJJI = LJIIJJI();
            ViewGroup viewGroup = null;
            ViewStub viewStub4 = null;
            if (LJIIJJI != null) {
                c82694Wcs = LJIIJJI.LIZJ();
            } else {
                c82694Wcs = null;
            }
            this.LJZI = c82694Wcs;
            if (view.isAttachedToWindow()) {
                C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LJ, null), this, FollowTabAbility.class, null);
            }
            view.post(new Runnable() { // from class: com.ss.android.ugc.aweme.feed.ui.FollowTabViewLifecycleObserver$onViewCreated$1
                public final void LIZ() {
                    Lifecycle lifecycle = ActivityC45651qj.this.getLifecycle();
                    final ActivityC45651qj activityC45651qj = ActivityC45651qj.this;
                    final FollowTabViewLifecycleObserver followTabViewLifecycleObserver = this;
                    lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.feed.ui.FollowTabViewLifecycleObserver$onViewCreated$1.1
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                            if (event == Lifecycle.Event.ON_START) {
                                onStart();
                            } else if (event == Lifecycle.Event.ON_STOP) {
                                onStop();
                            }
                        }

                        @OnLifecycleEvent(Lifecycle.Event.ON_START)
                        public final void onStart() {
                            BottomTabAbility LJIIIZ;
                            TopTabAbility LJJLIIIJJIZ;
                            MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(ActivityC45651qj.this);
                            if (LJJLIIIJJI != null && (LJJLIIIJJIZ = C78847Ux1.LJJLIIIJJIZ(LJJLIIIJJI)) != null) {
                                LJJLIIIJJIZ.na(followTabViewLifecycleObserver.LL);
                            }
                            MainActivityScope LJJLIIIJJI2 = C78866UxK.LJJLIIIJJI(ActivityC45651qj.this);
                            if (LJJLIIIJJI2 != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJI2)) != null) {
                                LJIIIZ.b3(followTabViewLifecycleObserver.LLD);
                            }
                        }

                        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                        public final void onStop() {
                            BottomTabAbility LJIIIZ;
                            TopTabAbility LJJLIIIJJIZ;
                            MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(ActivityC45651qj.this);
                            if (LJJLIIIJJI != null && (LJJLIIIJJIZ = C78847Ux1.LJJLIIIJJIZ(LJJLIIIJJI)) != null) {
                                LJJLIIIJJIZ.a2(followTabViewLifecycleObserver.LL);
                            }
                            MainActivityScope LJJLIIIJJI2 = C78866UxK.LJJLIIIJJI(ActivityC45651qj.this);
                            if (LJJLIIIJJI2 != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJI2)) != null) {
                                LJIIIZ.Q6(followTabViewLifecycleObserver.LLD);
                            }
                        }
                    });
                    ScrollSwitchStateManager LIZ = C84193Sd.LIZ(ActivityC45651qj.this);
                    LIZ.rv0(ActivityC45651qj.this, new AObserverS73S0200000_9(LIZ, this, 0));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        LIZ();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            view.addOnAttachStateChangeListener(new IDCListenerS116S0200000_9(LJ, this, 1));
            View view4 = this.LJLIL;
            if (view4 != null) {
                textView = (TextView) view4.findViewById(android.R.id.text1);
            } else {
                textView = null;
            }
            this.LJLJJLL = textView;
            if (textView != null && (interfaceC54197LOv = this.LJZI) != null) {
                interfaceC54197LOv.LIZ(textView);
            }
            InterfaceC54197LOv interfaceC54197LOv2 = this.LJZI;
            if (interfaceC54197LOv2 != null) {
                interfaceC54197LOv2.LIZJ(this.LLF);
            }
            TextView textView3 = this.LJLJJLL;
            if (textView3 != null) {
                textView3.setText(lcp.LIZJ);
            }
            if (C35138Dqg.LIZ()) {
                if (!C53295Kvr.LIZJ()) {
                    View view5 = this.LJLIL;
                    if (view5 != null) {
                        viewStub = (ViewStub) view5.findViewById(R.id.mmh);
                    } else {
                        viewStub = null;
                    }
                    this.LJLJI = viewStub;
                    View view6 = this.LJLIL;
                    if (view6 != null) {
                        viewStub2 = (ViewStub) view6.findViewById(R.id.mmf);
                    } else {
                        viewStub2 = null;
                    }
                    this.LJLJJL = viewStub2;
                    View view7 = this.LJLIL;
                    if (view7 != null) {
                        viewStub3 = (ViewStub) view7.findViewById(R.id.mmg);
                    } else {
                        viewStub3 = null;
                    }
                    this.LJLLI = viewStub3;
                }
                View view8 = this.LJLIL;
                if (view8 != null) {
                    viewStub4 = (ViewStub) view8.findViewById(R.id.dlj);
                }
                this.LJLJLJ = viewStub4;
            } else {
                if (!C53295Kvr.LIZJ()) {
                    View view9 = this.LJLIL;
                    if (view9 != null) {
                        view2 = view9.findViewById(R.id.mmd);
                    } else {
                        view2 = null;
                    }
                    this.LJLILLLLZI = view2;
                    View view10 = this.LJLIL;
                    if (view10 != null) {
                        textView2 = (TextView) view10.findViewById(R.id.mme);
                    } else {
                        textView2 = null;
                    }
                    this.LJLJJI = textView2;
                    View view11 = this.LJLIL;
                    if (view11 != null) {
                        view3 = view11.findViewById(R.id.g0i);
                    } else {
                        view3 = null;
                    }
                    this.LJLL = view3;
                    LJIILIIL();
                }
                View view12 = this.LJLIL;
                if (view12 != null) {
                    viewGroup = (ViewGroup) view12.findViewById(R.id.dli);
                }
                this.LJLJL = viewGroup;
                LJIILL();
            }
            LJIJJLI(-1);
            if (!C35138Dqg.LIZ()) {
                LJIIIIZZ(this.LJLILLLLZI);
            }
            TextView textView4 = this.LJLJJLL;
            if (textView4 != null) {
                textView4.setShadowLayer(KL2.LIZJ(EF7.LIZIZ(), 2.0f), 0.0f, KL2.LIZJ(EF7.LIZIZ(), 2.0f), ColorProtector.parseColor("#26000000"));
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJIJ(C36307EMt c36307EMt, String str) {
        FollowLiveBubbleConfig followLiveBubbleConfig;
        int i;
        User user;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("notice_type", LJIIIZ(c36307EMt.LJLIL));
        c188727au.LJIIIZ("action_type", str);
        List<User> list = c36307EMt.LJLJI;
        if (list != null && (user = (User) ORZ.LJLLLL(list)) != null) {
            c188727au.LJI("to_user_id", user.getUid());
        }
        int i2 = c36307EMt.LJLIL;
        if (i2 == 41) {
            c188727au.LIZLLL(C54362LVe.LJIILJJIL(i2), "number_cnt");
        }
        if (c36307EMt.LJLIL == 38 && (followLiveBubbleConfig = (FollowLiveBubbleConfig) this.LJZL.getValue()) != null && ((i = followLiveBubbleConfig.expGroup) == 2 || i == 3)) {
            c188727au.LIZLLL(1, "live_notice_type");
        }
        if (o.LJ(str, "show")) {
            if (!C54195LOt.LIZ) {
                c188727au.LJFF(Boolean.FALSE, "is_from_coldlaunch");
            } else {
                C54195LOt.LIZ = false;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - C56672Kh.LIZ().LJJIIZI;
                long j2 = elapsedRealtime - C56672Kh.LIZ().LJJIJ;
                c188727au.LJFF(Boolean.TRUE, "is_from_coldlaunch");
                c188727au.LJ(j, "launch_to_show");
                c188727au.LJ(j2, "firstframe_to_show");
            }
        }
        FMX.LJIIL("homepage_follow_notice", c188727au.LIZ);
    }
}
