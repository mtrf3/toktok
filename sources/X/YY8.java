package X;

import com.bytedance.im.core.proto.MarkMessageRequestBody;
import com.squareup.wire.Message;

/* loaded from: classes17.dex */
public final class YY8 extends Message.Builder<MarkMessageRequestBody, YY8> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;
    public Boolean LJII;
    public EnumC87558YXy LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;

    @Override // com.squareup.wire.Message.Builder
    public final MarkMessageRequestBody build() {
        return new MarkMessageRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
    }
}
