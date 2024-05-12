package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.profile.model.User;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.OpenServiceKt", f = "OpenService.kt", l = {38}, m = "assembleMafInfo")
/* renamed from: X.397, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass397<T extends User> extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;

    public AnonymousClass397(InterfaceC67352kd<? super AnonymousClass397> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return AnonymousClass396.LIZ(null, null, this);
    }
}
