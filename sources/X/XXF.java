package X;

import Y.ACListenerS24S0101000_5;
import Y.ACListenerS28S0101000_10;
import Y.ACListenerS32S0101000_15;
import Y.ALAdapterS6S0110000_15;
import Y.AUListenerS102S0100000_15;
import Y.IDRunnableS0S0201000;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public abstract class XXF extends RecyclerView.ViewHolder {
    public static int LLFF;
    public final SmartImageView LJLIL;
    public final ImageView LJLILLLLZI;
    public final TuxIconView LJLJI;
    public final TextView LJLJJI;
    public final TextView LJLJJL;
    public final T5P LJLJJLL;
    public final ImageView LJLJL;
    public final ViewGroup LJLJLJ;
    public final ImageView LJLJLLL;
    public final ViewGroup LJLL;
    public final ViewGroup LJLLI;
    public final ViewGroup LJLLILLLL;
    public final ViewGroup LJLLJ;
    public final View LJLLL;
    public final TextView LJLLLL;
    public boolean LJLLLLLL;
    public final Context LJLZ;
    public MusicModel LJZ;
    public int LJZI;
    public int LJZL;
    public boolean LL;
    public G88 LLD;
    public InterfaceC85019XYh<XYN> LLF;

    public final void M() {
        if (this.LJZ.getCollectionType() != null) {
            this.LJLLLLLL = MusicModel.CollectionType.COLLECTED.equals(this.LJZ.getCollectionType());
        }
        X();
    }

    public final void P() {
        String str;
        MusicModel musicModel = this.LJZ;
        if (musicModel == null) {
            return;
        }
        if (!this.LJLLLLLL && !SS0.LIZIZ(musicModel, this.LJLZ, true)) {
            return;
        }
        InterfaceC85019XYh<XYN> interfaceC85019XYh = this.LLF;
        if (interfaceC85019XYh != null) {
            MusicModel musicModel2 = this.LJZ;
            if (this.LJLLLLLL) {
                str = "unfollow_type";
            } else {
                str = "follow_type";
            }
            interfaceC85019XYh.onInternalEvent(new XYN(str, this.LJZI, this.LJZL, musicModel2));
        }
        this.LJLLLLLL = !this.LJLLLLLL;
        this.LJLJJLL.LIZIZ();
    }

    public final void X() {
        int i;
        C2068389v c2068389v = new C2068389v();
        if (this.LJLLLLLL) {
            i = R.raw.icon_3pt_bookmark_fill;
        } else {
            i = R.raw.icon_3pt_bookmark;
        }
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        this.LJLJJLL.setImageDrawable(c2068389v.LIZ(this.LJLZ));
    }

    public final void N(boolean z) {
        this.LJLJI.clearAnimation();
        if (z) {
            MusicModel musicModel = this.LJZ;
            if (musicModel != null) {
                if (musicModel.isLocalMusic()) {
                    this.LJLJI.setIconRes(R.raw.icon_color_pause);
                    return;
                } else {
                    if (this.LJZ.getMusicType() != MusicModel.MusicType.ONLINE) {
                        return;
                    }
                    this.LJLJI.setVisibility(0);
                    this.LJLJI.setIconRes(R.raw.icon_color_pause);
                    return;
                }
            }
            return;
        }
        this.LJLJI.setVisibility(0);
        this.LJLJI.setIconRes(R.raw.icon_color_play);
    }

    public final void Q(boolean z) {
        if (this.LJLJLJ.getVisibility() == 8) {
            return;
        }
        if (z) {
            this.LJLLI.setClickable(false);
            int i = -LLFF;
            int LIZJ = (int) KL2.LIZJ(this.LJLZ, 30.0f);
            if (C90193gN.LIZIZ(this.LJLZ)) {
                LIZJ = -LIZJ;
            }
            T(0L, 1, 0, 0, i, true, 0, LIZJ);
            return;
        }
        this.LJLJLJ.setVisibility(8);
    }

    public final void V(boolean z) {
        if (this.LJLJLJ.getVisibility() == 0) {
            return;
        }
        if (z) {
            this.LJLLI.setClickable(false);
            int i = -LLFF;
            int LIZJ = (int) KL2.LIZJ(this.LJLZ, 30.0f);
            if (C90193gN.LIZIZ(this.LJLZ)) {
                LIZJ = -LIZJ;
            }
            this.LJLJLJ.setVisibility(0);
            if (C90193gN.LIZIZ(this.LJLZ)) {
                ((ViewGroup.MarginLayoutParams) this.LJLL.getLayoutParams()).leftMargin = -LLFF;
            } else {
                ((ViewGroup.MarginLayoutParams) this.LJLL.getLayoutParams()).rightMargin = -LLFF;
            }
            T(100L, 0, 1, i, 0, false, LIZJ, 0);
            return;
        }
        this.LJLJLJ.setVisibility(0);
    }

    public final void onClick(View view) {
        G88 g88 = this.LLD;
        if (g88 != null && (this instanceof C85022XYk)) {
            g88.LIZIZ((C85022XYk) this, view, this.LJZ);
        }
    }

    public XXF(View view, int i) {
        super(view);
        Context context = view.getContext();
        this.LJLZ = context;
        this.LJLIL = (SmartImageView) view.findViewById(R.id.f12);
        view.findViewById(R.id.f86);
        this.LJLILLLLZI = (ImageView) view.findViewById(R.id.f7a);
        this.LJLJI = (TuxIconView) view.findViewById(R.id.fae);
        this.LJLJJI = (TextView) view.findViewById(R.id.mby);
        this.LJLJJL = (TextView) view.findViewById(R.id.mkc);
        T5P t5p = (T5P) view.findViewById(R.id.f75);
        this.LJLJJLL = t5p;
        this.LJLJL = (ImageView) view.findViewById(R.id.f79);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.g6y);
        this.LJLJLJ = viewGroup;
        ImageView imageView = (ImageView) view.findViewById(R.id.fcb);
        this.LJLJLLL = imageView;
        view.findViewById(R.id.mpw);
        this.LJLL = (ViewGroup) view.findViewById(R.id.j63);
        this.LJLLI = (ViewGroup) view.findViewById(R.id.g4i);
        this.LJLLILLLL = (ViewGroup) view.findViewById(R.id.j4l);
        this.LJLLJ = (ViewGroup) view.findViewById(R.id.g6n);
        this.LJLLL = view.findViewById(R.id.ngk);
        this.LJLLLL = (TextView) view.findViewById(R.id.mbl);
        view.findViewById(R.id.gu6);
        View findViewById = view.findViewById(R.id.f79);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS32S0101000_15(3, this, 11), findViewById);
        }
        View findViewById2 = view.findViewById(R.id.f75);
        if (findViewById2 != null) {
            C16880lQ.LJIIJ(new ACListenerS32S0101000_15(1, this, 5), findViewById2);
        }
        View findViewById3 = view.findViewById(R.id.g6y);
        if (findViewById3 != null) {
            C16880lQ.LJIIJ(new ACListenerS24S0101000_5(2, this, 17), findViewById3);
        }
        View findViewById4 = view.findViewById(R.id.g4i);
        if (findViewById4 != null) {
            C16880lQ.LJIIJ(new ACListenerS28S0101000_10(2, this, 6), findViewById4);
        }
        imageView.setColorFilter(C79045V0n.LJI(R.attr.dj, context).intValue(), PorterDuff.Mode.SRC_IN);
        C85022XYk c85022XYk = (C85022XYk) this;
        c85022XYk.LJLJLLL.setVisibility(0);
        if (LLFF <= 0) {
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(536870911, LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(536870911, LiveLayoutPreloadThreadPriority.DEFAULT));
            LLFF = (int) (KL2.LIZJ(context, 8.0f) + viewGroup.getMeasuredWidth());
        }
        t5p.setOnStateChangeListener(new C84993XXh(c85022XYk));
    }

    public final void U(boolean z, boolean z2) {
        if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.fc);
            loadAnimation.setInterpolator(new LinearInterpolator());
            this.LJLJI.setIconRes(R.raw.icon_spinner_normal);
            this.LJLJI.setTintColorRes(R.attr.dj);
            this.LJLJI.startAnimation(loadAnimation);
            return;
        }
        this.LJLJI.clearAnimation();
        N(z2);
        if (!z2) {
            Q(true);
        } else {
            V(true);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x00a1. Please report as an issue. */
    public final void L(MusicModel musicModel, boolean z, boolean z2, int i, int i2) {
        String str;
        String singer;
        int i3;
        if (musicModel == null) {
            return;
        }
        this.LL = z;
        this.LJZL = i2;
        this.LJZI = i;
        this.LJZ = musicModel;
        M();
        if (!TextUtils.isEmpty(this.LJZ.getName())) {
            this.LJLJJI.setText(this.LJZ.getName());
        } else {
            this.LJLJJI.setTextColor(C79045V0n.LJI(R.attr.go, this.LJLZ).intValue());
            TextView textView = this.LJLJJI;
            if (!TextUtils.isEmpty(this.LJZ.getName())) {
                str = this.LJZ.getName();
            } else {
                str = "";
            }
            textView.setText(str);
        }
        C72114SRy.LIZ(this.LJLJJI, this.LJZ.getMusic());
        if (this.LJZ.getMatchedPGCSoundInfo() != null && !TextUtils.isEmpty(this.LJZ.getMatchedPGCSoundInfo().getMixedAuthor())) {
            this.LJLJJL.setText(this.LJZ.getMatchedPGCSoundInfo().getMixedAuthor());
        } else {
            TextView textView2 = this.LJLJJL;
            if (TextUtils.isEmpty(this.LJZ.getSinger())) {
                singer = this.LJLZ.getString(R.string.tel);
            } else {
                singer = this.LJZ.getSinger();
            }
            textView2.setText(singer);
        }
        SmartImageView smartImageView = this.LJLIL;
        smartImageView.post(new IDRunnableS0S0201000(1, this.LJZ, smartImageView, 11));
        this.LJLLLL.setText(C78929UyL.LJIIIZ(this.LJZ.getPresenterDuration()));
        N(z2);
        if (z2) {
            V(false);
        } else {
            Q(false);
        }
        if (musicModel.isLocalMusic()) {
            this.LJLJJLL.setVisibility(8);
            this.LJLJL.setVisibility(8);
        } else {
            this.LJLJJLL.setVisibility(0);
            this.LJLJL.setVisibility(8);
        }
        if (this.LL && this.LJZL < 12) {
            this.LJLILLLLZI.setVisibility(0);
            switch (this.LJZL) {
                case 0:
                    i3 = R.drawable.bks;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLILLLLZI.getLayoutParams();
                    int LIZJ = (int) KL2.LIZJ(this.LJLILLLLZI.getContext(), 0.0f);
                    marginLayoutParams.topMargin = LIZJ;
                    marginLayoutParams.leftMargin = LIZJ;
                    this.LJLILLLLZI.setImageResource(i3);
                    return;
                case 1:
                    i3 = R.drawable.bkw;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.LJLILLLLZI.getLayoutParams();
                    int LIZJ2 = (int) KL2.LIZJ(this.LJLILLLLZI.getContext(), 0.0f);
                    marginLayoutParams2.topMargin = LIZJ2;
                    marginLayoutParams2.leftMargin = LIZJ2;
                    this.LJLILLLLZI.setImageResource(i3);
                    return;
                case 2:
                    i3 = R.drawable.bkx;
                    ViewGroup.MarginLayoutParams marginLayoutParams22 = (ViewGroup.MarginLayoutParams) this.LJLILLLLZI.getLayoutParams();
                    int LIZJ22 = (int) KL2.LIZJ(this.LJLILLLLZI.getContext(), 0.0f);
                    marginLayoutParams22.topMargin = LIZJ22;
                    marginLayoutParams22.leftMargin = LIZJ22;
                    this.LJLILLLLZI.setImageResource(i3);
                    return;
                case 3:
                    i3 = R.drawable.bky;
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.LJLILLLLZI.getLayoutParams();
                    int LIZJ3 = (int) KL2.LIZJ(this.LJLILLLLZI.getContext(), 2.0f);
                    marginLayoutParams3.topMargin = LIZJ3;
                    marginLayoutParams3.leftMargin = LIZJ3;
                    this.LJLILLLLZI.setImageResource(i3);
                    return;
                case 4:
                    i3 = R.drawable.bkz;
                    ViewGroup.MarginLayoutParams marginLayoutParams32 = (ViewGroup.MarginLayoutParams) this.LJLILLLLZI.getLayoutParams();
                    int LIZJ32 = (int) KL2.LIZJ(this.LJLILLLLZI.getContext(), 2.0f);
                    marginLayoutParams32.topMargin = LIZJ32;
                    marginLayoutParams32.leftMargin = LIZJ32;
                    this.LJLILLLLZI.setImageResource(i3);
                    return;
                case 5:
                    i3 = R.drawable.bl0;
                    ViewGroup.MarginLayoutParams marginLayoutParams322 = (ViewGroup.MarginLayoutParams) this.LJLILLLLZI.getLayoutParams();
                    int LIZJ322 = (int) KL2.LIZJ(this.LJLILLLLZI.getContext(), 2.0f);
                    marginLayoutParams322.topMargin = LIZJ322;
                    marginLayoutParams322.leftMargin = LIZJ322;
                    this.LJLILLLLZI.setImageResource(i3);
                    return;
                case 6:
                    i3 = R.drawable.bl1;
                    ViewGroup.MarginLayoutParams marginLayoutParams3222 = (ViewGroup.MarginLayoutParams) this.LJLILLLLZI.getLayoutParams();
                    int LIZJ3222 = (int) KL2.LIZJ(this.LJLILLLLZI.getContext(), 2.0f);
                    marginLayoutParams3222.topMargin = LIZJ3222;
                    marginLayoutParams3222.leftMargin = LIZJ3222;
                    this.LJLILLLLZI.setImageResource(i3);
                    return;
                case 7:
                    i3 = R.drawable.bl2;
                    ViewGroup.MarginLayoutParams marginLayoutParams32222 = (ViewGroup.MarginLayoutParams) this.LJLILLLLZI.getLayoutParams();
                    int LIZJ32222 = (int) KL2.LIZJ(this.LJLILLLLZI.getContext(), 2.0f);
                    marginLayoutParams32222.topMargin = LIZJ32222;
                    marginLayoutParams32222.leftMargin = LIZJ32222;
                    this.LJLILLLLZI.setImageResource(i3);
                    return;
                case 8:
                    i3 = R.drawable.bl3;
                    ViewGroup.MarginLayoutParams marginLayoutParams322222 = (ViewGroup.MarginLayoutParams) this.LJLILLLLZI.getLayoutParams();
                    int LIZJ322222 = (int) KL2.LIZJ(this.LJLILLLLZI.getContext(), 2.0f);
                    marginLayoutParams322222.topMargin = LIZJ322222;
                    marginLayoutParams322222.leftMargin = LIZJ322222;
                    this.LJLILLLLZI.setImageResource(i3);
                    return;
                case 9:
                    i3 = R.drawable.bkt;
                    ViewGroup.MarginLayoutParams marginLayoutParams3222222 = (ViewGroup.MarginLayoutParams) this.LJLILLLLZI.getLayoutParams();
                    int LIZJ3222222 = (int) KL2.LIZJ(this.LJLILLLLZI.getContext(), 2.0f);
                    marginLayoutParams3222222.topMargin = LIZJ3222222;
                    marginLayoutParams3222222.leftMargin = LIZJ3222222;
                    this.LJLILLLLZI.setImageResource(i3);
                    return;
                case 10:
                    i3 = R.drawable.bku;
                    ViewGroup.MarginLayoutParams marginLayoutParams32222222 = (ViewGroup.MarginLayoutParams) this.LJLILLLLZI.getLayoutParams();
                    int LIZJ32222222 = (int) KL2.LIZJ(this.LJLILLLLZI.getContext(), 2.0f);
                    marginLayoutParams32222222.topMargin = LIZJ32222222;
                    marginLayoutParams32222222.leftMargin = LIZJ32222222;
                    this.LJLILLLLZI.setImageResource(i3);
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    i3 = R.drawable.bkv;
                    ViewGroup.MarginLayoutParams marginLayoutParams322222222 = (ViewGroup.MarginLayoutParams) this.LJLILLLLZI.getLayoutParams();
                    int LIZJ322222222 = (int) KL2.LIZJ(this.LJLILLLLZI.getContext(), 2.0f);
                    marginLayoutParams322222222.topMargin = LIZJ322222222;
                    marginLayoutParams322222222.leftMargin = LIZJ322222222;
                    this.LJLILLLLZI.setImageResource(i3);
                    return;
                default:
                    return;
            }
        }
        this.LJLILLLLZI.setVisibility(8);
    }

    public final void T(long j, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        ValueAnimator duration = ValueAnimator.ofInt(i3, i4).setDuration(200);
        duration.addUpdateListener(new AUListenerS102S0100000_15(this, 27));
        duration.addListener(new ALAdapterS6S0110000_15(this, z, 1));
        AlphaAnimation alphaAnimation = new AlphaAnimation(i, i2);
        TranslateAnimation translateAnimation = new TranslateAnimation(i5, i6, 0.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setFillAfter(true);
        animationSet.setDuration(100);
        animationSet.setStartOffset(j);
        this.LJLJLJ.startAnimation(animationSet);
        duration.start();
    }
}
