package com.ss.android.ugc.aweme.viewModel;

import X.C38485F8n;
import X.C72582SeA;
import X.C72593SeL;
import X.C72673Sfd;
import X.C72695Sfz;
import X.C72701Sg5;
import X.HW1;
import X.InterfaceC61312at;
import X.InterfaceC72580Se8;
import X.InterfaceC72603SeV;
import X.InterfaceC72696Sg0;
import X.InterfaceC72700Sg4;
import X.InterfaceC84498XEg;
import X.PVC;
import Y.IDObjectS387S0100000_12;
import android.content.Context;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.google.gson.m;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.navi.featureflags.TiktokAvatarLokiConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS54S0110000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviEditorViewModel extends BaseJediViewModel<ProfileNaviEditorState> implements InterfaceC72700Sg4 {
    public static final String LJLJJLL = TiktokAvatarLokiConfig.LIZ().lokiPanelName;
    public static final String LJLJL = TiktokAvatarLokiConfig.LIZ().headCategoryKey;
    public static final String LJLJLJ = TiktokAvatarLokiConfig.LIZ().scanCategoryKey;
    public static final String LJLJLLL = TiktokAvatarLokiConfig.LIZ().editorHeadEffectName;
    public static final String LJLL = TiktokAvatarLokiConfig.LIZ().scanEffectName;

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new ProfileNaviEditorState(null, 0, null, null, null, null, null, false, false, false, false, false, false, false, 0, 32767, null);
    }

    public static String Mv0(InterfaceC72580Se8 interfaceC72580Se8) {
        String groupId = interfaceC72580Se8.getGroupId();
        if (groupId == null || groupId.length() == 0) {
            return interfaceC72580Se8.getKey();
        }
        String groupId2 = interfaceC72580Se8.getGroupId();
        o.LJI(groupId2);
        return groupId2;
    }

    public static InterfaceC72696Sg0 Nv0(InterfaceC72580Se8 category) {
        InterfaceC72580Se8 interfaceC72580Se8;
        o.LJIIIZ(category, "category");
        HashMap<String, InterfaceC72580Se8> hashMap = C72593SeL.LJ;
        if (hashMap != null && (interfaceC72580Se8 = hashMap.get(category.getKey())) != null) {
            String groupId = interfaceC72580Se8.getGroupId();
            if (groupId == null || groupId.length() == 0) {
                C72582SeA c72582SeA = C72593SeL.LIZIZ;
                if (c72582SeA != null) {
                    return c72582SeA.LIZ(interfaceC72580Se8.getKey());
                }
            } else {
                C72582SeA c72582SeA2 = C72593SeL.LIZIZ;
                if (c72582SeA2 != null) {
                    String groupId2 = interfaceC72580Se8.getGroupId();
                    o.LJI(groupId2);
                    return c72582SeA2.LIZ(groupId2);
                }
            }
        }
        return null;
    }

    public final void Pv0(boolean z) {
        String panel = LJLJJLL;
        AqS54S0110000_12 aqS54S0110000_12 = new AqS54S0110000_12(this, z, 4);
        o.LJIIIZ(panel, "panel");
        EffectManager LJLJJLL2 = ((InterfaceC84498XEg) HW1.LIZIZ.getValue()).LJLJJLL();
        if (LJLJJLL2 == null) {
            return;
        }
        LJLJJLL2.checkedEffectListUpdate(panel, new C72701Sg5(LJLJJLL2, panel, new IDObjectS387S0100000_12(aqS54S0110000_12, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void init(Context context) {
        List<InterfaceC72603SeV> tabList;
        o.LJIIIZ(context, "context");
        HW1.LIZIZ(context);
        ((InterfaceC84498XEg) HW1.LIZIZ.getValue()).LJLJJLL();
        ProfileNaviEditorState profileNaviEditorState = (ProfileNaviEditorState) lv0();
        String sceneStickerPath = profileNaviEditorState.getSceneStickerPath();
        if (sceneStickerPath == null || sceneStickerPath.length() == 0 || (tabList = profileNaviEditorState.getTabList()) == null || tabList.isEmpty()) {
            Pv0(false);
        }
        C72673Sfd.LIZIZ = this;
    }

    @Override // X.InterfaceC72700Sg4
    public final void yc0(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            setStateImmediate(new AqS178S0100000_12((C72695Sfz) it.next(), 406));
        }
    }

    public static m Ov0(Effect effect, String str) {
        String LLLFFI;
        m mVar = null;
        try {
            new com.google.gson.o();
            StringBuilder sb = new StringBuilder(effect.getTransResPath());
            String str2 = File.separator;
            sb.append(str2);
            sb.append("custom");
            sb.append(str2);
            sb.append(str);
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "stringBuilder.toString()");
            if (new File(sb2).exists()) {
                LLLFFI = C38485F8n.LLLFFI(new File(sb2), PVC.LIZ);
                mVar = (m) com.google.gson.o.LIZ(LLLFFI);
                return mVar;
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
            return mVar;
        }
    }
}
