package com.google.android.play.core.assetpacks;

import X.C16880lQ;
import X.C40560Fvw;
import X.InterfaceC38408F5o;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* loaded from: classes7.dex */
public final class f0 {
    public final InterfaceC38408F5o<s2> LIZ;

    public f0(InterfaceC38408F5o<s2> interfaceC38408F5o) {
        this.LIZ = interfaceC38408F5o;
    }

    public final InputStream LIZ(int i, int i2, String str, String str2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C40560Fvw.LIZIZ(this.LIZ.a().LJ(i, i2, str, str2));
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                throw new m0(C16880lQ.LLLZ("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), i);
            }
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        } catch (InterruptedException e) {
            throw new m0(i, "Extractor was interrupted while waiting for chunk file.", e);
        } catch (ExecutionException e2) {
            throw new m0(i, C16880lQ.LLLZ("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), e2);
        }
    }
}
