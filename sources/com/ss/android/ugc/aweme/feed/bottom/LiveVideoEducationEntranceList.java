package com.ss.android.ugc.aweme.feed.bottom;

import X.ORS;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class LiveVideoEducationEntranceList {
    public static final LiveVideoEducationEntranceList INSTANCE = new LiveVideoEducationEntranceList();
    public static final String[] DEFAULT = {"violation_details_page", "learn_more"};

    public final List<String> getList() {
        ArrayList arrayList = new ArrayList();
        ORS.LJJLIIIJJIZ(arrayList, getArray());
        return arrayList;
    }

    private final String[] getArray() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        String[] strArr = DEFAULT;
        String[] strArr2 = (String[]) LIZLLL.LJIIIIZZ("live_video_education_entrance_list", String[].class, strArr);
        if (strArr2 == null) {
            return strArr;
        }
        return strArr2;
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
