package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.7Fz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182957Fz {
    public static final void LIZ(C59948Nfs c59948Nfs, AwemeRawAd awemeRawAd) {
        String labelName;
        if (c59948Nfs == null) {
            return;
        }
        c59948Nfs.setVisibility(8);
        if (awemeRawAd == null) {
            return;
        }
        C59946Nfq LIZ = NDH.LIZ();
        AwemeTextLabelModel label = awemeRawAd.getLabel();
        if (label == null || (labelName = label.getLabelName()) == null) {
            return;
        }
        c59948Nfs.setVisibility(0);
        LIZ.LJIIJ(labelName);
        LIZ.LJIIL(92);
        LIZ.LIZ(C78609UtB.LJJJ(R.attr.d7, c59948Nfs.getContext()));
        LIZ.LJIIJJI(C78609UtB.LJJJ(R.attr.dj, c59948Nfs.getContext()));
        LIZ.LIZIZ(C63081OpJ.LJIJJLI(c59948Nfs.getContext(), 2.0f));
        C59947Nfr c59947Nfr = LIZ.LIZ;
        if (c59947Nfr == null) {
            return;
        }
        c59948Nfs.LIZ(c59947Nfr);
    }
}
