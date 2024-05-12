package X;

import com.bytedance.ies.nle.editor_jni.NLEAudioCompileEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import defpackage.t1;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS36S1300000_2;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.VOLogicComponent$prepareSaving$1$1", f = "VOApiComponent.kt", l = {609}, m = "invokeSuspend")
/* renamed from: X.5F5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5F5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C5F9 LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C5T6 LJLJJI;
    public final /* synthetic */ AudioRecorderParam LJLJJL;
    public final /* synthetic */ AudioRecorderParam LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5F5(C5F9 c5f9, boolean z, C5T6 c5t6, AudioRecorderParam audioRecorderParam, AudioRecorderParam audioRecorderParam2, InterfaceC67352kd<? super C5F5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c5f9;
        this.LJLJI = z;
        this.LJLJJI = c5t6;
        this.LJLJJL = audioRecorderParam;
        this.LJLJJLL = audioRecorderParam2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5F5(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        NLEModel LJJ;
        Object obj2;
        NLESegment LJI;
        NLEResourceNode LIZIZ;
        Object obj3 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj3);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj3);
            this.LJLILLLLZI.LIZIZ();
            if (this.LJLJI) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LJLJJI.LJJLIIIJJIZ());
                LIZ.append("compiled_");
                LIZ.append(System.currentTimeMillis());
                LIZ.append(".wav");
                final String LIZIZ2 = X1D.LIZIZ(LIZ);
                InterfaceC153045zY value = this.LJLJJI.Ll0().Kh().getValue();
                if (value != null && (LJJ = C17N.LJJ(value)) != null) {
                    this.LJLIL = 1;
                    final XKS xks = new XKS(1, C78555UsJ.LJJII(this));
                    xks.LJIIL();
                    C133785Mw LIZIZ3 = C133035Jz.LIZIZ(C133785Mw.LJFF, "AudioEditing", null);
                    NLEModel dynamicCast = NLEModel.dynamicCast(LJJ.deepClone(true));
                    NLETrack mainTrack = dynamicCast.getMainTrack();
                    NLEEditorJniJNI.NLETrack_setAudioEnable(mainTrack.LIZ, mainTrack, false);
                    VecNLETrackSPtr tracks = dynamicCast.getTracks();
                    o.LJIIIIZZ(tracks, "this.tracks");
                    ArrayList arrayList = new ArrayList();
                    Iterator<NLETrack> it = tracks.iterator();
                    while (it.hasNext()) {
                        NLETrack next = it.next();
                        NLETrack nLETrack = next;
                        if (C79057V0z.LJJIJIL(nLETrack) == EnumC123864ta.AUDIO && !o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
                            arrayList.add(next);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        dynamicCast.removeTrack((NLETrack) it2.next());
                    }
                    Iterator LIZJ = t1.LIZJ(dynamicCast, "this.tracks");
                    while (true) {
                        if (LIZJ.hasNext()) {
                            obj2 = LIZJ.next();
                            NLETrack nLETrack2 = (NLETrack) obj2;
                            if (C79057V0z.LJJIJIL(nLETrack2) == EnumC123864ta.AUDIO && o.LJ(nLETrack2.getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    NLETrack nLETrack3 = (NLETrack) obj2;
                    if (nLETrack3 != null) {
                        NLEEditorJniJNI.NLETrack_clearFilter(nLETrack3.LIZ, nLETrack3);
                    }
                    VecNLETrackSPtr tracks2 = dynamicCast.getTracks();
                    ArrayList LIZ2 = C07080Po.LIZ(tracks2, "this.tracks");
                    Iterator<NLETrack> it3 = tracks2.iterator();
                    while (it3.hasNext()) {
                        ORS.LJJLIIIJILLIZJL(it3.next().LJIILL(), LIZ2);
                    }
                    Iterator it4 = LIZ2.iterator();
                    while (it4.hasNext()) {
                        NLETrackSlot nLETrackSlot = (NLETrackSlot) it4.next();
                        if (nLETrackSlot.hasExtra("extra_origin_voice_file_path") && (LJI = nLETrackSlot.LJI()) != null && (LIZIZ = LJI.LIZIZ()) != null) {
                            LIZIZ.LJIIIZ(nLETrackSlot.getExtra("extra_origin_voice_file_path"));
                        }
                    }
                    dynamicCast.addToStage(0L);
                    LIZIZ3.R8(dynamicCast);
                    final long currentTimeMillis = System.currentTimeMillis();
                    LIZIZ3.W8().LJII(LIZIZ2, new NLEAudioCompileEncodeSettings(), new InterfaceC133955Nn(xks, currentTimeMillis, LIZIZ2) { // from class: X.5FA
                        public float LIZ;
                        public final /* synthetic */ XJL<String> LIZIZ;
                        public final /* synthetic */ String LIZJ;

                        @Override // X.InterfaceC133955Nn
                        public final void onCompileDone() {
                            System.currentTimeMillis();
                            XJL<String> xjl = this.LIZIZ;
                            String str2 = this.LIZJ;
                            C3C5.m7constructorimpl(str2);
                            xjl.resumeWith(str2);
                        }

                        @Override // X.InterfaceC133955Nn
                        public final void onCompileProgress(float f) {
                            if (Math.abs(f - this.LIZ) > 0.1d) {
                                this.LIZ = f;
                            }
                        }

                        {
                            this.LIZJ = LIZIZ2;
                        }

                        @Override // X.InterfaceC133955Nn
                        public final void onCompileError(int i2, int i3, float f, String str2) {
                            XJL<String> xjl = this.LIZIZ;
                            C3C5.m7constructorimpl("");
                            xjl.resumeWith("");
                        }
                    });
                    xks.LJIILIIL(new AqS168S0100000_2(LIZIZ3, 94));
                    obj3 = xks.LJIIJJI();
                    if (obj3 == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else {
                    str = null;
                }
            } else {
                str = "";
            }
            C43045Guv.LIZLLL(new AqS36S1300000_2(this.LJLJJI, str, this.LJLJJL, this.LJLJJLL, 0), 0L);
            this.LJLILLLLZI.LIZ();
            return C76800UCe.LIZ;
        }
        str = (String) obj3;
        C43045Guv.LIZLLL(new AqS36S1300000_2(this.LJLJJI, str, this.LJLJJL, this.LJLJJLL, 0), 0L);
        this.LJLILLLLZI.LIZ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
