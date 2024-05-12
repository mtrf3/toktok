package X;

import Y.ACListenerS10S1101000_1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4XS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4XS extends ConstraintLayout {
    public static final /* synthetic */ int LJLJJI = 0;
    public final List<List<TuxTextView>> LJLIL;
    public C4XW LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLJI;
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

    public final void setEmojiDataList(List<String> emojiList) {
        int i;
        TuxTextView tuxTextView;
        o.LJIIIZ(emojiList, "emojiList");
        int size = emojiList.size();
        if (size < 2) {
            return;
        }
        int min = Math.min(size / 2, 4);
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            List list = (List) it.next();
            while (i < min) {
                View view = (View) ORZ.LJLLLLLL(i, list);
                if (view != null) {
                    C17N.LJJLIIIJJI(view);
                }
                i++;
            }
            for (int i2 = min; i2 < 4; i2++) {
                View view2 = (View) ORZ.LJLLLLLL(i2, list);
                if (view2 != null) {
                    C17N.LJJIIJZLJL(view2);
                }
            }
        }
        int i3 = min * 2;
        while (i < i3) {
            int i4 = i % min;
            List list2 = (List) ORZ.LJLLLLLL(i / min, this.LJLIL);
            if (list2 != null) {
                tuxTextView = (TuxTextView) ORZ.LJLLLLLL(i4, list2);
            } else {
                tuxTextView = null;
            }
            String str = (String) ORZ.LJLLLLLL(i, emojiList);
            if (str == null) {
                str = "";
            }
            if (tuxTextView != null) {
                tuxTextView.setText((CharSequence) ORZ.LJLLLLLL(i, emojiList));
                C16880lQ.LJJJJI(tuxTextView, new ACListenerS10S1101000_1(this, str, i, 0));
            }
            i++;
        }
    }

    public final void setEmojiViewSize(float f) {
        Iterator<List<TuxTextView>> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            Iterator<TuxTextView> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().LJJJ(f);
            }
        }
    }

    public final void setIncludePadding(boolean z) {
        Iterator<List<TuxTextView>> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            Iterator<TuxTextView> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().setIncludeFontPadding(z);
            }
        }
    }

    public final void setOnEmojiSelected(C4XW c4xw) {
        this.LJLILLLLZI = c4xw;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4XS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4XS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJI = C62850Ola.LJFF(context, "context");
        ArrayList arrayList = new ArrayList();
        this.LJLIL = arrayList;
        ViewGroup.inflate(context, R.layout.b76, this);
        arrayList.add(C47261Igj.LJJIJIIJI(_$_findCachedViewById(R.id.ctt), _$_findCachedViewById(R.id.ctu), _$_findCachedViewById(R.id.ctv), _$_findCachedViewById(R.id.ctw)));
        arrayList.add(C47261Igj.LJJIJIIJI(_$_findCachedViewById(R.id.ctx), _$_findCachedViewById(R.id.cty), _$_findCachedViewById(R.id.ctz), _$_findCachedViewById(R.id.cu0)));
    }
}
