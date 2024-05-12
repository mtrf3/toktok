package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.RTz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69619RTz extends Message.Builder<RU0, C69619RTz> {
    public String LIZLLL;
    public java.util.Map<String, String> LJ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final RU0 build() {
        return new RU0(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
