package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.page.SparkPopup;
import kotlin.jvm.internal.o;

/* renamed from: X.FsS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40344FsS implements InterfaceC60816Nts {
    public boolean LIZ;
    public final /* synthetic */ SparkPopup LIZIZ;
    public final /* synthetic */ ActivityC45651qj LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // X.InterfaceC60816Nts
    public final void LIZIZ(InterfaceC60761Nsz view) {
        o.LJIIJ(view, "view");
        if (!this.LIZ) {
            if (!this.LIZIZ.Rl()) {
                SparkPopup sparkPopup = this.LIZIZ;
                FragmentManager supportFragmentManager = this.LIZJ.getSupportFragmentManager();
                o.LJFF(supportFragmentManager, "context.supportFragmentManager");
                sparkPopup.show(supportFragmentManager, this.LIZLLL);
            }
            this.LIZ = true;
        }
    }

    public C40344FsS(SparkPopup sparkPopup, ActivityC45651qj activityC45651qj, String str) {
        this.LIZIZ = sparkPopup;
        this.LIZJ = activityC45651qj;
        this.LIZLLL = str;
    }

    @Override // X.InterfaceC60816Nts
    public final void LIZ(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIJ(view, "view");
        o.LJIIJ(url, "url");
        if (!this.LIZ) {
            if (!this.LIZIZ.Rl()) {
                SparkPopup sparkPopup = this.LIZIZ;
                FragmentManager supportFragmentManager = this.LIZJ.getSupportFragmentManager();
                o.LJFF(supportFragmentManager, "context.supportFragmentManager");
                sparkPopup.show(supportFragmentManager, this.LIZLLL);
            }
            this.LIZ = true;
        }
    }
}
