package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.960, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass960 extends LinearLayout {
    public TuxTextView LJLIL;
    public TuxTextView LJLILLLLZI;
    public String LJLJI;

    public final String getCurrentHashtag() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass960(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLJI = "";
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cjd, this, true);
        setOrientation(1);
        this.LJLIL = (TuxTextView) findViewById(R.id.jfx);
        this.LJLILLLLZI = (TuxTextView) findViewById(R.id.jfy);
    }
}
