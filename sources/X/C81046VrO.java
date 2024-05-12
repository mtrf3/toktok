package X;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.zhihu.matisse.internal.entity.Album;
import java.lang.ref.WeakReference;

/* renamed from: X.VrO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81046VrO implements C09M<Cursor> {
    public WeakReference<Context> LIZ;
    public C09N LIZIZ;
    public InterfaceC81048VrQ LIZJ;

    @Override // X.C09M
    public final void LIZIZ() {
        if (this.LIZ.get() == null) {
            return;
        }
        this.LIZJ.i3();
    }

    @Override // X.C09M
    public final C0ZP LIZ(Bundle bundle) {
        Album album;
        boolean z;
        String[] strArr;
        String str;
        Context context = this.LIZ.get();
        if (context == null || (album = (Album) bundle.getParcelable("args_album")) == null) {
            return null;
        }
        boolean z2 = false;
        if (album.LIZIZ() && bundle.getBoolean("args_enable_capture", false)) {
            z = true;
        } else {
            z = false;
        }
        if (album.LIZIZ()) {
            C81052VrU c81052VrU = C81055VrX.LIZ;
            str = "media_type=? AND _size>0";
            if (c81052VrU.LIZ()) {
                strArr = new String[]{String.valueOf(1)};
            } else if (c81052VrU.LIZIZ()) {
                strArr = new String[]{String.valueOf(3)};
            } else {
                strArr = C81059Vrb.LJIL;
                str = "(media_type=? OR media_type=?) AND _size>0";
            }
            z2 = z;
        } else {
            C81052VrU c81052VrU2 = C81055VrX.LIZ;
            if (c81052VrU2.LIZ()) {
                strArr = new String[]{String.valueOf(1), album.mId};
            } else if (c81052VrU2.LIZIZ()) {
                strArr = new String[]{String.valueOf(3), album.mId};
            } else {
                strArr = new String[]{String.valueOf(1), String.valueOf(3), album.mId};
                str = "(media_type=? OR media_type=?) AND  bucket_id=? AND _size>0";
            }
            str = "media_type=? AND  bucket_id=? AND _size>0";
        }
        return new C81059Vrb(context, str, strArr, z2);
    }

    @Override // X.C09M
    public final void LIZJ(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.LIZ.get() == null) {
            return;
        }
        this.LIZJ.rd(cursor);
    }
}
