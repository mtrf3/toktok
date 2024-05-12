package X;

import X.C37433Emb;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.setting.Settings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Ema, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37432Ema extends AbstractC65781Prl implements InterfaceC65784Pro<C37434Emc> {
    public final /* synthetic */ Settings LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37432Ema(Settings settings) {
        super(0);
        this.LJLIL = settings;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.30o, V] */
    @Override // X.InterfaceC65784Pro
    public final C37434Emc invoke() {
        C37434Emc c37434Emc = new C37434Emc();
        for (String str : this.LJLIL.urlRules) {
            if (!TextUtils.isEmpty(str)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("https://");
                LIZ.append(str);
                ?? LIZ2 = C770230o.LIZ(UriProtector.parse(X1D.LIZIZ(LIZ)));
                if (LIZ2 != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : LIZ2.LIZ) {
                        if (str2.startsWith("^")) {
                            arrayList.add(str2.substring(1));
                        } else {
                            arrayList.add(str2);
                        }
                    }
                    C37433Emb<String, C770230o>.b bVar = c37434Emc.LIZ.LIZ;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        C37433Emb<String, C770230o>.b bVar2 = (C37433Emb.b) ((HashMap) bVar.LIZ).get(next);
                        if (bVar2 == null) {
                            bVar2 = new C37433Emb.b();
                            ((HashMap) bVar.LIZ).put(next, bVar2);
                        }
                        bVar = bVar2;
                    }
                    bVar.LIZIZ = LIZ2;
                    c37434Emc.LIZIZ.clear();
                }
            }
        }
        return c37434Emc;
    }
}
