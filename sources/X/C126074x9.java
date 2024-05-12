package X;

import android.text.TextUtils;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.4x9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126074x9 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ C125254vp LJLJJL;
    public final /* synthetic */ NLESegmentVideo LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<C125234vn, C76800UCe> LJLJL;
    public final /* synthetic */ NLETrackSlot LJLJLJ;
    public final /* synthetic */ NLETrackSlot LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C126074x9(int i, int i2, int i3, String str, C125254vp c125254vp, NLESegmentVideo nLESegmentVideo, InterfaceC88472Yns<? super C125234vn, C76800UCe> interfaceC88472Yns, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = str;
        this.LJLJJL = c125254vp;
        this.LJLJJLL = nLESegmentVideo;
        this.LJLJL = interfaceC88472Yns;
        this.LJLJLJ = nLETrackSlot;
        this.LJLJLLL = nLETrackSlot2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        boolean z;
        int i = this.LJLIL;
        if ((i == 17 || i == 41) && this.LJLILLLLZI == 0 && this.LJLJI == 0 && (str = this.LJLJJI) != null) {
            C125254vp c125254vp = this.LJLJJL;
            NLESegmentVideo nLESegmentVideo = this.LJLJJLL;
            InterfaceC88472Yns<C125234vn, C76800UCe> interfaceC88472Yns = this.LJLJL;
            NLETrackSlot nLETrackSlot = this.LJLJLJ;
            NLETrackSlot nLETrackSlot2 = this.LJLJLLL;
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("interface");
                String optString2 = jSONObject.optString("status");
                if (o.LJ(optString, "editing_effect_server_algo")) {
                    if (o.LJ(optString2, "fail") || o.LJ(optString2, "cached result wrong")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (o.LJ(optString2, "success")) {
                        PthreadTimer pthreadTimer = c125254vp.LIZLLL;
                        if (pthreadTimer != null) {
                            pthreadTimer.cancel();
                        }
                        c125254vp.LIZLLL = null;
                        MessageCenter.removeListener(c125254vp.LJ);
                        if (nLESegmentVideo != null) {
                            nLESegmentVideo.LJIJJ(nLETrackSlot.getDuration() + nLESegmentVideo.LJIILIIL());
                            nLETrackSlot2.setEndTime(nLETrackSlot.getDuration() + nLETrackSlot2.getStartTime());
                            NLEResourceNode LIZIZ = nLESegmentVideo.LIZIZ();
                            if (LIZIZ != null) {
                                LIZIZ.setDuration(nLETrackSlot.getDuration() + nLESegmentVideo.LJIILIIL());
                            }
                        }
                        interfaceC88472Yns.invoke(new C125234vn(true, null));
                    } else if (z) {
                        PthreadTimer pthreadTimer2 = c125254vp.LIZLLL;
                        if (pthreadTimer2 != null) {
                            pthreadTimer2.cancel();
                        }
                        c125254vp.LIZLLL = null;
                        MessageCenter.removeListener(c125254vp.LJ);
                        if (o.LJ(optString2, "fail")) {
                            interfaceC88472Yns.invoke(new C125234vn(false, EnumC125274vr.EFFECT_RENDERING_ERROR));
                        } else if (o.LJ(optString2, "cached result wrong")) {
                            interfaceC88472Yns.invoke(new C125234vn(false, EnumC125274vr.EFFECT_CACHE_ERROR));
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
