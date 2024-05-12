package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM", f = "AddYoursCollectionListVM.kt", l = {35}, m = "onLoadMore")
/* renamed from: X.8jB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219338jB extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ AddYoursCollectionListVM LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219338jB(AddYoursCollectionListVM addYoursCollectionListVM, InterfaceC67352kd<? super C219338jB> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = addYoursCollectionListVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.gv0(0L, this);
    }
}
