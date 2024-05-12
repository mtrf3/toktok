package X;

import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.google.gson.a;
import com.google.gson.b;
import kotlin.jvm.internal.o;

/* renamed from: X.PlL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65383PlL implements a {
    @Override // com.google.gson.a
    public final boolean shouldSkipField(b bVar) {
        return false;
    }

    @Override // com.google.gson.a
    public final boolean shouldSkipClass(Class<?> cls) {
        return o.LJ(cls, SubscribeInfo.class);
    }
}
