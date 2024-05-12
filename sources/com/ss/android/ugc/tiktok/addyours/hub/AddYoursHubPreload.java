package com.ss.android.ugc.tiktok.addyours.hub;

import X.C16880lQ;
import X.C38350F3i;
import X.C38827FLr;
import X.C74942ws;
import X.EFJ;
import X.InterfaceC37276Ek4;
import X.InterfaceC88472Yns;
import X.X8M;
import android.os.Bundle;
import com.ss.android.ugc.tiktok.addyours.api.IAddYoursApiDefinition;
import com.ss.android.ugc.tiktok.addyours.hub.model.HubFeedResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AddYoursHubPreload implements X8M<IAddYoursApiDefinition, InterfaceC37276Ek4<HubFeedResponse>> {
    public static final C74942ws Companion = new Object() { // from class: X.2ws
    };

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        String str;
        Long LJJIZ;
        Object obj = null;
        if (bundle != null) {
            obj = C16880lQ.LLJJIII(bundle, "uid");
        }
        if ((obj instanceof String) && (str = (String) obj) != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null && LJJIZ.longValue() > 0) {
            return true;
        }
        return false;
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(0, EFJ.LIZJ, false, 5);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIIZ(exception, "exception");
        C16880lQ.LLLLIIL(exception);
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.X8M
    public InterfaceC37276Ek4<HubFeedResponse> preload(Bundle bundle, InterfaceC88472Yns<? super Class<IAddYoursApiDefinition>, ? extends IAddYoursApiDefinition> create) {
        long j;
        String str;
        Long LJJIZ;
        o.LJIIIZ(create, "create");
        Object obj = null;
        if (bundle != null) {
            obj = C16880lQ.LLJJIII(bundle, "uid");
        }
        if ((obj instanceof String) && (str = (String) obj) != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
            j = LJJIZ.longValue();
        } else {
            j = -1;
        }
        return create.invoke(IAddYoursApiDefinition.class).fetchHubFeed(j, 1, 0L, 1, 30);
    }
}
