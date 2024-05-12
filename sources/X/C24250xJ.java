package X;

import android.os.Bundle;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeQueueSongListFragment;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeRequestSongListFragment;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSearchSongListFragment;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment;

/* renamed from: X.0xJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24250xJ {
    public static final /* synthetic */ int LIZ = 0;

    public static KaraokeSongListFragment LIZ(long j) {
        KaraokeSongListFragment karaokeLibrarySongListFragment;
        if (j == -999) {
            karaokeLibrarySongListFragment = new KaraokeQueueSongListFragment();
        } else if (j == -998) {
            karaokeLibrarySongListFragment = new KaraokeRequestSongListFragment();
        } else if (j == -997) {
            karaokeLibrarySongListFragment = new KaraokeSearchSongListFragment();
        } else {
            karaokeLibrarySongListFragment = new KaraokeLibrarySongListFragment();
        }
        Bundle bundle = new Bundle();
        bundle.putLong("tab", j);
        karaokeLibrarySongListFragment.setArguments(bundle);
        return karaokeLibrarySongListFragment;
    }
}
