package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateJNI;
import com.bytedance.ies.nle.editor_jni.SetString;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.Yp2, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88544Yp2 implements Iterator<String> {
    public SetString.Iterator LJLIL;
    public SetString.Iterator LJLILLLLZI;
    public final /* synthetic */ SetString LJLJI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        long j;
        SetString.Iterator iterator = this.LJLIL;
        SetString.Iterator iterator2 = this.LJLILLLLZI;
        long j2 = iterator.LIZ;
        if (iterator2 == null) {
            j = 0;
        } else {
            j = iterator2.LIZ;
        }
        return NLETemplateJNI.SetString_Iterator_isNot(j2, iterator, j, iterator2);
    }

    @Override // java.util.Iterator
    public final String next() {
        if (hasNext()) {
            SetString.Iterator iterator = this.LJLIL;
            String SetString_Iterator_derefUnchecked = NLETemplateJNI.SetString_Iterator_derefUnchecked(iterator.LIZ, iterator);
            SetString.Iterator iterator2 = this.LJLIL;
            NLETemplateJNI.SetString_Iterator_incrementUnchecked(iterator2.LIZ, iterator2);
            return SetString_Iterator_derefUnchecked;
        }
        throw new NoSuchElementException();
    }

    public C88544Yp2(SetString setString) {
        this.LJLJI = setString;
    }
}
