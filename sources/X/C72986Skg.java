package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS143S0200000_12;

/* renamed from: X.Skg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72986Skg extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ LiveReplayVideoClipActivity LJLIL;
    public final /* synthetic */ OSZ<Long, Long> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72986Skg(LiveReplayVideoClipActivity liveReplayVideoClipActivity, OSZ<Long, Long> osz, long j, long j2) {
        super(0);
        this.LJLIL = liveReplayVideoClipActivity;
        this.LJLILLLLZI = osz;
        this.LJLJI = j;
        this.LJLJJI = j2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ((LinkedHashMap) this.LJLIL.LL).clear();
        this.LJLIL.LL.put(this.LJLILLLLZI, 0L);
        LiveReplayVideoClipActivity liveReplayVideoClipActivity = this.LJLIL;
        if (liveReplayVideoClipActivity.LJLLL == null) {
            Float valueOf = Float.valueOf(0.0f);
            A90 a90 = new A90(this.LJLIL);
            C72991Skl.LIZ(valueOf, a90, new DialogInterfaceOnCancelListenerC38491F8t(this.LJLIL, this.LJLILLLLZI));
            liveReplayVideoClipActivity.LJLLL = a90;
        }
        LiveReplayVideoClipActivity liveReplayVideoClipActivity2 = this.LJLIL;
        liveReplayVideoClipActivity2.LJLLLLLL = true;
        A90 a902 = liveReplayVideoClipActivity2.LJLLL;
        if (a902 != null) {
            a902.LIZLLL(0.0f);
        }
        A90 a903 = this.LJLIL.LJLLL;
        if (a903 != null && !new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingProgressHUD", "show", a903, new Object[0], "void", new C65300Pk0(false, "()V", "5357631770258464824")).LIZ) {
            a903.show();
        }
        long j = this.LJLJI - this.LJLJJI;
        C188727au LLIIIILZ = this.LJLIL.LLIIIILZ();
        LLIIIILZ.LJ(this.LJLJJI, "start_time");
        LLIIIILZ.LJ(j, "duration");
        LLIIIILZ.LJIIIZ("click_stage", "1");
        FMX.LJIIL("livesdk_live_replay_clip_post_click", LLIIIILZ.LIZ);
        this.LJLIL.LLIILII("post");
        LiveReplayVideoClipActivity liveReplayVideoClipActivity3 = this.LJLIL;
        liveReplayVideoClipActivity3.LLII(this.LJLJJI, this.LJLJI, 2, new AqS143S0200000_12(liveReplayVideoClipActivity3, (LiveReplayVideoClipActivity) this.LJLILLLLZI, (OSZ<Long, Long>) 104), new AqS143S0200000_12(this.LJLIL, (LiveReplayVideoClipActivity) this.LJLILLLLZI, (OSZ<Long, Long>) 105));
        return C76800UCe.LIZ;
    }
}
