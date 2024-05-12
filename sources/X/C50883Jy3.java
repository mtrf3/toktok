package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.TemplateBundle;
import kotlin.jvm.internal.o;

/* renamed from: X.Jy3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50883Jy3 extends AbstractC50884Jy4 {
    public final /* synthetic */ AbstractC50884Jy4 LIZ;
    public final /* synthetic */ C60737Nsb LIZIZ;

    @Override // X.AbstractC50884Jy4
    public final void LJ(String msg) {
        o.LJIIJ(msg, "msg");
        AbstractC50884Jy4 abstractC50884Jy4 = this.LIZ;
        if (abstractC50884Jy4 != null) {
            abstractC50884Jy4.LJ(msg);
        }
    }

    @Override // X.AbstractC50884Jy4
    public final void LJFF(byte[] bArr) {
        AbstractC50884Jy4 abstractC50884Jy4 = this.LIZ;
        if (abstractC50884Jy4 != null) {
            abstractC50884Jy4.LJFF(bArr);
        }
        try {
            TemplateBundle LIZ = TemplateBundle.LIZ(bArr);
            this.LIZIZ.LJII(TemplateBundle.class, LIZ);
            AbstractC50884Jy4 abstractC50884Jy42 = this.LIZ;
            if (abstractC50884Jy42 != null) {
                abstractC50884Jy42.LIZLLL(LIZ);
            }
        } catch (Throwable th) {
            AbstractC50884Jy4 abstractC50884Jy43 = this.LIZ;
            if (abstractC50884Jy43 != null) {
                abstractC50884Jy43.LIZJ(String.valueOf(th.getMessage()));
            }
        }
    }

    public C50883Jy3(C50885Jy5 c50885Jy5, SparkContext sparkContext) {
        this.LIZ = c50885Jy5;
        this.LIZIZ = sparkContext;
    }
}
