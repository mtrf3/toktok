package com.ss.android.ugc.aweme.profile.widgets.common;

import X.C214298b3;
import X.C234969Ka;
import X.C234999Kd;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VA;
import X.C8VB;
import X.C9BE;
import X.C9KY;
import X.C9KZ;
import X.C9T4;
import X.EnumC235129Kq;
import X.ORZ;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS28S0210000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserProfileInfoAssem extends Hilt_UserProfileInfoAssem {
    public final C214298b3 LJLJJL;
    public Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.ProfileInfoAssem
    public void _$_clearFindViewByIdCache() {
        this.LJLJJLL.clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.ProfileInfoAssem
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

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.ProfileInfoAssem
    public String getEnterFrom() {
        return "others_homepage";
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.Hilt_UserProfileInfoAssem, com.ss.android.ugc.aweme.profile.widgets.common.ProfileInfoAssem, X.InterfaceC235069Kk, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public UserProfileInfoAssem() {
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 723);
        C65776Prg LIZ = C65352Pkq.LIZ(UserProfileInfoVM.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 722), C234969Ka.INSTANCE, aqS154S0100000_4);
    }

    public final UserProfileInfoVM A3() {
        return (UserProfileInfoVM) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.ProfileInfoAssem
    public void v3() {
        C9KZ c9kz = C9KZ.LJLIL;
        Class<UserProfileInfoAssem> cls = UserProfileInfoAssem.class;
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
        LIZLLL.LJI((Class) LJLLJ, c9kz);
    }

    @Override // X.C8VB
    /* renamed from: x3, reason: merged with bridge method [inline-methods] */
    public C234999Kd defaultObservableData() {
        return new C234999Kd(0);
    }

    @Override // X.InterfaceC235069Kk
    public void xg() {
        C9KY c9ky = C9KY.LJLIL;
        Class<UserProfileInfoAssem> cls = UserProfileInfoAssem.class;
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
        LIZLLL.LJI((Class) LJLLJ, c9ky);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.Hilt_UserProfileInfoAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.9Kb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234989Kc) obj).LJLIL;
            }
        }, null, new AqS170S0100000_4(this, 676), null, new AqS170S0100000_4(this, 677), 10, null);
    }

    @Override // X.InterfaceC235069Kk
    public void hh(int i, EnumC235129Kq action) {
        o.LJIIIZ(action, "action");
        A3().kv0(i, action);
    }

    @Override // X.InterfaceC235069Kk
    public void Jh(User user, EnumC235129Kq action, boolean z) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(action, "action");
        AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(user, action, 88);
        Class<UserProfileInfoAssem> cls = UserProfileInfoAssem.class;
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
        if (!C9T4.LIZ() && user == null) {
            return;
        }
        AqS28S0210000_4 aqS28S0210000_4 = new AqS28S0210000_4(user, action, z, 3);
        Class<UserProfileInfoAssem> cls = UserProfileInfoAssem.class;
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
}
