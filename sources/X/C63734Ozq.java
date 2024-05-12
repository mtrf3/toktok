package X;

import com.bytedance.im.core.proto.NewDirectPushNotify;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.Ozq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63734Ozq extends Message.Builder<NewDirectPushNotify, C63734Ozq> {
    public EnumC63735Ozr LIZLLL;
    public Long LJ;
    public String LJFF;
    public String LJI;
    public Long LJII;
    public Integer LJIIIIZZ;
    public Integer LJIIIZ;
    public String LJIIJ;
    public java.util.Map<String, String> LJIIJJI = new LinkedHashMap();
    public Long LJIIL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final NewDirectPushNotify build() {
        return new NewDirectPushNotify(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
    }
}
