package X;

import com.bytedance.im.core.proto.Config;
import com.squareup.wire.Message;

/* renamed from: X.P0a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63744P0a extends Message.Builder<Config, C63744P0a> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final Config build() {
        return new Config(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
