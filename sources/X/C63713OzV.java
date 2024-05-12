package X;

import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.OzV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63713OzV extends Message.Builder<C63714OzW, C63713OzV> {
    public List<String> LIZLLL = C63685Oz3.LJIIIIZZ();
    public EnumC62835OlL LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C63714OzW build() {
        return new C63714OzW(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
