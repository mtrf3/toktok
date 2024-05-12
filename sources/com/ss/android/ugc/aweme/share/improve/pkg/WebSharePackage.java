package com.ss.android.ugc.aweme.share.improve.pkg;

import X.AbstractC62625Ohx;
import X.AbstractC73635Sv9;
import X.C39579Fg7;
import X.C4LD;
import X.C62057OXd;
import X.C62063OXj;
import X.C62071OXr;
import X.C62074OXu;
import X.C62075OXv;
import X.C62076OXw;
import X.C62079OXz;
import X.C62374Odu;
import X.C66580QBc;
import X.C73969T1h;
import X.C76800UCe;
import X.C78765Uvh;
import X.EF7;
import X.InterfaceC62225ObV;
import X.InterfaceC62573Oh7;
import X.InterfaceC88472Yns;
import X.OYF;
import X.OYP;
import X.T16;
import X.X1D;
import Y.AfS62S0100000_10;
import Y.IDhS5S1000000_10;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class WebSharePackage extends SharePackage {
    public static final C62057OXd Companion = new C62057OXd();
    public String imagePath;
    public String remoteImagePath;

    public final Bundle LJIILL() {
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", this.extras.getString("enter_from"));
        return bundle;
    }

    public WebSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final AbstractC62625Ohx LJIIJJI(InterfaceC62225ObV channel) {
        String LIZJ;
        o.LJIIIZ(channel, "channel");
        String LIZJ2 = C62063OXj.LIZJ(this.extras.getBoolean("enable_copylink_desc"), channel, this.description);
        if (this.extras.getBoolean("user_origin_link")) {
            LIZJ = this.url;
        } else {
            LIZJ = OYF.LIZJ(channel, this.url, this.itemType);
        }
        if (o.LJ(channel.key(), "facebook") || o.LJ(channel.key(), "copy")) {
            return new OYP(LIZJ, LIZJ2, 4);
        }
        if (o.LJ(channel.key(), "email")) {
            return new OYP(LIZJ, this.title, LIZJ2);
        }
        C62079OXz c62079OXz = new C62079OXz(LIZJ, LIZJ2, LJIILL());
        String str = this.remoteImagePath;
        if (str == null) {
            str = "";
        }
        String downloadedPath = C78765Uvh.LJIIJJI(str);
        o.LJIIIIZZ(downloadedPath, "downloadedPath");
        if (downloadedPath.length() > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C66580QBc.LJIILL(EF7.LIZIZ()));
            LIZ.append("image_for_share.jpg");
            String LIZIZ = X1D.LIZIZ(LIZ);
            C39579Fg7.LJIL(LIZIZ);
            C39579Fg7.LIZLLL(downloadedPath, LIZIZ);
            String uri = OYF.LJ(EF7.LIZIZ(), LIZIZ).toString();
            o.LJIIIIZZ(uri, "sharePath.pathToUri(AppC…tionContext()).toString()");
            ((BaseBundle) c62079OXz.LIZ).putString("image", uri);
        }
        return c62079OXz;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final AbstractC73635Sv9<AbstractC62625Ohx> LJIIL(InterfaceC62225ObV interfaceC62225ObV) {
        AbstractC73635Sv9 LIZLLL;
        String LIZJ = C62063OXj.LIZJ(this.extras.getBoolean("enable_copylink_desc"), interfaceC62225ObV, this.description);
        boolean z = this.extras.getBoolean("user_origin_link");
        if (z) {
            LIZLLL = AbstractC73635Sv9.LJ(new C62075OXv(this));
        } else {
            LIZLLL = OYF.LIZLLL(interfaceC62225ObV, this.url, this.itemType);
        }
        if (o.LJ(interfaceC62225ObV.key(), "facebook")) {
            return LIZLLL.LJIIJ(new IDhS5S1000000_10(LIZJ, 0)).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ());
        }
        return LIZLLL.LJIIJ(new C62071OXr(z, this, interfaceC62225ObV, LIZJ)).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public void LJIILIIL(InterfaceC62225ObV channel, InterfaceC88472Yns<? super AbstractC62625Ohx, C76800UCe> interfaceC88472Yns) {
        AbstractC73635Sv9 LIZLLL;
        o.LJIIIZ(channel, "channel");
        String LIZJ = C62063OXj.LIZJ(this.extras.getBoolean("enable_copylink_desc"), channel, this.description);
        boolean z = this.extras.getBoolean("user_origin_link");
        if (z) {
            LIZLLL = AbstractC73635Sv9.LJ(new C62076OXw(this));
        } else {
            LIZLLL = OYF.LIZLLL(channel, this.url, this.itemType);
        }
        if (o.LJ(channel.key(), "facebook") || o.LJ(channel.key(), "copy")) {
            LIZLLL.LJIIJ(new IDhS5S1000000_10(LIZJ, 1)).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIILLIIL(new AfS62S0100000_10(interfaceC88472Yns, 25));
        } else {
            LIZLLL.LJIIJ(new C62074OXu(z, this, channel, LIZJ)).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIILLIIL(new AfS62S0100000_10(interfaceC88472Yns, 26));
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZLLL(InterfaceC62225ObV channel, Context context, View view, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        C4LD.LIZIZ.LJJIL(0, channel.key());
        return false;
    }
}
