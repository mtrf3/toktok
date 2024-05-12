package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes10.dex */
public final class IssueCategory extends F9E {

    @InterfaceC65349Pkn("category")
    public String category;

    @InterfaceC65349Pkn("issues")
    public List<String> issues;

    @Override // X.F9E
    public final Object[] getObjects() {
        String str = this.category;
        List<String> list = this.issues;
        return new Object[]{str, str, list, list, list};
    }
}
