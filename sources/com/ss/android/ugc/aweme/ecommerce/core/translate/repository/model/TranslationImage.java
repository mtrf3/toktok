package com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TranslationImage extends F9E {

    @InterfaceC65349Pkn("host")
    public final String host;

    @InterfaceC65349Pkn("imgs")
    public final List<String> imgs;

    @InterfaceC65349Pkn("spec")
    public final String spec;

    @InterfaceC65349Pkn("trg_lang")
    public final String trgLang;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.imgs, this.trgLang, this.host, this.spec};
    }

    public TranslationImage(List<String> imgs, String trgLang, String host, String spec) {
        o.LJIIIZ(imgs, "imgs");
        o.LJIIIZ(trgLang, "trgLang");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(spec, "spec");
        this.imgs = imgs;
        this.trgLang = trgLang;
        this.host = host;
        this.spec = spec;
    }

    public /* synthetic */ TranslationImage(List list, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, (i & 8) != 0 ? "img" : str3);
    }
}
