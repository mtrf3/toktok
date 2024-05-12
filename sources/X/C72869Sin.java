package X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Sin, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72869Sin extends C72870Sio {
    public TextView LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72869Sin(FrameLayout containerView) {
        super(containerView);
        o.LJIIIZ(containerView, "containerView");
    }

    public final void LIZ(String str) {
        if (this.LIZLLL == null) {
            this.LIZLLL = (TextView) this.LIZIZ.findViewById(R.id.bne);
        }
        TextView textView = this.LIZLLL;
        if (textView != null) {
            if (!TextUtils.isEmpty(str)) {
                textView.setText(str);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
    }
}
