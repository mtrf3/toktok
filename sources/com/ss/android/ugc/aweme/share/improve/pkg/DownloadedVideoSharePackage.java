package com.ss.android.ugc.aweme.share.improve.pkg;

import X.AbstractC62625Ohx;
import X.C4LD;
import X.C62236Obg;
import X.C62324Od6;
import X.C62340OdM;
import X.C62374Odu;
import X.C73969T1h;
import X.C76800UCe;
import X.EF7;
import X.InterfaceC62225ObV;
import X.InterfaceC62573Oh7;
import X.InterfaceC88472Yns;
import X.OYF;
import X.T16;
import Y.AfS62S0100000_10;
import Y.IDhS103S0100000_10;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DownloadedVideoSharePackage extends KtfDefaultSharePackage {
    public Aweme aweme;
    public String path;
    public static final C62236Obg Companion = new C62236Obg();
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.KtfDefaultSharePackage
    public final Aweme LJIILL() {
        return this.aweme;
    }

    public DownloadedVideoSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIILIIL(InterfaceC62225ObV channel, InterfaceC88472Yns<? super AbstractC62625Ohx, C76800UCe> interfaceC88472Yns) {
        InterfaceC62225ObV LIZIZ;
        ShareInfo shareInfo;
        String shareUrl;
        o.LJIIIZ(channel, "channel");
        if (o.LJ(channel.key(), "facebook") && (LIZIZ = C62324Od6.LIZIZ("facebook_story", null)) != null && !LIZIZ.LIZLLL(EF7.LIZIZ())) {
            Aweme aweme = this.aweme;
            if (aweme != null && (shareInfo = aweme.getShareInfo()) != null && (shareUrl = shareInfo.getShareUrl()) != null) {
                OYF.LIZLLL(channel, shareUrl, this.itemType).LJIIJ(new IDhS103S0100000_10(this, 1)).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIILLIIL(new AfS62S0100000_10(interfaceC88472Yns, 22));
            }
            this.extras.putString("share_form", "url_form");
            return;
        }
        Aweme aweme2 = this.aweme;
        String str = this.path;
        if (str != null) {
            C62340OdM.LIZIZ(aweme2, channel, interfaceC88472Yns, this, str, 1);
        } else {
            o.LJIJI("path");
            throw null;
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
