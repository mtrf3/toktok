package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.fragments.MentionVideoListFragment;

/* renamed from: X.GiA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42254GiA {
    public static MentionVideoListFragment LIZ(int i, String str, String str2) {
        MentionVideoListFragment mentionVideoListFragment = new MentionVideoListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("page_type", i);
        bundle.putString("music_id", str);
        bundle.putString("music_title", str2);
        mentionVideoListFragment.setArguments(bundle);
        return mentionVideoListFragment;
    }
}
