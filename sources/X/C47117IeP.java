package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.IeP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C47117IeP implements InterfaceC47125IeX {
    @Override // X.InterfaceC47125IeX
    public Object apply(Object obj) {
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) obj;
        if (simVideoUrlModel == null || simVideoUrlModel.getBitRate() == null) {
            return null;
        }
        if (simVideoUrlModel.getBitRate().size() == 1) {
            return ListProtector.get(simVideoUrlModel.getBitRate(), 0);
        }
        return ListProtector.get(simVideoUrlModel.getBitRate(), simVideoUrlModel.getBitRate().size() - 2);
    }

    public static Iterator LIZ(android.net.Uri uri, String str) {
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        o.LJIIIIZZ(queryParameterNames, str);
        return queryParameterNames.iterator();
    }
}
