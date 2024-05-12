package X;

import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.zhiliaoapp.musically.R;

/* renamed from: X.7vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201657vl {
    public final C200847uS LIZ;
    public ViewStub LIZIZ;
    public View LIZJ;

    public C201657vl(C200847uS c200847uS) {
        ViewStub viewStub;
        this.LIZ = c200847uS;
        ViewGroup viewGroup = c200847uS.LIZLLL;
        if (viewGroup != null) {
            viewStub = (ViewStub) viewGroup.findViewById(R.id.nfq);
        } else {
            viewStub = null;
        }
        this.LIZIZ = viewStub;
        boolean LJIIJJI = C220858ld.LJIIJJI(c200847uS.LIZJ);
        Aweme aweme = c200847uS.LIZJ;
        LIZIZ(LJIIJJI, aweme != null ? aweme.getReportMaskInfo() : null);
    }

    public final void LIZ(String str) {
        String str2;
        String str3;
        C188727au c188727au = new C188727au();
        PostModeDetailParams postModeDetailParams = this.LIZ.LJI;
        String str4 = null;
        if (postModeDetailParams != null) {
            str2 = postModeDetailParams.eventType;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("enter_from", str2);
        Aweme aweme = this.LIZ.LIZJ;
        if (aweme != null) {
            str3 = aweme.getAid();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("group_id", str3);
        Aweme aweme2 = this.LIZ.LIZJ;
        if (aweme2 != null) {
            str4 = aweme2.getAuthorUid();
        }
        c188727au.LJIIIZ("author_id", str4);
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public final void LIZIZ(boolean z, VideoMaskInfo videoMaskInfo) {
        Context LIZIZ;
        TextView textView;
        String string;
        TextView textView2;
        String string2;
        TextView textView3;
        String string3;
        ViewGroup viewGroup = this.LIZ.LIZLLL;
        View view = null;
        if (viewGroup == null || (LIZIZ = viewGroup.getContext()) == null) {
            LIZIZ = EF7.LIZIZ();
        }
        if (z) {
            if (this.LIZJ == null) {
                ViewStub viewStub = this.LIZIZ;
                if (viewStub != null) {
                    view = viewStub.inflate();
                }
                this.LIZJ = view;
            }
            View view2 = this.LIZJ;
            if (view2 != null && (textView3 = (TextView) view2.findViewById(R.id.title)) != null) {
                if (videoMaskInfo == null || (string3 = videoMaskInfo.getTitle()) == null) {
                    string3 = LIZIZ.getString(R.string.q2i);
                }
                textView3.setText(string3);
            }
            View view3 = this.LIZJ;
            if (view3 != null && (textView2 = (TextView) view3.findViewById(R.id.bst)) != null) {
                if (videoMaskInfo == null || (string2 = videoMaskInfo.getContent()) == null) {
                    string2 = LIZIZ.getString(R.string.q2g);
                }
                textView2.setText(string2);
            }
            View view4 = this.LIZJ;
            if (view4 != null && (textView = (TextView) view4.findViewById(R.id.b1h)) != null) {
                if (videoMaskInfo == null || (string = videoMaskInfo.getCancelMaskLabel()) == null) {
                    string = LIZIZ.getString(R.string.q2h);
                }
                textView.setText(string);
                C16880lQ.LJIJI(textView, new ACListenerS38S0200000_3(this, LIZIZ, 59));
            }
            LIZ("reportlayer_show");
            return;
        }
        View view5 = this.LIZJ;
        if (view5 == null) {
            return;
        }
        view5.setVisibility(8);
    }
}
