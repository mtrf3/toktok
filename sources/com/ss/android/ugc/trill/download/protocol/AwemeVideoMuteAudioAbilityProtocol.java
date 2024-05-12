package com.ss.android.ugc.trill.download.protocol;

import X.AbstractC44957Hkf;
import X.C44956Hke;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.share.downloadv2.protocol.DefaultMuteAudioAbilityProtocol;

/* loaded from: classes8.dex */
public final class AwemeVideoMuteAudioAbilityProtocol extends DefaultMuteAudioAbilityProtocol {
    public final boolean LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.MuteAudioAbilityProtocol
    public final boolean LIZ() {
        return this.LJLILLLLZI;
    }

    public AwemeVideoMuteAudioAbilityProtocol(AbstractC44957Hkf abstractC44957Hkf) {
        super(abstractC44957Hkf);
        boolean z;
        ACLCommonShare aCLCommonShare = ((C44956Hke) abstractC44957Hkf).LJIILIIL;
        if (aCLCommonShare != null) {
            z = aCLCommonShare.getMute();
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
    }
}
