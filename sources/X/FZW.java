package X;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes7.dex */
public class FZW extends AsyncQueryHandler {
    public FZW(ContentResolver contentResolver) {
        super(contentResolver);
    }

    @Override // android.content.AsyncQueryHandler
    public final Handler createHandler(Looper looper) {
        return new FZV(this, looper);
    }
}
