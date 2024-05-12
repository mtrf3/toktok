package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.8us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226588us extends LinearLayout {
    public C252709vu LJLIL;

    public final void LIZ(FragmentManager fragmentManager) {
        fragmentManager.LJJLIL(new C08Z() { // from class: X.8ur
            public final /* synthetic */ Fragment LIZ = null;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C08Z
            public final void onFragmentActivityCreated(FragmentManager fm, Fragment f, Bundle bundle) {
                C235119Kp createNavActions;
                o.LJIIIZ(fm, "fm");
                o.LJIIIZ(f, "f");
                super.onFragmentActivityCreated(fm, f, bundle);
                if (!o.LJ(f, this.LIZ)) {
                    return;
                }
                if ((f instanceof InterfaceC219588ja) && (createNavActions = ((InterfaceC219588ja) f).createNavActions()) != null) {
                    C226588us c226588us = C226588us.this;
                    C252709vu c252709vu = c226588us.LJLIL;
                    if (c252709vu == null) {
                        Context context = c226588us.getContext();
                        o.LJIIIIZZ(context, "context");
                        c252709vu = new C252709vu(context, null, 6);
                        c226588us.addView(c252709vu, 0, new LinearLayout.LayoutParams(-1, C7MY.LIZIZ(52)));
                        c226588us.LJLIL = c252709vu;
                    }
                    c252709vu.setNavActions(createNavActions);
                    c252709vu.setVisibility(0);
                    return;
                }
                C252709vu c252709vu2 = C226588us.this.LJLIL;
                if (c252709vu2 == null) {
                    return;
                }
                c252709vu2.setVisibility(8);
            }
        }, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setup(boolean z) {
        C45631qh c45631qh;
        removeAllViews();
        if (z) {
            c45631qh = new C45631qh(getContext(), null);
            addView(c45631qh, -2, -2);
        } else {
            c45631qh = this;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.lux);
        c45631qh.addView(frameLayout, -2, -2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C226588us(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        setOrientation(1);
        setGravity(1);
    }
}
