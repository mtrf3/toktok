package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38127Exn;
import X.ActivityC45651qj;
import X.C26045AKb;
import X.C29306Beo;
import X.C30868C9o;
import X.C38131Exr;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcaseToastMethodPositionSetting;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class ToastMethod extends AbstractC38127Exn<Params, Object> {

    /* loaded from: classes6.dex */
    public static final class Params {

        @InterfaceC65349Pkn("position")
        public int position;

        @InterfaceC65349Pkn("show_top")
        public boolean showTop;

        @InterfaceC65349Pkn("text")
        public String text;

        @InterfaceC65349Pkn("type")
        public String type;
    }

    @Override // X.AbstractC38127Exn
    public Object invoke(Params params, C38131Exr c38131Exr) {
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(C29306Beo.LIZ(c38131Exr.LIZ));
        if (TextUtils.equals("info", params.type)) {
            if ((params.showTop || params.position == 1) && LiveBroadcaseToastMethodPositionSetting.toastMethodWithHybridViewContext()) {
                C30868C9o.LJIIJ(R.drawable.d0p, c38131Exr.LJ, params.text);
                return null;
            }
            C30868C9o.LJIIIZ(R.drawable.d0p, LIZIZ, params.text);
            return null;
        }
        if (TextUtils.equals("warn", params.type)) {
            if ((params.showTop || params.position == 1) && LiveBroadcaseToastMethodPositionSetting.toastMethodWithHybridViewContext()) {
                C30868C9o.LJIIJ(R.drawable.czc, c38131Exr.LJ, params.text);
                return null;
            }
            C30868C9o.LJIIIZ(R.drawable.czc, LIZIZ, params.text);
            return null;
        }
        if (params.position == 1) {
            if (params.showTop) {
                View view = c38131Exr.LJ;
                String str = params.text;
                C26045AKb c26045AKb = new C26045AKb(view);
                c26045AKb.LJIIIZ(str);
                c26045AKb.LJIIJ();
                return null;
            }
            C30868C9o.LJI(params.text);
            return null;
        }
        if (params.showTop) {
            View view2 = c38131Exr.LJ;
            String str2 = params.text;
            C26045AKb c26045AKb2 = new C26045AKb(view2);
            c26045AKb2.LJIIIZ(str2);
            c26045AKb2.LJIIJ();
            return null;
        }
        C30868C9o.LJFF(c38131Exr.LIZ, params.text);
        return null;
    }
}
