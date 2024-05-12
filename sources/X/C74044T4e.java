package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/* renamed from: X.T4e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74044T4e extends C16120kC {
    public final /* synthetic */ String LIZ;

    public C74044T4e(String str) {
        this.LIZ = str;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        if ((view instanceof EditText) && !TextUtils.isEmpty(((EditText) view).getText())) {
            c17760mq.LJJ(this.LIZ);
        }
    }
}
