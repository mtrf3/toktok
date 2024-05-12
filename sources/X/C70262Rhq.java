package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Rhq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70262Rhq extends TuxTextView implements InterfaceC70267Rhv<C70256Rhk> {
    public C70256Rhk LJLLLL;
    public final java.util.Map<Integer, View> LJLLLLLL;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJLLLLLL;
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

    @Override // X.InterfaceC70267Rhv
    public final void LJFF() {
        C70256Rhk m35getUiData = m35getUiData();
        if (m35getUiData == null) {
            return;
        }
        setUiData(C70256Rhk.LIZJ(m35getUiData, false, false, true, 7));
        if (m35getUiData.LIZJ) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
            setBackgroundResource(R.drawable.ac9);
            return;
        }
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context2));
        setBackgroundResource(R.drawable.ac7);
    }

    @Override // X.InterfaceC70267Rhv
    public final void LJJIFFI() {
        C70256Rhk m35getUiData = m35getUiData();
        if (m35getUiData == null) {
            return;
        }
        setUiData(C70256Rhk.LIZJ(m35getUiData, false, true, true, 7));
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
        setBackgroundResource(R.drawable.ac6);
    }

    @Override // X.InterfaceC70267Rhv
    public final void LJJIII() {
        C70256Rhk m35getUiData = m35getUiData();
        if (m35getUiData == null) {
            return;
        }
        setUiData(C70256Rhk.LIZJ(m35getUiData, false, false, false, 7));
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context));
        setBackgroundResource(R.drawable.ac7);
    }

    /* renamed from: getUiData, reason: merged with bridge method [inline-methods] */
    public C70256Rhk m35getUiData() {
        return this.LJLLLL;
    }

    @Override // X.InterfaceC70267Rhv
    public final void LJJ(InterfaceC70269Rhx interfaceC70269Rhx) {
        if (interfaceC70269Rhx instanceof C70256Rhk) {
            C70256Rhk c70256Rhk = (C70256Rhk) interfaceC70269Rhx;
            setText(c70256Rhk.LIZIZ);
            setUiData(c70256Rhk);
        }
    }

    public void setUiData(C70256Rhk c70256Rhk) {
        this.LJLLLL = c70256Rhk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70262Rhq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        this.LJLLLLLL = C62850Ola.LJFF(context, "context");
        setTuxFont(51);
        setLayoutParams(new ViewGroup.LayoutParams(-2, C7MY.LIZIZ(36)));
        setMinWidth(C17N.LJIILL(78.0f));
        double d = 16.0f;
        setPadding(C17N.LJIILL(d), 0, C17N.LJIILL(d), 0);
        setGravity(17);
    }
}
