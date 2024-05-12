package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import q03.IDaS490S0100000_13;

/* renamed from: X.UHd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76929UHd extends ConstraintLayout {
    public C32496CpA LJLIL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLILLLLZI;
    public final C41081jM LJLJI;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJJI;
    public final TextView LJLJJL;
    public final C47061t0 LJLJJLL;
    public final List<ViewPropertyAnimator> LJLJL;

    public final Integer getRealBoxSize$livegift_impl_release() {
        C47061t0 c47061t0 = this.LJLJJLL;
        if (c47061t0 != null) {
            return Integer.valueOf(c47061t0.getWidth());
        }
        return null;
    }

    public final boolean LJJLL() {
        TextView textView;
        if (getVisibility() == 0 && (textView = this.LJLJJL) != null && textView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<ViewPropertyAnimator> it = this.LJLJL.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        ((ArrayList) this.LJLJL).clear();
    }

    public final void setBoxShowListener$livegift_impl_release(InterfaceC88472Yns<? super Boolean, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI = listener;
    }

    public final void setOnClickListener$livegift_impl_release(InterfaceC88472Yns<? super Boolean, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJI = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C76929UHd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public final void LJJLJLI(C32496CpA c32496CpA, Boolean bool) {
        ImageModel imageModel;
        C47061t0 c47061t0;
        ImageModel imageModel2 = null;
        if (c32496CpA != null) {
            imageModel = c32496CpA.LIZIZ;
        } else {
            imageModel = null;
        }
        C32496CpA c32496CpA2 = this.LJLIL;
        if (c32496CpA2 != null) {
            imageModel2 = c32496CpA2.LIZIZ;
        }
        if (!o.LJ(imageModel, imageModel2) && c32496CpA != null && (c47061t0 = this.LJLJJLL) != null) {
            C78609UtB.LJJJJLI(c47061t0, c32496CpA.LIZIZ, R.drawable.cvc, getLayoutParams().width, getLayoutParams().height);
        }
        this.LJLIL = c32496CpA;
        if (bool != null) {
            if (o.LJ(bool, Boolean.TRUE)) {
                TextView textView = this.LJLJJL;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                C41081jM c41081jM = this.LJLJI;
                if (c41081jM != null) {
                    c41081jM.setVisibility(0);
                }
            } else {
                TextView textView2 = this.LJLJJL;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                C41081jM c41081jM2 = this.LJLJI;
                if (c41081jM2 != null) {
                    c41081jM2.setVisibility(8);
                }
            }
        }
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(o.LJ(bool, Boolean.TRUE)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76929UHd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        ViewGroup.inflate(context, R.layout.dor, this);
        this.LJLJJL = (TextView) findViewById(R.id.m8a);
        this.LJLJI = (C41081jM) findViewById(R.id.as5);
        this.LJLJJLL = (C47061t0) findViewById(R.id.e9i);
        C16880lQ.LJIIJ(new IDaS490S0100000_13(this, 0), this);
        this.LJLJL = new ArrayList();
    }
}
