package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.LoA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55366LoA extends FrameLayout {
    public C55369LoD LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C56448MDk getVideoSeekBar() {
        return (C56448MDk) LIZ(R.id.n7r);
    }

    public final C55369LoD getVideoSeekBarController() {
        return this.LJLIL;
    }

    public C55366LoA(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        o.LJI(LJIJJ);
        C16970lZ.LIZJ(R.layout.aly, LJIJJ, this, true);
    }

    public final void setLiveMode(boolean z) {
        if (z) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    public static final C55366LoA LIZIZ(ViewGroup rootView, BaseListFragmentPanel baseListFragmentPanel, VideoSeekBarMaskView maskView) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(baseListFragmentPanel, "baseListFragmentPanel");
        o.LJIIIZ(maskView, "maskView");
        Context context = rootView.getContext();
        o.LJIIIIZZ(context, "rootView.context");
        C55366LoA c55366LoA = new C55366LoA(context);
        Activity activity = baseListFragmentPanel.activity;
        ScrollSwitchStateManager scrollSwitchStateManager = null;
        if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null) {
            scrollSwitchStateManager = C84193Sd.LIZ(activityC45651qj);
        }
        C56448MDk video_seek_bar = (C56448MDk) c55366LoA.LIZ(R.id.n7r);
        o.LJIIIIZZ(video_seek_bar, "video_seek_bar");
        ViewGroup video_seek_duration = (ViewGroup) c55366LoA.LIZ(R.id.n7s);
        o.LJIIIIZZ(video_seek_duration, "video_seek_duration");
        C71898SJq video_seek_duration_mask = (C71898SJq) c55366LoA.LIZ(R.id.n7t);
        o.LJIIIIZZ(video_seek_duration_mask, "video_seek_duration_mask");
        C5EL video_seek_thum = (C5EL) c55366LoA.LIZ(R.id.n7v);
        o.LJIIIIZZ(video_seek_thum, "video_seek_thum");
        c55366LoA.LJLIL = new C55369LoD(new C55390LoY(video_seek_bar, video_seek_duration, video_seek_duration_mask, video_seek_thum, scrollSwitchStateManager, baseListFragmentPanel, maskView));
        if (!baseListFragmentPanel.shouldShowSeekBar()) {
            c55366LoA.setVisibility(8);
        } else {
            C80796VnM viewPager = baseListFragmentPanel.getViewPager();
            if (viewPager != null) {
                viewPager.LJI(new C55367LoB(c55366LoA));
            }
        }
        rootView.addView(c55366LoA);
        return c55366LoA;
    }
}
