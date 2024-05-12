package com.ss.android.ugc.aweme.plugin.shortcuts;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.V0N;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShortcutsData extends F9E {

    @InterfaceC65349Pkn("should_add_shortcut")
    public final boolean shouldAddShortcut;

    @InterfaceC65349Pkn("type")
    public final ShortcutType type;

    /* loaded from: classes5.dex */
    public enum ShortcutType {
        CLEAN_MEMORY,
        REFERRAL;

        public static ShortcutType valueOf(String str) {
            return (ShortcutType) V0N.LJJJ(ShortcutType.class, str);
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.type, Boolean.valueOf(this.shouldAddShortcut)};
    }

    public ShortcutsData(ShortcutType type, boolean z) {
        o.LJIIIZ(type, "type");
        this.type = type;
        this.shouldAddShortcut = z;
    }
}
