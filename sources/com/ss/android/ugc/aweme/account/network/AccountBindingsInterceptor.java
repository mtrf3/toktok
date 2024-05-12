package com.ss.android.ugc.aweme.account.network;

import X.C32I;
import X.C64797Pbt;
import X.C64908Pdg;
import X.C77275UUl;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.ORZ;
import X.OSZ;
import X.PVC;
import X.PY0;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput;
import com.ss.android.ugc.aweme.IAccountBindingsService;
import com.ss.android.ugc.aweme.account.experiment.AccountBindingsService;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public final class AccountBindingsInterceptor implements InterfaceC37216Ej6 {
    public static final AccountBindingsInterceptor LJLIL = new AccountBindingsInterceptor();
    public static final IAccountBindingsService LJLILLLLZI = AccountBindingsService.LIZJ();
    public static final Set<String> LJLJI = C77275UUl.LJIIIIZZ("/passport/email/send_code/", "/passport/email/verify/", "/passport/email/change/", "/passport/mobile/send_code/v1/", "/passport/mobile/change/v1/", "/passport/mobile/validate_code/v1/", "/passport/account/verify/");

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        boolean z;
        String str;
        Object obj;
        String str2;
        Request request = ((F7S) fbz).LIZJ;
        IAccountBindingsService iAccountBindingsService = LJLILLLLZI;
        if (iAccountBindingsService.LIZIZ() || iAccountBindingsService.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        Set<String> set = LJLJI;
        Request request2 = null;
        if (request != null) {
            str = request.getPath();
        } else {
            str = null;
        }
        if (ORZ.LJLJJI(str, set) && z && request != null && request.getBody() != null && (request.getBody() instanceof FormUrlEncodedTypedOutput)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            request.getBody().writeTo(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            o.LJIIIIZZ(byteArray, "stream.toByteArray()");
            List LJLJJI = s.LJLJJI(new String(byteArray, PVC.LIZ), new char[]{'&'}, false, 6);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJI, 10));
            Iterator it = LJLJJI.iterator();
            while (it.hasNext()) {
                List LJLJJI2 = s.LJLJJI((String) it.next(), new char[]{'='}, false, 6);
                Object LJLLLL = ORZ.LJLLLL(LJLJJI2);
                Object obj2 = "";
                if (LJLLLL == null) {
                    LJLLLL = "";
                }
                Object LJLLLL2 = ORZ.LJLLLL(ORZ.LJLJJLL(LJLJJI2, 1));
                if (LJLLLL2 != null) {
                    obj2 = LJLLLL2;
                }
                arrayList.add(new OSZ(LJLLLL, obj2));
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (o.LJ(((OSZ) obj).getFirst(), "passport_ticket")) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            OSZ osz = (OSZ) obj;
            if (osz != null && (str2 = (String) osz.getSecond()) != null) {
                C64908Pdg newBuilder = request.newBuilder();
                if (newBuilder != null) {
                    PY0 LIZJ = PY0.LIZJ(request.getUrl());
                    LIZJ.LJI.LIZIZ("passport_ticket", str2);
                    newBuilder.LIZJ(LIZJ.LIZIZ());
                    request2 = newBuilder.LIZ();
                }
                return ((F7S) fbz).LIZ(request2);
            }
        }
        return ((F7S) fbz).LIZ(request);
    }
}
