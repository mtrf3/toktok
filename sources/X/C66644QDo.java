package X;

import com.bytedance.im.core.proto.MessagesPerUserInitComboInboxTypeRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.QDo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66644QDo extends Message.Builder<MessagesPerUserInitComboInboxTypeRequestBody, C66644QDo> {
    public List<Integer> LIZLLL = C63685Oz3.LJIIIIZZ();
    public java.util.Map<Integer, Long> LJ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    public final MessagesPerUserInitComboInboxTypeRequestBody build() {
        return new MessagesPerUserInitComboInboxTypeRequestBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
