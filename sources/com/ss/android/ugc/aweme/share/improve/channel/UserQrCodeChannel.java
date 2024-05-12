package com.ss.android.ugc.aweme.share.improve.channel;

import X.AbstractC62625Ohx;
import X.C110614Vt;
import X.C188727au;
import X.C2068389v;
import X.C26338AVi;
import X.C45804HyK;
import X.C4LD;
import X.C61328O5c;
import X.C7MY;
import X.C86V;
import X.FMX;
import X.InterfaceC62573Oh7;
import X.SY9;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.ss.android.ugc.aweme.share.ShareService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserQrCodeChannel extends PureLogicChannel {
    @Override // X.InterfaceC62225ObV
    public final boolean LIZ(Context context, AbstractC62625Ohx content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "personal_qr_code";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        String LJFF = C86V.LJFF(R.string.dt_);
        o.LJIIIIZZ(LJFF, "getString(R.string.conne…ends_page_qr_code_option)");
        return LJFF;
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        if (context != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_qr_code;
            c2068389v.LJ = Integer.valueOf(R.attr.go);
            c2068389v.LIZIZ = C7MY.LIZIZ(28);
            c2068389v.LIZJ = C7MY.LIZIZ(28);
            SY9 LIZ = c2068389v.LIZ(context);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cc);
            c110614Vt.LJII = C7MY.LIZIZ(48);
            c110614Vt.LJI = C7MY.LIZIZ(48);
            c110614Vt.LIZJ = C61328O5c.LIZJ(24);
            return C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context));
        }
        return null;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIIJ(AbstractC62625Ohx content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            ShareService shareService = C4LD.LIZ;
            o.LJIIIIZZ(shareService, "shareService()");
            shareService.LJFF(LJIJJ, null, null, null);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "homepage_friends");
        c188727au.LJIIIZ("enter_method", "homepage_friends");
        FMX.LJIIL("enter_qr_code_page", c188727au.LIZ);
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", "homepage_friends");
        c188727au2.LJIIIZ("action_type", "click");
        FMX.LJIIL("qr_code_icon", c188727au2.LIZ);
        return true;
    }
}
