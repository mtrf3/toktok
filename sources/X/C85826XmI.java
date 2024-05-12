package X;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: X.XmI, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85826XmI implements InterfaceC81628W1w {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ C85924Xns LIZIZ;

    @Override // X.InterfaceC81628W1w
    public final void LIZ() {
        Bundle bundle = new Bundle();
        bundle.putInt("email_source", V86.DYA_BIND_EMAIL_SOURCE_TYPE_EMAIL_NOTIFICATION.getValue());
        HG3.LJFF().bindEmail(this.LIZ, "email_notification", "click", bundle, null);
        this.LIZIZ.LJLJLJ = true;
    }

    public C85826XmI(Activity activity, C85924Xns c85924Xns) {
        this.LIZ = activity;
        this.LIZIZ = c85924Xns;
    }
}
