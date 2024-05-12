package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: X.Vwt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81387Vwt extends AbstractC81781W7t {
    public static final String[] LIZLLL = {"_id", "_data"};
    public final ContentResolver LIZJ;

    @Override // X.AbstractC81781W7t
    public final String LJ() {
        return "LocalContentUriFetchProducer";
    }

    @Override // X.AbstractC81781W7t
    public final W8X LIZLLL(W5O w5o) {
        boolean z;
        Cursor query;
        InputStream createInputStream;
        android.net.Uri uri = w5o.LIZIZ;
        if (C78964Uyu.LJ(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith(C78964Uyu.LIZ.getPath())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (uri.toString().endsWith("/photo")) {
                createInputStream = this.LIZJ.openInputStream(uri);
            } else if (uri.toString().endsWith("/display_photo")) {
                try {
                    createInputStream = this.LIZJ.openAssetFileDescriptor(uri, "r").createInputStream();
                } catch (IOException unused) {
                    throw new IOException(C43588H8u.LIZ("Contact photo does not exist: ", uri));
                }
            } else {
                createInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.LIZJ, uri);
                if (createInputStream == null) {
                    throw new IOException(C43588H8u.LIZ("Contact photo does not exist: ", uri));
                }
            }
            return LIZJ(createInputStream, -1);
        }
        if (C78964Uyu.LIZLLL(uri)) {
            ContentResolver contentResolver = this.LIZJ;
            String[] strArr = LIZLLL;
            W8X w8x = null;
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-9157788469347463607"));
            if (LIZJ.LIZ) {
                query = (Cursor) LIZJ.LIZIZ;
            } else {
                query = contentResolver.query(uri, strArr, null, null, null);
            }
            if (query != null) {
                try {
                    if (query.getCount() != 0) {
                        query.moveToFirst();
                        String string = query.getString(query.getColumnIndex("_data"));
                        if (string != null) {
                            w8x = LIZJ(new FileInputStream(string), (int) new File(string).length());
                        }
                    }
                } catch (FileNotFoundException unused2) {
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
                query.close();
                if (w8x != null) {
                    return w8x;
                }
            }
        }
        return LIZJ(this.LIZJ.openInputStream(uri), -1);
    }

    public C81387Vwt(Executor executor, W84 w84, ContentResolver contentResolver) {
        super(executor, w84);
        this.LIZJ = contentResolver;
    }
}
