package com.ss.android.ugc.gamora.recorder.sticker.sticker_core;

import X.C29S;
import X.C53558L0g;
import X.C76800UCe;
import X.C81658W3a;
import X.InterfaceC65784Pro;
import X.InterfaceC74343TFr;
import X.InterfaceC78118UlG;
import X.InterfaceC88471Ynr;
import X.TEZ;
import X.TGD;
import X.THX;
import Y.ARunnableS39S0100000_3;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class RecordFavoriteSticker extends FavoriteSticker {
    public final C29S LJZI;
    public final FrameLayout LJZL;
    public final InterfaceC78118UlG LL;

    @Override // com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker, X.InterfaceC81664W3g
    public final void LIZ(boolean z) {
        if (z) {
            if (this.LJZI.isFinishing()) {
                return;
            }
            this.LJZL.setVisibility(0);
            if (this.LL.getBubbleGuideShown(false) || C53558L0g.LIZ()) {
                return;
            }
            this.LJZL.post(new ARunnableS39S0100000_3(this, 126));
            this.LL.setBubbleGuideShown(true);
            return;
        }
        this.LJZL.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordFavoriteSticker(C29S mAmeActivity, TEZ stickerDataManager, InterfaceC74343TFr stickerMobHelper, THX favoriteProcessor, FrameLayout frameLayout, C81658W3a c81658W3a, InterfaceC78118UlG stickerPreferences, InterfaceC65784Pro<TGD> configureProvider, InterfaceC88471Ynr<? super Effect, ? super Boolean, C76800UCe> interfaceC88471Ynr) {
        super(mAmeActivity, stickerDataManager, stickerMobHelper, favoriteProcessor, frameLayout, c81658W3a, stickerPreferences, configureProvider, interfaceC88471Ynr);
        o.LJIIIZ(mAmeActivity, "mAmeActivity");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(stickerMobHelper, "stickerMobHelper");
        o.LJIIIZ(favoriteProcessor, "favoriteProcessor");
        o.LJIIIZ(stickerPreferences, "stickerPreferences");
        o.LJIIIZ(configureProvider, "configureProvider");
        this.LJZI = mAmeActivity;
        this.LJZL = frameLayout;
        this.LL = stickerPreferences;
    }
}
