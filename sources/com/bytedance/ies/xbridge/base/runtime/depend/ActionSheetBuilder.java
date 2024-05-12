package com.bytedance.ies.xbridge.base.runtime.depend;

import X.F9E;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ActionSheetBuilder extends F9E {
    public final List<ActionSheetBuilderAction> actions;
    public final Context context;
    public final String subtitle;
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionSheetBuilder copy$default(ActionSheetBuilder actionSheetBuilder, Context context, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            context = actionSheetBuilder.context;
        }
        if ((i & 2) != 0) {
            str = actionSheetBuilder.title;
        }
        if ((i & 4) != 0) {
            str2 = actionSheetBuilder.subtitle;
        }
        if ((i & 8) != 0) {
            list = actionSheetBuilder.actions;
        }
        return actionSheetBuilder.copy(context, str, str2, list);
    }

    public final ActionSheetBuilder copy(Context context, String str, String str2, List<ActionSheetBuilderAction> actions) {
        o.LJIIJ(context, "context");
        o.LJIIJ(actions, "actions");
        return new ActionSheetBuilder(context, str, str2, actions);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.context, this.title, this.subtitle, this.actions};
    }

    public final List<ActionSheetBuilderAction> getActions() {
        return this.actions;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public ActionSheetBuilder(Context context, String str, String str2, List<ActionSheetBuilderAction> actions) {
        o.LJIIJ(context, "context");
        o.LJIIJ(actions, "actions");
        this.context = context;
        this.title = str;
        this.subtitle = str2;
        this.actions = actions;
    }

    public /* synthetic */ ActionSheetBuilder(Context context, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, list);
    }
}
