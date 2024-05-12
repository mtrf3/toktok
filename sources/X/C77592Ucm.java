package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Ucm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77592Ucm implements InterfaceC77724Ueu {
    public final /* synthetic */ C77593Ucn LIZ;

    public C77592Ucm(C77593Ucn c77593Ucn) {
        this.LIZ = c77593Ucn;
    }

    @Override // X.InterfaceC77724Ueu
    public final void LIZ(List photoDatas, boolean z) {
        JSONObject jSONObject;
        int i;
        o.LJIIIZ(photoDatas, "photoDatas");
        JSONArray jSONArray = new JSONArray();
        Iterator it = photoDatas.iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("tempFilePath", osz.getFirst());
                jSONObject2.put("base64Data", osz.getSecond());
                jSONArray.put(jSONObject2);
            } catch (Exception unused) {
            }
        }
        try {
            jSONObject = this.LIZ.LJLJJI;
        } catch (Exception unused2) {
        }
        if (jSONObject != null) {
            jSONObject.put("tempFiles", jSONArray);
            JSONObject jSONObject3 = this.LIZ.LJLJJI;
            if (jSONObject3 != null) {
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject3.put("code", i);
                C77593Ucn c77593Ucn = this.LIZ;
                C38049EwX c38049EwX = c77593Ucn.LJLILLLLZI;
                C38048EwW c38048EwW = c77593Ucn.LJLJI;
                if (c38048EwW != null) {
                    String str = c38048EwW.LIZIZ;
                    JSONObject jSONObject4 = c77593Ucn.LJLJJI;
                    if (jSONObject4 != null) {
                        c38049EwX.LIZLLL(str, jSONObject4);
                        return;
                    } else {
                        o.LJIJI("jsResult");
                        throw null;
                    }
                }
                o.LJIJI("jsMsg");
                throw null;
            }
            o.LJIJI("jsResult");
            throw null;
        }
        o.LJIJI("jsResult");
        throw null;
    }
}
