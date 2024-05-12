package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.framework.media.NotificationAction;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Zhl, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90641Zhl extends C90232ZbA implements ZZ2 {
    @Override // X.ZZ2
    public final int[] LIZJ() {
        Parcel LLJI = LLJI(LJLJI(), 4);
        int[] createIntArray = LLJI.createIntArray();
        LLJI.recycle();
        return createIntArray;
    }

    @Override // X.ZZ2
    public final List<NotificationAction> LJIIIIZZ() {
        Parcel LLJI = LLJI(LJLJI(), 3);
        ArrayList createTypedArrayList = LLJI.createTypedArrayList(NotificationAction.CREATOR);
        LLJI.recycle();
        return createTypedArrayList;
    }

    public C90641Zhl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }
}
