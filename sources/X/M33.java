package X;

import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;

/* loaded from: classes10.dex */
public final class M33 {
    public static MapBounds LIZ(C53746L7m c53746L7m) {
        C191427fG northeast;
        C191427fG southwest;
        if (c53746L7m == null || (northeast = c53746L7m.getNortheast()) == null || (southwest = c53746L7m.getSouthwest()) == null) {
            return null;
        }
        return new MapBounds(String.valueOf(northeast.getLon() - ((Math.abs(northeast.getLon() - southwest.getLon()) * M3K.LIZ.LJLJI) / M3K.LIZIZ)), String.valueOf(northeast.getLat() - ((Math.abs(northeast.getLat() - southwest.getLat()) * M3K.LIZ.LJLILLLLZI) / M3K.LIZJ)), String.valueOf(((Math.abs(northeast.getLon() - southwest.getLon()) * M3K.LIZ.LJLIL) / M3K.LIZIZ) + southwest.getLon()), String.valueOf(((Math.abs(northeast.getLat() - southwest.getLat()) * M3K.LIZ.LJLJJI) / M3K.LIZJ) + southwest.getLat()));
    }
}
