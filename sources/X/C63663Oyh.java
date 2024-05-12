package X;

import com.bytedance.im.core.proto.GetMessagesCheckInfoV2RequestBody;
import com.squareup.wire.Message;

/* renamed from: X.Oyh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63663Oyh extends Message.Builder<GetMessagesCheckInfoV2RequestBody, C63663Oyh> {
    public Long LIZLLL;
    public String LJ;
    public EnumC63506OwA LJFF;
    public Long LJI;
    public Integer LJII;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessagesCheckInfoV2RequestBody build() {
        return new GetMessagesCheckInfoV2RequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
