package X;

import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.Wpu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C83502Wpu extends TBS implements InterfaceC88472Yns<Intent, C83509Wq1> {
    public C83502Wpu(InterfaceC83506Wpy interfaceC83506Wpy) {
        super(1, interfaceC83506Wpy, InterfaceC83506Wpy.class, "handleResponse", "handleResponse(Landroid/content/Intent;)Lcom/ss/android/ugc/aweme/sticker/types/ar/backgroundvideo/BackgroundMediaData;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C83509Wq1 invoke(Intent intent) {
        Intent p1 = intent;
        o.LJIIIZ(p1, "p1");
        return ((InterfaceC83506Wpy) this.receiver).LIZ(p1);
    }
}
