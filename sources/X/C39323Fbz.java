package X;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.preinstall.attribution.tasks.GoogleReferrerTask$execute$1$onInstallReferrerSetupFinished$1", f = "GoogleReferrerTask.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Fbz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39323Fbz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C39324Fc0 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39323Fbz(C39324Fc0 c39324Fc0, int i, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c39324Fc0;
        this.LJLILLLLZI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C39323Fbz(this.LJLIL, this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C39324Fc0 c39324Fc0 = this.LJLIL;
        C39322Fby c39322Fby = c39324Fc0.LIZ;
        int i = this.LJLILLLLZI;
        InstallReferrerClient referrerClient = c39324Fc0.LIZIZ;
        o.LJIIIIZZ(referrerClient, "referrerClient");
        C39316Fbs c39316Fbs = this.LJLIL.LIZJ;
        c39322Fby.getClass();
        C39325Fc1 c39325Fc1 = c39316Fbs.LIZJ;
        c39325Fc1.LJLIL = i;
        if (i == 0) {
            try {
                try {
                    ReferrerDetails installReferrer = referrerClient.getInstallReferrer();
                    if (installReferrer == null) {
                        referrerClient.endConnection();
                    } else {
                        try {
                            String installReferrer2 = installReferrer.getInstallReferrer();
                            if (installReferrer2 == null) {
                                installReferrer2 = "";
                            }
                            c39325Fc1.LJLILLLLZI = installReferrer2;
                            c39325Fc1.LJLJI = installReferrer.getInstallBeginTimestampSeconds();
                            c39325Fc1.LJLJJI = installReferrer.getInstallBeginTimestampServerSeconds();
                            c39325Fc1.LJLJJL = installReferrer.getReferrerClickTimestampSeconds();
                            c39325Fc1.LJLJJLL = installReferrer.getReferrerClickTimestampServerSeconds();
                            String installVersion = installReferrer.getInstallVersion();
                            if (installVersion == null) {
                                installVersion = "-1";
                            }
                            c39325Fc1.LJLJL = installVersion;
                        } catch (Exception unused) {
                        }
                        referrerClient.endConnection();
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    c39325Fc1.LJLIL = -100;
                    referrerClient.endConnection();
                }
            } catch (Exception unused2) {
            }
        }
        C39324Fc0 c39324Fc02 = this.LJLIL;
        C39322Fby c39322Fby2 = c39324Fc02.LIZ;
        C39316Fbs c39316Fbs2 = c39324Fc02.LIZJ;
        c39322Fby2.getClass();
        C39325Fc1 c39325Fc12 = c39316Fbs2.LIZJ;
        java.util.Map<String, String> map = c39316Fbs2.LIZLLL.LJLJI;
        map.put("referrer", c39325Fc12.LJLILLLLZI);
        map.put("install_begin_time", String.valueOf(c39325Fc12.LJLJI));
        map.put("install_begin_time_server", String.valueOf(c39325Fc12.LJLJJI));
        map.put("referer_click_time", String.valueOf(c39325Fc12.LJLJJL));
        map.put("referrer_click_time_server", String.valueOf(c39325Fc12.LJLJJLL));
        map.put("install_version", String.valueOf(c39325Fc12.LJLJL));
        map.put("state_code", String.valueOf(c39325Fc12.LJLIL));
        this.LJLIL.LIZLLL.countDown();
        return C76800UCe.LIZ;
    }
}
