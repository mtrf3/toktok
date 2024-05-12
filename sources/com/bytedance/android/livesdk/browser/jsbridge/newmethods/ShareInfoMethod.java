package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38123Exj;
import X.C29336BfI;
import X.C31236CNs;
import X.C38131Exr;
import X.InterfaceC29343BfP;
import X.InterfaceC65349Pkn;
import com.bytedance.hybrid.spark.SparkContext;

/* loaded from: classes6.dex */
public final class ShareInfoMethod extends AbstractC38123Exj<Params, Object> {
    public InterfaceC29343BfP LJLIL;

    /* loaded from: classes6.dex */
    public static final class Params {

        @InterfaceC65349Pkn("desc")
        public String desc;

        @InterfaceC65349Pkn("image")
        public String image;

        @InterfaceC65349Pkn("title")
        public String title;

        @InterfaceC65349Pkn("url")
        public String url;
    }

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        this.LJLIL = null;
    }

    public ShareInfoMethod(SparkContext sparkContext) {
        C31236CNs c31236CNs = new C31236CNs();
        this.LJLIL = c31236CNs;
        sparkContext.LJII(InterfaceC29343BfP.class, c31236CNs);
    }

    public ShareInfoMethod(InterfaceC29343BfP interfaceC29343BfP) {
        this.LJLIL = interfaceC29343BfP;
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(Params params, C38131Exr c38131Exr) {
        Params params2 = params;
        this.LJLIL.ql(new C29336BfI(params2.title, params2.desc, params2.image, params2.url));
        finishWithSuccess();
    }
}
