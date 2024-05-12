package X;

import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S33<T extends ViewGroup> extends S39<T, Boolean, S3B, S3E> {
    public final S3D<T> LJFF;
    public TuxTextView LJI;

    @Override // X.S39
    public final S3E LIZLLL() {
        return new S3F();
    }

    @Override // X.S39
    public final S3E LJ(S3B s3b) {
        S3B style = s3b;
        o.LJIIIZ(style, "style");
        return new S34(style);
    }

    public final void LJII(boolean z) {
        TuxTextView LIZ;
        if (z && this.LJI == null && (LIZ = this.LJFF.LIZ(this.LIZ)) != null) {
            LIZ.setText(LIZ.getContext().getString(R.string.t7));
            this.LJI = LIZ;
        }
        LJFF().LJI((ViewGroup) this.LIZ);
        LIZJ(z);
    }

    public S33(ViewGroup viewGroup, C78685UuP c78685UuP) {
        super(viewGroup);
        this.LJFF = c78685UuP;
    }
}
