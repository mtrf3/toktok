package X;

import com.bytedance.im.core.proto.ConversationMessageSearchRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.RSy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69592RSy extends Message.Builder<ConversationMessageSearchRequestBody, C69592RSy> {
    public String LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;
    public Integer LJII;
    public String LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    public final ConversationMessageSearchRequestBody build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new ConversationMessageSearchRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C63685Oz3.LJII(str, "search_query", this.LJ, "conv_short_id");
        throw null;
    }
}
