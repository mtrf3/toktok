package X;

import com.bytedance.im.core.proto.UpsertConversationCoreExtInfoRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.RRa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69542RRa extends Message.Builder<UpsertConversationCoreExtInfoRequestBody, C69542RRa> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public java.util.Map<String, String> LJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    public final UpsertConversationCoreExtInfoRequestBody build() {
        return new UpsertConversationCoreExtInfoRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
