package com.ss.android.ugc.aweme.effect;

import X.C78886Uxe;
import X.EnumC133695Mn;
import X.H78;
import X.X1D;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class EffectModel implements Serializable {
    public String adjustParams;
    public String category;
    public String challenge;
    public int color;
    public String designerEncryptedId;
    public String designerId;
    public int duration;
    public String extra;
    public String gameplayAlgorithm;
    public String hint;
    public String iconUrl;
    public int imagePath;
    public int index;
    public String key;
    public String name;
    public String resDir;
    public String resId;
    public String resourceId;
    public String selectFrom;
    public int source;
    public List<String> tags;
    public int type;
    public Boolean isNewEngineEffect = Boolean.FALSE;
    public boolean isGoToCapCutEffect = false;
    public boolean isEnabled = true;
    public boolean isFromEditPro = false;

    public Boolean hasRealDuration() {
        Iterator<String> it = this.tags.iterator();
        while (it.hasNext()) {
            if (it.next().contains("duration:")) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.name, this.hint, Integer.valueOf(this.imagePath), this.key, Integer.valueOf(this.type), this.iconUrl, this.resDir, Integer.valueOf(this.color), Integer.valueOf(this.duration), Integer.valueOf(this.index), this.category, this.extra, this.tags, Boolean.valueOf(this.isEnabled), this.resourceId, this.selectFrom, this.challenge, Boolean.valueOf(this.isFromEditPro)});
    }

    public Boolean isClientEffect() {
        try {
            String str = this.extra;
            if (str == null || str.isEmpty()) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(new JSONObject(this.extra).optString("game_play_type", "").equals(EnumC133695Mn.EDIT_EFFECT_CLIENT.getType()));
        } catch (JSONException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isClientEffect :: ");
            LIZ.append(e.getMessage());
            H78.LIZIZ("EffectModel", X1D.LIZIZ(LIZ));
            return Boolean.FALSE;
        }
    }

    public Boolean isCombinedEffect() {
        try {
            String str = this.extra;
            if (str == null || str.isEmpty()) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(new JSONObject(this.extra).optString("game_play_type", "").equals(EnumC133695Mn.EDIT_EFFECT_COMBINED.getType()));
        } catch (JSONException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isMixedEffect :: ");
            LIZ.append(e.getMessage());
            H78.LIZIZ("EffectModel", X1D.LIZIZ(LIZ));
            return Boolean.FALSE;
        }
    }

    public Boolean isServerEffect() {
        try {
            String str = this.extra;
            if (str == null || str.isEmpty()) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(new JSONObject(this.extra).optString("game_play_type", "").equals(EnumC133695Mn.EDIT_EFFECT_SERVER.getType()));
        } catch (JSONException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isServerEffect :: ");
            LIZ.append(e.getMessage());
            H78.LIZIZ("EffectModel", X1D.LIZIZ(LIZ));
            return Boolean.FALSE;
        }
    }

    public Boolean isServerOrCombinedEffect() {
        boolean z;
        if (isServerEffect().booleanValue() || isCombinedEffect().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public Boolean isTrickEffect() {
        boolean z;
        if (isCombinedEffect().booleanValue() || isClientEffect().booleanValue() || isServerEffect().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EffectModel effectModel = (EffectModel) obj;
        if (this.imagePath == effectModel.imagePath && this.type == effectModel.type && this.color == effectModel.color && this.duration == effectModel.duration && this.index == effectModel.index && this.isEnabled == effectModel.isEnabled && C78886Uxe.LJIIIIZZ(this.name, effectModel.name) && C78886Uxe.LJIIIIZZ(this.hint, effectModel.hint) && C78886Uxe.LJIIIIZZ(this.key, effectModel.key) && C78886Uxe.LJIIIIZZ(this.resId, effectModel.resId) && C78886Uxe.LJIIIIZZ(this.iconUrl, effectModel.iconUrl) && C78886Uxe.LJIIIIZZ(this.resDir, effectModel.resDir) && C78886Uxe.LJIIIIZZ(this.category, effectModel.category) && C78886Uxe.LJIIIIZZ(this.extra, effectModel.extra) && C78886Uxe.LJIIIIZZ(this.tags, effectModel.tags) && C78886Uxe.LJIIIIZZ(this.resourceId, effectModel.resourceId) && C78886Uxe.LJIIIIZZ(this.selectFrom, effectModel.selectFrom) && C78886Uxe.LJIIIIZZ(this.challenge, effectModel.challenge) && C78886Uxe.LJIIIIZZ(Boolean.valueOf(this.isFromEditPro), Boolean.valueOf(effectModel.isFromEditPro)) && this.isGoToCapCutEffect == effectModel.isGoToCapCutEffect && this.gameplayAlgorithm.equals(effectModel.gameplayAlgorithm)) {
            return true;
        }
        return false;
    }
}
