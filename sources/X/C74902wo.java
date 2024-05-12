package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74902wo extends TuxTextView {
    public boolean LJLLLL;
    public InterfaceC70422pa LJLLLLLL;
    public final java.util.Map<Integer, View> LJLZ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C74902wo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

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

    public final boolean getNeedTranslate() {
        return this.LJLLLL;
    }

    public final InterfaceC70422pa getScope() {
        return this.LJLLLLLL;
    }

    public final void setNeedTranslate(boolean z) {
        this.LJLLLL = z;
    }

    public final void setScope(InterfaceC70422pa interfaceC70422pa) {
        this.LJLLLLLL = interfaceC70422pa;
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.LJLLLL || charSequence == null || ujb.o.LJJJJJL(charSequence)) {
            super.setText(charSequence, bufferType);
            return;
        }
        InterfaceC70422pa interfaceC70422pa = this.LJLLLLLL;
        if (interfaceC70422pa == null) {
            return;
        }
        XKX.LIZLLL(interfaceC70422pa, null, null, new C74882wm(bufferType, this, charSequence, null), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C74902wo(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r3, r0)
            r2.LJLZ = r0
            r0 = 0
            r2.<init>(r3, r4, r0)
            r2.LJLLLL = r0
            X.1qj r0 = X.C45804HyK.LJJIFFI(r3)
            if (r0 == 0) goto L27
            X.1qj r0 = X.C45804HyK.LJJIFFI(r3)
            if (r0 == 0) goto L24
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
        L24:
            r2.LJLLLLLL = r1
            return
        L27:
            X.XIA r0 = X.C78613UtF.LIZJ
            X.2gm r1 = X.C48841JEv.LIZ(r0)
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74902wo.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
