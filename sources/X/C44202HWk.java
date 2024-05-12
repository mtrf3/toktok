package X;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.music.ui.MusicDetailActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.HWk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44202HWk extends AbstractC44201HWj {
    public C44202HWk(MusicDetailActivity musicDetailActivity) {
        super(musicDetailActivity);
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent event) {
        o.LJIIIZ(event, "event");
        C44203HWl.LIZIZ.LJI(i, event, this.LJLIL);
        return false;
    }
}
