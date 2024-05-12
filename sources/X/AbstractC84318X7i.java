package X;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Bundle;
import defpackage.a1;
import defpackage.i0;
import java.util.HashMap;

/* renamed from: X.X7i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC84318X7i implements InterfaceC79378VDi {
    public boolean LJLJI;
    public ContentResolver LJLJJI;
    public android.net.Uri LJLJJL;
    public C84319X7j LJLJL;
    public boolean LJLJLJ;
    public final Object LJLJJLL = new Object();
    public final DataSetObservable LJLJLLL = new DataSetObservable();
    public final ContentObservable LJLL = new ContentObservable();
    public Bundle LJLLI = Bundle.EMPTY;
    public int LJLIL = -1;
    public int LJLILLLLZI = -1;

    public void LIZIZ(int i) {
    }

    @Override // X.InterfaceC79378VDi, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.LJLJI = true;
        this.LJLL.unregisterAll();
        LIZ();
    }

    @Override // android.database.Cursor
    public abstract String[] getColumnNames();

    @Override // X.InterfaceC79378VDi, android.database.Cursor
    public abstract int getCount();

    @Override // X.InterfaceC79378VDi, android.database.Cursor
    public abstract long getLong(int i);

    @Override // X.InterfaceC79378VDi, android.database.Cursor
    public abstract String getString(int i);

    @Override // android.database.Cursor
    public int getType(int i) {
        return 3;
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // X.InterfaceC79378VDi, android.database.Cursor
    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    public void LIZ() {
        C84319X7j c84319X7j = this.LJLJL;
        if (c84319X7j != null) {
            this.LJLJJI.unregisterContentObserver(c84319X7j);
            this.LJLJLJ = false;
        }
        this.LJLJLLL.notifyInvalidated();
    }

    public void finalize() {
        C84319X7j c84319X7j = this.LJLJL;
        if (c84319X7j != null && this.LJLJLJ) {
            this.LJLJJI.unregisterContentObserver(c84319X7j);
        }
        try {
            if (!this.LJLJI) {
                close();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        if (this.LJLIL == 0 && getCount() != 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC79378VDi, android.database.Cursor
    public final boolean moveToNext() {
        return moveToPosition(this.LJLIL + 1);
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return moveToPosition(this.LJLIL - 1);
    }

    @Override // android.database.Cursor
    public boolean requery() {
        C84319X7j c84319X7j = this.LJLJL;
        if (c84319X7j != null && !this.LJLJLJ) {
            this.LJLJJI.registerContentObserver(this.LJLJJL, true, c84319X7j);
            this.LJLJLJ = true;
        }
        this.LJLJLLL.notifyChanged();
        return true;
    }

    public AbstractC84318X7i() {
        new HashMap();
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        return getColumnNames().length;
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        if (getCount() == 0 || this.LJLIL == getCount()) {
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        if (getCount() == 0 || this.LJLIL == -1) {
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        int count = getCount();
        if (this.LJLIL == count - 1 && count != 0) {
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    @Override // android.database.Cursor
    public void deactivate() {
        LIZ();
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        return this.LJLLI;
    }

    @Override // android.database.Cursor
    public final android.net.Uri getNotificationUri() {
        return this.LJLJJL;
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.LJLIL;
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC79378VDi, android.database.Cursor
    public byte[] getBlob(int i) {
        throw new UnsupportedOperationException("getBlob is not supported");
    }

    @Override // X.InterfaceC79378VDi, android.database.Cursor
    public int getColumnIndex(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            com.tencent.wcdb.support.Log.LIZIZ("Cursor", i0.LJFF("requesting column name with table name -- ", str), new Exception());
            str = str.substring(lastIndexOf + 1);
        }
        String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (columnNames[i].equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalArgumentException(a1.LJ("column '", str, "' does not exist"));
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i) {
        return getColumnNames()[i];
    }

    @Override // android.database.Cursor
    public final boolean move(int i) {
        return moveToPosition(this.LJLIL + i);
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i) {
        int count = getCount();
        if (i >= count) {
            this.LJLIL = count;
            return false;
        }
        if (i < 0) {
            this.LJLIL = -1;
            return false;
        }
        if (i == this.LJLIL) {
            return true;
        }
        LIZIZ(i);
        this.LJLIL = i;
        int i2 = this.LJLILLLLZI;
        if (i2 != -1) {
            getLong(i2);
        }
        return true;
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
        this.LJLL.registerObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.LJLJLLL.registerObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        return Bundle.EMPTY;
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        this.LJLLI = bundle;
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
        if (!this.LJLJI) {
            this.LJLL.unregisterObserver(contentObserver);
        }
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.LJLJLLL.unregisterObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        String string = getString(i);
        if (string != null) {
            char[] cArr = charArrayBuffer.data;
            if (cArr == null || cArr.length < string.length()) {
                charArrayBuffer.data = string.toCharArray();
            } else {
                string.getChars(0, string.length(), cArr, 0);
            }
            charArrayBuffer.sizeCopied = string.length();
            return;
        }
        charArrayBuffer.sizeCopied = 0;
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, android.net.Uri uri) {
        synchronized (this.LJLJJLL) {
            this.LJLJJL = uri;
            this.LJLJJI = contentResolver;
            C84319X7j c84319X7j = this.LJLJL;
            if (c84319X7j != null) {
                contentResolver.unregisterContentObserver(c84319X7j);
            }
            C84319X7j c84319X7j2 = new C84319X7j(this);
            this.LJLJL = c84319X7j2;
            this.LJLJJI.registerContentObserver(this.LJLJJL, true, c84319X7j2);
            this.LJLJLJ = true;
        }
    }
}
