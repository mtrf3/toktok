package com.bytedance.android.livesdk.comp.impl.linkcore.impl;

import X.C76615U5b;
import X.C76650U6k;
import X.C76665U6z;
import X.C76669U7d;
import X.EnumC76124TuC;
import X.InterfaceC75011TcF;
import X.U6Z;
import X.U7Z;
import X.U8H;
import android.content.Context;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class LinkMicService implements ILinkMicService {
    @Override // com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService
    public final InterfaceC75011TcF JR() {
        return U6Z.LIZ();
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService
    public final C76615U5b builder() {
        return new C76615U5b();
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService
    public final U8H PV(Context context, long j, long j2, String str, boolean z, EnumC76124TuC pageType) {
        o.LJIIIZ(pageType, "pageType");
        return new U8H(new C76665U6z(context, 0, j2, str, j, new C76650U6k(new U7Z(), new C76669U7d(), U6Z.LIZ()), z, pageType));
    }
}
