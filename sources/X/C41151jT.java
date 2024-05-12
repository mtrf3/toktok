package X;

import org.json.JSONObject;

/* renamed from: X.1jT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41151jT extends C1HH {
    @Override // X.C1HH
    public final void LJIIJJI() {
        C0K2.LJIIJ(0, LJIIIIZZ(), "ttlive_download_sticker_all", new JSONObject());
    }

    @Override // X.C1HH
    public final void LJIILIIL() {
        C0K2.LJIIJ(0, LJIIIZ(), "ttlive_load_sticker_list_all", new JSONObject());
    }

    @Override // X.C1HH
    public final void LJIIJ(int i, String str) {
        LJIIIIZZ();
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(i, "error_code", jSONObject);
        C05630Jz.LJI(jSONObject, "error_msg", str);
        C0K2.LJIIJJI(1, "ttlive_download_sticker_all", jSONObject);
        C0K2.LJIIIIZZ("ttlive_download_sticker_error", 1, jSONObject);
        BKQ LIZIZ = BKQ.LIZIZ();
        String str2 = EnumC30551Byt.Room.info;
        LIZIZ.getClass();
        BKQ.LIZLLL(str2, "ttlive_download_sticker", 1, jSONObject);
    }

    @Override // X.C1HH
    public final void LJIIL(int i, String str) {
        LJIIIZ();
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(i, "error_code", jSONObject);
        C05630Jz.LJI(jSONObject, "error_msg", str);
        C0K2.LJIIJJI(1, "ttlive_load_sticker_list_all", jSONObject);
        C0K2.LJIIIIZZ("ttlive_load_sticker_list_error", 1, jSONObject);
        BKQ LIZIZ = BKQ.LIZIZ();
        String str2 = EnumC30551Byt.Room.info;
        LIZIZ.getClass();
        BKQ.LIZLLL(str2, "ttlive_load_sticker_list", 1, jSONObject);
    }
}
