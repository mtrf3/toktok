package com.ss.android.ugc.feed.platform.panel.player;

import X.C221108m2;
import X.C221138m5;
import X.C51781KTx;
import X.C5H3;
import X.C62822Ol8;
import X.EnumC221088m0;
import X.IDP;
import X.IDZ;
import X.IPH;
import X.JAK;
import X.KR8;
import X.KU4;
import X.OSZ;
import X.OUP;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS61S0110000_4;

/* loaded from: classes5.dex */
public final class PlayerEventPanelComponent extends BasePanelComponent implements IDZ {
    public final C5H3 LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerEventPanelComponent() {
        C62822Ol8 c62822Ol8;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS154S0100000_4((KU4) this, 920), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS61S0110000_4(false, (KU4) this, 10));
        }
        this.LJLIL = c62822Ol8;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onParentSet() {
        IDP playerController;
        super.onParentSet();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLIL.getValue();
        if (iFeedPanelPlatformAbility == null || (playerController = iFeedPanelPlatformAbility.getPlayerController()) == null) {
            return;
        }
        playerController.LLLLZIL = new WeakReference<>(this);
    }

    @Override // X.IDZ
    public final void onPlayCompleted(String str) {
        if (KR8.LJIIIZ(this)) {
            return;
        }
        OUP.LJJJ(this, "event_on_play_completed", str);
    }

    @Override // X.IDZ
    public final void onPlayPause(String str) {
        if (KR8.LJIIIZ(this)) {
            return;
        }
        OUP.LJJJ(this, "event_on_play_pause", str);
    }

    @Override // X.IDZ
    public final void onPlaying(String str) {
        if (KR8.LJIIIZ(this)) {
            return;
        }
        OUP.LJJJ(this, "event_on_playing", str);
    }

    @Override // X.IDZ
    public final void onRenderFirstFrame(String str) {
        if (KR8.LJIIIZ(this)) {
            return;
        }
        OUP.LJJJ(this, "event_on_render_first_frame", str);
    }

    @Override // X.IDZ
    public final void onRenderReady(IPH iph) {
        if (KR8.LJIIIZ(this)) {
            return;
        }
        OUP.LJJJ(this, "event_on_render_ready", iph);
    }

    @Override // X.IDZ
    public final void onResumePlay(String str) {
        if (KR8.LJIIIZ(this)) {
            return;
        }
        OUP.LJJJ(this, "event_on_request_resume_play", str);
    }

    @Override // X.IDZ
    public final void onPlayProgressChange(String str, float f) {
        if (KR8.LJIIIZ(this)) {
            return;
        }
        OUP.LJJJ(this, "event_on_play_progress_change", new OSZ(str, Float.valueOf(f)));
    }
}
