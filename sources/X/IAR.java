package X;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class IAR implements InterfaceC74343TFr {
    public final ShortVideoContext LIZ;
    public final InterfaceC65784Pro<I0N> LIZIZ;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 728));
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(IAJ.LJLIL);

    @Override // X.InterfaceC74343TFr
    public final void LIZ(List list, List list2, List list3) {
    }

    @Override // X.InterfaceC74343TFr
    public final InterfaceC74346TFu LJFF() {
        return (IAI) this.LIZLLL.getValue();
    }

    public final I0N LJIILIIL() {
        return (I0N) this.LIZJ.getValue();
    }

    public final boolean LJIILJJIL() {
        MutableLiveData K;
        IDH LLLF = LJIILIIL().LLLF();
        if (LLLF != null && (K = LLLF.K()) != null) {
            return o.LJ(K.getValue(), Boolean.TRUE);
        }
        return false;
    }

    @Override // X.InterfaceC74343TFr
    public final void LJ(String enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        C78880UxY.LJJLIIIJL("prop_panel_open", C78880UxY.LJIJJLI(this.LIZ, new OSZ("enter_method", enterMethod)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IAR(ShortVideoContext shortVideoContext, InterfaceC65784Pro<? extends I0N> interfaceC65784Pro) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = interfaceC65784Pro;
    }

    public static void LJIIJJI(HashMap hashMap, Effect effect) {
        String str;
        List<String> music = effect.getMusic();
        if (music == null || (str = (String) ORZ.LJLLLL(music)) == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (V3N.LJJII(effect)) {
            hashMap.put("music_selected_from", "prop_music_bind");
        } else {
            hashMap.put("music_selected_from", "prop_music_soft_bind");
        }
    }

    @Override // X.InterfaceC74343TFr
    public final void LIZJ(int i, long j) {
        C78880UxY.LJJLIIIJL("tool_performance_enter_prop_tab", C78880UxY.LJIJJLI(this.LIZ, new OSZ("duration", String.valueOf(j)), new OSZ("status", String.valueOf(i))));
    }

    @Override // X.InterfaceC74343TFr
    public final void LJI(String categoryKey, String str) {
        o.LJIIIZ(categoryKey, "categoryKey");
        C10K.LIZJ(new CallableC46031I4t(str, this, C87277YNd.LJIILLIIL(LJIILIIL().LLLLL()), categoryKey));
    }

    @Override // X.InterfaceC74343TFr
    public final void LJII(long j, String str) {
        C78880UxY.LJJLIIIJL("tool_performance_effect_use_info", C78880UxY.LJIJJLI(this.LIZ, new OSZ("duration", String.valueOf(j)), new OSZ("effect_id", str)));
    }

    @Override // X.InterfaceC74343TFr
    public final void LJIIIIZZ(long j, boolean z) {
        C78880UxY.LJJLIIIJL("tool_performance_enter_prop_carousel", C78880UxY.LJIJJLI(this.LIZ, new OSZ("duration", String.valueOf(j)), new OSZ("status", String.valueOf(0)), new OSZ("animated", String.valueOf(z ? 1 : 0))));
    }

    public final HashMap<String, String> LJIIL(Effect effect, String str) {
        ShortVideoContext shortVideoContext = this.LIZ;
        OSZ[] oszArr = new OSZ[5];
        oszArr[0] = new OSZ("enter_method", str);
        oszArr[1] = new OSZ("prop_id", effect.getEffectId());
        oszArr[2] = new OSZ("effect_name", effect.getName());
        String parentId = effect.getParentId();
        if (parentId == null) {
            parentId = "";
        }
        oszArr[3] = new OSZ("parent_pop_id", parentId);
        oszArr[4] = new OSZ("prop_index", effect.getGradeKey());
        return C78880UxY.LJIJJLI(shortVideoContext, oszArr);
    }

    @Override // X.InterfaceC74343TFr
    public final void LIZLLL(Effect effect, boolean z, String str, OSZ<String, String>... oszArr) {
        o.LJIIIZ(effect, "effect");
        if (C60903NvH.LJIIJJI().getAccountService().isChildrenMode()) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("user_id", C77339UWx.LIZJ());
            c145995oB.LJI("group_id", C78983UzD.LJJIJL());
            c145995oB.LJI("effect_id", effect.getEffectId());
            c145995oB.LJI("creation_id", this.LIZ.LJI());
            int i = this.LIZ.draftId;
            if (i != 0) {
                c145995oB.LIZ(i, "draft_id");
            }
            java.util.Map<String, String> map = c145995oB.LIZ;
            o.LJIIIIZZ(map, "builder.builder()");
            C78880UxY.LJJLIIIJL("prop_save", map);
            return;
        }
        HashMap<String, String> LJIIL = LJIIL(effect, str);
        if (z) {
            String parentId = effect.getParentId();
            if (parentId == null) {
                parentId = "";
            }
            LJIIL.put("parent_pop_id", parentId);
        }
        C78880UxY.LJJLIIIJL("prop_save", LJIIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x016d, code lost:
    
        if (r10 == null) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015a  */
    @Override // X.InterfaceC74343TFr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect r13, java.lang.String r14, java.lang.String r15, int r16, java.lang.String r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IAR.LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.String, java.lang.String, int, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0275  */
    @Override // X.InterfaceC74343TFr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(com.ss.android.ugc.effectmanager.effect.model.Effect r18, boolean r19, java.lang.String r20, int r21, boolean r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IAR.LJIIIZ(com.ss.android.ugc.effectmanager.effect.model.Effect, boolean, java.lang.String, int, boolean, android.os.Bundle):void");
    }

    @Override // X.InterfaceC74343TFr
    public final void LJIIJ(String str, String str2, String str3, int i, int i2, LinearLayoutManager layoutManager) {
        long LJJI;
        String str4;
        o.LJIIIZ(layoutManager, "layoutManager");
        if (!ujb.o.LJJJJIZL(LJIILIIL().LLLLL().LJIIJJI(), str2, false)) {
            return;
        }
        if (this.LIZ.isCarouselOpen && (LJIILIIL().LLLLL().LJJJIL() > 0 || LJIILIIL().LLLLL().LJJJJJL() > 0)) {
            str4 = "tool_performance_record_effect_carousel";
            if (LJIILIIL().LLLLL().LJJJIL() > 0) {
                LJJI = LJIILIIL().LLLLL().LJJJIL();
            } else {
                LJJI = LJIILIIL().LLLLL().LJJJJJL();
            }
        } else if (LJIILIIL().LLLLL().LJJJJJL() > 0) {
            LJJI = LJIILIIL().LLLLL().LJJJJJL();
            str4 = "tool_performance_record_effect_first_tab";
        } else {
            if (LJIILIIL().LLLLL().LJJI() <= 0) {
                return;
            }
            LJJI = LJIILIIL().LLLLL().LJJI();
            str4 = "tool_performance_record_effect_switch_tab";
        }
        int LLILLJJLI = layoutManager.LLILLJJLI() - layoutManager.LLILL();
        JSONObject LJ = C47135Ieh.LJ("tab_id", str, "tab_name", str3);
        LJ.put("average_duration", i);
        LJ.put("first_screen_effect_count", LLILLJJLI);
        LJ.put("icon_load_fail_count", i2);
        LJ.put("duration", System.currentTimeMillis() - LJJI);
        GXR.LIZIZ(str4, LJ);
        LJIILIIL().LLLLL().LJJIJIIJI(0L);
        LJIILIIL().LLLLL().LJJJI(0L);
        LJIILIIL().LLLLL().LJJIJIL(0L);
    }
}
