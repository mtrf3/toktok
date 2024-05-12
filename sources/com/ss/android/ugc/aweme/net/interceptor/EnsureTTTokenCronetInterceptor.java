package com.ss.android.ugc.aweme.net.interceptor;

import X.C56662Kg;
import X.C64797Pbt;
import X.C64908Pdg;
import X.C66952QPk;
import X.EJ6;
import X.FBZ;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes7.dex */
public class EnsureTTTokenCronetInterceptor extends FeedBaseCronetInterceptor {
    @Override // com.ss.android.ugc.aweme.net.interceptor.FeedBaseCronetInterceptor
    public final C64797Pbt LIZ(FBZ fbz) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        Request request = fbz.request();
        Map LIZ = C66952QPk.LIZ(request.getUrl());
        if (LIZ != null && !LIZ.isEmpty()) {
            ArrayList arrayList = null;
            for (Map.Entry entry : LIZ.entrySet()) {
                if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    EJ6 firstHeader = request.getFirstHeader((String) entry.getKey());
                    if (firstHeader != null) {
                        str = firstHeader.LIZIZ;
                    } else {
                        str = "";
                    }
                    if (!TextUtils.equals(str, (CharSequence) entry.getValue())) {
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        EJ6 firstHeader2 = request.getFirstHeader(str2);
                        if (arrayList == null) {
                            arrayList = new ArrayList(request.getHeaders());
                        }
                        if (firstHeader2 != null) {
                            arrayList.remove(firstHeader2);
                        }
                        arrayList.add(new EJ6(str2, str3));
                    }
                }
            }
            if (arrayList != null) {
                C64908Pdg newBuilder = request.newBuilder();
                newBuilder.LIZJ = arrayList;
                request = newBuilder.LIZ();
            }
        }
        C56662Kg.LIZ().LIZLLL(System.currentTimeMillis() - currentTimeMillis, "ensure_tt_token_interceptor_duration");
        return fbz.LIZ(request);
    }
}
