package com.bytedance.ies.xbridge.base.runtime.depend;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ActionSheetBuilderAction extends F9E {
    public final String subtitle;
    public final String title;
    public final String type;

    public static /* synthetic */ ActionSheetBuilderAction copy$default(ActionSheetBuilderAction actionSheetBuilderAction, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionSheetBuilderAction.title;
        }
        if ((i & 2) != 0) {
            str2 = actionSheetBuilderAction.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = actionSheetBuilderAction.type;
        }
        return actionSheetBuilderAction.copy(str, str2, str3);
    }

    public final ActionSheetBuilderAction copy(String title, String str, String type) {
        o.LJIIJ(title, "title");
        o.LJIIJ(type, "type");
        return new ActionSheetBuilderAction(title, str, type);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.title, this.subtitle, this.type};
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public ActionSheetBuilderAction(String title, String str, String type) {
        o.LJIIJ(title, "title");
        o.LJIIJ(type, "type");
        this.title = title;
        this.subtitle = str;
        this.type = type;
    }

    public /* synthetic */ ActionSheetBuilderAction(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, str3);
    }
}
