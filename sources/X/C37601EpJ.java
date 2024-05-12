package X;

import java.io.InputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.EpJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37601EpJ implements InterfaceC37464En6 {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ java.util.Map LJ;
    public final /* synthetic */ InputStream LJFF;

    @Override // X.InterfaceC37464En6
    public final InputStream getData() {
        InputStream stream = this.LJFF;
        o.LJFF(stream, "stream");
        return stream;
    }

    @Override // X.InterfaceC37464En6
    public final java.util.Map<String, String> LJFF() {
        return this.LJ;
    }

    @Override // X.InterfaceC37464En6
    public final String LJI() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37464En6
    public final int LJII() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC37464En6
    public final String LJIIIIZZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC37464En6
    public final EnumC37644Eq0 LJIIIZ() {
        return EnumC37644Eq0.Online;
    }

    @Override // X.InterfaceC37464En6
    public final String getMimeType() {
        return this.LIZ;
    }

    public C37601EpJ(String str, String str2, int i, String str3, java.util.Map map, InputStream inputStream) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
        this.LJ = map;
        this.LJFF = inputStream;
    }
}
