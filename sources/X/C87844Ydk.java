package X;

import com.bytedance.android.livesdk.dataChannel.LinkBattleGuideVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS182S0100000_16;

/* renamed from: X.Ydk, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87844Ydk extends AbstractC09790Zz {
    public C87844Ydk() {
        super(0);
    }

    @Override // X.AbstractC09790Zz
    public final void LIZIZ() {
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.nv0(LinkBattleGuideVisibilityChannel.class, this, new AqS182S0100000_16(this, 30));
        }
    }
}
