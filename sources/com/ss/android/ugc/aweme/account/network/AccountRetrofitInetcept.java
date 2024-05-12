package com.ss.android.ugc.aweme.account.network;

import X.C64797Pbt;
import X.C64908Pdg;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.retrofit2.client.Request;
import defpackage.b1;
import defpackage.i0;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class AccountRetrofitInetcept implements InterfaceC37216Ej6 {
    public static final AccountRetrofitInetcept LJLIL = new AccountRetrofitInetcept();
    public static final Pattern LJLILLLLZI = PatternProtector.compile(".*/passport/.*");
    public static String LJLJI = "";

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        String url = request.getUrl();
        o.LJIIIIZZ(url, "request.url");
        if (LJLILLLLZI.matcher(url).matches()) {
            if (s.LJJJLZIJ(url, "?", false)) {
                url = i0.LJFF(url, "&support_webview=1");
            } else {
                url = i0.LJFF(url, "?support_webview=1");
            }
            if (!TextUtils.isEmpty(LJLJI)) {
                StringBuilder LIZJ = b1.LIZJ(url, "&interstitial_token=");
                LIZJ.append(LJLJI);
                url = X1D.LIZIZ(LIZJ);
            }
        }
        C64908Pdg newBuilder = request.newBuilder();
        newBuilder.LIZJ(url);
        return f7s.LIZ(newBuilder.LIZ());
    }
}
