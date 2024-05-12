package com.ss.android.ugc.aweme.homepage.ui.slide;

import X.ActivityC45651qj;
import X.C26338AVi;
import X.C45804HyK;
import X.C54171LNv;
import X.C9XU;
import X.G27;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import com.bytedance.hox.Hox;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class AbsTabScrollProfileStrategy implements IXTabScrollProfileStrategy, G27 {
    public static boolean LJLJI;
    public static final Rect LJLJJI = new Rect();
    public final String LJLIL;
    public final ActivityC45651qj LJLILLLLZI;

    public abstract boolean LIZ();

    @Override // com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol
    public final AbsTabScrollProfileStrategy i0() {
        return this;
    }

    public final boolean LIZJ() {
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLILLLLZI);
        if (LJJIFFI == null) {
            return false;
        }
        return Hox.LJLLI.LIZ(LJJIFFI).wv0(this.LJLIL);
    }

    public AbsTabScrollProfileStrategy(ActivityC45651qj activityC45651qj, String str) {
        this.LJLIL = str;
        this.LJLILLLLZI = activityC45651qj;
        C9XU.LIZIZ(activityC45651qj, this);
    }

    public boolean LIZLLL(int i, int i2) {
        Rect rect = LJLJJI;
        if (!rect.isEmpty() && rect.contains(i, i2)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol
    public final boolean LJJLJ(float f, float f2) {
        if (!LIZJ() || LLJJJJLIIL()) {
            return false;
        }
        int i = (int) f;
        int i2 = (int) f2;
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        boolean LIZJ = C26338AVi.LIZJ(activityC45651qj);
        if (LIZJ != LJLJI) {
            LJLJI = LIZJ;
            C54171LNv.LIZ(activityC45651qj);
        }
        if (!LIZLLL(i, i2)) {
            return false;
        }
        return LIZ();
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        if (activity != null) {
            C54171LNv.LIZ(activity);
        }
    }
}
