package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AAo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25798AAo implements EUJ {
    @Override // X.EUJ
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.EUJ
    public final void A1(PushSettings settings) {
        String[] strArr;
        o.LJIIIZ(settings, "settings");
        List<ContentLanguage> list = settings.selectedContentLanguage;
        if (list != null) {
            int size = list.size();
            String str = "";
            for (int i = 0; i < size; i++) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(((ContentLanguage) ListProtector.get(settings.selectedContentLanguage, i)).getLanguageCode());
                LIZ.append(',');
                str = X1D.LIZIZ(LIZ);
            }
            SharePrefCache.inst().getUserAddLanguages().LIZLLL(str);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("content_language", str);
            FMX.LJIIL("user_language_set_by_push_setting", c188727au.LIZ);
        }
        List<ContentLanguage> list2 = settings.contentLanguage;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (ContentLanguage contentLanguage : list2) {
                String languageCode = contentLanguage.getLanguageCode();
                if (languageCode != null && languageCode.length() != 0) {
                    arrayList.add(contentLanguage);
                }
            }
            SharePrefCache.inst().getAllContentLanguages().LIZLLL(ORZ.LLD(arrayList, ",", null, null, C25799AAp.LJLIL, 30));
        }
        List<ContentLanguage> list3 = settings.contentLanguage;
        if (list3 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (ContentLanguage contentLanguage2 : list3) {
                String languageCode2 = contentLanguage2.getLanguageCode();
                if (languageCode2 != null && languageCode2.length() != 0) {
                    arrayList2.add(contentLanguage2);
                }
            }
            HashMap hashMap = new HashMap();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ContentLanguage contentLanguage3 = (ContentLanguage) it.next();
                hashMap.put(String.valueOf(contentLanguage3.getLanguageCode()), String.valueOf(contentLanguage3.getLocalName()));
            }
            CaptionKevaServiceImpl.LJJJJI().LJJJJ(hashMap);
        }
        ContentLanguage contentLanguage4 = settings.selectedTranslationLanguage;
        if (contentLanguage4 != null) {
            SharePrefCache.inst().getSelectedTranslationLanguage().LIZLLL(contentLanguage4.getLanguageCode());
        }
        ITranslationLangKevaService LIZ2 = C25792AAi.LIZ();
        List<ContentLanguage> list4 = settings.selectedDoNotTranslate;
        String[] strArr2 = null;
        if (list4 != null) {
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(list4, 10));
            Iterator<ContentLanguage> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().getLanguageCode());
            }
            strArr = (String[]) arrayList3.toArray(new String[0]);
        } else {
            strArr = null;
        }
        LIZ2.LIZLLL(strArr);
        ITranslationLangKevaService LIZ3 = C25792AAi.LIZ();
        List<ContentLanguage> list5 = settings.selectedDoNotTranslate;
        if (list5 != null) {
            ArrayList arrayList4 = new ArrayList(C32I.LJJL(list5, 10));
            Iterator<ContentLanguage> it3 = list5.iterator();
            while (it3.hasNext()) {
                arrayList4.add(it3.next().getLocalName());
            }
            strArr2 = (String[]) arrayList4.toArray(new String[0]);
        }
        LIZ3.LJIIL(strArr2);
    }
}
