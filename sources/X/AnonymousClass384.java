package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.perf.DBEntireDiffer", f = "DBEntireDiffer.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48}, m = "beforeFullUpdate")
/* renamed from: X.384, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass384 extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AnonymousClass382 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass384(AnonymousClass382 anonymousClass382, InterfaceC67352kd<? super AnonymousClass384> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = anonymousClass382;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(this);
    }
}
