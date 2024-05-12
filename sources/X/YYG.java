package X;

import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeRequestBody;
import com.squareup.wire.Message;

/* loaded from: classes17.dex */
public final class YYG extends Message.Builder<GetMessageInfoByIndexV2RangeRequestBody, YYG> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;
    public EnumC63513OwH LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessageInfoByIndexV2RangeRequestBody build() {
        Long l = this.LJI;
        if (l != null && this.LJII != null) {
            return new GetMessageInfoByIndexV2RangeRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "min_index_in_conversation_v2", this.LJII, "max_index_in_conversation_v2");
        throw null;
    }
}
