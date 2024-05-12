package com.bytedance.ies.xbridge.base.runtime.depend;

import X.F9E;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ToastBuilder extends F9E {
    public final Context context;
    public final String customIcon;
    public final Integer duration;
    public final String message;
    public final String type;

    public static /* synthetic */ ToastBuilder copy$default(ToastBuilder toastBuilder, Context context, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            context = toastBuilder.context;
        }
        if ((i & 2) != 0) {
            str = toastBuilder.message;
        }
        if ((i & 4) != 0) {
            str2 = toastBuilder.type;
        }
        if ((i & 8) != 0) {
            str3 = toastBuilder.customIcon;
        }
        if ((i & 16) != 0) {
            num = toastBuilder.duration;
        }
        return toastBuilder.copy(context, str, str2, str3, num);
    }

    public final ToastBuilder copy(Context context, String str, String str2, String str3, Integer num) {
        o.LJIIJ(context, "context");
        return new ToastBuilder(context, str, str2, str3, num);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.context, this.message, this.type, this.customIcon, this.duration};
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getCustomIcon() {
        return this.customIcon;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getType() {
        return this.type;
    }

    public ToastBuilder(Context context, String str, String str2, String str3, Integer num) {
        o.LJIIJ(context, "context");
        this.context = context;
        this.message = str;
        this.type = str2;
        this.customIcon = str3;
        this.duration = num;
    }

    public /* synthetic */ ToastBuilder(Context context, String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? num : null);
    }
}
