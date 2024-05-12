package X;

import com.bytedance.im.core.proto.MessagesCheckInfo;
import com.squareup.wire.Message;

/* renamed from: X.RTu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69614RTu extends Message.Builder<MessagesCheckInfo, C69614RTu> {
    public Long LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Integer LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesCheckInfo build() {
        return new MessagesCheckInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
