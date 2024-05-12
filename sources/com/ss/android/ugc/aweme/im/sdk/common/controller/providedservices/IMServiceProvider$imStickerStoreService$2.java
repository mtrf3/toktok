package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import X.AbstractC65781Prl;
import X.C91053hl;
import X.InterfaceC65784Pro;
import X.InterfaceC88043cu;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.base.fragment.BaseStickerStoreContentFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.fragment.StickerSetContentFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.fragment.VideoStickerContentFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMServiceProvider$imStickerStoreService$2 extends AbstractC65781Prl implements InterfaceC65784Pro<C91053hl> {
    public static final IMServiceProvider$imStickerStoreService$2 INSTANCE = new IMServiceProvider$imStickerStoreService$2();

    public IMServiceProvider$imStickerStoreService$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.3hl] */
    @Override // X.InterfaceC65784Pro
    public final C91053hl invoke() {
        return new InterfaceC88043cu() { // from class: X.3hl
            @Override // X.InterfaceC88043cu
            public final void LJIIIIZZ() {
                C91093hp.LJIIJ(false);
            }

            @Override // X.InterfaceC88043cu
            public final void LJIIIZ() {
                C91093hp.LJIIIZ(true);
            }

            @Override // X.InterfaceC88043cu
            public final C88003cq LIZ() {
                return new C88003cq();
            }

            @Override // X.InterfaceC88043cu
            public final boolean LIZLLL() {
                return C91093hp.LJ();
            }

            @Override // X.InterfaceC88043cu
            public final void LJI() {
                Keva kevaRepo = C105004Ae.LIZ();
                o.LJIIIIZZ(kevaRepo, "kevaRepo");
            }

            @Override // X.InterfaceC88043cu
            public final boolean LJIIJ() {
                return C4LS.LIZ();
            }

            @Override // X.InterfaceC88043cu
            public final void LIZJ(Fragment fragment) {
                o.LJIIIZ(fragment, "fragment");
                if (fragment instanceof StickerSetContentFragment) {
                    try {
                        ((StickerSetContentViewModel) ((StickerSetContentFragment) fragment).LJLJJI.getValue()).manualListRefresh();
                        return;
                    } catch (Exception e) {
                        C34B.LJ("StickerSetContentFragment", e);
                        return;
                    }
                }
                if (fragment instanceof VideoStickerContentFragment) {
                    try {
                        ((VideoStickerContentViewModel) ((VideoStickerContentFragment) fragment).LJLJJI.getValue()).manualListRefresh();
                    } catch (Exception e2) {
                        C34B.LJ("VideoStickerContentFragment", e2);
                    }
                }
            }

            @Override // X.InterfaceC88043cu
            public final BaseStickerStoreContentFragment LIZIZ(int i, String str) {
                C84683Ua.LJFF.LIZIZ(new C88003cq(), true);
                return C91283i8.LIZ(EnumC87143bS.SET_PROFILE.getType(), EnumC91113hr.STICKER_SET.getType(), i, str, null, 16);
            }

            @Override // X.InterfaceC88043cu
            public final void LJ(Long l, boolean z) {
                int status;
                if (l != null) {
                    long longValue = l.longValue();
                    if (z) {
                        status = EnumC87173bV.FAVORITE.getStatus();
                    } else {
                        status = EnumC87173bV.NOT_FAVORITE.getStatus();
                    }
                    C87083bM.LIZIZ(new VideoSticker(Long.valueOf(longValue), null, null, null, null, null, null, null, null, Integer.valueOf(status), null, null, null, null, 15870, null));
                }
            }

            @Override // X.InterfaceC88043cu
            public final BaseStickerStoreContentFragment LJIIJJI(int i, String str) {
                return C91283i8.LIZ(EnumC87143bS.SET_PROFILE.getType(), EnumC91113hr.VIDEO_STICKER.getType(), i, str, null, 16);
            }

            @Override // X.InterfaceC88043cu
            public final boolean LJII(Context context, int i, int i2, String enterFrom, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
                FragmentManager supportFragmentManager;
                FragmentManager supportFragmentManager2;
                o.LJIIIZ(context, "context");
                o.LJIIIZ(enterFrom, "enterFrom");
                if (!C4LS.LIZ() && i == 0 && C113644d6.LIZIZ()) {
                    Keva kevaRepo = C91093hp.LIZLLL();
                    o.LJIIIIZZ(kevaRepo, "kevaRepo");
                    String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                    o.LJIIIIZZ(curUserId, "userService().curUserId");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("key_intercept_education_sheet");
                    LIZ.append(curUserId);
                    if (kevaRepo.getBoolean(X1D.LIZIZ(LIZ), false)) {
                        C91093hp.LJIIIZ(false);
                        return false;
                    }
                    if (i2 == EnumC91123hs.EDUCATION_SHEET_CREATE_AND_NOT_NOW.getValue()) {
                        Keva kevaRepo2 = C91093hp.LIZLLL();
                        o.LJIIIIZZ(kevaRepo2, "kevaRepo");
                        String curUserId2 = ((RBX) HG3.LJIILL()).getCurUserId();
                        o.LJIIIIZZ(curUserId2, "userService().curUserId");
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("key_has_show_feed_education_sheet");
                        LIZ2.append(curUserId2);
                        if (!kevaRepo2.getBoolean(X1D.LIZIZ(LIZ2), false)) {
                            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                            if (LJJIFFI != null && (supportFragmentManager2 = LJJIFFI.getSupportFragmentManager()) != null) {
                                new C91063hm(i2, context, interfaceC88472Yns).LIZ(supportFragmentManager2, enterFrom);
                            }
                            return true;
                        }
                    }
                    if (i2 == EnumC91123hs.EDUCATION_SHEET_GOT_IT.getValue() && !C91093hp.LIZ()) {
                        ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(context);
                        if (LJJIFFI2 != null && (supportFragmentManager = LJJIFFI2.getSupportFragmentManager()) != null) {
                            new C91063hm(i2, context, interfaceC88472Yns).LIZ(supportFragmentManager, enterFrom);
                        }
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC88043cu
            public final void LJFF(ActivityC45651qj context, String stickerLocalFilePath, String aid, boolean z, String originSecUid, int i, int i2, long j, ArrayList arrayList, boolean z2) {
                int i3;
                o.LJIIIZ(context, "context");
                o.LJIIIZ(stickerLocalFilePath, "stickerLocalFilePath");
                o.LJIIIZ(aid, "aid");
                o.LJIIIZ(originSecUid, "originSecUid");
                Bundle bundle = new Bundle();
                bundle.putString("page_type", "store_video_sticker_page");
                bundle.putString("aid", aid);
                bundle.putString("sticker_file_path", stickerLocalFilePath);
                if (z) {
                    i3 = 3;
                } else {
                    i3 = 4;
                }
                bundle.putInt("sticker_type", i3);
                bundle.putString("uid", originSecUid);
                bundle.putInt("width", i);
                bundle.putInt("height", i2);
                bundle.putLong("total_duration", j);
                bundle.putBoolean("has_text", !arrayList.isEmpty());
                bundle.putBoolean("has_crop", z2);
                bundle.putStringArrayList("sticker_texts", arrayList);
                C89083ea.LIZ(context, bundle, 100);
            }
        };
    }
}
