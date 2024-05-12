package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LOY extends C16120kC {
    public final /* synthetic */ LOX LIZ;
    public final /* synthetic */ int LIZIZ;

    public LOY(LOX lox, int i) {
        this.LIZ = lox;
        this.LIZIZ = i;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        boolean z;
        boolean z2;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        CharSequence text;
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        TextView mCustomTextView$homepage_common_release = this.LIZ.getMCustomTextView$homepage_common_release();
        if (mCustomTextView$homepage_common_release != null && (text = mCustomTextView$homepage_common_release.getText()) != null && text.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        CharSequence charSequence = null;
        if (z) {
            TextView mCustomTextView$homepage_common_release2 = this.LIZ.getMCustomTextView$homepage_common_release();
            if (mCustomTextView$homepage_common_release2 != null) {
                charSequence = mCustomTextView$homepage_common_release2.getText();
            }
            info.LJIJ(charSequence);
        }
        info.LJJIFFI(C86V.LJFF(R.string.b25));
        int i = this.LIZIZ;
        if (Build.VERSION.SDK_INT >= 28) {
            z2 = info.LIZ.isHeading();
        } else {
            Bundle extras = info.LIZ.getExtras();
            if ((extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 2) == 2) || ((collectionItemInfo = info.LIZ.getCollectionItemInfo()) != null && ((AccessibilityNodeInfo.CollectionItemInfo) new C17740mo(collectionItemInfo).LIZ).isHeading())) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        info.LJIIZILJ(new C17740mo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, z2)));
    }
}
