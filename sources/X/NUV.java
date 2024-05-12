package X;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NUV {
    public static final void LIZ(String str, boolean z, boolean z2) {
        JSONObject put = new JSONObject().put("jump_url", str).put("jump_has_click", z).put("jump_block_by", "apk_download");
        if (z2) {
            put.put("container_type", "bullet");
        }
        C09900aA.LJIIJJI("h5_block_app_url", 0, put);
    }

    public static final void LIZIZ(String str, boolean z, boolean z2) {
        JSONObject put = new JSONObject().put("jump_url", str).put("jump_has_click", z).put("jump_block_by", "blocked");
        if (z2) {
            put.put("container_type", "bullet");
        }
        C09900aA.LJIIJJI("h5_block_app_url", 0, put);
    }

    public static final void LIZJ(String str, boolean z, boolean z2) {
        JSONObject put = new JSONObject().put("jump_url", str).put("jump_has_click", z);
        if (z2) {
            put.put("container_type", "bullet");
        }
        C09900aA.LJIIJJI("h5_block_app_url", 1, put);
    }
}
