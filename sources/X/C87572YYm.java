package X;

import com.bytedance.scalpel.protos.MethodStack;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.YYm, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87572YYm extends Message.Builder<MethodStack, C87572YYm> {
    public Long LIZLLL;
    public Integer LJFF;
    public String LJI;
    public List<Long> LJ = C63685Oz3.LJIIIIZZ();
    public List<String> LJII = C63685Oz3.LJIIIIZZ();
    public List<String> LJIIIIZZ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MethodStack build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new MethodStack(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "time");
        throw null;
    }
}
