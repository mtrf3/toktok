package X;

import Y.AUListenerS93S0100000_4;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MKD extends AbstractC54946LhO implements Observer<C207668Da> {
    public FrameLayout LJLJJI;
    public C72434Sbm LJLJJL;
    public MKI LJLJJLL;
    public boolean LJLJL;
    public ValueAnimator LJLJLJ;
    public long LJLJLLL;

    @Override // X.AbstractC54946LhO
    public final String LIZIZ() {
        return "music_cover";
    }

    @Override // X.AbstractC54946LhO
    public final java.util.Map<String, String> LIZLLL() {
        String str;
        Music music;
        HashMap hashMap = new HashMap();
        Aweme aweme = this.LJLILLLLZI;
        if (aweme == null || (music = aweme.getMusic()) == null || (str = music.getMid()) == null) {
            str = "";
        }
        hashMap.put("music_id", str);
        return hashMap;
    }

    public final void LJI() {
        ValueAnimator valueAnimator;
        if (this.LJLJL) {
            this.LJLJL = false;
            if (this.LJLJJI != null && (valueAnimator = this.LJLJLJ) != null) {
                valueAnimator.end();
            }
            MKI mki = this.LJLJJLL;
            if (mki != null) {
                int childCount = mki.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View view = mki.getChildAt(i);
                    o.LJIIIIZZ(view, "view");
                    mki.LIZ(view);
                }
                Handler handler = mki.LJLLI;
                o.LJI(handler);
                handler.removeCallbacksAndMessages(null);
                Handler handler2 = mki.LJLLI;
                o.LJI(handler2);
                handler2.removeCallbacks(mki.LJLLILLLL);
            }
        }
    }

    @Override // X.AbstractC54946LhO
    public final void LJFF() {
        LJI();
    }

    public MKD(View view) {
        super(view);
    }

    @Override // X.AbstractC54946LhO
    public final void LIZ(LV8 lv8) {
        Music music;
        Music music2;
        super.LIZ(lv8);
        this.LJLJL = false;
        Aweme aweme = this.LJLILLLLZI;
        UrlModel urlModel = null;
        if (aweme == null || (music = aweme.getMusic()) == null || music.getCoverThumb() == null) {
            return;
        }
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 != null && (music2 = aweme2.getMusic()) != null) {
            urlModel = music2.getCoverThumb();
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        int LJIILL = C17N.LJIILL(28.0d);
        int LJIILL2 = C17N.LJIILL(28.0d);
        LJII.LJII = LJIILL;
        LJII.LJIIIIZZ = LJIILL2;
        LJII.LJJIJIIJIL = true;
        LJII.LIZIZ("MusicCoverWidget");
        LJII.LJJIIJ = this.LJLJJL;
        C16880lQ.LLJJJ(LJII);
    }

    @Override // X.AbstractC54946LhO
    public final void LIZJ(View view) {
        if (view instanceof FrameLayout) {
            ViewGroup viewGroup = (ViewGroup) view;
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bfn, C16880lQ.LLZIL(viewGroup.getContext()), null);
            this.LJLJJI = (FrameLayout) LLLZIIL.findViewById(R.id.grk);
            this.LJLJJL = (C72434Sbm) LLLZIIL.findViewById(R.id.grh);
            this.LJLJJLL = (MKI) LLLZIIL.findViewById(R.id.h3s);
            viewGroup.addView(LLLZIIL);
        }
    }

    @Override // X.AbstractC54946LhO
    public final void LJ(DataCenter dataCenter) {
        dataCenter.iv0("start_animation", this, false);
        dataCenter.iv0("pause_animation", this, false);
        dataCenter.iv0("stop_animation", this, false);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        ValueAnimator valueAnimator;
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 != null) {
            String str = c207668Da2.LIZ;
            int hashCode = str.hashCode();
            if (hashCode != -463583257) {
                if (hashCode != -301890681) {
                    if (hashCode != 64864379 || !str.equals("pause_animation") || !this.LJLJL) {
                        return;
                    }
                    this.LJLJL = false;
                    if (this.LJLJJI != null && (valueAnimator = this.LJLJLJ) != null) {
                        valueAnimator.end();
                    }
                    MKI mki = this.LJLJJLL;
                    if (mki == null) {
                        return;
                    }
                    Handler handler = mki.LJLLI;
                    o.LJI(handler);
                    handler.removeCallbacksAndMessages(null);
                    Handler handler2 = mki.LJLLI;
                    o.LJI(handler2);
                    handler2.removeCallbacks(mki.LJLLILLLL);
                    int childCount = mki.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View view = mki.getChildAt(i);
                        o.LJIIIIZZ(view, "view");
                        mki.LIZ(view);
                    }
                    return;
                }
                if (!str.equals("stop_animation")) {
                    return;
                }
                LJI();
                return;
            }
            if (!str.equals("start_animation") || this.LJLJL) {
                return;
            }
            this.LJLJL = true;
            if (this.LJLJJI != null) {
                ValueAnimator valueAnimator2 = this.LJLJLJ;
                if (valueAnimator2 != null) {
                    valueAnimator2.end();
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
                    ofFloat.setDuration(8000L);
                    ofFloat.setRepeatMode(1);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.setRepeatCount(-1);
                    ofFloat.addUpdateListener(new AUListenerS93S0100000_4(this, 12));
                    this.LJLJLJ = ofFloat;
                }
                ValueAnimator valueAnimator3 = this.LJLJLJ;
                if (valueAnimator3 != null) {
                    valueAnimator3.start();
                }
            }
            MKI mki2 = this.LJLJJLL;
            if (mki2 == null) {
                return;
            }
            FTB.LIZIZ(new MKE(mki2));
        }
    }
}
