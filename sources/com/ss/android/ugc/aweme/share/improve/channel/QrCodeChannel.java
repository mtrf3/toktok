package com.ss.android.ugc.aweme.share.improve.channel;

import X.AV1;
import X.AbstractC62625Ohx;
import X.C188687aq;
import X.C2068389v;
import X.C4LD;
import X.C53044Kro;
import X.C62162OaU;
import X.C62172Oae;
import X.C62188Oau;
import X.C78609UtB;
import X.C86V;
import X.InterfaceC62573Oh7;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class QrCodeChannel extends PureLogicChannel {
    public final Aweme LJLIL;
    public final SharePackage LJLILLLLZI;

    @Override // X.InterfaceC62225ObV
    public final boolean LIZ(Context context, AbstractC62625Ohx content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC62225ObV
    public final boolean LJIIZILJ() {
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "qr_code";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        if (((Number) C53044Kro.LIZ.getValue()).intValue() == 0) {
            String LJFF = C86V.LJFF(R.string.pr5);
            o.LJIIIIZZ(LJFF, "getString(R.string.qr_code_2)");
            return LJFF;
        }
        String LJFF2 = C86V.LJFF(R.string.tl3);
        o.LJIIIIZZ(LJFF2, "getString(R.string.vid_qr_code_label_name)");
        return LJFF2;
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        if (context != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_color_qr_code_circle;
            return c2068389v.LIZ(context);
        }
        return null;
    }

    public QrCodeChannel(Aweme aweme, SharePackage sharePackage) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = sharePackage;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIIJ(AbstractC62625Ohx content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        if (((Number) C53044Kro.LIZ.getValue()).intValue() == 0) {
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//qrcodev2");
            C62172Oae c62172Oae = new C62172Oae();
            String aid = this.LJLIL.getAid();
            C62162OaU c62162OaU = c62172Oae.LIZ;
            c62162OaU.type = 1;
            c62162OaU.objectId = aid;
            c62162OaU.isHashTag = false;
            String str = "";
            c62162OaU.hashTagName = "";
            c62162OaU.enterFrom = "video";
            Aweme aweme = this.LJLIL;
            if (aweme != null) {
                str = aweme.getDesc();
            }
            String LJFF = AV1.LJFF(this.LJLIL);
            C62162OaU c62162OaU2 = c62172Oae.LIZ;
            c62162OaU2.title = str;
            c62162OaU2.describe = LJFF;
            buildRoute.withParam("extra_params", c62162OaU2);
            buildRoute.open();
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("aweme_type", this.LJLIL.getAwemeType());
            bundle.putString("nick_name", AV1.LJFF(this.LJLIL));
            bundle.putString("video_introduction", C188687aq.LIZ(this.LJLIL));
            bundle.putSerializable("cover_image", C188687aq.LIZIZ(this.LJLIL));
            String string = this.LJLILLLLZI.extras.getString("enter_from");
            String string2 = this.LJLILLLLZI.extras.getString("enter_method");
            String aid2 = this.LJLIL.getAid();
            o.LJIIIIZZ(aid2, "aweme.aid");
            C62188Oau c62188Oau = new C62188Oau(1, aid2, bundle);
            Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
            if (LJJLIIIJ != null) {
                C4LD.LIZ.LJJJI(LJJLIIIJ, this.LJLILLLLZI.itemType, c62188Oau, string, string2);
            }
        }
        return true;
    }
}
