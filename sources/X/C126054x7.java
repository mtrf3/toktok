package X;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.TimerTask;
import kotlin.jvm.internal.AqS48S0400000_2;
import kotlin.jvm.internal.AqS62S0400000_2;

/* renamed from: X.4x7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126054x7 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ NLETrackSlot LJLIL;
    public final /* synthetic */ NLEVideoEffect LJLILLLLZI;
    public final /* synthetic */ C125254vp LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ NLESegmentVideo LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<C125234vn, C76800UCe> LJLJJLL;
    public final /* synthetic */ NLETrackSlot LJLJL;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C126054x7(NLETrackSlot nLETrackSlot, NLEVideoEffect nLEVideoEffect, C125254vp c125254vp, String str, NLESegmentVideo nLESegmentVideo, AqS48S0400000_2 aqS48S0400000_2, NLETrackSlot nLETrackSlot2, InterfaceC88472Yns interfaceC88472Yns) {
        super(0);
        this.LJLIL = nLETrackSlot;
        this.LJLILLLLZI = nLEVideoEffect;
        this.LJLJI = c125254vp;
        this.LJLJJI = str;
        this.LJLJJL = nLESegmentVideo;
        this.LJLJJLL = aqS48S0400000_2;
        this.LJLJL = nLETrackSlot2;
        this.LJLJLJ = interfaceC88472Yns;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [X.4x8] */
    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        NLETrackSlot nLETrackSlot = this.LJLIL;
        NLEEditorJniJNI.NLETrackSlot_clearVideoAnim(nLETrackSlot.LIZ, nLETrackSlot);
        NLETrackSlot nLETrackSlot2 = this.LJLIL;
        NLEVideoEffect nLEVideoEffect = this.LJLILLLLZI;
        NLEEditorJniJNI.NLETrackSlot_addVideoEffect(nLETrackSlot2.LIZ, nLETrackSlot2, NLEVideoEffect.LIZ(nLEVideoEffect), nLEVideoEffect);
        final C76732zl c76732zl = new C76732zl();
        final C125254vp c125254vp = this.LJLJI;
        final NLESegmentVideo nLESegmentVideo = this.LJLJJL;
        final InterfaceC88472Yns<C125234vn, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
        final NLETrackSlot nLETrackSlot3 = this.LJLJL;
        final NLETrackSlot nLETrackSlot4 = this.LJLIL;
        c125254vp.LJ = new MessageCenter.Listener() { // from class: X.4x8
            @Override // com.bef.effectsdk.message.MessageCenter.Listener
            public final void onMessageReceived(int i, int i2, int i3, String str) {
                C2ND.LIZIZ(new C126074x9(i, i2, i3, str, C125254vp.this, nLESegmentVideo, interfaceC88472Yns, nLETrackSlot3, nLETrackSlot4), 0L);
            }
        };
        MessageCenter.init();
        MessageCenter.addListener(this.LJLJI.LJ);
        VecString vecString = new VecString(new String[]{this.LJLJJI});
        NLEMediaPublicJniJNI.NLEMediaUtil_operateGlobalAllowedPaths(VecString.LIZJ(vecString), vecString, EnumC123984tm.NLE_ALLOWLISTOPERATION_TYPE_ADD.swigValue());
        this.LJLJI.LIZ.LIZIZ();
        C125254vp c125254vp2 = this.LJLJI;
        PthreadTimer pthreadTimer = new PthreadTimer("CombineEffectHandler$handleApplyMagic$1$1$2$2$2");
        final C125254vp c125254vp3 = this.LJLJI;
        final InterfaceC88472Yns<C125234vn, C76800UCe> interfaceC88472Yns2 = this.LJLJJLL;
        final InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns3 = this.LJLJLJ;
        pthreadTimer.schedule(new TimerTask() { // from class: X.4xA
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    C2ND.LIZIZ(new AqS62S0400000_2(C125254vp.this, (C125254vp) c76732zl, (C76732zl) interfaceC88472Yns2, (InterfaceC88472Yns<? super C125234vn, C76800UCe>) interfaceC88472Yns3, (InterfaceC88472Yns<? super Integer, C76800UCe>) 2), 0L);
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, 0L, 333L);
        c125254vp2.LIZLLL = pthreadTimer;
        return C76800UCe.LIZ;
    }
}
