package com.ss.android.ugc.aweme.profile.ui.profiletab;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C221108m2;
import X.C45804HyK;
import X.C53986LGs;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C72972SkS;
import X.EnumC53761L8b;
import X.InterfaceC36571c5;
import X.InterfaceC53971LGd;
import X.LH6;
import X.LN0;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.base.CustomDotAbility;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ProfileTabProtocol extends BottomTabProtocol {
    public Context LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 514));
    public final LH6 LJLJJL = new LH6(new C53986LGs(R.drawable.by5, R.attr.go), new C53986LGs(R.drawable.by7, R.attr.dj), new C53986LGs(R.drawable.by6, R.attr.gv), new C53986LGs(R.drawable.by7, R.attr.dl), Integer.valueOf(R.id.gc2));
    public final Class<? extends Fragment> LJLJJLL = I18nMyProfileFragmentV2.class;
    public final String LJLJL = "USER";
    public final EnumC53761L8b LJLJLJ = EnumC53761L8b.TAB_5;

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String LJIIIZ() {
        Context context = this.LJLJI;
        if (context != null) {
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("can not find activity of context ");
                Context context2 = this.LJLJI;
                if (context2 == null) {
                    o.LJIJI("context");
                    throw null;
                }
                LIZ.append(context2);
                String LIZIZ = X1D.LIZIZ(LIZ);
                LIZIZ.toString();
                throw new IllegalArgumentException(LIZIZ);
            }
            InterfaceC36571c5 Ja = Hox.LJLLI.LIZ(LJJIFFI).Ja(this.LJLJL);
            if (Ja instanceof I18nUserProfileFragmentV2) {
                return "others_homepage";
            }
            if (Ja instanceof InterfaceC53971LGd) {
                String enterFrom = ((InterfaceC53971LGd) Ja).getEnterFrom();
                o.LJIIIIZZ(enterFrom, "fragment.enterFrom");
                return enterFrom;
            }
            return "";
        }
        o.LJIJI("context");
        throw null;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final LH6 LIZJ() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final EnumC53761L8b LIZLLL() {
        return this.LJLJLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getTag() {
        return this.LJLJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJFF(Context context) {
        CustomDotAbility customDotAbility;
        o.LJIIIZ(context, "context");
        ((LN0) this.LJLJJI.getValue()).LIZLLL();
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (customDotAbility = (CustomDotAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJJIFFI, null), CustomDotAbility.class, null)) != null) {
            customDotAbility.l40();
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJI(Context context) {
        o.LJIIIZ(context, "context");
        ((LN0) this.LJLJJI.getValue()).LIZLLL();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Bundle d(Context context) {
        o.LJIIIZ(context, "context");
        Bundle bundle = new Bundle();
        bundle.putString("from", "from_main");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            bundle.putString("profile_from_scene", C16880lQ.LLJJIJIIJIL(LJIJJ.getIntent(), "profile_from_scene"));
            return bundle;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJI = context;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String w0(Context context) {
        return C72972SkS.LJ(context, "context", R.string.hzc, "context.resources.getString(R.string.main_tab_me)");
    }
}
