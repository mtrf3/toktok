package X;

import com.ss.android.ugc.aweme.services.audio.AudioWatermarkInfo;
import com.ss.android.ugc.aweme.services.audio.TtsCreatorInfo;
import com.ss.android.ugc.aweme.services.audio.VcCreatorInfo;
import fjb.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl$fetchAudioWatermarkInfo$1$1", f = "AudioWatermarkServiceImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5aD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137335aD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ TtsCreatorInfo LJLIL;
    public final /* synthetic */ VcCreatorInfo LJLILLLLZI;
    public final /* synthetic */ C34K LJLJI;
    public final /* synthetic */ C68322mC<List<String>> LJLJJI;
    public final /* synthetic */ C68322mC<List<String>> LJLJJL;
    public final /* synthetic */ C68322mC<String> LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<AudioWatermarkInfo, C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C137335aD(TtsCreatorInfo ttsCreatorInfo, VcCreatorInfo vcCreatorInfo, C34K c34k, C68322mC<List<String>> c68322mC, C68322mC<List<String>> c68322mC2, C68322mC<String> c68322mC3, InterfaceC88472Yns<? super AudioWatermarkInfo, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C137335aD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = ttsCreatorInfo;
        this.LJLILLLLZI = vcCreatorInfo;
        this.LJLJI = c34k;
        this.LJLJJI = c68322mC;
        this.LJLJJL = c68322mC2;
        this.LJLJJLL = c68322mC3;
        this.LJLJL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137335aD(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List, T] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.List, T] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        VcCreatorInfo vcCreatorInfo;
        C141335gf.LIZJ(obj);
        TtsCreatorInfo ttsCreatorInfo = this.LJLIL;
        if ((ttsCreatorInfo != null && ttsCreatorInfo.getHasTtsCreatorVoice()) || ((vcCreatorInfo = this.LJLILLLLZI) != null && vcCreatorInfo.getHasVcCreatorVoice())) {
            this.LJLJI.element = true;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            TtsCreatorInfo ttsCreatorInfo2 = this.LJLIL;
            if (ttsCreatorInfo2 != null) {
                this.LJLJJI.element = ttsCreatorInfo2.getTtsCreatorIdsList();
                Iterator<String> it = this.LJLIL.getTtsCreatorUserNameList().iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(it.next());
                }
            }
            VcCreatorInfo vcCreatorInfo2 = this.LJLILLLLZI;
            if (vcCreatorInfo2 != null) {
                this.LJLJJL.element = vcCreatorInfo2.getVcCreatorIdsList();
                Iterator<String> it2 = this.LJLILLLLZI.getVcCreatorUserNameList().iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(it2.next());
                }
            }
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                String str = (String) it3.next();
                C68322mC<String> c68322mC = this.LJLJJLL;
                StringBuilder LIZ = X1D.LIZ();
                c68322mC.element = C025908h.LIZIZ(LIZ, this.LJLJJLL.element, str, ", ", LIZ);
            }
            this.LJLJL.invoke(new AudioWatermarkInfo(this.LJLJI.element, this.LJLJJLL.element, this.LJLJJI.element, this.LJLJJL.element));
        } else {
            this.LJLJL.invoke(new AudioWatermarkInfo(this.LJLJI.element, this.LJLJJLL.element, this.LJLJJI.element, this.LJLJJL.element));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
