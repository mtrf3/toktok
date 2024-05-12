package X;

import com.bytedance.ies.nle.editor_jni.MapStrStr;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import java.util.Map;

/* renamed from: X.4oK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120604oK implements Map.Entry<String, String> {
    public MapStrStr.Iterator LJLIL;
    public final /* synthetic */ MapStrStr LJLILLLLZI;

    @Override // java.util.Map.Entry
    public final String getKey() {
        MapStrStr.Iterator iterator = this.LJLIL;
        return NLEEditorJniJNI.MapStrStr_Iterator_getKey(iterator.LIZ, iterator);
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        MapStrStr.Iterator iterator = this.LJLIL;
        return NLEEditorJniJNI.MapStrStr_Iterator_getValue(iterator.LIZ, iterator);
    }

    public C120604oK(MapStrStr mapStrStr) {
        this.LJLILLLLZI = mapStrStr;
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        MapStrStr.Iterator iterator = this.LJLIL;
        String MapStrStr_Iterator_getValue = NLEEditorJniJNI.MapStrStr_Iterator_getValue(iterator.LIZ, iterator);
        MapStrStr.Iterator iterator2 = this.LJLIL;
        NLEEditorJniJNI.MapStrStr_Iterator_setValue(iterator2.LIZ, iterator2, str);
        return MapStrStr_Iterator_getValue;
    }
}
