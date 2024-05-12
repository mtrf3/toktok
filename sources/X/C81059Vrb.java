package X;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.provider.MediaStore;

/* renamed from: X.Vrb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81059Vrb extends C42281lI {
    public static final android.net.Uri LJIJJ = MediaStore.Files.getContentUri("external");
    public static final String[] LJIJJLI = {"_id", "_display_name", "mime_type", "_size", "duration"};
    public static final String[] LJIL = {String.valueOf(1), String.valueOf(3)};
    public final boolean LJIJI;

    @Override // X.C0ZP
    public final void LJ() {
    }

    @Override // X.C1PE
    public final Cursor LJIIJ() {
        Cursor LJIILIIL = super.LJIILIIL();
        if (!this.LJIJI || !C16880lQ.LLLLL(this.LIZJ).getPackageManager().hasSystemFeature("android.hardware.camera")) {
            return LJIILIIL;
        }
        MatrixCursor matrixCursor = new MatrixCursor(LJIJJLI);
        matrixCursor.addRow(new Object[]{-1L, "Capture", "", 0, 0});
        return new MergeCursor(new Cursor[]{matrixCursor, LJIILIIL});
    }

    public C81059Vrb(Context context, String str, String[] strArr, boolean z) {
        super(context, LJIJJ, LJIJJLI, str, strArr);
        this.LJIJI = z;
    }
}
