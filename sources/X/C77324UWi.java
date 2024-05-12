package X;

import java.io.BufferedReader;
import java.util.Iterator;

/* renamed from: X.UWi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77324UWi implements InterfaceC1039145z<String> {
    public final BufferedReader LIZ;

    @Override // X.InterfaceC1039145z
    public final Iterator<String> iterator() {
        return new C77323UWh(this);
    }

    public C77324UWi(BufferedReader bufferedReader) {
        this.LIZ = bufferedReader;
    }
}
