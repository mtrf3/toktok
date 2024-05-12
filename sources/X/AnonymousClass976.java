package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.976, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass976 extends TuxTextView implements InterfaceC51700KQu {
    public TuxTextView LJLLLL;
    public final String LJLLLLLL;
    public final String LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final java.util.Map<Integer, View> LJZL;

    @Override // X.InterfaceC51700KQu
    public final void LJI(int i, int i2, String str) {
    }

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJZL;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final void LJJJIL() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        setClickable(false);
        Integer textTertiaryColor = getTextTertiaryColor();
        if (textTertiaryColor != null) {
            setTextColor(textTertiaryColor.intValue());
        }
        TuxTextView tuxTextView = this.LJLLLL;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(this.LJLZ);
        Integer textTertiaryColor2 = getTextTertiaryColor();
        if (textTertiaryColor2 != null) {
            tuxTextView.setTextColor(textTertiaryColor2.intValue());
        }
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            tuxTextView.setLayoutParams(marginLayoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            setLayoutParams(marginLayoutParams2);
        }
    }

    public void setFollowStatus(int i) {
    }

    private final Integer getLinkColor() {
        return (Integer) this.LJZI.getValue();
    }

    private final Integer getTextTertiaryColor() {
        return (Integer) this.LJZ.getValue();
    }

    @Override // X.InterfaceC51700KQu
    public LifecycleOwner getLifeCycleOwner() {
        Activity LIZIZ = C27740Aue.LIZIZ(this);
        o.LJII(LIZIZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (C1AU) LIZIZ;
    }

    public final void setPrefixView(TuxTextView prefixView) {
        o.LJIIIZ(prefixView, "prefixView");
        this.LJLLLL = prefixView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass976(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJZL = C62850Ola.LJFF(context, "context");
        this.LJLLLLLL = "+";
        this.LJLZ = "·";
        this.LJZ = C221108m2.LIZIZ(new AqS154S0100000_4(context, 1157));
        this.LJZI = C221108m2.LIZIZ(new AqS154S0100000_4(context, 1156));
    }

    @Override // X.InterfaceC51700KQu
    public final void LJJI(int i, int i2) {
        StringBuilder sb;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(getResources().getString(R.string.gk4));
                    setText(sb2);
                    LJJJIL();
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(getResources().getString(R.string.exk));
                setText(sb3);
                LJJJIL();
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(getResources().getString(R.string.gkk));
            setText(sb4);
            LJJJIL();
            return;
        }
        if (i2 == 0) {
            sb = new StringBuilder();
            sb.append(getResources().getString(R.string.git));
        } else {
            sb = new StringBuilder();
            sb.append(getResources().getString(R.string.gix));
        }
        setText(sb);
        setClickable(true);
        Integer linkColor = getLinkColor();
        if (linkColor != null) {
            setTextColor(linkColor.intValue());
        }
        TuxTextView tuxTextView = this.LJLLLL;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(this.LJLLLLLL);
        Integer linkColor2 = getLinkColor();
        if (linkColor2 != null) {
            tuxTextView.setTextColor(linkColor2.intValue());
        }
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(7)));
            tuxTextView.setLayoutParams(marginLayoutParams2);
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
            return;
        }
        marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(3)));
        setLayoutParams(marginLayoutParams);
    }
}
