package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM", f = "AddYoursEntranceButtonVM.kt", l = {66}, m = "getRelatedAddYoursFromRcmdTopic")
/* renamed from: X.8uW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226368uW extends C3CS {
    public C68322mC LJLIL;
    public AddYoursRecommendation LJLILLLLZI;
    public C68322mC LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ AddYoursEntranceButtonVM LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C226368uW(AddYoursEntranceButtonVM addYoursEntranceButtonVM, InterfaceC67352kd<? super C226368uW> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = addYoursEntranceButtonVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.kv0(null, this);
    }
}
