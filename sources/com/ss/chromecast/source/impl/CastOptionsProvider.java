package com.ss.chromecast.source.impl;

import X.C90205Zaj;
import X.C90222Zb0;
import X.C90224Zb2;
import X.X1D;
import X.ZYN;
import X.ZYW;
import android.content.Context;
import android.text.TextUtils;
import com.byted.cast.common.Logger;
import com.byted.cast.common.Utils;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import java.util.List;

/* loaded from: classes29.dex */
public class CastOptionsProvider implements ZYN {
    @Override // X.ZYN
    public List<ZYW> getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override // X.ZYN
    public CastOptions getCastOptions(Context context) {
        String chromeCastId = Utils.getChromeCastId();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getCastOptions: chromecastReceiverID: ");
        LIZ.append(chromeCastId);
        Logger.d("CastOptionsProvider", X1D.LIZIZ(LIZ));
        if (TextUtils.isEmpty(chromeCastId)) {
            chromeCastId = "CC1AD845";
        }
        LaunchOptions launchOptions = new C90205Zaj().LIZ;
        launchOptions.zzc = true;
        C90222Zb0 c90222Zb0 = new C90222Zb0();
        c90222Zb0.LIZJ = launchOptions;
        c90222Zb0.LIZ = chromeCastId;
        C90224Zb2 c90224Zb2 = new C90224Zb2();
        return new CastOptions(c90222Zb0.LIZ, c90222Zb0.LIZIZ, false, c90222Zb0.LIZJ, c90222Zb0.LIZLLL, new CastMediaOptions("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, c90224Zb2.LIZ, false, c90224Zb2.LIZIZ), c90222Zb0.LJ, c90222Zb0.LJFF, false, false, false);
    }
}
