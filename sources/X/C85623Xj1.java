package X;

import android.widget.CompoundButton;
import com.bytedance.keva.Keva;

/* renamed from: X.Xj1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85623Xj1 implements CompoundButton.OnCheckedChangeListener {
    public static final C85623Xj1 LJLIL = new C85623Xj1();

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Keva.getRepo("two_step_verification").storeBoolean("ask_next_time", z);
    }
}
