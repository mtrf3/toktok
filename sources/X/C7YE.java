package X;

import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7YE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(View view, Music music) {
        String string;
        List<MusicOwnerInfo> highlightMusicOwnerInfo;
        UrlModel coverMedium;
        List<String> urlList;
        String str;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(music, "music");
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS38S0200000_3(context, music, 66), view);
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.gzr);
        if (smartImageView != null && (coverMedium = music.getCoverMedium()) != null && (urlList = coverMedium.getUrlList()) != null && (str = (String) ORZ.LJLLLL(urlList)) != null) {
            smartImageView.LIZ(W5U.LJIIIIZZ(str).LIZ());
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.grw);
        if (tuxTextView != null && (string = context.getString(R.string.i27)) != null && (highlightMusicOwnerInfo = music.getHighlightMusicOwnerInfo()) != null && !highlightMusicOwnerInfo.isEmpty()) {
            C025908h.LJ(new Object[]{((MusicOwnerInfo) ListProtector.get(music.getHighlightMusicOwnerInfo(), 0)).getNickName()}, 1, string, "format(format, *args)", tuxTextView);
        }
        TextView textView = (TextView) view.findViewById(R.id.grx);
        if (textView != null) {
            textView.setText(music.getMusicName());
        }
        C7YF c7yf = (C7YF) view.findViewById(R.id.gta);
        if (c7yf != null) {
            c7yf.setFont(72);
        }
    }

    public static boolean LIZIZ(Music music, String str, boolean z) {
        MusicReleaseInfo musicReleaseInfo;
        String str2 = "1";
        if (z) {
            if (music != null && (musicReleaseInfo = music.getMusicReleaseInfo()) != null && musicReleaseInfo.isNewReleaseSong()) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "single_song");
                c188727au.LJIIIZ("music_id", music.getMid());
                c188727au.LJIIIZ("group_id", str);
                c188727au.LJIIIZ("music_new_show", "1");
                c188727au.LJIIIZ("location", "title");
                FMX.LJIIL("new_release_show", c188727au.LIZ);
                return true;
            }
        } else if (music != null && music.getMatchedPGCSoundInfo() != null && music.getMatchedPGCSoundInfo().getMusicReleaseInfo() != null && music.getMatchedPGCSoundInfo().getMusicReleaseInfo().isNewReleaseSong()) {
            if (!C7Y9.LIZ()) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", "single_song");
            c188727au2.LJIIIZ("music_id", music.getMatchedPGCSoundInfo().getId());
            c188727au2.LJIIIZ("from_music_id", music.getMid());
            c188727au2.LJIIIZ("group_id", str);
            c188727au2.LJIIIZ("music_new_show", str2);
            c188727au2.LJIIIZ("location", "music_feedback");
            FMX.LJIIL("new_release_show", c188727au2.LIZ);
            return true;
        }
        return false;
    }

    public static void LIZ(SpannableStringBuilder spannableStringBuilder, Music music, boolean z, Context context) {
        if (context == null || music == null || !C7Y9.LIZ()) {
            return;
        }
        if (z) {
            MusicReleaseInfo musicReleaseInfo = music.getMusicReleaseInfo();
            if (musicReleaseInfo == null || !musicReleaseInfo.isNewReleaseSong()) {
                return;
            }
            C7YF c7yf = new C7YF(context, null, 0);
            c7yf.setFont(62);
            C8FC c8fc = new C8FC(c7yf);
            SpannableString spannableString = new SpannableString("T");
            spannableString.setSpan(c8fc, spannableString.length() - 1, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            return;
        }
        if (music.getMatchedPGCSoundInfo() == null || music.getMatchedPGCSoundInfo().getMusicReleaseInfo() == null || !music.getMatchedPGCSoundInfo().getMusicReleaseInfo().isNewReleaseSong()) {
            return;
        }
        C7YF c7yf2 = new C7YF(context, null, 0);
        c7yf2.setFont(72);
        C8FC c8fc2 = new C8FC(c7yf2);
        SpannableString spannableString2 = new SpannableString("T");
        spannableString2.setSpan(c8fc2, spannableString2.length() - 1, spannableString2.length(), 17);
        spannableStringBuilder.append((CharSequence) spannableString2);
    }
}
