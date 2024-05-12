package com.google.gson.internal;

import X.C164456cr;
import X.C33851Un;
import X.C47261Igj;
import X.F4S;
import X.InterfaceC16060k6;
import X.InterfaceC73786Sxa;
import X.InterfaceC80692Vlg;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectGlobalConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes14.dex */
public final class i implements n, InterfaceC80692Vlg, InterfaceC16060k6, F4S, InterfaceC73786Sxa {
    public static final i LJLIL = new i();
    public static final i LJLILLLLZI = new i();

    @Override // X.InterfaceC80692Vlg
    public void LJFF(C164456cr c164456cr) {
    }

    public static JSInjectGlobalConfig LIZLLL() {
        return new JSInjectGlobalConfig(null, null, null, null, null, 31, null);
    }

    @Override // X.InterfaceC16060k6
    public List LIZ() {
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.o.LJIIIIZZ(locale, "getDefault()");
        return C47261Igj.LJJIJ(new C33851Un(locale));
    }

    @Override // com.google.gson.internal.n
    public Object LJI() {
        return new ArrayList();
    }

    public static void LIZJ(Runnable runnable) {
        System.currentTimeMillis();
        runnable.run();
        System.currentTimeMillis();
    }

    @Override // X.InterfaceC16060k6
    public C33851Un LIZIZ(String languageTag) {
        kotlin.jvm.internal.o.LJIIIZ(languageTag, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(languageTag);
        kotlin.jvm.internal.o.LJIIIIZZ(forLanguageTag, "forLanguageTag(languageTag)");
        return new C33851Un(forLanguageTag);
    }

    @Override // X.InterfaceC73786Sxa
    public boolean test(Object t1, Object t2) {
        kotlin.jvm.internal.o.LJIIIZ(t1, "t1");
        kotlin.jvm.internal.o.LJIIIZ(t2, "t2");
        return false;
    }
}
