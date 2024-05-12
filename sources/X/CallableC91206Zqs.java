package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.dsp.playpage.model.DspMusicPlayedInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.Zqs, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class CallableC91206Zqs<V> implements Callable {
    public static final CallableC91206Zqs<V> LJLIL = new CallableC91206Zqs<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long currentTimeMillis = System.currentTimeMillis();
        Gson gson = (Gson) C91207Zqt.LIZ.getValue();
        List LIZ = ((IUT) C91207Zqt.LIZIZ.getValue()).LIZ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : LIZ) {
            if (((DspMusicPlayedInfo) obj).LJLIL + ((Number) C91207Zqt.LIZJ.getValue()).longValue() > currentTimeMillis) {
                arrayList.add(obj);
            }
        }
        return GsonProtectorUtils.toJson(gson, ORZ.LLILII(new C91205Zqr(), arrayList));
    }
}
