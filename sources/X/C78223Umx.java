package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Umx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78223Umx implements InterfaceC48974JJy {
    public final /* synthetic */ C78216Umq LIZ;

    public C78223Umx(C78216Umq c78216Umq) {
        this.LIZ = c78216Umq;
    }

    @Override // X.InterfaceC48974JJy
    public final View create(Context context) {
        return new C78215Ump(context, this.LIZ.LIZLLL);
    }
}
