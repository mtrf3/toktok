package dmt.av.services;

import X.C44546He2;
import X.InterfaceC153045zY;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VEEncodingImpl implements IVEEncodingSetting {
    @Override // com.ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting
    public final VEVideoEncodeSettings LIZ(VideoPublishEditModel source, SynthetiseResult synthetiseResult, InterfaceC153045zY interfaceC153045zY) {
        o.LJIIIZ(source, "source");
        return C44546He2.LIZJ(source, synthetiseResult, null, interfaceC153045zY, "");
    }
}
