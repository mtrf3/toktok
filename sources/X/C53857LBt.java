package X;

import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.LBt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53857LBt extends RelativeLayout {
    public final C62822Ol8 LJLIL;
    public InterfaceC53858LBu LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final NLW getFeedAdDepend() {
        return (NLW) this.LJLIL.getValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Context context = getContext();
        o.LJIIIIZZ(context, "this.context");
        setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.ee, context));
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS29S0100000_9(this, 6)));
    }

    public final InterfaceC53858LBu getCallback() {
        return this.LJLILLLLZI;
    }

    public final void setCallback(InterfaceC53858LBu interfaceC53858LBu) {
        this.LJLILLLLZI = interfaceC53858LBu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53857LBt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJI = C62850Ola.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(C58953NBt.LJLIL);
    }
}
