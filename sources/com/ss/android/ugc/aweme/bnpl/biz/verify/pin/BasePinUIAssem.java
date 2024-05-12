package com.ss.android.ugc.aweme.bnpl.biz.verify.pin;

import X.ActivityC45651qj;
import X.C018905p;
import X.C212428Vi;
import X.C91927a2V;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public class BasePinUIAssem extends UIContentAssem implements ViewTreeObserver.OnGlobalLayoutListener {
    public int LJLIL;

    public View _$_findCachedViewById(int i) {
        throw null;
    }

    public BasePinUIAssem() {
        new LinkedHashMap();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Window window;
        View decorView;
        Rect rect = new Rect();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (window = LIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        int height = rect.height();
        if (height - this.LJLIL < 0) {
            this.LJLIL = height;
            C91927a2V.LIZ = height;
            C018905p c018905p = new C018905p(-2, -2);
            int i = R.id.gd;
            c018905p.topToBottom = R.id.gd;
            c018905p.leftToLeft = 0;
            c018905p.rightToRight = 0;
            View bnpl_pin_forgot_password = _$_findCachedViewById(R.id.fu);
            o.LJIIIIZZ(bnpl_pin_forgot_password, "bnpl_pin_forgot_password");
            if (bnpl_pin_forgot_password.getVisibility() == 0) {
                height = _$_findCachedViewById(R.id.fu).getTop();
            }
            View bnpl_pin_message = _$_findCachedViewById(R.id.gd);
            o.LJIIIIZZ(bnpl_pin_message, "bnpl_pin_message");
            if (bnpl_pin_message.getVisibility() != 0) {
                i = R.id.gj;
            }
            c018905p.setMargins(0, ((height - _$_findCachedViewById(i).getBottom()) - _$_findCachedViewById(R.id.gb).getHeight()) / 2, 0, 0);
            _$_findCachedViewById(R.id.gb).setLayoutParams(c018905p);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        Window window;
        super.onCreate();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            LIZ.setRequestedOrientation(1);
        }
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null && (window = LIZ2.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (window = LIZ.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    public void v3() {
        int i;
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        Window window2;
        View decorView2;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (window2 = LIZ.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
            i = decorView2.getHeight();
        } else {
            i = 0;
        }
        this.LJLIL = i;
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null && (window = LIZ2.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
    }

    public final void x3() {
        if (getContext() != null && C91927a2V.LIZ != 0) {
            C018905p c018905p = new C018905p(-2, -2);
            int i = R.id.gd;
            c018905p.topToBottom = R.id.gd;
            c018905p.leftToLeft = 0;
            c018905p.rightToRight = 0;
            int i2 = C91927a2V.LIZ;
            View bnpl_pin_message = _$_findCachedViewById(R.id.gd);
            o.LJIIIIZZ(bnpl_pin_message, "bnpl_pin_message");
            if (bnpl_pin_message.getVisibility() != 0) {
                i = R.id.gj;
            }
            c018905p.setMargins(0, ((i2 - _$_findCachedViewById(i).getBottom()) - _$_findCachedViewById(R.id.gb).getHeight()) / 2, 0, 0);
            _$_findCachedViewById(R.id.gb).setLayoutParams(c018905p);
        }
    }
}
