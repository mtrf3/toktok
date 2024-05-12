package X;

import com.bytedance.pumbaa.common.interfaces.IAppLog;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.bytedance.pumbaa.common.interfaces.IExceptionMonitor;
import com.bytedance.pumbaa.common.interfaces.ILogger;
import com.bytedance.pumbaa.common.interfaces.IStore;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Pyw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66226Pyw extends F9E {
    public final InterfaceC65784Pro<String> LJLIL;
    public final InterfaceC65784Pro<String> LJLILLLLZI;
    public final InterfaceC65784Pro<String> LJLJI;
    public final InterfaceC65784Pro<String> LJLJJI;
    public final InterfaceC65784Pro<String> LJLJJL;
    public final InterfaceC65784Pro<Long> LJLJJLL;
    public final InterfaceC65784Pro<Long> LJLJL;
    public final java.util.Map<String, InterfaceC65784Pro<Boolean>> LJLJLJ;
    public final InterfaceC65784Pro<String> LJLJLLL;
    public final InterfaceC65784Pro<Boolean> LJLL;
    public final String LJLLI;
    public final InterfaceC65784Pro<java.util.Set<String>> LJLLILLLL;
    public final InterfaceC65784Pro<java.util.Set<String>> LJLLJ;
    public final InterfaceC88472Yns<Object, C76800UCe> LJLLL;
    public final InterfaceC88472Yns<Object, C76800UCe> LJLLLL;
    public final ILogger LJLLLLLL;
    public final IAppLog LJLZ;
    public final IEventMonitor LJZ;
    public final IStore LJZI;
    public final IExceptionMonitor LJZL;
    public final Object LL;
    public final Object LLD;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, this.LJLLLL, this.LJLLLLLL, this.LJLZ, this.LJZ, this.LJZI, this.LJZL, this.LL, this.LLD};
    }

    public /* synthetic */ C66226Pyw(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC65784Pro interfaceC65784Pro3, InterfaceC65784Pro interfaceC65784Pro4, InterfaceC65784Pro interfaceC65784Pro5, InterfaceC65784Pro interfaceC65784Pro6, InterfaceC65784Pro interfaceC65784Pro7, java.util.Map map, InterfaceC65784Pro interfaceC65784Pro8, PRA pra, String str, C37205Eiv c37205Eiv, C37206Eiw c37206Eiw, C58606MzK c58606MzK, int i) {
        this(interfaceC65784Pro, interfaceC65784Pro2, interfaceC65784Pro3, interfaceC65784Pro4, interfaceC65784Pro5, (i & 32) != 0 ? C66228Pyy.LJLIL : interfaceC65784Pro6, (i & 64) != 0 ? C66230Pz0.LJLIL : interfaceC65784Pro7, map, (i & 256) != 0 ? null : interfaceC65784Pro8, (i & 512) != 0 ? null : pra, (i & 1024) != 0 ? CardStruct.IStatusCode.DEFAULT : str, (i & 2048) != 0 ? null : c37205Eiv, (i & 4096) != 0 ? null : c37206Eiw, null, (i & 16384) == 0 ? c58606MzK : null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C66226Pyw(InterfaceC65784Pro<String> deviceIdGetter, InterfaceC65784Pro<String> userIdGetter, InterfaceC65784Pro<String> userRegionGetter, InterfaceC65784Pro<String> currentRegionGetter, InterfaceC65784Pro<String> regionSourceGetter, InterfaceC65784Pro<Long> currentTimeMillisGetter, InterfaceC65784Pro<Long> usedTime, java.util.Map<String, ? extends InterfaceC65784Pro<Boolean>> map, InterfaceC65784Pro<String> interfaceC65784Pro, InterfaceC65784Pro<Boolean> interfaceC65784Pro2, String domainListVersion, InterfaceC65784Pro<? extends java.util.Set<String>> interfaceC65784Pro3, InterfaceC65784Pro<? extends java.util.Set<String>> interfaceC65784Pro4, InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns2, ILogger iLogger, IAppLog iAppLog, IEventMonitor iEventMonitor, IStore iStore, IExceptionMonitor iExceptionMonitor, Object obj, Object obj2) {
        o.LJIIIZ(deviceIdGetter, "deviceIdGetter");
        o.LJIIIZ(userIdGetter, "userIdGetter");
        o.LJIIIZ(userRegionGetter, "userRegionGetter");
        o.LJIIIZ(currentRegionGetter, "currentRegionGetter");
        o.LJIIIZ(regionSourceGetter, "regionSourceGetter");
        o.LJIIIZ(currentTimeMillisGetter, "currentTimeMillisGetter");
        o.LJIIIZ(usedTime, "usedTime");
        o.LJIIIZ(domainListVersion, "domainListVersion");
        this.LJLIL = deviceIdGetter;
        this.LJLILLLLZI = userIdGetter;
        this.LJLJI = userRegionGetter;
        this.LJLJJI = currentRegionGetter;
        this.LJLJJL = regionSourceGetter;
        this.LJLJJLL = currentTimeMillisGetter;
        this.LJLJL = usedTime;
        this.LJLJLJ = map;
        this.LJLJLLL = interfaceC65784Pro;
        this.LJLL = interfaceC65784Pro2;
        this.LJLLI = domainListVersion;
        this.LJLLILLLL = interfaceC65784Pro3;
        this.LJLLJ = interfaceC65784Pro4;
        this.LJLLL = interfaceC88472Yns;
        this.LJLLLL = interfaceC88472Yns2;
        this.LJLLLLLL = iLogger;
        this.LJLZ = iAppLog;
        this.LJZ = iEventMonitor;
        this.LJZI = iStore;
        this.LJZL = iExceptionMonitor;
        this.LL = obj;
        this.LLD = obj2;
    }
}
