package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;

/* renamed from: X.70B, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C70B extends FrameLayout {
    public abstract void LIZ(Comment comment, Aweme aweme, EnumC178066yo enumC178066yo, RecyclerView.ViewHolder viewHolder);

    public abstract void LIZIZ(String str);

    public abstract void LIZJ(InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70B(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new LinkedHashMap();
    }
}
