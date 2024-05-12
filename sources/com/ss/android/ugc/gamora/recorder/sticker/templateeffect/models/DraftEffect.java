package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C78966Uyw;
import X.X1D;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DraftEffect extends Effect {
    public final CKEDraftInfoWrapper draft;

    public static /* synthetic */ DraftEffect copy$default(DraftEffect draftEffect, CKEDraftInfoWrapper cKEDraftInfoWrapper, int i, Object obj) {
        if ((i & 1) != 0) {
            cKEDraftInfoWrapper = draftEffect.draft;
        }
        return draftEffect.copy(cKEDraftInfoWrapper);
    }

    public final DraftEffect copy(CKEDraftInfoWrapper draft) {
        o.LJIIIZ(draft, "draft");
        return new DraftEffect(draft);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public int hashCode() {
        return Objects.hash(this.draft);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String toString() {
        return C78966Uyw.LJJJLL("DraftEffect:%s", this.draft);
    }

    public final String getEffectPath() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.draft.draftPath);
        LIZ.append(File.separator);
        LIZ.append(this.draft.effectPath);
        return X1D.LIZIZ(LIZ);
    }

    public final CKEDraftInfoWrapper getDraft() {
        return this.draft;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraftEffect(CKEDraftInfoWrapper draft) {
        super(null, 1, null);
        o.LJIIIZ(draft, "draft");
        this.draft = draft;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftEffect)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((DraftEffect) obj).draft}, new Object[]{this.draft});
    }
}
