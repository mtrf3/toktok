package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.7Vj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186957Vj extends ConstraintLayout {
    public static final /* synthetic */ int LJLJI = 0;
    public String LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    public final String getCloseType() {
        return this.LJLIL;
    }

    public final void setCloseType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C186957Vj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
        View.inflate(context, R.layout.bsg, this);
        this.LJLIL = "other";
    }
}
