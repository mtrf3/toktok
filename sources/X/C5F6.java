package X;

import com.bytedance.ies.nle.editor_jni.NLEAudioCompileEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.audio.AudioRecordActivityViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import fjb.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.audio.AudioRecordActivityViewModel$compileRecordAudio$2$1", f = "AudioRecordActivityViewModel.kt", l = {154}, m = "invokeSuspend")
/* renamed from: X.5F6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5F6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ AudioRecordActivityViewModel LJLJI;
    public final /* synthetic */ C68322mC<String> LJLJJI;
    public final /* synthetic */ EditorProContext LJLJJL;
    public final /* synthetic */ VideoPublishEditModel LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5F6(AudioRecordActivityViewModel audioRecordActivityViewModel, C68322mC<String> c68322mC, EditorProContext editorProContext, VideoPublishEditModel videoPublishEditModel, InterfaceC67352kd<? super C5F6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = audioRecordActivityViewModel;
        this.LJLJJI = c68322mC;
        this.LJLJJL = editorProContext;
        this.LJLJJLL = videoPublishEditModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5F6(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C68322mC<String> c68322mC;
        NLESegment LJI;
        NLEResourceNode LIZIZ;
        T t;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                c68322mC = this.LJLIL;
                C141335gf.LIZJ(obj);
                t = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            String value = this.LJLJI.LJLJJI.getValue();
            if (value != null) {
                C16880lQ.LLLZZIL(new File(value));
            }
            c68322mC = this.LJLJJI;
            AudioRecordActivityViewModel audioRecordActivityViewModel = this.LJLJI;
            EditorProContext editorProContext = this.LJLJJL;
            VideoPublishEditModel videoPublishEditModel = this.LJLJJLL;
            this.LJLIL = c68322mC;
            this.LJLILLLLZI = 1;
            audioRecordActivityViewModel.getClass();
            final XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            InterfaceC171126nc pathAdapter = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("compose_record");
            LIZ.append(System.currentTimeMillis());
            LIZ.append(".wav");
            final String LJ = pathAdapter.LJ(videoPublishEditModel, X1D.LIZIZ(LIZ));
            C133785Mw LIZIZ2 = C133035Jz.LIZIZ(C133785Mw.LJFF, "EditorPro-record-audio", null);
            NLEModel dynamicCast = NLEModel.dynamicCast(C79057V0z.LJJ(editorProContext).LJ().deepClone(true));
            NLETrack mainTrack = dynamicCast.getMainTrack();
            NLEEditorJniJNI.NLETrack_setAudioEnable(mainTrack.LIZ, mainTrack, false);
            VecNLETrackSPtr tracks = dynamicCast.getTracks();
            o.LJIIIIZZ(tracks, "this.tracks");
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                NLETrack next = it.next();
                NLETrack it2 = next;
                if (C79057V0z.LJJIJIL(it2) == EnumC123864ta.AUDIO) {
                    o.LJIIIIZZ(it2, "it");
                    if (!C124574uj.LJJIJIL(it2)) {
                        arrayList.add(next);
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                dynamicCast.removeTrack((NLETrack) it3.next());
            }
            VecNLETrackSPtr tracks2 = dynamicCast.getTracks();
            ArrayList LIZ2 = C07080Po.LIZ(tracks2, "this.tracks");
            Iterator<NLETrack> it4 = tracks2.iterator();
            while (it4.hasNext()) {
                ORS.LJJLIIIJILLIZJL(it4.next().LJIILL(), LIZ2);
            }
            Iterator it5 = LIZ2.iterator();
            while (it5.hasNext()) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) it5.next();
                if (nLETrackSlot.hasExtra("extra_origin_voice_file_path") && (LJI = nLETrackSlot.LJI()) != null && (LIZIZ = LJI.LIZIZ()) != null) {
                    LIZIZ.LJIIIZ(nLETrackSlot.getExtra("extra_origin_voice_file_path"));
                }
            }
            dynamicCast.addToStage(0L);
            LIZIZ2.R8(dynamicCast);
            final long currentTimeMillis = System.currentTimeMillis();
            LIZIZ2.W8().LJII(LJ, new NLEAudioCompileEncodeSettings(), new InterfaceC133955Nn(xks, currentTimeMillis, LJ) { // from class: X.5FB
                public float LIZ;
                public final /* synthetic */ XJL<String> LIZIZ;
                public final /* synthetic */ String LIZJ;

                @Override // X.InterfaceC133955Nn
                public final void onCompileDone() {
                    System.currentTimeMillis();
                    XJL<String> xjl = this.LIZIZ;
                    String str = this.LIZJ;
                    C3C5.m7constructorimpl(str);
                    xjl.resumeWith(str);
                }

                @Override // X.InterfaceC133955Nn
                public final void onCompileProgress(float f) {
                    if (Math.abs(f - this.LIZ) > 0.1d) {
                        this.LIZ = f;
                    }
                }

                {
                    this.LIZJ = LJ;
                }

                @Override // X.InterfaceC133955Nn
                public final void onCompileError(int i2, int i3, float f, String str) {
                    XJL<String> xjl = this.LIZIZ;
                    C3C5.m7constructorimpl("");
                    xjl.resumeWith("");
                }
            });
            xks.LJIILIIL(new AqS168S0100000_2(LIZIZ2, 514));
            Object LJIIJJI = xks.LJIIJJI();
            t = LJIIJJI;
            if (LJIIJJI == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        c68322mC.element = t;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("compileRecordAudio finish: ");
        LIZ3.append(this.LJLJJI.element);
        H7C.LJI(3, "music", null, X1D.LIZIZ(LIZ3));
        return C76800UCe.LIZ;
    }
}
