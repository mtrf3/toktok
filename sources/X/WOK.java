package X;

import android.widget.RadioGroup;
import com.zhiliaoapp.musically.R;

/* loaded from: classes15.dex */
public final class WOK implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ WOC LIZ;

    public WOK(WOC woc) {
        this.LIZ = woc;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (i == R.id.ioe) {
            WOC woc = this.LIZ;
            if (woc.LJLL != 3) {
                woc.LLJJ(3);
                return;
            }
            return;
        }
        if (i != R.id.iod) {
            return;
        }
        WOC woc2 = this.LIZ;
        if (woc2.LJLL == 10) {
            return;
        }
        woc2.LLJJ(10);
    }
}
