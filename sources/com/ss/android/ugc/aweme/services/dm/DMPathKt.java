package com.ss.android.ugc.aweme.services.dm;

import defpackage.i0;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DMPathKt {
    public static final String ensureSeparatorSuffix(String str) {
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (ujb.o.LJJJJ(str, separator, false)) {
            return str;
        }
        return i0.LJFF(str, separator);
    }

    public static final boolean smartCreateNewDir(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return file.mkdirs();
        }
        return true;
    }
}
