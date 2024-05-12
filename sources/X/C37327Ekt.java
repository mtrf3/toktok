package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.AqS66S0400000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Ekt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37327Ekt {
    public static final /* synthetic */ int LJ = 0;
    public final Context LIZ;
    public final C37065Egf LIZIZ;
    public final C37329Ekv LIZJ;
    public final InterfaceC88472Yns<String, String> LIZLLL;

    public final List<C35497DwT> LIZJ() {
        C37330Ekw c37330Ekw = new C37330Ekw();
        Cursor LIZIZ = LIZIZ(this.LIZ, this.LIZJ.LIZ(), c37330Ekw);
        if (LIZIZ == null || LIZIZ.getCount() == 0) {
            C73802v2.LIZIZ(200, null, 62);
            if (LIZIZ != null) {
                LIZIZ.close();
            }
            return C61878OQg.INSTANCE;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (LIZIZ.moveToNext()) {
            try {
                String string = LIZIZ.getString(LIZIZ.getColumnIndex("contact_id"));
                if (string != null) {
                    C37324Ekq c37324Ekq = (C37324Ekq) linkedHashMap.get(string);
                    if (c37324Ekq == null) {
                        c37324Ekq = new C37324Ekq(0);
                        linkedHashMap.put(string, c37324Ekq);
                    }
                    this.LIZIZ.LJIIIIZZ(new AqS66S0400000_6(this, LIZIZ, c37324Ekq, c37330Ekw, 0));
                }
            } catch (Exception e) {
                this.LIZIZ.LJ(e);
            }
        }
        LIZIZ.close();
        this.LIZIZ.LJIJJ = linkedHashMap.values().size();
        return (List) this.LIZIZ.LJIIJ(new AqS153S0200000_6((java.util.Map) linkedHashMap, (java.util.Map<String, C37324Ekq>) this, (C37327Ekt) 23));
    }

    public C37327Ekt(C37065Egf monitor, C37329Ekv c37329Ekv) {
        Context LIZIZ = EF7.LIZIZ();
        F2X f2x = new F2X(C39381Fcv.LIZ);
        o.LJIIIZ(monitor, "monitor");
        this.LIZ = LIZIZ;
        this.LIZIZ = monitor;
        this.LIZJ = c37329Ekv;
        this.LIZLLL = f2x;
    }

    public static Cursor LIZIZ(Context context, C78862UxG c78862UxG, C37330Ekw c37330Ekw) {
        try {
            C38783FJz c38783FJz = C37331Ekx.LIZ;
            ContentResolver contentResolver = context.getContentResolver();
            o.LJIIIIZZ(contentResolver, "context.contentResolver");
            android.net.Uri CONTENT_URI = ContactsContract.Data.CONTENT_URI;
            o.LJIIIIZZ(CONTENT_URI, "CONTENT_URI");
            C37328Eku c37328Eku = new C37328Eku(c37330Ekw);
            c38783FJz.getClass();
            return C38783FJz.LIZ(contentResolver, CONTENT_URI, c78862UxG, c37328Eku);
        } catch (Q0C unused) {
            C73802v2.LIZIZ(209, null, 62);
            return null;
        }
    }

    public final void LIZ(Cursor cursor, C37324Ekq contactReadRawItem, C37330Ekw bpeaContactCertSettingItem) {
        boolean z;
        o.LJIIIZ(cursor, "cursor");
        o.LJIIIZ(contactReadRawItem, "contactReadRawItem");
        o.LJIIIZ(bpeaContactCertSettingItem, "bpeaContactCertSettingItem");
        boolean z2 = false;
        if (contactReadRawItem.LIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z & bpeaContactCertSettingItem.LIZ) {
            String string = cursor.getString(cursor.getColumnIndex("display_name"));
            o.LJIIIIZZ(string, "cursor.getString(cursor.displayNameColumnIndex)");
            contactReadRawItem.LIZ = string;
        }
        String string2 = cursor.getString(cursor.getColumnIndex("mimetype"));
        if (string2 == null) {
            return;
        }
        int hashCode = string2.hashCode();
        if (hashCode != -1569536764) {
            if (hashCode != 684173810) {
                if (hashCode != 905843021 || !string2.equals("vnd.android.cursor.item/photo")) {
                    return;
                }
                if (contactReadRawItem.LIZLLL == null) {
                    z2 = true;
                }
                if (!(bpeaContactCertSettingItem.LIZJ & z2)) {
                    return;
                }
                contactReadRawItem.LIZLLL = cursor.getString(cursor.getColumnIndex("photo_thumb_uri"));
                return;
            }
            if (!string2.equals("vnd.android.cursor.item/phone_v2") || !bpeaContactCertSettingItem.LIZIZ) {
                return;
            }
            String phoneNumber = cursor.getString(cursor.getColumnIndex("data1"));
            if (phoneNumber == null || phoneNumber.length() == 0) {
                this.LIZIZ.LJIJJLI++;
                return;
            }
            InterfaceC88472Yns<String, String> interfaceC88472Yns = this.LIZLLL;
            o.LJIIIIZZ(phoneNumber, "phoneNumber");
            String invoke = interfaceC88472Yns.invoke(phoneNumber);
            if (invoke.length() > 0) {
                contactReadRawItem.LIZIZ.add(invoke);
                return;
            } else {
                this.LIZIZ.LJIL++;
                return;
            }
        }
        if (!string2.equals("vnd.android.cursor.item/email_v2") || !EP5.LIZ() || !bpeaContactCertSettingItem.LIZLLL) {
            return;
        }
        String email = cursor.getString(cursor.getColumnIndex("data1"));
        if (email == null || email.length() == 0) {
            this.LIZIZ.LJJI++;
        } else if (!C47261Igj.LJIILLIIL(email)) {
            C37065Egf c37065Egf = this.LIZIZ;
            c37065Egf.LJJIII++;
            c37065Egf.LJJIFFI++;
        } else {
            this.LIZIZ.LJJIII++;
            List<String> list = contactReadRawItem.LIZJ;
            o.LJIIIIZZ(email, "email");
            list.add(email);
        }
    }
}
