package X;

import com.bytedance.im.core.proto.GetUserConversationListRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.OvE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63448OvE extends Message.Builder<GetUserConversationListRequestBody, C63448OvE> {
    public EnumC63479Ovj LIZLLL;
    public Long LJ;
    public EnumC63506OwA LJFF;
    public Long LJI;
    public Integer LJII;
    public Integer LJIIIIZZ;
    public Boolean LJIIIZ;
    public Boolean LJIIJ;
    public Integer LJIIJJI;
    public List<Integer> LJIIL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetUserConversationListRequestBody build() {
        return new GetUserConversationListRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
    }
}
