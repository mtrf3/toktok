package com.ss.android.ugc.aweme.share.handler;

import X.C43285Gyn;
import X.C4LD;
import X.C62547Ogh;
import X.C65352Pkq;
import X.C73969T1h;
import X.C78555UsJ;
import X.C84654XKg;
import X.DialogC25756A8y;
import X.InterfaceC62225ObV;
import X.InterfaceC62526OgM;
import X.InterfaceC67352kd;
import X.OYF;
import X.T16;
import Y.AfS49S0300000_10;
import Y.IDhS103S0100000_10;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class TTShareDefaultHandler<T extends BaseSharePackage> extends BaseChannelShareHandler<BaseSharePackage> {
    public final Context LJLIL;

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public InterfaceC62526OgM LJ(Context context, BaseSharePackage sharePackage, InterfaceC62225ObV channel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(channel, "channel");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final Object LJIIIIZZ() {
        return new String[0];
    }

    public TTShareDefaultHandler(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        C65352Pkq.LIZ(BaseSharePackage.class);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public Object LJII(InterfaceC62225ObV interfaceC62225ObV, BaseSharePackage baseSharePackage, InterfaceC67352kd<? super String> interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(this.LJLIL);
        dialogC25756A8y.LIZIZ(R.string.rjz);
        if (C62547Ogh.LIZ(interfaceC62225ObV.key())) {
            C43285Gyn.LIZIZ(dialogC25756A8y);
        }
        OYF.LIZLLL(interfaceC62225ObV, baseSharePackage.url, baseSharePackage.itemType).LJIIJ(new IDhS103S0100000_10(baseSharePackage, 3)).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIILLIIL(new AfS49S0300000_10(interfaceC62225ObV, dialogC25756A8y, c84654XKg, 0));
        return c84654XKg.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public Object LJIIJ(Context context, BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV, View view, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        C4LD.LIZIZ.LJJIL(0, interfaceC62225ObV.key());
        return Boolean.TRUE;
    }
}
