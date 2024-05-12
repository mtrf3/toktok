package X;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bye, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30536Bye implements InterfaceC72822Si2 {
    public final /* synthetic */ C30537Byf LJLIL;

    public C30536Bye(C30537Byf c30537Byf) {
        this.LJLIL = c30537Byf;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        LiveEffect liveEffect;
        String str2;
        String str3;
        if (o.LJ(c199097rd.LJLIL, "ttlive_report_effect_preview")) {
            List<LiveEffect> LIZ = C30355Bvj.LIZJ().LIZ(C0TY.LIZIZ);
            o.LJIIIIZZ(LIZ, "getBaseComposerManager()…cker(EffectPanel.STICKER)");
            LiveEffect liveEffect2 = (LiveEffect) ORZ.LJLLLL(LIZ);
            if (liveEffect2 != null) {
                this.LJLIL.LIZIZ = liveEffect2;
            }
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                str = interfaceC78280Uns.getString("action");
            } else {
                str = null;
            }
            if (TextUtils.equals(str, "hide")) {
                LiveEffect liveEffect3 = this.LJLIL.LIZIZ;
                if (liveEffect3 != null && (str3 = liveEffect3.parentResId) != null && C7N.LJII().getLiveEffectRemoveList() != null) {
                    java.util.Set<String> set = C39591gx.LIZIZ;
                    set.add(str3);
                    C48459J0d<java.util.Set<String>> c48459J0d = InterfaceC30442Bx8.S1;
                    c48459J0d.LIZ(set);
                    c48459J0d.LIZLLL();
                }
                if (C7N.LJII().getLiveEffectRemoveList() != null) {
                    C39591gx.LIZ(this.LJLIL.LIZIZ);
                    return;
                }
                return;
            }
            if (!TextUtils.equals(str, "unhide")) {
                return;
            }
            LiveEffect liveEffect4 = this.LJLIL.LIZIZ;
            if (liveEffect4 != null && (str2 = liveEffect4.parentResId) != null && C7N.LJII().getLiveEffectRemoveList() != null) {
                java.util.Set<String> set2 = C39591gx.LIZIZ;
                set2.remove(str2);
                C48459J0d<java.util.Set<String>> c48459J0d2 = InterfaceC30442Bx8.S1;
                c48459J0d2.LIZ(set2);
                c48459J0d2.LIZLLL();
            }
            if (C7N.LJII().getLiveEffectRemoveList() == null || (liveEffect = this.LJLIL.LIZIZ) == null) {
                return;
            }
            String resourceId = liveEffect.getResourceId();
            if (resourceId != null) {
                java.util.Set<String> set3 = C39591gx.LIZIZ;
                set3.remove(resourceId);
                C48459J0d<java.util.Set<String>> c48459J0d3 = InterfaceC30442Bx8.S1;
                c48459J0d3.LIZ(set3);
                c48459J0d3.LIZLLL();
            }
            Iterator<C17H> it = C39591gx.LIZJ.iterator();
            while (it.hasNext()) {
                it.next().LIZ(liveEffect);
            }
        }
    }
}
