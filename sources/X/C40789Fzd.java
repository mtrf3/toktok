package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Fzd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40789Fzd {
    public static C40788Fzc LIZ() {
        C40865G2b LIZLLL = C38986FRu.LIZ().LIZLLL(EF7.LIZIZ(), Boolean.FALSE, false);
        Context LIZIZ = EF7.LIZIZ();
        InputStream open = LIZIZ.getAssets().open("interest_list/interest_list_" + ((String) C40859G1v.LIZLLL.getValue()) + ".json");
        o.LJIIIIZZ(open, "context.assets.open(\"int…getDefaultDataName.json\")");
        Reader inputStreamReader = new InputStreamReader(open, PVC.LIZ);
        if (!(inputStreamReader instanceof BufferedReader)) {
            inputStreamReader = new BufferedReader(inputStreamReader, FileUtils.BUFFER_SIZE);
        }
        try {
            String LJIILJJIL = C77321UWf.LJIILJJIL(inputStreamReader);
            AnonymousClass636.LJFF(inputStreamReader, null);
            List<NewUserInterestStruct> list = (List) GsonProtectorUtils.fromJson(C75792yF.LIZIZ(), LJIILJJIL, new TypeToken<List<? extends NewUserInterestStruct>>() { // from class: X.2Sz
            }.getType());
            if (list == null || list.isEmpty()) {
                list = new LinkedList();
            }
            for (NewUserInterestStruct newUserInterestStruct : list) {
                String LIZ = C40790Fze.LIZ(LIZIZ, newUserInterestStruct.id);
                if (!TextUtils.isEmpty(LIZ)) {
                    newUserInterestStruct.text = LIZ;
                }
            }
            return new C40788Fzc(LIZLLL, list, 24);
        } finally {
        }
    }
}
