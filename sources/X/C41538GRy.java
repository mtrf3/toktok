package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: X.GRy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41538GRy<T> implements Comparator {
    public static final C41538GRy<T> LJLIL = new C41538GRy<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AVTextExtraStruct extra1 = (AVTextExtraStruct) obj;
        AVTextExtraStruct extra2 = (AVTextExtraStruct) obj2;
        o.LJIIIZ(extra1, "extra1");
        o.LJIIIZ(extra2, "extra2");
        return o.LJIIJJI(extra1.start, extra2.start);
    }
}
