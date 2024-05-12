package com.ss.android.ugc.aweme.detail.panel;

import X.C16880lQ;
import X.C188727au;
import X.C62846OlW;
import X.C78765Uvh;
import X.C81156VtA;
import X.FMX;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public class MovieFeedPanel extends ShootFeedPanel {
    public final MvModel LLJLIL;
    public final String LLJLILLLLZIIL;
    public final int LLJLL;
    public final int LLJLLIL;

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int LLIILII() {
        return R.string.tii;
    }

    public MovieFeedPanel(Bundle bundle) {
        this.LLJLIL = (MvModel) bundle.getSerializable("feed_data_movie_model");
        this.LLJLILLLLZIIL = bundle.getString("feed_data_movie_group_id", "");
        this.LLJLL = bundle.getInt("mv_type", 1);
        this.LLJLLIL = bundle.getInt("source_id", 1);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void LLIIL(View view) {
        if (this.activity != null && MSAdaptionService.LJIIL().LJI(this.activity)) {
            Activity activity = this.activity;
            C16880lQ.LLZILL(Toast.makeText(activity, activity.getString(R.string.f1i), 0));
            return;
        }
        IMovieReuseService LJ = MovieReuseServiceImpl.LJ();
        if (this.LLJLIL != null) {
            LJ.LIZIZ(getFragment(), this.LLJLIL.getMvId(), this.LLJLL, this.LLJLLIL, true);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_method", "mv_feed");
            c188727au.LJIIIZ("mv_id", this.LLJLIL.getMvId());
            c188727au.LJIIIZ("enter_from", "mv_page");
            c188727au.LJIIIZ("shoot_way", "mv_page");
            c188727au.LJIIIZ("content_type", "mv");
            c188727au.LJIIIZ("group_id", this.LLJLILLLLZIIL);
            FMX.LJIIL("shoot", c188727au.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View LLIILZL(RelativeLayout relativeLayout) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.alo, relativeLayout, false);
        if (this.LLJLIL != null) {
            C78765Uvh.LJFF((C62846OlW) LLLLIILL.findViewById(R.id.gng), this.LLJLIL.getIconUrl());
            LLIL((C81156VtA) LLLLIILL.findViewById(R.id.d81), this.LLJLIL.getName());
        }
        return LLLLIILL;
    }
}
