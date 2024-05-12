package X;

import kotlinx.coroutines.JobSupport;

/* renamed from: X.XKq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84664XKq extends AbstractC84652XKe {
    public final JobSupport LJLJJL;
    public final JobSupport.Finishing LJLJJLL;
    public final C84666XKs LJLJL;
    public final Object LJLJLJ;

    @Override // X.XL0
    public final void LJJII(Throwable th) {
        JobSupport jobSupport = this.LJLJJL;
        JobSupport.Finishing finishing = this.LJLJJLL;
        C84666XKs c84666XKs = this.LJLJL;
        Object obj = this.LJLJLJ;
        jobSupport.getClass();
        C84666XKs LJJLIIIJILLIZJL = JobSupport.LJJLIIIJILLIZJL(c84666XKs);
        if (LJJLIIIJILLIZJL != null && jobSupport.LJJLJLI(finishing, LJJLIIIJILLIZJL, obj)) {
            return;
        }
        jobSupport.LJJII(jobSupport.LJJJJJL(finishing, obj));
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(Throwable th) {
        LJJII(th);
        return C76800UCe.LIZ;
    }

    public C84664XKq(JobSupport jobSupport, JobSupport.Finishing finishing, C84666XKs c84666XKs, Object obj) {
        this.LJLJJL = jobSupport;
        this.LJLJJLL = finishing;
        this.LJLJL = c84666XKs;
        this.LJLJLJ = obj;
    }
}
