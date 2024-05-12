package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import android.text.TextUtils;

/* loaded from: classes13.dex */
public class HotSearchGuideWord {

    @InterfaceC65349Pkn("breathe_times")
    public int breatheTimes;

    @InterfaceC65349Pkn("word")
    public String displayWord;

    @InterfaceC65349Pkn("search_word")
    public String searchWord;

    @InterfaceC65349Pkn("type")
    public int type;

    public String getSearchWord() {
        if (TextUtils.isEmpty(this.searchWord)) {
            return this.displayWord;
        }
        return this.searchWord;
    }

    public boolean isAd() {
        if (this.type == 3) {
            return true;
        }
        return false;
    }

    public boolean isNormalWord() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("displayWord: ");
        LIZ.append(this.displayWord);
        LIZ.append(", searchWord: ");
        LIZ.append(this.searchWord);
        LIZ.append(", type: ");
        LIZ.append(this.type);
        return X1D.LIZIZ(LIZ);
    }
}
