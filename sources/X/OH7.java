package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicChartLinkStyle;
import com.ss.android.ugc.aweme.music.model.MusicChartRankStruct;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OH7 implements OHA {
    public final MusicDetail LIZ;
    public final OQN LIZIZ;
    public TextView LIZJ;
    public final /* synthetic */ MusicDetailNavBarAssem LIZLLL;

    @Override // X.OHA
    public final void LIZ(C252709vu c252709vu) {
        MusicChartRankStruct musicChartRankStruct;
        Context context = this.LIZLLL.getContext();
        if (context == null || (musicChartRankStruct = this.LIZ.musicChartRankStruct) == null) {
            return;
        }
        OQN oqn = this.LIZIZ;
        String chartMusicInfo = musicChartRankStruct.getChartMusicInfo();
        oqn.getClass();
        String LJII = OQN.LJII(chartMusicInfo);
        if (LJII == null || LJII.length() == 0) {
            return;
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser != null && curUser.getAccountType() == 3) {
            return;
        }
        Music music = this.LIZ.music;
        if (music != null) {
            music.getMid();
        }
        C235929Ns c235929Ns = new C235929Ns();
        c235929Ns.LIZIZ = "music_chart";
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setGravity(16);
        tuxTextView.setTuxFont(43);
        tuxTextView.setTextColorRes(R.attr.dj);
        C26338AVi.LJIIIZ(tuxTextView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 0, AnonymousClass391.LIZJ(12), 0, 16);
        c235929Ns.LIZJ = tuxTextView;
        c252709vu.LIZIZ(c235929Ns);
    }

    @Override // X.OHA
    public final void LIZIZ(C252709vu c252709vu) {
        String str;
        boolean z;
        int i;
        int i2;
        MusicDetail musicDetail = this.LIZ;
        MusicChartRankStruct musicChartRankStruct = musicDetail.musicChartRankStruct;
        if (musicChartRankStruct == null) {
            return;
        }
        Music music = musicDetail.music;
        TextView textView = null;
        if (music != null) {
            str = music.getMid();
        } else {
            str = null;
        }
        View LJI = c252709vu.LJI("music_chart");
        if (LJI instanceof TextView) {
            textView = (TextView) LJI;
        }
        this.LIZJ = textView;
        if (textView != null) {
            MusicDetailNavBarAssem musicDetailNavBarAssem = this.LIZLLL;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.width = -2;
                layoutParams2.height = C7MY.LIZIZ(28);
                layoutParams2.gravity = 16;
                textView.setLayoutParams(layoutParams2);
                OQN oqn = this.LIZIZ;
                String str2 = (String) musicDetailNavBarAssem.LJLLJ.getValue();
                oqn.getClass();
                String LJII = OQN.LJII(musicChartRankStruct.getChartMusicInfo());
                if (LJII == null || LJII.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    textView.setVisibility(8);
                    return;
                }
                User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                if (curUser != null && curUser.getAccountType() == 3) {
                    textView.setVisibility(8);
                    return;
                }
                textView.setVisibility(0);
                textView.setText(musicChartRankStruct.getDesc());
                C16880lQ.LJIJI(textView, new OH5(LJII, oqn, textView, musicChartRankStruct, str2, str));
                if (musicChartRankStruct.getMusicChartLinkStyle() != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    MusicChartLinkStyle musicChartLinkStyle = musicChartRankStruct.getMusicChartLinkStyle();
                    if (musicChartLinkStyle != null) {
                        i = musicChartLinkStyle.getBgStartColor();
                    } else {
                        i = 0;
                    }
                    MusicChartLinkStyle musicChartLinkStyle2 = musicChartRankStruct.getMusicChartLinkStyle();
                    if (musicChartLinkStyle2 != null) {
                        i2 = musicChartLinkStyle2.getBgEndColor();
                    } else {
                        i2 = 0;
                    }
                    int i3 = (i2 & (-16777216)) >>> 24;
                    if (((i & (-16777216)) >>> 24) <= 0) {
                        i |= -16777216;
                    }
                    if (i3 <= 0) {
                        i2 |= -16777216;
                    }
                    gradientDrawable.setColors(new int[]{i, i2});
                    gradientDrawable.setCornerRadius(C17N.LJIILL(24.0d));
                    gradientDrawable.setShape(0);
                    gradientDrawable.setGradientType(0);
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                    textView.setBackground(gradientDrawable);
                }
                String id = musicChartRankStruct.getId();
                int rank = musicChartRankStruct.getRank();
                C188727au c188727au = new C188727au();
                if (id == null) {
                    id = "";
                }
                c188727au.LJIIIZ("chart_id", id);
                if (str2 == null) {
                    str2 = "";
                }
                c188727au.LJIIIZ("group_id", str2);
                if (str == null) {
                    str = "";
                }
                c188727au.LJIIIZ("music_id", str);
                c188727au.LIZLLL(rank, "order");
                c188727au.LJIIIZ("page", "single_song");
                FMX.LJIIL("show_music_list_entrance", c188727au.LIZ);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    @Override // X.OHA
    public final void LIZJ(int i) {
        int i2;
        TextView textView = this.LIZJ;
        if (textView != null) {
            MusicDetailNavBarAssem musicDetailNavBarAssem = this.LIZLLL;
            int LIZIZ = C7MY.LIZIZ(40);
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(100));
            musicDetailNavBarAssem.getClass();
            textView.setAlpha(1.0f - MusicDetailNavBarAssem.M3(LIZIZ, LJJIIZ, i));
        }
        TextView textView2 = this.LIZJ;
        if (textView2 == null) {
            return;
        }
        if (o.LIZJ(Float.valueOf(textView2.getAlpha()), 0.0f)) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        textView2.setVisibility(i2);
    }

    public OH7(MusicDetailNavBarAssem musicDetailNavBarAssem, MusicDetail musicDetail, ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(musicDetail, "musicDetail");
        this.LIZLLL = musicDetailNavBarAssem;
        this.LIZ = musicDetail;
        this.LIZIZ = new OQN();
    }
}
