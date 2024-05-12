package X;

import com.bytedance.android.livesdk.broadcast.voicechat.layer.VoiceChatWidget;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: X.Bxs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30488Bxs implements ILiveStream.ITextureFrameAvailableListener {
    public final /* synthetic */ VoiceChatWidget LJLIL;

    public C30488Bxs(VoiceChatWidget voiceChatWidget) {
        this.LJLIL = voiceChatWidget;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ITextureFrameAvailableListener
    public final void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object[] objArr) {
        InterfaceC30498By2 interfaceC30498By2 = this.LJLIL.LJLIL;
        if (interfaceC30498By2 != null) {
            interfaceC30498By2.LIZ(eGLContext, i, z ? 1 : 0, i2, i3, j);
        }
    }
}
