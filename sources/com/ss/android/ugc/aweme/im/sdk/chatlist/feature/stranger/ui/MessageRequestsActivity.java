package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui;

import X.AbstractC108304Mw;
import X.AbstractC108314Mx;
import X.AbstractC108324My;
import X.ActivityC86117Xqz;
import X.C106774Gz;
import X.C109674Sd;
import X.C109684Se;
import X.C109734Sj;
import X.C109824Ss;
import X.C162476Zf;
import X.C221108m2;
import X.C234509Ig;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C3QW;
import X.C3U8;
import X.C41143GCt;
import X.C47261Igj;
import X.C4NO;
import X.C4T1;
import X.C4T2;
import X.C4T3;
import X.C4T4;
import X.C4VB;
import X.C4Z2;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C72302sc;
import X.C78983UzD;
import X.C80261Vej;
import X.C82233Kp;
import X.C83263Oo;
import X.C83663Qc;
import X.C96423qQ;
import X.C98553tr;
import X.C9KF;
import X.EnumC109724Si;
import X.EnumC252729vw;
import X.EnumC97443s4;
import X.InterfaceC109644Sa;
import X.InterfaceC27853AwT;
import X.LHW;
import X.ORZ;
import X.QD3;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestsActivity;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class MessageRequestsActivity extends ActivityC86117Xqz implements InterfaceC27853AwT, InterfaceC109644Sa {
    public static final /* synthetic */ int LJLL = 0;
    public List<? extends EnumC97443s4> LJLIL;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 575));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 578));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 577));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 574));
    public final C109684Se LJLJJLL = new C109684Se(null);
    public final int LJLJL = C3QW.LIZ().paginationCount;
    public final List<AbstractC108304Mw> LJLJLJ = new ArrayList();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        return "message_box";
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final ViewPager LLII() {
        return (ViewPager) this.LJLJI.getValue();
    }

    public final void LLIIIJ() {
        String string;
        List list;
        boolean z;
        C235119Kp c235119Kp = new C235119Kp();
        boolean z2 = true;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZIZ(new AqS151S0100000_1(this, 576));
        c235119Kp.LIZLLL(LIZJ);
        C4T2 c4t2 = this.LJLJJLL.LIZIZ;
        C4T3 c4t3 = C4T3.LIZ;
        if (o.LJ(c4t2, c4t3)) {
            int i = this.LJLJJLL.LJI;
            if (C4T4.LIZ() >= 1) {
                z = true;
            } else {
                z = false;
            }
            int i2 = C109734Sj.LIZ[this.LJLJJLL.LIZ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (z) {
                            string = getString(R.string.o_, Integer.valueOf(i));
                        } else {
                            string = getString(R.string.i3d);
                        }
                        o.LJIIIIZZ(string, "{\n                if (wi…uest_inbox)\n            }");
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    if (z) {
                        string = getString(R.string.i3q);
                    } else {
                        string = getString(R.string.i3d);
                    }
                    o.LJIIIIZZ(string, "{\n                if (wi…uest_inbox)\n            }");
                }
            } else {
                if (z) {
                    string = getString(R.string.o9, Integer.valueOf(i));
                } else {
                    string = getString(R.string.i44);
                }
                o.LJIIIIZZ(string, "{\n                if (wi…red_header)\n            }");
            }
        } else {
            int i3 = this.LJLJJLL.LJFF;
            if (i3 > 0) {
                string = getString(R.string.oa, Integer.valueOf(i3));
                o.LJIIIIZZ(string, "{\n                getStr…          )\n            }");
            } else {
                string = getString(R.string.ou);
                o.LJIIIIZZ(string, "{\n                getStr…          )\n            }");
            }
        }
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C4T2 c4t22 = this.LJLJJLL.LIZIZ;
        if (o.LJ(c4t22, c4t3)) {
            C234529Ii LIZJ2 = s1.LIZJ();
            LIZJ2.LIZJ = R.raw.icon_selection;
            LIZJ2.LIZIZ(new AqS151S0100000_1(this, 1001));
            C234529Ii c234529Ii = new C234529Ii();
            c234529Ii.LIZJ();
            c234529Ii.LIZJ = R.raw.icon_gear;
            c234529Ii.LIZIZ(new AqS151S0100000_1(this, 1002));
            int i4 = this.LJLJJLL.LJ;
            if (i4 >= 0) {
                List<? extends EnumC97443s4> list2 = this.LJLIL;
                if (list2 != null) {
                    if (i4 < list2.size()) {
                        Map<EnumC97443s4, Boolean> map = this.LJLJJLL.LIZJ;
                        List<? extends EnumC97443s4> list3 = this.LJLIL;
                        if (list3 != null) {
                            Boolean bool = map.get(ListProtector.get(list3, i4));
                            if (bool != null && !bool.booleanValue() && C4T4.LIZ() >= 2) {
                                list = C47261Igj.LJJIJIIJI(LIZJ2, c234529Ii);
                            }
                        } else {
                            o.LJIJI("pageList");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("pageList");
                    throw null;
                }
            }
            list = C47261Igj.LJJIJ(c234529Ii);
        } else if (o.LJ(c4t22, C4T1.LIZ)) {
            C234509Ig c234509Ig = new C234509Ig();
            String string2 = getString(R.string.oi);
            o.LJIIIIZZ(string2, "getString(R.string.Messa…_req_optimize_popup_cta2)");
            c234509Ig.LIZJ = string2;
            c234509Ig.LIZ(EnumC252729vw.SECONDARY);
            c234509Ig.LIZ = new C109824Ss(new AqS151S0100000_1(this, 1000));
            list = C47261Igj.LJJIJ(c234509Ig);
        } else {
            throw new C162476Zf();
        }
        o.LJIIIZ(list, "list");
        ((ArrayList) c235119Kp.LIZIZ).addAll(list);
        List<? extends EnumC97443s4> list4 = this.LJLIL;
        if (list4 != null) {
            if (list4.size() != 1 || !o.LJ(this.LJLJJLL.LIZIZ, c4t3)) {
                z2 = false;
            }
            c235119Kp.LIZLLL = z2;
            Object value = this.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value, "<get-navBar>(...)");
            ((C252709vu) value).setNavActions(c235119Kp);
            return;
        }
        o.LJIJI("pageList");
        throw null;
    }

    public final void LLIIIZ() {
        List<AbstractC108304Mw> LLFII;
        AbstractC108324My abstractC108324My;
        if (C3QW.LIZ().enableStrangerPageAsyncInit) {
            boolean LIZ = C3U8.LIZ();
            if (!C3U8.LIZJ() && LIZ) {
                AbstractC108304Mw LIZ2 = C83263Oo.LIZ(C3QW.LIZ().defaultPullCount, EnumC97443s4.REGULAR);
                if ((LIZ2 instanceof AbstractC108324My) && (abstractC108324My = (AbstractC108324My) LIZ2) != null) {
                    abstractC108324My.LJIIJ(new AqS167S0100000_1(this, 432));
                    return;
                }
                return;
            }
            LLFZ(false, LIZ);
            return;
        }
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C83663Qc.LJLIL);
        if (!C3U8.LIZJ() && C3U8.LIZ() && ((Number) LIZIZ.getValue()).intValue() == 0) {
            this.LJLIL = C47261Igj.LJJIJ(EnumC97443s4.FILTERED);
            LLFII = LLFII(true, true);
            this.LJLJJLL.LIZ(EnumC109724Si.ONLY_FILTERED);
        } else if (C3U8.LIZ()) {
            this.LJLIL = C47261Igj.LJJIJIIJI(EnumC97443s4.REGULAR, EnumC97443s4.FILTERED);
            LLFII = LLFII(false, true);
            this.LJLJJLL.LIZ(EnumC109724Si.STRANGER_AND_FILTERED);
        } else {
            this.LJLIL = C47261Igj.LJJIJ(EnumC97443s4.ALL);
            LLFII = LLFII(false, false);
            this.LJLJJLL.LIZ(EnumC109724Si.STRANGER_INCLUDE_FILTERED);
        }
        List<? extends EnumC97443s4> list = this.LJLIL;
        if (list != null) {
            LLIIIILZ(list, LLFII);
        } else {
            o.LJIJI("pageList");
            throw null;
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        C82233Kp.LIZ();
        C106774Gz.LJ();
        C72302sc.LIZJ(false);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.InterfaceC109644Sa
    public final AbstractC108304Mw LJJJJI(int i) {
        if (((ArrayList) this.LJLJLJ).size() <= i) {
            C78983UzD.LJIILJJIL();
            return C83263Oo.LIZ(10, EnumC97443s4.REGULAR);
        }
        return (AbstractC108304Mw) ListProtector.get(this.LJLJLJ, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLIIJLIL(int i) {
        MessageRequestFragment messageRequestFragment;
        C109684Se c109684Se = this.LJLJJLL;
        c109684Se.LJ = i;
        Map<EnumC97443s4, Boolean> map = c109684Se.LIZLLL;
        List<? extends EnumC97443s4> list = this.LJLIL;
        if (list != null) {
            map.put(ListProtector.get(list, i), Boolean.TRUE);
            List<Fragment> LJJJJLI = getSupportFragmentManager().LJJJJLI();
            o.LJIIIIZZ(LJJJJLI, "supportFragmentManager.fragments");
            Object LJLLLLLL = ORZ.LJLLLLLL(i, ORZ.LLJILJILJ(LJJJJLI));
            if ((LJLLLLLL instanceof MessageRequestFragment) && (messageRequestFragment = (MessageRequestFragment) LJLLLLLL) != null) {
                messageRequestFragment.vl();
                return;
            }
            return;
        }
        o.LJIJI("pageList");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestsActivity", "onCreate", true);
        activityConfiguration(C41143GCt.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.b0j);
        C4NO.LIZ(this);
        C96423qQ.LIZ();
        C4Z2.LJIILLIIL();
        LLIIIZ();
        C72302sc.LIZJ(false);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestsActivity", "onCreate", false);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPrivacySettingUpdate(C98553tr event) {
        o.LJIIIZ(event, "event");
        LLIIIZ();
    }

    public final List<AbstractC108304Mw> LLFII(boolean z, boolean z2) {
        if (z) {
            AbstractC108304Mw LIZ = C83263Oo.LIZ(this.LJLJL, EnumC97443s4.REGULAR);
            o.LJII(LIZ, "null cannot be cast to non-null type com.bytedance.ies.im.core.api.client.StrangerRequestsModel");
            AbstractC108304Mw LIZ2 = C83263Oo.LIZ(this.LJLJL, EnumC97443s4.FILTERED);
            o.LJII(LIZ2, "null cannot be cast to non-null type com.bytedance.ies.im.core.api.client.FilteredRequestsModel");
            AbstractC108314Mx abstractC108314Mx = (AbstractC108314Mx) LIZ2;
            abstractC108314Mx.LJIIIIZZ((AbstractC108324My) LIZ, true);
            return C47261Igj.LJJIJ(abstractC108314Mx);
        }
        if (z2) {
            if (C3QW.LIZ().enableViewModelSplit) {
                AbstractC108304Mw LIZ3 = C83263Oo.LIZ(this.LJLJL, EnumC97443s4.REGULAR);
                o.LJII(LIZ3, "null cannot be cast to non-null type com.bytedance.ies.im.core.api.client.StrangerRequestsModel");
                AbstractC108324My abstractC108324My = (AbstractC108324My) LIZ3;
                AbstractC108304Mw LIZ4 = C83263Oo.LIZ(this.LJLJL, EnumC97443s4.FILTERED);
                o.LJII(LIZ4, "null cannot be cast to non-null type com.bytedance.ies.im.core.api.client.FilteredRequestsModel");
                AbstractC108314Mx abstractC108314Mx2 = (AbstractC108314Mx) LIZ4;
                abstractC108314Mx2.LJIIIIZZ(abstractC108324My, false);
                return C47261Igj.LJJIJIIJI(abstractC108324My, abstractC108314Mx2);
            }
            EnumC97443s4 enumC97443s4 = EnumC97443s4.REGULAR;
            AbstractC108304Mw LIZ5 = C83263Oo.LIZ(this.LJLJL, enumC97443s4);
            o.LJII(LIZ5, "null cannot be cast to non-null type com.bytedance.ies.im.core.api.client.StrangerRequestsModel");
            AbstractC108304Mw LIZ6 = C83263Oo.LIZ(this.LJLJL, enumC97443s4);
            o.LJII(LIZ6, "null cannot be cast to non-null type com.bytedance.ies.im.core.api.client.StrangerRequestsModel");
            AbstractC108304Mw LIZ7 = C83263Oo.LIZ(this.LJLJL, EnumC97443s4.FILTERED);
            o.LJII(LIZ7, "null cannot be cast to non-null type com.bytedance.ies.im.core.api.client.FilteredRequestsModel");
            AbstractC108314Mx abstractC108314Mx3 = (AbstractC108314Mx) LIZ7;
            abstractC108314Mx3.LJIIIIZZ((AbstractC108324My) LIZ6, true);
            return C47261Igj.LJJIJIIJI(LIZ5, abstractC108314Mx3);
        }
        return C47261Igj.LJJIJ(C83263Oo.LIZ(this.LJLJL, EnumC97443s4.ALL));
    }

    public final void LLFZ(boolean z, boolean z2) {
        List<? extends EnumC97443s4> LJJIJ;
        if (z) {
            this.LJLJJLL.LIZ(EnumC109724Si.ONLY_FILTERED);
            LJJIJ = C47261Igj.LJJIJ(EnumC97443s4.FILTERED);
        } else if (z2) {
            this.LJLJJLL.LIZ(EnumC109724Si.STRANGER_AND_FILTERED);
            LJJIJ = C47261Igj.LJJIJIIJI(EnumC97443s4.REGULAR, EnumC97443s4.FILTERED);
        } else {
            this.LJLJJLL.LIZ(EnumC109724Si.STRANGER_INCLUDE_FILTERED);
            LJJIJ = C47261Igj.LJJIJ(EnumC97443s4.ALL);
        }
        this.LJLIL = LJJIJ;
        List<AbstractC108304Mw> LLFII = LLFII(z, z2);
        List<? extends EnumC97443s4> list = this.LJLIL;
        if (list != null) {
            LLIIIILZ(list, LLFII);
        } else {
            o.LJIJI("pageList");
            throw null;
        }
    }

    public final void LLIIIILZ(List<? extends EnumC97443s4> list, List<? extends AbstractC108304Mw> list2) {
        int i;
        PagerAdapter adapter = LLII().getAdapter();
        if (((adapter instanceof C109674Sd) && o.LJ(list, ((C109674Sd) adapter).LJLJLJ)) || list.size() != list2.size()) {
            return;
        }
        ((ArrayList) this.LJLJLJ).clear();
        ((ArrayList) this.LJLJLJ).addAll(list2);
        ViewPager LLII = LLII();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
        Resources resources = getResources();
        o.LJIIIIZZ(resources, "resources");
        LLII.setAdapter(new C109674Sd(supportFragmentManager, list, resources));
        LLIIIJ();
        View tabLayout = (View) this.LJLJJI.getValue();
        o.LJIIIIZZ(tabLayout, "tabLayout");
        if (list.size() > 1) {
            i = 0;
        } else {
            i = 8;
        }
        tabLayout.setVisibility(i);
        LLIIJLIL(0);
        if (list.size() > 1) {
            C80261Vej c80261Vej = (C80261Vej) this.LJLJJI.getValue();
            final ViewPager LLII2 = LLII();
            c80261Vej.addOnTabSelectedListener((LHW) new C4VB(LLII2) { // from class: X.4Sf
                @Override // X.C4VB, X.InterfaceC54357LUz
                public final void LIZ(C78856UxA c78856UxA) {
                    XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C109704Sg(MessageRequestsActivity.this, c78856UxA, null), 3);
                }

                @Override // X.C4VB, X.InterfaceC54357LUz
                public final void LIZIZ(C78856UxA tab) {
                    o.LJIIIZ(tab, "tab");
                    int i2 = tab.LJ;
                    MessageRequestsActivity messageRequestsActivity = MessageRequestsActivity.this;
                    if (messageRequestsActivity.LJLJJLL.LJ != i2) {
                        messageRequestsActivity.LLIIJI(C4T3.LIZ, i2);
                    }
                    MessageRequestsActivity.this.LLIIJLIL(i2);
                    MessageRequestsActivity.this.LLIIIJ();
                }
            });
            ((C80261Vej) this.LJLJJI.getValue()).setupWithViewPager(LLII());
        }
    }

    public final void LLIIJI(C4T2 newMode, int i) {
        MessageRequestFragment messageRequestFragment;
        o.LJIIIZ(newMode, "newMode");
        C109684Se c109684Se = this.LJLJJLL;
        c109684Se.getClass();
        c109684Se.LIZIZ = newMode;
        if (o.LJ(newMode, C4T3.LIZ)) {
            this.LJLJJLL.LJFF = 0;
        }
        LLIIIJ();
        List<Fragment> LJJJJLI = getSupportFragmentManager().LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "supportFragmentManager.fragments");
        Fragment fragment = (Fragment) ORZ.LJLLLLLL(i, ORZ.LLJILJILJ(LJJJJLI));
        if (fragment != null && (fragment instanceof MessageRequestFragment) && (messageRequestFragment = (MessageRequestFragment) fragment) != null) {
            MessageRequestViewModel messageRequestViewModel = (MessageRequestViewModel) messageRequestFragment.LJLIL.getValue();
            messageRequestViewModel.withState(new AqS132S0200000_1(newMode, messageRequestViewModel, 96));
        }
    }
}
