package X;

import com.squareup.wire.Message;
import tiktok.image.proto.ImageHeader;

/* loaded from: classes12.dex */
public final class Q3N extends Message.Builder<ImageHeader, Q3N> {
    public Integer LIZLLL;
    public String LJ;
    public Integer LJFF;
    public Long LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public Boolean LJIIJ;
    public Boolean LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ImageHeader build() {
        return new ImageHeader(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
    }
}
