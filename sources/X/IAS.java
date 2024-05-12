package X;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IAS implements InterfaceC74343TFr {
    public final ShortVideoContext LIZ;

    @Override // X.InterfaceC74343TFr
    public final void LIZ(List list, List list2, List list3) {
    }

    @Override // X.InterfaceC74343TFr
    public final void LIZJ(int i, long j) {
    }

    @Override // X.InterfaceC74343TFr
    public final void LIZLLL(Effect effect, boolean z, String str, OSZ<String, String>... oszArr) {
        o.LJIIIZ(effect, "effect");
    }

    @Override // X.InterfaceC74343TFr
    public final void LJ(String enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
    }

    @Override // X.InterfaceC74343TFr
    public final void LJI(String categoryKey, String str) {
        o.LJIIIZ(categoryKey, "categoryKey");
    }

    @Override // X.InterfaceC74343TFr
    public final void LJII(long j, String str) {
    }

    @Override // X.InterfaceC74343TFr
    public final void LJIIIIZZ(long j, boolean z) {
    }

    @Override // X.InterfaceC74343TFr
    public final InterfaceC74346TFu LJFF() {
        return IAU.LIZ;
    }

    public IAS(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
    }

    public final HashMap<String, String> LJIIJJI(Effect effect, String str) {
        ShortVideoContext shortVideoContext = this.LIZ;
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("enter_method", str);
        oszArr[1] = new OSZ("prop_id", effect.getEffectId());
        String parentId = effect.getParentId();
        if (parentId == null) {
            parentId = "";
        }
        oszArr[2] = new OSZ("parent_pop_id", parentId);
        oszArr[3] = new OSZ("prop_index", effect.getGradeKey());
        return C78880UxY.LJIJJLI(shortVideoContext, oszArr);
    }

    @Override // X.InterfaceC74343TFr
    public final void LIZIZ(Effect effect, String str, String str2, int i, String tabType, Bundle bundle) {
        String str3;
        String LJIJI;
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(tabType, "tabType");
        HashMap<String, String> LJIIJJI = LJIIJJI(effect, str2);
        if (str == null) {
            str = "";
        }
        LJIIJJI.put("tab_name", str);
        LJIIJJI.put("prop_selected_from", "other");
        LJIIJJI.put("impr_position", String.valueOf(i));
        String recId = effect.getRecId();
        if (recId == null) {
            recId = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIJJI.put("prop_rec_id", recId);
        if (this.LIZ.isStory) {
            str3 = "story_shoot_page";
        } else {
            str3 = "video_shoot_page";
        }
        LJIIJJI.put("shoot_page", str3);
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext.isStory) {
            LJIJI = "story";
        } else {
            LJIJI = shortVideoContext.LJIJI();
        }
        o.LJIIIIZZ(LJIJI, "if (shortVideoContext.is…VideoContext.shootTabName");
        LJIIJJI.put("shoot_tab_name", LJIJI);
        LJIIJJI.put("enter_method", "click_personal_board");
        LJIIJJI.put("is_original_prop", "1");
        LJIIJJI.put("prop_author_id", effect.getDesignerId());
        LJIIJJI.put("tab_id", "1000002");
        C78880UxY.LJJLIIIJL("prop_show", LJIIJJI);
    }

    @Override // X.InterfaceC74343TFr
    public final void LJIIIZ(Effect effect, boolean z, String str, int i, boolean z2, Bundle bundle) {
        String str2;
        String str3;
        String LJIJI;
        o.LJIIIZ(effect, "effect");
        HashMap<String, String> LJIIJJI = LJIIJJI(effect, "click_main_panel");
        String str4 = "";
        if (str == null) {
            str = "";
        }
        LJIIJJI.put("tab_name", str);
        if (!z) {
            LJIIJJI.remove("parent_pop_id");
        }
        if (V3N.LJIILLIIL(effect)) {
            LJIIJJI.put("order", String.valueOf(i - 1));
        }
        if (z2) {
            LJIIJJI.put("prop_selected_from", "outer_rec");
        } else {
            LJIIJJI.put("prop_selected_from", "other");
        }
        String str5 = "1";
        LJIIJJI.put("is_original_prop", "1");
        LJIIJJI.put("prop_author_id", ViewOnClickListenerC74332TFg.LLILIL);
        String recId = effect.getRecId();
        if (recId == null) {
            recId = CardStruct.IStatusCode.DEFAULT;
        }
        C116484hg.LIZIZ(LJIIJJI, "prop_rec_id", recId, i, "impr_position");
        String str6 = this.LIZ.fromPropId;
        if (str6 != null) {
            str4 = str6;
        }
        LJIIJJI.put("from_prop_id", str4);
        if (o.LJ(this.LIZ.fromPropId, effect.getEffectId())) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIJJI.put("is_default_prop", str2);
        if (!effect.isBusiness()) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIJJI.put("is_commercial_prop", str5);
        if (this.LIZ.isStory) {
            str3 = "story_shoot_page";
        } else {
            str3 = "video_shoot_page";
        }
        LJIIJJI.put("shoot_page", str3);
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext.isStory) {
            LJIJI = "story";
        } else {
            LJIJI = shortVideoContext.LJIJI();
        }
        o.LJIIIIZZ(LJIJI, "if (shortVideoContext.is…VideoContext.shootTabName");
        LJIIJJI.put("shoot_tab_name", LJIJI);
        if (bundle != null) {
            String string = bundle.getString("prop_tab_name");
            if (string != null && string.length() != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("prop_panel_");
                LIZ.append(string);
                LJIIJJI.put("prop_selected_from", X1D.LIZIZ(LIZ));
            }
            String string2 = bundle.getString("prop_tab_order");
            if (string2 != null && string2.length() != 0) {
                LJIIJJI.put("prop_tab_order", string2);
            }
        }
        LJIIJJI.put("camera", C78880UxY.LJJIJIIJI(C60903NvH.LJIIJJI().LJJIL().getCameraPosition(1)));
        LJIIJJI.put("tab_id", "1000002");
        C78880UxY.LJJLIIIJL("prop_click", LJIIJJI);
    }

    @Override // X.InterfaceC74343TFr
    public final void LJIIJ(String str, String str2, String str3, int i, int i2, LinearLayoutManager layoutManager) {
        o.LJIIIZ(layoutManager, "layoutManager");
    }
}
