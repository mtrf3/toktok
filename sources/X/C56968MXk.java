package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* renamed from: X.MXk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C56968MXk extends RelativeLayout implements InterfaceC56973MXp, InterfaceC51700KQu {
    public C56970MXm LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final int LJLJJL;
    public final Drawable LJLJJLL;
    public final int LJLJL;
    public final Drawable LJLJLJ;
    public final float LJLJLLL;

    public int getLayout() {
        return R.layout.v4;
    }

    public ViewGroup.LayoutParams getButtonLayoutParams() {
        return this.LJLIL.getLayoutParams();
    }

    @Override // X.InterfaceC51700KQu
    public LifecycleOwner getLifeCycleOwner() {
        return (C1AU) C27740Aue.LIZIZ(this);
    }

    public int LIZ(TextView textView) {
        int i = this.LJLJI;
        if (i != -1) {
            return i;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.string.gkd));
        arrayList.add(Integer.valueOf(R.string.exk));
        arrayList.add(Integer.valueOf(R.string.gk4));
        arrayList.add(Integer.valueOf(R.string.exm));
        arrayList.add(Integer.valueOf(R.string.gix));
        return C78983UzD.LJJIJIIJI(textView, arrayList, (int) KL2.LIZJ(getContext(), 60.0f), (int) KL2.LIZJ(getContext(), 120.0f));
    }

    public void setButtonLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.LJLJJI = layoutParams.width;
        C56971MXn.LIZ(getClass(), new C56972MXo(LIZ(this.LJLIL)));
        this.LJLIL.setLayoutParams(layoutParams);
    }

    public void setDoubleFollowButtonText(String str) {
        this.LJLIL.setText(getResources().getText(R.string.exk));
    }

    public void setFollowButtonStyle(int i) {
        this.LJLIL.setPadding(0, 0, 0, 0);
        this.LJLIL.setGravity(17);
        this.LJLIL.setCompoundDrawables(null, null, null, null);
    }

    public void setFollowButtonTextAndIcon(int i) {
        this.LJLIL.setText(getResources().getText(R.string.git));
        setFollowButtonStyle(-1);
    }

    public void setFollowStatus(int i) {
        if (this.LJLILLLLZI == i) {
            return;
        }
        LJJI(i, -1);
    }

    @Override // android.view.View, X.InterfaceC51700KQu
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LJLIL.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public void setText(String str) {
        setVisibility(0);
        setFollowButtonStyle(-1);
        this.LJLIL.setText(str);
        this.LJLIL.setTextColor(this.LJLJJL);
        this.LJLIL.setBackground(this.LJLJJLL);
        C78897Uxp.LJJJJJL(this.LJLIL, this.LJLJLLL);
    }

    public C56968MXk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void LJJI(int i, int i2) {
        LJI(i, i2, null);
    }

    public C56968MXk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        int i2;
        this.LJLJI = -1;
        float LJIIZILJ = C32151Nz.LJIIZILJ(5);
        this.LJLJLLL = LJIIZILJ;
        LIZIZ(context, attributeSet, 0);
        C25600zU LJII = C78605Ut7.LJII(getContext(), false);
        Integer LJI = C79045V0n.LJI(R.attr.dj, LJII);
        if (LJI != null) {
            i2 = LJI.intValue();
        } else {
            i2 = 0;
        }
        this.LJLJJL = i2;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
        c110614Vt.LIZJ = Float.valueOf(LJIIZILJ);
        this.LJLJJLL = c110614Vt.LIZ(LJII);
        Integer LJI2 = C79045V0n.LJI(R.attr.go, LJII);
        this.LJLJL = LJI2 != null ? LJI2.intValue() : 0;
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZIZ = Integer.valueOf(R.attr.cf);
        c110614Vt2.LIZJ = Float.valueOf(LJIIZILJ);
        c110614Vt2.LJII = C32151Nz.LJIILLIIL(36);
        c110614Vt2.LJI = C32151Nz.LJIILLIIL(18);
        this.LJLJLJ = c110614Vt2.LIZ(LJII);
    }

    public void LIZIZ(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aem});
        this.LJLJI = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        obtainStyledAttributes.recycle();
        C56970MXm c56970MXm = (C56970MXm) C16950lX.LIZ(context, getLayout(), this, true, -1).findViewById(R.id.awa);
        this.LJLIL = c56970MXm;
        c56970MXm.LJLJL = this;
        c56970MXm.setBackground(this.LJLJJLL);
        C78897Uxp.LJJJJJL(this.LJLIL, this.LJLJLLL);
        LIZ(this.LJLIL);
        C56971MXn.LIZ(getClass(), new C56972MXo(LIZ(this.LJLIL)));
        this.LJLILLLLZI = 0;
    }

    public void LJI(int i, int i2, String str) {
        setVisibility(0);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (i2 != -1) {
                                setFollowButtonStyle(-1);
                            }
                            this.LJLIL.setText(getResources().getText(R.string.gk4));
                            this.LJLIL.setTextColor(this.LJLJL);
                            this.LJLIL.setBackground(this.LJLJLJ);
                            if (Build.VERSION.SDK_INT >= 23) {
                                this.LJLIL.setForeground(null);
                            }
                        }
                    } else {
                        setVisibility(8);
                    }
                } else {
                    if (i2 != -1) {
                        setFollowButtonStyle(-1);
                    }
                    setDoubleFollowButtonText(str);
                    this.LJLIL.setTextColor(this.LJLJL);
                    this.LJLIL.setBackground(this.LJLJLJ);
                    if (Build.VERSION.SDK_INT >= 23) {
                        this.LJLIL.setForeground(null);
                    }
                }
            } else {
                if (i2 != -1) {
                    setFollowButtonStyle(-1);
                }
                this.LJLIL.setText(getResources().getText(R.string.gkd));
                this.LJLIL.setTextColor(this.LJLJL);
                this.LJLIL.setBackground(this.LJLJLJ);
                if (Build.VERSION.SDK_INT >= 23) {
                    this.LJLIL.setForeground(null);
                }
            }
        } else {
            if (i2 != -1) {
                setFollowButtonTextAndIcon(i2);
            }
            this.LJLIL.setTextColor(this.LJLJJL);
            this.LJLIL.setBackground(this.LJLJJLL);
            C78897Uxp.LJJJJJL(this.LJLIL, this.LJLJLLL);
        }
        this.LJLILLLLZI = i;
    }
}
