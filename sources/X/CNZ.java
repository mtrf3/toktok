package X;

import android.os.SystemClock;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CNZ extends AbstractC60811Ntn {
    public final /* synthetic */ CMH LJLILLLLZI;
    public final /* synthetic */ SparkContext LJLJI;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        long j;
        o.LJIIIZ(view, "view");
        this.LJLILLLLZI.setEndTime(SystemClock.elapsedRealtime());
        String str = this.LJLJI.containerId;
        String name = this.LJLILLLLZI.getName();
        String str2 = this.LJLJI.url;
        if (this.LJLILLLLZI.getStartTime() != -1) {
            j = this.LJLILLLLZI.getEndTime() - this.LJLILLLLZI.getStartTime();
        } else {
            j = -1;
        }
        C31218CNa.LIZIZ(j, str, name, "spark", str2);
    }

    public CNZ(CMH cmh, SparkContext sparkContext) {
        this.LJLILLLLZI = cmh;
        this.LJLJI = sparkContext;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        this.LJLILLLLZI.setStartTime(SystemClock.elapsedRealtime());
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJIZL(view, url, c60704Ns4);
        C31218CNa.LIZ(this.LJLJI.containerId, this.LJLILLLLZI.getName(), c60704Ns4.LIZ, "spark", this.LJLJI.url, c60704Ns4.LIZIZ);
    }
}
