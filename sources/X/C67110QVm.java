package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.QVm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67110QVm extends Message.Builder<C67098QVa, C67110QVm> {
    public EnumC67117QVt LIZLLL;
    public String LJ;
    public String LJFF;
    public Long LJI;
    public QVF LJII;
    public java.util.Map<Integer, C64537PUn> LJIIIIZZ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C67098QVa build() {
        EnumC67117QVt enumC67117QVt = this.LIZLLL;
        if (enumC67117QVt != null) {
            return new C67098QVa(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C63685Oz3.LJII(enumC67117QVt, "version");
        throw null;
    }
}
