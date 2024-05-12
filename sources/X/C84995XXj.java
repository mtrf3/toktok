package X;

import Y.ACListenerS35S0100000_15;
import Y.ALAdapterS12S0100000_15;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XXj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84995XXj extends XYS {
    public static final /* synthetic */ int LLF = 0;
    public C62846OlW LJLILLLLZI;
    public C62846OlW LJLJI;
    public final TuxIconView LJLJJI;
    public final FrameLayout LJLJJL;
    public final TextView LJLJJLL;
    public final TextView LJLJL;
    public final T5P LJLJLJ;
    public final LinearLayout LJLJLLL;
    public final LinearLayout LJLL;
    public final LinearLayout LJLLI;
    public final LinearLayout LJLLILLLL;
    public final TextView LJLLJ;
    public C84998XXm LJLLL;
    public InterfaceC85021XYj LJLLLL;
    public InterfaceC85019XYh<XYN> LJLLLLLL;
    public List<MusicModel> LJLZ;
    public int LJZ;
    public ValueAnimator LJZI;
    public final Context LJZL;
    public boolean LL;
    public final Animation LLD;

    public final void Q() {
        SY9 LIZ;
        T5P t5p = this.LJLJLJ;
        if (t5p != null) {
            if (this.LL) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_2pt_bookmark_fill;
                Context context = this.LJZL;
                o.LJI(context);
                LIZ = c2068389v.LIZ(context);
            } else {
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_3pt_bookmark;
                Context context2 = this.LJZL;
                o.LJI(context2);
                LIZ = c2068389v2.LIZ(context2);
            }
            t5p.setImageDrawable(LIZ);
        }
    }

    public C84995XXj(View view) {
        super(view);
        this.LJZL = view.getContext();
        this.LJLILLLLZI = (C62846OlW) view.findViewById(R.id.f18);
        this.LJLJI = (C62846OlW) view.findViewById(R.id.f19);
        this.LJLJJI = (TuxIconView) view.findViewById(R.id.fae);
        this.LJLJJL = (FrameLayout) view.findViewById(R.id.j4l);
        this.LJLJL = (TextView) view.findViewById(R.id.mkc);
        this.LJLJJLL = (TextView) view.findViewById(R.id.mby);
        view.findViewById(R.id.j5k);
        this.LJLLJ = (TextView) view.findViewById(R.id.mbl);
        T5P t5p = (T5P) view.findViewById(R.id.f75);
        this.LJLJLJ = t5p;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.g4i);
        this.LJLJLLL = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.g2s);
        this.LJLL = linearLayout2;
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.g6y);
        this.LJLLI = linearLayout3;
        LinearLayout linearLayout4 = (LinearLayout) view.findViewById(R.id.g6w);
        this.LJLLILLLL = linearLayout4;
        Animation loadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.fc);
        this.LLD = loadAnimation;
        if (loadAnimation != null) {
            loadAnimation.setInterpolator(new LinearInterpolator());
        }
        if (linearLayout2 != null) {
            C16880lQ.LJIIZILJ(linearLayout2, new ACListenerS35S0100000_15(this, 292));
        }
        if (linearLayout4 != null) {
            C16880lQ.LJIIZILJ(linearLayout4, new ACListenerS35S0100000_15(this, 293));
        }
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS35S0100000_15(this, 294));
        }
        if (linearLayout3 != null) {
            C16880lQ.LJIIZILJ(linearLayout3, new ACListenerS35S0100000_15(this, 295));
        }
        if (t5p != null) {
            C16880lQ.LJJJLIIL(t5p, new ACListenerS35S0100000_15(this, 296));
            t5p.setOnStateChangeListener(new C84994XXi(this));
        }
    }

    public final void L(List<? extends MusicModel> list) {
        List<MusicModel> list2;
        List<MusicModel> list3 = this.LJLZ;
        boolean z = true;
        if ((list3 != null && !list3.isEmpty()) || list == null || list.isEmpty()) {
            z = false;
        }
        if (this.LJLZ == null) {
            this.LJLZ = new ArrayList();
        }
        if (list != null && (list2 = this.LJLZ) != null) {
            list2.addAll(list);
        }
        if (z) {
            M(this.LJZ, false);
        }
    }

    public final void M(int i, boolean z) {
        int i2;
        MusicModel musicModel;
        String str;
        Context context;
        String string;
        String singer;
        int i3;
        boolean z2;
        List<MusicModel> list = this.LJLZ;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i >= i2) {
            return;
        }
        List<MusicModel> list2 = this.LJLZ;
        MusicModel.CollectionType collectionType = null;
        if (list2 != null) {
            musicModel = (MusicModel) ListProtector.get(list2, i);
        } else {
            musicModel = null;
        }
        TextView textView = this.LJLJJLL;
        if (textView != null) {
            if (musicModel != null) {
                str = musicModel.getName();
            } else {
                str = null;
            }
            textView.setText(str);
        }
        TextView textView2 = this.LJLJL;
        if (textView2 != null) {
            if (musicModel == null || (singer = musicModel.getSinger()) == null || singer.length() == 0) {
                TextView textView3 = this.LJLJL;
                if (textView3 != null && (context = textView3.getContext()) != null) {
                    string = context.getString(R.string.tel);
                    textView2.setText(string);
                }
                string = null;
                textView2.setText(string);
            } else {
                if (musicModel != null) {
                    string = musicModel.getSinger();
                    textView2.setText(string);
                }
                string = null;
                textView2.setText(string);
            }
        }
        TextView textView4 = this.LJLLJ;
        if (textView4 != null) {
            if (musicModel != null) {
                i3 = musicModel.getPresenterDuration();
            } else {
                i3 = 0;
            }
            textView4.setText(C78929UyL.LJIIIZ(i3));
        }
        MusicModel.CollectionType collectionType2 = MusicModel.CollectionType.COLLECTED;
        if (musicModel != null) {
            collectionType = musicModel.getCollectionType();
        }
        if (collectionType2 == collectionType) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LL = z2;
        Q();
        if (!z) {
            P(this.LJLILLLLZI, i);
            P(this.LJLJI, i + 1);
            return;
        }
        C56K c56k = new C56K();
        c56k.element = 0.2f;
        C56K c56k2 = new C56K();
        c56k2.element = 1.0f - c56k.element;
        this.LJZI = ValueAnimator.ofFloat(1.0f, c56k.element).setDuration(150L);
        C62846OlW c62846OlW = this.LJLJI;
        if (c62846OlW != null) {
            c62846OlW.setAlpha(0.0f);
        }
        C62846OlW c62846OlW2 = this.LJLJI;
        if (c62846OlW2 != null) {
            c62846OlW2.setVisibility(0);
        }
        ValueAnimator valueAnimator = this.LJZI;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new C85000XXo(this, c56k, c56k2));
        }
        ValueAnimator valueAnimator2 = this.LJZI;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new ALAdapterS12S0100000_15(this, 23));
        }
        ValueAnimator valueAnimator3 = this.LJZI;
        if (valueAnimator3 == null) {
            return;
        }
        valueAnimator3.start();
    }

    public final void N(boolean z, boolean z2) {
        TuxIconView tuxIconView = this.LJLJJI;
        if (tuxIconView != null) {
            tuxIconView.clearAnimation();
        }
        if (z) {
            if (z2) {
                TuxIconView tuxIconView2 = this.LJLJJI;
                if (tuxIconView2 != null) {
                    tuxIconView2.setIconRes(R.raw.icon_spinner_normal);
                }
                TuxIconView tuxIconView3 = this.LJLJJI;
                if (tuxIconView3 != null) {
                    tuxIconView3.setTintColorRes(R.attr.dj);
                }
                TuxIconView tuxIconView4 = this.LJLJJI;
                if (tuxIconView4 != null) {
                    tuxIconView4.startAnimation(this.LLD);
                    return;
                }
                return;
            }
            TuxIconView tuxIconView5 = this.LJLJJI;
            if (tuxIconView5 == null) {
                return;
            }
            tuxIconView5.setIconRes(R.raw.icon_color_pause);
            return;
        }
        TuxIconView tuxIconView6 = this.LJLJJI;
        if (tuxIconView6 == null) {
            return;
        }
        tuxIconView6.setIconRes(R.raw.icon_color_play);
    }

    public final void P(C62846OlW c62846OlW, int i) {
        int i2;
        MusicModel musicModel;
        String picBig;
        String picBig2;
        List<MusicModel> list = this.LJLZ;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i >= i2) {
            return;
        }
        List<MusicModel> list2 = this.LJLZ;
        if (list2 != null && (musicModel = (MusicModel) ListProtector.get(list2, i)) != null) {
            String picPremium = musicModel.getPicPremium();
            if (picPremium == null || picPremium.length() == 0) {
                if (musicModel != null && (picBig = musicModel.getPicBig()) != null && picBig.length() != 0 && musicModel != null) {
                    picBig2 = musicModel.getPicBig();
                    if (picBig2 != null && picBig2.length() != 0) {
                        C78765Uvh.LJIIIZ(c62846OlW, picBig2, -1, -1);
                        return;
                    }
                }
            } else if (musicModel != null) {
                picBig2 = musicModel.getPicPremium();
                if (picBig2 != null) {
                    C78765Uvh.LJIIIZ(c62846OlW, picBig2, -1, -1);
                    return;
                }
            }
        }
        C78765Uvh.LIZ(c62846OlW, R.attr.cf);
    }
}
