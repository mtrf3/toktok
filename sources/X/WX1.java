package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes15.dex */
public final class WX1 implements Runnable {
    public final /* synthetic */ GameStickerHandler LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public WX1(GameStickerHandler gameStickerHandler, int i, int i2, int i3, String str) {
        this.LJLIL = gameStickerHandler;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = str;
    }

    public final void LIZ() {
        String str;
        int i = this.LJLILLLLZI;
        if (i != 45) {
            if (i != 48) {
                return;
            }
            this.LJLIL.LJLJJI.getValue().startPlay();
            return;
        }
        if (this.LJLJI != 2) {
            return;
        }
        GameStickerHandler gameStickerHandler = this.LJLIL;
        int i2 = this.LJLJJI;
        String str2 = this.LJLJJL;
        gameStickerHandler.getClass();
        try {
            String unZipPath = new JSONObject(str2).optString("effectPath");
            Effect effect = gameStickerHandler.LJLJI;
            String str3 = null;
            if (effect != null) {
                str = effect.getUnzipPath();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            o.LJIIIIZZ(unZipPath, "unZipPath");
            Effect effect2 = gameStickerHandler.LJLJI;
            if (effect2 != null) {
                str3 = effect2.getUnzipPath();
            }
            o.LJI(str3);
            if (!s.LJJJLZIJ(unZipPath, str3, true)) {
                return;
            }
            gameStickerHandler.LJLJJI.getValue().LIZ(i2, gameStickerHandler.LJLJI, str2);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
