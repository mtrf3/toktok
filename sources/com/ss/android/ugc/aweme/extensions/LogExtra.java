package com.ss.android.ugc.aweme.extensions;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LogExtra extends F9E implements Serializable {

    @InterfaceC65349Pkn("photo_content_type")
    public final String photoContentType;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.photoContentType};
    }

    public final String L() {
        return this.photoContentType;
    }

    public LogExtra(String photoContentType) {
        o.LJIIIZ(photoContentType, "photoContentType");
        this.photoContentType = photoContentType;
    }
}
