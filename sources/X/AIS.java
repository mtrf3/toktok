package X;

import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AIS implements InterfaceC60844NuK {
    public C2PT LJLIL;

    @Override // X.InterfaceC60844NuK
    public final void LJIJJ(boolean z) {
    }

    @Override // X.M2J
    public final void release() {
        this.LJLIL = null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, X.2PT] */
    @Override // X.InterfaceC60844NuK
    public final View LJI(final Context context) {
        o.LJIIJ(context, "context");
        ?? r0 = new FrameLayout(context) { // from class: X.2PT
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, null, 0);
                o.LJIIJ(context, "context");
                C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cni, this, true);
            }
        };
        this.LJLIL = r0;
        return r0;
    }

    @Override // X.InterfaceC60844NuK
    public void LJIIJJI(View.OnClickListener onClickListener) {
        ImageView imageView;
        C2PT c2pt = this.LJLIL;
        if (c2pt != null && (imageView = (ImageView) c2pt.findViewById(R.id.eys)) != null) {
            C16880lQ.LJIILLIIL(imageView, onClickListener);
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJIILJJIL(String subTitle) {
        TextView textView;
        o.LJIIJ(subTitle, "subTitle");
        C2PT c2pt = this.LJLIL;
        if (c2pt != null && (textView = (TextView) c2pt.findViewById(R.id.mlr)) != null) {
            textView.setText(subTitle);
            textView.setVisibility(0);
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJIIZILJ(EnumC60084Ni4 navBtnType) {
        TextView textView;
        o.LJIIJ(navBtnType, "navBtnType");
        C2PT c2pt = this.LJLIL;
        if (c2pt != null) {
            textView = (TextView) c2pt.findViewById(R.id.axa);
        } else {
            textView = null;
        }
        int i = C60089Ni9.LIZ[navBtnType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || textView == null) {
                        return;
                    }
                    textView.setVisibility(0);
                    textView.setText("Share");
                    return;
                }
                if (textView == null) {
                    return;
                }
                textView.setVisibility(0);
                textView.setText("Collect");
                return;
            }
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            textView.setText("Report");
            return;
        }
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJII(ACListenerS30S0100000_10 aCListenerS30S0100000_10) {
        ImageView imageView;
        C2PT c2pt = this.LJLIL;
        if (c2pt != null && (imageView = (ImageView) c2pt.findViewById(R.id.f0i)) != null) {
            C16880lQ.LJIILLIIL(imageView, aCListenerS30S0100000_10);
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJIII(String title) {
        TextView textView;
        o.LJIIJ(title, "title");
        C2PT c2pt = this.LJLIL;
        if (c2pt != null && (textView = (TextView) c2pt.findViewById(R.id.mo6)) != null) {
            textView.setText(title);
            textView.setVisibility(0);
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJIJIIJI(int i) {
        TextView textView;
        C2PT c2pt = this.LJLIL;
        if (c2pt != null && (textView = (TextView) c2pt.findViewById(R.id.mo6)) != null) {
            textView.setTextColor(i);
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJIL(int i) {
        View findViewById;
        C2PT c2pt = this.LJLIL;
        if (c2pt != null && (findViewById = c2pt.findViewById(R.id.law)) != null) {
            findViewById.setBackgroundColor(i);
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJJ(boolean z) {
        ImageView imageView;
        int i;
        C2PT c2pt = this.LJLIL;
        if (c2pt != null && (imageView = (ImageView) c2pt.findViewById(R.id.f0i)) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }
}
