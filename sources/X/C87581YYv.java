package X;

import com.bytedance.scalpel.protos.BigJankMsg;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.YYv, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87581YYv extends Message.Builder<BigJankMsg, C87581YYv> {
    public String LIZLLL;
    public List<BigJankMsg.MessageDispatch> LJ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BigJankMsg build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new BigJankMsg(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C63685Oz3.LJII(str, "method_mapping");
        throw null;
    }
}
