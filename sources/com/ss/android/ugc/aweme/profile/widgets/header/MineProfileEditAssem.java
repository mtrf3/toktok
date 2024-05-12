package com.ss.android.ugc.aweme.profile.widgets.header;

import X.AFB;
import X.AV1;
import X.ActivityC45651qj;
import X.C188727au;
import X.C198577qn;
import X.C212428Vi;
import X.C234999Kd;
import X.C235079Kl;
import X.C246079lD;
import X.C255199zv;
import X.C255209zw;
import X.C44384HbQ;
import X.C51645KOr;
import X.C55096Ljo;
import X.C55230Lly;
import X.C5S1;
import X.C65352Pkq;
import X.C78939UyV;
import X.C8VA;
import X.C8VB;
import X.C8VC;
import X.C9IF;
import X.C9KV;
import X.C9MU;
import X.C9MV;
import X.C9MW;
import X.C9MX;
import X.EnumC234329Ho;
import X.EnumC26164AOq;
import X.FMX;
import X.HG3;
import X.InterfaceC235069Kk;
import X.InterfaceC26189APp;
import X.OJD;
import X.ORZ;
import X.QD3;
import X.TBT;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserPresenter;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS94S0101000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes5.dex */
public final class MineProfileEditAssem extends ProfileCTASingleComponent implements C9MW, InterfaceC26189APp, IMineProfileEditAbility {
    public static final C9MV LJLJLJ = new Object() { // from class: X.9MV
    };
    public UserPresenter LJLJJI;
    public TextView LJLJJL;
    public ProfileViewModel LJLJJLL;
    public Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // X.InterfaceC26189APp
    public void FI(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public void _$_clearFindViewByIdCache() {
        this.LJLJL.clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C9MW, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    @Override // X.InterfaceC26189APp
    public void vb0(String str, boolean z) {
    }

    private final UserPresenter P3() {
        if (this.LJLJJI == null) {
            UserPresenter userPresenter = new UserPresenter(EnumC26164AOq.PROFILE.getValue());
            this.LJLJJI = userPresenter;
            userPresenter.bindView(this);
        }
        UserPresenter userPresenter2 = this.LJLJJI;
        o.LJI(userPresenter2);
        return userPresenter2;
    }

    private final void Q3() {
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9Jk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PL) obj).LIZLLL;
            }
        }, new AqS170S0100000_4(this, 704));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9Jm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 705));
    }

    @Override // X.C8VB
    /* renamed from: M3, reason: merged with bridge method [inline-methods] */
    public C198577qn defaultObservableData() {
        return new C198577qn(null);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public void componentClick() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "click_edit_profile");
        FMX.LJIIL("enter_profile_edit", c188727au.LIZ);
        C255209zw.LIZJ();
        O3(null);
    }

    public final void N3() {
        String LJJZ;
        if (C255199zv.LJIILIIL()) {
            LJJZ = C44384HbQ.LJJZ(R.string.fk6);
        } else {
            LJJZ = C44384HbQ.LJJZ(R.string.fk7);
        }
        K3(LJJZ);
    }

    public final void R3() {
        User user;
        C255199zv.LIZJ();
        C235079Kl.LIZ((InterfaceC235069Kk) C8VC.LIZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null), null, 3);
        ProfileViewModel profileViewModel = this.LJLJJLL;
        if (profileViewModel != null) {
            profileViewModel.Hv0(C255199zv.LJIILL());
        }
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null && (user = c234999Kd.LIZ) != null) {
            L3(user);
        }
        N3();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public String componentText() {
        if (C255199zv.LJIILIIL()) {
            return C44384HbQ.LJJZ(R.string.fk6);
        }
        return C44384HbQ.LJJZ(R.string.fk7);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            this.LJLJJLL = AFB.LIZ(LIZLLL);
        }
        EventBus.LIZJ().LJIILJJIL(this);
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if (LIZLLL2 != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL2, null), this, IMineProfileEditAbility.class, null);
        }
        ProfileCTASingleComponent.H3(this, null, 1, null);
        Q3();
        updateAccessibilityClassName(Button.class.getName());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), IMineProfileEditAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public EnumC234329Ho v3() {
        return EnumC234329Ho.TEXT;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public C9IF x3() {
        return C9IF.EDIT_PROFILE;
    }

    private final void O3(Bundle bundle) {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        if (AV1.LJIIJJI()) {
            C5S1 c5s1 = new C5S1(LIZ);
            c5s1.LIZLLL(LIZ.getString(R.string.cq5));
            c5s1.LJ();
        } else {
            SmartRoute buildRoute = SmartRouter.buildRoute(LIZ, "aweme://profile_edit");
            o.LJIIIIZZ(buildRoute, "buildRoute(activity, \"aweme://profile_edit\")");
            if (bundle != null) {
                buildRoute.withParam(bundle);
            }
            buildRoute.open();
            SharePrefCache.inst().getIsProfileBubbleShown().LIZLLL(Boolean.FALSE);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.header.IMineProfileEditAbility
    public boolean Ad(String signature) {
        String str;
        User curUser;
        o.LJIIIZ(signature, "signature");
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null && (curUser = LJIILL.getCurUser()) != null) {
            str = curUser.getSignature();
        } else {
            str = null;
        }
        if (!TextUtils.equals(signature, str)) {
            String replace = new OJD("\n+").replace(signature, "\n");
            o.LJI(replace);
            int length = replace.length() - 1;
            if (length >= 0 && replace.charAt(length) == '\n') {
                replace = replace.substring(0, length);
                o.LJIIIIZZ(replace, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            P3().updateSignature(replace);
        }
        return true;
    }

    @Override // X.C9MW
    public void Ca(String str) {
        P3().updateAvatar(str);
    }

    public final void L3(User user) {
        ViewGroup.LayoutParams layoutParams;
        TextView textView = this.LJLJJL;
        if (textView == null || (layoutParams = textView.getLayoutParams()) == null) {
            return;
        }
        if (!C51645KOr.LIZIZ.LJIILL() && !C78939UyV.LJJJJLI(user)) {
            int LJI = C246079lD.LIZ().LJI();
            IECommerceService.LIZ.getClass();
            if (LJI != 1) {
                layoutParams.width = (int) C44384HbQ.LJJJLL(164);
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart((int) C44384HbQ.LJJJLL(4));
                }
                TextView textView2 = this.LJLJJL;
                if (textView2 == null) {
                    return;
                }
                textView2.setPadding(0, 0, 0, 0);
                return;
            }
        }
        layoutParams.width = (int) C44384HbQ.LJJJLL(148);
        int LJJJLL = (int) C44384HbQ.LJJJLL(12);
        TextView textView3 = this.LJLJJL;
        if (textView3 != null) {
            textView3.setPadding(LJJJLL, 0, LJJJLL, 0);
        }
    }

    @QD3
    public final void onClickGuideCardEvent(C9MU c9mu) {
        if (c9mu != null && c9mu.LJLIL == 3) {
            Ad(c9mu.LJLILLLLZI);
        }
    }

    @Override // X.InterfaceC26189APp
    public void Pp0(User user, int i) {
        String str;
        if (i != 0) {
            if (i != 2) {
                return;
            }
            C9MX c9mx = (C9MX) C8VC.LJII(this, C65352Pkq.LIZ(C9MX.class));
            if (c9mx != null) {
                if (user != null) {
                    str = user.getSignature();
                } else {
                    str = null;
                }
                c9mx.W8(0, str);
            }
            R3();
            return;
        }
        R3();
    }

    @Override // X.InterfaceC26189APp
    public void Xa(Exception exc, int i) {
        if (i == 4) {
            AqS94S0101000_4 aqS94S0101000_4 = new AqS94S0101000_4(exc, i, 13);
            Class<MineProfileEditAssem> cls = MineProfileEditAssem.class;
            Class<?>[] interfaces = cls.getInterfaces();
            o.LJIIIIZZ(interfaces, "currentClass.interfaces");
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 : interfaces) {
                if (C8VB.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
            while (arrayList.isEmpty()) {
                cls = cls.getSuperclass();
                if (cls == null) {
                    return;
                }
                Class<?>[] interfaces2 = cls.getInterfaces();
                o.LJIIIIZZ(interfaces2, "currentClass.interfaces");
                arrayList = new ArrayList();
                for (Class<?> cls3 : interfaces2) {
                    if (C8VB.class.isAssignableFrom(cls3)) {
                        arrayList.add(cls3);
                    }
                }
            }
            C8VA LIZLLL = getSupervisor().LIZLLL();
            Object LJLLJ = ORZ.LJLLJ(arrayList);
            o.LJII(LJLLJ, "null cannot be cast to non-null type java.lang.Class<out com.bytedance.assem.arch.service.AssemObservableService<DATA of com.bytedance.assem.arch.service.AssemServiceExtKt.setAssemServiceState>>");
            LIZLLL.LJI((Class) LJLLJ, aqS94S0101000_4);
        }
    }
}
