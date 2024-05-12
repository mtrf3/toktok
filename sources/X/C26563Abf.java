package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Abf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26563Abf extends ConstraintLayout {
    public final java.util.Map<Integer, View> LJLIL;

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    public final void setAddressCardInfo(C26566Abi item) {
        boolean z;
        int i;
        o.LJIIIZ(item, "item");
        int i2 = 0;
        if (item.LJIIL || o.LJ(item.LJIIJ, Boolean.FALSE)) {
            z = true;
        } else {
            z = false;
        }
        TuxTextView setAddressCardInfo$lambda$0 = (TuxTextView) _$_findCachedViewById(R.id.mvu);
        o.LJIIIIZZ(setAddressCardInfo$lambda$0, "setAddressCardInfo$lambda$0");
        OUP.LJJLIIIJILLIZJL(setAddressCardInfo$lambda$0, item.LIZIZ);
        int i3 = R.attr.gp;
        if (z) {
            i = R.attr.gp;
        } else {
            i = R.attr.go;
        }
        setAddressCardInfo$lambda$0.setTextColorRes(i);
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.mvt);
        tuxTextView.setText(item.LJIIJJI);
        if (!z) {
            i3 = R.attr.go;
        }
        tuxTextView.setTextColorRes(i3);
        tuxTextView.setLineSpacing(C45804HyK.LJJ(4), 1.0f);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.mvr);
        ((TextView) _$_findCachedViewById.findViewById(R.id.mvq)).setText(item.LJIIIIZZ);
        if (!o.LJ(item.LJIIJ, Boolean.FALSE)) {
            i2 = 8;
        }
        _$_findCachedViewById.setVisibility(i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26563Abf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26563Abf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a94, this, true);
        setVisibility(0);
    }
}
