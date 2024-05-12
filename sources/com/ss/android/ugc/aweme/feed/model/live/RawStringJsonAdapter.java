package com.ss.android.ugc.aweme.feed.model.live;

import X.C65385PlN;
import X.C65403Plf;
import com.google.gson.TypeAdapter;
import com.google.gson.o;

/* loaded from: classes12.dex */
public class RawStringJsonAdapter extends TypeAdapter<String> {
    @Override // com.google.gson.TypeAdapter
    public String read(C65385PlN c65385PlN) {
        new o();
        return o.LIZIZ(c65385PlN).toString();
    }

    @Override // com.google.gson.TypeAdapter
    public void write(C65403Plf c65403Plf, String str) {
        if (str == null) {
            c65403Plf.LJIIJJI();
            return;
        }
        c65403Plf.LJJIIJ();
        c65403Plf.LIZ();
        c65403Plf.LJLIL.append((CharSequence) str);
    }
}
