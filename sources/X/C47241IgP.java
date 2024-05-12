package X;

import android.database.Cursor;

/* renamed from: X.IgP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C47241IgP implements InterfaceC67373QcL, InterfaceC47125IeX {
    public final /* synthetic */ int LJLIL;

    @Override // X.InterfaceC67373QcL
    public final Object apply(Object obj) {
        switch (this.LJLIL) {
            case 0:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            default:
                return obj;
        }
    }
}
