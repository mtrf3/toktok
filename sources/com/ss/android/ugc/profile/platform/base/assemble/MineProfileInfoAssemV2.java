package com.ss.android.ugc.profile.platform.base.assemble;

import X.C212428Vi;
import X.C214298b3;
import X.C234999Kd;
import X.C235079Kl;
import X.C237259Sv;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VA;
import X.C8VB;
import X.C8YN;
import X.C9BE;
import X.C9IB;
import X.C9IN;
import X.C9KM;
import X.C9KN;
import X.C9KQ;
import X.EnumC235129Kq;
import X.HG3;
import X.ORZ;
import X.RBX;
import X.TBT;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MineProfileInfoAssemV2 extends ProfileInfoAssem2 {
    public final C214298b3 LJLJJI;
    public final C55749LuL LJLJJL;
    public Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // X.InterfaceC235069Kk
    public void Jh(User user, EnumC235129Kq action, boolean z) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(action, "action");
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2
    public void _$_clearFindViewByIdCache() {
        this.LJLJJLL.clear();
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJLL;
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

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2
    public String getEnterFrom() {
        return "personal_homepage";
    }

    @Override // X.InterfaceC235069Kk
    public void hh(int i, EnumC235129Kq action) {
        o.LJIIIZ(action, "action");
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2, X.InterfaceC235069Kk, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public MineProfileInfoAssemV2() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfilePlatformViewModel.class);
        this.LJLJJI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 921), C9IN.INSTANCE, null);
        this.LJLJJL = new C55749LuL(C47704Ins.LJ(this, C9IB.class, null), checkSupervisorPrepared());
    }

    private final C9IB<ProfileComponents> F3() {
        return (C9IB) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2
    public void C3() {
        C9KN c9kn = C9KN.LJLIL;
        Class<MineProfileInfoAssemV2> cls = MineProfileInfoAssemV2.class;
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
        LIZLLL.LJI((Class) LJLLJ, c9kn);
    }

    @Override // X.C8VB
    /* renamed from: E3, reason: merged with bridge method [inline-methods] */
    public C234999Kd defaultObservableData() {
        return new C234999Kd(0);
    }

    public final ProfilePlatformViewModel H3() {
        return (ProfilePlatformViewModel) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC235069Kk
    public void xg() {
        C9KM c9km = C9KM.LJLIL;
        Class<MineProfileInfoAssemV2> cls = MineProfileInfoAssemV2.class;
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
        LIZLLL.LJI((Class) LJLLJ, c9km);
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2
    public void A3() {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && LIZLLL.isDetached()) {
            C237259Sv.LJII("MineProfileInfoAssemV2.sendRefreshEvent");
        } else {
            H3().setState(C9KQ.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C9IB<ProfileComponents> F3 = F3();
        if (F3 == null || !o.LJ(F3.LJLJJL, Boolean.TRUE)) {
            C235079Kl.LIZIZ(this, ((RBX) HG3.LJIILL()).getCurUser(), null, false, 6);
        }
        C8YN.LJII(this, H3(), new TBT() { // from class: X.9KO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PM) obj).LJLLI;
            }
        }, null, new AqS186S0100000_4(this, 212), 6);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.9KP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PM) obj).LJLLILLLL;
            }
        }, null, new AqS186S0100000_4(this, 213), 6);
    }

    @Override // X.InterfaceC235069Kk
    public void X6(User user, EnumC235129Kq action, boolean z) {
        o.LJIIIZ(action, "action");
        if (user == null) {
            return;
        }
        AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(user, action, 109);
        Class<MineProfileInfoAssemV2> cls = MineProfileInfoAssemV2.class;
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
        LIZLLL.LJI((Class) LJLLJ, aqS135S0200000_4);
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2
    public void v3(int i, EnumC235129Kq action, String methodFrom) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(methodFrom, "methodFrom");
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && LIZLLL.isDetached()) {
            C237259Sv.LJII("MineProfileInfoAssemV2.fetchProfilePlatformInfo");
        } else {
            ProfilePlatformViewModel.lv0(H3(), i, action, methodFrom, 1);
        }
    }
}
