package X;

import java.net.URLConnection;

/* renamed from: X.PaB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C64691PaB implements InterfaceC64701PaL {
    public final /* synthetic */ Object LJLIL;

    @Override // X.InterfaceC64701PaL
    public final String LIZIZ(String str) {
        return ((URLConnection) this.LJLIL).getRequestProperty(str);
    }
}
