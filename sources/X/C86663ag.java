package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.data.dao.SharePermissionDaoErrorReporter", f = "SharePermissionDaoErrorReporter.kt", l = {51}, m = "updateSharePermission")
/* renamed from: X.3ag, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86663ag extends C3CS {
    public C86633ad LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C86633ad LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86663ag(C86633ad c86633ad, InterfaceC67352kd<? super C86663ag> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c86633ad;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJ(null, this);
    }
}