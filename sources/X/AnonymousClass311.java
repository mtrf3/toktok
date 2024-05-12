package X;

import com.ss.android.ugc.aweme.relation.storage.model.UserData;
import defpackage.q;
import defpackage.s0;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.311, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass311 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(AnonymousClass313.LJLIL);

    public static C64962gm LIZ() {
        XIA dispatcher = C78613UtF.LIZJ;
        o.LJIIIZ(dispatcher, "dispatcher");
        return C48841JEv.LIZ(dispatcher.plus(T2R.LJIIJJI()).plus(new MB6() { // from class: X.312
            public static final AnonymousClass314 LJLILLLLZI = new InterfaceC48698J9i<AnonymousClass312>() { // from class: X.314
            };
            public final String LJLIL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AnonymousClass312) && o.LJ(this.LJLIL, ((AnonymousClass312) obj).LJLIL);
            }

            public final int hashCode() {
                return this.LJLIL.hashCode();
            }

            {
                AnonymousClass314 anonymousClass314 = LJLILLLLZI;
                this.LJLIL = "RelationStorage";
            }

            public final String toString() {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("CoroutineName(");
                return q.LIZIZ(LIZ2, this.LJLIL, ')', LIZ2);
            }
        }));
    }

    public static final String LIZIZ(UserData userData) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("RelationUser(uid=");
        LIZ2.append(userData.uid);
        LIZ2.append(", nickname=");
        LIZ2.append(userData.nickname);
        LIZ2.append(", follow_status=");
        return s0.LIZJ(LIZ2, userData.followStatus, ')', LIZ2);
    }

    public static final void LIZJ(String str, JSONObject jSONObject) {
        o.LJIIIZ(jSONObject, "<this>");
        StringBuilder LIZIZ = C25620zW.LIZIZ("trace ", str, ", value: ");
        LIZIZ.append(jSONObject.toString(4));
        C69542oA.LIZIZ("Monitor", X1D.LIZIZ(LIZIZ));
        FMX.LJIILJJIL(str, jSONObject);
    }
}
