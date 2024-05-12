package kotlin.jvm.internal;

import X.ARI;
import X.ARN;
import X.AbstractC029409q;
import X.AbstractC65781Prl;
import X.AnonymousClass030;
import X.C16880lQ;
import X.C26045AKb;
import X.C26227ARb;
import X.C45804HyK;
import X.C68517Qun;
import X.C68710Qxu;
import X.C68971R5b;
import X.C76800UCe;
import X.C85531XhX;
import X.InterfaceC88472Yns;
import X.R58;
import X.R59;
import X.R5Q;
import X.UC0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import com.zhiliaoapp.musically.R;
import java.util.Set;

/* loaded from: classes12.dex */
public class AqS2S0311000_11 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(ARN it) {
        Activity LJIJJ;
        Bundle bundle;
        o.LJIIIZ(it, "it");
        if (this.i4 < 0) {
            return;
        }
        if (this.z3) {
            C68517Qun.LIZ.LJIILLIIL(((BaseLoginMethod) this.l0).getUid());
        }
        ((C85531XhX) this.l1).LJLLLLLL();
        if (((C85531XhX) this.l1).LJLIL.size() == 0 && (LJIJJ = C45804HyK.LJIJJ((Context) this.l2)) != null) {
            C85531XhX c85531XhX = (C85531XhX) this.l1;
            LJIJJ.finish();
            Intent intent = LJIJJ.getIntent();
            if (intent == null || (bundle = C16880lQ.LJJLIIIIJ(intent, "origin_bundle")) == null) {
                bundle = new Bundle();
            }
            if (c85531XhX.LJLJJL.hv0() && !c85531XhX.LJLJJL.gv0()) {
                C68971R5b.LIZJ(LJIJJ, bundle, true, true, false);
            }
        }
    }

    public static final Object invoke$0(AqS2S0311000_11 aqS2S0311000_11, Object obj) {
        R58 r58;
        int intValue = ((Number) obj).intValue();
        LoginMethodListFragment loginMethodListFragment = (LoginMethodListFragment) aqS2S0311000_11.l0;
        BaseLoginMethod baseLoginMethod = (BaseLoginMethod) aqS2S0311000_11.l1;
        int i = aqS2S0311000_11.i4;
        View view = (View) aqS2S0311000_11.l2;
        if (!aqS2S0311000_11.z3) {
            r58 = new R58(loginMethodListFragment, baseLoginMethod, i, view);
        } else {
            R5Q.LIZLLL(Integer.valueOf(intValue), false);
            r58 = null;
        }
        loginMethodListFragment.LJIJ();
        if (intValue != 8 && intValue != 10) {
            if (intValue != 1011) {
                if (intValue != 2029) {
                    if (intValue != 2035) {
                        AnonymousClass030.LJ(view, R.string.jes);
                    } else if (r58 != null) {
                        r58.invoke();
                    } else {
                        AnonymousClass030.LJ(view, R.string.jes);
                    }
                } else {
                    Context context = loginMethodListFragment.getContext();
                    if (context != null) {
                        C26227ARb c26227ARb = new C26227ARb(context);
                        c26227ARb.LJ(R.string.jer);
                        c26227ARb.LJII = true;
                        c26227ARb.LJIIIIZZ = true;
                        c26227ARb.LIZ(R.string.jeq);
                        UC0.LIZJ(c26227ARb, R59.LJLIL);
                        c26227ARb.LJI().LIZLLL();
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            } else {
                AbstractC029409q adapter = ((RecyclerView) loginMethodListFragment._$_findCachedViewById(R.id.gif)).getAdapter();
                o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.rememberaccount.RememberAccountAdapter");
                Context context2 = view.getContext();
                o.LJIIIIZZ(context2, "view.context");
                ((C85531XhX) adapter).LJLZ(i, context2, baseLoginMethod, true);
            }
        } else {
            C68710Qxu c68710Qxu = C68710Qxu.LIZ;
            String uid = baseLoginMethod.getUid();
            synchronized (c68710Qxu) {
                o.LJIIIZ(uid, "uid");
                Set<String> set = C68710Qxu.LIZJ;
                set.add(uid);
                ((Keva) C68710Qxu.LIZIZ.getValue()).storeStringSet("refresh_key", set);
            }
            if (!baseLoginMethod.isHistoryLogin()) {
                AbstractC029409q adapter2 = ((RecyclerView) loginMethodListFragment._$_findCachedViewById(R.id.gif)).getAdapter();
                o.LJII(adapter2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.rememberaccount.RememberAccountAdapter");
                Context context3 = view.getContext();
                o.LJIIIIZZ(context3, "view.context");
                ((C85531XhX) adapter2).LJLZ(i, context3, baseLoginMethod, false);
            } else {
                C26045AKb c26045AKb = new C26045AKb(view);
                c26045AKb.LJIIIIZZ(R.string.j_v);
                c26045AKb.LIZ(true);
                c26045AKb.LJIIJ();
                loginMethodListFragment.Jl(baseLoginMethod);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS2S0311000_11 aqS2S0311000_11, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.j_t, new AqS2S0311000_11(aqS2S0311000_11.i4, aqS2S0311000_11.z3, (BaseLoginMethod) aqS2S0311000_11.l0, (C85531XhX) aqS2S0311000_11.l1, (Context) aqS2S0311000_11.l2, 2));
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS2S0311000_11 aqS2S0311000_11, Object obj) {
        aqS2S0311000_11.invoke$0((ARN) obj);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S0311000_11(int i, View view, BaseLoginMethod baseLoginMethod, LoginMethodListFragment loginMethodListFragment, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = loginMethodListFragment;
        this.l1 = baseLoginMethod;
        this.i4 = i;
        this.l2 = view;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S0311000_11(int i, boolean z, BaseLoginMethod baseLoginMethod, C85531XhX c85531XhX, Context context, int i2) {
        super(1);
        this.$t = i2;
        this.i4 = i;
        this.z3 = z;
        this.l0 = baseLoginMethod;
        this.l1 = c85531XhX;
        this.l2 = context;
    }
}
