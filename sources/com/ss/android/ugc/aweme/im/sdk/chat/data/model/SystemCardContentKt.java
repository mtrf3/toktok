package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C79045V0n;
import X.C84763XOl;
import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SystemCardContentKt {
    public static final int colorTypeToColor(Integer num) {
        int i;
        Activity LJIIIIZZ;
        Integer LJI;
        if (num != null && num.intValue() != 0) {
            if (num.intValue() == 1) {
                i = R.attr.gu;
            } else if (num.intValue() == 2) {
                i = R.attr.gv;
            } else if (num.intValue() == 3) {
                i = R.attr.gp;
            } else if (num.intValue() == 4) {
                i = R.attr.eb;
            } else if (num.intValue() == 5) {
                i = R.attr.e7;
            }
            LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ == null && (LJI = C79045V0n.LJI(i, LJIIIIZZ)) != null) {
                return LJI.intValue();
            }
            return -1;
        }
        i = R.attr.go;
        LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
        }
        return -1;
    }

    public static final void open(LinkInfo linkInfo, Context context) {
        o.LJIIIZ(linkInfo, "<this>");
        o.LJIIIZ(context, "context");
        int actionType = linkInfo.getActionType();
        if (actionType != 1) {
            if (actionType != 2) {
                return;
            }
            SmartRouter.buildRoute(context, linkInfo.getLinkUrl()).open();
        } else {
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//webview/");
            buildRoute.withParam("url", linkInfo.getLinkUrl());
            buildRoute.open();
        }
    }
}
