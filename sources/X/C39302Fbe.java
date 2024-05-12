package X;

import Y.ACallableS79S0101000_7;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer;
import fjb.a;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS3S3000000_11;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.preinstall.attribution.manager.PreInstallTrackingManager$executeAllTrackingTasks$1", f = "PreInstallTrackingManager.kt", l = {C61447O9r.LJIIJ}, m = "invokeSuspend")
/* renamed from: X.Fbe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39302Fbe extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C39297FbZ LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ C39292FbU LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39302Fbe(C39297FbZ c39297FbZ, Context context, String str, C39292FbU c39292FbU, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c39297FbZ;
        this.LJLJJI = context;
        this.LJLJJL = str;
        this.LJLJJLL = c39292FbU;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C39302Fbe(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C68322mC LIZ;
        boolean z;
        String str;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        boolean z2 = true;
        if (i != 0) {
            if (i == 1) {
                LIZ = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            LIZ = C793239k.LIZ(obj);
            LIZ.element = null;
            XIA xia = C78613UtF.LIZJ;
            C39304Fbg c39304Fbg = new C39304Fbg(this, LIZ, null);
            this.LJLIL = LIZ;
            this.LJLILLLLZI = 1;
            if (XKX.LJI(xia, c39304Fbg, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C39296FbY c39296FbY = this.LJLJJLL.LIZJ;
        if (c39296FbY != null) {
            C39316Fbs c39316Fbs = (C39316Fbs) LIZ.element;
            if (c39316Fbs == null) {
                c39316Fbs = new C39316Fbs();
            }
            InitAppsFlyer initAppsFlyer = c39296FbY.LIZ;
            long j = c39296FbY.LIZIZ;
            Context context = c39296FbY.LIZJ;
            InterfaceC39301Fbd interfaceC39301Fbd = c39296FbY.LIZLLL;
            initAppsFlyer.getClass();
            C188727au c188727au = new C188727au();
            c188727au.LJ(System.currentTimeMillis() - j, "time");
            c188727au.LJ(SystemClock.uptimeMillis() - FKB.LJ, "cost_time_from_boot_v1");
            c188727au.LJ(SystemClock.elapsedRealtime() - FKB.LIZ, "cost_time_from_boot_v2");
            FMX.LJIIL("preinstall_lib_finish", c188727au.LIZ);
            initAppsFlyer.LJLJJI = c39316Fbs;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("af-thread*****");
            if (C16880lQ.LLLLIIIILLL().getId() == C16880lQ.LLJJJJ().getThread().getId()) {
                z = true;
            } else {
                z = false;
            }
            LIZ2.append(z);
            X1D.LIZIZ(LIZ2);
            C39310Fbm c39310Fbm = c39316Fbs.LIZ;
            if (!c39310Fbm.LJLJJL || c39310Fbm.LJLJLLL) {
                z2 = false;
            }
            if (!TextUtils.isEmpty(c39310Fbm.LJLIL) && !z2) {
                String str2 = c39310Fbm.LJLIL;
                String str3 = c39310Fbm.LJLILLLLZI;
                String str4 = c39310Fbm.LJLJI;
                TokenCert cert = TokenCert.with("bpea-appsflyer_androidsdk_2019");
                o.LJIIIZ(cert, "cert");
                C1GE.LJIJJ(cert, "AppsFlyer", "setPreinstallAttribution", new AqS3S3000000_11(str2, str3, str4, 1));
            }
            initAppsFlyer.LJ(context, interfaceC39301Fbd);
            C10K.LIZJ(new ACallableS79S0101000_7(2, Boolean.valueOf(c39310Fbm.LJLLI), 0));
            Keva.getRepo("appsflyer_repo").storeBoolean("is_preinstall_app", c39310Fbm.LJLLI);
            String str5 = c39316Fbs.LIZJ.LJLILLLLZI;
            if (str5 != null && str5.contains("utm_source=tt_wallpaper")) {
                FMX.onEventV3("app_install_from_wallpaper");
            }
            InitAppsFlyer.LJII("tiktok_preinstall", c39316Fbs.LIZLLL.LJLIL);
            InitAppsFlyer.LJII("google_install_referrer", c39316Fbs.LIZLLL.LJLJI);
            InitAppsFlyer.LJII("tiktok_preinstall_channel_list", c39316Fbs.LIZLLL.LJLILLLLZI);
            InitAppsFlyer.LJII("samsung_preload", c39316Fbs.LIZLLL.LJLJJI);
            InitAppsFlyer.LJII("manifest_preinstall", c39316Fbs.LIZLLL.LJLJJL);
            InitAppsFlyer.LJII("hw_install_referrer", c39316Fbs.LIZLLL.LJLJJLL);
            HashMap hashMap = new HashMap();
            int i2 = c39316Fbs.LIZ.LJLLJ;
            String str6 = "1";
            if (i2 > 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C116484hg.LIZIZ(hashMap, "is_preload", str, i2, "df_code");
            InitAppsFlyer.LJII("preload_df_result", hashMap);
            C39310Fbm c39310Fbm2 = c39316Fbs.LIZ;
            if (c39310Fbm2.LJLLLLLL) {
                List<String> list = c39310Fbm2.LJLLLL;
                HashMap hashMap2 = new HashMap();
                if (list.isEmpty()) {
                    str6 = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap2.put("is_contract_device", str6);
                hashMap2.put("operator_preload_apps", String.valueOf(list));
                hashMap2.put("preinstall_channel", c39316Fbs.LIZ.LJLIL);
                InitAppsFlyer.LJII("contract_device_check", hashMap2);
            }
        }
        return C76800UCe.LIZ;
    }
}
