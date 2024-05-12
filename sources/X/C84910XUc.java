package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.choosemusic.fragment.ChooseMusicFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XUc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84910XUc {
    public static ChooseMusicFragment LIZ(int i, String str, MusicModel musicModel, EnumC122984sA enumC122984sA, boolean z, boolean z2, Bundle bundle, String str2, String str3, int i2, boolean z3, String str4, UrlModel urlModel, int i3, boolean z4, boolean z5, String defaultQuery, boolean z6) {
        o.LJIIIZ(defaultQuery, "defaultQuery");
        ChooseMusicFragment chooseMusicFragment = new ChooseMusicFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        bundle2.putSerializable("challenge", str);
        bundle2.putSerializable("music_model", musicModel);
        bundle2.putSerializable("music_style", enumC122984sA);
        bundle2.putBoolean("music_allow_clear", z);
        bundle2.putBoolean("music_allow_cut", z3);
        bundle2.putString("creation_id", str3);
        bundle2.putString("shoot_way", str2);
        bundle2.putBoolean("music_is_photomv", z2);
        bundle2.putInt("sound_page_scene", i2);
        bundle2.putSerializable("reuse_original_sound_url", urlModel);
        bundle2.putString("reuse_original_sound_id", str4);
        bundle2.putInt("reuse_original_sound_length", i3);
        bundle2.putSerializable("is_mv_theme_music", Boolean.valueOf(z4));
        bundle2.putBoolean("should_show_local_music", z5);
        bundle2.putString("music_default_query", defaultQuery);
        bundle2.putBoolean("music_initial_load", z6);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        chooseMusicFragment.setArguments(bundle2);
        return chooseMusicFragment;
    }
}
