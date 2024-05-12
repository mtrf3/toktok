package X;

import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioDetailFragment;

/* renamed from: X.XUb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84909XUb implements InterfaceC252739vx {
    public final /* synthetic */ ReuseAudioDetailFragment LIZ;

    @Override // X.InterfaceC252739vx
    public final void LIZ() {
        ReuseAudioDetailFragment reuseAudioDetailFragment = this.LIZ;
        if (reuseAudioDetailFragment.LJLJJLL != null) {
            String str = reuseAudioDetailFragment.LJLJLLL;
            String str2 = reuseAudioDetailFragment.LJLJLJ;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "single_song");
            c188727au.LJIIIZ("group_id", str2);
            c188727au.LJIIIZ("music_id", str);
            FMX.LJIIL("click_original_sound_cancel", c188727au.LIZ);
        }
        ASQ.LJ(this.LIZ, ASY.LIZ);
    }

    public C84909XUb(ReuseAudioDetailFragment reuseAudioDetailFragment) {
        this.LIZ = reuseAudioDetailFragment;
    }
}
