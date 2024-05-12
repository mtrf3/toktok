package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.translation.service.TranslationLangKevaServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AAg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25790AAg implements EUJ {
    @Override // X.EUJ
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.EUJ
    public final void A1(PushSettings settings) {
        ArrayList arrayList;
        o.LJIIIZ(settings, "settings");
        List<ContentLanguage> list = settings.selectedContentLanguage;
        String[] strArr = null;
        if (list != null) {
            arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<ContentLanguage> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getLanguageCode());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            strArr = (String[]) arrayList.toArray(new String[0]);
        }
        TranslationLangKevaServiceImpl.LJIIZILJ().LJIIJ(strArr);
    }
}
