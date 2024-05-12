package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SdkExtraInfo implements Serializable {
    public String mvAlgorithmHint = "";
    public PlDataBean pl;

    public final boolean isLegal() {
        PlDataBean plDataBean;
        List<String> alg;
        if (this.mvAlgorithmHint.length() <= 0 || (plDataBean = this.pl) == null || (alg = plDataBean.getAlg()) == null || !(!alg.isEmpty())) {
            return false;
        }
        return true;
    }

    public final String getMvAlgorithmHint() {
        return this.mvAlgorithmHint;
    }

    public final PlDataBean getPl() {
        return this.pl;
    }

    public final void setMvAlgorithmHint(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.mvAlgorithmHint = str;
    }

    public final void setPl(PlDataBean plDataBean) {
        this.pl = plDataBean;
    }
}
