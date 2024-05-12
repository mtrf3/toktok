package com.ss.android.ugc.aweme.profile.widgets.common;

import X.C214298b3;
import X.C214528bQ;
import X.C234999Kd;
import X.C235009Ke;
import X.C235019Kf;
import X.C235059Kj;
import X.C235079Kl;
import X.C237089Se;
import X.C47704Ins;
import X.C48841JEv;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78613UtF;
import X.C78926UyI;
import X.C8VA;
import X.C8VB;
import X.C8YN;
import X.C9ID;
import X.EnumC235129Kq;
import X.HG3;
import X.ORZ;
import X.RBX;
import X.TBT;
import X.XKX;
import android.view.View;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.IDqS429S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MineProfileInfoAssem extends ProfileInfoAssem {
    public final C214298b3 LJLJI;
    public final C55749LuL LJLJJI;
    public Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // X.InterfaceC235069Kk
    public void Jh(User user, EnumC235129Kq action, boolean z) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(action, "action");
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.ProfileInfoAssem
    public void _$_clearFindViewByIdCache() {
        this.LJLJJL.clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.ProfileInfoAssem
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJL;
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
        return "personal_homepage";
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.ProfileInfoAssem, X.InterfaceC235069Kk, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public MineProfileInfoAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(MineProfileInfoVM.class);
        this.LJLJI = new C214298b3(new AqS154S0100000_4(LIZ, 720), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C235059Kj.INSTANCE, LIZ);
        this.LJLJJI = new C55749LuL(C47704Ins.LJ(this, C9ID.class, null), checkSupervisorPrepared());
    }

    private final C9ID A3() {
        return (C9ID) this.LJLJJI.getValue();
    }

    private final MineProfileInfoVM C3() {
        return (MineProfileInfoVM) this.LJLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.ProfileInfoAssem
    public void v3() {
        C235019Kf c235019Kf = C235019Kf.LJLIL;
        Class<MineProfileInfoAssem> cls = MineProfileInfoAssem.class;
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
        LIZLLL.LJI((Class) LJLLJ, c235019Kf);
    }

    @Override // X.C8VB
    /* renamed from: x3, reason: merged with bridge method [inline-methods] */
    public C234999Kd defaultObservableData() {
        return new C234999Kd(0);
    }

    @Override // X.InterfaceC235069Kk
    public void xg() {
        C235009Ke c235009Ke = C235009Ke.LJLIL;
        Class<MineProfileInfoAssem> cls = MineProfileInfoAssem.class;
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
        LIZLLL.LJI((Class) LJLLJ, c235009Ke);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.ProfileInfoAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C9ID A3 = A3();
        if (A3 == null || !o.LJ(A3.LJLJJLL, Boolean.TRUE)) {
            C235079Kl.LIZIZ(this, ((RBX) HG3.LJIILL()).getCurUser(), null, false, 6);
        }
        C8YN.LJIIJ(this, C3(), new TBT() { // from class: X.9Kg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C235049Ki) obj).LJLIL;
            }
        }, new TBT() { // from class: X.9Kh
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C235049Ki) obj).LJLILLLLZI;
            }
        }, null, new IDqS429S0100000_4(this, 10), 12);
    }

    @Override // X.InterfaceC235069Kk
    public void hh(int i, EnumC235129Kq action) {
        o.LJIIIZ(action, "action");
        MineProfileInfoVM C3 = C3();
        C3.getClass();
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C237089Se(C3, i, System.currentTimeMillis(), action, null), 3);
    }

    @Override // X.InterfaceC235069Kk
    public void X6(User user, EnumC235129Kq action, boolean z) {
        o.LJIIIZ(action, "action");
        if (user == null) {
            return;
        }
        AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(user, action, 87);
        Class<MineProfileInfoAssem> cls = MineProfileInfoAssem.class;
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
}
