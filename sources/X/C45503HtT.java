package X;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BaseBundle;
import android.view.View;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HtT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45503HtT implements InterfaceC45596Huy {
    public final /* synthetic */ C45500HtQ LIZ;

    public C45503HtT(C45500HtQ c45500HtQ) {
        this.LIZ = c45500HtQ;
    }

    @Override // X.InterfaceC45596Huy
    public final void LIZ(View v, MyMediaModel item) {
        boolean z;
        String str;
        Resources resources;
        BaseBundle baseBundle;
        o.LJIIIZ(v, "v");
        o.LJIIIZ(item, "item");
        InterfaceC45510Hta interfaceC45510Hta = this.LIZ.LLIL;
        if (interfaceC45510Hta != null) {
            interfaceC45510Hta.LJIILIIL();
        }
        if (this.LIZ.LLJLL()) {
            C45500HtQ c45500HtQ = this.LIZ;
            Activity activity = c45500HtQ.mActivity;
            if (activity == null || (baseBundle = (BaseBundle) c45500HtQ.LLILZLL.getValue()) == null) {
                return;
            }
            long j = baseBundle.getLong("Key_replace_item_duration", -1L);
            AqS96S0300000_7 aqS96S0300000_7 = new AqS96S0300000_7(item, activity, c45500HtQ, 18);
            if (j < 0 || Math.abs(j - item.duration) < 10) {
                aqS96S0300000_7.invoke();
                return;
            }
            if (!item.LJ() && item.duration < c45500HtQ.LLILLL) {
                aqS96S0300000_7.invoke();
                return;
            }
            long j2 = item.duration;
            if (j < j2) {
                c45500HtQ.LLJZIJLIL(v, item);
                return;
            } else {
                if (j <= j2) {
                    return;
                }
                o.LJIIIIZZ(C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(c45500HtQ), c45500HtQ).LIZ(ChooseMediaViewModel.class), "of(this).get(ChooseMediaViewModel::class.java)");
                ChooseMediaViewModel.Tv0(activity, j, aqS96S0300000_7);
                return;
            }
        }
        C45500HtQ c45500HtQ2 = this.LIZ;
        if (c45500HtQ2.LJLJI.LJLLILLLL) {
            c45500HtQ2.LLJZIJLIL(v, item);
            return;
        }
        if (!C45508HtY.LIZIZ(item.fileLocalUriPath, true)) {
            C5S1 c5s1 = new C5S1(this.LIZ.mActivity);
            Activity activity2 = this.LIZ.mActivity;
            if (activity2 != null && (resources = activity2.getResources()) != null) {
                str = resources.getString(R.string.h46);
            } else {
                str = null;
            }
            c5s1.LIZLLL(str);
            c5s1.LJ();
            return;
        }
        C45500HtQ c45500HtQ3 = this.LIZ;
        c45500HtQ3.getClass();
        if (C42117Gfx.LJ() && c45500HtQ3.LLIIII != 15) {
            z = true;
        } else {
            z = false;
        }
        C45500HtQ c45500HtQ4 = this.LIZ;
        c45500HtQ3.LLJLIL(false, z, item, c45500HtQ4.LLIIIILZ, new AqS154S0200000_7(c45500HtQ4, item, 78));
    }
}
