package X;

import com.bytedance.im.core.proto.Participant;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.P0g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63750P0g extends Message.Builder<Participant, C63750P0g> {
    public Long LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public String LJI;
    public String LJII;
    public EnumC63751P0h LJIIIIZZ;
    public Long LJIIIZ;
    public java.util.Map<String, String> LJIIJ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final Participant build() {
        return new Participant(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
    }
}
