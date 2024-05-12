package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class BVP extends BVR {
    public BVP(View view) {
        super(view);
        TextView textView = (TextView) this.itemView.findViewById(R.id.b6y);
        if (textView != null) {
            textView.setText(R.string.msm);
        }
    }
}
