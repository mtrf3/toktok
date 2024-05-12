package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.dsp.ui.brand.TTMSheetDialogFragment;
import com.ss.android.ugc.aweme.music.model.MusicInfo;
import com.zhiliaoapp.musically.R;
import java.text.DateFormat;
import java.util.Date;

/* loaded from: classes13.dex */
public final class SU5 implements InterfaceC70769Rq1 {
    public final /* synthetic */ TTMSheetDialogFragment LJLIL;

    @Override // X.InterfaceC70769Rq1
    public final void D1(android.net.Uri uri, C2047581v c2047581v) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LJLLLLLL(android.net.Uri uri) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
    }

    public SU5(TTMSheetDialogFragment tTMSheetDialogFragment) {
        this.LJLIL = tTMSheetDialogFragment;
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        boolean z;
        TTMSheetDialogFragment tTMSheetDialogFragment = this.LJLIL;
        MusicInfo musicInfo = tTMSheetDialogFragment.LJLJJI;
        if (musicInfo != null) {
            long duration = musicInfo.getDuration();
            if (duration >= 0 && tTMSheetDialogFragment.viewValid) {
                View _$_findCachedViewById = tTMSheetDialogFragment._$_findCachedViewById(R.id.lsv);
                if (_$_findCachedViewById != null) {
                    _$_findCachedViewById.setVisibility(0);
                }
                TextView textView = (TextView) tTMSheetDialogFragment._$_findCachedViewById(R.id.mny);
                if (textView != null) {
                    textView.setText(((DateFormat) tTMSheetDialogFragment.LJLJI.getValue()).format(new Date(duration)));
                }
                if (tTMSheetDialogFragment.LJLJLJ == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    tTMSheetDialogFragment._$_findCachedViewById(R.id.dcm).setVisibility(0);
                    ((ImageView) tTMSheetDialogFragment._$_findCachedViewById(R.id.ezh)).setVisibility(8);
                } else {
                    tTMSheetDialogFragment._$_findCachedViewById(R.id.dcm).setVisibility(8);
                    ((ImageView) tTMSheetDialogFragment._$_findCachedViewById(R.id.ezh)).setVisibility(0);
                }
            }
        }
    }
}
