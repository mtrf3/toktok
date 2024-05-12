package X;

import Y.ACallableS7S2100000_1;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.3tP */
/* loaded from: classes2.dex */
public final class C98273tP {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(String str, Aweme aweme, String str2) {
        if (!IFH.LIZ(aweme) || aweme == null || TextUtils.isEmpty(aweme.getAid()) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        C10K.LIZIZ(new ACallableS7S2100000_1(str, aweme, str2, 1), FMX.LIZIZ(), null);
    }

    public static void LIZLLL(String str, Aweme aweme, String str2) {
        if (!IFH.LIZ(aweme) || aweme == null || TextUtils.isEmpty(aweme.getAid()) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        C10K.LIZIZ(new ACallableS7S2100000_1(str, aweme, str2, 2), FMX.LIZIZ(), null);
    }

    public static /* synthetic */ void LIZIZ(Aweme aweme, String str, String str2, float f) {
        LIZ(aweme, str, str2, f, new HashMap());
    }

    public static void LIZ(final Aweme aweme, final String str, final String str2, final float f, final HashMap extraParam) {
        o.LJIIIZ(extraParam, "extraParam");
        if (!IFH.LIZ(aweme) || aweme == null || TextUtils.isEmpty(aweme.getAid()) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        C10K.LIZIZ(new Callable() { // from class: X.3tO
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str3;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("group_id", Aweme.this.getAid());
                c188727au.LJIIIZ("author_id", Aweme.this.getAuthorUid());
                c188727au.LJIIIZ("enter_from", str);
                c188727au.LJIIIZ("enter_method", str2);
                c188727au.LJIIIZ("speed_mode", String.valueOf(f));
                String str4 = "1";
                if (!C53946LFe.LIZIZ().LJFF) {
                    str3 = "1";
                } else {
                    str3 = "3";
                }
                c188727au.LJIIIZ("pad_interface_orientation", str3);
                c188727au.LIZLLL(0, "is_landscape_screen");
                if (!Aweme.this.isPaidContent) {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au.LJIIIZ("is_collection_item", str4);
                java.util.Set<Map.Entry<String, Object>> entrySet = extraParam.entrySet();
                o.LJIIIIZZ(entrySet, "extraParam.entries");
                for (Map.Entry<String, Object> entry : entrySet) {
                    c188727au.LJFF(entry.getValue(), entry.getKey());
                }
                FMX.LJIIL("change_video_speed", c188727au.LIZ);
                return C76800UCe.LIZ;
            }
        }, FMX.LIZIZ(), null);
    }
}
