package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.unlogin.UnloginSignUpFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class AXC implements InterfaceC55381LoP {
    public static final AXC LIZ = new AXC();

    @Override // X.InterfaceC55381LoP
    public final String LIZJ() {
        return AXD.LIZIZ().LIZ();
    }

    @Override // X.InterfaceC55381LoP
    public final List<String> getLanguage() {
        return s.LJLJJL(AXD.LIZIZ().LIZ(), new String[]{","}, 0, 6);
    }

    @Override // X.InterfaceC55381LoP
    public final void LIZIZ(String code) {
        o.LJIIIZ(code, "code");
        List LLJILJILJ = ORZ.LLJILJILJ(s.LJLJJL(AXD.LIZIZ().LIZ(), new String[]{","}, 0, 6));
        if (AXD.LIZ(code, LLJILJILJ, true)) {
            String LLD = ORZ.LLD(LLJILJILJ, ",", null, null, null, 62);
            AXF LIZIZ = AXD.LIZIZ();
            LIZIZ.getClass();
            try {
                Object value = LIZIZ.LIZ.getValue();
                o.LJIIIIZZ(value, "<get-mPreferences>(...)");
                ((InterfaceC26386AXe) value).LJII(LLD);
            } catch (Throwable th) {
                PEH.LIZLLL(th, "MainTabPreferences AbstractMethodError");
            }
        }
    }

    @Override // X.InterfaceC55381LoP
    public final void LIZLLL(ContentLanguage language) {
        o.LJIIIZ(language, "language");
        List LJLJJL = s.LJLJJL(AXD.LIZIZ().LIZ(), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJLJJL) {
            if (!TextUtils.isEmpty((String) obj)) {
                arrayList.add(obj);
            }
        }
        List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        String languageCode = language.getLanguageCode();
        o.LJIIIIZZ(languageCode, "contentLanguage.languageCode");
        if (!AXD.LIZ(languageCode, LLJILJILJ, false)) {
            String languageCode2 = language.getLanguageCode();
            o.LJIIIIZZ(languageCode2, "contentLanguage.languageCode");
            ((ArrayList) LLJILJILJ).add(languageCode2);
            String LLD = ORZ.LLD(LLJILJILJ, ",", null, null, null, 62);
            AXF LIZIZ = AXD.LIZIZ();
            LIZIZ.getClass();
            try {
                Object value = LIZIZ.LIZ.getValue();
                o.LJIIIIZZ(value, "<get-mPreferences>(...)");
                ((InterfaceC26386AXe) value).LJII(LLD);
            } catch (Throwable th) {
                PEH.LIZLLL(th, "MainTabPreferences AbstractMethodError");
            }
        }
    }

    @Override // X.InterfaceC55381LoP
    public final String LIZ(TabChangeManager tabChangeManager, String str) {
        o.LJIIIZ(tabChangeManager, "tabChangeManager");
        switch (str.hashCode()) {
            case -1672998758:
                if (str.equals("UNLOGIN_PROFILE")) {
                    str = "USER";
                    break;
                }
                break;
            case -1382453013:
                if (str.equals("NOTIFICATION")) {
                    str = "UNLOGIN_NOTIFICATION";
                    break;
                }
                break;
            case 2614219:
                if (str.equals("USER")) {
                    str = "UNLOGIN_PROFILE";
                    break;
                }
                break;
            case 53655674:
                if (str.equals("UNLOGIN_NOTIFICATION")) {
                    str = "NOTIFICATION";
                    break;
                }
                break;
        }
        FragmentManager fragmentManager = tabChangeManager.LJLLI;
        if (fragmentManager == null || fragmentManager.LJJJIL(str) == null) {
            Bundle bundle = new Bundle();
            bundle.putString("tab", str);
            tabChangeManager.gv0(bundle, str, UnloginSignUpFragment.class);
        }
        return str;
    }

    @Override // X.InterfaceC55381LoP
    public final AF0 LJI(List<String> list, List<ContentLanguage> list2) {
        if (C79004UzY.LJJIFFI(list) || C79004UzY.LJJIFFI(list2)) {
            return new AF0(null, list2);
        }
        ArrayList arrayList = new ArrayList();
        o.LJI(list2);
        ArrayList arrayList2 = new ArrayList();
        for (ContentLanguage contentLanguage : list2) {
            ContentLanguage contentLanguage2 = contentLanguage;
            o.LJI(list);
            Iterator<String> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (ujb.o.LJJJJIZL(contentLanguage2.getLanguageCode(), it.next(), true)) {
                        ContentLanguage contentLanguage3 = new ContentLanguage();
                        contentLanguage3.setLanguageCode(contentLanguage2.getLanguageCode());
                        contentLanguage3.setLocalName(contentLanguage2.getLocalName());
                        contentLanguage3.setEnglishName(contentLanguage2.getEnglishName());
                        arrayList.add(contentLanguage3);
                        break;
                    }
                } else {
                    arrayList2.add(contentLanguage);
                    break;
                }
            }
        }
        return new AF0(arrayList, arrayList2);
    }
}
