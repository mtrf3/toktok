package com.ss.android.ugc.aweme.kvstorage;

import X.F9J;
import android.content.Context;
import android.content.SharedPreferences;
import com.aweme.kvstorage.spi.ISharedPreferencesProvider;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SharedPreferencesProvider implements ISharedPreferencesProvider {
    @Override // com.aweme.kvstorage.spi.ISharedPreferencesProvider
    public final SharedPreferences LIZ(Context context, int i, String str) {
        HashSet<String> hashSet = F9J.LIZLLL;
        if (!hashSet.contains(str)) {
            hashSet.add(str);
        }
        SharedPreferences LIZIZ = F9J.LIZIZ(context, i, str);
        o.LJIIIIZZ(LIZIZ, "context.getSharedPreferences(name, mode)");
        return LIZIZ;
    }
}
