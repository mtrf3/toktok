package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6kB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168996kB extends C168986kA {
    public final FrameLayout LJLJLLL;
    public final TuxIconView LJLL;
    public final SmartImageView LJLLI;
    public final TuxTextView LJLLILLLL;
    public final View LJLLJ;
    public final TDV LJLLL;
    public AbstractC169046kG LJLLLL;

    @Override // X.C168986kA
    public final void N() {
        String str;
        TuxTextView tuxTextView = this.LJLLILLLL;
        if (tuxTextView != null) {
            Context context = tuxTextView.getContext();
            if (context != null) {
                str = context.getString(R.string.itj);
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        SmartImageView smartImageView = this.LJLLI;
        if (smartImageView != null) {
            W5F LJ = W5U.LJ(R.drawable.b62);
            LJ.LJIIL = 0;
            LJ.LJJIIJ = smartImageView;
            C16880lQ.LLJJJ(LJ);
        }
        TuxIconView tuxIconView = this.LJLL;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
        }
        V(false);
    }

    @Override // X.C168986kA
    public final AbstractC169046kG Q() {
        return this.LJLLLL;
    }

    @Override // X.C168986kA
    public final void L(C167736i9 c167736i9) {
        if (c167736i9.LJ == 1) {
            this.itemView.setAlpha(0.34f);
        } else if (c167736i9.LJFF == 1) {
            this.itemView.setAlpha(0.34f);
        } else {
            this.itemView.setAlpha(1.0f);
        }
        if (c167736i9.LIZJ) {
            N();
        } else {
            M(c167736i9.LIZ);
        }
        V(c167736i9.LJII);
        X(c167736i9.LJIIIIZZ);
        U(c167736i9.LJIIIZ);
        T(c167736i9.LJIIJ);
    }

    @Override // X.C168986kA
    public final void M(Effect effect) {
        int i;
        if (effect == null) {
            return;
        }
        TuxTextView tuxTextView = this.LJLLILLLL;
        if (tuxTextView != null) {
            tuxTextView.setText(effect.getName());
        }
        this.LJLLLL.LJFF();
        List<String> urlList = effect.getIconUrl().getUrlList();
        int i2 = 1;
        if (!urlList.isEmpty()) {
            if (C78949Uyf.LJJIII(effect)) {
                Integer LJJIL = C38350F3i.LJJIL((String) ListProtector.get(urlList, 0));
                if (LJJIL != null) {
                    i = LJJIL.intValue();
                } else {
                    i = 0;
                }
                SmartImageView smartImageView = this.LJLLI;
                if (smartImageView != null) {
                    W5F LJ = W5U.LJ(i);
                    S3I s3i = new S3I();
                    s3i.LJFF = new C81726W5q(C7MY.LIZIZ(8), C7MY.LIZIZ(8), C7MY.LIZIZ(8), C7MY.LIZIZ(8));
                    LJ.LJIJJLI = new S3L(s3i);
                    C110614Vt c110614Vt = new C110614Vt();
                    c110614Vt.LIZIZ = Integer.valueOf(R.attr.db);
                    c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(8));
                    LJ.LJIILIIL = C06460Ne.LIZ(this.itemView, "itemView.context", c110614Vt);
                    LJ.LJJIIJ = smartImageView;
                    C16880lQ.LLJJJ(LJ);
                }
            } else {
                SmartImageView smartImageView2 = this.LJLLI;
                if (smartImageView2 != null) {
                    W5F LJIIIIZZ = W5U.LJIIIIZZ((String) ListProtector.get(urlList, 0));
                    S3I s3i2 = new S3I();
                    s3i2.LJFF = new C81726W5q(C7MY.LIZIZ(8), C7MY.LIZIZ(8), C7MY.LIZIZ(8), C7MY.LIZIZ(8));
                    LJIIIIZZ.LJIJJLI = new S3L(s3i2);
                    C110614Vt c110614Vt2 = new C110614Vt();
                    c110614Vt2.LIZIZ = Integer.valueOf(R.attr.db);
                    c110614Vt2.LIZJ = Float.valueOf(C7MY.LIZIZ(8));
                    LJIIIIZZ.LJIILIIL = C06460Ne.LIZ(this.itemView, "itemView.context", c110614Vt2);
                    LJIIIIZZ.LJJIIJ = smartImageView2;
                    C16880lQ.LLJJJ(LJIIIIZZ);
                }
            }
        }
        C166696gT.LIZ().getClass();
        if (!C169416kr.LIZ(effect) && !OUP.LJJIIZ(effect)) {
            i2 = 0;
        }
        P(i2);
    }

    @Override // X.C168986kA
    public final void T(boolean z) {
        View findViewById = this.itemView.findViewById(R.id.cfo);
        if (findViewById == null) {
            return;
        }
        C87277YNd.LJJIJIIJI(findViewById, z);
    }

    @Override // X.C168986kA
    public final void U(int i) {
        if (i < 0 || i > 100) {
            TDV tdv = this.LJLLL;
            if (tdv == null) {
                return;
            }
            C87277YNd.LJJIJIIJI(tdv, false);
            return;
        }
        if (i == 100) {
            TDV tdv2 = this.LJLLL;
            if (tdv2 == null) {
                return;
            }
            C87277YNd.LJJIJIIJI(tdv2, false);
            return;
        }
        TDV tdv3 = this.LJLLL;
        if (tdv3 != null) {
            C87277YNd.LJJIJIIJI(tdv3, true);
        }
        TDV tdv4 = this.LJLLL;
        if (tdv4 == null) {
            return;
        }
        tdv4.setProgress(i);
    }

    @Override // X.C168986kA
    public final void V(boolean z) {
        if (z) {
            View view = this.LJLLJ;
            int LIZ = C1EU.LIZ(this.itemView, "itemView.context", R.attr.dj);
            Drawable drawable = view.getContext().getDrawable(R.drawable.sc);
            o.LJII(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawable).setStroke((int) KL2.LIZJ(view.getContext(), 2.0f), LIZ);
            view.setBackground(drawable);
        } else {
            this.LJLLJ.setBackground(null);
        }
        TuxTextView tuxTextView = this.LJLLILLLL;
        if (tuxTextView != null) {
            tuxTextView.setSelected(z);
        }
        this.LJLLLL.LJ(z);
    }

    @Override // X.C168986kA
    public final void X(int i) {
        View findViewById;
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.lb5);
        if (tuxIconView == null || (findViewById = this.itemView.findViewById(R.id.lb4)) == null) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    C87277YNd.LJJIJIIJI(tuxIconView, false);
                    C87277YNd.LJJIJIIJI(findViewById, false);
                    return;
                } else {
                    C87277YNd.LJJIJIIJI(tuxIconView, false);
                    C87277YNd.LJJIJIIJI(findViewById, true);
                    return;
                }
            }
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_human_soundwave_fill;
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            tuxIconView.setTuxIcon(c2068389v);
            C87277YNd.LJJIJIIJI(tuxIconView, true);
            C87277YNd.LJJIJIIJI(findViewById, false);
            return;
        }
        C87277YNd.LJJIJIIJI(tuxIconView, false);
        C87277YNd.LJJIJIIJI(findViewById, false);
    }

    public C168996kB(FrameLayout frameLayout, SmartImageView smartImageView, TuxTextView tuxTextView, View view, C167726i8 c167726i8, TDV tdv) {
        super(frameLayout, null, null, view, c167726i8, tdv);
        this.LJLJLLL = frameLayout;
        this.LJLL = null;
        this.LJLLI = smartImageView;
        this.LJLLILLLL = tuxTextView;
        this.LJLLJ = view;
        this.LJLLL = tdv;
        this.LJLLLL = new C169006kC(null, null, view);
    }
}
