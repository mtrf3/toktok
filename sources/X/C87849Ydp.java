package X;

import com.bytedance.android.livesdk.rank.api.RankListDialogVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS182S0100000_16;

/* renamed from: X.Ydp, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87849Ydp extends AbstractC09790Zz {
    public C87849Ydp() {
        super(0);
    }

    @Override // X.AbstractC09790Zz
    public final void LIZIZ() {
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.nv0(RankListDialogVisibilityChannel.class, this, new AqS182S0100000_16(this, 28));
        }
    }
}
