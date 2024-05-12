package X;

import android.database.CharArrayBuffer;
import com.tencent.wcdb.CursorWindow;

/* renamed from: X.X7h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC84317X7h extends AbstractC84318X7i {
    public CursorWindow LJLLILLLL;

    public final void LIZJ() {
        if (-1 != this.LJLIL && getCount() != this.LJLIL) {
            if (this.LJLLILLLL != null) {
                return;
            } else {
                throw new C79569VKr("Attempting to access a closed CursorWindow.Most probable cause: cursor is deactivated prior to calling this method.");
            }
        }
        throw new PO1(this.LJLIL, getCount());
    }

    @Override // X.AbstractC84318X7i
    public final void LIZ() {
        super.LIZ();
        CursorWindow cursorWindow = this.LJLLILLLL;
        if (cursorWindow != null) {
            cursorWindow.close();
            this.LJLLILLLL = null;
        }
    }

    @Override // X.AbstractC84318X7i, X.InterfaceC79378VDi, android.database.Cursor
    public final byte[] getBlob(int i) {
        LIZJ();
        return this.LJLLILLLL.LJIIJ(this.LJLIL, i);
    }

    @Override // android.database.Cursor
    public final double getDouble(int i) {
        LIZJ();
        return this.LJLLILLLL.LJIIJJI(this.LJLIL, i);
    }

    @Override // android.database.Cursor
    public final float getFloat(int i) {
        LIZJ();
        return (float) this.LJLLILLLL.LJIIJJI(this.LJLIL, i);
    }

    @Override // X.InterfaceC79378VDi, android.database.Cursor
    public final int getInt(int i) {
        LIZJ();
        return (int) this.LJLLILLLL.LJIIL(this.LJLIL, i);
    }

    @Override // X.AbstractC84318X7i, X.InterfaceC79378VDi, android.database.Cursor
    public final long getLong(int i) {
        LIZJ();
        return this.LJLLILLLL.LJIIL(this.LJLIL, i);
    }

    @Override // android.database.Cursor
    public final short getShort(int i) {
        LIZJ();
        return (short) this.LJLLILLLL.LJIIL(this.LJLIL, i);
    }

    @Override // X.AbstractC84318X7i, X.InterfaceC79378VDi, android.database.Cursor
    public final String getString(int i) {
        LIZJ();
        return this.LJLLILLLL.LJIILL(this.LJLIL, i);
    }

    @Override // X.AbstractC84318X7i, android.database.Cursor
    public final int getType(int i) {
        LIZJ();
        return this.LJLLILLLL.LJIJ(this.LJLIL, i);
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i) {
        LIZJ();
        if (this.LJLLILLLL.LJIJ(this.LJLIL, i) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC84318X7i, android.database.Cursor
    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        LIZJ();
        this.LJLLILLLL.LJI(this.LJLIL, i, charArrayBuffer);
    }
}
