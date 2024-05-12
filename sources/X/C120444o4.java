package X;

import com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.4o4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120444o4 extends Message.Builder<SetConversationCoreInfoRequestBody, C120444o4> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public Boolean LJIIJ;
    public Boolean LJIIJJI;
    public Boolean LJIIL;
    public Boolean LJIILIIL;
    public java.util.Map<String, String> LJIILJJIL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SetConversationCoreInfoRequestBody build() {
        return new SetConversationCoreInfoRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, buildUnknownFields());
    }
}
