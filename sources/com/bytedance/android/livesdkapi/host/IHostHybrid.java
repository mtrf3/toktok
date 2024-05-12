package com.bytedance.android.livesdkapi.host;

import X.C38113ExZ;
import X.C38129Exp;
import X.C40197Fq5;
import X.C60788NtQ;
import X.InterfaceC06390Mx;
import X.InterfaceC31964Cga;
import X.VNS;
import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public interface IHostHybrid extends InterfaceC06390Mx {
    C60788NtQ Cz();

    WebResourceResponse GG(WebView webView, String str);

    void IB(String str);

    List<String> Iv();

    Map<String, String> Vg0(String str);

    String f50();

    boolean fa(String str);

    List<String> i00(String str);

    String k7(String str);

    void le();

    void prefetchSchema(String str, Context context);

    C38113ExZ qh(C38113ExZ c38113ExZ, Context context, InterfaceC31964Cga interfaceC31964Cga, VNS vns, C38129Exp c38129Exp);

    List<C40197Fq5> rS();

    void uZ();

    Object w2(Context context, C38113ExZ c38113ExZ);
}
