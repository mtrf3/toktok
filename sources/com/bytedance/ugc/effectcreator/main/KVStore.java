package com.bytedance.ugc.effectcreator.main;

import X.C93515aS7;
import X.C93728aVY;
import X.C94034aaU;
import X.X1D;
import com.bytedance.effectcreatormobile.ckeapi.api.store.IStore;
import com.bytedance.keva.Keva;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class KVStore implements IStore {
    public static final C93515aS7 Companion = new C93515aS7();

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.store.IStore
    public void addNotShowAnymore() {
        Keva.getRepo("cke_repo_xx").storeInt("cke_behaviour_show_visibility_dialog_key", Keva.getRepo("cke_repo_xx").getInt("cke_behaviour_show_visibility_dialog_key", 0) + 1);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.store.IStore
    public long geUpdatetDraftDiffTime() {
        long j = Keva.getRepo("cke_repo_xx").getLong("cke_main_draft_update_time", 0L);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
        o.LJIIIIZZ(calendar, "Calendar.getInstance(Tim…imeZone(\"Asia/Shanghai\"))");
        return calendar.getTimeInMillis() - j;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.store.IStore
    public String getMainDraft() {
        String string = Keva.getRepo("cke_repo_xx").getString("main_draft_path", "");
        o.LJIIIIZZ(string, "Keva.getRepo(CKE_REPO).g…ring(MAIN_DRAFT_PATH, \"\")");
        return string;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.store.IStore
    public void markMakeupChangeModel() {
        Keva.getRepo("cke_repo_xx").storeBoolean("make_up_change_pic", true);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.store.IStore
    public void markSplitScreenDialogShown() {
        Keva.getRepo("cke_repo_xx").storeBoolean("cke_canvas_show_split_screen_dialog_key", false);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.store.IStore
    public void setToolTipsDone() {
        Keva.getRepo("cke_repo_xx").storeInt("tool_tip_show_status", 2);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.store.IStore
    public boolean shouldShowSplitScreenDialog() {
        return Keva.getRepo("cke_repo_xx").getBoolean("cke_canvas_show_split_screen_dialog_key", true);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.store.IStore
    public boolean shouldShowToolTips() {
        if (Keva.getRepo("cke_repo_xx").getInt("tool_tip_show_status", 0) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.store.IStore
    public boolean shouldShowVisibilityDialog() {
        if (Keva.getRepo("cke_repo_xx").getInt("cke_behaviour_show_visibility_dialog_key", 0) >= 3) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.store.IStore
    public boolean showMakeupChangeModel() {
        return Keva.getRepo("cke_repo_xx").getBoolean("make_up_change_pic", false);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.store.IStore
    public void updateDraftTime() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
        o.LJIIIIZZ(calendar, "Calendar.getInstance(Tim…imeZone(\"Asia/Shanghai\"))");
        Keva.getRepo("cke_repo_xx").storeLong("cke_main_draft_update_time", calendar.getTimeInMillis());
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.store.IStore
    public boolean matchSDKVersion4MainDraft() {
        if (Keva.getRepo("cke_repo_xx").getLong("cke_main_draft_update_sdk_version", 0L) == C93728aVY.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.store.IStore
    public void updateSDKVersion4MainDraft() {
        long LIZ = C93728aVY.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateSDKVersion4MainDraft = ");
        LIZ2.append(LIZ);
        C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ2));
        Keva.getRepo("cke_repo_xx").storeLong("cke_main_draft_update_sdk_version", LIZ);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.store.IStore
    public String getDraftCache(String cacheKey) {
        o.LJIIIZ(cacheKey, "cacheKey");
        String stringJustDisk = Keva.getRepo("cke_repo_xx").getStringJustDisk(cacheKey, "");
        o.LJIIIIZZ(stringJustDisk, "Keva.getRepo(CKE_REPO).g…ingJustDisk(cacheKey, \"\")");
        return stringJustDisk;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.store.IStore
    public void saveMainDraft(String assetPath) {
        o.LJIIIZ(assetPath, "assetPath");
        Keva.getRepo("cke_repo_xx").storeString("main_draft_path", assetPath);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.store.IStore
    public void saveDraftCache(String cacheKey, String draftListCache) {
        o.LJIIIZ(cacheKey, "cacheKey");
        o.LJIIIZ(draftListCache, "draftListCache");
        Keva.getRepo("cke_repo_xx").storeStringJustDisk(cacheKey, draftListCache);
    }
}
