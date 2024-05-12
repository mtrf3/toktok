package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9aJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public class C239319aJ extends SY4 implements InterfaceC51700KQu {
    public boolean LLIIIILZ;
    public String LLIIIJ;
    public final java.util.Map<Integer, View> LLIIIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C239319aJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

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

    public final String getMessageText() {
        return this.LLIIIJ;
    }

    public final boolean getShouldShowMessageText() {
        return this.LLIIIILZ;
    }

    public void setFollowStatus(int i) {
        LJJI(i, 0);
    }

    public final void setMessageText(String str) {
        this.LLIIIJ = str;
    }

    public final void setShouldShowMessageText(boolean z) {
        this.LLIIIILZ = z;
    }

    @Override // X.InterfaceC51700KQu
    public final void LJJI(int i, int i2) {
        CharSequence text;
        CharSequence text2;
        setVisibility(0);
        if (i == 0) {
            setButtonVariant(0);
            if (i2 == 1) {
                text2 = getResources().getText(R.string.gix);
            } else {
                text2 = getResources().getText(R.string.git);
            }
            setText(text2);
        } else {
            setButtonVariant(1);
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            setText(getResources().getText(R.string.gk4));
                        }
                    } else {
                        setVisibility(8);
                    }
                } else {
                    if (this.LLIIIILZ) {
                        String str = this.LLIIIJ;
                        if (str == null || str.length() == 0) {
                            text = getResources().getText(R.string.i3_);
                        } else {
                            text = this.LLIIIJ;
                        }
                    } else {
                        text = getResources().getText(R.string.exk);
                    }
                    setText(text);
                }
            } else {
                setText(getResources().getText(R.string.gkd));
            }
        }
        setButtonSize(1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C239319aJ(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 2
            r2 = 0
            if (r0 == 0) goto L6
            r5 = r2
        L6:
            r0 = r6 & 4
            if (r0 == 0) goto L20
            r1 = 2130968868(0x7f040124, float:1.7546402E38)
        Ld:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r4, r0)
            r3.LLIIIL = r0
            r3.<init>(r4, r5, r1)
            r0 = 1
            r3.LJJJIL(r0)
            r3.setEllipsize(r2)
            return
        L20:
            r1 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C239319aJ.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // X.InterfaceC51700KQu
    public final void LJI(int i, int i2, String str) {
        LJJI(i, i2);
    }
}
