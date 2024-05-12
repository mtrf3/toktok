package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import kotlin.jvm.internal.o;

/* renamed from: X.NvU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60916NvU implements InterfaceC60816Nts {
    public boolean LIZ;
    public final /* synthetic */ SparkPopup LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ C31124CJk LIZLLL;
    public final /* synthetic */ SparkContext LJ;
    public final /* synthetic */ Context LJFF;

    @Override // X.InterfaceC60816Nts
    public final void LIZIZ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        if (!this.LIZ) {
            if (!this.LIZIZ.Rl()) {
                C60904NvI.LIZJ(this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
            }
            this.LIZ = true;
        }
    }

    @Override // X.InterfaceC60816Nts
    public final void LIZ(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        if (!this.LIZ) {
            if (!this.LIZIZ.Rl()) {
                C60904NvI.LIZJ(this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
            }
            this.LIZ = true;
        }
    }

    public C60916NvU(SparkPopup sparkPopup, boolean z, C31124CJk c31124CJk, SparkContext sparkContext, Context context) {
        this.LIZIZ = sparkPopup;
        this.LIZJ = z;
        this.LIZLLL = c31124CJk;
        this.LJ = sparkContext;
        this.LJFF = context;
    }
}
