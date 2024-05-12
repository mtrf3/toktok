package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.detail.panel.EffectDiscoverPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.IAy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46192IAy implements InterfaceC74184T9o {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ EffectDiscoverPanel LIZIZ;

    public C46192IAy(Aweme aweme, EffectDiscoverPanel effectDiscoverPanel) {
        this.LIZ = aweme;
        this.LIZIZ = effectDiscoverPanel;
    }

    @Override // X.InterfaceC74184T9o
    public final void LIZ(int i, Effect effect) {
        if (effect != null) {
            Aweme aweme = this.LIZ;
            EffectDiscoverPanel effectDiscoverPanel = this.LIZIZ;
            Intent intent = new Intent();
            intent.putExtra("aweme_music", aweme.getMusic());
            intent.putExtra("request_code_select_effect_result", (Parcelable) effect);
            Activity activity = effectDiscoverPanel.activity;
            if (activity != null && !activity.isFinishing()) {
                Activity activity2 = effectDiscoverPanel.activity;
                if (activity2 != null) {
                    activity2.setResult(-1, intent);
                }
                Activity activity3 = effectDiscoverPanel.activity;
                if (activity3 != null) {
                    activity3.finish();
                }
            }
        }
    }
}
