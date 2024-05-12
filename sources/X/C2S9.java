package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.2S9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2S9 extends RelationButton {
    public final java.util.Map<Integer, View> LLIIIZ;

    @Override // com.ss.android.ugc.aweme.relation.follow.ui.RelationButton, X.SY4, com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLIIIZ;
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
    public C2S9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.jo, 8);
        this.LLIIIZ = C62850Ola.LJFF(context, "context");
    }
}
