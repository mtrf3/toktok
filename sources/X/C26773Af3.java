package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.o;

/* renamed from: X.Af3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26773Af3 extends TuxTextView {
    public static final /* synthetic */ int LJZ = 0;
    public final SimpleDateFormat LJLLLL;
    public InterfaceC65784Pro<C76800UCe> LJLLLLLL;
    public final java.util.Map<Integer, View> LJLZ;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJLZ;
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

    public final void setTimeEndListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLLLLL = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26773Af3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLZ = C62850Ola.LJFF(context, "context");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        this.LJLLLL = simpleDateFormat;
        if (isInEditMode()) {
            LJJJIL(86339999L, false);
        }
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    public final void LJJJIL(long j, boolean z) {
        try {
            if (j <= 0) {
                setVisibility(8);
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLLLLLL;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                this.LJLLLLLL = null;
                return;
            }
            if (j >= 86400000) {
                String valueOf = String.valueOf((int) ((((((float) j) / 1000.0f) / 60.0f) / 60.0f) / 24.0f));
                if (!z) {
                    setTuxFont(92);
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context));
                }
                setText(valueOf);
                return;
            }
            setText(this.LJLLLL.format(new Date(j)));
            if (!z) {
                setTuxFont(92);
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context2));
            }
        } catch (Exception unused) {
        }
    }
}
