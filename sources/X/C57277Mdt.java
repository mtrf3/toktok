package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Mdt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57277Mdt<T> implements InterfaceC41846Gba {
    public final /* synthetic */ DialogC57275Mdr LJLIL;
    public final /* synthetic */ UrlModel LJLILLLLZI;

    public C57277Mdt(DialogC57275Mdr dialogC57275Mdr, UrlModel urlModel) {
        this.LJLIL = dialogC57275Mdr;
        this.LJLILLLLZI = urlModel;
    }

    @Override // X.InterfaceC41846Gba
    public final void accept(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && !bitmap.isRecycled()) {
            ((VA9) this.LJLIL.findViewById(R.id.ea8)).setImageBitmap(bitmap);
        } else {
            C78765Uvh.LJFF((C62846OlW) this.LJLIL.findViewById(R.id.ea8), this.LJLILLLLZI);
        }
    }
}
