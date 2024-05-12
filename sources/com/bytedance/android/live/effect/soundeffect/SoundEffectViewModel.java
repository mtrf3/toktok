package com.bytedance.android.live.effect.soundeffect;

import X.C2H8;
import X.C2R;
import X.C37931eH;
import X.C37951eJ;
import X.C54182As;
import X.CN1;
import X.InterfaceC12630eZ;
import X.XKX;
import android.os.Handler;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.ss.ttlivestreamer.core.player.IAVPlayer;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SoundEffectViewModel extends BaseEffectViewModel<SoundEffect> {
    public final C37931eH LJLJJI;
    public final C37951eJ LJLJJL;
    public int LJLJJLL;
    public final InterfaceC12630eZ LJLJL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((Handler) this.LJLJJI.LJLJJL.getValue()).removeCallbacksAndMessages(null);
    }

    public final void kv0(SoundEffect soundEffect) {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C54182As(this, soundEffect, null), 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundEffectViewModel(C37931eH dataRepository, C37951eJ resourceRepository) {
        super(dataRepository, resourceRepository);
        IAVPlayer iAVPlayer;
        o.LJIIIZ(dataRepository, "dataRepository");
        o.LJIIIZ(resourceRepository, "resourceRepository");
        this.LJLJJI = dataRepository;
        this.LJLJJL = resourceRepository;
        InterfaceC12630eZ liveStreamSoundPlayer = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getLiveStreamSoundPlayer();
        this.LJLJL = liveStreamSoundPlayer;
        if (liveStreamSoundPlayer != null && (iAVPlayer = C2R.LIZIZ) != null) {
            iAVPlayer.setVolume(0.6f);
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C2H8(this, null), 3);
    }
}
