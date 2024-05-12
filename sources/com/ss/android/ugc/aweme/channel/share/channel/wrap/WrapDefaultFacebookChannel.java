package com.ss.android.ugc.aweme.channel.share.channel.wrap;

import X.C62313Ocv;
import X.C62314Ocw;
import X.InterfaceC62573Oh7;
import X.OYP;
import android.app.Activity;
import com.ss.android.ugc.aweme.channel.share.model.IWrapChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class WrapDefaultFacebookChannel extends IWrapChannel {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final String LJJIFFI() {
        return "wrap_facebook";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final String LJJII() {
        return "com.facebook.katana";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJIII(OYP content, Activity activity, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        return LJIJ(content, activity, interfaceC62573Oh7);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJIIJ(C62313Ocv content, Activity activity, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        return LJII(content, activity, interfaceC62573Oh7);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJIIJZLJL(C62314Ocw content, Activity activity, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        return LJIILIIL(content, activity, interfaceC62573Oh7);
    }
}
