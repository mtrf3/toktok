package com.google.gson.internal;

import X.C141335gf;
import X.C33851Un;
import X.C3C5;
import X.C75622Tm6;
import X.CL6;
import X.EnumC76429Tz7;
import X.F45;
import X.F9E;
import X.FHD;
import X.InterfaceC15710jX;
import X.InterfaceC16060k6;
import android.os.LocaleList;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes14.dex */
public final class j implements n, InterfaceC16060k6, InterfaceC15710jX, F45 {
    public static final void LIZLLL(String msg) {
        kotlin.jvm.internal.o.LJIIIZ(msg, "msg");
    }

    @Override // com.google.gson.internal.n
    public Object LJI() {
        return new ConcurrentSkipListMap();
    }

    @Override // X.InterfaceC16060k6
    public List LIZ() {
        LocaleList localeList = LocaleList.getDefault();
        kotlin.jvm.internal.o.LJIIIIZZ(localeList, "getDefault()");
        ArrayList arrayList = new ArrayList();
        int size = localeList.size();
        for (int i = 0; i < size; i++) {
            Locale locale = localeList.get(i);
            kotlin.jvm.internal.o.LJIIIIZZ(locale, "localeList[i]");
            arrayList.add(new C33851Un(locale));
        }
        return arrayList;
    }

    @Override // X.InterfaceC16060k6
    public C33851Un LIZIZ(String languageTag) {
        kotlin.jvm.internal.o.LJIIIZ(languageTag, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(languageTag);
        kotlin.jvm.internal.o.LJIIIIZZ(forLanguageTag, "forLanguageTag(languageTag)");
        return new C33851Un(forLanguageTag);
    }

    @Override // X.InterfaceC15710jX
    public void onFinish(boolean z) {
        if (!z) {
            CL6.LIZIZ("match_in_progress");
        }
        C75622Tm6.LJIJI(EnumC76429Tz7.START_ANIMATION, z, null);
    }

    @Override // X.F45
    public Object LIZJ(String str, F9E f9e, Type type) {
        Object LIZ;
        String str2;
        if (str != null) {
            try {
                FHD.LIZLLL().getClass();
                Object LJIIJ = FHD.LJIIJ(str, true);
                Gson LIZ2 = GsonHolder.LIZLLL().LIZ();
                if (LJIIJ instanceof String) {
                    str2 = (String) LJIIJ;
                } else {
                    str2 = null;
                }
                LIZ = LIZ2.LJII(str2, type);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                return f9e;
            }
            return LIZ;
        }
        return f9e;
    }
}
