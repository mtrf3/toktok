package com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.hometab;

import X.AbstractC38911fr;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C1DG;
import X.C29822Bn8;
import X.C38354F3m;
import X.C45804HyK;
import X.C53986LGs;
import X.C53987LGt;
import X.C54117LLt;
import X.C55096Ljo;
import X.C55230Lly;
import X.C85990Xow;
import X.EnumC53761L8b;
import X.LGW;
import X.LH6;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.base.CustomDotAbility;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class HomeTabProtocol extends BottomTabProtocol {
    public View.OnClickListener LJLJI;
    public final LGW LJLJJI = new LGW();
    public final LH6 LJLJJL = new LH6(new C53986LGs(R.drawable.avu, R.attr.go), new C53986LGs(R.drawable.avw, R.attr.dj), new C53986LGs(R.drawable.avx, R.attr.gv), new C53986LGs(R.drawable.avv, R.attr.dl), Integer.valueOf(R.id.gc0));
    public final String LJLJJLL = "HOME";
    public final String LJLJL = "homepage_hot";
    public final Class<? extends Fragment> LJLJLJ;
    public final EnumC53761L8b LJLJLLL;

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final C54117LLt LIZ() {
        return new C53987LGt();
    }

    public HomeTabProtocol() {
        Class<? extends Fragment> fragmentClass = HomePageUIFrameServiceImpl.LIZ().getFragmentClass("HOME");
        if (fragmentClass != null) {
            this.LJLJLJ = fragmentClass;
            this.LJLJLLL = EnumC53761L8b.TAB_1;
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final LH6 LIZJ() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final EnumC53761L8b LIZLLL() {
        return this.LJLJLLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final AbstractC38911fr LJ() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String LJIIIZ() {
        return this.LJLJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return this.LJLJLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getTag() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJFF(Context context) {
        CustomDotAbility customDotAbility;
        o.LJIIIZ(context, "context");
        if (this.LJLJI == null) {
            this.LJLJI = HomePageUIFrameServiceImpl.LIZ().getBottomClick(context, this.LJLJJLL);
        }
        View.OnClickListener onClickListener = this.LJLJI;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (customDotAbility = (CustomDotAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJJIFFI, null), CustomDotAbility.class, null)) != null) {
            customDotAbility.l40();
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJI(Context context) {
        o.LJIIIZ(context, "context");
        if (this.LJLJI == null) {
            this.LJLJI = HomePageUIFrameServiceImpl.LIZ().getBottomClick(context, this.LJLJJLL);
        }
        View view = new View(context);
        view.setTag("is_mocked_click");
        View.OnClickListener onClickListener = this.LJLJI;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Bundle d(Context context) {
        Intent intent;
        int i;
        o.LJIIIZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            intent = LJJIFFI.getIntent();
        } else {
            intent = null;
        }
        if (intent == null) {
            return new Bundle();
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "tab");
        if (C38354F3m.LJ(LLJJIJIIJIL)) {
            i = intent.getIntExtra("tab", -1);
        } else {
            try {
                if (LLJJIJIIJIL != null) {
                    i = CastIntegerProtector.parseInt(LLJJIJIIJIL);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } catch (Throwable unused) {
                i = -1;
            }
        }
        int intExtra = intent.getIntExtra("page_type", -1);
        if (i < 0 && intExtra < 0) {
            return new Bundle();
        }
        return C1DG.LIZLLL("tab", i, "page_type", intExtra);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String w0(Context context) {
        o.LJIIIZ(context, "context");
        if (C85990Xow.LJIIJ() && e1.LIZ(31744, "for_you_new_translations", true, false)) {
            return C29822Bn8.LIZ(context, R.string.h23, "{\n            context.re…tring.home_tab)\n        }");
        }
        return C29822Bn8.LIZ(context, R.string.hzb, "{\n            context.re….main_tab_home)\n        }");
    }
}
