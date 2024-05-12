package X;

import com.bytedance.im.core.proto.BatchUnmarkMessageRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes17.dex */
public final class YY4 extends Message.Builder<BatchUnmarkMessageRequestBody, YY4> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public List<Long> LJI = C63685Oz3.LJIIIIZZ();
    public EnumC87558YXy LJII;
    public Long LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    public final BatchUnmarkMessageRequestBody build() {
        return new BatchUnmarkMessageRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
