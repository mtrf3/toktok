package X;

import Y.ACallableS109S0100000_6;
import Y.AObjectS21S0001000_5;
import Y.ARunnableS25S0200000_6;
import Y.AgS123S0100000_6;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;

/* renamed from: X.Eak, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36698Eak implements WeakHandler.IHandler {
    public static C36698Eak LJLJJI;
    public final C62822Ol8 LJLIL;
    public final WeakHandler LJLILLLLZI;
    public ShareSettings LJLJI;

    public static C36698Eak LIZIZ() {
        if (LJLJJI == null) {
            synchronized (C36698Eak.class) {
                if (LJLJJI == null) {
                    LJLJJI = new C36698Eak();
                }
            }
        }
        return LJLJJI;
    }

    public final Boolean LIZJ() {
        String string = C36697Eaj.LIZ.getString("share_setting_key", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                ShareSettings shareSettings = (ShareSettings) new Gson().LJI(string, ShareSettings.class);
                C4LD.LIZIZ.LJJJJZ();
                C43659HBn.LJIILLIIL(shareSettings.sharePlatforms);
                C43659HBn.LJIILJJIL(shareSettings.sharePlatformsMeta);
                C36703Eap.LIZIZ = shareSettings.shareGifPlatforms;
                C43659HBn.LJIILL(shareSettings.shareOrderList);
                C36699Eal.LIZ = shareSettings.mutedSharePlatforms;
                this.LJLJI = shareSettings;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public C36698Eak() {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AObjectS21S0001000_5(2, 3));
        this.LJLIL = LIZIZ;
        this.LJLILLLLZI = new WeakHandler(C16880lQ.LLJJJJ(), this);
        if (!((Boolean) C34639Did.LJFF.getValue()).booleanValue()) {
            LIZIZ.getValue();
        }
        if (((Boolean) C34639Did.LJ.getValue()).booleanValue()) {
            C10K.LJII(5000L).LJ(new AgS123S0100000_6(this, 22), C10K.LJI, null);
        } else if (((Boolean) C34639Did.LIZLLL.getValue()).booleanValue()) {
            C10K.LJII(2000L).LJ(new AgS123S0100000_6(this, 22), C10K.LJI, null);
        } else {
            C10K.LIZJ(new ACallableS109S0100000_6(this, 29));
        }
    }

    public final void LIZ(Object obj) {
        ShareSettings shareSettings;
        if (obj instanceof Exception) {
            Exception exc = (Exception) obj;
            C16880lQ.LLLLIIL(exc);
            C10K.LIZJ(new ACallableS109S0100000_6(this, 29));
            exc.getMessage();
            return;
        }
        if (!(obj instanceof ShareSettings) || (shareSettings = (ShareSettings) obj) == null) {
            return;
        }
        C79004UzY.LJJIFFI(shareSettings.sharePlatforms);
        C38816FLg.LJ(new ARunnableS25S0200000_6(this, shareSettings, 67));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        LIZ(message.obj);
    }
}
