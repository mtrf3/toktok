package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.m;

/* renamed from: X.K5a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51134K5a {
    public static final C51134K5a LIZ = new C51134K5a();
    public static final m LIZIZ;

    static {
        m mVar = new m();
        mVar.LJJIIJ("trigger_gap_seconds", 604800);
        mVar.LJJIIJ("max_show_time", 2);
        mVar.LJJIIJ("install_gap_seconds", 259200);
        mVar.LJJIIZ("guide_image_1", "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/search_ic_widget_guide.png");
        mVar.LJJIIZ("guide_image_1_RTL", "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/search_ic_widget_guide_rtl.png");
        LIZIZ = mVar;
    }

    public static m LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        m mVar = LIZIZ;
        m mVar2 = (m) LIZLLL.LJIIIIZZ("search_widget_guide_config", m.class, mVar);
        if (mVar2 == null) {
            return mVar;
        }
        return mVar2;
    }
}
