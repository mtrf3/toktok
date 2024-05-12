package X;

/* renamed from: X.Cho, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32040Cho implements BU3<C32041Chp> {
    @Override // X.BU3
    public final void LIZ(Object obj, java.util.Map map) {
        C32041Chp c32041Chp = (C32041Chp) obj;
        if (c32041Chp == null) {
            return;
        }
        long j = c32041Chp.LIZ;
        if (j > 0) {
            map.put("channel_id", String.valueOf(j));
        }
        long j2 = c32041Chp.LIZIZ;
        if (j2 > 0) {
            map.put("right_user_id", String.valueOf(j2));
        }
        map.put("is_oncemore", String.valueOf(c32041Chp.LJFF));
        int i = c32041Chp.LIZJ;
        if (i > 0) {
            map.put("pk_time", String.valueOf(i));
            map.put("connection_type", c32041Chp.LIZLLL);
            map.put("match_type", null);
            if (!C38354F3m.LJ(c32041Chp.LJ)) {
                return;
            }
            map.put("title", c32041Chp.LJ);
            return;
        }
        map.put("connection_type", c32041Chp.LIZLLL);
    }
}
