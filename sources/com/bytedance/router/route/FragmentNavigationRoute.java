package com.bytedance.router.route;

import X.AbstractC025808g;
import X.C08Y;
import X.C16880lQ;
import X.C1B3;
import X.ORZ;
import X.OSZ;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.fragment.FragmentNavigationContainer;
import com.bytedance.router.fragment.FragmentNavigationRouteIntent;
import com.bytedance.router.fragment.FragmentOp;
import com.bytedance.router.fragment.PopOp;
import com.bytedance.router.fragment.PushOp;
import com.bytedance.router.fragment.PushType;
import com.bytedance.router.util.Util;
import defpackage.a1;
import defpackage.b1;
import defpackage.i0;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class FragmentNavigationRoute extends BaseRoute {

    /* loaded from: classes11.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PushType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[PushType.ADD.ordinal()] = 1;
        }
    }

    private final String getOriginUri(String str) {
        return (String) ORZ.LJLLLL(s.LJLJJI(str, new char[]{'-'}, false, 6));
    }

    @Override // com.bytedance.router.route.IRoute
    public void open(Context context) {
        FragmentNavigationContainer fragmentNavigationContainer;
        PopOp popOp;
        RouteIntent routeIntent = getRouteIntent();
        if (routeIntent != null) {
            FragmentNavigationRouteIntent fragmentNavigationRouteIntent = (FragmentNavigationRouteIntent) routeIntent;
            FragmentManager fragmentManager = fragmentNavigationRouteIntent.getFragmentManager();
            if (fragmentManager != null && (fragmentNavigationContainer = fragmentNavigationRouteIntent.getFragmentNavigationContainer()) != null) {
                int fragmentContainer = fragmentNavigationContainer.getFragmentContainer();
                C1B3 c1b3 = new C1B3(fragmentManager);
                c1b3.LJIILL = true;
                if (fragmentNavigationContainer.addFragmentToBackStack() && (popOp = fragmentNavigationRouteIntent.getPopOp()) != null) {
                    pop(context, fragmentNavigationRouteIntent, popOp, fragmentManager);
                }
                PushOp pushOp = fragmentNavigationRouteIntent.getPushOp();
                if (pushOp != null) {
                    push(context, pushOp, fragmentManager, fragmentNavigationRouteIntent, fragmentContainer, fragmentNavigationContainer, c1b3);
                    if (pushOp.getImmediate()) {
                        c1b3.LJIILLIIL();
                        return;
                    } else {
                        c1b3.LJIILJJIL();
                        return;
                    }
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.router.fragment.FragmentNavigationRouteIntent");
    }

    private final void clearTop(FragmentManager fragmentManager, PushOp pushOp) {
        String realRouteUrl = Util.getRealRouteUrl(pushOp.getUrl());
        int LJJJJIZL = fragmentManager.LJJJJIZL();
        if (LJJJJIZL == 0) {
            return;
        }
        for (int i = LJJJJIZL - 1; i >= 0; i--) {
            C08Y LJJJJI = fragmentManager.LJJJJI(i);
            o.LJIIIIZZ(LJJJJI, "fragmentManager.getBackStackEntryAt(index)");
            String name = LJJJJI.getName();
            if (name != null && o.LJ(realRouteUrl, getOriginUri(name))) {
                popBackStackInner(fragmentManager, pushOp, name, 1);
                return;
            }
        }
    }

    private final String createDestinationId(String str, String str2) {
        String realRouteUrl = Util.getRealRouteUrl(str);
        if (TextUtils.isEmpty(str2)) {
            StringBuilder LIZJ = b1.LIZJ(realRouteUrl, "-tag-");
            LIZJ.append(System.currentTimeMillis());
            return X1D.LIZIZ(LIZJ);
        }
        return a1.LJ(realRouteUrl, "-tag-", str2);
    }

    private final String createDestinationIdWithRoot(String str, String str2) {
        return createDestinationId(str, i0.LJFF(str2, "-ROOT"));
    }

    private final boolean isTopFragment(FragmentManager fragmentManager, String str) {
        int LJJJJIZL;
        if (str == null || (LJJJJIZL = fragmentManager.LJJJJIZL()) == 0) {
            return false;
        }
        String realRouteUrl = Util.getRealRouteUrl(str);
        C08Y LJJJJI = fragmentManager.LJJJJI(LJJJJIZL - 1);
        o.LJIIIIZZ(LJJJJI, "fragmentManager.getBackS…ckEntryAt(stackCount - 1)");
        String name = LJJJJI.getName();
        if (name == null || !o.LJ(getOriginUri(name), realRouteUrl)) {
            return false;
        }
        return true;
    }

    private final void popBackStackInner(FragmentManager fragmentManager, FragmentOp fragmentOp) {
        if (fragmentOp.getImmediate()) {
            fragmentManager.LJJLIIIJL();
        } else {
            fragmentManager.LJJLIIIJJI();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r4 != (-1)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setAnimation(com.bytedance.router.fragment.PushOp r6, X.AbstractC025808g r7) {
        /*
            r5 = this;
            int r4 = r6.getPopEnterAnim()
            int r3 = r6.getPopExitAnim()
            int r2 = r6.getEnterAnim()
            int r1 = r6.getExitAnim()
            r0 = -1
            if (r4 != r0) goto L2a
            if (r3 != r0) goto L19
            if (r2 != r0) goto L19
            if (r1 == r0) goto L23
        L19:
            r4 = 0
        L1a:
            if (r3 == r0) goto L28
        L1c:
            if (r2 == r0) goto L26
        L1e:
            if (r1 == r0) goto L24
        L20:
            r7.LJIIJJI(r2, r1, r4, r3)
        L23:
            return
        L24:
            r1 = 0
            goto L20
        L26:
            r2 = 0
            goto L1e
        L28:
            r3 = 0
            goto L1c
        L2a:
            if (r4 == r0) goto L19
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.route.FragmentNavigationRoute.setAnimation(com.bytedance.router.fragment.PushOp, X.08g):void");
    }

    private final OSZ<String, Boolean> findDestinationIdInBackStack(FragmentManager fragmentManager, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String tag;
        String realRouteUrl = Util.getRealRouteUrl(str);
        if (TextUtils.isEmpty(str2)) {
            boolean z = true;
            int LJJJJIZL = fragmentManager.LJJJJIZL() - 1;
            while (true) {
                str3 = null;
                if (LJJJJIZL >= 0) {
                    C08Y LJJJJI = fragmentManager.LJJJJI(LJJJJIZL);
                    o.LJIIIIZZ(LJJJJI, "fragmentManager.getBackStackEntryAt(index)");
                    str4 = LJJJJI.getName();
                    if (str4 != null && o.LJ(getOriginUri(str4), realRouteUrl)) {
                        break;
                    }
                    LJJJJIZL--;
                } else {
                    str4 = null;
                    break;
                }
            }
            boolean z2 = false;
            if (str4 == null) {
                Fragment LJJJIL = fragmentManager.LJJJIL(createDestinationIdWithRoot(str, str2));
                if (LJJJIL != null && (tag = LJJJIL.getTag()) != null) {
                    str5 = getOriginUri(tag);
                } else {
                    str5 = null;
                }
                if (o.LJ(str5, realRouteUrl)) {
                    if (fragmentManager.LJJJJIZL() > 0) {
                        C08Y LJJJJI2 = fragmentManager.LJJJJI(0);
                        o.LJIIIIZZ(LJJJJI2, "fragmentManager.getBackStackEntryAt(0)");
                        str3 = LJJJJI2.getName();
                    } else {
                        z = false;
                    }
                    z2 = z;
                    str4 = str3;
                }
            }
            return new OSZ<>(str4, Boolean.valueOf(z2));
        }
        return new OSZ<>(a1.LJ(realRouteUrl, "-tag-", str2), Boolean.FALSE);
    }

    private final void pop(Context context, FragmentNavigationRouteIntent fragmentNavigationRouteIntent, PopOp popOp, FragmentManager fragmentManager) {
        String url = popOp.getUrl();
        if (url == null || ujb.o.LJJJJJL(url)) {
            popTop(context, fragmentNavigationRouteIntent, popOp, fragmentManager);
        } else {
            popToAppointment(context, fragmentNavigationRouteIntent, popOp, fragmentManager);
        }
    }

    private final void popBackStackInner(FragmentManager fragmentManager, FragmentOp fragmentOp, String str, int i) {
        if (fragmentOp.getImmediate()) {
            fragmentManager.LJJLIIIJLJLI(-1, i, str);
        } else {
            fragmentManager.LJJLIIIJJIZ(i, str);
        }
    }

    private final void popToAppointment(Context context, FragmentNavigationRouteIntent fragmentNavigationRouteIntent, PopOp popOp, FragmentManager fragmentManager) {
        int i;
        OSZ<String, Boolean> findDestinationIdInBackStack = findDestinationIdInBackStack(fragmentManager, popOp.getUrl(), popOp.getTag());
        String first = findDestinationIdInBackStack.getFirst();
        boolean booleanValue = findDestinationIdInBackStack.getSecond().booleanValue();
        if (popOp.getPopInclusive() || booleanValue) {
            i = 1;
        } else {
            i = 0;
        }
        popBackStackInner(fragmentManager, popOp, first, i);
    }

    private final void popTop(Context context, FragmentNavigationRouteIntent fragmentNavigationRouteIntent, PopOp popOp, FragmentManager fragmentManager) {
        Activity activity;
        if (fragmentManager.LJJJJIZL() == 0 && popOp.getTryFinishActivity() && (activity = fragmentNavigationRouteIntent.getActivity(context)) != null) {
            activity.finish();
        }
        popBackStackInner(fragmentManager, popOp);
    }

    private final void replace(Fragment fragment, AbstractC025808g abstractC025808g, int i, String str) {
        abstractC025808g.LJIIJ(fragment, str, i);
    }

    private final void addFragment(Fragment fragment, FragmentManager fragmentManager, AbstractC025808g abstractC025808g, int i, String str) {
        List<Fragment> LJJJJLI = fragmentManager.LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "fragmentManager.fragments");
        Fragment fragment2 = null;
        for (Fragment it : LJJJJLI) {
            o.LJIIIIZZ(it, "it");
            if (it.isVisible()) {
                fragment2 = it;
            }
        }
        if (fragment2 != null) {
            abstractC025808g.LJIIIZ(fragment2);
        }
        if (fragment.isAdded()) {
            abstractC025808g.LJIIL(fragment);
        } else {
            abstractC025808g.LJIIIIZZ(i, 1, fragment, str);
        }
    }

    private final void push(Context context, PushOp pushOp, FragmentManager fragmentManager, FragmentNavigationRouteIntent fragmentNavigationRouteIntent, int i, FragmentNavigationContainer fragmentNavigationContainer, AbstractC025808g abstractC025808g) {
        String createDestinationId;
        String targetClass = getTargetClass(pushOp.getUrl(), false);
        Bundle bundle = null;
        try {
            Class<?> cls = Class.forName(targetClass);
            if (cls == null || !Fragment.class.isAssignableFrom(cls)) {
                return;
            }
            if (fragmentManager.LJJJJLI().isEmpty()) {
                createDestinationId = createDestinationIdWithRoot(pushOp.getUrl(), pushOp.getTag());
            } else {
                createDestinationId = createDestinationId(pushOp.getUrl(), pushOp.getTag());
            }
            Fragment fragment = fragmentManager.LJJJIL(createDestinationId);
            if (fragment == null) {
                fragment = Fragment.instantiate(context, targetClass);
            }
            o.LJIIIIZZ(fragment, "fragment");
            Intent extra = fragmentNavigationRouteIntent.getExtra();
            if (extra != null) {
                bundle = C16880lQ.LLJJIJI(extra);
            }
            fragment.setArguments(bundle);
            setAnimation(pushOp, abstractC025808g);
            Integer flag = pushOp.getFlag();
            if (flag == null || flag.intValue() != 0 || !isTopFragment(fragmentManager, pushOp.getUrl())) {
                Integer flag2 = pushOp.getFlag();
                if (flag2 != null && flag2.intValue() == 1) {
                    clearTop(fragmentManager, pushOp);
                }
            } else {
                popBackStackInner(fragmentManager, pushOp);
            }
            if (WhenMappings.$EnumSwitchMapping$0[pushOp.getPushType().ordinal()] != 1) {
                replace(fragment, abstractC025808g, i, createDestinationId);
            } else {
                addFragment(fragment, fragmentManager, abstractC025808g, i, createDestinationId);
            }
            if (!fragmentNavigationContainer.addFragmentToBackStack()) {
                return;
            }
            o.LJIIIIZZ(fragmentManager.LJJJJLI(), "fragmentManager.fragments");
            if (!(!r1.isEmpty())) {
                return;
            }
            abstractC025808g.LJ(createDestinationId);
        } catch (Throwable unused) {
        }
    }
}
