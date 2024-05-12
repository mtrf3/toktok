package X;

import com.bytedance.im.core.proto.PropertyItem;
import com.squareup.wire.Message;

/* loaded from: classes17.dex */
public final class YYO extends Message.Builder<PropertyItem, YYO> {
    public Long LIZLLL;
    public String LJ;
    public Long LJFF;
    public String LJI;
    public String LJII;
    public Long LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PropertyItem build() {
        return new PropertyItem(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
