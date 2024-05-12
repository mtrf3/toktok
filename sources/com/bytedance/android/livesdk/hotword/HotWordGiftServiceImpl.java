package com.bytedance.android.livesdk.hotword;

import X.B83;
import X.BZI;
import X.C0NB;
import X.C15380j0;
import X.C15870jn;
import X.C28787BRn;
import X.C29374Bfu;
import X.C30868C9o;
import X.C76800UCe;
import X.C77350UXi;
import X.C77351UXj;
import X.INU;
import X.InterfaceC15800jg;
import X.InterfaceC88472Yns;
import com.bytedance.android.live.gift.IHotWordGiftService;
import com.bytedance.android.livesdk.livesetting.gift.HotWordGiftSettings;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class HotWordGiftServiceImpl implements IHotWordGiftService {
    public volatile Keva LJLIL;
    public C77350UXi LJLJI;
    public final Object LJLILLLLZI = new Object();
    public final CopyOnWriteArrayList<InterfaceC88472Yns<Boolean, C76800UCe>> LJLJJI = new CopyOnWriteArrayList<>();

    @Override // com.bytedance.android.live.gift.IHotWordGiftService, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        C15870jn.LIZ(this);
    }

    static {
        new C77351UXj();
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final void clearLocalLibrary() {
        Keva repo = Keva.getRepo("hot_word_gift_library");
        o.LJIIIIZZ(repo, "getRepo(KEVA_LIBRARY_REPO_NAME)");
        repo.clear();
        C0NB.LIZIZ("HotWordGift", "Local library cleared");
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final boolean isRemoteEnabled() {
        return HotWordGiftSettings.INSTANCE.isEnabled();
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final boolean isUserEnabled() {
        Keva keva = this.LJLIL;
        if (keva == null) {
            keva = Keva.getRepo("hot_word_gift_user");
            o.LJIIIIZZ(keva, "getRepo(KEVA_USER_REPO_NAME)");
            this.LJLIL = keva;
        }
        return keva.getBoolean("feature_user_pref", true);
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final boolean isEnabled() {
        if (isRemoteEnabled() && isUserEnabled()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final void notifyCommentInputChanged(String input) {
        o.LJIIIZ(input, "input");
        DataChannelGlobal.LJLJJI.tv0(CommentActionChannel.class, new INU(1, input, null, 4));
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final void registerToggleChangeListener(InterfaceC88472Yns<? super Boolean, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        synchronized (this.LJLILLLLZI) {
            if (this.LJLJI == null) {
                Keva keva = this.LJLIL;
                if (keva == null) {
                    keva = Keva.getRepo("hot_word_gift_user");
                    o.LJIIIIZZ(keva, "getRepo(KEVA_USER_REPO_NAME)");
                    this.LJLIL = keva;
                }
                C77350UXi c77350UXi = new C77350UXi(keva, this);
                this.LJLJI = c77350UXi;
                keva.registerChangeListener(c77350UXi);
            }
        }
        if (!this.LJLJJI.contains(listener)) {
            this.LJLJJI.add(listener);
        }
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final void setHighlightHandler(InterfaceC15800jg interfaceC15800jg) {
        DataChannelGlobal.LJLJJI.tv0(CommentActionChannel.class, new INU(2, null, interfaceC15800jg, 2));
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final void setUserEnabled(boolean z) {
        Keva keva = this.LJLIL;
        if (keva == null) {
            keva = Keva.getRepo("hot_word_gift_user");
            o.LJIIIIZZ(keva, "getRepo(KEVA_USER_REPO_NAME)");
            this.LJLIL = keva;
        }
        keva.storeBoolean("feature_user_pref", z);
        BZI LIZ = C28787BRn.LIZ("livesdk_live_comment_setting_click");
        LIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "status");
        LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
        if (z) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.lkf));
        }
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final void unregisterToggleChangeListener(InterfaceC88472Yns<? super Boolean, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJI.remove(listener);
    }
}
