package com.ss.android.ugc.aweme.commercialize.ecommerce.service;

import X.ActivityC45651qj;
import X.C113554cx;
import X.C47261Igj;
import X.C58096Mr6;
import X.C59647Nb1;
import X.C61074Ny2;
import X.C61076Ny4;
import X.C78983UzD;
import X.F3T;
import X.InterfaceC38186Eyk;
import X.OSZ;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.model.ShopifyPdpAdInfo;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.ui.PdpBulletBottomSheetFragment;
import com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.jsb.GetSharedMemoryItemMethod;
import com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.jsb.OpenHybridMethod;
import com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.jsb.SetSharedMemoryItemMethod;
import com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.ui.WishListFragment;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ShoppingAdsServiceImpl implements IShoppingAdsService {
    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final Map<String, Class<?>> LIZJ() {
        return C113554cx.LJJL(new OSZ("setSharedMemoryItem", SetSharedMemoryItemMethod.class), new OSZ("getSharedMemoryItem", GetSharedMemoryItemMethod.class), new OSZ("openHybrid", OpenHybridMethod.class));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final boolean LJ() {
        boolean z = false;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("enable_wishlist_product_tab", false);
            return z;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return z;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final boolean LJFF() {
        boolean z = false;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("enable_shopify_anchor_pdp_half_screen", false);
            return z;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return z;
        }
    }

    public static IShoppingAdsService LJIIIZ() {
        Object LIZ = C58096Mr6.LIZ(IShoppingAdsService.class, false);
        if (LIZ != null) {
            return (IShoppingAdsService) LIZ;
        }
        if (C58096Mr6.LLLLIILL == null) {
            synchronized (IShoppingAdsService.class) {
                if (C58096Mr6.LLLLIILL == null) {
                    C58096Mr6.LLLLIILL = new ShoppingAdsServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLLIILL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final C59647Nb1 LJII() {
        return new C59647Nb1();
    }

    /* loaded from: classes11.dex */
    public static final class WishListFragmentData extends PowerViewPagerFragmentItem<WishListFragment> {
        public static final Parcelable.Creator<WishListFragmentData> CREATOR = new C61076Ny4();
        public final String location;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(this.location);
        }

        public WishListFragmentData(String str) {
            this.location = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final List<InterfaceC38186Eyk> LIZIZ(F3T contextProvider) {
        o.LJIIIZ(contextProvider, "contextProvider");
        return C47261Igj.LJJIJIIJI(new SetSharedMemoryItemMethod(contextProvider), new GetSharedMemoryItemMethod(contextProvider), new OpenHybridMethod(contextProvider));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final WishListFragmentData LIZLLL(String str) {
        return new WishListFragmentData(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final boolean LJI(Context context) {
        Fragment LJJJIL;
        if (context != null && (context instanceof Activity) && (context instanceof ActivityC45651qj)) {
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) context;
            if (!activityC45651qj.isFinishing() && (LJJJIL = activityC45651qj.getSupportFragmentManager().LJJJIL("BulletBottomSheetFragment")) != null && (LJJJIL instanceof DialogFragment)) {
                DialogFragment dialogFragment = (DialogFragment) LJJJIL;
                if (dialogFragment.isVisible()) {
                    dialogFragment.dismiss();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final WishListFragment LJIIIIZZ(String str) {
        WishListFragment wishListFragment = new WishListFragment();
        wishListFragment.LJLLI = str;
        return wishListFragment;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final void LIZ(FragmentManager fragmentManager, C61074Ny2 c61074Ny2, ShopifyPdpAdInfo shopifyPdpAdInfo) {
        PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment = new PdpBulletBottomSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("PDP_AD_INFO", shopifyPdpAdInfo);
        bundle.putFloat("PEEK_HEIGHT_RATIO", c61074Ny2.LJLIL);
        bundle.putFloat("MAX_HEIGHT_RATIO", c61074Ny2.LJLILLLLZI);
        String str = c61074Ny2.LJLJI;
        if (str == null) {
            str = "";
        }
        bundle.putString("SCHEMA", str);
        pdpBulletBottomSheetFragment.LJLJLJ = c61074Ny2.LJLJJL;
        pdpBulletBottomSheetFragment.LJLJLLL = c61074Ny2.LJLJJI;
        pdpBulletBottomSheetFragment.setArguments(bundle);
        if (fragmentManager != null) {
            pdpBulletBottomSheetFragment.show(fragmentManager, "BulletBottomSheetFragment");
        }
    }
}
