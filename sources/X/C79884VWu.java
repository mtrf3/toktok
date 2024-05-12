package X;

import android.view.ViewGroup;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.VWu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79884VWu<T> implements InterfaceC79878VWo<String> {
    public final /* synthetic */ LynxAlphaVideo LIZ;

    public C79884VWu(LynxAlphaVideo lynxAlphaVideo) {
        this.LIZ = lynxAlphaVideo;
    }

    @Override // X.InterfaceC79878VWo
    public final void onResult(String str) {
        String str2 = str;
        LynxAlphaVideo lynxAlphaVideo = this.LIZ;
        if (str2 == "success") {
            lynxAlphaVideo.getClass();
            lynxAlphaVideo.LJJIIJ("ready", LynxAlphaVideo.LJJ(1, "load resource success", null));
            if (lynxAlphaVideo.LJLJI != null && lynxAlphaVideo.LJLJJL) {
                PlayerController playerController = lynxAlphaVideo.LJLIL;
                if (playerController != null) {
                    playerController.attachAlphaView((ViewGroup) lynxAlphaVideo.mView);
                    PlayerController playerController2 = lynxAlphaVideo.LJLIL;
                    if (playerController2 != null) {
                        playerController2.startWithLastFrameHold(lynxAlphaVideo.LJLJI, lynxAlphaVideo.LJLLILLLL);
                        return;
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                o.LJIIZILJ();
                throw null;
            }
            return;
        }
        lynxAlphaVideo.LJJI(-6, i0.LJFF("unknown exception, ", str2), lynxAlphaVideo.LJLL);
    }
}
