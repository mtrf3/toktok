package X;

import Y.IDxS25S0300000_4;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingApi;
import kotlin.jvm.internal.o;

/* renamed from: X.AAw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25806AAw {
    public final InterfaceC25805AAv LIZ;
    public final DoNotTranslateSettingApi LIZIZ;

    public C25806AAw(InterfaceC25805AAv interfaceC25805AAv) {
        this.LIZ = interfaceC25805AAv;
        DoNotTranslateSettingApi.LIZ.getClass();
        this.LIZIZ = (DoNotTranslateSettingApi) C25808AAy.LIZIZ.getValue();
    }

    public final void LIZ(String[] doNotTranslateLanguageCodes, String[] doNotTranslateLanguageNames) {
        o.LJIIIZ(doNotTranslateLanguageCodes, "doNotTranslateLanguageCodes");
        o.LJIIIZ(doNotTranslateLanguageNames, "doNotTranslateLanguageNames");
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        this.LIZIZ.setDoNotTranslateSetting("do_not_translate", ORY.LJJJJLL(doNotTranslateLanguageCodes, ",", null, null, null, 62), 2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS25S0300000_4(this, doNotTranslateLanguageCodes, doNotTranslateLanguageNames, 0));
    }
}
