package com.ss.ugc.android.davinciresource;

import defpackage.i0;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class BuildInModelFinderKt {
    public static final String joinFileSeperator(String joinFileSeperator) {
        o.LJIIJ(joinFileSeperator, "$this$joinFileSeperator");
        String str = File.separator;
        o.LJFF(str, "File.separator");
        if (ujb.o.LJJJJ(joinFileSeperator, str, false)) {
            return joinFileSeperator;
        }
        return i0.LJFF(joinFileSeperator, str);
    }
}
