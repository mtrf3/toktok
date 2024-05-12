package com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl;

import X.C109464Ri;
import X.C117144ik;
import X.C16880lQ;
import X.C40343FsR;
import X.C58096Mr6;
import X.C59222NMc;
import X.C60737Nsb;
import android.content.Context;
import android.content.Intent;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.IAdWebJumpInterceptor;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AdWebJumpInterceptor implements IAdWebJumpInterceptor {
    public static IAdWebJumpInterceptor LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IAdWebJumpInterceptor.class, false);
        if (LIZ != null) {
            return (IAdWebJumpInterceptor) LIZ;
        }
        if (C58096Mr6.LLLLLILLIL == null) {
            synchronized (IAdWebJumpInterceptor.class) {
                if (C58096Mr6.LLLLLILLIL == null) {
                    C58096Mr6.LLLLLILLIL = new AdWebJumpInterceptor();
                }
            }
        }
        return C58096Mr6.LLLLLILLIL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.web.IAdWebJumpInterceptor
    public final void LIZIZ(Context context, SparkContext sparkContext) {
        C40343FsR.LJIILJJIL.LJIIIZ();
        Intent intent = new Intent(context, (Class<?>) AdWebSparkActivity.class);
        C109464Ri.LIZ.getClass();
        C117144ik.LIZIZ.getClass();
        C117144ik.LIZIZ(sparkContext);
        intent.putExtra("SparkContextContainerId", sparkContext.containerId);
        intent.setFlags(268435456);
        C16880lQ.LIZJ(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.web.IAdWebJumpInterceptor
    public final boolean LIZ(Context context, C60737Nsb currentContext, SparkContext sparkContext, String str) {
        o.LJIIIZ(currentContext, "currentContext");
        if (currentContext.LIZIZ(C59222NMc.class) != null) {
            LIZIZ(context, sparkContext);
            return true;
        }
        return false;
    }
}
