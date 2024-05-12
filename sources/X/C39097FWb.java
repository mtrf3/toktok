package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.FWb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39097FWb<T> implements InterfaceC64592gB {
    public static final C39097FWb<T> LJLIL = new C39097FWb<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Intent intent;
        Activity activity = (Activity) obj;
        if (activity == null) {
            return;
        }
        if (C19N.LJ("prevent_push_topview", true) && (intent = activity.getIntent()) != null) {
            FR4.LIZIZ = intent.getBooleanExtra("from_notification", false);
        }
        O6Z.LIZ.LIZLLL(2, activity);
    }
}
