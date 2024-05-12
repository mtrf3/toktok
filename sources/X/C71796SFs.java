package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SFs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71796SFs extends RecyclerView.ViewHolder {
    public SurveySecondQuestion LJLIL;

    public C71796SFs(View view) {
        super(view);
    }

    public final void L(boolean z) {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        if (itemView instanceof C47121t6) {
            if (z) {
                itemView.setBackgroundResource(R.drawable.dab);
            } else {
                itemView.setBackgroundResource(R.drawable.daa);
            }
        }
    }
}
