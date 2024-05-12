package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.MgZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57443MgZ extends SY4 {
    public final InterfaceC57447Mgd LLIIIILZ;
    public final java.util.Map<Integer, View> LLIIIJ;

    @Override // X.SY4, com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLIIIJ;
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

    public final InterfaceC57447Mgd getListener() {
        return this.LLIIIILZ;
    }

    @Override // X.SY4
    public void setButtonVariant(int i) {
        E0X e0x;
        if (i == EnumC57444Mga.TT_NOW_INVITE.getValue()) {
            e0x = new E0X(R.attr.dj, getContext().getDrawable(R.drawable.aup), 1.0f);
        } else if (i == EnumC57444Mga.TT_NOW_INVITED.getValue()) {
            e0x = new E0X(R.attr.dj, getContext().getDrawable(R.drawable.aup), 0.3f);
        } else {
            return;
        }
        setTextColorRes(e0x.LIZ);
        setBackground(e0x.LIZIZ);
        setAlpha(e0x.LIZJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57443MgZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.jo);
        o.LJIIIZ(context, "context");
        C57448Mge listener = C77266UUc.LIZIZ.LIZ().LIZ(context);
        o.LJIIIZ(listener, "listener");
        this.LLIIIJ = new LinkedHashMap();
        this.LLIIIILZ = listener;
    }
}
