package X;

import android.database.Cursor;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Eku, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37328Eku implements InterfaceC37333Ekz<FK4, Cursor> {
    public final /* synthetic */ C37330Ekw LIZ;

    public C37328Eku(C37330Ekw c37330Ekw) {
        this.LIZ = c37330Ekw;
    }

    @Override // X.InterfaceC37333Ekz
    public final Object LIZ(FK1 fk1, JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (jSONObject != null) {
            boolean optBoolean = jSONObject.optBoolean("is_display_name", true);
            z2 = jSONObject.optBoolean("is_phone_number", true);
            z3 = jSONObject.optBoolean("is_photo_thumbnail", true);
            z = jSONObject.optBoolean("is_email", true);
            z4 = optBoolean;
        } else {
            z = true;
            z2 = true;
            z3 = true;
        }
        C37330Ekw c37330Ekw = this.LIZ;
        c37330Ekw.LIZ = z4;
        c37330Ekw.LIZIZ = z2;
        c37330Ekw.LIZJ = z3;
        c37330Ekw.LIZLLL = z;
        List LJJIJIL = C47261Igj.LJJIJIL("contact_id", "mimetype");
        if (z4) {
            LJJIJIL.add("display_name");
        }
        if (z2) {
            LJJIJIL.add("data1");
        }
        if (z3) {
            LJJIJIL.add("photo_thumb_uri");
        }
        if (z && EP5.LIZ()) {
            LJJIJIL.add("data1");
        }
        if (EP5.LIZ()) {
            return fk1.LIZ(null, (String[]) LJJIJIL.toArray(new String[0]), null);
        }
        return fk1.LIZ("has_phone_number=?", (String[]) LJJIJIL.toArray(new String[0]), new String[]{"1"});
    }
}
