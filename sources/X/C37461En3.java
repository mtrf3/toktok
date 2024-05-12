package X;

import java.io.InputStream;

/* renamed from: X.En3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37461En3 implements InterfaceC37464En6 {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ java.util.Map LJ;
    public final /* synthetic */ EnumC37644Eq0 LJFF;
    public final /* synthetic */ InputStream LJI;

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
        return this.LJFF;
    }

    @Override // X.InterfaceC37464En6
    public final InputStream getData() {
        return this.LJI;
    }

    @Override // X.InterfaceC37464En6
    public final String getMimeType() {
        return this.LIZ;
    }

    public C37461En3(String str, String str2, int i, String str3, java.util.Map map, EnumC37644Eq0 enumC37644Eq0, InputStream inputStream) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
        this.LJ = map;
        this.LJFF = enumC37644Eq0;
        this.LJI = inputStream;
    }
}
