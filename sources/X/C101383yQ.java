package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3yQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101383yQ extends LinearLayout implements C3PY {
    public C73318Sq2 LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLILLLLZI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C3PY
    public final void onDestroy() {
        C3PX.onDestroy(this);
        this.LJLIL.LIZLLL();
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C3PX.onCreate(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C3PX.onPause(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C3PX.onResume(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C3PX.onStart(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C3PX.onStop(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C101383yQ(final Context context, final EnumC101413yT style) {
        super(context, null, 0);
        int i;
        int i2;
        Lifecycle lifecycle;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(style, "style");
        this.LJLILLLLZI = new LinkedHashMap();
        this.LJLIL = new C73318Sq2();
        setOrientation(1);
        setGravity(1);
        C16880lQ.LLLZIIL(R.layout.b10, C16880lQ.LLZIL(context), this);
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (lifecycle = LJJIFFI.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(((RBX) HG3.LJIILL()).getCurUser().getAvatarThumb()));
        LJII.LJJIIJ = (SmartImageView) LIZ(R.id.abh);
        S3I s3i = new S3I();
        s3i.LIZ = true;
        s3i.LIZIZ = C32151Nz.LJIIZILJ(Double.valueOf(0.5d));
        Integer LJI = C79045V0n.LJI(R.attr.dz, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        s3i.LIZJ = i;
        LJII.LJIJJLI = new S3L(s3i);
        C16880lQ.LLJJJ(LJII);
        C16880lQ.LJJJ((TuxIconView) LIZ(R.id.f0h), new ACListenerS21S0100000_1(this, 211));
        View LIZ = LIZ(R.id.bt_);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
        c110614Vt.LIZJ = C61328O5c.LIZJ(8);
        LIZ.setBackground(c110614Vt.LIZ(context));
        View LIZ2 = LIZ(R.id.ker);
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZLLL = AnonymousClass391.LIZJ(2);
        c110614Vt2.LIZJ = C61328O5c.LIZJ(40);
        c110614Vt2.LJFF = Integer.valueOf(R.attr.ck);
        c110614Vt2.LIZIZ = Integer.valueOf(R.attr.cl);
        LIZ2.setBackground(c110614Vt2.LIZ(context));
        ((TextView) LIZ(R.id.an4)).setText(context.getString(R.string.rlh));
        ((TextView) LIZ(R.id.an7)).setText(context.getString(R.string.rli));
        String string = context.getString(R.string.rlk);
        o.LJIIIIZZ(string, "context.getString(R.stri…abel_panel_body3_txt_btn)");
        String string2 = context.getString(R.string.rlj);
        o.LJIIIIZZ(string2, "context.getString(R.stri…status_label_panel_body3)");
        String LIZIZ = Q8U.LIZIZ(new Object[]{string}, 1, string2, "format(format, *args)");
        SpannableString spannableString = new SpannableString(LIZIZ);
        int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, string, 0, false, 6);
        int length = string.length() + LJJLIIIJL;
        if (LJJLIIIJL >= 0 && length >= 0) {
            spannableString.setSpan(new ClickableSpan() { // from class: X.3yR
                @Override // android.text.style.ClickableSpan
                public final void onClick(View widget) {
                    o.LJIIIZ(widget, "widget");
                    SmartRouter.buildRoute(context, "aweme://chatcontrol/setting").open();
                    if (style == EnumC101413yT.O18) {
                        ASQ.LIZLLL(this, new C101463yY(true));
                    } else {
                        ASQ.LIZLLL(this, new C101463yY(false));
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint ds) {
                    o.LJIIIZ(ds, "ds");
                    ds.setUnderlineText(false);
                }
            }, LJJLIIIJL, length, 33);
            spannableString.setSpan(new T5U(42, false), LJJLIIIJL, length, 33);
            Integer LJI2 = C79045V0n.LJI(R.attr.go, context);
            if (LJI2 != null) {
                i2 = LJI2.intValue();
            } else {
                i2 = 0;
            }
            spannableString.setSpan(new ForegroundColorSpan(i2), LJJLIIIJL, length, 33);
        }
        ((TextView) LIZ(R.id.an_)).setText(spannableString);
        ((TextView) LIZ(R.id.an_)).setMovementMethod(LinkMovementMethod.getInstance());
        int i3 = C101403yS.LIZ[style.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return;
            }
            ((TextView) LIZ(R.id.title)).setText(context.getString(R.string.rlo));
            ((TextView) LIZ(R.id.i4c)).setText(context.getString(R.string.rln));
            ((TextView) LIZ(R.id.jjo)).setText(context.getString(R.string.rlm));
            C16880lQ.LJJIZ((SY4) LIZ(R.id.i4c), new ACListenerS21S0100000_1(this, 213));
            C16880lQ.LJJIZ((SY4) LIZ(R.id.jjo), new ACListenerS21S0100000_1(this, 214));
            return;
        }
        ((TextView) LIZ(R.id.title)).setText(context.getString(R.string.rlg));
        LIZ(R.id.jjo).setVisibility(8);
        View LIZ3 = LIZ(R.id.i4c);
        ViewGroup.LayoutParams layoutParams = LIZ(R.id.i4c).getLayoutParams();
        layoutParams.width = -1;
        LIZ3.setLayoutParams(layoutParams);
        ((TextView) LIZ(R.id.i4c)).setText(context.getString(R.string.rll));
        View primary_button = LIZ(R.id.i4c);
        o.LJIIIIZZ(primary_button, "primary_button");
        C26338AVi.LJI(primary_button, 0, 0, 0, 0, false, 16);
        C16880lQ.LJJIZ((SY4) LIZ(R.id.i4c), new ACListenerS21S0100000_1(this, 212));
    }
}
