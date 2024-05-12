package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import fjb.a;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.musicreplace.handlers.MusicReplaceCheckHandler$handleData$2", f = "MusicReplaceCheckHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6Lm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158906Lm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ C161856Wv LJLIL;
    public final /* synthetic */ C158886Lk LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C158906Lm(C161856Wv c161856Wv, C158886Lk c158886Lk, InterfaceC67352kd<? super C158906Lm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c161856Wv;
        this.LJLILLLLZI = c158886Lk;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C158906Lm(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        NLESegment LJI;
        NLEResourceNode LIZIZ;
        StringBuilder LIZIZ2 = C43881HKb.LIZIZ(obj, "JDW: MusicReplacePipeline: Start ");
        getClass();
        LIZIZ2.append(0);
        LIZIZ2.append(' ');
        LIZIZ2.append(LIZ());
        LIZIZ2.append(" time=");
        long j = 1000;
        LIZIZ2.append((System.currentTimeMillis() - this.LJLILLLLZI.LJI) / j);
        H78.LJI(X1D.LIZIZ(LIZIZ2));
        VecNLETrackSPtr tracks = this.LJLILLLLZI.LJFF.getTracks();
        o.LJIIIIZZ(tracks, "data.nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            Iterator<NLETrackSlot> it2 = it.next().LJIILL().iterator();
            while (it2.hasNext()) {
                NLETrackSlot next = it2.next();
                if (next != null && (LJI = next.LJI()) != null && (LIZIZ = LJI.LIZIZ()) != null) {
                    str = LIZIZ.LIZJ();
                } else {
                    str = null;
                }
                if (TEVideoUtils.nativeCheckAudioFile(str) == 0) {
                    return Boolean.TRUE;
                }
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JDW: MusicReplacePipeline: End ");
        getClass();
        LIZ.append(0);
        LIZ.append(' ');
        LIZ.append(LIZ());
        LIZ.append(" time=");
        LIZ.append((System.currentTimeMillis() - this.LJLILLLLZI.LJI) / j);
        H78.LJI(X1D.LIZIZ(LIZ));
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
