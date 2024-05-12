package com.ss.android.ugc.aweme.channel.share.handler;

import X.InterfaceC62225ObV;
import X.InterfaceC62526OgM;
import X.InterfaceC67352kd;
import X.InterfaceC99233ux;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class BaseChannelShareHandler<T extends BaseSharePackage> implements InterfaceC99233ux {
    public boolean LIZJ(InterfaceC62225ObV interfaceC62225ObV, BaseSharePackage baseSharePackage) {
        return false;
    }

    public boolean LIZLLL(InterfaceC62225ObV interfaceC62225ObV, BaseSharePackage baseSharePackage) {
        return true;
    }

    public abstract InterfaceC62526OgM LJ(Context context, BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV);

    public abstract Object LJII(InterfaceC62225ObV interfaceC62225ObV, BaseSharePackage baseSharePackage, InterfaceC67352kd<? super String> interfaceC67352kd);

    public abstract Object LJIIIIZZ();

    public abstract Object LJIIJ(Context context, BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV, View view, InterfaceC67352kd<? super Boolean> interfaceC67352kd);

    public static boolean LIZ(ShareContentType shareContentType) {
        o.LJIIIZ(shareContentType, "shareContentType");
        if (shareContentType == ShareContentType.PHOTO || shareContentType == ShareContentType.PHOTOS || shareContentType == ShareContentType.VIDEO || shareContentType == ShareContentType.LINK_PLUS_PHOTO || shareContentType == ShareContentType.LINK_PLUS_VIDEO) {
            return true;
        }
        return false;
    }

    public String LJFF(BaseSharePackage sharePackage, InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(sharePackage, "sharePackage");
        return sharePackage.description;
    }

    public String LJI(BaseSharePackage sharePackage, InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(sharePackage, "sharePackage");
        return sharePackage.title;
    }
}
