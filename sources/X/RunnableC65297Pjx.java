package X;

import com.bytedance.helios.api.config.SampleRateConfig;

/* renamed from: X.Pjx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC65297Pjx implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ SampleRateConfig LJLJJL;

    public RunnableC65297Pjx(String str, long j, String str2, String str3, SampleRateConfig sampleRateConfig) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = sampleRateConfig;
    }

    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("generateSampleRateResults deviceId=");
        LIZ.append(this.LJLIL);
        LIZ.append(" hashCode=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" date=");
        LIZ.append(this.LJLJI);
        LIZ.append(" originalDate=");
        LIZ.append(this.LJLJJI);
        C66063PwJ.LIZIZ("Helios-Common-Env", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("generateSampleRateResults\n");
        LIZ2.append(C39536FfQ.LIZ(this.LJLJJL));
        C66063PwJ.LIZIZ("Helios-Common-Env", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("generateSampleRateResults\n");
        LIZ3.append(C65972Puq.LIZIZ);
        LIZ3.append('\n');
        LIZ3.append(C65972Puq.LIZJ);
        LIZ3.append('\n');
        LIZ3.append(C65972Puq.LIZLLL);
        C66063PwJ.LIZIZ("Helios-Common-Env", X1D.LIZIZ(LIZ3));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
