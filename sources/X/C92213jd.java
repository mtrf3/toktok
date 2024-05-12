package X;

import Y.ACListenerS36S0200000_1;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.3jd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92213jd extends LinearLayout implements C3PY {
    public final java.util.Map<Integer, View> LJLIL;

    public C92213jd() {
        throw null;
    }

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLIL;
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
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C3PX.onCreate(this);
    }

    @Override // X.C3PY
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C3PX.onDestroy(this);
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
    public C92213jd(Context context, int i, InterfaceC88472Yns interfaceC88472Yns) {
        super(context, null, 0);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        setOrientation(1);
        setGravity(1);
        C16880lQ.LLLZIIL(R.layout.b_l, C16880lQ.LLZIL(context), this);
        C16880lQ.LJJJ((TuxIconView) LIZ(R.id.f0h), new ACListenerS36S0200000_1(interfaceC88472Yns, this, 21));
        ImageView imageView = (ImageView) LIZ(R.id.fcn);
        C33381Ss c33381Ss = new C33381Ss();
        c33381Ss.LJLIL = R.drawable.bby;
        imageView.setImageDrawable(c33381Ss.LIZ(context));
        ((TextView) LIZ(R.id.an4)).setText(context.getString(R.string.rnw));
        ((TextView) LIZ(R.id.an7)).setText(context.getString(R.string.rnx));
        ((TextView) LIZ(R.id.an_)).setText(context.getString(R.string.rny));
        if (i == EnumC91123hs.EDUCATION_SHEET_GOT_IT.getValue()) {
            C17N.LJJLIIIJJI(LIZ(R.id.i4c));
            C17N.LJJIIJZLJL(LIZ(R.id.jjo));
            ((TextView) LIZ(R.id.i4c)).setText(context.getString(R.string.rnz));
            C16880lQ.LJJIZ((SY4) LIZ(R.id.i4c), new ACListenerS36S0200000_1(interfaceC88472Yns, this, 22));
            return;
        }
        if (i != EnumC91123hs.EDUCATION_SHEET_CREATE_AND_NOT_NOW.getValue()) {
            return;
        }
        C17N.LJJLIIIJJI(LIZ(R.id.i4c));
        C17N.LJJLIIIJJI(LIZ(R.id.jjo));
        ((TextView) LIZ(R.id.i4c)).setText(context.getString(R.string.rno));
        ((TextView) LIZ(R.id.jjo)).setText(context.getString(R.string.ivd));
        C16880lQ.LJJIZ((SY4) LIZ(R.id.i4c), new ACListenerS36S0200000_1(interfaceC88472Yns, this, 23));
        C16880lQ.LJJIZ((SY4) LIZ(R.id.jjo), new ACListenerS36S0200000_1(interfaceC88472Yns, this, 24));
    }
}
