package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Words extends BaseResponse {

    @InterfaceC65349Pkn("words")
    public final List<String> words;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Words) && o.LJ(this.words, ((Words) obj).words);
    }

    public final int hashCode() {
        List<String> list = this.words;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Words(words=");
        return C1NE.LIZIZ(LIZ, this.words, ')', LIZ);
    }

    public Words(List<String> list) {
        this.words = list;
    }
}
