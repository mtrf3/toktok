package com.ss.android.ugc.aweme.share.qrcode.channel;

import X.C110614Vt;
import X.C2068389v;
import X.C26338AVi;
import X.C46177IAj;
import X.C61328O5c;
import X.C7MY;
import X.InterfaceC62573Oh7;
import X.OYP;
import X.OZP;
import X.SY9;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CopyLinkChannelWithBPEA extends CopyLinkChannel {
    public static final C46177IAj LJLJI = new C46177IAj();
    public final OZP LJLILLLLZI;

    public CopyLinkChannelWithBPEA() {
        this(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyLinkChannelWithBPEA(int i) {
        super(false);
        OZP ozp = new OZP();
        this.LJLILLLLZI = ozp;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel, X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        if (context != null) {
            C2068389v c2068389v = new C2068389v();
            OZP ozp = this.LJLILLLLZI;
            c2068389v.LIZ = ozp.LJLIL;
            c2068389v.LJ = Integer.valueOf(ozp.LJLILLLLZI);
            c2068389v.LIZIZ = C7MY.LIZIZ(32);
            c2068389v.LIZJ = C7MY.LIZIZ(32);
            SY9 LIZ = c2068389v.LIZ(context);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(this.LJLILLLLZI.LJLJI);
            c110614Vt.LJII = C7MY.LIZIZ(48);
            c110614Vt.LJI = C7MY.LIZIZ(48);
            c110614Vt.LIZJ = C61328O5c.LIZJ(24);
            return C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel, com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC62225ObV
    public final boolean LJIJ(OYP content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        if (content.LIZLLL.length() == 0) {
            return false;
        }
        LJLJI.getClass();
        return C46177IAj.LIZ(content, context);
    }
}
