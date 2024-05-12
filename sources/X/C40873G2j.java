package X;

import com.google.gson.Gson;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.plugin.journey.LynxContentLanguage;
import com.ss.android.ugc.aweme.plugin.journey.LynxSelectionData;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.G2j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40873G2j implements InterfaceC40880G2q {
    public final C40875G2l LIZ;

    @Override // X.InterfaceC40880G2q
    public final String getName() {
        return "onboarding.next";
    }

    public C40873G2j(C40875G2l c40875G2l) {
        this.LIZ = c40875G2l;
    }

    @Override // X.InterfaceC40880G2q
    public final void LIZ(ReadableMap params, Callback callback) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        int i = 0;
        callback.invoke("succeed");
        try {
            if (C78685UuP.LJJJZ(params.toString())) {
                StringBuilder sb = new StringBuilder();
                List<LynxContentLanguage> list = ((LynxSelectionData) new Gson().LJI(params.toString(), LynxSelectionData.class)).data.selectedLanguages;
                Integer num = null;
                if (list != null) {
                    for (LynxContentLanguage lynxContentLanguage : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            sb.append(lynxContentLanguage.languageCode);
                            if (i != list.size() - 1) {
                                sb.append(",");
                            }
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
                String sb2 = sb.toString();
                o.LJIIIIZZ(sb2, "languageList.toString()");
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "new_user_journey");
                c188727au.LJFF(sb, "selected_languages");
                if (list != null) {
                    num = Integer.valueOf(list.size());
                }
                c188727au.LJFF(num, "selected_languages_count");
                c188727au.LIZLLL(this.LIZ.LIZ, "content_languages_count");
                FMX.LJIIL("lynx_next_tapped", c188727au.LIZ);
                C2U8.LIZ(new G2P(sb2));
                G2G.LIZIZ.LIZ.LJFF(sb2);
            }
        } catch (Exception unused) {
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", "new_user_journey");
            c188727au2.LJIIIZ("params", params.toString());
            FMX.LJIIL("lynx_content_language_parsing_exception", c188727au2.LIZ);
        }
        C35878E6g.LIZ();
        C2U8.LIZ(new C40879G2p());
    }
}
