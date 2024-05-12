package X;

import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RQO extends Message.Builder<RQN, RQO> {
    @Override // com.squareup.wire.Message.Builder
    public final RQN build() {
        return new RQN(buildUnknownFields());
    }
}
