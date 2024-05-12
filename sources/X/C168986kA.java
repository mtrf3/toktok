package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;

/* renamed from: X.6kA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C168986kA extends RecyclerView.ViewHolder {
    public final FrameLayout LJLIL;
    public final ImageView LJLILLLLZI;
    public final C81232VuO LJLJI;
    public final View LJLJJI;
    public final InterfaceC168976k9 LJLJJL;
    public AbstractC169046kG LJLJJLL;
    public int LJLJL;
    public long LJLJLJ;

    public void T(boolean z) {
    }

    public void U(int i) {
    }

    public void X(int i) {
    }

    public void N() {
        String str;
        C81232VuO c81232VuO = this.LJLJI;
        if (c81232VuO != null) {
            Context context = c81232VuO.getContext();
            if (context != null) {
                str = context.getString(R.string.itj);
            } else {
                str = null;
            }
            c81232VuO.setText(str);
        }
        C81232VuO c81232VuO2 = this.LJLJI;
        if (c81232VuO2 != null) {
            c81232VuO2.LIZ(C04270Et.LIZIZ(this.itemView.getContext(), R.drawable.b62));
        }
        ImageView imageView = this.LJLILLLLZI;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        V(false);
    }

    public AbstractC169046kG Q() {
        return this.LJLJJLL;
    }

    public void L(C167736i9 c167736i9) {
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
        int i = c167736i9.LJI;
        C81232VuO c81232VuO = this.LJLJI;
        if (c81232VuO != null) {
            c81232VuO.setIconImagePadding(i);
        }
        X(c167736i9.LJIIIIZZ);
        U(c167736i9.LJIIIZ);
        T(c167736i9.LJIIJ);
    }

    public void M(Effect effect) {
        int i;
        Context context;
        if (effect == null) {
            return;
        }
        C81232VuO c81232VuO = this.LJLJI;
        if (c81232VuO != null) {
            c81232VuO.setText(effect.getName());
        }
        Q().LJFF();
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
                C81232VuO c81232VuO2 = this.LJLJI;
                if (c81232VuO2 != null && (context = c81232VuO2.getContext()) != null) {
                    this.LJLJI.LIZ(C04270Et.LIZIZ(context, i));
                }
            } else {
                C81232VuO c81232VuO3 = this.LJLJI;
                if (c81232VuO3 != null) {
                    c81232VuO3.LIZLLL((String) ListProtector.get(urlList, 0));
                }
            }
        }
        C166696gT.LIZ().getClass();
        if (!C169416kr.LIZ(effect) && !OUP.LJJIIZ(effect)) {
            i2 = 0;
        }
        P(i2);
    }

    public final void P(int i) {
        int i2 = this.LJLJL;
        if (i == i2) {
            return;
        }
        this.LJLJL = i;
        Q().LIZJ = this.LJLJL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                } else {
                    this.LJLJLJ = System.currentTimeMillis();
                    Q().LJI(new AqS168S0100000_2(this, 519));
                    return;
                }
            } else {
                if (2 == i2 && this.LJLJLJ > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - this.LJLJLJ;
                    if (currentTimeMillis >= 100) {
                        Q().LIZIZ();
                        return;
                    } else {
                        this.itemView.postDelayed(new ARunnableS38S0100000_2(this, 167), 100 - currentTimeMillis);
                        return;
                    }
                }
                Q().LIZIZ();
                return;
            }
        }
        ImageView imageView = this.LJLILLLLZI;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.b5f);
        }
        ImageView imageView2 = this.LJLILLLLZI;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        Q().LIZ();
    }

    public void V(boolean z) {
        int i;
        C81232VuO c81232VuO = this.LJLJI;
        if (c81232VuO != null) {
            c81232VuO.LJ(z);
        }
        Q().LJ(z);
        View view = this.LJLJJI;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public C168986kA(FrameLayout frameLayout, ImageView imageView, C81232VuO c81232VuO, View view, C167726i8 c167726i8, TDV tdv) {
        super(frameLayout);
        this.LJLIL = frameLayout;
        this.LJLILLLLZI = imageView;
        this.LJLJI = c81232VuO;
        this.LJLJJI = view;
        this.LJLJJL = c167726i8;
        this.LJLJJLL = new C169006kC(imageView, c81232VuO, view);
        this.LJLJL = -1;
        C16880lQ.LJIIJ(new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 52), this.itemView);
    }
}
