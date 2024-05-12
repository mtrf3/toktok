package X;

import android.os.Parcel;

/* renamed from: X.ZiF, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class BinderC90671ZiF extends BinderC90358ZdC {
    public final /* synthetic */ C90267Zbj LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC90671ZiF(C90267Zbj c90267Zbj) {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
        this.LJLIL = c90267Zbj;
    }

    @Override // X.BinderC90358ZdC
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel.readInt();
            C90267Zbj.LIZ.getClass();
            this.LJLIL.getClass();
            return true;
        }
        return false;
    }
}
