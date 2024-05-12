package X;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Reason;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SelectReason;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public final class S4W extends FrameLayout {
    public final Reason LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLILLLLZI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final SelectReason getReason() {
        String str = this.LJLIL.reasonKey;
        if (str == null) {
            str = "";
        }
        return new SelectReason(str);
    }

    public final boolean LIZIZ() {
        return ((CompoundButton) LIZ(R.id.jli)).isChecked();
    }

    public final void setChecked(boolean z) {
        ((C63044Ooi) LIZ(R.id.jli)).setChecked(z);
    }

    public S4W(Context context, Reason reason) {
        super(context, null, 0);
        this.LJLIL = reason;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a1c, this, true);
        ((TextView) LIZ(R.id.jlm)).setText(reason.title);
    }
}
