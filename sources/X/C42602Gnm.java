package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.util.Size;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.IOException;
import kotlin.jvm.internal.o;

/* renamed from: X.Gnm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42602Gnm<T> implements InterfaceC86003Zc {
    public final /* synthetic */ MediaModel LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ Size LJLJI;
    public final /* synthetic */ CancellationSignal LJLJJI;

    public C42602Gnm(Context context, CancellationSignal cancellationSignal, Size size, MediaModel mediaModel) {
        this.LJLIL = mediaModel;
        this.LJLILLLLZI = context;
        this.LJLJI = size;
        this.LJLJJI = cancellationSignal;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Bitmap> interfaceC73573Su9) {
        try {
            Bitmap loadThumbnail = this.LJLILLLLZI.getContentResolver().loadThumbnail(C44694HgQ.LJIIIIZZ(this.LJLIL.fileLocalUriPath), this.LJLJI, this.LJLJJI);
            o.LJIIIIZZ(loadThumbnail, "context.contentResolver.…il(uri, itemSize, signal)");
            if (!interfaceC73573Su9.isDisposed()) {
                interfaceC73573Su9.onNext(loadThumbnail);
                interfaceC73573Su9.onComplete();
            }
        } catch (OperationCanceledException unused) {
            if (!interfaceC73573Su9.isDisposed()) {
                interfaceC73573Su9.onComplete();
            }
        } catch (IOException e) {
            if (!interfaceC73573Su9.isDisposed()) {
                interfaceC73573Su9.onError(e);
            }
        }
    }
}
