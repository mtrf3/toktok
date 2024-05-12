package X;

import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.8jF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219378jF extends MB6 implements CoroutineExceptionHandler {
    public final /* synthetic */ AddYoursCollectionListVM LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219378jF(AnonymousClass315 anonymousClass315, AddYoursCollectionListVM addYoursCollectionListVM) {
        super(anonymousClass315);
        this.LJLIL = addYoursCollectionListVM;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        this.LJLIL.setState(new AqS169S0100000_3(th, 703));
    }
}
