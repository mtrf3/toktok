package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.TemplateBundle;
import kotlin.jvm.internal.o;

/* renamed from: X.Jy5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50885Jy5 extends AbstractC50884Jy4 {
    public final /* synthetic */ AbstractC50884Jy4 LIZ;
    public final /* synthetic */ C60737Nsb LIZIZ;

    @Override // X.AbstractC50884Jy4
    public final void LIZJ(String str) {
        AbstractC50884Jy4 abstractC50884Jy4 = this.LIZ;
        if (abstractC50884Jy4 != null) {
            abstractC50884Jy4.LIZ(str);
        }
    }

    @Override // X.AbstractC50884Jy4
    public final void LIZLLL(TemplateBundle templateBundle) {
        android.net.Uri parse;
        AbstractC50884Jy4 abstractC50884Jy4 = this.LIZ;
        if (abstractC50884Jy4 != null) {
            abstractC50884Jy4.LIZLLL(templateBundle);
        }
        HybridSchemaParam LJJIIZI = C1XY.LJJIIZI(this.LIZIZ.url);
        String url = LJJIIZI.getUrl();
        if (url == null || url.length() == 0) {
            parse = UriProtector.parse(LJJIIZI.getSurl());
        } else {
            parse = UriProtector.parse(LJJIIZI.getUrl());
        }
        try {
            String uri = parse.toString();
            o.LJFF(uri, "uri.toString()");
            templateBundle.LIZJ(K1O.LIZ(this.LIZIZ, uri));
            AbstractC50884Jy4 abstractC50884Jy42 = this.LIZ;
            if (abstractC50884Jy42 != null) {
                abstractC50884Jy42.LIZIZ();
            }
        } catch (Throwable th) {
            AbstractC50884Jy4 abstractC50884Jy43 = this.LIZ;
            if (abstractC50884Jy43 != null) {
                abstractC50884Jy43.LIZ(String.valueOf(th.getMessage()));
            }
        }
    }

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
    }

    public C50885Jy5(C50882Jy2 c50882Jy2, SparkContext sparkContext) {
        this.LIZ = c50882Jy2;
        this.LIZIZ = sparkContext;
    }
}
