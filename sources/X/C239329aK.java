package X;

import Y.ARunnableS40S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9aK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C239329aK extends SY4 implements InterfaceC51700KQu {
    public int LLIIIILZ;
    public boolean LLIIIJ;
    public final java.util.Map<Integer, View> LLIIIL;

    @Override // X.SY4, com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLIIIL;
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

    @Override // X.InterfaceC51700KQu
    public LifecycleOwner getLifeCycleOwner() {
        Activity LIZIZ = C27740Aue.LIZIZ(this);
        o.LJII(LIZIZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (C1AU) LIZIZ;
    }

    public final int getStatus() {
        return this.LLIIIILZ;
    }

    public final void setAnimating(boolean z) {
        this.LLIIIJ = z;
    }

    public void setFollowStatus(int i) {
        LJJI(i, 0);
    }

    public final void setStatus(int i) {
        this.LLIIIILZ = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C239329aK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.jo);
        this.LLIIIL = C62850Ola.LJFF(context, "context");
        LJJJIL(true);
        setEllipsize(null);
    }

    @Override // X.InterfaceC51700KQu
    public final void LJJI(int i, int i2) {
        if (i != 0) {
            if (i != 4) {
                if (this.LLIIIILZ == 4 && !this.LLIIIJ) {
                    animate().alpha(0.0f).setDuration(250L).withStartAction(new ARunnableS40S0100000_4(this, 59)).withEndAction(new ARunnableS40S0100000_4(this, 60));
                }
            } else {
                setButtonVariant(1);
                setText(getResources().getText(R.string.gnr));
                setClickable(false);
                setVisibility(0);
            }
        } else {
            setButtonVariant(0);
            setText(getResources().getText(R.string.gix));
            setClickable(true);
            setVisibility(0);
        }
        this.LLIIIILZ = i;
        setButtonSize(1);
    }

    @Override // X.InterfaceC51700KQu
    public final void LJI(int i, int i2, String str) {
        LJJI(i, i2);
    }
}
