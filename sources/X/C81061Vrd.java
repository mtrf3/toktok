package X;

import android.content.Context;
import com.ss.android.ugc.aweme.fe.method.H5UploadFileMethod;
import com.zhihu.matisse.internal.entity.Item;
import com.zhiliaoapp.musically.R;
import java.io.FileNotFoundException;

/* renamed from: X.Vrd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81061Vrd extends AbstractC81054VrW {
    public final /* synthetic */ H5UploadFileMethod LIZ;

    public C81061Vrd(H5UploadFileMethod h5UploadFileMethod) {
        this.LIZ = h5UploadFileMethod;
    }

    @Override // X.AbstractC81054VrW
    public final C81053VrV LIZ(Context context, Item item) {
        android.net.Uri uri = item.uri;
        if (uri == null || C38354F3m.LJ(uri.toString())) {
            return new C81053VrV(context.getString(R.string.jl9), 0);
        }
        try {
            if (C268513p.LIZLLL(EF7.LIZIZ(), uri) == null) {
                return new C81053VrV(context.getString(R.string.jl9), 0);
            }
        } catch (FileNotFoundException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (this.LIZ.originalImageMaxSize != 0) {
            long LJIIIZ = C268613q.LJIIIZ(EF7.LIZIZ(), uri);
            long j = this.LIZ.originalImageMaxSize;
            if (LJIIIZ > j) {
                return new C81053VrV(context.getString(R.string.sj, C165276eB.LIZ(j)), 0);
            }
            return null;
        }
        return null;
    }
}
