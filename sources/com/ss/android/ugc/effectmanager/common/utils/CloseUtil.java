package com.ss.android.ugc.effectmanager.common.utils;

import X.C16880lQ;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes7.dex */
public class CloseUtil {
    public static void close(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
