package X;

import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.Wpq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C83498Wpq extends TBS implements InterfaceC88472Yns<Intent, C83509Wq1> {
    public C83498Wpq(InterfaceC83511Wq3 interfaceC83511Wq3) {
        super(1, interfaceC83511Wq3, InterfaceC83511Wq3.class, "handleResponse", "handleResponse(Landroid/content/Intent;)Lcom/ss/android/ugc/aweme/sticker/types/ar/backgroundvideo/BackgroundMediaData;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C83509Wq1 invoke(Intent intent) {
        Intent p1 = intent;
        o.LJIIIZ(p1, "p1");
        return ((InterfaceC83511Wq3) this.receiver).LIZ(p1);
    }
}