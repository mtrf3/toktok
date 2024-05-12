package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C145995oB;
import X.C16880lQ;
import X.C2055284u;
import X.C62822Ol8;
import X.C78857UxB;
import X.EnumC35460Dvs;
import X.FMX;
import X.JIN;
import X.X1D;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.Au2S16S0200000_8;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PodcastBottomBarAssem extends BaseCellSlotComponent<PodcastBottomBarAssem> {
    public ConstraintLayout LLFII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aa4;
    }

    public PodcastBottomBarAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLFII = (ConstraintLayout) Y3().findViewById(R.id.d6r);
        boolean LJJJJLI = C78857UxB.LJJJJLI(item);
        ConstraintLayout constraintLayout = this.LLFII;
        if (constraintLayout != null) {
            if (LJJJJLI) {
                View findViewById = constraintLayout.findViewById(R.id.m01);
                o.LJIIIIZZ(findViewById, "it.findViewById(R.id.tv_audio_mode_hint)");
                TextView textView = (TextView) findViewById;
                C62822Ol8 c62822Ol8 = JIN.LIZ;
                if (((Number) c62822Ol8.getValue()).intValue() == EnumC35460Dvs.BANNER_V2.getValue()) {
                    textView.setText(R.string.oym);
                } else if (((Number) c62822Ol8.getValue()).intValue() == EnumC35460Dvs.BANNER_V3.getValue()) {
                    textView.setText(R.string.oyn);
                } else {
                    textView.setText(R.string.oyl);
                }
                int i = 0;
                constraintLayout.setVisibility(0);
                C16880lQ.LJIIJ(new Au2S16S0200000_8(item, this, 1), Y3());
                Aweme aweme = item.getAweme();
                if (aweme != null) {
                    String str2 = item.mEventType;
                    o.LJIIIIZZ(str2, "item.eventType");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str2);
                    LIZ.append(aweme.getGroupId());
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    if (!Keva.getRepo("FullEpisodeMob").getBoolean(LIZIZ, false)) {
                        Keva.getRepo("FullEpisodeMob").storeBoolean(LIZIZ, true);
                        C145995oB c145995oB = new C145995oB();
                        c145995oB.LJI("enter_from", str2);
                        c145995oB.LJI("entrance_type", "bottom_banner");
                        Video video = aweme.getVideo();
                        if (video != null) {
                            i = video.getDuration() / 1000;
                        }
                        c145995oB.LIZ(i, "item_duration");
                        User author = aweme.getAuthor();
                        if (author != null) {
                            str = author.getUid();
                        } else {
                            str = null;
                        }
                        String str3 = "";
                        if (str == null) {
                            str = "";
                        }
                        c145995oB.LJI("author_id", str);
                        String groupId = aweme.getGroupId();
                        if (groupId != null) {
                            str3 = groupId;
                        }
                        c145995oB.LJI("group_id", str3);
                        FMX.LJIIL("podcast_entrance_show", c145995oB.LIZ);
                        return;
                    }
                    return;
                }
                return;
            }
            constraintLayout.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C2055284u.LIZJ((TuxTextView) view.findViewById(R.id.m01), null);
    }
}
