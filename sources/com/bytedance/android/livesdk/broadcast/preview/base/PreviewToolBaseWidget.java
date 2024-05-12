package com.bytedance.android.livesdk.broadcast.preview.base;

import X.C15380j0;
import X.C29306Beo;
import X.C29685Bkv;
import X.C31809Ce5;
import X.C47121t6;
import X.C78924UyG;
import Y.IDObjectS0S0101000;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import o3.IDaS468S0100000_5;
import o3.h0;

/* loaded from: classes6.dex */
public abstract class PreviewToolBaseWidget extends PreviewWidget {
    public long LLFF() {
        return 1000L;
    }

    public abstract int LLFFF();

    public abstract int LLFII();

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.dq7;
    }

    public abstract void onClick(View view);

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void LJZL() {
        super.LJZL();
        View view = getView();
        if (view != null) {
            LLIIII(view);
            if (((AppCompatTextView) view.findViewById(R.id.nj3)).getText().length() > 12) {
                ((C47121t6) view.findViewById(R.id.nj3)).setTextSize(1, 9.0f);
            }
            ((TextView) view.findViewById(R.id.nj3)).setMaxLines(1);
            C29306Beo.LJJJLL(view, LLFF(), new C29685Bkv(this));
            h0.LJIJI(view, new IDaS468S0100000_5(view, 0));
        }
    }

    public final void LLF() {
        View view;
        View view2 = getView();
        if (view2 != null) {
            view = view2.findViewById(R.id.niz);
        } else {
            view = null;
        }
        C29306Beo.LJI(view);
    }

    public final boolean LLFZ() {
        View findViewById;
        View view = getView();
        if (view != null && (findViewById = view.findViewById(R.id.niz)) != null && findViewById.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void LLII() {
        View view;
        View view2 = getView();
        if (view2 != null) {
            view = view2.findViewById(R.id.niz);
        } else {
            view = null;
        }
        C29306Beo.LJJLJLI(view);
    }

    public static int LL(View view) {
        ViewParent viewParent;
        ViewGroup viewGroup = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof ViewGroup) {
            viewGroup = (ViewGroup) viewParent;
        }
        int i = 0;
        if (viewGroup != null) {
            Iterator<View> it = C78924UyG.LIZLLL(viewGroup).iterator();
            while (true) {
                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                if (!iDObjectS0S0101000.hasNext()) {
                    break;
                }
                View view2 = (View) iDObjectS0S0101000.next();
                if (o.LJ(view2, view)) {
                    return i;
                }
                if (!(view2 instanceof C31809Ce5) && C29306Beo.LJJIIJ(view2)) {
                    i++;
                }
            }
        }
        return i;
    }

    public final void LLIIII(View view) {
        if (view != null || (view = getView()) != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.nix);
            if (imageView != null) {
                imageView.setImageResource(LLFFF());
            }
            TextView textView = (TextView) view.findViewById(R.id.nj3);
            if (textView == null) {
                return;
            }
            textView.setText(C15380j0.LJIILJJIL(LLFII()));
        }
    }
}
