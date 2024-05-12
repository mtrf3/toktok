package X;

import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import java.util.Map;

/* renamed from: X.HoC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45176HoC implements Map.Entry<String, String> {
    public UnorderedMapStrStr.Iterator LJLIL;
    public final /* synthetic */ UnorderedMapStrStr LJLILLLLZI;

    @Override // java.util.Map.Entry
    public final String getKey() {
        UnorderedMapStrStr.Iterator iterator = this.LJLIL;
        return SmartMovieJniJNI.UnorderedMapStrStr_Iterator_getKey(iterator.LIZ, iterator);
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        UnorderedMapStrStr.Iterator iterator = this.LJLIL;
        return SmartMovieJniJNI.UnorderedMapStrStr_Iterator_getValue(iterator.LIZ, iterator);
    }

    public C45176HoC(UnorderedMapStrStr unorderedMapStrStr) {
        this.LJLILLLLZI = unorderedMapStrStr;
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        UnorderedMapStrStr.Iterator iterator = this.LJLIL;
        String UnorderedMapStrStr_Iterator_getValue = SmartMovieJniJNI.UnorderedMapStrStr_Iterator_getValue(iterator.LIZ, iterator);
        UnorderedMapStrStr.Iterator iterator2 = this.LJLIL;
        SmartMovieJniJNI.UnorderedMapStrStr_Iterator_setValue(iterator2.LIZ, iterator2, str);
        return UnorderedMapStrStr_Iterator_getValue;
    }
}
