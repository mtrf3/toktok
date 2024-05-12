package X;

import android.content.Context;
import android.content.DialogInterface;
import com.zhiliaoapp.musically.R;

/* renamed from: X.GNo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41424GNo {
    public final AnonymousClass025 LIZ;
    public final Context LIZIZ;

    public final DialogInterfaceC39771hF LIZIZ() {
        return this.LIZ.LJ();
    }

    public C41424GNo(Context context) {
        this.LIZIZ = context;
        this.LIZ = new AnonymousClass025(context, R.style.po);
    }

    public final void LIZ(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        AnonymousClass025 anonymousClass025 = this.LIZ;
        C41423GNn c41423GNn = new C41423GNn(this.LIZIZ, charSequenceArr);
        C008901t c008901t = anonymousClass025.LIZ;
        c008901t.LJIILLIIL = c41423GNn;
        c008901t.LJIIZILJ = onClickListener;
    }
}
