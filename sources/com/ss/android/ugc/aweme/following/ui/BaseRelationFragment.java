package com.ss.android.ugc.aweme.following.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C221108m2;
import X.C252569vg;
import X.C25678A5y;
import X.C26415AYh;
import X.C26416AYi;
import X.C26417AYj;
import X.C29S;
import X.C38333F2r;
import X.C3C5;
import X.C53299Kvv;
import X.C62822Ol8;
import X.C73305Spp;
import X.C73306Spq;
import X.C76532zR;
import X.C76800UCe;
import X.C78685UuP;
import X.C78966Uyw;
import X.C90903hW;
import X.HG3;
import X.InterfaceC26369AWn;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class BaseRelationFragment extends JediBaseFragment implements InterfaceC26369AWn {
    public boolean LJLIL;
    public String LJLILLLLZI;
    public User LJLJI;
    public boolean LJLJJI;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public String LJLJJL = "";
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 352));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 353));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 350));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 351));

    public abstract int Al();

    public int Dl() {
        return 0;
    }

    public void Jl() {
    }

    public abstract void LJ();

    public void LJJIJL() {
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public String getEnterFrom() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract int wl();

    public abstract int xl();

    public final String Gl() {
        String str = (String) this.LJLJL.getValue();
        if (C78685UuP.LJJJZ(str)) {
            return str;
        }
        if (Hl()) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    public final boolean Hl() {
        String str = this.LJLILLLLZI;
        if (str == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("uid");
            } else {
                str = null;
            }
        }
        this.LJLILLLLZI = str;
        return TextUtils.equals(str, HG3.LJIILL().getCurUserId());
    }

    public final boolean Il() {
        return ((Boolean) this.LJLJJLL.getValue()).booleanValue();
    }

    public final void Kl() {
        LJ();
        C76532zR.LIZ(getContext(), getEnterFrom());
    }

    @Override // X.InterfaceC26369AWn
    public final void LJJJJ() {
        if (!isViewValid()) {
            return;
        }
        LJ();
        this.LJLJJI = false;
    }

    @Override // X.InterfaceC26369AWn
    public final boolean LJJ() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC26369AWn
    public final void d1(boolean z) {
        this.LJLJJI = z;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("uid", "");
            o.LJIIIIZZ(string, "it.getString(IntentConstants.EXTRA_USER_ID, \"\")");
            this.LJLJJL = string;
            this.LJLILLLLZI = arguments.getString("uid");
        }
        this.LJLJI = C78966Uyw.LJLJJLL;
    }

    public final C73306Spq vl(String str) {
        String str2;
        C73306Spq c73306Spq = new C73306Spq();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_no_access;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        Context context = getContext();
        if (context == null || (str2 = context.getString(R.string.caj)) == null) {
            str2 = "";
        }
        c73306Spq.LJFF = str2;
        c73306Spq.LJI = str;
        return c73306Spq;
    }

    public final void Ll(C73305Spp c73305Spp, Exception e) {
        User user;
        o.LJIIIZ(e, "e");
        String str = "";
        if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                C25678A5y.LIZ(mo49getActivity, getEnterFrom(), e, c73305Spp);
            }
            c73305Spp.setVisibility(0);
            if (C53299Kvv.LIZJ()) {
                c73305Spp.setLayoutVariant(0);
            }
            if (Hl() || getContext() == null) {
                C252569vg.LIZ(c73305Spp, getEnterFrom(), e, new C26415AYh(this));
                return;
            }
            if (e instanceof C38333F2r) {
                User user2 = this.LJLJI;
                if (user2 != null) {
                    C38333F2r c38333F2r = (C38333F2r) e;
                    if (c38333F2r.getErrorCode() == 2077 && user2.isBlock) {
                        str = getString(R.string.car);
                        o.LJIIIIZZ(str, "getString(R.string.block_user_empty_info)");
                    } else if (c38333F2r.getErrorCode() == 2078 && user2.isBlocked()) {
                        str = getString(R.string.hji);
                        o.LJIIIIZZ(str, "getString(R.string.is_blocked_empty_info)");
                    } else if (c38333F2r.getErrorCode() == 2096) {
                        str = getString(Dl());
                        o.LJIIIIZZ(str, "getString(getPermissionErrorTextId())");
                    } else if (!TextUtils.isEmpty(c38333F2r.getErrorMsg())) {
                        str = c38333F2r.getErrorMsg();
                        o.LJIIIIZZ(str, "exception.errorMsg");
                    } else {
                        C252569vg.LIZ(c73305Spp, getEnterFrom(), e, new C26416AYi(this));
                        return;
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    c73305Spp.setStatus(vl(str));
                    return;
                } else {
                    c73305Spp.setStatus((C73306Spq) this.LJLJLLL.getValue());
                    return;
                }
            }
            C252569vg.LIZ(c73305Spp, getEnterFrom(), e, new C26417AYj(this));
            return;
        }
        if (Hl() || getContext() == null) {
            c73305Spp.setStatus((C73306Spq) this.LJLJLLL.getValue());
            return;
        }
        if ((e instanceof C38333F2r) && (user = this.LJLJI) != null) {
            C38333F2r c38333F2r2 = (C38333F2r) e;
            if (c38333F2r2.getErrorCode() == 2077 && user.isBlock) {
                str = getString(R.string.car);
                o.LJIIIIZZ(str, "getString(R.string.block_user_empty_info)");
            } else if (c38333F2r2.getErrorCode() == 2078 && user.isBlocked()) {
                str = getString(R.string.hji);
                o.LJIIIIZZ(str, "getString(R.string.is_blocked_empty_info)");
            } else if (c38333F2r2.getErrorCode() == 2096) {
                str = getString(Dl());
                o.LJIIIIZZ(str, "getString(getPermissionErrorTextId())");
            } else if (!TextUtils.isEmpty(c38333F2r2.getErrorMsg())) {
                str = c38333F2r2.getErrorMsg();
                o.LJIIIIZZ(str, "exception.errorMsg");
            }
        }
        c73305Spp.setVisibility(0);
        if (!TextUtils.isEmpty(str)) {
            c73305Spp.setStatus(vl(str));
        } else {
            c73305Spp.setStatus((C73306Spq) this.LJLJLLL.getValue());
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, Al(), viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
