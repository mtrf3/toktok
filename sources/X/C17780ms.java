package X;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

/* renamed from: X.0ms, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17780ms {
    public final Object LIZ;

    public C17760mq LIZ(int i) {
        return null;
    }

    public List<C17760mq> LIZIZ(String str, int i) {
        return null;
    }

    public C17760mq LIZJ(int i) {
        return null;
    }

    public boolean LIZLLL(int i, int i2, Bundle bundle) {
        return false;
    }

    public C17780ms() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.LIZ = new C34371Wn(this) { // from class: X.1n8
                {
                    super(this);
                }

                @Override // android.view.accessibility.AccessibilityNodeProvider
                public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
                    this.LIZ.getClass();
                }
            };
        } else {
            this.LIZ = new C34371Wn(this);
        }
    }

    public C17780ms(Object obj) {
        this.LIZ = obj;
    }
}
