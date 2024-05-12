package X;

import android.media.AudioManager;
import com.bytedance.ies.xelement.audiott.LynxAudioTTView;
import com.ss.ttvideoengine.TTVideoEngine;

/* renamed from: X.Va2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79970Va2 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ LynxAudioTTView LJLIL;

    public C79970Va2(LynxAudioTTView lynxAudioTTView) {
        this.LJLIL = lynxAudioTTView;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        C79971Va3 c79971Va3;
        if (i != -2) {
            if (i != -1) {
                if (i != 1 || (c79971Va3 = this.LJLIL.LJLIL) == null) {
                    return;
                }
                c79971Va3.LJ();
                return;
            }
            C79971Va3 c79971Va32 = this.LJLIL.LJLIL;
            if (c79971Va32 == null) {
                return;
            }
            c79971Va32.LJLLJ = 3;
            TTVideoEngine tTVideoEngine = c79971Va32.LJLJI;
            if (tTVideoEngine == null) {
                return;
            }
            tTVideoEngine.LLJJJJJIL();
            return;
        }
        C79971Va3 c79971Va33 = this.LJLIL.LJLIL;
        if (c79971Va33 == null) {
            return;
        }
        c79971Va33.LJLLJ = 2;
        TTVideoEngine tTVideoEngine2 = c79971Va33.LJLJI;
        if (tTVideoEngine2 == null) {
            return;
        }
        tTVideoEngine2.LJJL();
    }
}
