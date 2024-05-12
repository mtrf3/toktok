package X;

import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.TNt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74553TNt<T, R> implements InterfaceC48038ItG<C74556TNw, C157166Eu> {
    public static final C74553TNt LJLIL = new C74553TNt();

    @Override // X.InterfaceC48038ItG
    public final C157166Eu apply(C74556TNw c74556TNw) {
        TEA tea;
        C74556TNw event = c74556TNw;
        o.LJIIIZ(event, "event");
        InfoStickerEffect infoStickerEffect = event.LJLIL;
        int i = C74557TNx.LIZ[event.LJLILLLLZI.LJLIL.ordinal()];
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
        return new C157166Eu(infoStickerEffect, tea, event.LJLJI);
    }
}
