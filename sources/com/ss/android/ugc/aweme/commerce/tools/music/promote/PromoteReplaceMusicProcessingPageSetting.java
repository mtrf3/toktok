package com.ss.android.ugc.aweme.commerce.tools.music.promote;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PromoteReplaceMusicProcessingPageSetting {
    public static final PromoteReplaceMusicProcessingPageSetting INSTANCE = new PromoteReplaceMusicProcessingPageSetting();
    public static final String DEFAULT = "aweme://lynxview/?channel=tiktok_promote_lynx&bundle=pages%2Fpromote%2Ftemplate.js&group=tiktok_promote_lynx&pageModule=prompt-page&webview_clear_color=1&dynamic=3&hide_nav_bar=1&use_bdx=1&trans_status_bar=1&hide_status_bar=0&enable_canvas=1&status_bar_color=00000000&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Fpromote%2Ftiktok_promote_lynx%2Fpages%2Fpromote%2Ftemplate.js&musicStatus=2";

    public static final String get() {
        try {
            SettingsManager.LIZLLL().getClass();
            String LJI = SettingsManager.LJI("promote_music_change_processing_page_url", "aweme://lynxview/?channel=tiktok_promote_lynx&bundle=pages%2Fpromote%2Ftemplate.js&group=tiktok_promote_lynx&pageModule=prompt-page&webview_clear_color=1&dynamic=3&hide_nav_bar=1&use_bdx=1&trans_status_bar=1&hide_status_bar=0&enable_canvas=1&status_bar_color=00000000&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Fpromote%2Ftiktok_promote_lynx%2Fpages%2Fpromote%2Ftemplate.js&musicStatus=2");
            o.LJIIIIZZ(LJI, "getInstance().getStringV…gPageSetting::class.java)");
            return LJI;
        } catch (Throwable unused) {
            return DEFAULT;
        }
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
