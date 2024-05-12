package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.restore.DraftCreativeRestoreHandlerKt$splitRecordAudioIfNeeded$2", f = "DraftCreativeRestoreHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5Cx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131195Cx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ NLEEditor LJLIL;
    public final /* synthetic */ AudioRecorderParam LJLILLLLZI;
    public final /* synthetic */ C132455Ht LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131195Cx(NLEEditor nLEEditor, AudioRecorderParam audioRecorderParam, C132455Ht c132455Ht, InterfaceC67352kd<? super C131195Cx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = nLEEditor;
        this.LJLILLLLZI = audioRecorderParam;
        this.LJLJI = c132455Ht;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C131195Cx(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        VecNLETrackSPtr tracks = this.LJLIL.LJ().getTracks();
        o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (nLETrack.LJIIZILJ() == EnumC123864ta.AUDIO && o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
                arrayList.add(next);
            }
        }
        NLEEditor nLEEditor = this.LJLIL;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            nLEEditor.LJ().removeTrack((NLETrack) it2.next());
        }
        Stack<Point> mStack = this.LJLILLLLZI.getMStack();
        AudioRecorderParam audioRecorderParam = this.LJLILLLLZI;
        C132455Ht c132455Ht = this.LJLJI;
        NLEEditor nLEEditor2 = this.LJLIL;
        int i = 0;
        for (Object obj2 : mStack) {
            int i2 = i + 1;
            if (i >= 0) {
                Point point = (Point) obj2;
                String audioUrl = audioRecorderParam.getAudioUrl();
                o.LJIIIIZZ(point, "point");
                String LIZJ = C56J.LIZJ(audioUrl, point, c132455Ht);
                if (LIZJ.length() != 0) {
                    NLEModel LJ = nLEEditor2.LJ();
                    o.LJIIIIZZ(LJ, "nleEditor.model");
                    NLETrack LIZIZ = C56J.LIZIZ(LJ);
                    NLETrackSlot LIZ = C56J.LIZ(new C5D4(point, LIZJ), i);
                    LIZIZ.LIZIZ(LIZ);
                    NLEModel LJ2 = nLEEditor2.LJ();
                    o.LJIIIIZZ(LJ2, "nleEditor.model");
                    C122494rN.LIZIZ(LJ2).LIZIZ(NLETrackSlot.LIZ(LIZ.deepClone(true)));
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
