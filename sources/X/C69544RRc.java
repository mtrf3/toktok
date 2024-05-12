package X;

import com.bytedance.im.core.proto.UpsertConversationSettingExtInfoRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.RRc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69544RRc extends Message.Builder<UpsertConversationSettingExtInfoRequestBody, C69544RRc> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public java.util.Map<String, String> LJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    public final UpsertConversationSettingExtInfoRequestBody build() {
        return new UpsertConversationSettingExtInfoRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
