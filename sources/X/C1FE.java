package X;

import android.view.MotionEvent;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableTypeWrapper;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import kotlin.jvm.internal.o;

/* renamed from: X.1FE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1FE implements InterfaceC73786Sxa, InterfaceC48038ItG, InterfaceC73592SuS {
    public static final C1FE LJLIL = new C1FE();
    public static final C1FE LJLILLLLZI = new C1FE();

    public /* synthetic */ C1FE(SearchMixFeedList searchMixFeedList) {
    }

    public /* synthetic */ C1FE() {
    }

    public static final F59 LIZ(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        return new F59(readableArray);
    }

    public static final F58 LIZIZ(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        return new F58(readableMap);
    }

    public static final ReadableTypeWrapper LIZJ(ReadableType readableType) {
        if (readableType == null) {
            return null;
        }
        switch (F4X.LIZ[readableType.ordinal()]) {
            case 1:
                return ReadableTypeWrapper.Boolean;
            case 2:
                return ReadableTypeWrapper.Int;
            case 3:
                return ReadableTypeWrapper.Number;
            case 4:
                return ReadableTypeWrapper.String;
            case 5:
                return ReadableTypeWrapper.Map;
            case 6:
                return ReadableTypeWrapper.Array;
            case 7:
                return ReadableTypeWrapper.Long;
            case 8:
                return ReadableTypeWrapper.ByteArray;
            default:
                return ReadableTypeWrapper.Null;
        }
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        SearchApiResult it = (SearchApiResult) obj;
        o.LJIIIZ(it, "it");
        C62848OlY.LJ(it);
        return it;
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        MotionEvent ev = (MotionEvent) obj;
        o.LJIIIZ(ev, "ev");
        if (ev.getActionMasked() == 2) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73786Sxa
    public boolean test(Object t1, Object t2) {
        o.LJIIIZ(t1, "t1");
        o.LJIIIZ(t2, "t2");
        return false;
    }
}
