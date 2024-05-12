package com.bytedance.android.live.base.model.user;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes.dex */
public final class BadgeText extends F9E {

    @InterfaceC65349Pkn("default_pattern")
    public String defaultPattern;

    @InterfaceC65349Pkn("key")
    public String key;

    @InterfaceC65349Pkn("pieces")
    public List<String> pieces;

    @Override // X.F9E
    public final Object[] getObjects() {
        String str = this.key;
        String str2 = this.defaultPattern;
        List<String> list = this.pieces;
        return new Object[]{str, str, str2, str2, list, list, list};
    }
}
