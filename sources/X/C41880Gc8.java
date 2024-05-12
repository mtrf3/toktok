package X;

import android.text.TextUtils;
import com.bytedance.lighten.loader.SmartImageView;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.Gc8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41880Gc8<T> implements InterfaceC64592gB {
    public final /* synthetic */ WeakReference<SmartImageView> LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    public C41880Gc8(WeakReference<SmartImageView> weakReference, float f) {
        this.LJLIL = weakReference;
        this.LJLILLLLZI = f;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C41881Gc9 c41881Gc9 = (C41881Gc9) obj;
        SmartImageView smartImageView = this.LJLIL.get();
        if (smartImageView != null) {
            float f = this.LJLILLLLZI;
            String str = c41881Gc9.LIZ;
            if (str == null) {
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                smartImageView.setImageURI(android.net.Uri.fromFile(new File(c41881Gc9.LIZ)).toString());
            }
            S3I s3i = new S3I();
            s3i.LIZLLL = C170576mj.LIZ(smartImageView.getContext(), f);
            smartImageView.setCircleOptions(s3i.LIZ());
        }
    }
}
