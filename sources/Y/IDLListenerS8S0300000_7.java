package Y;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C41315GJj;
import X.C41641GVx;
import X.C78685UuP;
import X.G5S;
import X.GQ5;
import X.ViewOnClickListenerC40943G5b;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.utils.KeyBoardMonitor;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDLListenerS8S0300000_7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS8S0300000_7 iDLListenerS8S0300000_7) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) iDLListenerS8S0300000_7.l0;
        View view = (View) iDLListenerS8S0300000_7.l1;
        RelativeLayout relativeLayout = (RelativeLayout) iDLListenerS8S0300000_7.l2;
        videoPublishContainerScene.getClass();
        View findViewById = view.findViewById(R.id.flj);
        ActivityC45651qj LLII = videoPublishContainerScene.LLII();
        if (LLII == null) {
            return;
        }
        if (findViewById == null) {
            View inflate = View.inflate(LLII, R.layout.blq, null);
            relativeLayout.addView(inflate, relativeLayout.getWidth(), relativeLayout.getHeight());
            inflate.setAlpha(0.196f);
            View findViewById2 = view.findViewById(R.id.wc);
            findViewById2.setAlpha(0.196f);
            C16880lQ.LJIIJ(new ACListenerS53S0000000_7(1), inflate);
            C16880lQ.LJIIJ(new ViewOnClickListenerC40943G5b(1), findViewById2);
            C41315GJj.LIZ(inflate);
            GQ5 gq5 = videoPublishContainerScene.LLIIIJ;
            G5S g5s = new G5S(videoPublishContainerScene, inflate, findViewById2);
            gq5.getClass();
            new KeyBoardMonitor(gq5.LIZ.getLifeCycleOwner()).LIZ(gq5.LIZIZ, g5s);
            return;
        }
        if (findViewById.getHeight() >= relativeLayout.getHeight()) {
            return;
        }
        findViewById.getLayoutParams().height = relativeLayout.getHeight();
    }

    public static final void onGlobalLayout$1(IDLListenerS8S0300000_7 iDLListenerS8S0300000_7) {
        ViewGroup viewGroup;
        ((RelativeLayout) iDLListenerS8S0300000_7.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS8S0300000_7);
        C41641GVx c41641GVx = (C41641GVx) iDLListenerS8S0300000_7.l1;
        if (c41641GVx.LJLLLLLL) {
            View findViewById = c41641GVx.LJLJJI.findViewById(R.id.lbm);
            int height = findViewById.getHeight();
            ImageView imageView = ((C41641GVx) iDLListenerS8S0300000_7.l1).LJLJL;
            o.LJI(imageView);
            if (height <= imageView.getHeight()) {
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(15);
                findViewById.setLayoutParams(layoutParams2);
            }
            if (C78685UuP.LJJJZ(((C41641GVx) iDLListenerS8S0300000_7.l1).LJLJJLL.publishFailedString)) {
                ((View) iDLListenerS8S0300000_7.l2).findViewById(R.id.l17).setVisibility(8);
                return;
            }
            RelativeLayout relativeLayout = new RelativeLayout(((C41641GVx) iDLListenerS8S0300000_7.l1).LJLIL);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(findViewById.getWidth(), ((C41641GVx) iDLListenerS8S0300000_7.l1).LJLJJI.getHeight());
            ImageView imageView2 = ((C41641GVx) iDLListenerS8S0300000_7.l1).LJLJL;
            if (imageView2 != null) {
                layoutParams3.addRule(21, imageView2.getId());
                relativeLayout.setLayoutParams(layoutParams3);
                View view = ((C41641GVx) iDLListenerS8S0300000_7.l1).LJLJJI;
                if ((view instanceof RelativeLayout) && (viewGroup = (ViewGroup) view) != null) {
                    viewGroup.addView(relativeLayout, layoutParams3);
                }
                C16880lQ.LJIJ(relativeLayout, new ACListenerS27S0100000_7((C41641GVx) iDLListenerS8S0300000_7.l1, 160));
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public IDLListenerS8S0300000_7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
