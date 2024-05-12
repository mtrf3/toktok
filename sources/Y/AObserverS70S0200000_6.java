package Y;

import X.AbstractC73391SrD;
import X.C32I;
import X.C35833E4n;
import X.C38987FRv;
import X.E4E;
import X.E4G;
import X.EnumC35839E4t;
import X.InterfaceC79713Ax;
import X.InterfaceC88472Yns;
import X.ORZ;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.aweme.service.proactive.ProactiveTriggersService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class AObserverS70S0200000_6 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$0(Y.AObserverS70S0200000_6 r10, java.lang.Object r11) {
        /*
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r3 = r11.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r3.next()
            X.E4G r0 = (X.E4G) r0
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r0.getValue()
            r9 = 0
            if (r0 == 0) goto L6f
            com.ss.android.ugc.aweme.plugin.IPluginService$ProactiveLoginData r2 = r0.proactiveLoginData
            if (r2 == 0) goto L70
            java.lang.String r5 = r2.titleTextLogin
            java.lang.String r6 = r2.titleTextSignup
        L21:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L34
            java.lang.Object r1 = r10.l0
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L6d
            r0 = 2131842691(0x7f115683, float:1.9318725E38)
            java.lang.String r5 = r1.getString(r0)
        L34:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L47
            java.lang.Object r1 = r10.l0
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L6b
            r0 = 2131842690(0x7f115682, float:1.9318723E38)
            java.lang.String r6 = r1.getString(r0)
        L47:
            java.lang.Object r1 = r10.l1
            X.E4C r1 = (X.E4C) r1
            if (r2 == 0) goto L64
            java.lang.Integer r0 = r2.vvTriggerThreshold
            if (r0 == 0) goto L64
            int r7 = r0.intValue()
        L55:
            java.lang.Long r8 = r2.expirationOffsetStartMillis
            java.lang.Long r9 = r2.expirationOffsetEndtMillis
        L59:
            r1.getClass()
            com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService r4 = com.ss.android.ugc.aweme.service.proactive.ProactiveTriggersService.LJI()
            r4.LIZ(r5, r6, r7, r8, r9)
            goto L6
        L64:
            r7 = 50
            if (r2 == 0) goto L69
            goto L55
        L69:
            r8 = r9
            goto L59
        L6b:
            r6 = r9
            goto L47
        L6d:
            r5 = r9
            goto L34
        L6f:
            r2 = r9
        L70:
            r5 = r9
            r6 = r9
            goto L21
        L73:
            java.lang.Object r0 = r10.l1
            X.E4C r0 = (X.E4C) r0
            X.3Ax r0 = r0.LIZ
            if (r0 == 0) goto L7e
            r0.onComplete()
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS70S0200000_6.onChanged$0(Y.AObserverS70S0200000_6, java.lang.Object):void");
    }

    public static final void onChanged$1(AObserverS70S0200000_6 aObserverS70S0200000_6, Object obj) {
        String str;
        E4G e4g;
        long j;
        long j2;
        String str2;
        String str3;
        IPluginService.ProactiveLoginData proactiveLoginData;
        IPluginService.ProactiveLoginData proactiveLoginData2;
        IPluginService.ProactiveLoginData proactiveLoginData3;
        Long l;
        IPluginService.ProactiveLoginData proactiveLoginData4;
        Long l2;
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            it.next();
            Iterator<E4G> it2 = PluginService.createIPluginServicebyMonsterPlugin(false).getCurrentPluginList().iterator();
            while (true) {
                str = null;
                if (it2.hasNext()) {
                    e4g = it2.next();
                    if (e4g.getType() == EnumC35839E4t.PROACTIVE_LOGIN_SINGLE_TRIGGER) {
                        break;
                    }
                } else {
                    e4g = null;
                    break;
                }
            }
            E4G e4g2 = e4g;
            if (e4g2 == null) {
                break;
            }
            ((E4E) aObserverS70S0200000_6.l0).getClass();
            long LIZ = C38987FRv.LIZ();
            IPluginService.PluginDataWrapper value = e4g2.getValue();
            if (value != null && (proactiveLoginData4 = value.proactiveLoginData) != null && (l2 = proactiveLoginData4.expirationOffsetStartMillis) != null) {
                j = l2.longValue();
            } else {
                j = 0;
            }
            IPluginService.PluginDataWrapper value2 = e4g2.getValue();
            if (value2 != null && (proactiveLoginData3 = value2.proactiveLoginData) != null && (l = proactiveLoginData3.expirationOffsetEndtMillis) != null) {
                j2 = l.longValue();
            } else {
                j2 = 86400000;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (j + LIZ < currentTimeMillis && LIZ + j2 > currentTimeMillis) {
                IPluginService.PluginDataWrapper value3 = e4g2.getValue();
                if (value3 != null && (proactiveLoginData2 = value3.proactiveLoginData) != null) {
                    str2 = proactiveLoginData2.titleTextLogin;
                } else {
                    str2 = null;
                }
                IPluginService.PluginDataWrapper value4 = e4g2.getValue();
                if (value4 != null && (proactiveLoginData = value4.proactiveLoginData) != null) {
                    str3 = proactiveLoginData.titleTextSignup;
                } else {
                    str3 = null;
                }
                if (TextUtils.isEmpty(str2)) {
                    Context context = (Context) aObserverS70S0200000_6.l1;
                    if (context != null) {
                        str2 = context.getString(R.string.pbw);
                    } else {
                        str2 = null;
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    Context context2 = (Context) aObserverS70S0200000_6.l1;
                    if (context2 != null) {
                        str = context2.getString(R.string.pbv);
                    }
                    str3 = str;
                }
                ((E4E) aObserverS70S0200000_6.l0).getClass();
                ProactiveTriggersService.LJI().LIZLLL(str2, str3);
            } else {
                InterfaceC79713Ax interfaceC79713Ax = ((E4E) aObserverS70S0200000_6.l0).LIZ;
                if (interfaceC79713Ax != null) {
                    interfaceC79713Ax.onComplete();
                }
            }
        }
        InterfaceC79713Ax interfaceC79713Ax2 = ((E4E) aObserverS70S0200000_6.l0).LIZ;
        if (interfaceC79713Ax2 != null) {
            interfaceC79713Ax2.onComplete();
        }
    }

    public static final void onChanged$2(AObserverS70S0200000_6 aObserverS70S0200000_6, Object obj) {
        List LLJI = ORZ.LLJI(((Map) obj).values());
        EnumC35839E4t enumC35839E4t = (EnumC35839E4t) aObserverS70S0200000_6.l0;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : LLJI) {
            C35833E4n c35833E4n = (C35833E4n) obj2;
            if (enumC35839E4t == c35833E4n.LIZ && o.LJ(c35833E4n.LIZIZ.showConfig.shouldShow, Boolean.TRUE)) {
                arrayList.add(obj2);
            }
        }
        Observer observer = (Observer) aObserverS70S0200000_6.l1;
        if (arrayList.size() > 0) {
            observer.onChanged(arrayList);
        }
    }

    public static final void onChanged$3(AObserverS70S0200000_6 aObserverS70S0200000_6, Object obj) {
        List LLJI = ORZ.LLJI(((Map) obj).values());
        EnumC35839E4t enumC35839E4t = (EnumC35839E4t) aObserverS70S0200000_6.l0;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : LLJI) {
            if (enumC35839E4t == ((C35833E4n) obj2).LIZ) {
                arrayList.add(obj2);
            }
        }
        Observer observer = (Observer) aObserverS70S0200000_6.l1;
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C35833E4n) it.next()).LIZIZ);
            }
            observer.onChanged(arrayList2);
        }
    }

    public static final void onChanged$4(AObserverS70S0200000_6 aObserverS70S0200000_6, Object obj) {
        List LLJI = ORZ.LLJI(((Map) obj).values());
        EnumC35839E4t enumC35839E4t = (EnumC35839E4t) aObserverS70S0200000_6.l0;
        for (Object obj2 : LLJI) {
            C35833E4n c35833E4n = (C35833E4n) obj2;
            if (enumC35839E4t == c35833E4n.LIZ && o.LJ(c35833E4n.LIZIZ.showConfig.shouldShow, Boolean.TRUE)) {
                if (obj2 != null) {
                    ((Observer) aObserverS70S0200000_6.l1).onChanged(obj2);
                    return;
                }
                return;
            }
        }
    }

    public static final void onChanged$5(AObserverS70S0200000_6 aObserverS70S0200000_6, Object obj) {
        Object obj2;
        List LLJI = ORZ.LLJI(((Map) obj).values());
        EnumC35839E4t enumC35839E4t = (EnumC35839E4t) aObserverS70S0200000_6.l0;
        Iterator it = LLJI.iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (enumC35839E4t == ((C35833E4n) obj2).LIZ) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        C35833E4n c35833E4n = (C35833E4n) obj2;
        if (c35833E4n != null) {
            ((Observer) aObserverS70S0200000_6.l1).onChanged(c35833E4n.LIZIZ);
        }
    }

    public static final void onChanged$6(AObserverS70S0200000_6 aObserverS70S0200000_6, Object obj) {
        Collection values = ((Map) obj).values();
        EnumC35839E4t enumC35839E4t = (EnumC35839E4t) aObserverS70S0200000_6.l0;
        for (Object obj2 : values) {
            C35833E4n c35833E4n = (C35833E4n) obj2;
            if (enumC35839E4t == c35833E4n.LIZ && o.LJ(c35833E4n.LIZIZ.showConfig.shouldShow, Boolean.TRUE)) {
                if (obj2 != null) {
                    ((AbstractC73391SrD) aObserverS70S0200000_6.l1).onNext(obj2);
                    return;
                }
                return;
            }
        }
    }

    public static final void onChanged$7(AObserverS70S0200000_6 aObserverS70S0200000_6, Object obj) {
        Collection values = ((Map) obj).values();
        EnumC35839E4t enumC35839E4t = (EnumC35839E4t) aObserverS70S0200000_6.l0;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : values) {
            C35833E4n c35833E4n = (C35833E4n) obj2;
            if (enumC35839E4t == c35833E4n.LIZ && o.LJ(c35833E4n.LIZIZ.showConfig.shouldShow, Boolean.TRUE)) {
                arrayList.add(obj2);
            }
        }
        AbstractC73391SrD abstractC73391SrD = (AbstractC73391SrD) aObserverS70S0200000_6.l1;
        if (!arrayList.isEmpty()) {
            abstractC73391SrD.onNext(arrayList);
        }
    }

    public static final void onChanged$8(AObserverS70S0200000_6 aObserverS70S0200000_6, Object obj) {
        ((InterfaceC88472Yns) aObserverS70S0200000_6.l0).invoke(obj);
        NUJComponentFragment nUJComponentFragment = (NUJComponentFragment) aObserverS70S0200000_6.l1;
        nUJComponentFragment.getClass();
        ARunnableS42S0100000_6 aRunnableS42S0100000_6 = new ARunnableS42S0100000_6(nUJComponentFragment, 166);
        if (nUJComponentFragment.mo49getActivity() != null) {
            aRunnableS42S0100000_6.run();
        } else {
            nUJComponentFragment.LJLILLLLZI.add(aRunnableS42S0100000_6);
        }
    }

    public AObserverS70S0200000_6(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
