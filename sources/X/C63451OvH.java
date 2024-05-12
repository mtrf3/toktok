package X;

import com.bytedance.im.core.proto.ModifyPropertyBody;
import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.OvH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63451OvH extends Message.Builder<ModifyPropertyBody, C63451OvH> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;
    public String LJII;
    public List<ModifyPropertyContent> LJIIIIZZ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ModifyPropertyBody build() {
        return new ModifyPropertyBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
