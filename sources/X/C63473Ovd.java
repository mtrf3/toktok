package X;

import com.bytedance.im.core.proto.ClientACKRequestBody;
import com.bytedance.im.core.proto.ClientBatchACKRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.Ovd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63473Ovd extends Message.Builder<ClientBatchACKRequestBody, C63473Ovd> {
    public List<ClientACKRequestBody> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ClientBatchACKRequestBody build() {
        return new ClientBatchACKRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
