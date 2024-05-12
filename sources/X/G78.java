package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G78 extends G75 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    public final void setCommentStatus(boolean z) {
    }

    public final void setStitchStatus(boolean z) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G78(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        setLeftTuxIcon(R.drawable.b9r);
        setTitle(context.getString(R.string.e6k));
        setSubtitle("");
        setSubtitleVisibility(8);
        o.LJIIIIZZ(context.getString(R.string.e6g), "context.getString(R.stri…rivacy_subtitle_comments)");
        o.LJIIIIZZ(context.getString(R.string.e6h), "context.getString(R.stri…ge_privacy_subtitle_duet)");
        o.LJIIIIZZ(context.getString(R.string.e6i), "context.getString(R.stri…_privacy_subtitle_stitch)");
    }
}
