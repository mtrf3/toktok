package X;

import com.bytedance.im.core.proto.Config;
import com.bytedance.im.core.proto.GetConfigsResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.P0c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63746P0c extends Message.Builder<GetConfigsResponseBody, C63746P0c> {
    public Integer LIZLLL;
    public List<Config> LJ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConfigsResponseBody build() {
        return new GetConfigsResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
