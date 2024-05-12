package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* renamed from: X.WLt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82145WLt implements WGG {
    public final /* synthetic */ C82143WLr LIZ;
    public final /* synthetic */ boolean LIZIZ = true;

    public C82145WLt(C82143WLr c82143WLr) {
        this.LIZ = c82143WLr;
    }

    @Override // X.WGG
    public final void LIZ(MusicWaveBean musicWaveBean) {
        FragmentManager supportFragmentManager;
        this.LIZ.getClass();
        C82143WLr c82143WLr = this.LIZ;
        int i = c82143WLr.LJLJJI;
        int i2 = c82143WLr.LJLJL;
        if (musicWaveBean != null) {
            InterfaceC82187WNj interfaceC82187WNj = c82143WLr.LJLJI;
            if (interfaceC82187WNj != null) {
                interfaceC82187WNj.Q1(musicWaveBean, i, i2, c82143WLr.LJLJLJ, false);
            } else {
                o.LJIJI("cutMusicPanel");
                throw null;
            }
        }
        if (this.LIZIZ) {
            C82143WLr fragmentActivity = this.LIZ;
            o.LJIIIZ(fragmentActivity, "$this$fragmentActivity");
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) fragmentActivity.mActivity;
            if (activityC45651qj != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null) {
                InterfaceC82187WNj interfaceC82187WNj2 = this.LIZ.LJLJI;
                if (interfaceC82187WNj2 != null) {
                    interfaceC82187WNj2.x0(supportFragmentManager);
                } else {
                    o.LJIJI("cutMusicPanel");
                    throw null;
                }
            }
        }
    }
}
