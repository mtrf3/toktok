package X;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.Qcl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C67399Qcl implements InterfaceC67373QcL {
    public static double LIZ(double d, double d2, double d3, double d4, double d5) {
        return (d * d2 * d3 * d4) + d5;
    }

    @Override // X.InterfaceC67373QcL
    public Object apply(Object obj) {
        return C67379QcR.LJIILIIL(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new C1EU());
    }
}
