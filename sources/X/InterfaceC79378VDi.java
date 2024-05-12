package X;

import android.database.Cursor;

/* renamed from: X.VDi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC79378VDi extends Cursor {
    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // android.database.Cursor
    byte[] getBlob(int i);

    @Override // android.database.Cursor
    int getColumnIndex(String str);

    @Override // android.database.Cursor
    int getCount();

    @Override // android.database.Cursor
    int getInt(int i);

    @Override // android.database.Cursor
    long getLong(int i);

    @Override // android.database.Cursor
    String getString(int i);

    @Override // android.database.Cursor
    boolean moveToFirst();

    @Override // android.database.Cursor
    boolean moveToNext();
}
