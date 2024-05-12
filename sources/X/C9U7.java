package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* renamed from: X.9U7, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9U7 extends FrameLayout {
    public HashMap LJLIL;

    public final View LIZ(int i) {
        if (this.LJLIL == null) {
            this.LJLIL = new HashMap();
        }
        View view = (View) this.LJLIL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJLIL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public C9U7(C25600zU c25600zU) {
        super(c25600zU, null, 0);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(c25600zU), R.layout.bmc, this, true);
        C16880lQ.LJJIJLIJ((SmartImageView) LIZ(R.id.ezt), new View.OnClickListener() { // from class: X.9U8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }
}
