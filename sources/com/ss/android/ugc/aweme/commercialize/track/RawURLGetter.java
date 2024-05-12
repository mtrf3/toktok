package com.ss.android.ugc.aweme.commercialize.track;

import X.C10K;
import X.C221108m2;
import X.C38995FSd;
import X.C47261Igj;
import X.C60170NjS;
import X.C62822Ol8;
import X.C66621QCr;
import X.C76L;
import X.E8L;
import X.EJ6;
import X.EKC;
import X.FLE;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC61611OFz;
import X.InterfaceC61858OPm;
import X.N96;
import Y.ACallableS37S1100000_10;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class RawURLGetter {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C60170NjS.LJLIL);

    /* loaded from: classes11.dex */
    public interface RawUrlApi {
        @InterfaceC61611OFz("vas_ad_track")
        @E8L
        @EKC({"x-tt-dataflow-id: 671089410"})
        C76L<String> doGet(@InterfaceC195747mE String str, @InterfaceC195767mG List<EJ6> list);
    }

    public static final String LIZ(String str) {
        String LIZ2;
        List<InterfaceC61858OPm> LJJIJIL;
        if (str != null) {
            LIZ2 = FLE.LIZ("other");
            if (LIZ2.length() == 0) {
                LJJIJIL = null;
            } else {
                LJJIJIL = C47261Igj.LJJIJIL(new C66621QCr("User-Agent", LIZ2));
            }
            ArrayList arrayList = new ArrayList();
            if (LJJIJIL != null) {
                for (InterfaceC61858OPm interfaceC61858OPm : LJJIJIL) {
                    arrayList.add(new EJ6(interfaceC61858OPm.getName(), interfaceC61858OPm.getValue()));
                }
            }
            return ((RawUrlApi) LIZ.getValue()).doGet(str, arrayList).get();
        }
        throw new NullPointerException("url is null");
    }

    public static final void LIZIZ(String url, N96 n96) {
        o.LJIIIZ(url, "url");
        C10K.LIZIZ(new ACallableS37S1100000_10(n96, url, 0), C38995FSd.LIZLLL(), null);
    }
}
