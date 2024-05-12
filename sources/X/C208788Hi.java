package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8Hi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208788Hi extends SY4 implements InterfaceC208818Hl {
    public final java.util.Map<Integer, View> LLIIIILZ;

    @Override // X.SY4, com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLIIIILZ;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208788Hi(Context context) {
        super(context, null, 6, 0);
        this.LLIIIILZ = C62850Ola.LJFF(context, "context");
    }

    @Override // X.InterfaceC208818Hl
    public void setNewIcon(int i) {
        setButtonStartIcon(Integer.valueOf(i));
        int LIZJ = (int) KL2.LIZJ(getContext(), 20.0f);
        setIconHeight(LIZJ);
        setIconWidth(LIZJ);
    }

    @Override // X.InterfaceC208818Hl
    public final C208788Hi LJIIJJI(String str, EnumC208808Hk type) {
        o.LJIIIZ(type, "type");
        setEnabled(true);
        setText(str);
        int i = C208798Hj.LIZ[type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                setButtonVariant(5);
            }
        } else {
            setButtonVariant(0);
        }
        setButtonSize(3);
        return this;
    }
}
