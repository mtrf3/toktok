package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.preinstall.attribution.manager.PreInstallTrackingManager$executeAllTrackingTasks$1$1", f = "PreInstallTrackingManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Fbg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39304Fbg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C39302Fbe LJLIL;
    public final /* synthetic */ C68322mC LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39304Fbg(C39302Fbe c39302Fbe, C68322mC c68322mC, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c39302Fbe;
        this.LJLILLLLZI = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C39304Fbg(this.LJLIL, this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [T, java.lang.Object] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        long j;
        PackageInfo LLLLLLZ;
        C141335gf.LIZJ(obj);
        C68322mC c68322mC = this.LJLILLLLZI;
        C39302Fbe c39302Fbe = this.LJLIL;
        C39297FbZ c39297FbZ = c39302Fbe.LJLJI;
        Context context = c39302Fbe.LJLJJI;
        String str = c39302Fbe.LJLJJL;
        C39292FbU c39292FbU = c39302Fbe.LJLJJLL;
        c39297FbZ.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C39322Fby(context));
        String str2 = Build.MANUFACTURER;
        if (ujb.o.LJJJJIZL("huawei", str2, true) || ujb.o.LJJJJIZL("honor", str2, true)) {
            arrayList.add(new C39315Fbr(context));
        }
        arrayList.add(new C39307Fbj(context, c39292FbU.LJ));
        String[] strArr = c39292FbU.LJFF;
        ArrayList arrayList2 = new ArrayList();
        String deviceBrand = Build.BRAND;
        o.LJIIIIZZ(deviceBrand, "deviceBrand");
        if (ujb.o.LJJJJIZL("xiaomi", deviceBrand, true) || ujb.o.LJJJJIZL("redmi", deviceBrand, true)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList2.add(new C39311Fbn(context));
        } else if (!TextUtils.isEmpty(deviceBrand) && ujb.o.LJJJJIZL("samsung", deviceBrand, true)) {
            arrayList2.add(new C39308Fbk(context, strArr));
        } else {
            try {
                Context LLLLL = C16880lQ.LLLLL(context);
                o.LJIIIIZZ(LLLLL, "context.applicationContext");
                PackageManager packageManager = LLLLL.getPackageManager();
                if (packageManager != null) {
                    if (packageManager.hasSystemFeature("com.microsoft.device.display.displaymask")) {
                        arrayList2.add(new C39312Fbo());
                    }
                }
            } catch (Exception unused) {
            }
        }
        ORS.LJJLIIIJILLIZJL(arrayList2, arrayList);
        arrayList.add(new C39313Fbp(context));
        arrayList.add(new C39303Fbf(context, str, c39292FbU.LIZIZ));
        String[] strArr2 = c39292FbU.LIZLLL;
        if (strArr2 != null && strArr2.length != 0) {
            arrayList.add(new C39309Fbl(strArr2));
        }
        arrayList.add(new C39305Fbh(context));
        ORS.LJJLIIIJILLIZJL(c39292FbU.LIZ, arrayList);
        C39318Fbu c39318Fbu = new C39318Fbu(context, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC39320Fbw interfaceC39320Fbw = (InterfaceC39320Fbw) it.next();
            try {
                if (!((C39316Fbs) c39318Fbu.LIZ.getValue()).LJ || interfaceC39320Fbw.LIZIZ()) {
                    interfaceC39320Fbw.LIZ((C39316Fbs) c39318Fbu.LIZ.getValue());
                }
            } catch (Exception e) {
                System.out.println((Object) e.getMessage());
            }
        }
        Context context2 = c39318Fbu.LIZJ;
        C39316Fbs c39316Fbs = (C39316Fbs) c39318Fbu.LIZ.getValue();
        C39310Fbm c39310Fbm = c39316Fbs.LIZ;
        if (c39310Fbm.LJLIL.length() != 0) {
            C39319Fbv c39319Fbv = c39316Fbs.LIZIZ;
            Context LLLLL2 = C16880lQ.LLLLL(context2);
            o.LJIIIIZZ(LLLLL2, "context.applicationContext");
            PackageManager packageManager2 = LLLLL2.getPackageManager();
            Context LLLLL3 = C16880lQ.LLLLL(context2);
            o.LJIIIIZZ(LLLLL3, "context.applicationContext");
            PackageInfo LLLLLLZ2 = C16880lQ.LLLLLLZ(packageManager2, LLLLL3.getPackageName(), 0);
            java.util.Map<String, String> map = c39316Fbs.LIZLLL.LJLIL;
            map.put("preinstall_channel", c39310Fbm.LJLIL);
            map.put("apk_first_install_time", String.valueOf(C37114EhS.LIZ(context2)));
            try {
                LLLLLLZ = C16880lQ.LLLLLLZ(context2.getPackageManager(), context2.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            if (LLLLLLZ != null) {
                j = LLLLLLZ.lastUpdateTime;
                map.put("apk_last_update_time", String.valueOf(j));
                String str3 = LLLLLLZ2.versionName;
                o.LJIIIIZZ(str3, "packageInfo.versionName");
                map.put("app_version", str3);
                map.put("is_factory_preload", c39319Fbv.LJLIL);
                map.put("is_online_preload", c39319Fbv.LJLILLLLZI);
                map.put("is_uninstall_user", String.valueOf(c39310Fbm.LJLJLLL));
                map.put("device_elapsed_real_time", String.valueOf(SystemClock.elapsedRealtime()));
                map.put("campaign", c39310Fbm.LJLILLLLZI);
                map.put("site_id", c39310Fbm.LJLJI);
                map.put("preinstall_version", c39310Fbm.LJLJJI);
                map.put("df_code", String.valueOf(c39310Fbm.LJLLJ));
            }
            j = -1;
            map.put("apk_last_update_time", String.valueOf(j));
            String str32 = LLLLLLZ2.versionName;
            o.LJIIIIZZ(str32, "packageInfo.versionName");
            map.put("app_version", str32);
            map.put("is_factory_preload", c39319Fbv.LJLIL);
            map.put("is_online_preload", c39319Fbv.LJLILLLLZI);
            map.put("is_uninstall_user", String.valueOf(c39310Fbm.LJLJLLL));
            map.put("device_elapsed_real_time", String.valueOf(SystemClock.elapsedRealtime()));
            map.put("campaign", c39310Fbm.LJLILLLLZI);
            map.put("site_id", c39310Fbm.LJLJI);
            map.put("preinstall_version", c39310Fbm.LJLJJI);
            map.put("df_code", String.valueOf(c39310Fbm.LJLLJ));
        }
        c68322mC.element = c39318Fbu.LIZ.getValue();
        return C76800UCe.LIZ;
    }
}
