package X;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.setting.model.RestrictInfo;

/* renamed from: X.92g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2303492g extends TuxTextView implements InterfaceC62171Oad {
    public C62169Oab LJLLLL;
    public String LJLLLLLL;

    @Override // X.InterfaceC62171Oad
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC62171Oad
    public final void LJJIJIIJI(RestrictInfo restrictInfo) {
        if (TextUtils.equals(restrictInfo.awemeId, this.LJLLLLLL)) {
            setVisibility(0);
            setText(C16880lQ.LLLZ("Review time:%s \nReview AllFriends:%s ", new Object[]{restrictInfo.reviewTime, restrictInfo.reviewResult}));
        }
    }

    public C2303492g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        this.LJLLLL = new C62169Oab(new C62170Oac(), this);
    }
}
