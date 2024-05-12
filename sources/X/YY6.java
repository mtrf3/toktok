package X;

import com.bytedance.im.core.proto.PullMarkMessageRequestBody;
import com.squareup.wire.Message;

/* loaded from: classes17.dex */
public final class YY6 extends Message.Builder<PullMarkMessageRequestBody, YY6> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;
    public Boolean LJIIIIZZ;
    public EnumC87558YXy LJIIIZ;
    public Long LJIIJ;
    public Boolean LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    public final PullMarkMessageRequestBody build() {
        return new PullMarkMessageRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
    }
}
