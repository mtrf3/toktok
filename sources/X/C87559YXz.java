package X;

import com.bytedance.im.core.proto.TokenInfo;
import com.squareup.wire.Message;

/* renamed from: X.YXz, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87559YXz extends Message.Builder<TokenInfo, C87559YXz> {
    public Integer LIZLLL;
    public EnumC87555YXv LJ;
    public Integer LJFF;
    public Long LJI;
    public Long LJII;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final TokenInfo build() {
        return new TokenInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
