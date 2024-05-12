package X;

import Y.AfS18S1100000_3;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.nows.feed.common.MarkReadApi;
import com.ss.android.ugc.aweme.nows.feed.common.MarkReadRequest;
import com.ss.android.ugc.aweme.nows.feed.common.MarkReadRequestPayload;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS39S1000000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.7NP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7NP {
    public static final /* synthetic */ C7NP LIZ = new C7NP();
    public static final MarkReadApi LIZIZ;
    public static final CopyOnWriteArrayList<String> LIZJ;
    public static final CopyOnWriteArrayList<String> LIZLLL;

    static {
        IRetrofitFactory LIZLLL2 = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (MarkReadApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL2, str).LIZ.LIZ(MarkReadApi.class);
        LIZJ = new CopyOnWriteArrayList<>();
        LIZLLL = new CopyOnWriteArrayList<>();
    }

    public static void LIZ(int i, String aid, C7NO state, String str, String str2) {
        int i2;
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(state, "state");
        if (str2 != null) {
            C72085SQv.LJ(new AqS39S1000000_1(str2, 3));
        }
        try {
            SettingsManager.LIZLLL().getClass();
            i2 = SettingsManager.LJ("now_mark_read_report", 1);
        } catch (Throwable unused) {
            i2 = 1;
        }
        if (i2 == 1) {
            try {
                MarkReadRequest markReadRequest = new MarkReadRequest(i, CastLongProtector.parseLong(aid), state.getValue());
                if (state == C7NO.BLUR) {
                    CopyOnWriteArrayList<String> copyOnWriteArrayList = LIZJ;
                    if (copyOnWriteArrayList.contains(aid)) {
                        return;
                    }
                    copyOnWriteArrayList.add(aid);
                    if (copyOnWriteArrayList.size() >= 100) {
                        ORS.LJJLJLI(copyOnWriteArrayList);
                    }
                }
                if (state == C7NO.VISIBLE) {
                    CopyOnWriteArrayList<String> copyOnWriteArrayList2 = LIZLLL;
                    if (copyOnWriteArrayList2.contains(aid)) {
                        return;
                    }
                    copyOnWriteArrayList2.add(aid);
                    if (copyOnWriteArrayList2.size() >= 100) {
                        ORS.LJJLJLI(copyOnWriteArrayList2);
                    }
                }
                LIZIZ.markRead(new MarkReadRequestPayload(C47261Igj.LJII(markReadRequest))).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS18S1100000_3(aid, state, 1), new AfS18S1100000_3(aid, state, 2));
            } catch (Exception unused2) {
            }
        }
    }
}
