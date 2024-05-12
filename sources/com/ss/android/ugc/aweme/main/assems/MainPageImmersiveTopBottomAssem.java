package com.ss.android.ugc.aweme.main.assems;

import X.ActivityC45651qj;
import X.C42625Go9;
import X.C45804HyK;
import X.C53320KwG;
import X.C54064LJs;
import X.C55096Ljo;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public final class MainPageImmersiveTopBottomAssem extends BaseMainPageFragmentAssem {
    public ViewGroup LJLIL;
    public C54064LJs LJLILLLLZI;
    public ActivityC45651qj LJLJI;

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C54064LJs c54064LJs = this.LJLILLLLZI;
        if (c54064LJs != null) {
            C42625Go9.LIZJ(c54064LJs);
        }
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.onParentViewCreated();
        ActivityC45651qj activityC45651qj = this.LJLJI;
        if (activityC45651qj == null) {
            return;
        }
        ViewGroup viewGroup3 = this.LJLIL;
        View view = null;
        if (viewGroup3 != null) {
            view = viewGroup3.findViewById(R.id.gc8);
        }
        if (C53320KwG.LIZIZ()) {
            ActivityC45651qj activityC45651qj2 = this.LJLJI;
            if (activityC45651qj2 != null) {
                view = activityC45651qj2.findViewById(R.id.gbw);
            } else {
                return;
            }
        }
        if (view == null || (viewGroup = this.LJLIL) == null || (viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.ekb)) == null) {
            return;
        }
        this.LJLILLLLZI = new C54064LJs(activityC45651qj, view, viewGroup2, C55096Ljo.LJIIZILJ(this));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem, X.InterfaceC54059LJn
    public final void M1(ViewGroup viewGroup) {
        ActivityC45651qj activityC45651qj;
        Context context;
        this.LJLIL = viewGroup;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            activityC45651qj = C45804HyK.LJJIFFI(context);
        } else {
            activityC45651qj = null;
        }
        this.LJLJI = activityC45651qj;
    }
}
