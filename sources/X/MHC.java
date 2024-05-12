package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MHC extends AbstractC225718tT {
    public static final MHM Companion = new MHM();
    public final MGV LJLIL;
    public final String LJLILLLLZI;
    public boolean LJLJI;

    @Override // X.AbstractC225718tT, X.MGV
    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
        C220408ku.LIZ(this, str);
    }

    public MHC(MGV singleDelegate, String str) {
        o.LJIIIZ(singleDelegate, "singleDelegate");
        this.LJLIL = singleDelegate;
        this.LJLILLLLZI = str;
        this.LJLJI = true;
    }

    @Override // X.AbstractC225718tT
    public int getDetailAwemeViewType(int i, Aweme aweme) {
        List<String> behindTheSongMusicIds;
        if (aweme instanceof MHK) {
            return 110001;
        }
        if (aweme != null && aweme.getBehindTheSongMusicIds() != null && i == 0 && (behindTheSongMusicIds = aweme.getBehindTheSongMusicIds()) != null) {
            String str = this.LJLILLLLZI;
            if (str == null) {
                str = "";
            }
            if (behindTheSongMusicIds.contains(str)) {
                aweme.setIsBehindTheSongVideoType(Boolean.TRUE);
                return 110003;
            }
        }
        return super.getDetailAwemeViewType(i, aweme);
    }

    @Override // X.AbstractC225718tT, X.MGV
    public MGX getJumpToVideoParam(MGX mgx, Aweme aweme) {
        MGX jumpToVideoParam = this.LJLIL.getJumpToVideoParam(mgx, aweme);
        o.LJIIIIZZ(jumpToVideoParam, "singleDelegate.getJumpToVideoParam(param, aweme)");
        return jumpToVideoParam;
    }

    @Override // X.AbstractC225718tT, X.MGV
    public C51031K1b<? extends AbstractC51036K1g<?, ?>> getPresenter(int i, ActivityC45651qj activityC45651qj) {
        C51031K1b<? extends AbstractC51036K1g<?, ?>> presenter = this.LJLIL.getPresenter(i, activityC45651qj);
        o.LJIIIIZZ(presenter, "singleDelegate.getPresenter(type, activity)");
        return presenter;
    }

    @Override // X.AbstractC225718tT, X.MGV
    public boolean sendCustomRequest(C51031K1b<? extends AbstractC51036K1g<?, ?>> c51031K1b, int i) {
        return this.LJLIL.sendCustomRequest(c51031K1b, i);
    }

    @Override // X.AbstractC225718tT
    public AbstractC208678Gx onCreateDetailAwemeViewHolder(ViewGroup parent, int i, String str, MH9 mh9) {
        View LIZ;
        o.LJIIIZ(parent, "parent");
        if (i != 110001) {
            if (i != 110003) {
                Context context = parent.getContext();
                o.LJIIIIZZ(context, "parent.context");
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                if (this.LJLJI) {
                    int LIZIZ = C39057FUn.LIZIZ(LJIJJ, "Music_detail_base_item_detail_aweme");
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("type", "tool_performance_music_detail_pre_load_item_view_count");
                    c188727au.LIZLLL(0, "totaltime");
                    c188727au.LIZLLL(LIZIZ, "totalstep");
                    FMX.LJIIL("tool_performance_operation_cost_time", c188727au.LIZ);
                    this.LJLJI = false;
                }
                if (FV9.LIZJ && LJIJJ != null) {
                    LIZ = C39057FUn.LIZJ(LJIJJ, "Music_detail_base_item_detail_aweme", new AqS159S0100000_9(parent, 818));
                } else {
                    LIZ = C28289B8j.LIZ(parent, R.layout.ako, parent, false);
                }
                C220538l7 onCreateDetailAwemeViewHolder = this.LJLIL.onCreateDetailAwemeViewHolder(LIZ, str, mh9);
                o.LJIIIIZZ(onCreateDetailAwemeViewHolder, "parent: ViewGroup,\n     …          )\n            }");
                return onCreateDetailAwemeViewHolder;
            }
            return new C208668Gw(C1FL.LIZIZ(parent, R.layout.bus, parent, false, "from(parent.context)\n   …_the_song, parent, false)"), str, mh9);
        }
        return new MHF(C1FL.LIZIZ(parent, R.layout.bur, parent, false, "from(parent.context)\n   …red_video, parent, false)"), str, mh9);
    }
}
