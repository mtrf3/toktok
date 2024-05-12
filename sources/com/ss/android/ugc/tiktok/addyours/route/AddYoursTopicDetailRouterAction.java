package com.ss.android.ugc.tiktok.addyours.route;

import X.ASL;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C32151Nz;
import X.C45804HyK;
import X.C53947LFf;
import X.C55480Lq0;
import X.C63232dz;
import X.C76800UCe;
import X.C780334l;
import X.EXV;
import X.O6R;
import X.XKX;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursTopicDetailFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AddYoursTopicDetailRouterAction implements IRouteAction {
    public final void realOpenDetailFragment(Context context, Bundle bundle) {
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            C55480Lq0.LIZIZ.LIZIZ(249372161);
            AddYoursTopicDetailFragment addYoursTopicDetailFragment = new AddYoursTopicDetailFragment();
            addYoursTopicDetailFragment.setArguments(bundle);
            ASL asl = new ASL();
            asl.LIZLLL(R.style.ul);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLILLLL = addYoursTopicDetailFragment;
            tuxSheet.LJZL = true;
            tuxSheet.LJZI = false;
            asl.LIZ.LJLLLLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(C53947LFf.LIZ() * 0.74d)));
            asl.LJI(1);
            asl.LIZ.show(supportFragmentManager, "AddYoursTopicDetailFragment");
        }
    }

    /* renamed from: open, reason: collision with other method in class */
    public void m198open(Context context, String str, Bundle bundle) {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            realOpenDetailFragment(context, bundle);
        } else {
            XKX.LIZLLL(C780334l.LJLIL, EXV.LIZ, null, new C63232dz(this, context, bundle, null), 2);
        }
    }

    @Override // com.bytedance.router.route.IRouteAction
    public /* bridge */ /* synthetic */ Object open(Context context, String str, Bundle bundle) {
        m198open(context, str, bundle);
        return C76800UCe.LIZ;
    }
}
