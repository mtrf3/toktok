package X;

import com.bytedance.android.livesdk.dataChannel.FollowGuideVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS182S0100000_16;

/* renamed from: X.Ydi, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87842Ydi extends AbstractC09790Zz {
    public C87842Ydi() {
        super(0);
    }

    @Override // X.AbstractC09790Zz
    public final void LIZIZ() {
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.nv0(FollowGuideVisibilityChannel.class, this, new AqS182S0100000_16(this, 23));
        }
    }
}
