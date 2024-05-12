package X;

import com.ss.android.ugc.aweme.sticker.StickerWrapper;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.VzO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81542VzO implements IEffectDownloadProgressListener {
    public final /* synthetic */ C81541VzN LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        C81541VzN c81541VzN = this.LIZ;
        StickerWrapper stickerWrapper = c81541VzN.LJLJJL;
        if (stickerWrapper != null) {
            stickerWrapper.mState = 2;
            c81541VzN.M(stickerWrapper);
        } else {
            o.LJIJI("duetLayoutEffect");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        C81541VzN c81541VzN = this.LIZ;
        StickerWrapper stickerWrapper = c81541VzN.LJLJJL;
        if (stickerWrapper != null) {
            stickerWrapper.mState = 1;
            c81541VzN.M(stickerWrapper);
            C81541VzN c81541VzN2 = this.LIZ;
            boolean z = this.LIZIZ;
            c81541VzN2.LJLJJI.LJ(true);
            c81541VzN2.LJLJI.LJJLIIIJ(c81541VzN2.getAdapterPosition(), z);
            c81541VzN2.LJLJJI.LJ(true);
            return;
        }
        o.LJIJI("duetLayoutEffect");
        throw null;
    }

    public C81542VzO(C81541VzN c81541VzN, boolean z) {
        this.LIZ = c81541VzN;
        this.LIZIZ = z;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        C5S1 c5s1 = new C5S1(this.LIZ.LJLIL.getContext());
        c5s1.LIZJ(R.string.exy);
        c5s1.LJ();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        C81541VzN c81541VzN = this.LIZ;
        StickerWrapper stickerWrapper = c81541VzN.LJLJJL;
        if (stickerWrapper != null) {
            stickerWrapper.mState = 5;
            stickerWrapper.downloadProgress = i;
            c81541VzN.M(stickerWrapper);
            return;
        }
        o.LJIJI("duetLayoutEffect");
        throw null;
    }
}
