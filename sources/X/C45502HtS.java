package X;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HtS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45502HtS implements InterfaceC45596Huy {
    public final /* synthetic */ C45501HtR LIZ;

    public C45502HtS(C45501HtR c45501HtR) {
        this.LIZ = c45501HtR;
    }

    @Override // X.InterfaceC45596Huy
    public final void LIZ(View v, MyMediaModel item) {
        boolean z;
        Resources resources;
        BaseBundle baseBundle;
        Object LIZ;
        long j;
        Bundle bundle;
        o.LJIIIZ(v, "v");
        o.LJIIIZ(item, "item");
        C45465Hsr c45465Hsr = this.LIZ.LLIIZ;
        if (c45465Hsr != null) {
            c45465Hsr.LJIILIIL();
        }
        C45501HtR c45501HtR = this.LIZ;
        if (c45501HtR.LLIIII == 14 && (bundle = (Bundle) c45501HtR.LLILLL.getValue()) != null && bundle.getBoolean("Key_replace_item", false)) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        Object obj = null;
        str = null;
        if (z) {
            C45501HtR c45501HtR2 = this.LIZ;
            Activity activity = c45501HtR2.mActivity;
            if (activity == null || (baseBundle = (BaseBundle) c45501HtR2.LLILLL.getValue()) == null) {
                return;
            }
            if (!item.LJI()) {
                if (!C45508HtY.LIZIZ(item.fileLocalUriPath, true)) {
                    Activity activity2 = c45501HtR2.mActivity;
                    if (activity2 == null) {
                        return;
                    }
                    C5S1 c5s1 = new C5S1(activity2);
                    c5s1.LIZLLL(activity2.getString(R.string.jl9));
                    c5s1.LJ();
                    return;
                }
                ChooseMediaExtensionKt.LIZIZ(null, item);
                C45465Hsr c45465Hsr2 = c45501HtR2.LLIIZ;
                if (c45465Hsr2 == null) {
                    return;
                }
                c45465Hsr2.LJIIL(item);
                return;
            }
            long j2 = baseBundle.getLong("Key_replace_item_duration", -1L);
            try {
                if (VEUtils.getVideoFileInfo(item.fileLocalUriPath) != null) {
                    LIZ = Long.valueOf(r0.duration);
                } else {
                    LIZ = null;
                }
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (!C3C5.m12isFailureimpl(LIZ)) {
                obj = LIZ;
            }
            Long l = (Long) obj;
            if (l != null) {
                j = l.longValue();
            } else {
                j = item.duration;
            }
            item.duration = j;
            AqS96S0300000_7 aqS96S0300000_7 = new AqS96S0300000_7(item, activity, c45501HtR2, 20);
            if (j2 < 0 || Math.abs(j2 - j) < 5) {
                aqS96S0300000_7.invoke();
                return;
            }
            if (!item.LJ() && item.duration < c45501HtR2.LLILII) {
                aqS96S0300000_7.invoke();
                return;
            }
            if (j2 < j) {
                c45501HtR2.LLJLLL(v, item);
                return;
            } else {
                if (j2 <= j) {
                    return;
                }
                o.LJIIIIZZ(C163726bg.LIZJ(c45501HtR2.mView).LIZ(ChooseMediaViewModel.class), "of(view).get(ChooseMediaViewModel::class.java)");
                ChooseMediaViewModel.Tv0(activity, j2, aqS96S0300000_7);
                return;
            }
        }
        C45501HtR c45501HtR3 = this.LIZ;
        if (c45501HtR3.LLIILZL) {
            c45501HtR3.LLJLLL(v, item);
            return;
        }
        if (item.LJI()) {
            if (!C45508HtY.LIZIZ(item.fileLocalUriPath, true)) {
                C5S1 c5s12 = new C5S1(this.LIZ.mActivity);
                Activity activity3 = this.LIZ.mActivity;
                if (activity3 != null && (resources = activity3.getResources()) != null) {
                    str = resources.getString(R.string.h46);
                }
                c5s12.LIZLLL(str);
                c5s12.LJ();
                return;
            }
            C45501HtR c45501HtR4 = this.LIZ;
            c45501HtR4.LLJLIL(false, item, c45501HtR4.LLIIIILZ, new AqS154S0200000_7(c45501HtR4, item, 80));
            return;
        }
        if (!C45508HtY.LIZIZ(item.fileLocalUriPath, true)) {
            Activity activity4 = this.LIZ.mActivity;
            if (activity4 != null) {
                C5S1 c5s13 = new C5S1(activity4);
                c5s13.LIZLLL(activity4.getString(R.string.jl9));
                c5s13.LJ();
                return;
            }
            return;
        }
        ChooseMediaExtensionKt.LIZIZ(null, item);
        C45465Hsr c45465Hsr3 = this.LIZ.LLIIZ;
        if (c45465Hsr3 == null) {
            return;
        }
        c45465Hsr3.LJIIL(item);
    }
}
