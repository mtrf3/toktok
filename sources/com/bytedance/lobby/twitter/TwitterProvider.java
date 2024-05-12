package com.bytedance.lobby.twitter;

import X.C1GE;
import X.C66502Q8c;
import X.C66503Q8d;
import X.C77119UOl;
import X.QCI;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.lobby.internal.BaseProvider;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class TwitterProvider<T> extends BaseProvider<T> {
    public static final boolean LJLJJL = C77119UOl.LIZIZ;
    public final Application LJLJJI;

    @Override // com.bytedance.lobby.internal.BaseProvider
    public final void onCreate() {
        String consumerSecret;
        QCI qci = this.LJLJI;
        String str = qci.LIZJ;
        Bundle bundle = qci.LIZLLL;
        if (bundle != null) {
            consumerSecret = bundle.getString("twitter_consumer_secret");
        } else {
            consumerSecret = "";
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z = LJLJJL;
        if (isEmpty || TextUtils.isEmpty(consumerSecret)) {
            if (!z) {
                return;
            } else {
                throw new NullPointerException("Cannot initialize Twitter SDK with an incomplete consumer credentials.");
            }
        }
        C66503Q8d c66503Q8d = new C66503Q8d(this.LJLJJI);
        c66503Q8d.LIZIZ = z;
        String secret = this.LJLJI.LIZJ;
        o.LJIIIZ(secret, "secret");
        c66503Q8d.LIZJ = secret;
        o.LJIIIZ(consumerSecret, "consumerSecret");
        c66503Q8d.LIZLLL = consumerSecret;
        C66502Q8c c66502Q8c = new C66502Q8c(c66503Q8d);
        TokenCert cert = TokenCert.with("bpea-twitter_androidsdk_2007");
        o.LJIIIZ(cert, "cert");
        C1GE.LJIJJ(cert, "Twitter", "initialize", new AqS161S0100000_11(c66502Q8c, 111));
    }

    public TwitterProvider(Application application, QCI qci) {
        super(application, qci);
        this.LJLJJI = application;
    }
}
