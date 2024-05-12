package X;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.3qI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96343qI extends C19K {
    public ArrayList<TextWatcher> LJLJJLL;

    public final void LJI() {
        ArrayList<TextWatcher> arrayList = this.LJLJJLL;
        if (arrayList != null) {
            o.LJI(arrayList);
            Iterator<TextWatcher> it = arrayList.iterator();
            while (it.hasNext()) {
                super.removeTextChangedListener(it.next());
            }
            ArrayList<TextWatcher> arrayList2 = this.LJLJJLL;
            o.LJI(arrayList2);
            arrayList2.clear();
            this.LJLJJLL = null;
        }
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher watcher) {
        o.LJIIIZ(watcher, "watcher");
        if (this.LJLJJLL == null) {
            this.LJLJJLL = new ArrayList<>();
        }
        ArrayList<TextWatcher> arrayList = this.LJLJJLL;
        o.LJI(arrayList);
        arrayList.add(watcher);
        super.addTextChangedListener(watcher);
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher watcher) {
        ArrayList<TextWatcher> arrayList;
        o.LJIIIZ(watcher, "watcher");
        ArrayList<TextWatcher> arrayList2 = this.LJLJJLL;
        if (arrayList2 != null && arrayList2.indexOf(watcher) >= 0 && (arrayList = this.LJLJJLL) != null) {
            arrayList.remove(watcher);
        }
        super.removeTextChangedListener(watcher);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C96343qI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "ctx");
    }
}
