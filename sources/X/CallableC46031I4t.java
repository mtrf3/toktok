package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.I4t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC46031I4t<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ IAR LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    public CallableC46031I4t(String str, IAR iar, String str2, String str3) {
        this.LJLIL = str;
        this.LJLILLLLZI = iar;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String LJIJI;
        String str;
        String str2 = "video_shoot_page";
        if (o.LJ(this.LJLIL, LiveGiftNewGifterBadgeSetting.DEFAULT) && C1DG.LJIIIIZZ()) {
            Effect LIZJ = C82398WVm.LIZJ(this.LJLILLLLZI.LJIILIIL());
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("shoot_way", this.LJLILLLLZI.LIZ.shootWay);
            c145995oB.LJI("enter_from", "video_shoot_page");
            c145995oB.LJI("creation_id", this.LJLILLLLZI.LIZ.LJI());
            String str3 = null;
            if (LIZJ != null) {
                str = LIZJ.getEffectId();
            } else {
                str = null;
            }
            c145995oB.LJI("effect_id", str);
            if (LIZJ != null) {
                str3 = LIZJ.getName();
            }
            c145995oB.LJI("effect_name", str3);
            int i = this.LJLILLLLZI.LIZ.draftId;
            if (i != 0) {
                c145995oB.LIZ(i, "draft_id");
            }
            java.util.Map<String, String> map = c145995oB.LIZ;
            o.LJIIIIZZ(map, "builder.builder()");
            C78880UxY.LJJLIIIJL("remove_effect", map);
        } else {
            OSZ LJIIZILJ = C87277YNd.LJIIZILJ(this.LJLILLLLZI.LJIILIIL().LLLLL(), this.LJLJI);
            ShortVideoContext shortVideoContext = this.LJLILLLLZI.LIZ;
            OSZ[] oszArr = new OSZ[1];
            String str4 = this.LJLIL;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            oszArr[0] = new OSZ("tab_name", str4);
            HashMap LJIJJLI = C78880UxY.LJIJJLI(shortVideoContext, oszArr);
            if (this.LJLILLLLZI.LIZ.isStory) {
                str2 = "story_shoot_page";
            }
            LJIJJLI.put("shoot_page", str2);
            ShortVideoContext shortVideoContext2 = this.LJLILLLLZI.LIZ;
            if (shortVideoContext2.isStory) {
                LJIJI = "story";
            } else {
                LJIJI = shortVideoContext2.LJIJI();
            }
            o.LJIIIIZZ(LJIJI, "if (shortVideoContext.is…VideoContext.shootTabName");
            LJIJJLI.put("shoot_tab_name", LJIJI);
            LJIJJLI.put("prop_cnt", String.valueOf(C87277YNd.LJIILL(this.LJLILLLLZI.LJIILIIL().LLLLL(), this.LJLJI)));
            LJIJJLI.put("filter_prop_cnt", LJIIZILJ.getFirst());
            LJIJJLI.put("filter_prop_list", LJIIZILJ.getSecond());
            C78880UxY.LJJLIIIJL("click_prop_tab", LJIJJLI);
            if (o.LJ(this.LJLJJI, "create")) {
                String LJI = this.LJLILLLLZI.LIZ.LJI();
                o.LJIIIIZZ(LJI, "shortVideoContext.creationId");
                LJIJJLI.put("creation_id", LJI);
                String str6 = this.LJLILLLLZI.LIZ.enterFrom;
                o.LJIIIIZZ(str6, "shortVideoContext.enterFrom");
                LJIJJLI.put("enter_from", str6);
                String str7 = this.LJLILLLLZI.LIZ.shootWay;
                if (str7 != null) {
                    str5 = str7;
                }
                LJIJJLI.put("shoot_way", str5);
                C78880UxY.LJJLIIIJL("mobile_effect_create_tab_entry", LJIJJLI);
            }
        }
        return C76800UCe.LIZ;
    }
}
