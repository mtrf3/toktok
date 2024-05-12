package X;

import com.bytedance.im.core.proto.CreateConversationV2RequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Ox3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63561Ox3 extends Message.Builder<CreateConversationV2RequestBody, C63561Ox3> {
    public Integer LIZLLL;
    public Boolean LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJJI;
    public String LJIIL;
    public List<Long> LJ = C63685Oz3.LJIIIIZZ();
    public java.util.Map<String, String> LJIIJ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CreateConversationV2RequestBody build() {
        return new CreateConversationV2RequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
    }
}
