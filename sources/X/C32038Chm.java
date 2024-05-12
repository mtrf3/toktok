package X;

/* renamed from: X.Chm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32038Chm implements BU3<C32039Chn> {
    @Override // X.BU3
    public final void LIZ(Object obj, java.util.Map map) {
        C32039Chn c32039Chn = (C32039Chn) obj;
        if (c32039Chn == null) {
            return;
        }
        long j = c32039Chn.LIZIZ;
        if (j > 0) {
            map.put("invitee_id", String.valueOf(j));
        }
        long j2 = c32039Chn.LIZ;
        if (j2 > 0) {
            map.put("inviter_id", String.valueOf(j2));
        }
        if (!C38354F3m.LJ(null)) {
            map.put("match_type", null);
        }
        if (!C38354F3m.LJ(null)) {
            map.put("end_type", null);
        }
        if (!C38354F3m.LJ(c32039Chn.LIZJ)) {
            map.put("connection_time", c32039Chn.LIZJ);
        }
        if (!C38354F3m.LJ(null)) {
            map.put("invitee_list", null);
        }
        if (!C38354F3m.LJ(null)) {
            map.put("is_rematch", null);
        }
        map.put("pk_time", String.valueOf(0));
        if (C38354F3m.LJ(null)) {
            return;
        }
        map.put("connection_type", null);
        throw null;
    }
}
