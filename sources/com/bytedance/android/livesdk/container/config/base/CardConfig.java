package com.bytedance.android.livesdk.container.config.base;

import X.C31248COe;
import X.C31934Cg6;
import X.CN1;
import X.CNI;
import X.CNK;
import X.CNS;
import X.COQ;
import android.net.Uri;
import com.bytedance.android.live.browser.IContainerService;
import com.bytedance.android.livesdk.container.config.live.LiveCardConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import java.lang.reflect.Field;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CardConfig extends HybridConfig {
    public LiveCardConfig extraConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public CardConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final LiveCardConfig getExtraConfig() {
        return this.extraConfig;
    }

    public CardConfig(Uri uri) {
        super(uri);
        String name;
        String queryParameter;
        String name2;
        String queryParameter2;
        if (uri != null) {
            Class<CardConfig> cls = CardConfig.class;
            while (true) {
                if (cls == null) {
                    break;
                }
                Field[] declaredFields = cls.getDeclaredFields();
                o.LJIIIIZZ(declaredFields, "clazz.declaredFields");
                for (Field field : declaredFields) {
                    CNS cns = (CNS) field.getAnnotation(CNS.class);
                    if (cns != null && (queryParameter2 = UriProtector.getQueryParameter(uri, (name2 = cns.name()))) != null) {
                        field.setAccessible(true);
                        Class<?> type = field.getType();
                        o.LJIIIIZZ(type, "it.type");
                        field.set(this, C31248COe.LIZ(uri, name2, queryParameter2, type));
                    }
                }
                cls = cls.getSuperclass();
            }
            Class<LiveCardConfig> cls2 = LiveCardConfig.class;
            LiveCardConfig newInstance = cls2.newInstance();
            do {
                Field[] declaredFields2 = cls2.getDeclaredFields();
                o.LJIIIIZZ(declaredFields2, "clazz.declaredFields");
                for (Field field2 : declaredFields2) {
                    CNS cns2 = (CNS) field2.getAnnotation(CNS.class);
                    if (cns2 != null && (queryParameter = UriProtector.getQueryParameter(uri, (name = cns2.name()))) != null) {
                        field2.setAccessible(true);
                        Class<?> type2 = field2.getType();
                        o.LJIIIIZZ(type2, "it.type");
                        field2.set(newInstance, C31248COe.LIZ(uri, name, queryParameter, type2));
                    }
                }
                cls2 = cls2.getSuperclass();
            } while (cls2 != null);
            this.extraConfig = newInstance;
        }
    }

    @Override // com.bytedance.android.livesdk.container.config.base.HybridConfig
    public void checkSchema(Uri uri) {
        C31934Cg6 PR;
        COQ b90;
        o.LJIIIZ(uri, "uri");
        super.checkSchema(uri);
        if (!CNI.LJFF.contains(uri.getHost())) {
            if (getEngineType() == CNK.WEB_VIEW) {
                IContainerService iContainerService = (IContainerService) CN1.LIZ(IContainerService.class);
                if (iContainerService != null && (b90 = iContainerService.b90()) != null) {
                    String uri2 = uri.toString();
                    o.LJIIIIZZ(uri2, "uri.toString()");
                    b90.LJ(uri2);
                    return;
                }
                return;
            }
            IContainerService iContainerService2 = (IContainerService) CN1.LIZ(IContainerService.class);
            if (iContainerService2 == null || (PR = iContainerService2.PR()) == null) {
                return;
            }
            String uri3 = uri.toString();
            o.LJIIIIZZ(uri3, "uri.toString()");
            PR.LJ(uri3);
        }
    }

    public final void setExtraConfig(LiveCardConfig liveCardConfig) {
        this.extraConfig = liveCardConfig;
    }

    public /* synthetic */ CardConfig(Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uri);
    }
}
