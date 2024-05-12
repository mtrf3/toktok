package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3x5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100553x5 extends AbstractC65781Prl implements InterfaceC65784Pro<ActivityStatusViewModelImpl> {
    public static final C100553x5 LJLIL = new C100553x5();

    public C100553x5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ActivityStatusViewModelImpl invoke() {
        C3UL LJ = ((InterfaceC100563x6) C1E5.LIZLLL(InterfaceC100563x6.class, C16880lQ.LLLLL(EF7.LIZIZ()))).LJ();
        C98453th c98453th = new C98453th("ActivityStatusViewModel", null, 6);
        C100583x8 c100583x8 = C100583x8.LJLIL;
        C3AL.LIZ.getClass();
        ActivityStatusConfig LIZ = C3AL.LIZ();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C73893SzJ<String> c73893SzJ = new C73893SzJ<>();
        C73893SzJ<String> c73893SzJ2 = new C73893SzJ<>();
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        C73318Sq2 c73318Sq22 = new C73318Sq2();
        AbstractC73946T0k LIZ2 = T16.LIZ();
        o.LJIIIIZZ(LIZ2, "io()");
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        o.LJIIIIZZ(abstractC73946T0k, "computation()");
        LifecycleOwner lifecycleOwner = ProcessLifecycleOwner.get();
        o.LJIIIIZZ(lifecycleOwner, "get()");
        return LJ.LIZ(c98453th, c100583x8, LIZ, concurrentHashMap, concurrentHashMap2, linkedHashMap, linkedHashMap2, c73893SzJ, c73893SzJ2, null, c73318Sq2, c73318Sq22, LIZ2, abstractC73946T0k, lifecycleOwner, C48841JEv.LIZ(EXV.LIZ), true, true);
    }
}
