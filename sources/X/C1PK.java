package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.effect.StickerMessageManager;
import com.bytedance.android.livesdk.i18n.I18nDbManager;
import com.bytedance.android.livesdkapi.dataChannel.AnchorTicketCountChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* renamed from: X.1PK, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1PK implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.LJLIL) {
            case 0:
                AbstractC51301zq abstractC51301zq = (AbstractC51301zq) this.LJLILLLLZI;
                Runnable runnable = abstractC51301zq.LJIILJJIL;
                if (runnable != null) {
                    runnable.run();
                    abstractC51301zq.LJIILJJIL = null;
                    return;
                }
                return;
            case 1:
                ((StickerMessageManager) this.LJLILLLLZI).lambda$createStickerGiftPngIfNeeded$3((Throwable) obj);
                return;
            case 2:
                Throwable th = (Throwable) obj;
                this.LJLILLLLZI.getClass();
                if (th instanceof C29401Dk) {
                    C29401Dk c29401Dk = (C29401Dk) th;
                    int errorCode = c29401Dk.getErrorCode();
                    String prompt = c29401Dk.getPrompt();
                    if (errorCode >= 30001 && errorCode <= 30006) {
                        if (!TextUtils.isEmpty(prompt)) {
                            C30868C9o.LJI(prompt);
                        }
                        UPJ.LJFF(35, C73943T0h.LIZ());
                        return;
                    }
                }
                C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
                StackTraceElement[] stackTrace = th.getStackTrace();
                LJIILIIL.getClass();
                C0NE.LJIIL(6, stackTrace);
                return;
            case 3:
                ((I18nDbManager) this.LJLILLLLZI).lambda$queryTranslations$1((C78701Uuf) obj);
                return;
            default:
                ((LiveWidget) this.LJLILLLLZI).dataChannel.rv0(AnchorTicketCountChannel.class, Long.valueOf(((InterfaceC05190Ih) obj).getFanTicketCount()));
                return;
        }
    }

    public /* synthetic */ C1PK(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
