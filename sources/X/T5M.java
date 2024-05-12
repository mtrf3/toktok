package X;

import Y.ACListenerS46S0200000_12;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.christmas.FestivalEntity;
import com.ss.android.ugc.aweme.mvtemplate.model.MvDetailModel;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T5M implements InterfaceC74146T8c {
    public final Context LIZIZ;
    public TextView LIZJ;
    public C62846OlW LIZLLL;
    public TextView LJ;
    public View LJFF;
    public FrameLayout LJI;
    public SmartImageView LJII;
    public TuxTextView LJIIIIZZ;

    @Override // X.InterfaceC74146T8c
    public final C7W1 LIZIZ() {
        Context context = this.LIZIZ;
        return new C7W1(context, C16880lQ.LLZIL(context), R.string.ekc);
    }

    @Override // X.InterfaceC74146T8c
    public final void LIZ(View rootView) {
        o.LJIIIZ(rootView, "rootView");
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.e3y);
        if (viewGroup != null) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LIZIZ), R.layout.btl, viewGroup, true);
            this.LJIIIIZZ = (TuxTextView) LLLLIILL.findViewById(R.id.c9a);
            this.LJII = (SmartImageView) LLLLIILL.findViewById(R.id.p9);
            this.LJI = (FrameLayout) LLLLIILL.findViewById(R.id.p8);
            this.LIZJ = (TextView) LLLLIILL.findViewById(R.id.gni);
            this.LIZLLL = (C62846OlW) LLLLIILL.findViewById(R.id.gnf);
            this.LJ = (TextView) LLLLIILL.findViewById(R.id.gv6);
            this.LJFF = LLLLIILL.findViewById(R.id.l2d);
        }
    }

    @Override // X.InterfaceC74146T8c
    public final void LIZJ(MvDetailModel mvDetailModel) {
        View view;
        FestivalEntity LJI;
        List<String> list;
        String str;
        long j;
        MvModel mvModel = mvDetailModel.mvInfo;
        if (mvModel != null) {
            TextView textView = this.LIZJ;
            if (textView != null) {
                textView.setText(mvModel.getName());
            }
            TextView textView2 = this.LJ;
            if (textView2 != null) {
                StringBuilder LIZ = X1D.LIZ();
                Long userCount = mvModel.getUserCount();
                if (userCount != null) {
                    j = userCount.longValue();
                } else {
                    j = 0;
                }
                LIZ.append(C77123UOp.LJJIIJ(j));
                LIZ.append(' ');
                textView2.setText(X1D.LIZIZ(LIZ));
            }
            C78765Uvh.LJFF(this.LIZLLL, mvModel.getIconUrl());
        }
        Integer num = mvDetailModel.LIZ;
        if (num != null && num.intValue() == 2 && (view = this.LJFF) != null) {
            view.setVisibility(0);
        }
        if (R3A.LJII() && (LJI = R3A.LJI()) != null && LJI.mBannerDetail != null && (list = LJI.mvIds) != null) {
            MvModel mvModel2 = mvDetailModel.mvInfo;
            if (mvModel2 != null) {
                str = mvModel2.getMvId();
            } else {
                str = null;
            }
            if (list.contains(str)) {
                if (!TextUtils.isEmpty(LJI.detailPageInfo)) {
                    TuxTextView tuxTextView = this.LJIIIIZZ;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(0);
                    }
                    TuxTextView tuxTextView2 = this.LJIIIIZZ;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(LJI.detailPageInfo);
                    }
                    FrameLayout frameLayout = this.LJI;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(0);
                    }
                } else {
                    TuxTextView tuxTextView3 = this.LJIIIIZZ;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setVisibility(8);
                    }
                }
                FrameLayout frameLayout2 = this.LJI;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                SmartImageView smartImageView = this.LJII;
                if (smartImageView != null) {
                    smartImageView.setVisibility(0);
                }
                W5F LJIIIIZZ = W5U.LJIIIIZZ(LJI.mBannerDetail.bannerResource);
                LJIIIIZZ.LIZIZ("MovieDetailFragment");
                Context context = this.LIZIZ;
                S3I s3i = new S3I();
                s3i.LIZLLL = V2B.LJI(context, 2.0f);
                s3i.LIZIZ = V2B.LJI(context, 0.0f);
                LJIIIIZZ.LJIJJLI = new S3L(s3i);
                LJIIIIZZ.LJJIIJ = this.LJII;
                C16880lQ.LLJJJ(LJIIIIZZ);
                FrameLayout frameLayout3 = this.LJI;
                if (frameLayout3 != null) {
                    C16880lQ.LJIILJJIL(frameLayout3, new ACListenerS46S0200000_12(this, LJI, 70));
                }
            }
        }
    }

    public T5M(Context context, String str) {
        this.LIZIZ = context;
    }
}
