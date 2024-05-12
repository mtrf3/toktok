package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.journey.step.lynx.LynxExperienceBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Cge, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31968Cge {
    public final Context LIZ;
    public InterfaceC31964Cga LIZIZ;
    public Boolean LIZJ;

    public final VNS LIZIZ() {
        C60537NpN c60537NpN;
        C31958CgU c31958CgU = new C31958CgU(this.LIZ, false);
        C60308Nlg c60308Nlg = new C60308Nlg("default_bid", c31958CgU);
        VNS vns = null;
        C60541NpR c60541NpR = new C60541NpR(null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("bridge", new C31970Cgg(LynxExperienceBridge.class, 2));
        c60541NpR.LJLLILLLL = linkedHashMap;
        C31961CgX c31961CgX = new C31961CgX();
        c31961CgX.LIZ = TemplateData.LJFF("{}");
        c60541NpR.LJLLL = c31961CgX;
        String substring = "https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/8/gecko/resource/ug_onboarding_content_language/main/template.js".substring(s.LJJLIIIJJIZ("https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/8/gecko/resource/ug_onboarding_content_language/main/template.js", '?', 0, false, 6) + 1, 128);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        List LJLJJI = s.LJLJJI(substring, new char[]{'&'}, false, 6);
        HashMap hashMap = new HashMap();
        Iterator it = LJLJJI.iterator();
        while (it.hasNext()) {
            List LJLJJI2 = s.LJLJJI((String) it.next(), new char[]{'='}, false, 6);
            if (LJLJJI2.size() == 2) {
                hashMap.put(ListProtector.get(LJLJJI2, 0), ListProtector.get(LJLJJI2, 1));
            }
        }
        c60541NpR.LJLL.putAll(hashMap);
        ((ArrayList) c60541NpR.LJLLI).add(new C31969Cgf(this));
        c31958CgU.LIZ.LIZIZ(C60541NpR.class, c60541NpR);
        InterfaceC60316Nlo interfaceC60316Nlo = (InterfaceC60316Nlo) C60299NlX.LIZ(c60308Nlg, InterfaceC60316Nlo.class);
        if (interfaceC60316Nlo != null) {
            c60537NpN = interfaceC60316Nlo.LJIJI(c60308Nlg);
        } else {
            c60537NpN = null;
        }
        this.LIZIZ = c60537NpN;
        if (c60537NpN != null) {
            vns = c60537NpN.LIZIZ;
        }
        o.LJII(vns, "null cannot be cast to non-null type com.lynx.tasm.LynxView");
        InterfaceC31964Cga interfaceC31964Cga = this.LIZIZ;
        if (interfaceC31964Cga != null) {
            interfaceC31964Cga.load("https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/8/gecko/resource/ug_onboarding_content_language/main/template.js");
        }
        return vns;
    }

    public C31968Cge(Context context) {
        this.LIZ = context;
    }

    public static void LIZ(LynxError lynxError) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "new_user_journey");
        String lynxError2 = lynxError.toString();
        if (lynxError2 == null) {
            lynxError2 = "unknown";
        }
        c188727au.LJIIIZ("error_desc", lynxError2);
        FMX.LJIIL("lynx_content_language_error", c188727au.LIZ);
    }
}
