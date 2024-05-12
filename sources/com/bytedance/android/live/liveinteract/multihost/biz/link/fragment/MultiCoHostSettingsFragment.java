package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment;

import X.AbstractC73672Svk;
import X.AbstractC76169Tuv;
import X.ActivityC45651qj;
import X.BPP;
import X.C011602u;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C73969T1h;
import X.C75642TmQ;
import X.C76029Tsf;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC30442Bx8;
import X.T16;
import Y.AUListenerS92S0100000_3;
import Y.AfS55S0100000_3;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiCoHostSettingsFragment extends MultiCoHostSettingContract$AbsView implements View.OnClickListener {
    public static final /* synthetic */ int LLF = 0;
    public C011602u LJLJJL;
    public C011602u LJLJJLL;
    public C011602u LJLJL;
    public C011602u LJLJLJ;
    public C011602u LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public boolean LL;
    public final Map<Integer, View> LLD = new LinkedHashMap();
    public Boolean LJLLLLLL = InterfaceC30442Bx8.LLIFFJFJJ.LIZJ();
    public Boolean LJLZ = InterfaceC30442Bx8.LLI.LIZJ();
    public Boolean LJZ = InterfaceC30442Bx8.LLIIII.LIZJ();
    public Boolean LJZI = InterfaceC30442Bx8.LLII.LIZJ();
    public Boolean LJZL = InterfaceC30442Bx8.LLIIIL.LIZJ();

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C76029Tsf vl() {
        C76029Tsf c76029Tsf = new C76029Tsf();
        String string = getString(R.string.o1v);
        o.LJIIIIZZ(string, "getString(R.string.pm_settings)");
        c76029Tsf.LIZ = string;
        c76029Tsf.LIZIZ = (int) (C15380j0.LJIJ(C15380j0.LJIIJJI()) * 0.7d);
        c76029Tsf.LIZJ = true;
        return c76029Tsf;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLILLLLZI = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        int id = v.getId();
        if (id == R.id.kx0) {
            View view = this.LJLL;
            if (view != null) {
                view.setClickable(false);
                AbstractC76169Tuv abstractC76169Tuv = (AbstractC76169Tuv) this.LJLILLLLZI;
                if (abstractC76169Tuv != null) {
                    abstractC76169Tuv.LIZLLL(!this.LJLLLLLL.booleanValue());
                    return;
                }
                return;
            }
            o.LJIJI("mDelegateReceiveFriendMultiHostApplication");
            throw null;
        }
        if (id == R.id.kx4) {
            View view2 = this.LJLLI;
            if (view2 != null) {
                view2.setClickable(false);
                AbstractC76169Tuv abstractC76169Tuv2 = (AbstractC76169Tuv) this.LJLILLLLZI;
                if (abstractC76169Tuv2 == null) {
                    return;
                }
                abstractC76169Tuv2.LJ(!this.LJLZ.booleanValue());
                return;
            }
            o.LJIJI("mDelegateReceiveFriendMultiHostInvite");
            throw null;
        }
        if (id == R.id.kx2) {
            View view3 = this.LJLLILLLL;
            if (view3 != null) {
                view3.setClickable(false);
                AbstractC76169Tuv abstractC76169Tuv3 = (AbstractC76169Tuv) this.LJLILLLLZI;
                if (abstractC76169Tuv3 == null) {
                    return;
                }
                abstractC76169Tuv3.LJFF(!this.LJZ.booleanValue());
                return;
            }
            o.LJIJI("mDelegateReceiveNotFriendMultiHostApplication");
            throw null;
        }
        if (id == R.id.kx6) {
            View view4 = this.LJLLJ;
            if (view4 != null) {
                view4.setClickable(false);
                AbstractC76169Tuv abstractC76169Tuv4 = (AbstractC76169Tuv) this.LJLILLLLZI;
                if (abstractC76169Tuv4 == null) {
                    return;
                }
                abstractC76169Tuv4.LJI(!this.LJZI.booleanValue());
                return;
            }
            o.LJIJI("mDelegateReceiveNotFriendMultiHostInvites");
            throw null;
        }
        if (id != R.id.kx8) {
            return;
        }
        View view5 = this.LJLLL;
        if (view5 != null) {
            view5.setClickable(false);
            AbstractC76169Tuv abstractC76169Tuv5 = (AbstractC76169Tuv) this.LJLILLLLZI;
            if (abstractC76169Tuv5 != null) {
                abstractC76169Tuv5.LIZJ(!this.LJZL.booleanValue());
            }
            Boolean isAllowLiveMultiHostNotifications = this.LJZL;
            o.LJIIIIZZ(isAllowLiveMultiHostNotifications, "isAllowLiveMultiHostNotifications");
            C75642TmQ.LJJL(isAllowLiveMultiHostNotifications.booleanValue());
            return;
        }
        o.LJIJI("mDelegateAllowLiveMultiHostNotifacations");
        throw null;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView
    public final void Al(boolean z, Throwable th, boolean z2) {
        if (!this.mStatusViewValid) {
            return;
        }
        View view = this.LJLLI;
        if (view != null) {
            view.setClickable(true);
            if (z2) {
                C011602u c011602u = this.LJLJJLL;
                if (c011602u != null) {
                    boolean z3 = !z;
                    c011602u.setChecked(z3);
                    this.LJLZ = Boolean.valueOf(z3);
                    C75642TmQ.LJJI("invitation", z3);
                    return;
                }
                o.LJIJI("mSwitchReceiveFriendMultiHostInvite");
                throw null;
            }
            BPP.LIZJ(getContext(), th);
            return;
        }
        o.LJIJI("mDelegateReceiveFriendMultiHostInvite");
        throw null;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView
    public final void Dl(boolean z, Throwable th, boolean z2) {
        if (!this.mStatusViewValid) {
            return;
        }
        View view = this.LJLLILLLL;
        if (view != null) {
            view.setClickable(true);
            if (z2) {
                C011602u c011602u = this.LJLJL;
                if (c011602u != null) {
                    boolean z3 = !z;
                    c011602u.setChecked(z3);
                    this.LJZ = Boolean.valueOf(z3);
                    C75642TmQ.LJJIFFI("application", z3);
                    return;
                }
                o.LJIJI("mSwitchReceiveNotFriendMultiHostApplication");
                throw null;
            }
            BPP.LIZJ(getContext(), th);
            return;
        }
        o.LJIJI("mDelegateReceiveNotFriendMultiHostApplication");
        throw null;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView
    public final void Gl(boolean z, Throwable th, boolean z2) {
        if (!this.mStatusViewValid) {
            return;
        }
        View view = this.LJLLJ;
        if (view != null) {
            view.setClickable(true);
            if (z2) {
                C011602u c011602u = this.LJLJLJ;
                if (c011602u != null) {
                    boolean z3 = !z;
                    c011602u.setChecked(z3);
                    this.LJZI = Boolean.valueOf(z3);
                    C75642TmQ.LJJIFFI("invitation", z3);
                    return;
                }
                o.LJIJI("mSwitchReceiveNotFriendMultiHostInvites");
                throw null;
            }
            BPP.LIZJ(getContext(), th);
            return;
        }
        o.LJIJI("mDelegateReceiveNotFriendMultiHostInvites");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d4x, viewGroup, false);
        View findViewById = LLLLIILL.findViewById(R.id.kwz);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.s…allow_apply_from_friends)");
        this.LJLJJL = (C011602u) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.kx1);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.s…low_apply_from_suggested)");
        this.LJLJL = (C011602u) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.kx3);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.s…_be_invited_from_friends)");
        this.LJLJJLL = (C011602u) findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.kx5);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.s…e_invited_from_suggested)");
        this.LJLJLJ = (C011602u) findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.kx7);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.s…allow_live_notifications)");
        this.LJLJLLL = (C011602u) findViewById5;
        View findViewById6 = LLLLIILL.findViewById(R.id.kx0);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.s…ly_from_friends_delegate)");
        this.LJLL = findViewById6;
        View findViewById7 = LLLLIILL.findViewById(R.id.kx2);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.s…_from_suggested_delegate)");
        this.LJLLILLLL = findViewById7;
        View findViewById8 = LLLLIILL.findViewById(R.id.kx4);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.s…ed_from_friends_delegate)");
        this.LJLLI = findViewById8;
        View findViewById9 = LLLLIILL.findViewById(R.id.kx6);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.s…_from_suggested_delegate)");
        this.LJLLJ = findViewById9;
        View findViewById10 = LLLLIILL.findViewById(R.id.kx8);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.s…e_notifications_delegate)");
        this.LJLLL = findViewById10;
        View findViewById11 = LLLLIILL.findViewById(R.id.dc5);
        o.LJIIIIZZ(findViewById11, "view.findViewById(R.id.f…allow_live_notifications)");
        this.LJLLLL = findViewById11;
        C011602u c011602u = this.LJLJJL;
        C29S c29s = null;
        if (c011602u != null) {
            Boolean isReceiveFriendMultiHostApplication = this.LJLLLLLL;
            o.LJIIIIZZ(isReceiveFriendMultiHostApplication, "isReceiveFriendMultiHostApplication");
            c011602u.setChecked(isReceiveFriendMultiHostApplication.booleanValue());
            C011602u c011602u2 = this.LJLJL;
            if (c011602u2 != null) {
                Boolean isReceiveNotFriendMultiHostApplication = this.LJZ;
                o.LJIIIIZZ(isReceiveNotFriendMultiHostApplication, "isReceiveNotFriendMultiHostApplication");
                c011602u2.setChecked(isReceiveNotFriendMultiHostApplication.booleanValue());
                C011602u c011602u3 = this.LJLJJLL;
                if (c011602u3 != null) {
                    Boolean isReceiveFriendMultiHostInvites = this.LJLZ;
                    o.LJIIIIZZ(isReceiveFriendMultiHostInvites, "isReceiveFriendMultiHostInvites");
                    c011602u3.setChecked(isReceiveFriendMultiHostInvites.booleanValue());
                    C011602u c011602u4 = this.LJLJLJ;
                    if (c011602u4 != null) {
                        Boolean isReceiveNotFriendMultiHostInvites = this.LJZI;
                        o.LJIIIIZZ(isReceiveNotFriendMultiHostInvites, "isReceiveNotFriendMultiHostInvites");
                        c011602u4.setChecked(isReceiveNotFriendMultiHostInvites.booleanValue());
                        C011602u c011602u5 = this.LJLJLLL;
                        if (c011602u5 != null) {
                            Boolean isAllowLiveMultiHostNotifications = this.LJZL;
                            o.LJIIIIZZ(isAllowLiveMultiHostNotifications, "isAllowLiveMultiHostNotifications");
                            c011602u5.setChecked(isAllowLiveMultiHostNotifications.booleanValue());
                            Boolean isReceiveFriendMultiHostInvites2 = this.LJLZ;
                            o.LJIIIIZZ(isReceiveFriendMultiHostInvites2, "isReceiveFriendMultiHostInvites");
                            boolean booleanValue = isReceiveFriendMultiHostInvites2.booleanValue();
                            Boolean isReceiveNotFriendMultiHostInvites2 = this.LJZI;
                            o.LJIIIIZZ(isReceiveNotFriendMultiHostInvites2, "isReceiveNotFriendMultiHostInvites");
                            boolean booleanValue2 = isReceiveNotFriendMultiHostInvites2.booleanValue();
                            Boolean isReceiveFriendMultiHostApplication2 = this.LJLLLLLL;
                            o.LJIIIIZZ(isReceiveFriendMultiHostApplication2, "isReceiveFriendMultiHostApplication");
                            boolean booleanValue3 = isReceiveFriendMultiHostApplication2.booleanValue();
                            Boolean isReceiveNotFriendMultiHostApplication2 = this.LJZ;
                            o.LJIIIIZZ(isReceiveNotFriendMultiHostApplication2, "isReceiveNotFriendMultiHostApplication");
                            C75642TmQ.LJJJ(booleanValue, booleanValue2, booleanValue3, isReceiveNotFriendMultiHostApplication2.booleanValue());
                            View view = this.LJLL;
                            if (view != null) {
                                C16880lQ.LJIIJ(this, view);
                                View view2 = this.LJLLILLLL;
                                if (view2 != null) {
                                    C16880lQ.LJIIJ(this, view2);
                                    View view3 = this.LJLLI;
                                    if (view3 != null) {
                                        C16880lQ.LJIIJ(this, view3);
                                        View view4 = this.LJLLJ;
                                        if (view4 != null) {
                                            C16880lQ.LJIIJ(this, view4);
                                            View view5 = this.LJLLL;
                                            if (view5 != null) {
                                                C16880lQ.LJIIJ(this, view5);
                                                if (this.LL) {
                                                    View view6 = this.LJLLLL;
                                                    if (view6 != null) {
                                                        AbstractC73672Svk.LJJLIIIJLJLI(1700L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS55S0100000_3(view6, 68));
                                                        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(C15380j0.LIZIZ(R.color.aau)), Integer.valueOf(C15380j0.LIZIZ(R.color.aa4)));
                                                        ofObject.setDuration(200L);
                                                        ofObject.setRepeatCount(0);
                                                        ofObject.addUpdateListener(new AUListenerS92S0100000_3(view6, 37));
                                                        ofObject.start();
                                                        this.LL = false;
                                                    } else {
                                                        o.LJIJI("mLayoutAllowNotification");
                                                        throw null;
                                                    }
                                                }
                                                try {
                                                    ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                                                    ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                                                    C10A.LIZIZ(LLLLIILL, this);
                                                    ActivityC45651qj mo49getActivity = mo49getActivity();
                                                    if (mo49getActivity instanceof C29S) {
                                                        c29s = (C29S) mo49getActivity;
                                                    }
                                                    C90903hW.LIZ(c29s);
                                                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                                                } catch (Throwable th) {
                                                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                                }
                                                return LLLLIILL;
                                            }
                                            o.LJIJI("mDelegateAllowLiveMultiHostNotifacations");
                                            throw null;
                                        }
                                        o.LJIJI("mDelegateReceiveNotFriendMultiHostInvites");
                                        throw null;
                                    }
                                    o.LJIJI("mDelegateReceiveFriendMultiHostInvite");
                                    throw null;
                                }
                                o.LJIJI("mDelegateReceiveNotFriendMultiHostApplication");
                                throw null;
                            }
                            o.LJIJI("mDelegateReceiveFriendMultiHostApplication");
                            throw null;
                        }
                        o.LJIJI("mSwitchAllowLiveMultiHostNotifications");
                        throw null;
                    }
                    o.LJIJI("mSwitchReceiveNotFriendMultiHostInvites");
                    throw null;
                }
                o.LJIJI("mSwitchReceiveFriendMultiHostInvite");
                throw null;
            }
            o.LJIJI("mSwitchReceiveNotFriendMultiHostApplication");
            throw null;
        }
        o.LJIJI("mSwitchReceiveFriendMultiHostApplication");
        throw null;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView
    public final void wl(boolean z, Throwable th, boolean z2) {
        if (!this.mStatusViewValid) {
            return;
        }
        View view = this.LJLLL;
        if (view != null) {
            view.setClickable(true);
            if (z2) {
                C011602u c011602u = this.LJLJLLL;
                if (c011602u != null) {
                    c011602u.setChecked(!z);
                    this.LJZL = Boolean.valueOf(!z);
                    return;
                } else {
                    o.LJIJI("mSwitchAllowLiveMultiHostNotifications");
                    throw null;
                }
            }
            BPP.LIZJ(getContext(), th);
            return;
        }
        o.LJIJI("mDelegateAllowLiveMultiHostNotifacations");
        throw null;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView
    public final void xl(boolean z, Throwable th, boolean z2) {
        if (!this.mStatusViewValid) {
            return;
        }
        View view = this.LJLL;
        if (view != null) {
            view.setClickable(true);
            if (z2) {
                C011602u c011602u = this.LJLJJL;
                if (c011602u != null) {
                    boolean z3 = !z;
                    c011602u.setChecked(z3);
                    this.LJLLLLLL = Boolean.valueOf(z3);
                    C75642TmQ.LJJI("application", z3);
                    return;
                }
                o.LJIJI("mSwitchReceiveFriendMultiHostApplication");
                throw null;
            }
            BPP.LIZJ(getContext(), th);
            return;
        }
        o.LJIJI("mDelegateReceiveFriendMultiHostApplication");
        throw null;
    }
}
