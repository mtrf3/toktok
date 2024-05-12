package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FeelgoodOptionData implements Serializable {

    @InterfaceC65349Pkn("optionKey")
    public final String optionKey;

    @InterfaceC65349Pkn("score")
    public final String score;

    @InterfaceC65349Pkn("text")
    public final String text;

    public static /* synthetic */ FeelgoodOptionData copy$default(FeelgoodOptionData feelgoodOptionData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feelgoodOptionData.optionKey;
        }
        if ((i & 2) != 0) {
            str2 = feelgoodOptionData.text;
        }
        if ((i & 4) != 0) {
            str3 = feelgoodOptionData.score;
        }
        return feelgoodOptionData.copy(str, str2, str3);
    }

    public final FeelgoodOptionData copy(String optionKey, String str, String str2) {
        o.LJIIIZ(optionKey, "optionKey");
        return new FeelgoodOptionData(optionKey, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeelgoodOptionData)) {
            return false;
        }
        FeelgoodOptionData feelgoodOptionData = (FeelgoodOptionData) obj;
        return o.LJ(this.optionKey, feelgoodOptionData.optionKey) && o.LJ(this.text, feelgoodOptionData.text) && o.LJ(this.score, feelgoodOptionData.score);
    }

    public int hashCode() {
        int hashCode = this.optionKey.hashCode() * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.score;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeelgoodOptionData(optionKey=");
        LIZ.append(this.optionKey);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", score=");
        return q.LIZIZ(LIZ, this.score, ')', LIZ);
    }

    public final String getOptionKey() {
        return this.optionKey;
    }

    public final String getScore() {
        return this.score;
    }

    public final String getText() {
        return this.text;
    }

    public FeelgoodOptionData(String optionKey, String str, String str2) {
        o.LJIIIZ(optionKey, "optionKey");
        this.optionKey = optionKey;
        this.text = str;
        this.score = str2;
    }
}
