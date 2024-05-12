package com.bytedance.android.livesdk.hotword;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.guide.model.KeywordsLibrary;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class KeywordsLibraryInfo extends F9E {

    @InterfaceC65349Pkn("libraries")
    public final List<KeywordsLibrary> libraries;

    @InterfaceC65349Pkn("version")
    public final long version;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.libraries, Long.valueOf(this.version)};
    }

    public KeywordsLibraryInfo(List<KeywordsLibrary> libraries, long j) {
        o.LJIIIZ(libraries, "libraries");
        this.libraries = libraries;
        this.version = j;
    }
}
