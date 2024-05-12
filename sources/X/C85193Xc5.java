package X;

import android.widget.CompoundButton;
import com.bytedance.keva.Keva;

/* renamed from: X.Xc5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85193Xc5 implements CompoundButton.OnCheckedChangeListener {
    public static final C85193Xc5 LJLIL = new C85193Xc5();

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Keva.getRepo("two_step_verification").storeBoolean("ask_next_time", z);
    }
}
