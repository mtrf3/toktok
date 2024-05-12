package com.ss.android.ugc.aweme.account.network.ttp;

import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C64908Pdg;
import X.C78685UuP;
import X.EJ6;
import X.InterfaceC37216Ej6;
import X.ORZ;
import X.PY0;
import X.Q3K;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public final class TTPInterceptor implements InterfaceC37216Ej6 {
    public static final TTPInterceptor LJLIL = new TTPInterceptor();
    public static final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(Q3K.LJLIL);

    public static Map LIZIZ(String str) {
        String decode = URLDecoder.decode(str, StandardCharsets.UTF_8.name());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (C78685UuP.LJJJZ(decode)) {
                o.LJI(decode);
                Iterator it = s.LJLJJL(decode, new String[]{"&"}, 0, 6).iterator();
                while (it.hasNext()) {
                    List LJLJJL = s.LJLJJL((String) it.next(), new String[]{"="}, 0, 6);
                    linkedHashMap.put(ListProtector.get(LJLJJL, 0), ListProtector.get(LJLJJL, 1));
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0254, code lost:
    
        if (ujb.s.LJJJLZIJ(r6, "*", false) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ad, code lost:
    
        if (ujb.s.LJJJLZIJ(r3, "***", false) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0382, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r13, "+86") != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ad, code lost:
    
        if (r3.exclude_email_code_type.contains(java.lang.Integer.valueOf(r4)) != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05cd  */
    @Override // X.InterfaceC37216Ej6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C64797Pbt<?> intercept(X.FBZ r25) {
        /*
            Method dump skipped, instructions count: 1501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.network.ttp.TTPInterceptor.intercept(X.FBZ):X.Pbt");
    }

    public static Request LIZ(Request request, String newDomain, String str) {
        List<EJ6> arrayList;
        o.LJIIIZ(newDomain, "newDomain");
        List<EJ6> headers = request.getHeaders();
        if (headers != null) {
            arrayList = ORZ.LLJILJILJ(headers);
        } else {
            arrayList = new ArrayList<>();
        }
        arrayList.add(new EJ6("x-tt-bypass-dp", "1"));
        C64908Pdg newBuilder = request.newBuilder();
        PY0 LIZJ = PY0.LIZJ(request.getUrl());
        LIZJ.LIZLLL(newDomain);
        if (C78685UuP.LJJJZ(str)) {
            LIZJ.LJI.LIZIZ("device_redirect_info", str);
        }
        newBuilder.LIZJ(LIZJ.LIZIZ());
        newBuilder.LIZJ = arrayList;
        return newBuilder.LIZ();
    }
}
