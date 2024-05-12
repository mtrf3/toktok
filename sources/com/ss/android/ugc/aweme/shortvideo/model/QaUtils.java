package com.ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;

/* loaded from: classes15.dex */
public final class QaUtils {
    public static final QaUtils INSTANCE = new QaUtils();

    public static final boolean isDataValid(QaStruct qaStruct) {
        if (qaStruct == null) {
            return false;
        }
        return !TextUtils.isEmpty(qaStruct.getQuestionContent());
    }
}
