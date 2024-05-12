package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.AbstractC65781Prl;
import X.EF7;
import X.InterfaceC65784Pro;
import android.content.res.Resources;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareQnAContent$resourcesGetter$1 extends AbstractC65781Prl implements InterfaceC65784Pro<Resources> {
    public static final ShareQnAContent$resourcesGetter$1 INSTANCE = new ShareQnAContent$resourcesGetter$1();

    public ShareQnAContent$resourcesGetter$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Resources invoke() {
        Resources resources = EF7.LIZIZ().getResources();
        o.LJIIIIZZ(resources, "getApplicationContext().resources");
        return resources;
    }
}
