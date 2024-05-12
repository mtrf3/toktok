package com.ss.android.ugc.aweme.spark.business;

import X.AbstractC37353ElJ;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SparkShareBusiness extends AbsSparkShareBusiness {
    public WebView LJIIIIZZ;

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
    
        if (LJ() == false) goto L58;
     */
    @Override // com.ss.android.ugc.aweme.spark.business.AbsSparkShareBusiness
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.spark.business.SparkShareBusiness.LIZJ():void");
    }

    public final String LIZLLL() {
        Map<String, String> params = this.LIZ.getParams();
        if (params != null) {
            return params.get("aweme_id");
        }
        return null;
    }

    private final boolean LJ() {
        String str;
        IAwemeService LIZ = AwemeService.LIZ();
        Map<String, String> params = this.LIZ.getParams();
        if (params != null) {
            str = params.get("aweme_id");
        } else {
            str = null;
        }
        Aweme o6 = LIZ.o6(str);
        if (o6 != null && o6.isAd()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkShareBusiness(AbstractC37353ElJ sparkBusiness) {
        super(sparkBusiness);
        o.LJIIIZ(sparkBusiness, "sparkBusiness");
    }
}
