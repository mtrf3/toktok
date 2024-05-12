package com.ss.android.ugc.profile.platform.base.assemble.other;

import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C234999Kd;
import X.C237259Sv;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VA;
import X.C8VB;
import X.C8YN;
import X.C9BE;
import X.C9II;
import X.C9KQ;
import X.C9KS;
import X.C9KT;
import X.EnumC235129Kq;
import X.ORZ;
import X.TBT;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS28S0210000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserProfileInfoAssemV2 extends Hilt_UserProfileInfoAssemV2 {
    public final C214298b3 LJLJJLL;
    public Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2
    public void _$_clearFindViewByIdCache() {
        this.LJLJL.clear();
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2
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

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2
    public String getEnterFrom() {
        return "others_homepage";
    }

    @Override // com.ss.android.ugc.profile.platform.base.assemble.other.Hilt_UserProfileInfoAssemV2, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        C8YN.LJII(this, F3(), new TBT() { // from class: X.9KU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PM) obj).LLIIL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 215), 4);
        C8YN.LJII(this, F3(), new TBT() { // from class: X.9KR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PM) obj).LJLLILLLL;
            }
        }, null, new AqS186S0100000_4(this, 216), 6);
    }

    @Override // com.ss.android.ugc.profile.platform.base.assemble.other.Hilt_UserProfileInfoAssemV2, com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2, X.InterfaceC235069Kk, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public UserProfileInfoAssemV2() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfilePlatformViewModel.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 923), C9II.INSTANCE, null);
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2
    public void C3() {
        C9KT c9kt = C9KT.LJLIL;
        Class<UserProfileInfoAssemV2> cls = UserProfileInfoAssemV2.class;
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
        LIZLLL.LJI((Class) LJLLJ, c9kt);
    }

    @Override // X.C8VB
    /* renamed from: E3, reason: merged with bridge method [inline-methods] */
    public C234999Kd defaultObservableData() {
        return new C234999Kd(0);
    }

    public final ProfilePlatformViewModel F3() {
        return (ProfilePlatformViewModel) this.LJLJJLL.getValue();
    }

    @Override // X.InterfaceC235069Kk
    public void xg() {
        C9KS c9ks = C9KS.LJLIL;
        Class<UserProfileInfoAssemV2> cls = UserProfileInfoAssemV2.class;
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
        LIZLLL.LJI((Class) LJLLJ, c9ks);
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2
    public void A3() {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && LIZLLL.isDetached()) {
            C237259Sv.LJII("UserProfileInfoAssemV2.sendRefreshEvent");
        } else {
            F3().setState(C9KQ.LJLIL);
        }
    }

    @Override // X.InterfaceC235069Kk
    public void hh(int i, EnumC235129Kq action) {
        o.LJIIIZ(action, "action");
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && LIZLLL.isDetached()) {
            C237259Sv.LJII("UserProfileInfoAssemV2.fetchProfileInfo");
        } else {
            ProfilePlatformViewModel.mv0(F3(), i, action, null, 9);
        }
    }

    @Override // X.InterfaceC235069Kk
    public void Jh(User user, EnumC235129Kq action, boolean z) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(action, "action");
        AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(user, action, 110);
        Class<UserProfileInfoAssemV2> cls = UserProfileInfoAssemV2.class;
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

    @Override // X.InterfaceC235069Kk
    public void X6(User user, EnumC235129Kq action, boolean z) {
        o.LJIIIZ(action, "action");
        if (user == null) {
            return;
        }
        AqS28S0210000_4 aqS28S0210000_4 = new AqS28S0210000_4(user, action, z, 4);
        Class<UserProfileInfoAssemV2> cls = UserProfileInfoAssemV2.class;
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
        LIZLLL.LJI((Class) LJLLJ, aqS28S0210000_4);
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2
    public void v3(int i, EnumC235129Kq action, String methodFrom) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(methodFrom, "methodFrom");
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && LIZLLL.isDetached()) {
            C237259Sv.LJII("MineProfileInfoAssemV2.fetchProfilePlatformInfo");
        } else {
            ProfilePlatformViewModel.mv0(F3(), i, action, methodFrom, 1);
        }
    }
}
