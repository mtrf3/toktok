package X;

import android.app.job.JobParameters;
import android.content.ServiceConnection;
import android.os.Bundle;

/* renamed from: X.Qg0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67600Qg0 implements Runnable {
    public final /* synthetic */ int LJLIL = 1;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;

    public final void LIZ() {
        ServiceConnectionC67601Qg1 serviceConnectionC67601Qg1 = (ServiceConnectionC67601Qg1) this.LJLJJI;
        C67604Qg4 c67604Qg4 = serviceConnectionC67601Qg1.LJLILLLLZI;
        String str = serviceConnectionC67601Qg1.LJLIL;
        InterfaceC67602Qg2 interfaceC67602Qg2 = (InterfaceC67602Qg2) this.LJLILLLLZI;
        c67604Qg4.LIZ.LIZIZ().LJFF();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            if (interfaceC67602Qg2.LJJJZ(bundle) == null) {
                c67604Qg4.LIZ.LIZJ().LJFF.LIZ("Install Referrer Service returned a null response");
            }
        } catch (Exception e) {
            c67604Qg4.LIZ.LIZJ().LJFF.LIZIZ(e.getMessage(), "Exception occurred while retrieving the Install Referrer");
        }
        c67604Qg4.LIZ.LIZIZ().LJFF();
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        switch (this.LJLIL) {
            case 0:
                try {
                    LIZ();
                    throw null;
                } catch (Throwable th) {
                    if (C39223FaN.LIZ(th)) {
                        return;
                    } else {
                        throw th;
                    }
                }
            default:
                try {
                    C67597Qfx c67597Qfx = (C67597Qfx) this.LJLILLLLZI;
                    C67280Qaq c67280Qaq = (C67280Qaq) this.LJLJI;
                    JobParameters jobParameters = (JobParameters) this.LJLJJI;
                    c67597Qfx.getClass();
                    c67280Qaq.LJIILIIL.LIZ("AppMeasurementJobService processed last upload request.");
                    ((InterfaceC67599Qfz) c67597Qfx.LIZ).LJJ(jobParameters);
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
        }
    }

    public /* synthetic */ RunnableC67600Qg0(C67597Qfx c67597Qfx, C67280Qaq c67280Qaq, JobParameters jobParameters) {
        this.LJLILLLLZI = c67597Qfx;
        this.LJLJI = c67280Qaq;
        this.LJLJJI = jobParameters;
    }

    public RunnableC67600Qg0(ServiceConnectionC67601Qg1 serviceConnectionC67601Qg1, InterfaceC67602Qg2 interfaceC67602Qg2, ServiceConnection serviceConnection) {
        this.LJLJJI = serviceConnectionC67601Qg1;
        this.LJLILLLLZI = interfaceC67602Qg2;
        this.LJLJI = serviceConnection;
    }
}
