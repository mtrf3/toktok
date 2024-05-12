package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.FirstScreenDebounceClickEnabledSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FirstScreenDebounceClickIntervalSetting;

/* loaded from: classes6.dex */
public abstract class C6L extends C8FQ {
    public static final long LJLJJI = FirstScreenDebounceClickIntervalSetting.INSTANCE.getValue();
    public final long LJLIL;
    public long LJLILLLLZI;
    public boolean LJLJI;

    public abstract void LIZIZ(View view);

    public C6L() {
        long j = LJLJJI;
        this.LJLJI = FirstScreenDebounceClickEnabledSetting.INSTANCE.getValue();
        this.LJLIL = j;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.LJLJI) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.LJLILLLLZI >= this.LJLIL) {
                this.LJLILLLLZI = uptimeMillis;
                LIZIZ(view);
                return;
            }
            return;
        }
        LIZIZ(view);
    }
}
