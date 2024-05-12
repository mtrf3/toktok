package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class NTG implements T58 {
    @Override // X.T58
    public final void LIZ() {
    }

    @Override // X.T58
    public final void LIZIZ(ActivityC45651qj activityC45651qj) {
        NOD nod = new NOD();
        nod.LIZ = activityC45651qj;
        nod.LIZJ = 2;
        nod.LIZLLL = 0;
        NOJ LIZIZ = nod.LIZIZ();
        Context context = LIZIZ.LIZ;
        if (context == null || C45804HyK.LJIJJ(context) == null) {
            return;
        }
        FrameLayout LIZ = C97D.LIZ(activityC45651qj);
        NWF nwf = null;
        if (LIZ != null) {
            nwf = (NWF) LIZ.findViewById(R.id.b8s);
        }
        if (!(nwf instanceof NWF) || nwf == null || nwf.LJIIJJI()) {
            return;
        }
        FrameLayout LIZ2 = C97D.LIZ(activityC45651qj);
        if (LIZ2 != null) {
            LIZ2.setVisibility(0);
        }
        nwf.getActionMode().LJIIIIZZ = LIZIZ.LIZLLL;
        nwf.LJJ(LIZIZ);
    }

    @Override // X.T58
    public final boolean LIZJ(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return NP8.LJ(context, UriProtector.parse(str));
    }

    @Override // X.T58
    public final void LIZLLL(ActivityC45651qj activityC45651qj, String str) {
        View view;
        Bundle LIZ = C01R.LIZ("isFromChallenge", true);
        NTH nth = new NTH();
        nth.LIZLLL = LIZ;
        nth.LJFF = activityC45651qj;
        nth.LIZ = str;
        nth.LIZIZ = C63081OpJ.LJJJJLI(activityC45651qj);
        NWW LIZ2 = nth.LIZ();
        FrameLayout LIZ3 = C97D.LIZ(activityC45651qj);
        if (LIZ3 != null) {
            view = LIZ3.findViewById(R.id.b8s);
        } else {
            view = null;
        }
        if (!(view instanceof NWF) || view == null) {
            NWF nwf = new NWF(activityC45651qj);
            nwf.setId(R.id.b8s);
            nwf.setParams(LIZ2);
            nwf.setMBehaviorCallback(null);
            nwf.setKeyDownCallBack(null);
            FrameLayout LIZ4 = C97D.LIZ(activityC45651qj);
            if (LIZ4 != null) {
                LIZ4.addView(nwf);
            }
        }
    }

    @Override // X.T58
    public final boolean openAdOpenUrl(Context context, String str, boolean z) {
        C73340SqO.LJIJI().getClass();
        return NO5.LJI(context, str, z);
    }

    @Override // X.T58
    public final boolean openAdWebUrl(Context context, String str, String str2) {
        C73340SqO.LJIJI().getClass();
        return NO5.LJII(context, str, str2);
    }
}
