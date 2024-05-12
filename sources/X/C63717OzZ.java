package X;

import com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody;
import com.squareup.wire.Message;

/* renamed from: X.OzZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63717OzZ extends Message.Builder<ModifyMessagePropertyResponseBody, C63717OzZ> {
    public EnumC63233Orl LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ModifyMessagePropertyResponseBody build() {
        return new ModifyMessagePropertyResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
