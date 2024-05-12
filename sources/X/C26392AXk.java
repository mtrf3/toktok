package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.contentlanguage.ContentLangDialogContent;
import com.zhiliaoapp.musically.R;

/* renamed from: X.AXk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26392AXk {
    public static final ContentLangDialogContent LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            ContentLangDialogContent contentLangDialogContent = (ContentLangDialogContent) SettingsManager.LJII("content_lang_dialog", ContentLangDialogContent.class);
            if (contentLangDialogContent != null) {
                return contentLangDialogContent;
            }
        } catch (Throwable unused) {
        }
        return new ContentLangDialogContent(C1DD.LIZLLL(R.string.dvn, "AppContextManager.getApp…ent_language_guide_title)"), C1DD.LIZLLL(R.string.dvm, "AppContextManager.getApp…tent_language_guide_desc)"));
    }
}
