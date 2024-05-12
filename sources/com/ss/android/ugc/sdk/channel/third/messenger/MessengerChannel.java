package com.ss.android.ugc.sdk.channel.third.messenger;

import X.C39242Fag;
import X.C40701FyD;
import X.C52222KeY;
import X.C62313Ocv;
import X.C62314Ocw;
import X.C62674Oik;
import X.C62703OjD;
import X.InterfaceC62573Oh7;
import X.OYP;
import android.app.Activity;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.channel.share.model.IWrapChannel;
import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes11.dex */
public final class MessengerChannel extends IWrapChannel {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final String LJJIFFI() {
        return "messenger";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final String LJJII() {
        return "com.facebook.orca";
    }

    public static void LJJIIZ(Activity activity) {
        if (!u.LJII()) {
            u.LJIIJ(activity);
        }
        C62703OjD.LIZ(new String[]{"LDU"}, TokenCert.Companion.with("bpea-facebook_androidsdk_4288"));
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJIII(OYP content, Activity activity, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        if (C52222KeY.LIZ()) {
            if (!C39242Fag.LIZ(activity, "com.facebook.orca")) {
                C40701FyD.LIZIZ(activity);
                return true;
            }
            return LJIJ(content, activity, interfaceC62573Oh7);
        }
        LJJIIZ(activity);
        if (!C39242Fag.LIZ(activity, "com.facebook.orca")) {
            C40701FyD.LIZIZ(activity);
            return true;
        }
        return LJIJ(content, activity, interfaceC62573Oh7);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJIIJ(C62313Ocv content, Activity activity, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        if (C52222KeY.LIZ()) {
            return LJII(content, activity, interfaceC62573Oh7);
        }
        LJJIIZ(activity);
        C62674Oik.LIZ(activity, content.LIZIZ, "image/*", TokenCert.Companion.with("bpea-facebook_androidsdk_2001"));
        return true;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJIIJZLJL(C62314Ocw content, Activity activity, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        if (C52222KeY.LIZ()) {
            return LJIILIIL(content, activity, interfaceC62573Oh7);
        }
        LJJIIZ(activity);
        C62674Oik.LIZ(activity, content.LIZIZ, "video/*", TokenCert.Companion.with("bpea-facebook_androidsdk_2002"));
        return true;
    }
}
