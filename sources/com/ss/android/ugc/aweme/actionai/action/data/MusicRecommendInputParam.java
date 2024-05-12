package com.ss.android.ugc.aweme.actionai.action.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MusicRecommendInputParam {

    @InterfaceC65349Pkn("key_summarize")
    public final String keySummarize;

    @InterfaceC65349Pkn("title")
    public final String title;

    public static /* synthetic */ MusicRecommendInputParam copy$default(MusicRecommendInputParam musicRecommendInputParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicRecommendInputParam.keySummarize;
        }
        if ((i & 2) != 0) {
            str2 = musicRecommendInputParam.title;
        }
        return musicRecommendInputParam.copy(str, str2);
    }

    public final MusicRecommendInputParam copy(String str, String str2) {
        return new MusicRecommendInputParam(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicRecommendInputParam)) {
            return false;
        }
        MusicRecommendInputParam musicRecommendInputParam = (MusicRecommendInputParam) obj;
        return o.LJ(this.keySummarize, musicRecommendInputParam.keySummarize) && o.LJ(this.title, musicRecommendInputParam.title);
    }

    public int hashCode() {
        String str = this.keySummarize;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicRecommendInputParam(keySummarize=");
        LIZ.append(this.keySummarize);
        LIZ.append(", title=");
        return q.LIZIZ(LIZ, this.title, ')', LIZ);
    }

    public final String getKeySummarize() {
        return this.keySummarize;
    }

    public final String getTitle() {
        return this.title;
    }

    public MusicRecommendInputParam(String str, String str2) {
        this.keySummarize = str;
        this.title = str2;
    }
}
