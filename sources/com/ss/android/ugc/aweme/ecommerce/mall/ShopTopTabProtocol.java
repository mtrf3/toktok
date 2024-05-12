package com.ss.android.ugc.aweme.ecommerce.mall;

import X.AbstractC56099Lzz;
import X.ActivityC45651qj;
import X.C116694i1;
import X.C141335gf;
import X.C1JD;
import X.C221108m2;
import X.C2NH;
import X.C3C5;
import X.C45804HyK;
import X.C62822Ol8;
import X.C72972SkS;
import X.C76800UCe;
import X.C78983UzD;
import X.EnumC53763L8d;
import X.FCG;
import X.FCH;
import X.InterfaceC55235Lm3;
import X.LCM;
import X.LCY;
import X.LGE;
import Y.ARunnableS28S0200000_9;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class ShopTopTabProtocol extends TopTabProtocol {
    public Context LJLJJI;
    public boolean LJLJJL;
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 115));
    public final String LJLJL = "Shop";
    public final Class<? extends Fragment> LJLJLJ = ShopMainFragment.class;
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 114));
    public final EnumC53763L8d LJLL = EnumC53763L8d.X_TAB;
    public final String LJLLI = "homepage_mall";
    public final LGE LJLLILLLL = LGE.SHOP;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final LCY LIZJ() {
        return new LCM(this.LJLLI);
    }

    public final boolean LJIIJJI() {
        ActivityC45651qj LJJIFFI;
        Context context = this.LJLJJI;
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            if (o.LJ("HOME", C116694i1.LIZ(LJJIFFI).nv0()) && Hox.LJLLI.LIZ(LJJIFFI).vv0("Shop")) {
                return true;
            }
            return false;
        }
        "activity is null".toString();
        throw new IllegalArgumentException("activity is null");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LIZIZ() {
        String str;
        ActivityC45651qj LJJIFFI;
        Intent intent;
        ActivityC45651qj LJJIFFI2;
        Intent intent2;
        if (LJIIJJI()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("tab_clicked_time", String.valueOf(System.currentTimeMillis()));
                jSONObject.put("ec_mall_top_tab_click", jSONObject2);
                FCH.LIZIZ.getClass();
                FCG.LIZ("ec_mall_data_for_lynx", jSONObject);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
                return;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                return;
            }
        }
        boolean z = true;
        this.LJLJJL = true;
        MainBusinessAbility LJIL = C1JD.LJIL((InterfaceC55235Lm3) this.LJLJJLL.getValue());
        if (LJIL != null) {
            str = LJIL.nH();
        } else {
            str = null;
        }
        Context context = this.LJLJJI;
        int i = -1;
        if (context != null && (LJJIFFI2 = C45804HyK.LJJIFFI(context)) != null && (intent2 = LJJIFFI2.getIntent()) != null) {
            i = intent2.getIntExtra("extra_shop_tab_mock_click", -1);
        }
        if (i == 1) {
            Context context2 = this.LJLJJI;
            if (context2 != null && (LJJIFFI = C45804HyK.LJJIFFI(context2)) != null && (intent = LJJIFFI.getIntent()) != null) {
                intent.removeExtra("extra_shop_tab_mock_click");
            }
        } else {
            z = false;
        }
        ((AbstractC56099Lzz) this.LJLJLLL.getValue()).LIZJ(str, false, z);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean LJIIJ() {
        return ECommerceMallService.v3().Q1();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        return ECommerceMallService.v3().G2();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC53763L8d LIZLLL() {
        return this.LJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final LGE LJ() {
        return this.LJLLILLLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String LJIIIZ() {
        return this.LJLLI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return this.LJLJLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LJLJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJJI = context;
        C2NH.LIZ.post(new ARunnableS28S0200000_9(this, context, 10));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String w0(Context context) {
        return C72972SkS.LJ(context, "context", R.string.ffq, "context.resources.getStr…tring.ecom_shop_tab_name)");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJII(String str, String str2) {
        String str3;
        if (this.LJLJJL) {
            this.LJLJJL = false;
            return;
        }
        MainBusinessAbility LJIL = C1JD.LJIL((InterfaceC55235Lm3) this.LJLJJLL.getValue());
        if (LJIL != null) {
            str3 = LJIL.nH();
        } else {
            str3 = null;
        }
        ((AbstractC56099Lzz) this.LJLJLLL.getValue()).LIZJ(str3, true, false);
    }
}
