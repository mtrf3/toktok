package com.ss.android.ugc.aweme.services;

import X.C2068389v;
import X.C221108m2;
import X.C47261Igj;
import X.C58096Mr6;
import X.C5H3;
import X.C61878OQg;
import X.C77275UUl;
import X.C7MY;
import X.EF7;
import X.N2A;
import X.N2B;
import X.SFS;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IClearCacheService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TpcConsentServiceImpl;
import com.ss.android.ugc.aweme.shortcut.TiktokShortcutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ClearCacheService implements IClearCacheService {
    public static final Companion Companion = new Companion();
    public final C5H3 keva$delegate = C221108m2.LIZIZ(ClearCacheService$keva$2.INSTANCE);

    private final Keva getKeva() {
        return (Keva) this.keva$delegate.getValue();
    }

    private final boolean shouldShowShortcut() {
        return Keva.getRepo("clear_cache_service").getBoolean("should_add_shortcut", false);
    }

    public void removeFreeUpSpaceShortcut() {
        if (Build.VERSION.SDK_INT < 25) {
            return;
        }
        TiktokShortcutManager.LJIIJ().LJIIIZ(C61878OQg.INSTANCE);
    }

    @Override // com.ss.android.ugc.aweme.IClearCacheService
    public boolean retryAddClearCacheShortcut() {
        if (Build.VERSION.SDK_INT < 25 || !shouldShowShortcut()) {
            return false;
        }
        return addClearCacheShortcut(EF7.LIZIZ());
    }

    private final boolean isInFirstDayWindow() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = getKeva().getLong("initial_timestamp", 0L);
        if (j == 0) {
            getKeva().storeLong("initial_timestamp", currentTimeMillis);
            return true;
        }
        if (currentTimeMillis - j < 86400000) {
            return true;
        }
        return false;
    }

    private final boolean isInRestrictedRegions() {
        return C77275UUl.LJIIIIZZ("US", "AT", "BE", "BG", "CH", "CY", "CZ", "DE", "DK", "EE", "EL", "ES", "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IS", "IT", "LI", "LT", "LU", "LV", "MT", "NL", "NO", "PL", "PT", "RO", "SE", "SI", "SK").contains(AccountService.LJIJ().LJIILL());
    }

    private final boolean shouldShowTcpConsent() {
        return TpcConsentServiceImpl.LJIIZILJ().LJ(null);
    }

    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    private final boolean addClearCacheShortcut(Context context) {
        if (Build.VERSION.SDK_INT < 25) {
            return false;
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = C7MY.LIZIZ(20);
        c2068389v.LIZJ = C7MY.LIZIZ(20);
        c2068389v.LIZ = R.raw.icon_3pt_broom;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        Bitmap LJIIIZ = SFS.LJIIIZ(c2068389v.LIZ(context));
        N2B n2b = N2B.CLEAN_MEMORY;
        String string = context.getString(R.string.tea);
        o.LJIIIIZZ(string, "context.getString(R.stri…ll_longpress_clear_cache)");
        Icon createWithBitmap = Icon.createWithBitmap(LJIIIZ);
        o.LJIIIIZZ(createWithBitmap, "createWithBitmap(bitmap)");
        List<N2A> LJJIJ = C47261Igj.LJJIJ(new N2A(n2b, string, createWithBitmap, C47261Igj.LJJIJ("//setting/diskmanager"), false, 3, null));
        if (TiktokShortcutManager.LJIIJ().LJ(context, LJJIJ).size() != LJJIJ.size()) {
            return false;
        }
        return true;
    }

    public static IClearCacheService createIClearCacheServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IClearCacheService.class, z);
        if (LIZ != null) {
            return (IClearCacheService) LIZ;
        }
        if (C58096Mr6.G5 == null) {
            synchronized (IClearCacheService.class) {
                if (C58096Mr6.G5 == null) {
                    C58096Mr6.G5 = new ClearCacheService();
                }
            }
        }
        return C58096Mr6.G5;
    }

    private final void updateShouldShowShortcut(boolean z) {
        Keva.getRepo("clear_cache_service").storeBoolean("should_add_shortcut", z);
    }

    @Override // com.ss.android.ugc.aweme.IClearCacheService
    public boolean tryAddClearCacheShortcut(Context context) {
        o.LJIIIZ(context, "context");
        if (Build.VERSION.SDK_INT < 25 || isInRestrictedRegions() || isInFirstDayWindow()) {
            return false;
        }
        if (shouldShowTcpConsent()) {
            updateShouldShowShortcut(true);
            return true;
        }
        return addClearCacheShortcut(context);
    }
}
