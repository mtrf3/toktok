package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.UnorderedMapStrStr;
import java.util.Map;

/* renamed from: X.4oL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120614oL implements Map.Entry<String, String> {
    public UnorderedMapStrStr.Iterator LJLIL;
    public final /* synthetic */ UnorderedMapStrStr LJLILLLLZI;

    @Override // java.util.Map.Entry
    public final String getKey() {
        UnorderedMapStrStr.Iterator iterator = this.LJLIL;
        return NLEEditorJniJNI.UnorderedMapStrStr_Iterator_getKey(iterator.LIZ, iterator);
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        UnorderedMapStrStr.Iterator iterator = this.LJLIL;
        return NLEEditorJniJNI.UnorderedMapStrStr_Iterator_getValue(iterator.LIZ, iterator);
    }

    public C120614oL(UnorderedMapStrStr unorderedMapStrStr) {
        this.LJLILLLLZI = unorderedMapStrStr;
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        UnorderedMapStrStr.Iterator iterator = this.LJLIL;
        String UnorderedMapStrStr_Iterator_getValue = NLEEditorJniJNI.UnorderedMapStrStr_Iterator_getValue(iterator.LIZ, iterator);
        UnorderedMapStrStr.Iterator iterator2 = this.LJLIL;
        NLEEditorJniJNI.UnorderedMapStrStr_Iterator_setValue(iterator2.LIZ, iterator2, str);
        return UnorderedMapStrStr_Iterator_getValue;
    }
}
