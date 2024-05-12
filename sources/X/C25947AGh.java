package X;

import android.widget.RadioGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.adsetting.AdAuthorizationDialog;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.AGh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25947AGh implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ AdAuthorizationDialog LIZ;
    public final /* synthetic */ SimpleDateFormat LIZIZ;

    public C25947AGh(AdAuthorizationDialog adAuthorizationDialog, SimpleDateFormat simpleDateFormat) {
        this.LIZ = adAuthorizationDialog;
        this.LIZIZ = simpleDateFormat;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        long j;
        AdAuthorizationDialog adAuthorizationDialog = this.LIZ;
        if (i == R.id.iob) {
            j = 7;
        } else if (i == R.id.io9) {
            j = 30;
        } else if (i == R.id.ioa) {
            j = 60;
        } else if (i == R.id.io_) {
            j = 365;
        } else {
            j = 0;
        }
        adAuthorizationDialog.LJLJJI = j;
        if (adAuthorizationDialog.LJLJJL != 0) {
            long j2 = (j * 24 * 60 * 60) + adAuthorizationDialog.LJLJJLL;
            TextView textView = (TextView) adAuthorizationDialog._$_findCachedViewById(R.id.mc1);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZ.getResources().getString(R.string.bw6));
            LIZ.append(":\n");
            LIZ.append(this.LIZIZ.format(Long.valueOf(this.LIZ.LJLJJL * 1000)));
            LIZ.append(" - ");
            LIZ.append(this.LIZIZ.format(new Date(j2 * 1000)));
            textView.setText(X1D.LIZIZ(LIZ));
        }
    }
}
