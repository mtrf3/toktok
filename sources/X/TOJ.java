package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TOJ<T, R> implements InterfaceC48038ItG<TON, C157166Eu> {
    public static final TOJ LJLIL = new TOJ();

    @Override // X.InterfaceC48038ItG
    public final C157166Eu apply(TON ton) {
        TEA tea;
        TON event = ton;
        o.LJIIIZ(event, "event");
        ProviderEffect providerEffect = event.LJLIL;
        int i = TOO.LIZ[event.LJLILLLLZI.LJLIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            tea = TEA.UNKNOWN;
                        } else {
                            tea = TEA.DOWNLOAD_FAILED;
                        }
                    } else {
                        tea = TEA.DOWNLOAD_SUCCESS;
                    }
                } else {
                    tea = TEA.NOT_DOWNLOAD;
                }
            } else {
                tea = TEA.DOWNLOADING;
            }
        } else {
            tea = TEA.UNKNOWN;
        }
        return new C157166Eu(providerEffect, tea, event.LJLJI);
    }
}
