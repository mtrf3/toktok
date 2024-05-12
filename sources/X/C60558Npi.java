package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Npi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60558Npi extends FrameLayout implements InterfaceC60585Nq9, InterfaceC60582Nq6 {
    public static final /* synthetic */ int LJLJJI = 0;
    public InterfaceC65784Pro<C76800UCe> LJLIL;
    public C60564Npo LJLILLLLZI;
    public HashMap LJLJI;

    @Override // X.InterfaceC60582Nq6
    public final void LIZ() {
        setVisibility(0);
    }

    @Override // X.InterfaceC60582Nq6
    public final void LIZLLL() {
        setVisibility(4);
    }

    public final View LJ(int i) {
        if (this.LJLJI == null) {
            this.LJLJI = new HashMap();
        }
        View view = (View) this.LJLJI.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJLJI.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC60582Nq6
    public final void LIZIZ() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public C60558Npi(Context context) {
        super(context, null, 0);
        this.LJLILLLLZI = new C60564Npo(new C60574Npy(), new C60574Npy(), -1, -2, -1, null);
    }

    @Override // X.InterfaceC60585Nq9
    public final void LIZJ(int i, Integer num, boolean z) {
        C60574Npy c60574Npy;
        ViewGroup.LayoutParams layoutParams;
        View LJ;
        ViewGroup.LayoutParams layoutParams2;
        C60564Npo c60564Npo = this.LJLILLLLZI;
        if (z) {
            c60574Npy = c60564Npo.LJLIL;
        } else {
            c60574Npy = c60564Npo.LJLILLLLZI;
        }
        View content_center_sheet = LJ(R.id.btf);
        o.LJFF(content_center_sheet, "content_center_sheet");
        ViewGroup.LayoutParams layoutParams3 = content_center_sheet.getLayoutParams();
        if (!(layoutParams3 instanceof FrameLayout.LayoutParams)) {
            layoutParams3 = null;
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        if (layoutParams4 != null) {
            String str = c60574Npy.LJLIL;
            int hashCode = str.hashCode();
            if (hashCode != -1383228885) {
                if (hashCode != -1364013995) {
                    if (hashCode == 115029 && str.equals("top")) {
                        layoutParams4.gravity = 49;
                        layoutParams4.topMargin = c60574Npy.LJLILLLLZI;
                    }
                } else if (str.equals("center")) {
                    layoutParams4.gravity = 17;
                    layoutParams4.bottomMargin = 0;
                    layoutParams4.topMargin = 0;
                }
            } else if (str.equals("bottom")) {
                layoutParams4.gravity = 81;
                layoutParams4.bottomMargin = c60574Npy.LJLILLLLZI;
            }
        }
        if (z) {
            if (this.LJLILLLLZI.LJLJJI > 0 && num != null && (LJ = LJ(R.id.btf)) != null && (layoutParams2 = LJ.getLayoutParams()) != null) {
                layoutParams2.height = Math.min(num.intValue(), this.LJLILLLLZI.LJLJJI);
            }
        } else {
            View LJ2 = LJ(R.id.btf);
            if (LJ2 != null && (layoutParams = LJ2.getLayoutParams()) != null) {
                int i2 = this.LJLILLLLZI.LJLJJI;
                if (i2 <= 0) {
                    i2 = -1;
                }
                layoutParams.height = i2;
            }
        }
        setPadding(0, 0, 0, i);
        requestLayout();
    }
}
