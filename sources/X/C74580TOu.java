package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TOu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74580TOu extends C74579TOt {
    public final java.util.Map<String, String> LJIIIZ;

    @Override // X.C74579TOt
    public final C73579SuF LJIIJ(int i, TPG cursorData) {
        o.LJIIIZ(cursorData, "cursorData");
        return AbstractC73638SvC.LJI(new C74581TOv(this, cursorData, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74580TOu(InterfaceC65784Pro<? extends InterfaceC84498XEg> effectPlatform, C74577TOr c74577TOr, String providerName, String providerSource, String query, TPG tpg) {
        super(effectPlatform, c74577TOr, providerName, providerSource, query, tpg);
        String str;
        Integer num;
        String str2;
        String LIZ;
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(providerName, "providerName");
        o.LJIIIZ(providerSource, "providerSource");
        o.LJIIIZ(query, "query");
        OSZ[] oszArr = new OSZ[6];
        String str3 = "";
        if (c74577TOr == null) {
            str = "";
        } else {
            str = c74577TOr.LJIIZILJ();
        }
        oszArr[0] = new OSZ("creation_id", str);
        oszArr[1] = new OSZ("session_id", (c74577TOr == null || (LIZ = c74577TOr.LIZ()) == null) ? "" : LIZ);
        if (c74577TOr != null && (str2 = c74577TOr.LJ) != null) {
            str3 = str2;
        }
        oszArr[2] = new OSZ("search_session_id", str3);
        if (c74577TOr != null) {
            num = Integer.valueOf(c74577TOr.LJFF);
        } else {
            num = null;
        }
        oszArr[3] = new OSZ("search_keyword_session_id", String.valueOf(num));
        oszArr[4] = new OSZ("device_platform", "android");
        oszArr[5] = new OSZ("keyword", query);
        this.LJIIIZ = C113554cx.LJJL(oszArr);
    }
}
