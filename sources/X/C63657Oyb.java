package X;

import com.bytedance.im.core.proto.SendInputStatusRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.Oyb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63657Oyb extends Message.Builder<SendInputStatusRequestBody, C63657Oyb> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public EnumC63669Oyn LJI;
    public java.util.Map<String, String> LJII = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SendInputStatusRequestBody build() {
        return new SendInputStatusRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
