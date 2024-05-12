package com.bytedance.android.livesdk.container.config.base;

import X.C31248COe;
import X.CNS;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.lang.reflect.Field;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ViewConfig extends HybridConfig {
    /* JADX WARN: Multi-variable type inference failed */
    public ViewConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ViewConfig(Uri uri) {
        super(uri);
        String name;
        String queryParameter;
        if (uri != null) {
            Class<ViewConfig> cls = ViewConfig.class;
            do {
                Field[] declaredFields = cls.getDeclaredFields();
                o.LJIIIIZZ(declaredFields, "clazz.declaredFields");
                for (Field field : declaredFields) {
                    CNS cns = (CNS) field.getAnnotation(CNS.class);
                    if (cns != null && (queryParameter = UriProtector.getQueryParameter(uri, (name = cns.name()))) != null) {
                        field.setAccessible(true);
                        Class<?> type = field.getType();
                        o.LJIIIIZZ(type, "it.type");
                        field.set(this, C31248COe.LIZ(uri, name, queryParameter, type));
                    }
                }
                cls = cls.getSuperclass();
            } while (cls != null);
        }
    }

    public /* synthetic */ ViewConfig(Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uri);
    }
}
