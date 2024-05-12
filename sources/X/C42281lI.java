package X;

import X.C0ZP;
import android.content.Context;
import android.database.Cursor;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: X.1lI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C42281lI extends C1PE<Cursor> {
    public final C0ZP<Cursor>.a LJIIJJI;
    public final android.net.Uri LJIIL;
    public final String[] LJIILIIL;
    public final String LJIILJJIL;
    public final String[] LJIILL;
    public final String LJIILLIIL;
    public Cursor LJIIZILJ;
    public C10610bJ LJIJ;

    @Override // X.C1PE
    public final void LJIIIIZZ() {
        synchronized (this) {
            C10610bJ c10610bJ = this.LJIJ;
            if (c10610bJ != null) {
                c10610bJ.LIZ();
            }
        }
    }

    public Cursor LJIILIIL() {
        boolean z;
        synchronized (this) {
            if (this.LJIIJ != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.LJIJ = new C10610bJ();
            } else {
                throw new C10680bQ();
            }
        }
        try {
            Cursor LIZ = C04240Eq.LIZ(this.LIZJ.getContentResolver(), this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIJ);
            if (LIZ != null) {
                try {
                    LIZ.getCount();
                    LIZ.registerContentObserver(this.LJIIJJI);
                } catch (RuntimeException e) {
                    LIZ.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.LJIJ = null;
            }
            return LIZ;
        } catch (Throwable th) {
            synchronized (this) {
                this.LJIJ = null;
                throw th;
            }
        }
    }

    @Override // X.C0ZP
    public final void LJI() {
        Cursor cursor = this.LJIIZILJ;
        if (cursor != null) {
            LIZIZ(cursor);
        }
        boolean z = this.LJI;
        this.LJI = false;
        this.LJII |= z;
        if (z || this.LJIIZILJ == null) {
            LIZLLL();
        }
    }

    @Override // X.C0ZP
    public final void LJFF() {
        LIZ();
        Cursor cursor = this.LJIIZILJ;
        if (cursor != null && !cursor.isClosed()) {
            this.LJIIZILJ.close();
        }
        this.LJIIZILJ = null;
    }

    @Override // X.C0ZP
    public final void LJII() {
        LIZ();
    }

    @Override // X.C1PE
    public final void LJIIJJI(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (cursor2 != null && !cursor2.isClosed()) {
            cursor2.close();
        }
    }

    @Override // X.C0ZP
    /* renamed from: LJIIL, reason: merged with bridge method [inline-methods] */
    public final void LIZIZ(Cursor cursor) {
        if (this.LJFF) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.LJIIZILJ;
        this.LJIIZILJ = cursor;
        if (this.LIZLLL) {
            super.LIZIZ(cursor);
        }
        if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
            cursor2.close();
        }
    }

    @Override // X.C1PE, X.C0ZP
    public final void LIZJ(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.LIZJ(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.LJIIL);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.LJIILIIL));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.LJIILJJIL);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.LJIILL));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.LJIILLIIL);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.LJIIZILJ);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.LJI);
    }

    public C42281lI(Context context, android.net.Uri uri, String[] strArr, String str, String[] strArr2) {
        super(context);
        this.LJIIJJI = new C0ZP.a();
        this.LJIIL = uri;
        this.LJIILIIL = strArr;
        this.LJIILJJIL = str;
        this.LJIILL = strArr2;
        this.LJIILLIIL = "datetaken DESC";
    }
}
