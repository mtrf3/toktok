package com.ss.android.ugc.effectmanager.knadapt;

import X.InterfaceC79048V0q;
import java.io.InputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class InputStreamByteRead implements InterfaceC79048V0q {
    public final InputStream inputStream;

    @Override // X.InterfaceC79048V0q
    public boolean available() {
        if (this.inputStream.available() >= 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC79048V0q
    public void close() {
        this.inputStream.close();
    }

    public InputStreamByteRead(InputStream inputStream) {
        o.LJIIJ(inputStream, "inputStream");
        this.inputStream = inputStream;
    }

    @Override // X.InterfaceC79048V0q
    public int read(byte[] b, int i, int i2) {
        o.LJIIJ(b, "b");
        return this.inputStream.read(b, i, i2);
    }
}
