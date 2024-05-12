package com.ss.android.ugc.aweme.contentlanguage.api;

import X.AF0;
import X.EUJ;
import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import java.util.List;

/* loaded from: classes5.dex */
public interface IContentLanguageService {
    Activity LIZ();

    void LIZIZ(String str);

    String LIZJ();

    void LIZLLL(ContentLanguage contentLanguage);

    String LJ();

    void LJFF(EUJ euj);

    AF0 LJI(List<String> list, List<? extends ContentLanguage> list2);

    Pair<Boolean, String> LJII(Context context);

    void LJIIIIZZ(Activity activity);

    void LJIIIZ();

    boolean LJIIJ(Aweme aweme);

    List<String> getLanguage();
}
