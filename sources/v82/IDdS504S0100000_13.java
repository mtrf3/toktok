package v82;

import X.AbstractC85293Wj;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.EmoteEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageListPreviewDialogFragment;

/* loaded from: classes14.dex */
public class IDdS504S0100000_13 extends AbstractC85293Wj {
    public final int $t;
    public Object l0;

    public static final void onFailed$0(IDdS504S0100000_13 iDdS504S0100000_13, Throwable th) {
    }

    public static final void onFailed$1(IDdS504S0100000_13 iDdS504S0100000_13, Throwable th) {
    }

    public static final void onFailed$2(IDdS504S0100000_13 iDdS504S0100000_13, Throwable th) {
    }

    public static final void onFailed$3(IDdS504S0100000_13 iDdS504S0100000_13, Throwable th) {
    }

    public static final void onFailed$4(IDdS504S0100000_13 iDdS504S0100000_13, Throwable th) {
    }

    public static final void onFailed$5(IDdS504S0100000_13 iDdS504S0100000_13, Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, bitmap);
                return;
            case 1:
                LIZIZ$1(this, bitmap);
                return;
            case 2:
                LIZIZ$2(this, bitmap);
                return;
            case 3:
                LIZIZ$3(this, bitmap);
                return;
            case 4:
                LIZIZ$4(this, bitmap);
                return;
            case 5:
                LIZIZ$5(this, bitmap);
                return;
            default:
                super.LIZIZ(bitmap);
                return;
        }
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                return;
            case 1:
                onFailed$1(this, th);
                return;
            case 2:
                onFailed$2(this, th);
                return;
            case 3:
                onFailed$3(this, th);
                return;
            case 4:
                onFailed$4(this, th);
                return;
            case 5:
                onFailed$5(this, th);
                return;
            default:
                super.onFailed(th);
                return;
        }
    }

    public IDdS504S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(IDdS504S0100000_13 iDdS504S0100000_13, Bitmap bitmap) {
        ((EmoteEditDialogFragment) iDdS504S0100000_13.l0).Gl(bitmap);
    }

    public static final void LIZIZ$1(IDdS504S0100000_13 iDdS504S0100000_13, Bitmap bitmap) {
        ((EmoteEditDialogFragment) iDdS504S0100000_13.l0).Gl(bitmap);
    }

    public static final void LIZIZ$2(IDdS504S0100000_13 iDdS504S0100000_13, Bitmap bitmap) {
        ((SpotlightImageListPreviewDialogFragment) iDdS504S0100000_13.l0).Al(bitmap);
    }

    public static final void LIZIZ$3(IDdS504S0100000_13 iDdS504S0100000_13, Bitmap bitmap) {
        ((SpotlightImageListPreviewDialogFragment) iDdS504S0100000_13.l0).Al(bitmap);
    }

    public static final void LIZIZ$4(IDdS504S0100000_13 iDdS504S0100000_13, Bitmap bitmap) {
        ((SpotlightImageEditDialogFragment) iDdS504S0100000_13.l0).Hl(bitmap);
    }

    public static final void LIZIZ$5(IDdS504S0100000_13 iDdS504S0100000_13, Bitmap bitmap) {
        ((SpotlightImageEditDialogFragment) iDdS504S0100000_13.l0).Hl(bitmap);
    }
}
