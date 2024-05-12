package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* loaded from: classes10.dex */
public interface DetailFeedService {
    Aweme LIZ(String str, String str2);

    BatchDetailList LIZIZ(String str, String str2, int i, String str3, String str4);

    Aweme LIZJ(String str);

    Aweme LIZLLL(String str);

    String LJ(String str, String str2, String str3);

    BatchDetailList LJFF(String str);

    Fragment LJI(Activity activity);

    BatchDetailList LJII(String str);

    Map<String, View> LJIIIIZZ(View view);

    Class<? extends Activity> LJIIIZ();
}
