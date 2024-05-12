package X;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Config;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Link;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ERa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36418ERa implements F4V {
    @Override // X.F4V
    public final int getPriority() {
        return T4L.LIZ();
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        Effect effect;
        List<Link> list;
        o.LJIIIZ(session, "session");
        ERS LIZ = ern.LIZ(session);
        com.ss.android.ugc.effectmanager.effect.model.Effect LIZ2 = session.LIZ();
        if (LIZ2 instanceof MobileEffect) {
            DiyPropParser.LIZIZ(LIZ2);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZ2.getUnzipPath());
            LIZ3.append("/config.json");
            File file = new File(X1D.LIZIZ(LIZ3));
            if (file.exists()) {
                Gson LIZIZ = C75792yF.LIZIZ();
                o.LJIIIIZZ(LIZIZ, "getGson()");
                Object obj = null;
                try {
                    if (!file.isDirectory()) {
                        obj = LIZIZ.LJFF(new FileReader(file), new TypeToken<Config>() { // from class: X.2ef
                        }.getType());
                    }
                } catch (Exception e) {
                    H78.LIZLLL("EffectUtil", e);
                }
                Config config = (Config) obj;
                if (config != null && (effect = config.effect) != null && (list = effect.links) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<Link> it = list.iterator();
                    while (it.hasNext()) {
                        String str = it.next().type;
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        java.util.Set LLJILLL = ORZ.LLJILLL(LIZ2.getTypes());
                        LLJILLL.addAll(arrayList);
                        LIZ2.setTypes(ORZ.LLJI(LLJILLL));
                    }
                }
            }
        }
        return LIZ;
    }
}
