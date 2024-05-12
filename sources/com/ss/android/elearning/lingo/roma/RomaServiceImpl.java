package com.ss.android.elearning.lingo.roma;

import X.FBP;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RomaServiceImpl implements RomaHostService {
    @Override // com.ss.android.elearning.lingo.roma.RomaHostService
    public final String k7(String url) {
        o.LJIIIZ(url, "url");
        return (String) FBP.LIZ(url).getFirst();
    }
}
