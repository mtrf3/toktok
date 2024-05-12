package com.ss.android.ugc.aweme.notification.creator.widget;

import X.AnonymousClass391;
import X.C16880lQ;
import X.C251739uL;
import X.C26338AVi;
import X.C32151Nz;
import X.C76800UCe;
import X.C79045V0n;
import X.InterfaceC88472Yns;
import X.O6R;
import Y.ACListenerS22S0201000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SortPopupWindow extends PopupWindow implements LifecycleEventObserver {
    public final InterfaceC88472Yns<NoticeSortModel, C76800UCe> LJLIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        int i = C251739uL.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            source.getLifecycle().removeObserver(this);
            dismiss();
            return;
        }
        source.getLifecycle().removeObserver(this);
        dismiss();
    }

    public SortPopupWindow(Context context, List list, AqS181S0100000_15 aqS181S0100000_15) {
        super(context);
        int i;
        this.LJLIL = aqS181S0100000_15;
        setContentView(C16880lQ.LLLZIIL(R.layout.tt, C16880lQ.LLZIL(context), null));
        setHeight(-2);
        setWidth(-2);
        ViewGroup viewGroup = (ViewGroup) getContentView().findViewById(R.id.k7a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Context context2 = getContentView().getContext();
            o.LJIIIIZZ(context2, "contentView.context");
            TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
            viewGroup.addView(tuxTextView, layoutParams);
            tuxTextView.setText(((NoticeSortModel) ListProtector.get(list, i2)).sortName);
            tuxTextView.setGravity(17);
            tuxTextView.setTuxFont(52);
            C26338AVi.LJIIIZ(tuxTextView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24))), AnonymousClass391.LIZJ(12), AnonymousClass391.LIZJ(24), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 16);
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS22S0201000_4(this, list, i2, 0));
            if (i2 < list.size() - 1) {
                View view = new View(getContentView().getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.aiw));
                Integer LJI = C79045V0n.LJI(R.attr.dz, context);
                if (LJI != null) {
                    i = LJI.intValue();
                } else {
                    i = 0;
                }
                view.setBackgroundColor(i);
                viewGroup.addView(view, layoutParams2);
            }
        }
    }
}
