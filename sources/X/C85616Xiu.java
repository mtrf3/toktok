package X;

import android.widget.CompoundButton;
import com.bytedance.keva.Keva;

/* renamed from: X.Xiu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85616Xiu implements CompoundButton.OnCheckedChangeListener {
    public static final C85616Xiu LJLIL = new C85616Xiu();

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Keva.getRepo("two_step_verification").storeBoolean("ask_next_time", z);
    }
}
