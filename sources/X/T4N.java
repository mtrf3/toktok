package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T4N implements F4V {
    public final T4O LJLIL;

    @Override // X.F4V
    public final int getPriority() {
        return T4M.LOAD_STICKER_PRIORITY.getPriority();
    }

    public T4N(T4O loader) {
        o.LJIIIZ(loader, "loader");
        this.LJLIL = loader;
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        o.LJIIIZ(session, "session");
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerLoaderHandler#onStickerChosen:session:");
        LIZ.append(session);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        int i = -1;
        if (session instanceof T4Q) {
            T4Q t4q = (T4Q) session;
            if (t4q.LIZLLL) {
                C82891Wg3.LIZLLL().i("StickerLoaderHandler#onStickerChosen:SelectedStickerHandleSession:session.interceptLoad");
            } else if (t4q.LIZ.getEffectType() == 0) {
                C82891Wg3.LIZLLL().i("StickerLoaderHandler#onStickerChosen:SelectedStickerHandleSession:effectType=TYPE_NORMAL");
                i = this.LJLIL.LIZ(t4q.LIZ, false);
            } else if (t4q.LIZ.getEffectType() == -1) {
                C82891Wg3.LIZLLL().i("StickerLoaderHandler#onStickerChosen:SelectedStickerHandleSession:effectType=TYPE_MODEO");
                i = this.LJLIL.LIZ(t4q.LIZ, false);
            } else {
                i = 0;
            }
        } else if (session instanceof T4R) {
            if (((T4R) session).LIZLLL) {
                C82891Wg3.LIZLLL().i("StickerLoaderHandler#onStickerChosen:UnselectedStickerHandleSession:session.interceptLoad");
            } else {
                C82891Wg3.LIZLLL().i("StickerLoaderHandler#onStickerChosen:UnselectedStickerHandleSession");
                i = this.LJLIL.LIZIZ();
            }
        } else {
            throw new C162476Zf();
        }
        return new ERS(i);
    }
}
